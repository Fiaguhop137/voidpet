package R1;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.S;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f9961f = S.z0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f9962g = S.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r[] f9966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9967e;

    public G(String str, r... rVarArr) {
        AbstractC1459a.a(rVarArr.length > 0);
        this.f9964b = str;
        this.f9966d = rVarArr;
        this.f9963a = rVarArr.length;
        int iK = y.k(rVarArr[0].f10277o);
        this.f9965c = iK == -1 ? y.k(rVarArr[0].f10276n) : iK;
        f();
    }

    public G(r... rVarArr) {
        this("", rVarArr);
    }

    private static void c(String str, String str2, String str3, int i10) {
        AbstractC1477t.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int e(int i10) {
        return i10 | 16384;
    }

    private void f() {
        String strD = d(this.f9966d[0].f10266d);
        int iE = e(this.f9966d[0].f10268f);
        int i10 = 1;
        while (true) {
            r[] rVarArr = this.f9966d;
            if (i10 >= rVarArr.length) {
                return;
            }
            if (!strD.equals(d(rVarArr[i10].f10266d))) {
                r[] rVarArr2 = this.f9966d;
                c("languages", rVarArr2[0].f10266d, rVarArr2[i10].f10266d, i10);
                return;
            } else {
                if (iE != e(this.f9966d[i10].f10268f)) {
                    c("role flags", Integer.toBinaryString(this.f9966d[0].f10268f), Integer.toBinaryString(this.f9966d[i10].f10268f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public r a(int i10) {
        return this.f9966d[i10];
    }

    public int b(r rVar) {
        int i10 = 0;
        while (true) {
            r[] rVarArr = this.f9966d;
            if (i10 >= rVarArr.length) {
                return -1;
            }
            if (rVar == rVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g10 = (G) obj;
            if (this.f9964b.equals(g10.f9964b) && Arrays.equals(this.f9966d, g10.f9966d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f9967e == 0) {
            this.f9967e = ((527 + this.f9964b.hashCode()) * 31) + Arrays.hashCode(this.f9966d);
        }
        return this.f9967e;
    }

    public String toString() {
        return this.f9964b + ": " + Arrays.toString(this.f9966d);
    }
}
