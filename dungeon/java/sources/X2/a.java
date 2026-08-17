package X2;

import C9.AbstractC0876t;
import S2.e;
import S2.s;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.InterfaceC1470l;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f15247d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f15248e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f15249a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f15250b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f15251c = new F();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private T1.a d(Spanned spanned, String str) {
        byte b10;
        byte b11;
        T1.a.b bVarO = new T1.a.b().o(spanned);
        if (str == null) {
            return bVarO.a();
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            bVarO.l(0);
        } else if (b10 == 3 || b10 == 4 || b10 == 5) {
            bVarO.l(2);
        } else {
            bVarO.l(1);
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            bVarO.i(2);
        } else if (b11 == 3 || b11 == 4 || b11 == 5) {
            bVarO.i(0);
        } else {
            bVarO.i(1);
        }
        return bVarO.k(f(bVarO.d())).h(f(bVarO.c()), 0).a();
    }

    private Charset e(F f10) {
        Charset charsetV = f10.V();
        return charsetV != null ? charsetV : StandardCharsets.UTF_8;
    }

    public static float f(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long g(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) AbstractC1459a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) AbstractC1459a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String h(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f15248e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // S2.s
    public void b(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC1470l interfaceC1470l) {
        long j10;
        String str;
        this.f15251c.Y(bArr, i10 + i11);
        this.f15251c.a0(i10);
        Charset charsetE = e(this.f15251c);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f11530a == -9223372036854775807L || !bVar.f11531b) ? null : new ArrayList();
        while (true) {
            String strX = this.f15251c.x(charsetE);
            if (strX == null) {
                break;
            }
            if (!strX.isEmpty()) {
                try {
                    Integer.parseInt(strX);
                    String strX2 = this.f15251c.x(charsetE);
                    if (strX2 == null) {
                        AbstractC1477t.h("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f15247d.matcher(strX2);
                    if (matcher.matches()) {
                        long jG = g(matcher, 1);
                        long jG2 = g(matcher, 6);
                        int i12 = 0;
                        this.f15249a.setLength(0);
                        this.f15250b.clear();
                        String strX3 = this.f15251c.x(charsetE);
                        while (!TextUtils.isEmpty(strX3)) {
                            if (this.f15249a.length() > 0) {
                                this.f15249a.append("<br>");
                            }
                            this.f15249a.append(h(strX3, this.f15250b));
                            strX3 = this.f15251c.x(charsetE);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f15249a.toString());
                        while (true) {
                            if (i12 >= this.f15250b.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f15250b.get(i12);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        j10 = j11;
                        long j12 = bVar.f11530a;
                        if (j12 == j10 || jG2 >= j12) {
                            interfaceC1470l.accept(new e(AbstractC0876t.x(d(spannedFromHtml, str)), jG, jG2 - jG));
                        } else if (arrayList != null) {
                            arrayList.add(new e(AbstractC0876t.x(d(spannedFromHtml, str)), jG, jG2 - jG));
                        }
                    } else {
                        j10 = j11;
                        AbstractC1477t.h("SubripParser", "Skipping invalid timing: " + strX2);
                    }
                    j11 = j10;
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    AbstractC1477t.h("SubripParser", "Skipping invalid index: " + strX);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC1470l.accept((e) it.next());
            }
        }
    }

    @Override // S2.s
    public int c() {
        return 1;
    }
}
