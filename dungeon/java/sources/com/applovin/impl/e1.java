package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.Axon;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p184k4.RunnableC3891a;
import p184k4.RunnableC3893b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ExecutorService f27982e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f27984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f27985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f27986c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f27981d = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f27983f = new Object();

    public e1(p pVar, int i10) {
        Collections.synchronizedSet(new HashSet());
        this.f27984a = pVar;
        this.f27985b = pVar.g();
        if (f27982e != null) {
            return;
        }
        synchronized (f27983f) {
            try {
                if (f27982e != null) {
                    return;
                }
                f27982e = Executors.newFixedThreadPool(1, new d1(this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final URL a(b1 b1Var, Map map) throws UnsupportedEncodingException {
        String packageName;
        PackageInfo packageInfo;
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        HashMap map2 = new HashMap();
        map2.put("type", b1Var.f27958a);
        Map mapG = this.f27984a.c().g();
        map2.put("platform", String.valueOf(mapG.get("platform")));
        map2.put("country_code", String.valueOf(mapG.get("country_code")));
        map2.put("cc", (String) this.f27984a.l().a(m2.f28152P0));
        map2.put("art", this.f27984a.q().f28234b);
        map2.put("compass_random_token", this.f27984a.q().f28233a);
        map2.put("model", Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put("os", Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(Axon.VERSION));
        map2.put("sdk_name", "Axon");
        try {
            PackageManager packageManager = p.f28247J.getPackageManager();
            packageName = p.f28247J.getPackageName();
            try {
                packageInfo = packageManager.getPackageInfo(packageName, 0);
            } catch (Throwable unused) {
                packageInfo = null;
            }
        } catch (Throwable unused2) {
            packageName = "";
        }
        map2.put("package_name", packageName);
        map2.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        map2.put("app_version_code", String.valueOf(packageInfo != null ? packageInfo.versionCode : 0));
        if (map != null) {
            map2.putAll(map);
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb2.append(strEncode);
            sb2.append("=");
            sb2.append(strEncode2);
            if (it.hasNext()) {
                sb2.append("&");
            }
        }
        return new URL(sb2.toString());
    }

    public final JSONObject a(b1 b1Var, double d10, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (b1Var == b1.f27957o) {
            if (((Boolean) this.f27984a.l().a(m2.f28218y0)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(r3.f28330d));
                JsonUtils.putStringIfValid(jSONObject, "wvv", r3.f28331e);
                JsonUtils.putStringIfValid(jSONObject, "wvpn", r3.f28332f);
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f27984a.c().f());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapG = this.f27984a.c().g();
        JsonUtils.putObject(jSONObject2, "platform", mapG.get("platform"));
        JsonUtils.putObject(jSONObject2, "os", mapG.get("os"));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapG.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapG.get("brand"));
        JsonUtils.putObject(jSONObject2, "model", mapG.get("model"));
        JsonUtils.putObject(jSONObject2, "revision", mapG.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapG.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f27984a.l().a(m2.f28152P0));
        JsonUtils.putObject(jSONObject2, "art", this.f27984a.q().f28234b);
        Map mapE = this.f27984a.c().e();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapE.get("sdk_version"));
        JsonUtils.putString(jSONObject2, "sdk_name", "Axon");
        JsonUtils.putObject(jSONObject2, "app_version", mapE.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapE.get("package_name"));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapE.get("first_install_v2"))));
        SessionTracker sessionTrackerK = this.f27984a.k();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerK.getCurrentApplicationState().f28112a);
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerK.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerK.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - p.f28248K));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", b1Var.f27958a);
            JsonUtils.putDouble(jSONObject3, "weight", d10);
            JsonUtils.putString(jSONObject3, "level", "DEBUG");
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    public final void a(b1 b1Var, ArrayList arrayList) {
        Long l10 = (Long) this.f27986c.get(b1Var);
        if (System.currentTimeMillis() - (l10 != null ? l10.longValue() : -1L) < 0) {
            return;
        }
        try {
            Handler handler = i3.f28069a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                f27982e.execute(new RunnableC3891a(this, b1Var, arrayList));
            } else {
                b(b1Var, (List) arrayList);
            }
        } catch (Throwable th) {
            p1 p1Var = this.f27985b;
            if (p1.f28289b) {
                p1Var.d("HealthEventsReporter", "Failed to report " + b1Var.f27958a + " with extra parameters collection " + arrayList, th);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(b1 b1Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (t0.a()) {
            return;
        }
        p1 p1Var = this.f27985b;
        if (p1.f28289b) {
            p1Var.a("HealthEventsReporter", "Reporting " + b1Var.f27958a + " with extra parameters collection " + list);
        }
        b1Var.getClass();
        if (b1Var.f27959b != 2) {
            double dIntValue = ((Integer) this.f27984a.l().a(m2.f28157S)).intValue();
            Random random = i1.f28067a;
            if (dIntValue >= 100.0d || (dIntValue > 0.0d && i1.f28067a.nextFloat() < dIntValue / 100.0d)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Map map = (Map) it.next();
                    try {
                        httpURLConnection = (HttpURLConnection) a(b1Var, map).openConnection();
                        try {
                            int i10 = f27981d;
                            httpURLConnection.setConnectTimeout(i10);
                            httpURLConnection.setReadTimeout(i10);
                            httpURLConnection.setDefaultUseCaches(false);
                            httpURLConnection.setAllowUserInteraction(false);
                            httpURLConnection.setUseCaches(false);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setDoOutput(false);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setRequestProperty("AppLovin-Event-Type", b1Var.f27958a);
                            int responseCode = httpURLConnection.getResponseCode();
                            p1 p1Var2 = this.f27985b;
                            if (p1.f28289b) {
                                p1Var2.a("HealthEventsReporter", b1Var.f27958a + " reported with code " + responseCode + " and extra parameters " + map);
                            }
                            this.f27986c.put(b1Var, Long.valueOf(System.currentTimeMillis()));
                            e0.a(httpURLConnection, this.f27984a.g());
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                p1 p1Var3 = this.f27985b;
                                if (p1.f28289b) {
                                    p1Var3.d("HealthEventsReporter", "Failed to report " + b1Var.f27958a + " with extra parameters " + map, th);
                                }
                                e0.a(httpURLConnection, this.f27984a.g());
                            } catch (Throwable th3) {
                                e0.a(httpURLConnection, this.f27984a.g());
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        httpURLConnection = null;
                        th = th4;
                    }
                }
            }
        }
        c(b1Var, list);
    }

    public final void b(b1 b1Var, Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(b1Var, arrayList);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(String str, b1 b1Var, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i10 = f27981d;
                httpURLConnection2.setConnectTimeout(i10);
                httpURLConnection2.setReadTimeout(i10);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", b1Var.f27958a);
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                p1 p1Var = this.f27985b;
                if (p1.f28289b) {
                    p1Var.a("HealthEventsReporter", b1Var.f27958a + " reported with code " + responseCode);
                }
                this.f27986c.put(b1Var, Long.valueOf(System.currentTimeMillis()));
                e0.a(httpURLConnection2, this.f27984a.g());
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    p1 p1Var2 = this.f27985b;
                    if (p1.f28289b) {
                        p1Var2.d("HealthEventsReporter", "Failed to report " + b1Var.f27958a, th);
                    }
                } finally {
                    e0.a(httpURLConnection, this.f27984a.g());
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    public final void c(b1 b1Var, List list) {
        float fFloatValue;
        String str = (String) this.f27984a.l().a(m2.f28159T);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p pVar = this.f27984a;
        String str2 = b1Var.f27958a;
        if (b1.f27945c == null) {
            b1.f27945c = JsonUtils.deserialize((String) pVar.l().a(m2.f28161U));
        }
        Double d10 = JsonUtils.getDouble(b1.f27945c, str2, (Double) null);
        double d11 = -1.0d;
        double dDoubleValue = d10 != null ? d10.doubleValue() : -1.0d;
        if (dDoubleValue < 0.0d) {
            int iA = e.a(b1Var.f27959b);
            if (iA == 0) {
                fFloatValue = ((Float) pVar.l().a(m2.f28163V)).floatValue();
            } else if (iA == 1) {
                fFloatValue = ((Float) pVar.l().a(m2.f28165W)).floatValue();
            } else if (d11 >= 0.0d) {
                dDoubleValue = d11;
            } else {
                dDoubleValue = ((Float) pVar.l().a(m2.f28167X)).floatValue();
            }
            d11 = fFloatValue;
            if (d11 >= 0.0d) {
                dDoubleValue = d11;
            } else {
                dDoubleValue = ((Float) pVar.l().a(m2.f28167X)).floatValue();
            }
        }
        Random random = i1.f28067a;
        if (dDoubleValue < 100.0d && (dDoubleValue <= 0.0d || i1.f28067a.nextFloat() >= dDoubleValue / 100.0d)) {
            return;
        }
        if (((Boolean) this.f27984a.l().a(m2.f28169Y)).booleanValue()) {
            a(str, b1Var, a(b1Var, dDoubleValue, list));
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f27982e.execute(new RunnableC3893b(this, str, b1Var, a(b1Var, dDoubleValue, Collections.singletonList((Map) it.next()))));
        }
    }
}
