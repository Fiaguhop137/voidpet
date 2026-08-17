package com.facebook.react.views.scroll;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.i f30911a;

    public /* synthetic */ k(o.i iVar) {
        this.f30911a = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(o.C(this.f30911a, (WeakReference) obj));
    }
}
