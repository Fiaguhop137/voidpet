package K3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p435y3.n f5916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f5917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f5918c;

    public e(p435y3.n nVar, f fVar, Throwable th) {
        this.f5916a = nVar;
        this.f5917b = fVar;
        this.f5918c = th;
    }

    public p435y3.n a() {
        return this.f5916a;
    }

    @Override // K3.j
    public f b() {
        return this.f5917b;
    }

    public final Throwable c() {
        return this.f5918c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.b(this.f5916a, eVar.f5916a) && Intrinsics.b(this.f5917b, eVar.f5917b) && Intrinsics.b(this.f5918c, eVar.f5918c);
    }

    public int hashCode() {
        p435y3.n nVar = this.f5916a;
        return ((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f5917b.hashCode()) * 31) + this.f5918c.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.f5916a + ", request=" + this.f5917b + ", throwable=" + this.f5918c + ')';
    }
}
