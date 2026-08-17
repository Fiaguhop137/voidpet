package p236n2;

import C9.AbstractC0876t;
import C9.z;
import R1.G;
import U1.AbstractC1477t;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f49819d = new m0(new G[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f49820e = S.z0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0876t f49822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49823c;

    public m0(G... gArr) {
        this.f49822b = AbstractC0876t.q(gArr);
        this.f49821a = gArr.length;
        e();
    }

    private void e() {
        int i10 = 0;
        while (i10 < this.f49822b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f49822b.size(); i12++) {
                if (((G) this.f49822b.get(i10)).equals(this.f49822b.get(i12))) {
                    AbstractC1477t.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public G b(int i10) {
        return (G) this.f49822b.get(i10);
    }

    public AbstractC0876t c() {
        return AbstractC0876t.p(z.k(this.f49822b, new l0()));
    }

    public int d(G g10) {
        int iIndexOf = this.f49822b.indexOf(g10);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f49821a == m0Var.f49821a && this.f49822b.equals(m0Var.f49822b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f49823c == 0) {
            this.f49823c = this.f49822b.hashCode();
        }
        return this.f49823c;
    }

    public String toString() {
        return this.f49822b.toString();
    }
}
