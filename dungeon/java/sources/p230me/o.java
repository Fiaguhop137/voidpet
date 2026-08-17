package p230me;

import Ie.c;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p302qe.g;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f49298a;

    @Override // p230me.n
    public InterfaceC1791e a(g javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final c b() {
        c cVar = this.f49298a;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("resolver");
        return null;
    }

    public final void c(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f49298a = cVar;
    }
}
