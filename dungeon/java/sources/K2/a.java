package K2;

import F9.h;
import R1.x;

/* JADX INFO: loaded from: classes.dex */
public final class a implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5896e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f5892a = j10;
        this.f5893b = j11;
        this.f5894c = j12;
        this.f5895d = j13;
        this.f5896e = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5892a == aVar.f5892a && this.f5893b == aVar.f5893b && this.f5894c == aVar.f5894c && this.f5895d == aVar.f5895d && this.f5896e == aVar.f5896e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f5892a)) * 31) + h.c(this.f5893b)) * 31) + h.c(this.f5894c)) * 31) + h.c(this.f5895d)) * 31) + h.c(this.f5896e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f5892a + ", photoSize=" + this.f5893b + ", photoPresentationTimestampUs=" + this.f5894c + ", videoStartPosition=" + this.f5895d + ", videoSize=" + this.f5896e;
    }
}
