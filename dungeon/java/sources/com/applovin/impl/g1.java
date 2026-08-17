package com.applovin.impl;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f28031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f28032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f28033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONObject f28035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f28039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f28040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f28041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f28042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f2 f28043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f28044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f28045q;

    public g1(f1 f1Var) {
        this.f28029a = f1Var.f27999b;
        this.f28030b = f1Var.f27998a;
        this.f28031c = f1Var.f28001d;
        this.f28032d = f1Var.f28002e;
        this.f28033e = f1Var.f28003f;
        this.f28034f = f1Var.f28000c;
        this.f28035g = f1Var.f28004g;
        int i10 = f1Var.f28005h;
        this.f28036h = i10;
        this.f28037i = i10;
        this.f28038j = f1Var.f28006i;
        this.f28039k = f1Var.f28007j;
        this.f28040l = f1Var.f28008k;
        this.f28041m = f1Var.f28009l;
        this.f28042n = f1Var.f28010m;
        this.f28043o = f1Var.f28013p;
        this.f28044p = f1Var.f28011n;
        this.f28045q = f1Var.f28012o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Objects.equals(this.f28029a, g1Var.f28029a) && Objects.equals(this.f28031c, g1Var.f28031c) && Objects.equals(this.f28032d, g1Var.f28032d) && Objects.equals(this.f28034f, g1Var.f28034f) && Objects.equals(this.f28030b, g1Var.f28030b) && Objects.equals(this.f28033e, g1Var.f28033e) && Objects.equals(this.f28035g, g1Var.f28035g) && this.f28036h == g1Var.f28036h && this.f28037i == g1Var.f28037i && this.f28038j == g1Var.f28038j && this.f28039k == g1Var.f28039k && this.f28040l == g1Var.f28040l && this.f28041m == g1Var.f28041m && this.f28042n == g1Var.f28042n && this.f28043o == g1Var.f28043o && this.f28044p == g1Var.f28044p && this.f28045q == g1Var.f28045q;
    }

    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f28029a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28034f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28030b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f28035g;
        int iHashCode5 = ((((((((((((((((((((iHashCode4 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + this.f28036h) * 31) + this.f28037i) * 31) + this.f28038j) * 31) + this.f28039k) * 961) + (this.f28040l ? 1 : 0)) * 31) + (this.f28041m ? 1 : 0)) * 31) + (this.f28042n ? 1 : 0)) * 31) + this.f28043o.f28018a) * 31) + (this.f28044p ? 1 : 0)) * 31) + (this.f28045q ? 1 : 0);
        Map map = this.f28031c;
        if (map != null) {
            iHashCode5 = (iHashCode5 * 31) + map.hashCode();
        }
        Map map2 = this.f28032d;
        if (map2 != null) {
            iHashCode5 = (iHashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject2 = this.f28033e;
        if (jSONObject2 == null) {
            return iHashCode5;
        }
        char[] charArray = jSONObject2.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).hashCode() + (iHashCode5 * 31);
    }

    public final String toString() {
        return "HttpRequest {endpoint=" + this.f28029a + ", backupEndpoint=" + this.f28034f + ", httpMethod=" + this.f28030b + ", httpHeaders=" + this.f28032d + ", body=" + this.f28033e + ", emptyResponse=" + this.f28035g + ", initialRetryAttempts=" + this.f28036h + ", retryAttemptsLeft=" + this.f28037i + ", timeoutMillis=" + this.f28038j + ", retryDelayMillis=" + this.f28039k + ", exponentialRetries=false, retryOnAllErrors=" + this.f28040l + ", retryOnNoConnection=" + this.f28041m + ", encodingEnabled=" + this.f28042n + ", encodingType=" + this.f28043o + ", trackConnectionSpeed=" + this.f28044p + ", gzipBodyEncoding=" + this.f28045q + '}';
    }
}
