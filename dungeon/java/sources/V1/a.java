package V1;

import U1.F;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13904c;

    private a(int i10, int i11, String str) {
        this.f13902a = i10;
        this.f13903b = i11;
        this.f13904c = str;
    }

    public static a a(F f10) {
        String str;
        f10.b0(2);
        int iL = f10.L();
        int i10 = iL >> 1;
        int iL2 = ((f10.L() >> 3) & 31) | ((iL & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(iL2 < 10 ? ".0" : ".");
        sb2.append(iL2);
        return new a(i10, iL2, sb2.toString());
    }
}
