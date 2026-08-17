package p041c4;

import R3.C1364k;
import Y3.a;
import Y3.b;
import Y3.d;
import Y3.f;
import Y3.g;
import Y3.h;
import Y3.j;
import java.util.List;
import p059d4.c;
import p077e4.r;

/* JADX INFO: renamed from: c4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2117d {
    private static List a(c cVar, float f10, C1364k c1364k, N n10) {
        return u.a(cVar, c1364k, f10, n10, false);
    }

    private static List b(c cVar, C1364k c1364k, N n10) {
        return u.a(cVar, c1364k, 1.0f, n10, false);
    }

    static a c(c cVar, C1364k c1364k) {
        return new a(b(cVar, c1364k, C2120g.f27212a));
    }

    static j d(c cVar, C1364k c1364k) {
        return new j(a(cVar, r.e(), c1364k, C2122i.f27214a));
    }

    public static b e(c cVar, C1364k c1364k) {
        return f(cVar, c1364k, true);
    }

    public static b f(c cVar, C1364k c1364k, boolean z10) {
        return new b(a(cVar, z10 ? r.e() : 1.0f, c1364k, C2125l.f27228a));
    }

    static Y3.c g(c cVar, C1364k c1364k, int i10) {
        return new Y3.c(b(cVar, c1364k, new o(i10)));
    }

    static d h(c cVar, C1364k c1364k) {
        return new d(b(cVar, c1364k, r.f27238a));
    }

    static f i(c cVar, C1364k c1364k) {
        return new f(u.a(cVar, c1364k, r.e(), B.f27189a, true));
    }

    static g j(c cVar, C1364k c1364k) {
        return new g(b(cVar, c1364k, G.f27194a));
    }

    static h k(c cVar, C1364k c1364k) {
        return new h(a(cVar, r.e(), c1364k, H.f27195a));
    }
}
