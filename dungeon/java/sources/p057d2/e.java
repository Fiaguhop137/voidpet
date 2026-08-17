package p057d2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39671c;

    public e(String str, String str2, String str3) {
        this.f39669a = str;
        this.f39670b = str2;
        this.f39671c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f39669a, eVar.f39669a) && Objects.equals(this.f39670b, eVar.f39670b) && Objects.equals(this.f39671c, eVar.f39671c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f39669a.hashCode() * 31;
        String str = this.f39670b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39671c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
