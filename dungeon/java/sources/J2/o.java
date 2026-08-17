package J2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5730c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f5729b = str2;
        this.f5730c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f5714a.equals(oVar.f5714a) && Objects.equals(this.f5729b, oVar.f5729b) && Objects.equals(this.f5730c, oVar.f5730c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f5714a.hashCode()) * 31;
        String str = this.f5729b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5730c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // J2.i
    public String toString() {
        return this.f5714a + ": url=" + this.f5730c;
    }
}
