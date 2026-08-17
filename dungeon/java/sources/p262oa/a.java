package p262oa;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p155ia.f;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f50474a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f50482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f50484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f50485l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f50487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f50488o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50475b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f50476c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50477d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50478e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50479f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50480g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f50481h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50486m = 1;

    /* JADX INFO: renamed from: oa.a$a, reason: collision with other inner class name */
    class C0599a extends f {
        C0599a() {
        }

        @Override // p155ia.f
        public void a(a aVar) throws IOException {
            int iC = aVar.f50481h;
            if (iC == 0) {
                iC = aVar.c();
            }
            if (iC == 13) {
                aVar.f50481h = 9;
                return;
            }
            if (iC == 12) {
                aVar.f50481h = 8;
                return;
            }
            if (iC == 14) {
                aVar.f50481h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.s() + aVar.i());
        }
    }

    static {
        f.f43805a = new C0599a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f50485l = iArr;
        iArr[0] = 6;
        this.f50487n = new String[32];
        this.f50488o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f50474a = reader;
    }

    private void F(char c10) throws IOException {
        char[] cArr = this.f50476c;
        do {
            int i10 = this.f50477d;
            int i11 = this.f50478e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f50477d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f50477d = i12;
                    z();
                    i10 = this.f50477d;
                    i11 = this.f50478e;
                } else {
                    if (c11 == '\n') {
                        this.f50479f++;
                        this.f50480g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f50477d = i10;
        } while (d(1));
        throw O("Unterminated string");
    }

    private boolean G(String str) {
        int length = str.length();
        while (true) {
            if (this.f50477d + length > this.f50478e && !d(length)) {
                return false;
            }
            char[] cArr = this.f50476c;
            int i10 = this.f50477d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f50476c[this.f50477d + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f50479f++;
            this.f50480g = i10 + 1;
            this.f50477d++;
        }
    }

    private void K() {
        char c10;
        do {
            if (this.f50477d >= this.f50478e && !d(1)) {
                return;
            }
            char[] cArr = this.f50476c;
            int i10 = this.f50477d;
            int i11 = i10 + 1;
            this.f50477d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f50479f++;
                this.f50480g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    private void L() throws IOException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f50477d;
                if (i11 + i10 < this.f50478e) {
                    char c10 = this.f50476c[i11 + i10];
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
                    this.f50477d += i10;
                    return;
                }
                this.f50477d = i11 + i10;
            }
        } while (d(1));
    }

    private IOException O(String str) throws d {
        throw new d(str + i());
    }

    private void a() throws IOException {
        if (!this.f50475b) {
            throw O("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void b() throws IOException {
        m(true);
        int i10 = this.f50477d;
        this.f50477d = i10 - 1;
        if (i10 + 4 <= this.f50478e || d(5)) {
            int i11 = this.f50477d;
            char[] cArr = this.f50476c;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f50477d = i11 + 5;
            }
        }
    }

    private boolean d(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f50476c;
        int i13 = this.f50480g;
        int i14 = this.f50477d;
        this.f50480g = i13 - i14;
        int i15 = this.f50478e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f50478e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f50478e = 0;
        }
        this.f50477d = 0;
        do {
            Reader reader = this.f50474a;
            int i17 = this.f50478e;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f50478e + i18;
            this.f50478e = i11;
            if (this.f50479f == 0 && (i12 = this.f50480g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f50477d++;
                this.f50480g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private String e(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f50486m;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f50485l[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f50488o[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb2.append('[');
                sb2.append(i13);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = this.f50487n[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i10++;
        }
    }

    private boolean h(char c10) throws IOException {
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

    private int m(boolean z10) throws IOException {
        char[] cArr = this.f50476c;
        int i10 = this.f50477d;
        int i11 = this.f50478e;
        while (true) {
            if (i10 == i11) {
                this.f50477d = i10;
                if (!d(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + i());
                }
                i10 = this.f50477d;
                i11 = this.f50478e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f50479f++;
                this.f50480g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f50477d = i12;
                    if (i12 == i11) {
                        this.f50477d = i10;
                        boolean zD = d(2);
                        this.f50477d++;
                        if (!zD) {
                        }
                        return c10;
                    }
                    a();
                    int i13 = this.f50477d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f50477d = i13 + 1;
                        if (!G("*/")) {
                            throw O("Unterminated comment");
                        }
                        i10 = this.f50477d + 2;
                        i11 = this.f50478e;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f50477d = i13 + 1;
                        K();
                        i10 = this.f50477d;
                        i11 = this.f50478e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f50477d = i12;
                        return c10;
                    }
                    this.f50477d = i12;
                    a();
                    K();
                    i10 = this.f50477d;
                    i11 = this.f50478e;
                }
            }
            i10 = i12;
        }
    }

    private String p(char c10) throws IOException {
        int i10;
        char[] cArr = this.f50476c;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f50477d;
            int i12 = this.f50478e;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (c11 == c10) {
                            this.f50477d = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f50477d = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(z());
                            i11 = this.f50477d;
                            i12 = this.f50478e;
                        } else {
                            if (c11 == '\n') {
                                this.f50479f++;
                                this.f50480g = i14;
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
            this.f50477d = i11;
        } while (d(1));
        throw O("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String r() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f50477d;
                if (i12 + i11 < this.f50478e) {
                    char c10 = this.f50476c[i12 + i11];
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
                } else if (i11 >= this.f50476c.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f50476c, this.f50477d, i11);
                    this.f50477d += i11;
                    if (!d(1)) {
                    }
                } else if (!d(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f50476c, this.f50477d, i10);
                } else {
                    sb2.append(this.f50476c, this.f50477d, i10);
                    string = sb2.toString();
                }
                this.f50477d += i10;
                return string;
            }
        }
    }

    private int t() {
        String str;
        String str2;
        int i10;
        char c10 = this.f50476c[this.f50477d];
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
            if (this.f50477d + i11 >= this.f50478e && !d(i11 + 1)) {
                return 0;
            }
            char c11 = this.f50476c[this.f50477d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f50477d + length < this.f50478e || d(length + 1)) && h(this.f50476c[this.f50477d + length])) {
            return 0;
        }
        this.f50477d += length;
        this.f50481h = i10;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int u() {
        char c10;
        int i10;
        char[] cArr = this.f50476c;
        int i11 = this.f50477d;
        int i12 = this.f50478e;
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
                            if (!h(c10)) {
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
                i11 = this.f50477d;
                i12 = this.f50478e;
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
            this.f50482i = j10;
            this.f50477d += i14;
            this.f50481h = 15;
            return 15;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i10;
        }
        this.f50483j = i14;
        this.f50481h = 16;
        return 16;
    }

    private void x(int i10) {
        int i11 = this.f50486m;
        int[] iArr = this.f50485l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f50485l = Arrays.copyOf(iArr, i12);
            this.f50488o = Arrays.copyOf(this.f50488o, i12);
            this.f50487n = (String[]) Arrays.copyOf(this.f50487n, i12);
        }
        int[] iArr2 = this.f50485l;
        int i13 = this.f50486m;
        this.f50486m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char z() throws IOException {
        int i10;
        if (this.f50477d == this.f50478e && !d(1)) {
            throw O("Unterminated escape sequence");
        }
        char[] cArr = this.f50476c;
        int i11 = this.f50477d;
        int i12 = i11 + 1;
        this.f50477d = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f50479f++;
            this.f50480g = i12;
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
            throw O("Invalid escape sequence");
        }
        if (i11 + 5 > this.f50478e && !d(4)) {
            throw O("Unterminated escape sequence");
        }
        int i13 = this.f50477d;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.f50476c[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f50476c, this.f50477d, 4));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (c13 + i10);
            i13++;
        }
        this.f50477d += 4;
        return c11;
    }

    public String H() {
        return e(false);
    }

    public void I() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 1) {
            x(3);
            this.f50481h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + s() + i());
        }
    }

    public void J() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + s() + i());
        }
        int i10 = this.f50486m;
        this.f50486m = i10 - 1;
        int[] iArr = this.f50488o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f50481h = 0;
    }

    public void N() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 3) {
            x(1);
            this.f50488o[this.f50486m - 1] = 0;
            this.f50481h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + s() + i());
        }
    }

    public final void Q(boolean z10) {
        this.f50475b = z10;
    }

    public void T() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + s() + i());
        }
        int i10 = this.f50486m;
        int i11 = i10 - 1;
        this.f50486m = i11;
        this.f50487n[i11] = null;
        int[] iArr = this.f50488o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f50481h = 0;
    }

    public String X0() throws IOException {
        String strP;
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 14) {
            strP = r();
        } else if (iC == 12) {
            strP = p('\'');
        } else {
            if (iC != 13) {
                throw new IllegalStateException("Expected a name but was " + s() + i());
            }
            strP = p('\"');
        }
        this.f50481h = 0;
        this.f50487n[this.f50486m - 1] = strP;
        return strP;
    }

    int c() throws IOException {
        int iM;
        int[] iArr = this.f50485l;
        int i10 = this.f50486m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iM2 = m(true);
            if (iM2 != 44) {
                if (iM2 != 59) {
                    if (iM2 != 93) {
                        throw O("Unterminated array");
                    }
                    this.f50481h = 4;
                    return 4;
                }
                a();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iM = m(true)) != 44) {
                    if (iM != 59) {
                        if (iM != 125) {
                            throw O("Unterminated object");
                        }
                        this.f50481h = 2;
                        return 2;
                    }
                    a();
                }
                int iM3 = m(true);
                if (iM3 == 34) {
                    this.f50481h = 13;
                    return 13;
                }
                if (iM3 == 39) {
                    a();
                    this.f50481h = 12;
                    return 12;
                }
                if (iM3 == 125) {
                    if (i11 == 5) {
                        throw O("Expected name");
                    }
                    this.f50481h = 2;
                    return 2;
                }
                a();
                this.f50477d--;
                if (!h((char) iM3)) {
                    throw O("Expected name");
                }
                this.f50481h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iM4 = m(true);
                if (iM4 != 58) {
                    if (iM4 != 61) {
                        throw O("Expected ':'");
                    }
                    a();
                    if (this.f50477d < this.f50478e || d(1)) {
                        char[] cArr = this.f50476c;
                        int i12 = this.f50477d;
                        if (cArr[i12] == '>') {
                            this.f50477d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f50475b) {
                    b();
                }
                this.f50485l[this.f50486m - 1] = 7;
            } else if (i11 == 7) {
                if (m(false) == -1) {
                    this.f50481h = 17;
                    return 17;
                }
                a();
                this.f50477d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM5 = m(true);
        if (iM5 == 34) {
            this.f50481h = 9;
            return 9;
        }
        if (iM5 == 39) {
            a();
            this.f50481h = 8;
            return 8;
        }
        if (iM5 != 44 && iM5 != 59) {
            if (iM5 == 91) {
                this.f50481h = 3;
                return 3;
            }
            if (iM5 != 93) {
                if (iM5 == 123) {
                    this.f50481h = 1;
                    return 1;
                }
                this.f50477d--;
                int iT = t();
                if (iT != 0) {
                    return iT;
                }
                int iU = u();
                if (iU != 0) {
                    return iU;
                }
                if (!h(this.f50476c[this.f50477d])) {
                    throw O("Expected value");
                }
                a();
                this.f50481h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f50481h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw O("Unexpected value");
        }
        a();
        this.f50477d--;
        this.f50481h = 7;
        return 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f50481h = 0;
        this.f50485l[0] = 8;
        this.f50486m = 1;
        this.f50474a.close();
    }

    public String f() {
        return e(true);
    }

    public final boolean g() {
        return this.f50475b;
    }

    public boolean hasNext() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        return (iC == 2 || iC == 4 || iC == 17) ? false : true;
    }

    String i() {
        return " at line " + (this.f50479f + 1) + " column " + ((this.f50477d - this.f50480g) + 1) + " path " + H();
    }

    public String j2() throws IOException {
        String str;
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 10) {
            str = r();
        } else if (iC == 8) {
            str = p('\'');
        } else if (iC == 9) {
            str = p('\"');
        } else if (iC == 11) {
            str = this.f50484k;
            this.f50484k = null;
        } else if (iC == 15) {
            str = Long.toString(this.f50482i);
        } else {
            if (iC != 16) {
                throw new IllegalStateException("Expected a string but was " + s() + i());
            }
            str = new String(this.f50476c, this.f50477d, this.f50483j);
            this.f50477d += this.f50483j;
        }
        this.f50481h = 0;
        int[] iArr = this.f50488o;
        int i10 = this.f50486m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public boolean k() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 5) {
            this.f50481h = 0;
            int[] iArr = this.f50488o;
            int i10 = this.f50486m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iC == 6) {
            this.f50481h = 0;
            int[] iArr2 = this.f50488o;
            int i11 = this.f50486m - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + s() + i());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void k0() throws IOException {
        int i10 = 0;
        do {
            int iC = this.f50481h;
            if (iC == 0) {
                iC = c();
            }
            switch (iC) {
                case 1:
                    x(3);
                    i10++;
                    this.f50481h = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f50487n[this.f50486m - 1] = null;
                    }
                    this.f50486m--;
                    i10--;
                    this.f50481h = 0;
                    break;
                case 3:
                    x(1);
                    i10++;
                    this.f50481h = 0;
                    break;
                case 4:
                    this.f50486m--;
                    i10--;
                    this.f50481h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f50481h = 0;
                    break;
                case 8:
                    F('\'');
                    this.f50481h = 0;
                    break;
                case 9:
                    F('\"');
                    this.f50481h = 0;
                    break;
                case 10:
                    L();
                    this.f50481h = 0;
                    break;
                case 12:
                    F('\'');
                    if (i10 == 0) {
                        this.f50487n[this.f50486m - 1] = "<skipped>";
                    }
                    this.f50481h = 0;
                    break;
                case 13:
                    F('\"');
                    if (i10 == 0) {
                        this.f50487n[this.f50486m - 1] = "<skipped>";
                    }
                    this.f50481h = 0;
                    break;
                case 14:
                    L();
                    if (i10 == 0) {
                        this.f50487n[this.f50486m - 1] = "<skipped>";
                    }
                    this.f50481h = 0;
                    break;
                case 16:
                    this.f50477d += this.f50483j;
                    this.f50481h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f50488o;
        int i11 = this.f50486m - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public double nextDouble() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f50481h = 0;
            int[] iArr = this.f50488o;
            int i10 = this.f50486m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f50482i;
        }
        if (iC == 16) {
            this.f50484k = new String(this.f50476c, this.f50477d, this.f50483j);
            this.f50477d += this.f50483j;
        } else if (iC == 8 || iC == 9) {
            this.f50484k = p(iC == 8 ? '\'' : '\"');
        } else if (iC == 10) {
            this.f50484k = r();
        } else if (iC != 11) {
            throw new IllegalStateException("Expected a double but was " + s() + i());
        }
        this.f50481h = 11;
        double d10 = Double.parseDouble(this.f50484k);
        if (!this.f50475b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + i());
        }
        this.f50484k = null;
        this.f50481h = 0;
        int[] iArr2 = this.f50488o;
        int i11 = this.f50486m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int nextInt() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            long j10 = this.f50482i;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f50481h = 0;
                int[] iArr = this.f50488o;
                int i11 = this.f50486m - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f50482i + i());
        }
        if (iC == 16) {
            this.f50484k = new String(this.f50476c, this.f50477d, this.f50483j);
            this.f50477d += this.f50483j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected an int but was " + s() + i());
            }
            if (iC == 10) {
                this.f50484k = r();
            } else {
                this.f50484k = p(iC == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f50484k);
                this.f50481h = 0;
                int[] iArr2 = this.f50488o;
                int i13 = this.f50486m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f50481h = 11;
        double d10 = Double.parseDouble(this.f50484k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f50484k + i());
        }
        this.f50484k = null;
        this.f50481h = 0;
        int[] iArr3 = this.f50488o;
        int i15 = this.f50486m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 15) {
            this.f50481h = 0;
            int[] iArr = this.f50488o;
            int i10 = this.f50486m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f50482i;
        }
        if (iC == 16) {
            this.f50484k = new String(this.f50476c, this.f50477d, this.f50483j);
            this.f50477d += this.f50483j;
        } else {
            if (iC != 8 && iC != 9 && iC != 10) {
                throw new IllegalStateException("Expected a long but was " + s() + i());
            }
            if (iC == 10) {
                this.f50484k = r();
            } else {
                this.f50484k = p(iC == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f50484k);
                this.f50481h = 0;
                int[] iArr2 = this.f50488o;
                int i11 = this.f50486m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f50481h = 11;
        double d10 = Double.parseDouble(this.f50484k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f50484k + i());
        }
        this.f50484k = null;
        this.f50481h = 0;
        int[] iArr3 = this.f50488o;
        int i12 = this.f50486m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public void o() throws IOException {
        int iC = this.f50481h;
        if (iC == 0) {
            iC = c();
        }
        if (iC == 7) {
            this.f50481h = 0;
            int[] iArr = this.f50488o;
            int i10 = this.f50486m - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + s() + i());
    }

    public b s() throws IOException {
        int iC = this.f50481h;
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
        return getClass().getSimpleName() + i();
    }
}
