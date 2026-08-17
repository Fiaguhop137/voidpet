package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f15120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p378v0.f f15121d;

    public m(int i10, long j10, n nVar, p378v0.f fVar) {
        this.f15118a = i10;
        this.f15119b = j10;
        this.f15120c = nVar;
        this.f15121d = fVar;
    }

    public final int a() {
        return this.f15118a;
    }

    public final p378v0.f b() {
        return this.f15121d;
    }

    public final n c() {
        return this.f15120c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f15118a == mVar.f15118a && this.f15119b == mVar.f15119b && this.f15120c == mVar.f15120c && Intrinsics.b(this.f15121d, mVar.f15121d);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f15118a) * 31) + Long.hashCode(this.f15119b)) * 31) + this.f15120c.hashCode()) * 31;
        p378v0.f fVar = this.f15121d;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f15118a + ", timestamp=" + this.f15119b + ", type=" + this.f15120c + ", structureCompat=" + this.f15121d + ')';
    }
}
