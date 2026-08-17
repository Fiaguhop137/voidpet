package M0;

import kotlin.jvm.internal.Intrinsics;
import p037c0.P;
import p037c0.Z;
import p037c0.v0;

/* JADX INFO: loaded from: classes.dex */
final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f6674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f6675c;

    public b(v0 v0Var, float f10) {
        this.f6674b = v0Var;
        this.f6675c = f10;
    }

    @Override // M0.o
    public float a() {
        return this.f6675c;
    }

    public final v0 b() {
        return this.f6674b;
    }

    @Override // M0.o
    public long e() {
        return Z.f26696b.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.b(this.f6674b, bVar.f6674b) && Float.compare(this.f6675c, bVar.f6675c) == 0;
    }

    public int hashCode() {
        return (this.f6674b.hashCode() * 31) + Float.hashCode(this.f6675c);
    }

    @Override // M0.o
    public P l() {
        return this.f6674b;
    }

    public String toString() {
        return "BrushStyle(value=" + this.f6674b + ", alpha=" + this.f6675c + ')';
    }
}
