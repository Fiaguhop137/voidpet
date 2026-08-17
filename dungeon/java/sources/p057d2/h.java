package p057d2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39686e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f39682a = str;
        this.f39683b = str2;
        this.f39684c = str3;
        this.f39685d = str4;
        this.f39686e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f39682a, hVar.f39682a) && Objects.equals(this.f39683b, hVar.f39683b) && Objects.equals(this.f39684c, hVar.f39684c) && Objects.equals(this.f39685d, hVar.f39685d) && Objects.equals(this.f39686e, hVar.f39686e);
    }

    public int hashCode() {
        String str = this.f39682a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39683b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39684c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f39685d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f39686e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
