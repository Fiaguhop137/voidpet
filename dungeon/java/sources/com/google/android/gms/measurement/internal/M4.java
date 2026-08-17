package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class M4 extends AbstractC2950f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile E4 f35097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile E4 f35098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected E4 f35099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f35100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.J0 f35101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f35102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile E4 f35103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E4 f35104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f35106l;

    public M4(X2 x10) {
        super(x10);
        this.f35106l = new Object();
        this.f35100f = new ConcurrentHashMap();
    }

    private final void F(String str, E4 e10, boolean z10) {
        E4 e11;
        E4 e12 = this.f35097c == null ? this.f35098d : this.f35097c;
        if (e10.f34984b == null) {
            e11 = new E4(e10.f34983a, str != null ? r(str, "Activity") : null, e10.f34985c, e10.f34987e, e10.f34988f);
        } else {
            e11 = e10;
        }
        this.f35098d = this.f35097c;
        this.f35097c = e11;
        X2 x10 = this.f34853a;
        x10.b().t(new G4(this, e11, e12, x10.e().c(), z10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    private final void G(E4 e10, E4 e11, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        h();
        boolean z12 = false;
        if (e11 != null) {
            if (e11.f34985c == e10.f34985c && Objects.equals(e11.f34984b, e10.f34984b) && Objects.equals(e11.f34983a, e10.f34983a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f35099e != null) {
            z12 = true;
        }
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            z6.k0(e10, bundle2, true);
            if (e11 != null) {
                String str = e11.f34983a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = e11.f34984b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", e11.f34985c);
            }
            if (z12) {
                L5 l10 = this.f34853a.z().f35122f;
                long j12 = j10 - l10.f35088b;
                l10.f35088b = j10;
                if (j12 > 0) {
                    this.f34853a.C().Z(bundle2, j12);
                }
            }
            X2 x10 = this.f34853a;
            if (!x10.w().N()) {
                bundle2.putLong("_mst", 1L);
            }
            boolean z13 = e10.f34987e;
            String str3 = true != z13 ? "auto" : "app";
            long jA = x10.e().a();
            if (z13) {
                long j13 = e10.f34988f;
                if (j13 == 0) {
                    j11 = jA;
                } else {
                    j11 = j13;
                }
            } else {
                j11 = jA;
            }
            this.f34853a.B().u(str3, "_vs", j11, bundle2);
        }
        if (z12) {
            o(this.f35099e, true, j10);
        }
        this.f35099e = e10;
        if (e10.f34987e) {
            this.f35104j = e10;
        }
        this.f34853a.J().u(e10);
    }

    private final void o(E4 e10, boolean z10, long j10) {
        X2 x10 = this.f34853a;
        x10.M().k(x10.e().c());
        if (!x10.z().f35122f.d(e10 != null && e10.f34986d, z10, j10) || e10 == null) {
            return;
        }
        e10.f34986d = false;
    }

    private final E4 p(com.google.android.gms.internal.measurement.J0 j10) {
        p170j8.r.l(j10);
        Integer numValueOf = Integer.valueOf(j10.f32547a);
        Map map = this.f35100f;
        E4 e10 = (E4) map.get(numValueOf);
        if (e10 == null) {
            E4 e11 = new E4(null, r(j10.f32548b, "Activity"), this.f34853a.C().p0());
            map.put(numValueOf, e11);
            e10 = e11;
        }
        return this.f35103i != null ? this.f35103i : e10;
    }

    final /* synthetic */ void A(Bundle bundle, E4 e10, E4 e11, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(e10, e11, j10, true, this.f34853a.C().t(null, "screen_view", bundle, null, false));
    }

    final /* synthetic */ void B(E4 e10, E4 e11, long j10, boolean z10, Bundle bundle) {
        G(e10, e11, j10, z10, null);
    }

    final /* synthetic */ void C(E4 e10, boolean z10, long j10) {
        o(e10, false, j10);
    }

    final /* synthetic */ E4 D() {
        return this.f35104j;
    }

    final /* synthetic */ void E(E4 e10) {
        this.f35104j = null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2950f2
    protected final boolean m() {
        return false;
    }

    public final E4 q(boolean z10) {
        j();
        h();
        if (!z10) {
            return this.f35099e;
        }
        E4 e10 = this.f35099e;
        return e10 != null ? e10 : this.f35104j;
    }

    final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        X2 x10 = this.f34853a;
        return str3.length() > x10.w().x(null, false) ? str3.substring(0, x10.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j10) {
        synchronized (this.f35106l) {
            try {
                if (!this.f35105k) {
                    this.f34853a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f34853a.w().x(null, false))) {
                    this.f34853a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f34853a.w().x(null, false))) {
                    this.f34853a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.J0 j11 = this.f35101g;
                    string2 = j11 != null ? r(j11.f32548b, "Activity") : "Activity";
                }
                E4 e10 = this.f35097c;
                if (this.f35102h && e10 != null) {
                    this.f35102h = false;
                    boolean zEquals = Objects.equals(e10.f34984b, string2);
                    boolean zEquals2 = Objects.equals(e10.f34983a, string);
                    if (zEquals && zEquals2) {
                        this.f34853a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                X2 x10 = this.f34853a;
                x10.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                E4 e11 = this.f35097c == null ? this.f35098d : this.f35097c;
                E4 e12 = new E4(string, string2, x10.C().p0(), true, j10);
                this.f35097c = e12;
                this.f35098d = e11;
                this.f35103i = e12;
                x10.b().t(new F4(this, bundle, e12, e11, x10.e().c()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(com.google.android.gms.internal.measurement.J0 j10, String str, String str2) {
        X2 x10 = this.f34853a;
        if (!x10.w().N()) {
            x10.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        E4 e10 = this.f35097c;
        if (e10 == null) {
            x10.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f35100f;
        Integer numValueOf = Integer.valueOf(j10.f32547a);
        if (map.get(numValueOf) == null) {
            x10.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(j10.f32548b, "Activity");
        }
        String str3 = e10.f34984b;
        String str4 = e10.f34983a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            x10.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > x10.w().x(null, false))) {
            x10.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > x10.w().x(null, false))) {
            x10.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        x10.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        E4 e11 = new E4(str, str2, x10.C().p0());
        map.put(numValueOf, e11);
        F(j10.f32548b, e11, true);
    }

    public final E4 u() {
        return this.f35097c;
    }

    public final void v(com.google.android.gms.internal.measurement.J0 j10, Bundle bundle) {
        Bundle bundle2;
        if (!this.f34853a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f35100f.put(Integer.valueOf(j10.f32547a), new E4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(com.google.android.gms.internal.measurement.J0 j10) {
        Object obj = this.f35106l;
        synchronized (obj) {
            this.f35105k = true;
            if (!Objects.equals(j10, this.f35101g)) {
                synchronized (obj) {
                    this.f35101g = j10;
                    this.f35102h = false;
                    X2 x10 = this.f34853a;
                    if (x10.w().N()) {
                        this.f35103i = null;
                        x10.b().t(new L4(this));
                    }
                }
            }
        }
        X2 x11 = this.f34853a;
        if (!x11.w().N()) {
            this.f35097c = this.f35103i;
            x11.b().t(new H4(this));
            return;
        }
        F(j10.f32548b, p(j10), false);
        C0 c0M = this.f34853a.M();
        X2 x12 = c0M.f34853a;
        x12.b().t(new RunnableC2916b0(c0M, x12.e().c()));
    }

    public final void x(com.google.android.gms.internal.measurement.J0 j10) {
        synchronized (this.f35106l) {
            this.f35105k = false;
            this.f35102h = true;
        }
        X2 x10 = this.f34853a;
        long jC = x10.e().c();
        if (!x10.w().N()) {
            this.f35097c = null;
            x10.b().t(new I4(this, jC));
        } else {
            E4 e4P = p(j10);
            this.f35098d = this.f35097c;
            this.f35097c = null;
            x10.b().t(new J4(this, e4P, jC));
        }
    }

    public final void y(com.google.android.gms.internal.measurement.J0 j10, Bundle bundle) {
        E4 e10;
        if (!this.f34853a.w().N() || bundle == null || (e10 = (E4) this.f35100f.get(Integer.valueOf(j10.f32547a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", e10.f34985c);
        bundle2.putString("name", e10.f34983a);
        bundle2.putString("referrer_name", e10.f34984b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(com.google.android.gms.internal.measurement.J0 j10) {
        synchronized (this.f35106l) {
            try {
                if (Objects.equals(this.f35101g, j10)) {
                    this.f35101g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f34853a.w().N()) {
            this.f35100f.remove(Integer.valueOf(j10.f32547a));
        }
    }
}
