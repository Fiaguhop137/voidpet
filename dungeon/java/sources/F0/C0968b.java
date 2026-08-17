package F0;

/* JADX INFO: renamed from: F0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968b implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2834b;

    public C0968b(int i10) {
        this.f2834b = i10;
    }

    @Override // F0.x
    public r b(r rVar) {
        int i10 = this.f2834b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? rVar : new r(kotlin.ranges.e.m(rVar.p() + this.f2834b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0968b) && this.f2834b == ((C0968b) obj).f2834b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f2834b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f2834b + ')';
    }
}
