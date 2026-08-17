package H4;

import p310r4.j;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static f f4195A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static f f4196B;

    public static f m0(Class cls) {
        return (f) new f().f(cls);
    }

    public static f n0(j jVar) {
        return (f) new f().g(jVar);
    }

    public static f o0(p274p4.f fVar) {
        return (f) new f().b0(fVar);
    }

    public static f p0(boolean z10) {
        if (z10) {
            if (f4195A == null) {
                f4195A = (f) ((f) new f().f0(true)).c();
            }
            return f4195A;
        }
        if (f4196B == null) {
            f4196B = (f) ((f) new f().f0(false)).c();
        }
        return f4196B;
    }

    @Override // H4.a
    public boolean equals(Object obj) {
        return (obj instanceof f) && super.equals(obj);
    }

    @Override // H4.a
    public int hashCode() {
        return super.hashCode();
    }
}
