package V1;

import R1.x;
import U1.AbstractC1459a;
import U1.F;
import U1.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13908d;

    public c(String str, byte[] bArr, int i10, int i11) {
        f(str, bArr, i11);
        this.f13905a = str;
        this.f13906b = bArr;
        this.f13907c = i10;
        this.f13908d = i11;
    }

    private static String e(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        B9.g.f(',').b(sb2, list);
        return sb2.toString();
    }

    private static void f(String str, byte[] bArr, int i10) {
        byte b10;
        str.getClass();
        boolean z10 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                AbstractC1459a.a(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                AbstractC1459a.a(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                AbstractC1459a.a(z10);
                break;
            case "auxiliary.tracks.map":
                AbstractC1459a.a(i10 == 0);
                break;
        }
    }

    public List d() {
        AbstractC1459a.h(this.f13905a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b10 = this.f13906b[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f13906b[i10 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f13905a.equals(cVar.f13905a) && Arrays.equals(this.f13906b, cVar.f13906b) && this.f13907c == cVar.f13907c && this.f13908d == cVar.f13908d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f13905a.hashCode()) * 31) + Arrays.hashCode(this.f13906b)) * 31) + this.f13907c) * 31) + this.f13908d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public String toString() {
        String strE;
        int i10 = this.f13908d;
        if (i10 != 0) {
            if (i10 == 1) {
                strE = S.H(this.f13906b);
            } else if (i10 == 23) {
                strE = String.valueOf(Float.intBitsToFloat(F9.f.h(this.f13906b)));
            } else if (i10 == 67) {
                strE = String.valueOf(F9.f.h(this.f13906b));
            } else if (i10 == 75) {
                strE = String.valueOf(b.a(this.f13906b[0]));
            } else if (i10 != 78) {
                strE = S.l1(this.f13906b);
            } else {
                strE = String.valueOf(new F(this.f13906b).S());
            }
        } else if (this.f13905a.equals("auxiliary.tracks.map")) {
            strE = e(d());
        } else {
            strE = S.l1(this.f13906b);
        }
        return "mdta: key=" + this.f13905a + ", value=" + strE;
    }
}
