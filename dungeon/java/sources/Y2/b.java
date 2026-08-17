package Y2;

import C9.AbstractC0878v;
import C9.AbstractC0879w;
import C9.Q;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f16837d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC0878v f16838e = AbstractC0878v.x("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC0878v f16839f = AbstractC0878v.y("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC0878v f16840g = AbstractC0878v.x("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC0878v f16841h = AbstractC0878v.y("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16844c;

    private b(int i10, int i11, int i12) {
        this.f16842a = i10;
        this.f16843b = i11;
        this.f16844c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = B9.c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(AbstractC0878v.p(TextUtils.split(strE, f16837d)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:73:0x0109  */
    private static b b(AbstractC0878v abstractC0878v) {
        byte b10;
        int i10;
        int i11;
        String str;
        int iHashCode;
        String str2 = (String) AbstractC0879w.c(Q.e(f16841h, abstractC0878v), "outside");
        int iHashCode2 = str2.hashCode();
        int i12 = 2;
        byte b11 = 0;
        int i13 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals("after")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals("outside")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("before")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        Q.f fVarE = Q.e(f16838e, abstractC0878v);
        if (!fVarE.isEmpty()) {
            String str3 = (String) fVarE.iterator().next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i13 = 0;
            }
            return new b(i13, 0, i10);
        }
        Q.f fVarE2 = Q.e(f16840g, abstractC0878v);
        Q.f fVarE3 = Q.e(f16839f, abstractC0878v);
        if (fVarE2.isEmpty() && fVarE3.isEmpty()) {
            return new b(-1, 0, i10);
        }
        String str4 = (String) AbstractC0879w.c(fVarE2, "filled");
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str4.equals("open")) {
                i11 = 2;
            }
            str = (String) AbstractC0879w.c(fVarE3, "circle");
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals("dot")) {
                        b11 = -1;
                    }
                } else if (str.equals("sesame")) {
                    b11 = 1;
                } else {
                    b11 = -1;
                }
            } else if (str.equals("circle")) {
                b11 = 2;
            } else {
                b11 = -1;
            }
            if (b11 != 0) {
                if (b11 != 1) {
                    i12 = 1;
                } else {
                    i12 = 3;
                }
            }
            return new b(i12, i11, i10);
        }
        str4.equals("filled");
        i11 = 1;
        str = (String) AbstractC0879w.c(fVarE3, "circle");
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b11 = -1;
                } else {
                    b11 = -1;
                }
            } else if (str.equals("sesame")) {
                b11 = 1;
            } else {
                b11 = -1;
            }
        } else if (str.equals("circle")) {
            b11 = 2;
        } else {
            b11 = -1;
        }
        if (b11 != 0) {
            if (b11 != 1) {
                i12 = 1;
            } else {
                i12 = 3;
            }
        }
        return new b(i12, i11, i10);
    }
}
