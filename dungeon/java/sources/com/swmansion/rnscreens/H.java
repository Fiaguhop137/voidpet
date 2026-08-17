package com.swmansion.rnscreens;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.E f38965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f38966b;

    public /* synthetic */ H(kotlin.jvm.internal.E e10, M m10) {
        this.f38965a = e10;
        this.f38966b = m10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(M.R(this.f38965a, this.f38966b, (B) obj));
    }
}
