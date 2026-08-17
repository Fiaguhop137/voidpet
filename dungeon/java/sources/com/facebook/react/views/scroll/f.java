package com.facebook.react.views.scroll;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30816a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30816a = com.facebook.react.modules.i18nmanager.a.f29937a.a().i(context);
    }

    @Override // com.facebook.react.views.view.g, com.facebook.react.uimanager.L
    public boolean getRemoveClippedSubviews() {
        return super.getRemoveClippedSubviews();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f30816a) {
            setLeft(0);
            setTop(i11);
            setRight(i12 - i10);
            setBottom(i13);
        }
    }

    @Override // com.facebook.react.views.view.g
    public void setRemoveClippedSubviews(boolean z10) {
        if (this.f30816a) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z10);
        }
    }
}
