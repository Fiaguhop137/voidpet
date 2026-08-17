package p022b3;

import B9.c;
import U1.AbstractC1459a;
import U1.AbstractC1468j;
import U1.AbstractC1477t;
import U1.F;
import U1.S;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f26214c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f26215d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f26216a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f26217b = new StringBuilder();

    private void a(c cVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f26214c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) AbstractC1459a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrH1 = S.h1(str, "\\.");
        String str2 = strArrH1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrH1.length > 1) {
            cVar.w((String[]) S.T0(strArrH1, 1, strArrH1.length));
        }
    }

    private static boolean b(F f10) {
        int iG = f10.g();
        int iJ = f10.j();
        byte[] bArrF = f10.f();
        if (iG + 2 > iJ) {
            return false;
        }
        int i10 = iG + 1;
        if (bArrF[iG] != 47) {
            return false;
        }
        int i11 = iG + 2;
        if (bArrF[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iJ) {
                f10.b0(iJ - f10.g());
                return true;
            }
            if (((char) bArrF[i11]) == '*' && ((char) bArrF[i12]) == '/') {
                i11 += 2;
                iJ = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(F f10) {
        char cK = k(f10, f10.g());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        f10.b0(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f26215d.matcher(c.e(str));
        if (!matcher.matches()) {
            AbstractC1477t.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC1459a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) AbstractC1459a.e(matcher.group(1))));
    }

    private static String f(F f10, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iG = f10.g();
        int iJ = f10.j();
        while (iG < iJ && !z10) {
            char c10 = (char) f10.f()[iG];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iG++;
                sb2.append(c10);
            }
        }
        f10.b0(iG - f10.g());
        return sb2.toString();
    }

    static String g(F f10, StringBuilder sb2) {
        n(f10);
        if (f10.a() == 0) {
            return null;
        }
        String strF = f(f10, sb2);
        if (!strF.isEmpty()) {
            return strF;
        }
        return "" + ((char) f10.L());
    }

    private static String h(F f10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iG = f10.g();
            String strG = g(f10, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                f10.a0(iG);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    private static String i(F f10, StringBuilder sb2) {
        n(f10);
        if (f10.a() < 5 || !"::cue".equals(f10.I(5))) {
            return null;
        }
        int iG = f10.g();
        String strG = g(f10, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            f10.a0(iG);
            return "";
        }
        String strL = "(".equals(strG) ? l(f10) : null;
        if (")".equals(g(f10, sb2))) {
            return strL;
        }
        return null;
    }

    private static void j(F f10, c cVar, StringBuilder sb2) {
        n(f10);
        String strF = f(f10, sb2);
        if (!strF.isEmpty() && ":".equals(g(f10, sb2))) {
            n(f10);
            String strH = h(f10, sb2);
            if (strH == null || strH.isEmpty()) {
                return;
            }
            int iG = f10.g();
            String strG = g(f10, sb2);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    f10.a0(iG);
                }
            }
            if ("color".equals(strF)) {
                cVar.q(AbstractC1468j.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                cVar.n(AbstractC1468j.b(strH));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z10 = false;
                }
                cVar.p(z10);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                cVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, cVar);
            }
        }
    }

    private static char k(F f10, int i10) {
        return (char) f10.f()[i10];
    }

    private static String l(F f10) {
        int iG = f10.g();
        int iJ = f10.j();
        boolean z10 = false;
        while (iG < iJ && !z10) {
            int i10 = iG + 1;
            z10 = ((char) f10.f()[iG]) == ')';
            iG = i10;
        }
        return f10.I((iG - 1) - f10.g()).trim();
    }

    static void m(F f10) {
        while (!TextUtils.isEmpty(f10.w())) {
        }
    }

    static void n(F f10) {
        while (true) {
            for (boolean z10 = true; f10.a() > 0 && z10; z10 = false) {
                if (!c(f10) && !b(f10)) {
                }
            }
            return;
        }
    }

    public List d(F f10) {
        this.f26217b.setLength(0);
        int iG = f10.g();
        m(f10);
        this.f26216a.Y(f10.f(), f10.g());
        this.f26216a.a0(iG);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f26216a, this.f26217b);
            if (strI == null || !"{".equals(g(this.f26216a, this.f26217b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iG2 = this.f26216a.g();
                String strG = g(this.f26216a, this.f26217b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f26216a.a0(iG2);
                    j(this.f26216a, cVar, this.f26217b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
