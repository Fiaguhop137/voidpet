package p022b3;

import R1.z;
import U1.F;
import U1.S;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f26264a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(F f10) {
        String strW;
        while (true) {
            String strW2 = f10.w();
            if (strW2 == null) {
                return null;
            }
            if (f26264a.matcher(strW2).matches()) {
                do {
                    strW = f10.w();
                    if (strW == null) {
                        break;
                    }
                } while (!strW.isEmpty());
            } else {
                Matcher matcher = e.f26238a.matcher(strW2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(F f10) {
        String strW = f10.w();
        return strW != null && strW.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrI1 = S.i1(str, "\\.");
        long j10 = 0;
        for (String str2 : S.h1(strArrI1[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrI1.length == 2) {
            String strTrim = strArrI1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void e(F f10) throws z {
        int iG = f10.g();
        if (b(f10)) {
            return;
        }
        f10.a0(iG);
        throw z.a("Expected WEBVTT. Got " + f10.w(), null);
    }
}
