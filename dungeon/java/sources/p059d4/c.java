package p059d4;

import If.C1106h;
import If.C1109k;
import If.InterfaceC1107i;
import If.InterfaceC1108j;
import If.O;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f39779g = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f39780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f39781b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f39782c = new String[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f39783d = new int[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f39784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f39785f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f39786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final O f39787b;

        private a(String[] strArr, O o10) {
            this.f39786a = strArr;
            this.f39787b = o10;
        }

        public static a a(String... strArr) {
            try {
                C1109k[] c1109kArr = new C1109k[strArr.length];
                C1106h c1106h = new C1106h();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.h(c1106h, strArr[i10]);
                    c1106h.readByte();
                    c1109kArr[i10] = c1106h.z();
                }
                return new a((String[]) strArr.clone(), O.q(c1109kArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f39779g[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f39779g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    public static c c(InterfaceC1108j interfaceC1108j) {
        return new e(interfaceC1108j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void h(InterfaceC1107i interfaceC1107i, String str) {
        String str2;
        String[] strArr = f39779g;
        interfaceC1107i.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        interfaceC1107i.n1(str, i10, i11);
                    }
                    interfaceC1107i.Z0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    interfaceC1107i.n1(str, i10, i11);
                }
                interfaceC1107i.Z0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            interfaceC1107i.n1(str, i10, length);
        }
        interfaceC1107i.writeByte(34);
    }

    public final String H() {
        return d.a(this.f39780a, this.f39781b, this.f39782c, this.f39783d);
    }

    public abstract void I();

    public abstract void J();

    public abstract void N();

    public abstract void T();

    public abstract String X0();

    public abstract boolean b();

    public abstract b d();

    final void e(int i10) {
        int i11 = this.f39780a;
        int[] iArr = this.f39781b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new p059d4.a("Nesting too deep at " + H());
            }
            this.f39781b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f39782c;
            this.f39782c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f39783d;
            this.f39783d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f39781b;
        int i12 = this.f39780a;
        this.f39780a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int f(a aVar);

    public abstract void g();

    public abstract boolean hasNext();

    final p059d4.b i(String str) throws p059d4.b {
        throw new p059d4.b(str + " at path " + H());
    }

    public abstract String j2();

    public abstract void k0();

    public abstract double nextDouble();

    public abstract int nextInt();
}
