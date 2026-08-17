package p181k1;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final m f47769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f47771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f47772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f47773h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f47774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f47776c;

    /* JADX INFO: renamed from: k1.a$a, reason: collision with other inner class name */
    public static final class C0558a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f47777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m f47779c;

        public C0558a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f47773h : a.f47772g;
        }

        private void c(boolean z10) {
            this.f47777a = z10;
            this.f47779c = a.f47769d;
            this.f47778b = 2;
        }

        public a a() {
            return (this.f47778b == 2 && this.f47779c == a.f47769d) ? b(this.f47777a) : new a(this.f47777a, this.f47778b, this.f47779c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f47780f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f47781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f47782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f47785e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f47780f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f47781a = charSequence;
            this.f47782b = z10;
            this.f47783c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f47780f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f47784d;
            do {
                int i11 = this.f47784d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f47781a;
                int i12 = i11 - 1;
                this.f47784d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f47785e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f47784d = i10;
            this.f47785e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f47784d;
                if (i10 >= this.f47783c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f47781a;
                this.f47784d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f47785e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f47784d;
            while (true) {
                int i11 = this.f47784d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f47781a;
                int i12 = i11 - 1;
                this.f47784d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f47785e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f47784d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f47781a;
                        int i14 = i13 - 1;
                        this.f47784d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f47785e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f47784d = i10;
            this.f47785e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f47784d;
            while (true) {
                int i11 = this.f47784d;
                if (i11 >= this.f47783c) {
                    this.f47784d = i10;
                    this.f47785e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f47781a;
                this.f47784d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f47785e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f47784d;
                        if (i12 >= this.f47783c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f47781a;
                        this.f47784d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f47785e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f47781a.charAt(this.f47784d - 1);
            this.f47785e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f47781a, this.f47784d);
                this.f47784d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f47784d--;
            byte bC = c(this.f47785e);
            if (!this.f47782b) {
                return bC;
            }
            char c10 = this.f47785e;
            if (c10 == '>') {
                return h();
            }
            return c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f47781a.charAt(this.f47784d);
            this.f47785e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f47781a, this.f47784d);
                this.f47784d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f47784d++;
            byte bC = c(this.f47785e);
            if (!this.f47782b) {
                return bC;
            }
            char c10 = this.f47785e;
            if (c10 == '<') {
                return i();
            }
            return c10 == '&' ? g() : bC;
        }

        int d() {
            this.f47784d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f47784d < this.f47783c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f47784d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f47784d = this.f47783c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f47784d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        m mVar = n.f47797c;
        f47769d = mVar;
        f47770e = Character.toString((char) 8206);
        f47771f = Character.toString((char) 8207);
        f47772g = new a(false, 2, mVar);
        f47773h = new a(true, 2, mVar);
    }

    a(boolean z10, int i10, m mVar) {
        this.f47774a = z10;
        this.f47775b = i10;
        this.f47776c = mVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0558a().a();
    }

    static boolean e(Locale locale) {
        return o.a(locale) == 1;
    }

    private String f(CharSequence charSequence, m mVar) {
        boolean zIsRtl = mVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f47774a && (zIsRtl || b(charSequence) == 1)) {
            return f47770e;
        }
        if (this.f47774a) {
            return (!zIsRtl || b(charSequence) == -1) ? f47771f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, m mVar) {
        boolean zIsRtl = mVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f47774a && (zIsRtl || a(charSequence) == 1)) {
            return f47770e;
        }
        if (this.f47774a) {
            return (!zIsRtl || a(charSequence) == -1) ? f47771f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f47775b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f47776c, true);
    }

    public CharSequence i(CharSequence charSequence, m mVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = mVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? n.f47796b : n.f47795a));
        }
        if (zIsRtl != this.f47774a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? n.f47796b : n.f47795a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f47776c, true);
    }

    public String k(String str, m mVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, mVar, z10).toString();
    }
}
