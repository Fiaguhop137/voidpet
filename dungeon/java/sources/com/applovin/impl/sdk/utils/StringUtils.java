package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.applovin.impl.p1;
import com.applovin.impl.q2;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p111g2.h;
import p184k4.Y;

/* JADX INFO: loaded from: classes.dex */
public abstract class StringUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f28349a = "0123456789abcdef".toCharArray();

    public static String a(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            String hexString = toHexString(messageDigest.digest());
            return num.intValue() > 0 ? hexString.substring(0, Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z10) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            spannable.setSpan(clickableSpan, iStart, iEnd, 33);
            if (z10) {
                spannable.setSpan(new StyleSpan(1), iStart, iEnd, 256);
            }
        }
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter(str2, str3);
        return builderBuildUpon.build().toString();
    }

    public static String appendQueryParameters(String str, Map<String, String> map) {
        return appendQueryParameters(str, map, false);
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z10) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (z10) {
            TreeMap treeMap = new TreeMap(new q2());
            treeMap.putAll(map);
            map = treeMap;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public static int compare(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String digitsOnlyVersionString = toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = toDigitsOnlyVersionString(str2);
        try {
            String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
            int i10 = 0;
            while (i10 < iMax) {
                String str3 = i10 < strArrSplit.length ? strArrSplit[i10] : "0";
                String str4 = i10 < strArrSplit2.length ? strArrSplit2[i10] : "0";
                int i11 = Integer.parseInt(str3);
                int i12 = Integer.parseInt(str4);
                if (i11 < i12) {
                    return -1;
                }
                if (i11 > i12) {
                    return 1;
                }
                i10++;
            }
            return 0;
        } catch (Throwable th) {
            p1.c("StringUtils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i10) {
        return createSpannedString(str, i10, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11) {
        return createSpannedString(str, i10, i11, 0);
    }

    public static SpannedString createSpannedString(String str, int i10, int i11, int i12) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i10), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i11, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i12), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static String defaultIfEmpty(String str, String str2) {
        return isValidString(str) ? str : str2;
    }

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String encodeUriString(String str) {
        return isValidString(str) ? Uri.encode(str) : "";
    }

    public static Boolean endsWith(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        return uri.getHost() != null ? uri.getHost() : "";
    }

    public static String getHostAndPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        return emptyIfNull(uri.getHost()) + emptyIfNull(uri.getPath());
    }

    public static List<String> getRegexMatches(Matcher matcher, int i10) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group(i10);
            if (isValidString(strGroup)) {
                arrayList.add(strGroup);
            }
        }
        return arrayList;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char cCharAt = str.charAt(0);
        int i10 = (cCharAt == '-' || cCharAt == '+') ? 1 : 0;
        int length = str.length();
        if (i10 == 1 && length == 1) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(charSequence);
        }
        sb2.delete(sb2.length() - charSequence.length(), sb2.length());
        return sb2.toString();
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static String normalizedVersionString(String str) {
        return normalizedVersionString(str, str.split("\\.").length);
    }

    public static String normalizedVersionString(String str, int i10) {
        String[] strArrSplit = toDigitsOnlyVersionString(str).split("\\.");
        if (strArrSplit.length == i10) {
            return Y.a(".", strArrSplit);
        }
        if (strArrSplit.length > i10) {
            return h.a(".", new ArrayList(Arrays.asList(strArrSplit)).subList(0, i10));
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
        arrayList.addAll(Collections.nCopies(i10 - arrayList.size(), "0"));
        return h.a(".", arrayList);
    }

    public static float parseFloat(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (Throwable unused) {
            return f10;
        }
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static int parseInt(String str, int i10) {
        return isNumeric(str) ? Integer.parseInt(str) : i10;
    }

    public static long parseLong(String str, long j10) {
        return isNumeric(str) ? Long.parseLong(str) : j10;
    }

    public static String prefixToIndex(int i10, String str) {
        return TextUtils.isEmpty(str) ? str : str.substring(0, Math.min(i10, str.length()));
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 == null) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        int iIndexOf = sb2.indexOf(str2);
        while (iIndexOf != -1) {
            sb2.replace(iIndexOf, str2.length() + iIndexOf, str3);
            iIndexOf = sb2.indexOf(str2, str3.length() + iIndexOf);
        }
        return sb2.toString();
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    public static void replaceAll(StringBuffer stringBuffer, String str, String str2) {
        if (TextUtils.isEmpty(stringBuffer) || TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        int iIndexOf = stringBuffer.indexOf(str);
        while (iIndexOf != -1) {
            stringBuffer.replace(iIndexOf, str.length() + iIndexOf, str2);
            iIndexOf = stringBuffer.indexOf(str, str2.length() + iIndexOf);
        }
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\.");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (isValidString(str2)) {
                for (String str3 : str2.split("[^0-9]+")) {
                    if (isValidString(str3)) {
                        arrayList.add(str3);
                        break;
                    }
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String toFullSHA1Hash(String str) {
        return a(str, -1);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("No data specified");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            char[] cArr2 = f28349a;
            byte b10 = bArr[i10];
            cArr[i11] = cArr2[(b10 & 240) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String toHttpsString(String str) {
        return str.startsWith("http://") ? str.replace("http://", "https://") : str;
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb2.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    String strSubstring = str2.substring(0, 1);
                    Locale locale = Locale.ENGLISH;
                    sb2.append(strSubstring.toUpperCase(locale));
                    sb2.append(str2.substring(1).toLowerCase(locale));
                }
                sb2.append(" ");
            }
        }
        return sb2.deleteCharAt(sb2.length() - 1).toString();
    }

    public static String toShortSHA1Hash(String str) {
        return a(str, 16);
    }

    public static int toVersionCode(String str) {
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                p1.c("StringUtils", "Version number components cannot be longer than two digits -> ".concat(str), null);
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i10 * 100) + 99 : i10;
    }

    public static double tryParseDouble(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            p1.c("StringUtils", "Failed to parse double from String: " + str, th);
            return d10;
        }
    }
}
