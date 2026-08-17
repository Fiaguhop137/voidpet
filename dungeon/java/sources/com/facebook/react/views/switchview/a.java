package com.facebook.react.views.switchview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c0 {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f30966U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Integer f30967V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Integer f30968W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30966U = true;
    }

    private final ColorStateList r(int i10) {
        return new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{i10});
    }

    private final void setTrackColor(boolean z10) {
        Integer num = this.f30968W;
        if (num == null && this.f30967V == null) {
            return;
        }
        if (!z10) {
            num = this.f30967V;
        }
        setTrackColor(num);
    }

    public final void s(Drawable drawable, Integer num) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        setBackground(new RippleDrawable(r(i10), new ColorDrawable(i10), null));
    }

    @Override // androidx.appcompat.widget.c0, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f30966U || isChecked() == z10) {
            super.setChecked(isChecked());
            return;
        }
        this.f30966U = false;
        super.setChecked(z10);
        setTrackColor(z10);
    }

    public final void setOn(boolean z10) {
        if (isChecked() != z10) {
            super.setChecked(z10);
            setTrackColor(z10);
        }
        this.f30966U = true;
    }

    public final void setThumbColor(@Nullable Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        Intrinsics.checkNotNullExpressionValue(thumbDrawable, "getThumbDrawable(...)");
        s(thumbDrawable, num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ColorStateList colorStateListR = r(num.intValue());
        Drawable background = super.getBackground();
        Intrinsics.d(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        ((RippleDrawable) background).setColor(colorStateListR);
    }

    public final void setTrackColor(@Nullable Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        Intrinsics.checkNotNullExpressionValue(trackDrawable, "getTrackDrawable(...)");
        s(trackDrawable, num);
    }

    public final void setTrackColorForFalse(@Nullable Integer num) {
        if (Intrinsics.b(num, this.f30967V)) {
            return;
        }
        this.f30967V = num;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.f30967V);
    }

    public final void setTrackColorForTrue(@Nullable Integer num) {
        if (Intrinsics.b(num, this.f30968W)) {
            return;
        }
        this.f30968W = num;
        if (isChecked()) {
            setTrackColor(this.f30968W);
        }
    }
}
