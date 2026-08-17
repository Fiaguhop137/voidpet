package p141he;

import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p015ae.N;
import p159ie.b;
import p159ie.c;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(c cVar, b from, InterfaceC1791e scopeOwner, f name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        if (cVar == c.a.f43998a) {
            return;
        }
        from.e();
    }

    public static final void b(c cVar, b from, N scopeOwner, f name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(scopeOwner, "scopeOwner");
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = scopeOwner.f().a();
        String strG = name.g();
        Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
        c(cVar, from, strA, strG);
    }

    public static final void c(c cVar, b from, String packageFqName, String name) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        if (cVar == c.a.f43998a) {
            return;
        }
        from.e();
    }
}
