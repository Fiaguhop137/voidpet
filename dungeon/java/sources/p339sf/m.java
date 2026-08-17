package p339sf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p375uf.e;
import p465zf.c;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f54009j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f54010k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f54011l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f54012m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f54013n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f54017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f54018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f54019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f54020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f54021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f54022i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f54023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f54024b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f54026d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f54028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f54029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f54030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f54031i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f54025c = 253402300799999L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f54027e = "/";

        private final a c(String str, boolean z10) {
            String strE = p375uf.a.e(str);
            if (strE != null) {
                this.f54026d = strE;
                this.f54031i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final m a() {
            String str = this.f54023a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f54024b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f54025c;
            String str3 = this.f54026d;
            if (str3 != null) {
                return new m(str, str2, j10, str3, this.f54027e, this.f54028f, this.f54029g, this.f54030h, this.f54031i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final a b(String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            return c(domain, false);
        }

        public final a d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.b(StringsKt.f1(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f54023a = name;
            return this;
        }

        public final a e(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.b(StringsKt.f1(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f54024b = value;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (Intrinsics.b(str, str2)) {
                return true;
            }
            return StringsKt.y(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !e.i(str);
        }

        private final String f(String str) {
            if (StringsKt.y(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = p375uf.a.e(StringsKt.A0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = m.f54013n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iH0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(m.f54013n).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f54012m).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iH0 == -1 && matcher.usePattern(m.f54011l).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f54011l.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iH0 = StringsKt.h0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f54010k).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iH0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f55642f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iH0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").d(str)) {
                    return StringsKt.O(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(u url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final m d(long j10, u url, String setCookie) {
            long j11;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iR = e.r(setCookie, ';', 0, 0, 6, null);
            int iR2 = e.r(setCookie, '=', 0, iR, 2, null);
            m mVar = null;
            if (iR2 == iR) {
                return null;
            }
            String strA0 = e.a0(setCookie, 0, iR2, 1, null);
            if (strA0.length() == 0 || e.y(strA0) != -1) {
                return null;
            }
            String strZ = e.Z(setCookie, iR2 + 1, iR);
            if (e.y(strZ) != -1) {
                return null;
            }
            int i10 = iR + 1;
            int length = setCookie.length();
            String strF = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iP = e.p(setCookie, ';', i10, length);
                int iP2 = e.p(setCookie, '=', i10, iP);
                String strZ2 = e.Z(setCookie, i10, iP2);
                String strZ3 = iP2 < iP ? e.Z(setCookie, iP2 + 1, iP) : "";
                m mVar2 = mVar;
                if (StringsKt.z(strZ2, "expires", true)) {
                    try {
                        jG = g(strZ3, 0, strZ3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.z(strZ2, "max-age", true)) {
                    jH = h(strZ3);
                    z11 = true;
                } else if (StringsKt.z(strZ2, "domain", true)) {
                    strF = f(strZ3);
                    z13 = false;
                } else if (StringsKt.z(strZ2, "path", true)) {
                    str = strZ3;
                } else if (StringsKt.z(strZ2, "secure", true)) {
                    z12 = true;
                } else if (StringsKt.z(strZ2, "httponly", true)) {
                    z10 = true;
                }
                i10 = iP + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strH = url.h();
            if (strF == null) {
                strF = strH;
            } else if (!b(strH, strF)) {
                return mVar3;
            }
            if (strH.length() != strF.length() && PublicSuffixDatabase.INSTANCE.c().c(strF) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !StringsKt.O(str, "/", false, 2, mVar3)) {
                String strD = url.d();
                int iM0 = StringsKt.m0(strD, '/', 0, false, 6, null);
                if (iM0 != 0) {
                    strSubstring = strD.substring(0, iM0);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strA0, strZ, j11, strF, str, z12, z10, z11, z13, null);
        }

        public final List e(u url, t headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List listN = headers.n("Set-Cookie");
            int size = listN.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m mVarC = c(url, (String) listN.get(i10));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.l();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f54014a = str;
        this.f54015b = str2;
        this.f54016c = j10;
        this.f54017d = str3;
        this.f54018e = str4;
        this.f54019f = z10;
        this.f54020g = z11;
        this.f54021h = z12;
        this.f54022i = z13;
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String a() {
        return this.f54014a;
    }

    public final String b() {
        return this.f54015b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.b(mVar.f54014a, this.f54014a) && Intrinsics.b(mVar.f54015b, this.f54015b) && mVar.f54016c == this.f54016c && Intrinsics.b(mVar.f54017d, this.f54017d) && Intrinsics.b(mVar.f54018e, this.f54018e) && mVar.f54019f == this.f54019f && mVar.f54020g == this.f54020g && mVar.f54021h == this.f54021h && mVar.f54022i == this.f54022i;
    }

    public final String g() {
        return this.f54014a;
    }

    public final String h(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f54014a);
        sb2.append('=');
        sb2.append(this.f54015b);
        if (this.f54021h) {
            if (this.f54016c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(c.b(new Date(this.f54016c)));
            }
        }
        if (!this.f54022i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f54017d);
        }
        sb2.append("; path=");
        sb2.append(this.f54018e);
        if (this.f54019f) {
            sb2.append("; secure");
        }
        if (this.f54020g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f54014a.hashCode()) * 31) + this.f54015b.hashCode()) * 31) + Long.hashCode(this.f54016c)) * 31) + this.f54017d.hashCode()) * 31) + this.f54018e.hashCode()) * 31) + Boolean.hashCode(this.f54019f)) * 31) + Boolean.hashCode(this.f54020g)) * 31) + Boolean.hashCode(this.f54021h)) * 31) + Boolean.hashCode(this.f54022i);
    }

    public final String i() {
        return this.f54015b;
    }

    public String toString() {
        return h(false);
    }
}
