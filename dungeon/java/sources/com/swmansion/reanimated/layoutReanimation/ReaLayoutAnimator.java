package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.C2275s;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import p062d7.g;

/* JADX INFO: loaded from: classes2.dex */
class ReaLayoutAnimator extends p062d7.f {
    private final ReactApplicationContext mContext;
    private final WeakReference<D> mWeakNativeViewHierarchyManager;
    private AnimationsManager mAnimationsManager = null;
    private volatile boolean mInitialized = false;
    private final ArrayList<View> viewsToSnapshot = new ArrayList<>();

    ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, D d10) {
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManager = new WeakReference<>(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteView$0(com.facebook.react.uimanager.events.d dVar) {
        if (dVar.getEventName().equals("topWillDisappear")) {
            getAnimationsManager().notifyAboutScreenWillDisappear();
        }
    }

    @Override // p062d7.f
    public void applyLayoutUpdate(View view, int i10, int i11, int i12, int i13) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i10, i11, i12, i13);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManager.get());
            view.layout(i10, i11, i12 + i10, i13 + i11);
            this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
            return;
        }
        if (!this.mAnimationsManager.hasAnimationForTag(view.getId(), 1)) {
            super.applyLayoutUpdate(view, i10, i11, i12, i13);
            this.mAnimationsManager.maybeRegisterSharedView(view);
        } else {
            view.layout(i10, i11, i12 + i10, i13 + i11);
            if (view.getId() != -1) {
                this.viewsToSnapshot.add(view);
            }
        }
    }

    @Override // p062d7.f
    public void deleteView(View view, g gVar) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, gVar);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        D d10 = this.mWeakNativeViewHierarchyManager.get();
        try {
            if (d10.resolveViewManager(view.getId()).getName().equals("RNSScreen") && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (d10.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals("RNSScreenStack")) {
                        this.mAnimationsManager.cancelAnimationsInSubviews(view);
                        super.deleteView(view, gVar);
                        EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) view.getContext(), view.getId());
                        if (eventDispatcherC != null) {
                            eventDispatcherC.c(new a(this));
                            return;
                        }
                        return;
                    }
                } catch (C2275s e10) {
                    e10.printStackTrace();
                    this.mAnimationsManager.cancelAnimationsInSubviews(view);
                    super.deleteView(view, gVar);
                    return;
                }
            }
            maybeInit();
            AnimationsManager animationsManager = this.mAnimationsManager;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            Objects.requireNonNull(gVar);
            animationsManager.onViewRemoval(view, viewGroup, new b(gVar));
        } catch (C2275s e11) {
            e11.printStackTrace();
            this.mAnimationsManager.cancelAnimationsInSubviews(view);
            super.deleteView(view, gVar);
        }
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationsManager;
    }

    public boolean isLayoutAnimationEnabled() {
        if (!this.mContext.hasActiveReactInstance()) {
            return false;
        }
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        this.mAnimationsManager = animationsManager;
        animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManager.get());
    }

    @Override // p062d7.f
    public void reset() {
        super.reset();
        for (View view : this.viewsToSnapshot) {
            this.mAnimationsManager.onViewCreate(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManager.get()));
        }
        this.viewsToSnapshot.clear();
    }

    @Override // p062d7.f
    public boolean shouldAnimateLayout(View view) {
        if (isLayoutAnimationEnabled()) {
            return (view == null || view.getParent() == null) ? false : true;
        }
        return super.shouldAnimateLayout(view);
    }
}
