package F0;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final y a() {
        return Build.VERSION.SDK_INT >= 28 ? new A() : new B();
    }

    public static final String b(String str, r rVar) {
        int iP = rVar.p() / 100;
        if (iP >= 0 && iP < 2) {
            return str + "-thin";
        }
        if (2 <= iP && iP < 4) {
            return str + "-light";
        }
        if (iP == 4) {
            return str;
        }
        if (iP == 5) {
            return str + "-medium";
        }
        if ((6 <= iP && iP < 8) || 8 > iP || iP >= 11) {
            return str;
        }
        return str + "-black";
    }
}
