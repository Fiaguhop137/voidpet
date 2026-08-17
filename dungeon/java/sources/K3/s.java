package K3;

import kotlin.jvm.internal.Intrinsics;
import p453z3.EnumC4377i;

/* JADX INFO: loaded from: classes.dex */
public final class s implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p435y3.n f6025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f6026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC4377i f6027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F3.d.b f6028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f6031g;

    public s(p435y3.n nVar, f fVar, EnumC4377i enumC4377i, F3.d.b bVar, String str, boolean z10, boolean z11) {
        this.f6025a = nVar;
        this.f6026b = fVar;
        this.f6027c = enumC4377i;
        this.f6028d = bVar;
        this.f6029e = str;
        this.f6030f = z10;
        this.f6031g = z11;
    }

    public final EnumC4377i a() {
        return this.f6027c;
    }

    @Override // K3.j
    public f b() {
        return this.f6026b;
    }

    public p435y3.n c() {
        return this.f6025a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.b(this.f6025a, sVar.f6025a) && Intrinsics.b(this.f6026b, sVar.f6026b) && this.f6027c == sVar.f6027c && Intrinsics.b(this.f6028d, sVar.f6028d) && Intrinsics.b(this.f6029e, sVar.f6029e) && this.f6030f == sVar.f6030f && this.f6031g == sVar.f6031g;
    }

    public int hashCode() {
        int iHashCode = ((((this.f6025a.hashCode() * 31) + this.f6026b.hashCode()) * 31) + this.f6027c.hashCode()) * 31;
        F3.d.b bVar = this.f6028d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f6029e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f6030f)) * 31) + Boolean.hashCode(this.f6031g);
    }

    public String toString() {
        return "SuccessResult(image=" + this.f6025a + ", request=" + this.f6026b + ", dataSource=" + this.f6027c + ", memoryCacheKey=" + this.f6028d + ", diskCacheKey=" + this.f6029e + ", isSampled=" + this.f6030f + ", isPlaceholderCached=" + this.f6031g + ')';
    }
}
