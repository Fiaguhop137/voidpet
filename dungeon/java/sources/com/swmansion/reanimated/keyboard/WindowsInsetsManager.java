package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1921n0;
import androidx.core.view.C0;
import androidx.core.view.Z;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import p144i.f;

/* JADX INFO: loaded from: classes2.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i10 = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i11 = 0;
        }
        layoutParams.setMargins(0, i10, 0, i11);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInsets$1(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i10, i11);
        int i12 = f.f43186d;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            currentActivity.getWindow().getDecorView().findViewById(i12).setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            AbstractC1921n0.b(currentActivity.getWindow(), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0 onApplyWindowInsetsListener(View view, C0 c10) {
        C0 c0Y = Z.Y(view, c10);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(c10, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(c0Y);
        return c0Y;
    }

    private void setWindowInsets(C0 c10) {
        int i10 = C0.p.i();
        updateInsets(c10.f(i10).f25866b, c10.f(i10).f25868d);
    }

    private void updateInsets(int i10, int i11) {
        new Handler(Looper.getMainLooper()).post(new d(this, i10, i11));
    }

    private void updateWindowDecor(boolean z10) {
        new Handler(Looper.getMainLooper()).post(new c(this, z10));
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z10, boolean z11) {
        this.mIsStatusBarTranslucent = z10;
        this.mIsNavigationBarTranslucent = z11;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Z.A0(decorView, new b(this));
        Z.H0(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Z.H0(decorView, null);
        Z.A0(decorView, null);
    }
}
