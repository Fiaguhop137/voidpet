package J2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5704d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f5702b = str;
        this.f5703c = str2;
        this.f5704d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f5703c, eVar.f5703c) && Objects.equals(this.f5702b, eVar.f5702b) && Objects.equals(this.f5704d, eVar.f5704d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5702b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5703c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5704d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // J2.i
    public String toString() {
        return this.f5714a + ": language=" + this.f5702b + ", description=" + this.f5703c + ", text=" + this.f5704d;
    }
}
