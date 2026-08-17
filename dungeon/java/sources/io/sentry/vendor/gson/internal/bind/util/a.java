package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f46648a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String b(Date date, boolean z10) {
        return c(date, z10, f46648a);
    }

    public static String c(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        e(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        e(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        e(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        e(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        e(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        e(sb2, gregorianCalendar.get(13), 2);
        if (z10) {
            sb2.append('.');
            e(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            e(sb2, iAbs, 2);
            sb2.append(':');
            e(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private static int d(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void e(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00de A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x018f A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:23:0x005a, B:25:0x006a, B:26:0x006c, B:28:0x0078, B:29:0x007b, B:31:0x0081, B:35:0x008b, B:40:0x009b, B:42:0x00a3, B:53:0x00d8, B:55:0x00de, B:57:0x00e4, B:81:0x0191, B:61:0x00ee, B:62:0x0109, B:63:0x010a, B:67:0x0126, B:69:0x0133, B:72:0x013c, B:74:0x015b, B:77:0x016a, B:78:0x018c, B:80:0x018f, B:66:0x0115, B:83:0x01c2, B:84:0x01c9, B:46:0x00bb, B:47:0x00be), top: B:95:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ee  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0115, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01ee, please report this as an issue */
    public static Date f(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i10;
        int i11;
        int i12;
        int iG;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i13 = index + 4;
            int iG2 = g(str, index, i13);
            if (a(str, i13, '-')) {
                i13 = index + 5;
            }
            int i14 = i13 + 2;
            int iG3 = g(str, i13, i14);
            if (a(str, i14, '-')) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int iG4 = g(str, i14, i15);
            boolean zA = a(str, i15, 'T');
            if (!zA && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iG2, iG3 - 1, iG4);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i16 = i14 + 5;
                int iG5 = g(str, i14 + 3, i16);
                if (a(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                int iG6 = g(str, i16, i17);
                if (a(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() <= i17 || (cCharAt2 = str.charAt(i17)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i15 = i17;
                    i10 = iG5;
                    i11 = iG6;
                } else {
                    int i18 = i17 + 2;
                    iG = g(str, i17, i18);
                    if (iG > 59 && iG < 63) {
                        iG = 59;
                    }
                    if (a(str, i18, '.')) {
                        int i19 = i17 + 3;
                        int iD = d(str, i17 + 4);
                        int iMin = Math.min(iD, i17 + 6);
                        int iG7 = g(str, i19, iMin);
                        int i20 = iMin - i19;
                        if (i20 == 1) {
                            iG7 *= 100;
                        } else if (i20 == 2) {
                            iG7 *= 10;
                        }
                        i10 = iG5;
                        i15 = iD;
                        i11 = iG6;
                        i12 = iG7;
                    } else {
                        i10 = iG5;
                        i15 = i18;
                        i11 = iG6;
                        i12 = 0;
                    }
                }
                if (str.length() > i15) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i15);
                if (cCharAt == 'Z') {
                    timeZone = f46648a;
                    length = i15 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i15);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i15 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = f46648a;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iG2);
                gregorianCalendar2.set(2, iG3 - 1);
                gregorianCalendar2.set(5, iG4);
                gregorianCalendar2.set(11, i10);
                gregorianCalendar2.set(12, i11);
                gregorianCalendar2.set(13, iG);
                gregorianCalendar2.set(14, i12);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i10 = 0;
            i11 = 0;
            i12 = 0;
            iG = 0;
            if (str.length() > i15) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i15);
            if (cCharAt == 'Z') {
                timeZone = f46648a;
                length = i15 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i15);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i15 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = f46648a;
                } else {
                    timeZone = f46648a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iG2);
            gregorianCalendar3.set(2, iG3 - 1);
            gregorianCalendar3.set(5, iG4);
            gregorianCalendar3.set(11, i10);
            gregorianCalendar3.set(12, i11);
            gregorianCalendar3.set(13, iG);
            gregorianCalendar3.set(14, i12);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e12) {
            e = e12;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static int g(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
