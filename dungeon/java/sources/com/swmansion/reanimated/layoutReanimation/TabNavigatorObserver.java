package com.swmansion.reanimated.layoutReanimation;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.i;
import androidx.fragment.app.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class TabNavigatorObserver {
    private final Set<Integer> mFragmentsWithListenerRegistry = new HashSet();
    private final ReaLayoutAnimator mReaLayoutAnimator;

    class FragmentLifecycleCallbacks extends q.k {
        private View firstScreen;
        private Method getActivityState;
        private Method getScreen;
        private final Set<Integer> screenTagsWithListener = new HashSet();
        private final List<View> nextTransition = new ArrayList();

        public FragmentLifecycleCallbacks(i iVar) {
            if (ScreensHelper.isScreenFragment(iVar)) {
                try {
                    Method method = iVar.getClass().getMethod("getScreen", null);
                    this.getScreen = method;
                    View view = (View) method.invoke(iVar, null);
                    this.getActivityState = view.getClass().getMethod("getActivityState", null);
                    addScreenListener(view);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                    Log.e("[Reanimated]", e10.getMessage() != null ? e10.getMessage() : "Unable to get screen activity state");
                }
            }
        }

        private void addScreenListener(View view) throws IllegalAccessException, InvocationTargetException {
            if (this.screenTagsWithListener.contains(Integer.valueOf(view.getId()))) {
                return;
            }
            this.screenTagsWithListener.add(Integer.valueOf(view.getId()));
            view.addOnAttachStateChangeListener(TabNavigatorObserver.this.new OnAttachStateChangeListener());
            view.addOnLayoutChangeListener(new f(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addScreenListener$0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.nextTransition.isEmpty()) {
                return;
            }
            TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().navigationTabChanged(this.nextTransition.get(0), this.nextTransition.get(1));
            this.nextTransition.clear();
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0050  */
        private void onFragmentUpdate(i iVar, boolean z10) {
            String message;
            if (ScreensHelper.isScreenFragment(iVar)) {
                try {
                    View view = (View) this.getScreen.invoke(iVar, null);
                    if (this.getActivityState.invoke(view, null) == null) {
                        return;
                    }
                    addScreenListener(view);
                    View view2 = this.firstScreen;
                    if (view2 == null) {
                        this.firstScreen = view;
                        return;
                    }
                    if (z10) {
                        this.nextTransition.add(view2);
                        this.nextTransition.add(view);
                    } else {
                        this.nextTransition.add(view);
                        this.nextTransition.add(this.firstScreen);
                    }
                    this.firstScreen = null;
                } catch (IllegalAccessException e10) {
                    e = e10;
                    if (e.getMessage() != null) {
                        message = e.getMessage();
                    } else {
                        message = "Unable to get screen view";
                    }
                    Log.e("[Reanimated]", message);
                } catch (NullPointerException e11) {
                    e = e11;
                    if (e.getMessage() != null) {
                        message = e.getMessage();
                    } else {
                        message = "Unable to get screen view";
                    }
                    Log.e("[Reanimated]", message);
                } catch (InvocationTargetException e12) {
                    e = e12;
                    if (e.getMessage() != null) {
                        message = e.getMessage();
                    } else {
                        message = "Unable to get screen view";
                    }
                    Log.e("[Reanimated]", message);
                }
            }
        }

        @Override // androidx.fragment.app.q.k
        public void onFragmentAttached(q qVar, i iVar, Context context) {
            onFragmentUpdate(iVar, true);
        }

        @Override // androidx.fragment.app.q.k
        public void onFragmentDetached(q qVar, i iVar) {
            onFragmentUpdate(iVar, false);
        }
    }

    class OnAttachStateChangeListener implements View.OnAttachStateChangeListener {
        OnAttachStateChangeListener() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NonNull View view) {
            TabNavigatorObserver.this.mReaLayoutAnimator.getAnimationsManager().visitNativeTreeAndMakeSnapshot(view);
        }
    }

    public TabNavigatorObserver(ReaLayoutAnimator reaLayoutAnimator) {
        this.mReaLayoutAnimator = reaLayoutAnimator;
    }

    public void handleScreenContainerUpdate(View view) {
        try {
            i iVar = (i) view.getClass().getMethod("getFragment", null).invoke(view, null);
            int iP = iVar.P();
            if (this.mFragmentsWithListenerRegistry.contains(Integer.valueOf(iP))) {
                return;
            }
            this.mFragmentsWithListenerRegistry.add(Integer.valueOf(iP));
            iVar.U().Z0(new FragmentLifecycleCallbacks(iVar), true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            Log.e("[Reanimated]", e10.getMessage() != null ? e10.getMessage() : "Unable to get screen fragment");
        }
    }
}
