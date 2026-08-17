package U1;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f12858c = new G(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f12859d = new G(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12861b;

    public G(int i10, int i11) {
        AbstractC1459a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f12860a = i10;
        this.f12861b = i11;
    }

    public int a() {
        return this.f12861b;
    }

    public int b() {
        return this.f12860a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            G g10 = (G) obj;
            if (this.f12860a == g10.f12860a && this.f12861b == g10.f12861b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f12861b;
        int i11 = this.f12860a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f12860a + "x" + this.f12861b;
    }
}
