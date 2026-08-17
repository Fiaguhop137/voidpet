package p339sf;

import If.C1106h;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p375uf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f54059k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f54060l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f54065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f54066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f54067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f54068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f54069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f54070j;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0669a f54071i = new C0669a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f54072a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f54075d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f54077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f54078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f54079h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f54073b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f54074c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f54076e = -1;

        /* JADX INFO: renamed from: sf.u$a$a, reason: collision with other inner class name */
        public static final class C0669a {
            private C0669a() {
            }

            public /* synthetic */ C0669a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(b.b(u.f54059k, str, i10, i11, "", false, false, false, false, null, 248, null));
                    if (1 > i12 || i12 >= 65536) {
                        return -1;
                    }
                    return i12;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((Intrinsics.e(cCharAt, 97) >= 0 && Intrinsics.e(cCharAt, 122) <= 0) || (Intrinsics.e(cCharAt, 65) >= 0 && Intrinsics.e(cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i10;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f54077f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f54076e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f54059k;
            String str = this.f54072a;
            Intrinsics.c(str);
            return bVar.c(str);
        }

        private final boolean f(String str) {
            return Intrinsics.b(str, ".") || StringsKt.z(str, "%2e", true);
        }

        private final boolean g(String str) {
            return Intrinsics.b(str, "..") || StringsKt.z(str, "%2e.", true) || StringsKt.z(str, ".%2e", true) || StringsKt.z(str, "%2e%2e", true);
        }

        private final void j() {
            List list = this.f54077f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f54077f.isEmpty()) {
                this.f54077f.add("");
            } else {
                List list2 = this.f54077f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void l(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = b.b(u.f54059k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (f(strB)) {
                return;
            }
            if (g(strB)) {
                j();
                return;
            }
            List list = this.f54077f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f54077f;
                list2.set(list2.size() - 1, strB);
            } else {
                this.f54077f.add(strB);
            }
            if (z10) {
                this.f54077f.add("");
            }
        }

        private final void n(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f54077f.clear();
                this.f54077f.add("");
                i10++;
            } else {
                List list = this.f54077f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iQ = e.q(str, "/\\", i12, i11);
                boolean z10 = iQ < i11;
                str = str;
                l(str, i12, iQ, z10, true);
                i12 = z10 ? iQ + 1 : iQ;
            }
        }

        public final u a() {
            ArrayList arrayList;
            String str = this.f54072a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f54059k;
            String strH = b.h(bVar, this.f54073b, 0, 0, false, 7, null);
            String strH2 = b.h(bVar, this.f54074c, 0, 0, false, 7, null);
            String str2 = this.f54075d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            List list = this.f54077f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.h(u.f54059k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f54078g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.w(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? b.h(u.f54059k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f54079h;
            return new u(str, strH, strH2, str2, iB, arrayList2, arrayList, str4 != null ? b.h(u.f54059k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a c(String str) {
            b bVar;
            String strB;
            this.f54078g = (str == null || (strB = b.b((bVar = u.f54059k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : bVar.j(strB);
            return this;
        }

        public final List d() {
            return this.f54077f;
        }

        public final a e(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strE = p375uf.a.e(b.h(u.f54059k, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f54075d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a h(u uVar, String str) {
            String str2;
            int iQ;
            int i10;
            boolean z10;
            int i11;
            int i12;
            int i13;
            char c10;
            int i14;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iA = e.A(input, 0, 0, 3, null);
            int iC = e.C(input, iA, 0, 2, null);
            C0669a c0669a = f54071i;
            int iG = c0669a.g(input, iA, iC);
            String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z11 = true;
            int i15 = -1;
            if (iG != -1) {
                if (StringsKt.L(input, "https:", iA, true)) {
                    this.f54072a = "https";
                    iA += 6;
                } else {
                    if (!StringsKt.L(input, "http:", iA, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f54072a = "http";
                    iA += 5;
                }
            } else {
                if (uVar == null) {
                    if (input.length() > 6) {
                        str2 = StringsKt.k1(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f54072a = uVar.q();
            }
            int iH = c0669a.h(input, iA, iC);
            int i16 = 63;
            int i17 = 35;
            if (iH >= 2 || uVar == null || !Intrinsics.b(uVar.q(), this.f54072a)) {
                int i18 = iA + iH;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iQ = e.q(input, "@/\\?#", i18, iC);
                    int iCharAt = iQ != iC ? input.charAt(iQ) : i15;
                    if (iCharAt == i15 || iCharAt == i17 || iCharAt == 47 || iCharAt == 92 || iCharAt == i16) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z12) {
                            z10 = z11;
                            i11 = i15;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f54074c);
                            sb3.append("%40");
                            input = str;
                            i12 = iQ;
                            sb3.append(b.b(u.f54059k, input, i18, iQ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f54074c = sb3.toString();
                        } else {
                            int iP = e.p(input, ':', i18, iQ);
                            b bVar = u.f54059k;
                            i11 = i15;
                            z10 = z11;
                            String strB = b.b(bVar, input, i18, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strB = this.f54073b + "%40" + strB;
                            }
                            this.f54073b = strB;
                            if (iP != iQ) {
                                i13 = iQ;
                                this.f54074c = b.b(bVar, str, iP + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                i13 = iQ;
                            }
                            input = str;
                            i12 = i13;
                            z13 = z10;
                        }
                        i18 = i12 + 1;
                        i15 = i11;
                        iC = iC;
                        str3 = str3;
                        z11 = z10;
                        i16 = 63;
                        i17 = 35;
                    }
                }
                i10 = iC;
                String str4 = str3;
                int i19 = i15;
                C0669a c0669a2 = f54071i;
                int iF = c0669a2.f(input, i18, iQ);
                int i20 = iF + 1;
                if (i20 < iQ) {
                    this.f54075d = p375uf.a.e(b.h(u.f54059k, input, i18, iF, false, 4, null));
                    int iE = c0669a2.e(input, i20, iQ);
                    this.f54076e = iE;
                    if (iE == i19) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i20, iQ);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str4);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    b bVar2 = u.f54059k;
                    this.f54075d = p375uf.a.e(b.h(bVar2, input, i18, iF, false, 4, null));
                    String str5 = this.f54072a;
                    Intrinsics.c(str5);
                    this.f54076e = bVar2.c(str5);
                }
                if (this.f54075d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i18, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str4);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iA = iQ;
            } else {
                this.f54073b = uVar.g();
                this.f54074c = uVar.c();
                this.f54075d = uVar.h();
                this.f54076e = uVar.m();
                this.f54077f.clear();
                this.f54077f.addAll(uVar.e());
                if (iA == iC || input.charAt(iA) == '#') {
                    c(uVar.f());
                }
                i10 = iC;
            }
            int i21 = i10;
            int iQ2 = e.q(input, "?#", iA, i21);
            n(input, iA, iQ2);
            if (iQ2 >= i21 || input.charAt(iQ2) != '?') {
                c10 = '#';
                i14 = iQ2;
            } else {
                c10 = '#';
                int iP2 = e.p(input, '#', iQ2, i21);
                b bVar3 = u.f54059k;
                this.f54078g = bVar3.j(b.b(bVar3, input, iQ2 + 1, iP2, " \"'<>#", true, false, true, false, null, 208, null));
                i14 = iP2;
            }
            if (i14 < i21 && input.charAt(i14) == c10) {
                this.f54079h = b.b(u.f54059k, input, i14 + 1, i21, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a i(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f54074c = b.b(u.f54059k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a k(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f54076e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a m() {
            String str = this.f54075d;
            this.f54075d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f54077f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f54077f;
                list.set(i10, b.b(u.f54059k, (String) list.get(i10), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f54078g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? b.b(u.f54059k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f54079h;
            this.f54079h = str3 != null ? b.b(u.f54059k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a o(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.z(scheme, "http", true)) {
                this.f54072a = "http";
                return this;
            }
            if (StringsKt.z(scheme, "https", true)) {
                this.f54072a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void p(String str) {
            this.f54079h = str;
        }

        public final void q(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f54074c = str;
        }

        public final void r(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f54073b = str;
        }

        public final void s(String str) {
            this.f54075d = str;
        }

        public final void t(int i10) {
            this.f54076e = i10;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f54072a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.f54073b.length() > 0 || this.f54074c.length() > 0) {
                sb2.append(this.f54073b);
                if (this.f54074c.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.f54074c);
                }
                sb2.append('@');
            }
            String str2 = this.f54075d;
            if (str2 != null) {
                Intrinsics.c(str2);
                if (StringsKt.T(str2, ':', false, 2, null)) {
                    sb2.append('[');
                    sb2.append(this.f54075d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f54075d);
                }
            }
            if (this.f54076e != -1 || this.f54072a != null) {
                int iB = b();
                String str3 = this.f54072a;
                if (str3 != null) {
                    b bVar = u.f54059k;
                    Intrinsics.c(str3);
                    if (iB != bVar.c(str3)) {
                        sb2.append(':');
                        sb2.append(iB);
                    }
                } else {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            b bVar2 = u.f54059k;
            bVar2.i(this.f54077f, sb2);
            if (this.f54078g != null) {
                sb2.append('?');
                List list = this.f54078g;
                Intrinsics.c(list);
                bVar2.k(list, sb2);
            }
            if (this.f54079h != null) {
                sb2.append('#');
                sb2.append(this.f54079h);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final void u(String str) {
            this.f54072a = str;
        }

        public final a v(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f54073b = b.b(u.f54059k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return bVar.a(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && e.I(str.charAt(i10 + 1)) != -1 && e.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        private final void l(C1106h c1106h, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            int iCharCount = i10;
            C1106h c1106h2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        c1106h.Z0(z10 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!StringsKt.T(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z10 && (!z11 || e(str, iCharCount, i11))))) {
                                c1106h.J0(iCodePointAt);
                            }
                        }
                        if (c1106h2 == null) {
                            c1106h2 = new C1106h();
                        }
                        if (charset == null || Intrinsics.b(charset, StandardCharsets.UTF_8)) {
                            c1106h2.J0(iCodePointAt);
                        } else {
                            c1106h2.y0(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c1106h2.z2()) {
                            byte b10 = c1106h2.readByte();
                            c1106h.writeByte(37);
                            c1106h.writeByte(u.f54060l[((b10 & 255) >> 4) & 15]);
                            c1106h.writeByte(u.f54060l[b10 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void m(C1106h c1106h, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I10 = e.I(str.charAt(i10 + 1));
                    int I11 = e.I(str.charAt(i12));
                    if (I10 == -1 || I11 == -1) {
                        c1106h.J0(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        c1106h.writeByte((I10 << 4) + I11);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    c1106h.writeByte(32);
                    i10++;
                } else {
                    c1106h.J0(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.T(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    C1106h c1106h = new C1106h();
                    c1106h.n1(str, i10, iCharCount);
                    l(c1106h, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return c1106h.x3();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.b(scheme, "http")) {
                return 80;
            }
            return Intrinsics.b(scheme, "https") ? 443 : -1;
        }

        public final u d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().h(null, str).a();
        }

        public final u f(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    C1106h c1106h = new C1106h();
                    c1106h.n1(str, i10, i12);
                    m(c1106h, str, i12, i11, z10);
                    return c1106h.x3();
                }
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void i(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append((String) list.get(i10));
            }
        }

        public final List j(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iG0 = StringsKt.g0(str2, '&', i10, false, 4, null);
                if (iG0 == -1) {
                    iG0 = str2.length();
                }
                int iG1 = StringsKt.g0(str2, '=', i10, false, 4, null);
                if (iG1 == -1 || iG1 > iG0) {
                    String strSubstring = str2.substring(i10, iG0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iG1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iG1 + 1, iG0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iG0 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            kotlin.ranges.b bVarR = kotlin.ranges.e.r(kotlin.ranges.e.t(0, list.size()), 2);
            int iG = bVarR.g();
            int iH = bVarR.h();
            int i10 = bVarR.i();
            if ((i10 <= 0 || iG > iH) && (i10 >= 0 || iH > iG)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iG);
                String str2 = (String) list.get(iG + 1);
                if (iG > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iG == iH) {
                    return;
                } else {
                    iG += i10;
                }
            }
        }
    }

    public u(String scheme, String username, String password, String host, int i10, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f54061a = scheme;
        this.f54062b = username;
        this.f54063c = password;
        this.f54064d = host;
        this.f54065e = i10;
        this.f54066f = pathSegments;
        this.f54067g = list;
        this.f54068h = str;
        this.f54069i = url;
        this.f54070j = Intrinsics.b(scheme, "https");
    }

    public static final u l(String str) {
        return f54059k.f(str);
    }

    public final String b() {
        if (this.f54068h == null) {
            return null;
        }
        String strSubstring = this.f54069i.substring(StringsKt.g0(this.f54069i, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.f54063c.length() == 0) {
            return "";
        }
        String strSubstring = this.f54069i.substring(StringsKt.g0(this.f54069i, ':', this.f54061a.length() + 3, false, 4, null) + 1, StringsKt.g0(this.f54069i, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iG0 = StringsKt.g0(this.f54069i, '/', this.f54061a.length() + 3, false, 4, null);
        String str = this.f54069i;
        String strSubstring = this.f54069i.substring(iG0, e.q(str, "?#", iG0, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iG0 = StringsKt.g0(this.f54069i, '/', this.f54061a.length() + 3, false, 4, null);
        String str = this.f54069i;
        int iQ = e.q(str, "?#", iG0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iG0 < iQ) {
            int i10 = iG0 + 1;
            int iP = e.p(this.f54069i, '/', i10, iQ);
            String strSubstring = this.f54069i.substring(i10, iP);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iG0 = iP;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && Intrinsics.b(((u) obj).f54069i, this.f54069i);
    }

    public final String f() {
        if (this.f54067g == null) {
            return null;
        }
        int iG0 = StringsKt.g0(this.f54069i, '?', 0, false, 6, null) + 1;
        String str = this.f54069i;
        String strSubstring = this.f54069i.substring(iG0, e.p(str, '#', iG0, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.f54062b.length() == 0) {
            return "";
        }
        int length = this.f54061a.length() + 3;
        String str = this.f54069i;
        String strSubstring = this.f54069i.substring(length, e.q(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String h() {
        return this.f54064d;
    }

    public int hashCode() {
        return this.f54069i.hashCode();
    }

    public final boolean i() {
        return this.f54070j;
    }

    public final a j() {
        a aVar = new a();
        aVar.u(this.f54061a);
        aVar.r(g());
        aVar.q(c());
        aVar.s(this.f54064d);
        aVar.t(this.f54065e != f54059k.c(this.f54061a) ? this.f54065e : -1);
        aVar.d().clear();
        aVar.d().addAll(e());
        aVar.c(f());
        aVar.p(b());
        return aVar;
    }

    public final a k(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int m() {
        return this.f54065e;
    }

    public final String n() {
        if (this.f54067g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f54059k.k(this.f54067g, sb2);
        return sb2.toString();
    }

    public final String o() {
        a aVarK = k("/...");
        Intrinsics.c(aVarK);
        return aVarK.v("").i("").a().toString();
    }

    public final u p(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarK = k(link);
        if (aVarK != null) {
            return aVarK.a();
        }
        return null;
    }

    public final String q() {
        return this.f54061a;
    }

    public final URI r() {
        String string = j().m().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL s() {
        try {
            return new URL(this.f54069i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f54069i;
    }
}
