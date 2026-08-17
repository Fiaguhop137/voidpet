package T6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements h {
    @Override // T6.h
    public final void a(Object obj, j responder) {
        Intrinsics.checkNotNullParameter(responder, "responder");
        responder.b("Request is not supported");
        W4.a.m(c.class.getSimpleName(), "Request is not supported");
    }
}
