package G3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f3925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f3926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f3927f;

    public q(int i10, long j10, long j11, n nVar, r rVar, Object obj) {
        this.f3922a = i10;
        this.f3923b = j10;
        this.f3924c = j11;
        this.f3925d = nVar;
        this.f3926e = rVar;
        this.f3927f = obj;
    }

    public /* synthetic */ q(int i10, long j10, long j11, n nVar, r rVar, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 200 : i10, (i11 & 2) != 0 ? 0L : j10, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? n.f3916c : nVar, (i11 & 16) != 0 ? null : rVar, (i11 & 32) != 0 ? null : obj);
    }

    public static /* synthetic */ q b(q qVar, int i10, long j10, long j11, n nVar, r rVar, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = qVar.f3922a;
        }
        if ((i11 & 2) != 0) {
            j10 = qVar.f3923b;
        }
        if ((i11 & 4) != 0) {
            j11 = qVar.f3924c;
        }
        if ((i11 & 8) != 0) {
            nVar = qVar.f3925d;
        }
        if ((i11 & 16) != 0) {
            rVar = qVar.f3926e;
        }
        if ((i11 & 32) != 0) {
            obj = qVar.f3927f;
        }
        Object obj3 = obj;
        n nVar2 = nVar;
        long j12 = j11;
        return qVar.a(i10, j10, j12, nVar2, rVar, obj3);
    }

    public final q a(int i10, long j10, long j11, n nVar, r rVar, Object obj) {
        return new q(i10, j10, j11, nVar, rVar, obj);
    }

    public final r c() {
        return this.f3926e;
    }

    public final int d() {
        return this.f3922a;
    }

    public final n e() {
        return this.f3925d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f3922a == qVar.f3922a && this.f3923b == qVar.f3923b && this.f3924c == qVar.f3924c && Intrinsics.b(this.f3925d, qVar.f3925d) && Intrinsics.b(this.f3926e, qVar.f3926e) && Intrinsics.b(this.f3927f, qVar.f3927f);
    }

    public final long f() {
        return this.f3923b;
    }

    public final long g() {
        return this.f3924c;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f3922a * 31) + Long.hashCode(this.f3923b)) * 31) + Long.hashCode(this.f3924c)) * 31) + this.f3925d.hashCode()) * 31;
        r rVar = this.f3926e;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Object obj = this.f3927f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.f3922a + ", requestMillis=" + this.f3923b + ", responseMillis=" + this.f3924c + ", headers=" + this.f3925d + ", body=" + this.f3926e + ", delegate=" + this.f3927f + ')';
    }
}
