package Pf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M {
    static G a(G g10) {
        return b(g10, 128);
    }

    static G b(G g10, int i10) {
        if (g10.G(i10)) {
            return g10;
        }
        throw new IllegalStateException("Expected " + c(i10) + " tag but found " + d(g10));
    }

    public static String c(int i10) {
        if (i10 == 64) {
            return "APPLICATION";
        }
        if (i10 != 128) {
            return i10 != 192 ? "UNIVERSAL" : "PRIVATE";
        }
        return "CONTEXT";
    }

    public static String d(G g10) {
        return c(g10.E());
    }

    public static String e(int i10, int i11) {
        StringBuilder sb2;
        String str;
        if (i10 == 64) {
            sb2 = new StringBuilder();
            str = "[APPLICATION ";
        } else if (i10 == 128) {
            sb2 = new StringBuilder();
            str = "[CONTEXT ";
        } else if (i10 != 192) {
            sb2 = new StringBuilder();
            str = "[UNIVERSAL ";
        } else {
            sb2 = new StringBuilder();
            str = "[PRIVATE ";
        }
        sb2.append(str);
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    public static String f(G g10) {
        return e(g10.E(), g10.F());
    }
}
