package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f46649a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f46657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f46659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f46660l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f46662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f46663o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46650b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f46651c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f46652d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46653e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46654f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46655g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f46656h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f46661m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f46660l = iArr;
        iArr[0] = 6;
        this.f46662n = new String[32];
        this.f46663o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f46649a = reader;
    }

    private IOException F(String str) throws d {
        throw new d(str + f());
    }

    private void a() throws IOException {
        if (!this.f46650b) {
            throw F("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void b() throws IOException {
        h(true);
        int i10 = this.f46652d;
        int i11 = i10 - 1;
        this.f46652d = i11;
        if (i10 + 4 <= this.f46653e || d(5)) {
            char[] cArr = this.f46651c;
            if (cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                this.f46652d += 5;
            }
        }
    }

    private boolean d(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f46651c;
        int i13 = this.f46655g;
        int i14 = this.f46652d;
        this.f46655g = i13 - i14;
        int i15 = this.f46653e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f46653e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f46653e = 0;
        }
        this.f46652d = 0;
        do {
            Reader reader = this.f46649a;
            int i17 = this.f46653e;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f46653e + i18;
            this.f46653e = i11;
            if (this.f46654f == 0 && (i12 = this.f46655g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f46652d++;
                this.f46655g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private boolean e(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a();
        return false;
    }

    private int h(boolean z10) throws IOException {
        char[] cArr = this.f46651c;
        int i10 = this.f46652d;
        int i11 = this.f46653e;
        while (true) {
            if (i10 == i11) {
                this.f46652d = i10;
                if (!d(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + f());
                }
                i10 = this.f46652d;
                i11 = this.f46653e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f46654f++;
                this.f46655g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f46652d = i12;
                    if (i12 == i11) {
                        this.f46652d = i10;
                        boolean zD = d(2);
                        this.f46652d++;
                        if (!zD) {
                        }
                        return c10;
                    }
                    a();
                    int i13 = this.f46652d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f46652d = i13 + 1;
                        if (!u("*/")) {
                            throw F("Unterminated comment");
                        }
                        i10 = this.f46652d + 2;
                        i11 = this.f46653e;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f46652d = i13 + 1;
                        x();
                        i10 = this.f46652d;
                        i11 = this.f46653e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f46652d = i12;
                        return c10;
                    }
                    this.f46652d = i12;
                    a();
                    x();
                    i10 = this.f46652d;
                    i11 = this.f46653e;
                }
            }
            i10 = i12;
        }
    }

    private String k(char c10) throws IOException {
        int i10;
        char[] cArr = this.f46651c;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f46652d;
            int i12 = this.f46653e;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (c11 == c10) {
                            this.f46652d = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f46652d = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(s());
                            i11 = this.f46652d;
                            i12 = this.f46653e;
                        } else {
                            if (c11 == '\n') {
                                this.f46654f++;
                                this.f46655g = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f46652d = i11;
        } while (d(1));
        throw F("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String m() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f46652d;
                if (i12 + i11 < this.f46653e) {
                    char c10 = this.f46651c[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        a();
                    }
                    i10 = i11;
                } else if (i11 >= this.f46651c.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f46651c, this.f46652d, i11);
                    this.f46652d += i11;
                    if (!d(1)) {
                    }
                } else if (!d(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f46651c, this.f46652d, i10);
                } else {
                    sb2.append(this.f46651c, this.f46652d, i10);
                    string = sb2.toString();
                }
                this.f46652d += i10;
                return string;
            }
        }
    }

    private int o() {
        String str;
        String str2;
        int i10;
        char c10 = this.f46651c[this.f46652d];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f46652d + i11 >= this.f46653e && !d(i11 + 1)) {
                return 0;
            }
            char c11 = this.f46651c[this.f46652d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f46652d + length < this.f46653e || d(length + 1)) && e(this.f46651c[this.f46652d + length])) {
            return 0;
        }
        this.f46652d += length;
        this.f46656h = i10;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int p() {
        char c10;
        int i10;
        char[] cArr = this.f46651c;
        int i11 = this.f46652d;
        int i12 = this.f46653e;
        int i13 = 0;
        int i14 = 0;
        char c11 = 0;
        boolean z10 = false;
        int i15 = 1;
        long j10 = 0;
        while (true) {
            char c12 = 2;
            if (i11 + i14 != i12) {
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E' || c10 == 'e') {
                        if (c11 == 2 && c11 != 4) {
                            return i10;
                        }
                        c11 = 5;
                    } else if (c10 == '-') {
                        c12 = 6;
                        if (c11 == 0) {
                            c11 = 1;
                            z10 = true;
                        } else if (c11 != 5) {
                            return i10;
                        }
                    } else if (c10 != '.') {
                        if (c10 < '0' || c10 > '9') {
                            if (!e(c10)) {
                                break;
                            }
                            return i10;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j10 = -(c10 - '0');
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return i10;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            i15 &= (j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10)) ? 1 : i10;
                            j10 = j11;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    } else {
                        if (c11 != 2) {
                            return i10;
                        }
                        c11 = 3;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            } else {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!d(i14 + 1)) {
                    i10 = i13;
                    break;
                }
                i11 = this.f46652d;
                i12 = this.f46653e;
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E') {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    } else {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            }
        }
        if (c11 == 2 && i15 != 0 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f46657i = j10;
            this.f46652d += i14;
            this.f46656h = 15;
            return 15;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i10;
        }
        this.f46658j = i14;
        this.f46656h = 16;
        return 16;
    }

    private void r(int i10) {
        int i11 = this.f46661m;
        int[] iArr = this.f46660l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f46660l = Arrays.copyOf(iArr, i12);
            this.f46663o = Arrays.copyOf(this.f46663o, i12);
            this.f46662n = (String[]) Arrays.copyOf(this.f46662n, i12);
        }
        int[] iArr2 = this.f46660l;
        int i13 = this.f46661m;
        this.f46661m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char s() throws IOException {
        int i10;
        if (this.f46652d == this.f46653e && !d(1)) {
            throw F("Unterminated escape sequence");
        }
        char[] cArr = this.f46651c;
        int i11 = this.f46652d;
        int i12 = i11 + 1;
        this.f46652d = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f46654f++;
            this.f46655g = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            throw F("Invalid escape sequence");
        }
        if (i11 + 5 > this.f46653e && !d(4)) {
            throw F("Unterminated escape sequence");
        }
        int i13 = this.f46652d;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.f46651c[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f46651c, this.f46652d, 4));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (c13 + i10);
            i13++;
        }
        this.f46652d += 4;
        return c11;
    }

    private void t(char c10) throws IOException {
        char[] cArr = this.f46651c;
        do {
            int i10 = this.f46652d;
            int i11 = this.f46653e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f46652d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f46652d = i12;
                    s();
                    i10 = this.f46652d;
                    i11 = this.f46653e;
                } else {
                    if (c11 == '\n') {
                        this.f46654f++;
                        this.f46655g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f46652d = i10;
        } while (d(1));
        throw F("Unterminated string");
    }

    private boolean u(String str) {
        int length = str.length();
        while (true) {
            if (this.f46652d + length > this.f46653e && !d(length)) {
                return false;
            }
            char[] cArr = this.f46651c;
            int i10 = this.f46652d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f46651c[this.f46652d + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f46654f++;
            this.f46655g = i10 + 1;
            this.f46652d++;
        }
    }

    private void x() {
        char c10;
        do {
            if (this.f46652d >= this.f46653e && !d(1)) {
                return;
            }
            char[] cArr = this.f46651c;
            int i10 = this.f46652d;
            int i11 = i10 + 1;
            this.f46652d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f46654f++;
                this.f46655g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private void z() throws IOException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f46652d;
                if (i11 + i10 < this.f46653e) {
                    char c10 = this.f46651c[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        a();
                    }
                    this.f46652d += i10;
                    return;
                }
                this.f46652d = i11 + i10;
            }
        } while (d(1));
    }

    public String H() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f46661m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f46660l[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f46663o[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f46662n[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public void I() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 1) {
            r(3);
            this.f46656h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + f());
        }
    }

    public void J() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + f());
        }
        int i10 = this.f46661m;
        this.f46661m = i10 - 1;
        int[] iArr = this.f46663o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f46656h = 0;
    }

    public void N() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 3) {
            r(1);
            this.f46663o[this.f46661m - 1] = 0;
            this.f46656h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + f());
        }
    }

    public final void Q(boolean z10) {
        this.f46650b = z10;
    }

    public void T() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + f());
        }
        int i10 = this.f46661m;
        int i11 = i10 - 1;
        this.f46661m = i11;
        this.f46662n[i11] = null;
        int[] iArr = this.f46663o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f46656h = 0;
    }

    public String X0() throws IOException {
        String strK;
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 14) {
            strK = m();
        } else if (iC == 12) {
            strK = k('\'');
        } else {
            if (iC != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + f());
            }
            strK = k('\"');
        }
        this.f46656h = 0;
        this.f46662n[this.f46661m - 1] = strK;
        return strK;
    }

    int c() throws IOException {
        int iH;
        int[] iArr = this.f46660l;
        int i10 = this.f46661m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iH2 = h(true);
            if (iH2 != 44) {
                if (iH2 != 59) {
                    if (iH2 != 93) {
                        throw F("Unterminated array");
                    }
                    this.f46656h = 4;
                    return 4;
                }
                a();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iH = h(true)) != 44) {
                    if (iH != 59) {
                        if (iH != 125) {
                            throw F("Unterminated object");
                        }
                        this.f46656h = 2;
                        return 2;
                    }
                    a();
                }
                int iH3 = h(true);
                if (iH3 == 34) {
                    this.f46656h = 13;
                    return 13;
                }
                if (iH3 == 39) {
                    a();
                    this.f46656h = 12;
                    return 12;
                }
                if (iH3 == 125) {
                    if (i11 == 5) {
                        throw F("Expected name");
                    }
                    this.f46656h = 2;
                    return 2;
                }
                a();
                this.f46652d--;
                if (!e((char) iH3)) {
                    throw F("Expected name");
                }
                this.f46656h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iH4 = h(true);
                if (iH4 != 58) {
                    if (iH4 != 61) {
                        throw F("Expected ':'");
                    }
                    a();
                    if (this.f46652d < this.f46653e || d(1)) {
                        char[] cArr = this.f46651c;
                        int i12 = this.f46652d;
                        if (cArr[i12] == '>') {
                            this.f46652d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f46650b) {
                    b();
                }
                this.f46660l[this.f46661m - 1] = 7;
            } else if (i11 == 7) {
                if (h(false) == -1) {
                    this.f46656h = 17;
                    return 17;
                }
                a();
                this.f46652d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iH5 = h(true);
        if (iH5 == 34) {
            this.f46656h = 9;
            return 9;
        }
        if (iH5 == 39) {
            a();
            this.f46656h = 8;
            return 8;
        }
        if (iH5 != 44 && iH5 != 59) {
            if (iH5 == 91) {
                this.f46656h = 3;
                return 3;
            }
            if (iH5 != 93) {
                if (iH5 == 123) {
                    this.f46656h = 1;
                    return 1;
                }
                this.f46652d--;
                int iO = o();
                if (iO != 0) {
                    return iO;
                }
                int iP = p();
                if (iP != 0) {
                    return iP;
                }
                if (!e(this.f46651c[this.f46652d])) {
                    throw F("Expected value");
                }
                a();
                this.f46656h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f46656h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw F("Unexpected value");
        }
        a();
        this.f46652d--;
        this.f46656h = 7;
        return 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46656h = 0;
        this.f46660l[0] = 8;
        this.f46661m = 1;
        this.f46649a.close();
    }

    String f() {
        return " at line " + (this.f46654f + 1) + " column " + ((this.f46652d - this.f46655g) + 1) + " path " + H();
    }

    public boolean g() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 5) {
            this.f46656h = 0;
            int[] iArr = this.f46663o;
            int i10 = this.f46661m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iC == 6) {
            this.f46656h = 0;
            int[] iArr2 = this.f46663o;
            int i11 = this.f46661m - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + f());
    }

    public boolean hasNext() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        return (iC == 2 || iC == 4) ? false : true;
    }

    public void i() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 7) {
            this.f46656h = 0;
            int[] iArr = this.f46663o;
            int i10 = this.f46661m - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + f());
    }

    public String j2() throws IOException {
        String str;
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 10) {
            str = m();
        } else if (iC == 8) {
            str = k('\'');
        } else if (iC == 9) {
            str = k('\"');
        } else if (iC == 11) {
            str = this.f46659k;
            this.f46659k = null;
        } else if (iC == 15) {
            str = Long.toString(this.f46657i);
        } else {
            if (iC != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + f());
            }
            str = new String(this.f46651c, this.f46652d, this.f46658j);
            this.f46652d += this.f46658j;
        }
        this.f46656h = 0;
        int[] iArr = this.f46663o;
        int i10 = this.f46661m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public void k0() throws IOException {
        int i10 = 0;
        do {
            int iC = this.f46656h;
            if (iC == 0) {
                iC = c();
            }
            if (iC == 3) {
                r(1);
            } else {
                if (iC == 1) {
                    r(3);
                } else if (iC == 4 || iC == 2) {
                    this.f46661m--;
                    i10--;
                } else if (iC == 14 || iC == 10) {
                    z();
                } else if (iC == 8 || iC == 12) {
                    t('\'');
                } else if (iC == 9 || iC == 13) {
                    t('\"');
                } else if (iC == 16) {
                    this.f46652d += this.f46658j;
                }
                this.f46656h = 0;
            }
            i10++;
            this.f46656h = 0;
        } while (i10 != 0);
        int[] iArr = this.f46663o;
        int i11 = this.f46661m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f46662n[i11 - 1] = "null";
    }

    public double nextDouble() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f46656h = 0;
            int[] iArr = this.f46663o;
            int i10 = this.f46661m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f46657i;
        }
        if (iC == 16) {
            this.f46659k = new String(this.f46651c, this.f46652d, this.f46658j);
            this.f46652d += this.f46658j;
        } else if (iC == 8 || iC == 9) {
            this.f46659k = k(iC == 8 ? '\'' : '\"');
        } else if (iC == 10) {
            this.f46659k = m();
        } else if (iC != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + f());
        }
        this.f46656h = 11;
        double d10 = Double.parseDouble(this.f46659k);
        if (!this.f46650b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + f());
        }
        this.f46659k = null;
        this.f46656h = 0;
        int[] iArr2 = this.f46663o;
        int i11 = this.f46661m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int nextInt() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            long j10 = this.f46657i;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f46656h = 0;
                int[] iArr = this.f46663o;
                int i11 = this.f46661m - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f46657i + f());
        }
        if (iC == 16) {
            this.f46659k = new String(this.f46651c, this.f46652d, this.f46658j);
            this.f46652d += this.f46658j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + f());
            }
            if (iC == 10) {
                this.f46659k = m();
            } else {
                this.f46659k = k(iC == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f46659k);
                this.f46656h = 0;
                int[] iArr2 = this.f46663o;
                int i13 = this.f46661m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46656h = 11;
        double d10 = Double.parseDouble(this.f46659k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f46659k + f());
        }
        this.f46659k = null;
        this.f46656h = 0;
        int[] iArr3 = this.f46663o;
        int i15 = this.f46661m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f46656h = 0;
            int[] iArr = this.f46663o;
            int i10 = this.f46661m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f46657i;
        }
        if (iC == 16) {
            this.f46659k = new String(this.f46651c, this.f46652d, this.f46658j);
            this.f46652d += this.f46658j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + f());
            }
            if (iC == 10) {
                this.f46659k = m();
            } else {
                this.f46659k = k(iC == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f46659k);
                this.f46656h = 0;
                int[] iArr2 = this.f46663o;
                int i11 = this.f46661m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46656h = 11;
        double d10 = Double.parseDouble(this.f46659k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f46659k + f());
        }
        this.f46659k = null;
        this.f46656h = 0;
        int[] iArr3 = this.f46663o;
        int i12 = this.f46661m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public b peek() throws IOException {
        int iC = this.f46656h;
        if (iC == 0) {
            iC = c();
        }
        switch (iC) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + f();
    }
}
