package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f46664j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f46665k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f46666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f46667b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46668c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f46672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f46673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f46674i;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f46664j[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f46664j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f46665k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        s(6);
        this.f46670e = ":";
        this.f46674i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f46666a = writer;
    }

    private void P() throws IOException {
        if (this.f46673h != null) {
            a();
            x(this.f46673h);
            this.f46673h = null;
        }
    }

    private void a() throws IOException {
        int iR = r();
        if (iR == 5) {
            this.f46666a.write(44);
        } else if (iR != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m();
        t(4);
    }

    private void b() throws IOException {
        int iR = r();
        if (iR == 1) {
            t(2);
            m();
            return;
        }
        if (iR == 2) {
            this.f46666a.append(',');
            m();
        } else {
            if (iR == 4) {
                this.f46666a.append((CharSequence) this.f46670e);
                t(5);
                return;
            }
            if (iR != 6) {
                if (iR != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f46671f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            t(7);
        }
    }

    private c e(int i10, int i11, char c10) throws IOException {
        int iR = r();
        if (iR != i11 && iR != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f46673h != null) {
            throw new IllegalStateException("Dangling name: " + this.f46673h);
        }
        this.f46668c--;
        if (iR == i11) {
            m();
        }
        this.f46666a.write(c10);
        return this;
    }

    private void m() throws IOException {
        if (this.f46669d == null) {
            return;
        }
        this.f46666a.write(10);
        int i10 = this.f46668c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f46666a.write(this.f46669d);
        }
    }

    private c p(int i10, char c10) throws IOException {
        b();
        s(i10);
        this.f46666a.write(c10);
        return this;
    }

    private int r() {
        int i10 = this.f46668c;
        if (i10 != 0) {
            return this.f46667b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void s(int i10) {
        int i11 = this.f46668c;
        int[] iArr = this.f46667b;
        if (i11 == iArr.length) {
            this.f46667b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f46667b;
        int i12 = this.f46668c;
        this.f46668c = i12 + 1;
        iArr2[i12] = i10;
    }

    private void t(int i10) {
        this.f46667b[this.f46668c - 1] = i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void x(String str) throws IOException {
        String str2;
        String[] strArr = this.f46672g ? f46665k : f46664j;
        this.f46666a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f46666a.write(str, i10, i11 - i10);
                    }
                    this.f46666a.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f46666a.write(str, i10, i11 - i10);
                }
                this.f46666a.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f46666a.write(str, i10, length - i10);
        }
        this.f46666a.write(34);
    }

    public c F(long j10) throws IOException {
        P();
        b();
        this.f46666a.write(Long.toString(j10));
        return this;
    }

    public c G(Boolean bool) throws IOException {
        if (bool == null) {
            return o();
        }
        P();
        b();
        this.f46666a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c K(Number number) throws IOException {
        if (number == null) {
            return o();
        }
        P();
        String string = number.toString();
        if (this.f46671f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            b();
            this.f46666a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c L(String str) throws IOException {
        if (str == null) {
            return o();
        }
        P();
        b();
        x(str);
        return this;
    }

    public c O(boolean z10) throws IOException {
        P();
        b();
        this.f46666a.write(z10 ? "true" : "false");
        return this;
    }

    public final void Q(boolean z10) {
        this.f46671f = z10;
    }

    public c c() throws IOException {
        P();
        return p(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46666a.close();
        int i10 = this.f46668c;
        if (i10 > 1 || (i10 == 1 && this.f46667b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f46668c = 0;
    }

    public c d() throws IOException {
        P();
        return p(3, '{');
    }

    public c f() {
        return e(1, 2, ']');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f46668c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f46666a.flush();
    }

    public c g() {
        return e(3, 5, '}');
    }

    public String h() {
        return this.f46669d;
    }

    public c i(String str) throws IOException {
        if (str == null) {
            return o();
        }
        P();
        b();
        this.f46666a.append((CharSequence) str);
        return this;
    }

    public c k(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f46673h != null) {
            throw new IllegalStateException();
        }
        if (this.f46668c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f46673h = str;
        return this;
    }

    public c o() throws IOException {
        if (this.f46673h != null) {
            if (!this.f46674i) {
                this.f46673h = null;
                return this;
            }
            P();
        }
        b();
        this.f46666a.write("null");
        return this;
    }

    public final void u(String str) {
        if (str == null || str.length() == 0) {
            this.f46669d = null;
            this.f46670e = ":";
        } else {
            this.f46669d = str;
            this.f46670e = ": ";
        }
    }

    public c z(double d10) throws IOException {
        P();
        if (this.f46671f || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f46666a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }
}
