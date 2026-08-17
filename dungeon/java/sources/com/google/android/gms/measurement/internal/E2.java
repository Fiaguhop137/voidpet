package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes2.dex */
final class E2 extends B3 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final Pair f34955A = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f34956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SharedPreferences f34957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2 f34958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B2 f34959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B2 f34960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D2 f34961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f34964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B2 f34965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3094z2 f34966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D2 f34967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A2 f34968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C3094z2 f34969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B2 f34970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B2 f34971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f34972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C3094z2 f34973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C3094z2 f34974u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B2 f34975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D2 f34976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final D2 f34977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B2 f34978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final A2 f34979z;

    E2(X2 x10) {
        super(x10);
        this.f34965l = new B2(this, "session_timeout", 1800000L);
        this.f34966m = new C3094z2(this, "start_new_session", true);
        this.f34970q = new B2(this, "last_pause_time", 0L);
        this.f34971r = new B2(this, "session_id", 0L);
        this.f34967n = new D2(this, "non_personalized_ads", null);
        this.f34968o = new A2(this, "last_received_uri_timestamps_by_source", null);
        this.f34969p = new C3094z2(this, "allow_remote_dynamite", false);
        this.f34959f = new B2(this, "first_open_time", 0L);
        this.f34960g = new B2(this, "app_install_time", 0L);
        this.f34961h = new D2(this, "app_instance_id", null);
        this.f34973t = new C3094z2(this, "app_backgrounded", false);
        this.f34974u = new C3094z2(this, "deep_link_retrieval_complete", false);
        this.f34975v = new B2(this, "deep_link_retrieval_attempts", 0L);
        this.f34976w = new D2(this, "firebase_feature_rollouts", null);
        this.f34977x = new D2(this, "deferred_attribution_cache", null);
        this.f34978y = new B2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f34979z = new A2(this, "default_event_parameters", null);
    }

    final boolean A(long j10) {
        return j10 - this.f34965l.a() > this.f34970q.a();
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final void j() {
        X2 x10 = this.f34853a;
        SharedPreferences sharedPreferences = x10.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f34956c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f34972s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f34956c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        x10.w();
        this.f34958e = new C2(this, "health_monitor", Math.max(0L, ((Long) AbstractC2934d2.f35444d.b(null)).longValue()), null);
    }

    final Pair o(String str) {
        h();
        if (!w().o(T8.v.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        X2 x10 = this.f34853a;
        long jC = x10.e().c();
        String str2 = this.f34962i;
        if (str2 != null && jC < this.f34964k) {
            return new Pair(str2, Boolean.valueOf(this.f34963j));
        }
        this.f34964k = jC + x10.w().D(str, AbstractC2934d2.f35438b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(x10.d());
            this.f34962i = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f34962i = id2;
            }
            this.f34963j = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            this.f34853a.a().v().b("Unable to get advertising id", e10);
            this.f34962i = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f34962i, Boolean.valueOf(this.f34963j));
    }

    protected final SharedPreferences p() {
        h();
        l();
        p170j8.r.l(this.f34956c);
        return this.f34956c;
    }

    protected final SharedPreferences q() {
        h();
        l();
        if (this.f34957d == null) {
            X2 x10 = this.f34853a;
            String strValueOf = String.valueOf(x10.d().getPackageName());
            C3018o2 c3018o2W = x10.a().w();
            String strConcat = strValueOf.concat("_preferences");
            c3018o2W.b("Default prefs file", strConcat);
            this.f34957d = x10.d().getSharedPreferences(strConcat, 0);
        }
        return this.f34957d;
    }

    final SparseArray r() {
        Bundle bundleA = this.f34968o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f34853a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final C3084y u() {
        h();
        return C3084y.g(p().getString("dma_consent_settings", null));
    }

    final boolean v(int i10) {
        return E3.u(i10, p().getInt("consent_source", 100));
    }

    final E3 w() {
        h();
        return E3.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    protected final boolean x(O5 o10) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String strA = o10.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    final void y(boolean z10) {
        h();
        this.f34853a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    final boolean z() {
        SharedPreferences sharedPreferences = this.f34956c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
