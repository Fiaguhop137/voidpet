package J2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5718d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f5716b = str;
        this.f5717c = str2;
        this.f5718d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f5717c, kVar.f5717c) && Objects.equals(this.f5716b, kVar.f5716b) && Objects.equals(this.f5718d, kVar.f5718d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5716b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5717c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5718d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // J2.i
    public String toString() {
        return this.f5714a + ": domain=" + this.f5716b + ", description=" + this.f5717c;
    }
}
