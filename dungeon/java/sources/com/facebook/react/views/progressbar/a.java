package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0389a f30782f = new C0389a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f30783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f30786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressBar f30787e;

    /* JADX INFO: renamed from: com.facebook.react.views.progressbar.a$a, reason: collision with other inner class name */
    private static final class C0389a {
        private C0389a() {
        }

        public /* synthetic */ C0389a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30784b = true;
        this.f30785c = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f30783a;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void a() {
        ProgressBar progressBar = this.f30787e;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.f30784b);
        setColor(progressBar);
        progressBar.setProgress((int) (this.f30786d * ((double) 1000)));
        progressBar.setVisibility(this.f30785c ? 0 : 4);
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.f30785c;
    }

    @Nullable
    public final Integer getColor$ReactAndroid_release() {
        return this.f30783a;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.f30784b;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.f30786d;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        String str = (String) getTag(AbstractC2232l.f29836v);
        if (str != null) {
            info.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z10) {
        this.f30785c = z10;
    }

    public final void setColor$ReactAndroid_release(@Nullable Integer num) {
        this.f30783a = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z10) {
        this.f30784b = z10;
    }

    public final void setProgress$ReactAndroid_release(double d10) {
        this.f30786d = d10;
    }

    public final void setStyle$ReactAndroid_release(@Nullable String str) {
        ReactProgressBarViewManager.Companion aVar = ReactProgressBarViewManager.INSTANCE;
        ProgressBar progressBarA = aVar.a(getContext(), aVar.b(str));
        progressBarA.setMax(1000);
        this.f30787e = progressBarA;
        removeAllViews();
        addView(this.f30787e, new ViewGroup.LayoutParams(-1, -1));
    }
}
