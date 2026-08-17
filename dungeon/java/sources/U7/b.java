package U7;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.a f13319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13320b;

    b(X7.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f13319a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f13320b = map;
    }

    @Override // U7.f
    X7.a e() {
        return this.f13319a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f13319a.equals(fVar.e()) && this.f13320b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // U7.f
    Map h() {
        return this.f13320b;
    }

    public int hashCode() {
        return ((this.f13319a.hashCode() ^ 1000003) * 1000003) ^ this.f13320b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f13319a + ", values=" + this.f13320b + "}";
    }
}
