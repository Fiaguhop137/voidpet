package U9;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class a extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13396b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f13395a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f13396b = list;
    }

    @Override // U9.w
    public List b() {
        return this.f13396b;
    }

    @Override // U9.w
    public String c() {
        return this.f13395a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f13395a.equals(wVar.c()) && this.f13396b.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13395a.hashCode() ^ 1000003) * 1000003) ^ this.f13396b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f13395a + ", usedDates=" + this.f13396b + "}";
    }
}
