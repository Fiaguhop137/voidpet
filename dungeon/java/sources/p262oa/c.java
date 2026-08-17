package p262oa;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f50500j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f50501k = new String[128];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f50502l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f50503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f50504b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50505c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f50507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f50508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f50510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50511i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f50501k[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f50501k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f50502l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        u(6);
        this.f50507e = ":";
        this.f50511i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f50503a = writer;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void K(String str) throws IOException {
        String str2;
        String[] strArr = this.f50509g ? f50502l : f50501k;
        this.f50503a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f50503a.write(str, i10, i11 - i10);
                    }
                    this.f50503a.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f50503a.write(str, i10, i11 - i10);
                }
                this.f50503a.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f50503a.write(str, i10, length - i10);
        }
        this.f50503a.write(34);
    }

    private void Z() throws IOException {
        if (this.f50510h != null) {
            a();
            K(this.f50510h);
            this.f50510h = null;
        }
    }

    private void a() throws IOException {
        int iT = t();
        if (iT == 5) {
            this.f50503a.write(44);
        } else if (iT != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        p();
        x(4);
    }

    private void b() throws IOException {
        int iT = t();
        if (iT == 1) {
            x(2);
            p();
            return;
        }
        if (iT == 2) {
            this.f50503a.append(',');
            p();
        } else {
            if (iT == 4) {
                this.f50503a.append((CharSequence) this.f50507e);
                x(5);
                return;
            }
            if (iT != 6) {
                if (iT != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f50508f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            x(7);
        }
    }

    private c e(int i10, int i11, char c10) throws IOException {
        int iT = t();
        if (iT != i11 && iT != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f50510h != null) {
            throw new IllegalStateException("Dangling name: " + this.f50510h);
        }
        this.f50505c--;
        if (iT == i11) {
            p();
        }
        this.f50503a.write(c10);
        return this;
    }

    private static boolean m(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void p() throws IOException {
        if (this.f50506d == null) {
            return;
        }
        this.f50503a.write(10);
        int i10 = this.f50505c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f50503a.write(this.f50506d);
        }
    }

    private c s(int i10, char c10) throws IOException {
        b();
        u(i10);
        this.f50503a.write(c10);
        return this;
    }

    private int t() {
        int i10 = this.f50505c;
        if (i10 != 0) {
            return this.f50504b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void u(int i10) {
        int i11 = this.f50505c;
        int[] iArr = this.f50504b;
        if (i11 == iArr.length) {
            this.f50504b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f50504b;
        int i12 = this.f50505c;
        this.f50505c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void x(int i10) {
        this.f50504b[this.f50505c - 1] = i10;
    }

    public final void F(String str) {
        if (str.length() == 0) {
            this.f50506d = null;
            this.f50507e = ":";
        } else {
            this.f50506d = str;
            this.f50507e = ": ";
        }
    }

    public final void G(boolean z10) {
        this.f50511i = z10;
    }

    public c L(double d10) throws IOException {
        Z();
        if (this.f50508f || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f50503a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c O(long j10) throws IOException {
        Z();
        b();
        this.f50503a.write(Long.toString(j10));
        return this;
    }

    public c P(Boolean bool) throws IOException {
        if (bool == null) {
            return r();
        }
        Z();
        b();
        this.f50503a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public final void Q(boolean z10) {
        this.f50508f = z10;
    }

    public c S(Number number) throws IOException {
        if (number == null) {
            return r();
        }
        Z();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m(cls) && !f50500j.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f50508f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        b();
        this.f50503a.append((CharSequence) string);
        return this;
    }

    public c U(String str) throws IOException {
        if (str == null) {
            return r();
        }
        Z();
        b();
        K(str);
        return this;
    }

    public c V(boolean z10) throws IOException {
        Z();
        b();
        this.f50503a.write(z10 ? "true" : "false");
        return this;
    }

    public c c() throws IOException {
        Z();
        return s(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f50503a.close();
        int i10 = this.f50505c;
        if (i10 > 1 || (i10 == 1 && this.f50504b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f50505c = 0;
    }

    public c d() throws IOException {
        Z();
        return s(3, '{');
    }

    public c f() {
        return e(1, 2, ']');
    }

    public void flush() throws IOException {
        if (this.f50505c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f50503a.flush();
    }

    public c g() {
        return e(3, 5, '}');
    }

    public final boolean h() {
        return this.f50511i;
    }

    public final boolean i() {
        return this.f50509g;
    }

    public boolean k() {
        return this.f50508f;
    }

    public c o(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f50510h != null) {
            throw new IllegalStateException();
        }
        if (this.f50505c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f50510h = str;
        return this;
    }

    public c r() throws IOException {
        if (this.f50510h != null) {
            if (!this.f50511i) {
                this.f50510h = null;
                return this;
            }
            Z();
        }
        b();
        this.f50503a.write("null");
        return this;
    }

    public final void z(boolean z10) {
        this.f50509g = z10;
    }
}
