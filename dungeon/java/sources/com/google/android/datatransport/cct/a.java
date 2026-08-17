package com.google.android.datatransport.cct;

import N7.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f31567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f31568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f31569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f31570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f31571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f31572h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31574b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f31567c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f31568d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f31569e = strA3;
        f31570f = Collections.unmodifiableSet(new HashSet(Arrays.asList(L7.c.b("proto"), L7.c.b("json"))));
        f31571g = new a(strA, null);
        f31572h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f31573a = str;
        this.f31574b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // N7.g
    public Set a() {
        return f31570f;
    }

    public byte[] b() {
        String str = this.f31574b;
        if (str == null && this.f31573a == null) {
            return null;
        }
        String str2 = this.f31573a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f31574b;
    }

    public String e() {
        return this.f31573a;
    }

    @Override // N7.f
    public byte[] getExtras() {
        return b();
    }

    @Override // N7.f
    public String getName() {
        return "cct";
    }
}
