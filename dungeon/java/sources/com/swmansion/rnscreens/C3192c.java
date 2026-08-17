package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.swmansion.rnscreens.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3192c extends SearchView {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private SearchView.l f39046q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private View.OnClickListener f39047r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private p054d.v f39048s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final C3197h f39049t0;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.c$a */
    public static final class a extends p054d.v {
        a() {
            super(true);
        }

        @Override // p054d.v
        public void d() {
            C3192c.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3192c(Context context, androidx.fragment.app.i fragment) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a aVar = new a();
        this.f39048s0 = aVar;
        this.f39049t0 = new C3197h(fragment, aVar);
        super.setOnSearchClickListener(new ViewOnClickListenerC3190a(this));
        super.setOnCloseListener(new C3191b(this));
        setMaxWidth(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(C3192c c3192c, View view) {
        View.OnClickListener onClickListener = c3192c.f39047r0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        c3192c.f39049t0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n0(C3192c c3192c) {
        SearchView.l lVar = c3192c.f39046q0;
        boolean zA = lVar != null ? lVar.a() : false;
        c3192c.f39049t0.c();
        return zA;
    }

    public final boolean getOverrideBackAction() {
        return this.f39049t0.a();
    }

    public final void o0() {
        b0("", false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (J()) {
            return;
        }
        this.f39049t0.b();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39049t0.c();
    }

    public final void p0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(@Nullable SearchView.l lVar) {
        this.f39046q0 = lVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f39047r0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z10) {
        this.f39049t0.d(z10);
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        b0(text, false);
    }
}
