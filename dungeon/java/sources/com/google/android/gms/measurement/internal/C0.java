package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 extends E1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f34925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f34926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f34927d;

    public C0(X2 x10) {
        super(x10);
        this.f34926c = new C4101a();
        this.f34925b = new C4101a();
    }

    private final void o(long j10, E4 e10) {
        if (e10 == null) {
            this.f34853a.a().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f34853a.a().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        z6.k0(e10, bundle, true);
        this.f34853a.B().t("am", "_xa", bundle);
    }

    private final void p(String str, long j10, E4 e10) {
        if (e10 == null) {
            this.f34853a.a().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f34853a.a().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        z6.k0(e10, bundle, true);
        this.f34853a.B().t("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(long j10) {
        Map map = this.f34925b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f34927d = j10;
    }

    public final void i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f34853a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f34853a.b().t(new RunnableC2907a(this, str, j10));
        }
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f34853a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f34853a.b().t(new RunnableC3091z(this, str, j10));
        }
    }

    public final void k(long j10) {
        E4 e4Q = this.f34853a.I().q(false);
        Map map = this.f34925b;
        for (String str : map.keySet()) {
            p(str, j10 - ((Long) map.get(str)).longValue(), e4Q);
        }
        if (!map.isEmpty()) {
            o(j10 - this.f34927d, e4Q);
        }
        n(j10);
    }

    final /* synthetic */ void l(String str, long j10) {
        h();
        p170j8.r.f(str);
        Map map = this.f34926c;
        if (map.isEmpty()) {
            this.f34927d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f34853a.a().r().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f34925b.put(str, Long.valueOf(j10));
        }
    }

    final /* synthetic */ void m(String str, long j10) {
        h();
        p170j8.r.f(str);
        Map map = this.f34926c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f34853a.a().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        E4 e4Q = this.f34853a.I().q(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f34925b;
        Long l10 = (Long) map2.get(str);
        if (l10 == null) {
            this.f34853a.a().o().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l10.longValue();
            map2.remove(str);
            p(str, jLongValue, e4Q);
        }
        if (map.isEmpty()) {
            long j11 = this.f34927d;
            if (j11 == 0) {
                this.f34853a.a().o().a("First ad exposure time was never set");
            } else {
                o(j10 - j11, e4Q);
                this.f34927d = 0L;
            }
        }
    }
}
