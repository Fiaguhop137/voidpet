package W2;

import U1.AbstractC1459a;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14580f;

    private a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f14575a = i10;
        this.f14576b = i11;
        this.f14577c = i12;
        this.f14578d = i13;
        this.f14579e = i14;
        this.f14580f = i15;
    }

    public static a a(String str) {
        AbstractC1459a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strE = B9.c.e(strArrSplit[i15].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "layer":
                    i10 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new a(i10, i11, i12, i13, i14, strArrSplit.length);
    }
}
