package p404w8;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f56701d = new r(new q(null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f56702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f56703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f56704c;

    private r(q qVar) {
        this.f56702a = qVar.e();
        this.f56703b = qVar.f();
        this.f56704c = qVar.g();
    }

    /* synthetic */ r(q qVar, byte[] bArr) {
        this(qVar);
    }

    public static q d() {
        return new q(null);
    }

    public final boolean a() {
        return this.f56702a;
    }

    public final boolean b() {
        return this.f56703b;
    }

    public final boolean c() {
        return this.f56704c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f56702a == rVar.f56702a && this.f56703b == rVar.f56703b && this.f56704c == rVar.f56704c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f56702a ? 1 : 0) * 31) + (this.f56703b ? 1 : 0)) * 31) + (this.f56704c ? 1 : 0);
    }
}
