package p025b6;

/* JADX INFO: loaded from: classes2.dex */
public class o implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f26315d = d(Integer.MAX_VALUE, true, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f26316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f26317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f26318c;

    private o(int i10, boolean z10, boolean z11) {
        this.f26316a = i10;
        this.f26317b = z10;
        this.f26318c = z11;
    }

    public static p d(int i10, boolean z10, boolean z11) {
        return new o(i10, z10, z11);
    }

    @Override // p025b6.p
    public boolean a() {
        return this.f26318c;
    }

    @Override // p025b6.p
    public boolean b() {
        return this.f26317b;
    }

    @Override // p025b6.p
    public int c() {
        return this.f26316a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f26316a == oVar.f26316a && this.f26317b == oVar.f26317b && this.f26318c == oVar.f26318c;
    }

    public int hashCode() {
        return (this.f26316a ^ (this.f26317b ? 4194304 : 0)) ^ (this.f26318c ? 8388608 : 0);
    }
}
