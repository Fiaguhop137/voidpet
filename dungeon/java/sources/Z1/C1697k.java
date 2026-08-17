package Z1;

import U1.AbstractC1459a;

/* JADX INFO: renamed from: Z1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1697k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R1.r f18312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R1.r f18313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18315e;

    public C1697k(String str, R1.r rVar, R1.r rVar2, int i10, int i11) {
        AbstractC1459a.a(i10 == 0 || i11 == 0);
        this.f18311a = AbstractC1459a.d(str);
        this.f18312b = (R1.r) AbstractC1459a.e(rVar);
        this.f18313c = (R1.r) AbstractC1459a.e(rVar2);
        this.f18314d = i10;
        this.f18315e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1697k.class == obj.getClass()) {
            C1697k c1697k = (C1697k) obj;
            if (this.f18314d == c1697k.f18314d && this.f18315e == c1697k.f18315e && this.f18311a.equals(c1697k.f18311a) && this.f18312b.equals(c1697k.f18312b) && this.f18313c.equals(c1697k.f18313c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f18314d) * 31) + this.f18315e) * 31) + this.f18311a.hashCode()) * 31) + this.f18312b.hashCode()) * 31) + this.f18313c.hashCode();
    }
}
