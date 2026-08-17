package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2440b2;
import com.google.android.gms.internal.measurement.C2465e0;
import com.google.android.gms.internal.measurement.C2467e2;
import com.google.android.gms.internal.measurement.C2485g2;
import com.google.android.gms.internal.measurement.C2494h2;
import com.google.android.gms.internal.measurement.C2512j2;
import com.google.android.gms.internal.measurement.C2521k2;
import com.google.android.gms.internal.measurement.C2542m5;
import com.google.android.gms.internal.measurement.C2592s2;
import com.google.android.gms.internal.measurement.C2653z3;
import com.google.android.gms.internal.measurement.InterfaceC2615u7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import p323s.C4101a;
import p323s.C4125z;

/* JADX INFO: loaded from: classes2.dex */
public final class P2 extends AbstractC2922b6 implements InterfaceC2994l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f35139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map f35140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map f35141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map f35142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f35143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f35144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final C4125z f35145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final InterfaceC2615u7 f35146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f35147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f35148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f35149n;

    P2(q6 q6Var) {
        super(q6Var);
        this.f35139d = new C4101a();
        this.f35140e = new C4101a();
        this.f35141f = new C4101a();
        this.f35142g = new C4101a();
        this.f35143h = new C4101a();
        this.f35147l = new C4101a();
        this.f35148m = new C4101a();
        this.f35149n = new C4101a();
        this.f35144i = new C4101a();
        this.f35145j = new I2(this, 20);
        this.f35146k = new J2(this);
    }

    private final void q(String str) throws Throwable {
        j();
        h();
        p170j8.r.f(str);
        Map map = this.f35143h;
        if (map.get(str) == null) {
            C3022p c3022pN0 = this.f35252b.F0().N0(str);
            if (c3022pN0 != null) {
                C2512j2 c2512j2 = (C2512j2) t(str, c3022pN0.f35727a).p();
                r(str, c2512j2);
                this.f35139d.put(str, u((C2521k2) c2512j2.q()));
                map.put(str, (C2521k2) c2512j2.q());
                s(str, (C2521k2) c2512j2.q());
                this.f35147l.put(str, c2512j2.B());
                this.f35148m.put(str, c3022pN0.f35728b);
                this.f35149n.put(str, c3022pN0.f35729c);
                return;
            }
            this.f35139d.put(str, null);
            this.f35141f.put(str, null);
            this.f35140e.put(str, null);
            this.f35142g.put(str, null);
            map.put(str, null);
            this.f35147l.put(str, null);
            this.f35148m.put(str, null);
            this.f35149n.put(str, null);
            this.f35144i.put(str, null);
        }
    }

    private final void r(String str, C2512j2 c2512j2) {
        HashSet hashSet = new HashSet();
        C4101a c4101a = new C4101a();
        C4101a c4101a2 = new C4101a();
        C4101a c4101a3 = new C4101a();
        Iterator it = c2512j2.A().iterator();
        while (it.hasNext()) {
            hashSet.add(((C2485g2) it.next()).C());
        }
        for (int i10 = 0; i10 < c2512j2.u(); i10++) {
            C2494h2 c2494h2 = (C2494h2) c2512j2.v(i10).p();
            if (c2494h2.u().isEmpty()) {
                this.f34853a.a().r().a("EventConfig contained null event name");
            } else {
                String strU = c2494h2.u();
                String strB = T8.w.b(c2494h2.u());
                if (!TextUtils.isEmpty(strB)) {
                    c2494h2.v(strB);
                    c2512j2.w(i10, c2494h2);
                }
                if (c2494h2.w() && c2494h2.x()) {
                    c4101a.put(strU, Boolean.TRUE);
                }
                if (c2494h2.y() && c2494h2.z()) {
                    c4101a2.put(c2494h2.u(), Boolean.TRUE);
                }
                if (c2494h2.A()) {
                    if (c2494h2.B() < 2 || c2494h2.B() > 65535) {
                        this.f34853a.a().r().c("Invalid sampling rate. Event name, sample rate", c2494h2.u(), Integer.valueOf(c2494h2.B()));
                    } else {
                        c4101a3.put(c2494h2.u(), Integer.valueOf(c2494h2.B()));
                    }
                }
            }
        }
        this.f35140e.put(str, hashSet);
        this.f35141f.put(str, c4101a);
        this.f35142g.put(str, c4101a2);
        this.f35144i.put(str, c4101a3);
    }

    private final void s(String str, C2521k2 c2521k2) {
        if (c2521k2.L() == 0) {
            this.f35145j.e(str);
            return;
        }
        X2 x10 = this.f34853a;
        x10.a().w().b("EES programs found", Integer.valueOf(c2521k2.L()));
        com.google.android.gms.internal.measurement.C3 c10 = (com.google.android.gms.internal.measurement.C3) c2521k2.K().get(0);
        try {
            C2465e0 c2465e0 = new C2465e0();
            c2465e0.a("internal.remoteConfig", new O2(this, str));
            c2465e0.a("internal.appMetadata", new L2(this, str));
            c2465e0.a("internal.logger", new M2(this));
            c2465e0.f(c10);
            this.f35145j.d(str, c2465e0);
            x10.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(c10.D().D()));
            Iterator it = c10.D().C().iterator();
            while (it.hasNext()) {
                x10.a().w().b("EES program activity", ((C2653z3) it.next()).C());
            }
        } catch (com.google.android.gms.internal.measurement.D0 unused) {
            this.f34853a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    private final C2521k2 t(String str, byte[] bArr) {
        if (bArr == null) {
            return C2521k2.T();
        }
        try {
            C2521k2 c2521k2 = (C2521k2) ((C2512j2) u6.W(C2521k2.S(), bArr)).q();
            this.f34853a.a().w().c("Parsed config. version, gmp_app_id", c2521k2.C() ? Long.valueOf(c2521k2.D()) : null, c2521k2.E() ? c2521k2.F() : null);
            return c2521k2;
        } catch (C2542m5 e10) {
            this.f34853a.a().r().c("Unable to merge remote config. appId", C3032q2.x(str), e10);
            return C2521k2.T();
        } catch (RuntimeException e11) {
            this.f34853a.a().r().c("Unable to merge remote config. appId", C3032q2.x(str), e11);
            return C2521k2.T();
        }
    }

    private static final Map u(C2521k2 c2521k2) {
        C4101a c4101a = new C4101a();
        if (c2521k2 != null) {
            for (C2592s2 c2592s2 : c2521k2.G()) {
                c4101a.put(c2592s2.C(), c2592s2.D());
            }
        }
        return c4101a;
    }

    private static final T8.v v(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return T8.v.AD_STORAGE;
        }
        if (i11 == 2) {
            return T8.v.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return T8.v.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return T8.v.AD_PERSONALIZATION;
    }

    protected final void A(String str) {
        h();
        this.f35148m.put(str, null);
    }

    final void B(String str) {
        h();
        this.f35143h.remove(str);
    }

    protected final boolean C(String str, byte[] bArr, String str2, String str3) throws Throwable {
        j();
        h();
        p170j8.r.f(str);
        C2512j2 c2512j2 = (C2512j2) t(str, bArr).p();
        r(str, c2512j2);
        s(str, (C2521k2) c2512j2.q());
        this.f35143h.put(str, (C2521k2) c2512j2.q());
        this.f35147l.put(str, c2512j2.B());
        this.f35148m.put(str, str2);
        this.f35149n.put(str, str3);
        this.f35139d.put(str, u((C2521k2) c2512j2.q()));
        this.f35252b.F0().Y(str, new ArrayList(c2512j2.x()));
        try {
            c2512j2.y();
            bArr = ((C2521k2) c2512j2.q()).a();
        } catch (RuntimeException e10) {
            this.f34853a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", C3032q2.x(str), e10);
        }
        C3056u c3056uF0 = this.f35252b.F0();
        p170j8.r.f(str);
        c3056uF0.h();
        c3056uF0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c3056uF0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c3056uF0.f34853a.a().o().b("Failed to update remote config (got 0). appId", C3032q2.x(str));
            }
        } catch (SQLiteException e11) {
            c3056uF0.f34853a.a().o().c("Error storing remote config. appId", C3032q2.x(str), e11);
        }
        c2512j2.z();
        this.f35143h.put(str, (C2521k2) c2512j2.q());
        return true;
    }

    final boolean D(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if (H(str) && z6.N(str2)) {
            return true;
        }
        if (I(str) && z6.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f35141f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f35142g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final Set F(String str) {
        h();
        q(str);
        return (Set) this.f35140e.get(str);
    }

    final int G(String str, String str2) throws Throwable {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f35144i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean H(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_internal"));
    }

    final boolean I(String str) {
        return "1".equals(f(str, "measurement.upload.blacklist_public"));
    }

    final boolean J(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f35140e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean K(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f35140e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean L(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f35140e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    final boolean M(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f35140e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    final boolean N(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f35140e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    final boolean O(String str) throws Throwable {
        h();
        q(str);
        Map map = this.f35140e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean P(String str, T8.v vVar) throws Throwable {
        h();
        q(str);
        C2467e2 c2467e2R = R(str);
        if (c2467e2R == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.S1 s10 : c2467e2R.C()) {
            if (vVar == v(s10.D())) {
                if (s10.E() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final T8.v Q(String str, T8.v vVar) {
        h();
        q(str);
        C2467e2 c2467e2R = R(str);
        if (c2467e2R == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.U1 u10 : c2467e2R.D()) {
            if (vVar == v(u10.D())) {
                return v(u10.E());
            }
        }
        return null;
    }

    final C2467e2 R(String str) {
        h();
        q(str);
        C2521k2 c2521k2W = w(str);
        if (c2521k2W == null || !c2521k2W.O()) {
            return null;
        }
        return c2521k2W.P();
    }

    final boolean S(String str) {
        h();
        q(str);
        C2467e2 c2467e2R = R(str);
        return c2467e2R == null || !c2467e2R.F() || c2467e2R.G();
    }

    final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        C2467e2 c2467e2R = R(str);
        if (c2467e2R != null) {
            Iterator it = c2467e2R.E().iterator();
            while (it.hasNext()) {
                treeSet.add(((C2440b2) it.next()).C());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2994l
    public final String f(String str, String str2) throws Throwable {
        h();
        q(str);
        Map map = (Map) this.f35139d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2922b6
    protected final boolean l() {
        return false;
    }

    final T8.u m(String str, T8.v vVar) {
        h();
        q(str);
        C2467e2 c2467e2R = R(str);
        if (c2467e2R == null) {
            return T8.u.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.S1 s10 : c2467e2R.H()) {
            if (v(s10.D()) == vVar) {
                int iE = s10.E() - 1;
                if (iE != 1) {
                    return iE != 2 ? T8.u.UNINITIALIZED : T8.u.DENIED;
                }
                return T8.u.GRANTED;
            }
        }
        return T8.u.UNINITIALIZED;
    }

    final boolean n(String str) throws Throwable {
        h();
        q(str);
        C2467e2 c2467e2R = R(str);
        if (c2467e2R == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.S1 s10 : c2467e2R.C()) {
            if (s10.D() == 3 && s10.F() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ C2465e0 o(String str) throws Throwable {
        j();
        p170j8.r.f(str);
        C3022p c3022pN0 = this.f35252b.F0().N0(str);
        if (c3022pN0 == null) {
            return null;
        }
        this.f34853a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, c3022pN0.f35727a));
        return (C2465e0) this.f35145j.h().get(str);
    }

    final /* synthetic */ Map p() {
        return this.f35139d;
    }

    protected final C2521k2 w(String str) {
        j();
        h();
        p170j8.r.f(str);
        q(str);
        return (C2521k2) this.f35143h.get(str);
    }

    final String x(String str) {
        h();
        q(str);
        return (String) this.f35147l.get(str);
    }

    protected final String y(String str) {
        h();
        return (String) this.f35148m.get(str);
    }

    protected final String z(String str) {
        h();
        return (String) this.f35149n.get(str);
    }
}
