package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f28431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f28432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f28433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f2 f28434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f28435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f28436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f28437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f28438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f28439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28440n;

    public z1(String str, String str2, Map map, Map map2, Map map3, f2 f2Var, boolean z10) {
        this.f28427a = UUID.randomUUID().toString();
        this.f28428b = null;
        this.f28429c = str;
        this.f28430d = str2;
        this.f28431e = map;
        this.f28432f = map2;
        this.f28433g = map3;
        this.f28434h = f2Var;
        this.f28435i = z10;
        this.f28436j = false;
        this.f28437k = false;
        this.f28438l = false;
        this.f28439m = null;
        this.f28440n = 0;
    }

    public z1(JSONObject jSONObject) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f28427a = string;
        this.f28428b = string3;
        this.f28439m = string2;
        this.f28429c = string4;
        this.f28430d = string5;
        this.f28431e = mapSynchronizedMap;
        this.f28432f = mapSynchronizedMap2;
        this.f28433g = mapSynchronizedMap3;
        this.f28434h = f2.a(jSONObject.optInt("encodingType", 1));
        this.f28435i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f28436j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f28437k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f28438l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f28440n = i10;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f28427a);
        jSONObject.put("communicatorRequestId", this.f28439m);
        jSONObject.put("httpMethod", this.f28428b);
        jSONObject.put("targetUrl", this.f28429c);
        jSONObject.put("backupUrl", this.f28430d);
        jSONObject.put("encodingType", this.f28434h);
        jSONObject.put("isEncodingEnabled", this.f28435i);
        jSONObject.put("gzipBodyEncoding", this.f28436j);
        jSONObject.put("isAllowedPreInitEvent", this.f28437k);
        jSONObject.put("attemptNumber", this.f28440n);
        if (this.f28431e != null) {
            jSONObject.put("parameters", new JSONObject(this.f28431e));
        }
        if (this.f28432f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f28432f));
        }
        if (this.f28433g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f28433g));
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        return this.f28427a.equals(((z1) obj).f28427a);
    }

    public final int hashCode() {
        return this.f28427a.hashCode();
    }

    public final String toString() {
        return "PostbackRequest{uniqueId='" + this.f28427a + "', communicatorRequestId='" + this.f28439m + "', httpMethod='" + this.f28428b + "', targetUrl='" + this.f28429c + "', backupUrl='" + this.f28430d + "', attemptNumber=" + this.f28440n + ", isEncodingEnabled=" + this.f28435i + ", isGzipBodyEncoding=" + this.f28436j + ", isAllowedPreInitEvent=" + this.f28437k + ", shouldFireInWebView=" + this.f28438l + '}';
    }
}
