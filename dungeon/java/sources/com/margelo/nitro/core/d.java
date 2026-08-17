package com.margelo.nitro.core;

import Ad.InterfaceC0795e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InterfaceC3972i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class d implements Promise.OnRejectedCallback, InterfaceC3972i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Function1 f38617a;

    d(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f38617a = function;
    }

    @Override // kotlin.jvm.internal.InterfaceC3972i
    public final InterfaceC0795e b() {
        return this.f38617a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Promise.OnRejectedCallback) && (obj instanceof InterfaceC3972i)) {
            return Intrinsics.b(b(), ((InterfaceC3972i) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // com.margelo.nitro.core.Promise.OnRejectedCallback
    public final /* synthetic */ void onRejected(Throwable th) {
        this.f38617a.invoke(th);
    }
}
