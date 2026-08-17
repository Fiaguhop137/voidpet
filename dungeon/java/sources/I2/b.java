package I2;

import R1.w;
import R1.x;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4915f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        AbstractC1459a.a(i11 == -1 || i11 > 0);
        this.f4910a = i10;
        this.f4911b = str;
        this.f4912c = str2;
        this.f4913d = str3;
        this.f4914e = z10;
        this.f4915f = i11;
    }

    public static b d(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str3 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str3) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        AbstractC1477t.h("IcyHeaders", "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC1477t.h("IcyHeaders", "Invalid bitrate header: " + str3);
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        String str4 = null;
        if (list2 != null) {
            str4 = (String) list2.get(0);
            z10 = true;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str = (String) list3.get(0);
            z10 = true;
        } else {
            str = str4;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str2 = (String) list4.get(0);
            z10 = true;
        } else {
            str2 = str4;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        AbstractC1477t.h("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        AbstractC1477t.h("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        return z10 ? new b(i10, str4, str, str2, zEquals, i12) : null;
    }

    @Override // R1.x.a
    public void b(w.b bVar) {
        String str = this.f4912c;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f4911b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4910a == bVar.f4910a && Objects.equals(this.f4911b, bVar.f4911b) && Objects.equals(this.f4912c, bVar.f4912c) && Objects.equals(this.f4913d, bVar.f4913d) && this.f4914e == bVar.f4914e && this.f4915f == bVar.f4915f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f4910a) * 31;
        String str = this.f4911b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4912c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4913d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f4914e ? 1 : 0)) * 31) + this.f4915f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f4912c + "\", genre=\"" + this.f4911b + "\", bitrate=" + this.f4910a + ", metadataInterval=" + this.f4915f;
    }
}
