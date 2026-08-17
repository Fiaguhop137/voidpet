package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import p170j8.C3860z;
import p170j8.X;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f31926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View.OnClickListener f31927d;

    public r(Context context) {
        this(context, null);
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f31927d = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p099f8.d.f41816b, 0, 0);
        try {
            this.f31924a = typedArrayObtainStyledAttributes.getInt(p099f8.d.f41817c, 0);
            this.f31925b = typedArrayObtainStyledAttributes.getInt(p099f8.d.f41818d, 2);
            typedArrayObtainStyledAttributes.recycle();
            a(this.f31924a, this.f31925b);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void b(Context context) {
        View view = this.f31926c;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f31926c = X.c(context, this.f31924a, this.f31925b);
        } catch (r8.c.a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i10 = this.f31924a;
            int i11 = this.f31925b;
            C3860z c3860z = new C3860z(context, null);
            c3860z.a(context.getResources(), i10, i11);
            this.f31926c = c3860z;
        }
        addView(this.f31926c);
        this.f31926c.setEnabled(isEnabled());
        this.f31926c.setOnClickListener(this);
    }

    public void a(int i10, int i11) {
        this.f31924a = i10;
        this.f31925b = i11;
        b(getContext());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f31927d;
        if (onClickListener == null || view != this.f31926c) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        a(this.f31924a, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f31926c.setEnabled(z10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f31927d = onClickListener;
        View view = this.f31926c;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        a(this.f31924a, this.f31925b);
    }

    public void setSize(int i10) {
        a(i10, this.f31925b);
    }
}
