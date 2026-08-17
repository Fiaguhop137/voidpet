package Z1;

import U1.AbstractC1459a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2.D.b f18190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f18199j;

    X0(n2.D.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        AbstractC1459a.a(!z14 || z12);
        AbstractC1459a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        AbstractC1459a.a(z15);
        this.f18190a = bVar;
        this.f18191b = j10;
        this.f18192c = j11;
        this.f18193d = j12;
        this.f18194e = j13;
        this.f18195f = z10;
        this.f18196g = z11;
        this.f18197h = z12;
        this.f18198i = z13;
        this.f18199j = z14;
    }

    public X0 a(long j10) {
        return j10 == this.f18192c ? this : new X0(this.f18190a, this.f18191b, j10, this.f18193d, this.f18194e, this.f18195f, this.f18196g, this.f18197h, this.f18198i, this.f18199j);
    }

    public X0 b(long j10) {
        return j10 == this.f18191b ? this : new X0(this.f18190a, j10, this.f18192c, this.f18193d, this.f18194e, this.f18195f, this.f18196g, this.f18197h, this.f18198i, this.f18199j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X0.class == obj.getClass()) {
            X0 x10 = (X0) obj;
            if (this.f18191b == x10.f18191b && this.f18192c == x10.f18192c && this.f18193d == x10.f18193d && this.f18194e == x10.f18194e && this.f18195f == x10.f18195f && this.f18196g == x10.f18196g && this.f18197h == x10.f18197h && this.f18198i == x10.f18198i && this.f18199j == x10.f18199j && Objects.equals(this.f18190a, x10.f18190a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f18190a.hashCode()) * 31) + ((int) this.f18191b)) * 31) + ((int) this.f18192c)) * 31) + ((int) this.f18193d)) * 31) + ((int) this.f18194e)) * 31) + (this.f18195f ? 1 : 0)) * 31) + (this.f18196g ? 1 : 0)) * 31) + (this.f18197h ? 1 : 0)) * 31) + (this.f18198i ? 1 : 0)) * 31) + (this.f18199j ? 1 : 0);
    }
}
