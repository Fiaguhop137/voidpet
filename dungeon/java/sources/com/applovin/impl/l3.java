package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AxonUserData;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f28113a = Pattern.compile("^[a-f0-9]{64}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f28114b = Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f28115c = Collections.unmodifiableSet(new HashSet(Arrays.asList("1", "7", "20", "27", "30", "31", "32", "33", "34", "36", "39", "40", "41", "43", "44", "45", "46", "47", "48", "49", "51", "52", "53", "54", "55", "56", "57", "58", "60", "61", "62", "63", "64", "65", "66", "77", "81", "82", "84", "86", "90", "91", "92", "93", "94", "95", "98", "211", "212", "213", "216", "218", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "260", "261", "262", "263", "264", "265", "266", "267", "268", "269", "290", "291", "297", "298", "299", "345", "350", "351", "352", "353", "354", "355", "356", "357", "358", "359", "370", "371", "372", "373", "374", "375", "376", "377", "378", "379", "380", "381", "382", "385", "386", "387", "389", "420", "421", "423", "500", "501", "502", "503", "504", "505", "506", "507", "508", "509", "590", "591", "592", "593", "594", "595", "596", "597", "598", "599", "670", "672", "673", "674", "675", "676", "677", "678", "679", "680", "681", "682", "683", "685", "686", "687", "688", "689", "690", "691", "692", "850", "852", "853", "855", "856", "872", "880", "886", "960", "961", "962", "963", "964", "965", "966", "967", "968", "970", "971", "972", "973", "974", "975", "976", "977", "992", "993", "994", "995", "996", "998", "800", "881", "882", "883", "979")));

    public static String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            if (c10 >= '0' && c10 <= '9') {
                sb2.append(c10);
            }
        }
        String strReplaceFirst = sb2.toString().replaceFirst("^0+", "");
        if (strReplaceFirst.length() < 8 || strReplaceFirst.length() > 15) {
            return null;
        }
        return strReplaceFirst;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0171 A[EDGE_INSN: B:82:0x0171->B:83:0x0172 BREAK  A[LOOP:0: B:74:0x0150->B:81:0x016e]] */
    public static HashMap a(AxonUserData axonUserData) {
        String strTrim;
        String lowerCase;
        Integer numValueOf;
        String strA;
        String strB;
        String str;
        HashMap map = new HashMap();
        String userId = axonUserData.getUserId();
        if (userId == null) {
            strTrim = null;
        } else {
            strTrim = userId.trim();
            if (strTrim.isEmpty()) {
                strTrim = null;
            }
        }
        CollectionUtils.putStringIfValid("user_id", strTrim, map);
        String email = axonUserData.getEmail();
        int i10 = 1;
        if (email != null) {
            String lowerCase2 = email.trim().toLowerCase(Locale.US);
            if (lowerCase2 == null ? false : f28113a.matcher(lowerCase2).matches()) {
                map.put("email", lowerCase2);
                map.put("email_v2", lowerCase2);
                map.put("is_email_pre_hashed", Boolean.TRUE);
            } else if (f28114b.matcher(lowerCase2).matches() && (strB = b(lowerCase2)) != null) {
                map.put("email", strB);
                map.put("email_domain", lowerCase2.substring(lowerCase2.indexOf(64) + 1));
                map.put("is_email_pre_hashed", Boolean.FALSE);
                String[] strArrSplit = lowerCase2.split("@", -1);
                if (strArrSplit.length != 2) {
                    str = lowerCase2;
                } else {
                    String str2 = strArrSplit[1];
                    if ("gmail.com".equals(str2) || "googlemail.com".equals(str2)) {
                        String strSubstring = strArrSplit[0];
                        int iIndexOf = strSubstring.indexOf(43);
                        if (iIndexOf >= 0) {
                            strSubstring = strSubstring.substring(0, iIndexOf);
                        }
                        String strReplace = strSubstring.replace(".", "");
                        if (strReplace.isEmpty()) {
                            str = null;
                        } else {
                            str = strReplace + "@" + str2;
                        }
                    } else {
                        str = lowerCase2;
                    }
                }
                if (str != null) {
                    boolean zEquals = lowerCase2.equals(str);
                    boolean z10 = !zEquals;
                    if (!zEquals) {
                        strB = b(str);
                    }
                    if (strB != null) {
                        map.put("email_v2", strB);
                        map.put("is_gmail_normalized", Boolean.valueOf(z10));
                    }
                }
            }
        }
        String phone = axonUserData.getPhone();
        if (phone != null) {
            lowerCase = phone.trim().toLowerCase(Locale.US);
            if (!(lowerCase == null ? false : f28113a.matcher(lowerCase).matches())) {
                String strA2 = a(phone);
                if (strA2 == null) {
                    lowerCase = null;
                } else {
                    lowerCase = b(strA2);
                }
            }
        } else {
            lowerCase = null;
        }
        CollectionUtils.putStringIfValid("phone", lowerCase, map);
        if (phone == null) {
            numValueOf = null;
            break;
        }
        String lowerCase3 = phone.trim().toLowerCase(Locale.US);
        if (!(lowerCase3 == null ? false : f28113a.matcher(lowerCase3).matches()) && lowerCase3.startsWith("+") && (strA = a(phone)) != null) {
            while (true) {
                if (i10 > 3) {
                    numValueOf = null;
                    break;
                }
                if (strA.length() >= i10) {
                    String strSubstring2 = strA.substring(0, i10);
                    if (f28115c.contains(strSubstring2)) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strSubstring2));
                        break;
                    }
                }
                i10++;
            }
        } else {
            numValueOf = null;
            break;
        }
        if (numValueOf != null) {
            map.put("phone_country_code", numValueOf);
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static String b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
