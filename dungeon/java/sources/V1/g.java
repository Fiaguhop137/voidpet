package V1;

import R1.x;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13919c;

    public g(long j10, long j11, long j12) {
        this.f13917a = j10;
        this.f13918b = j11;
        this.f13919c = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f13917a == gVar.f13917a && this.f13918b == gVar.f13918b && this.f13919c == gVar.f13919c;
    }

    public int hashCode() {
        return ((((527 + F9.h.c(this.f13917a)) * 31) + F9.h.c(this.f13918b)) * 31) + F9.h.c(this.f13919c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f13917a + ", modification time=" + this.f13918b + ", timescale=" + this.f13919c;
    }
}
