package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends p188k8.a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f37500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f37501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f37502c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f37504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f37505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f37506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f37507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String[] f37508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f37509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f37510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f37511i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f37512j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f37513k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f37514l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f37515m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f37516n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f37517o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f37518p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Integer f37519q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Integer f37520r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int[] f37521s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Long f37522t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f37523u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f37524v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f37525w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f37526x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f37527y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f37528z;

        private b(K k10) {
            this.f37503a = k10.p("gcm.n.title");
            this.f37504b = k10.h("gcm.n.title");
            this.f37505c = p(k10, "gcm.n.title");
            this.f37506d = k10.p("gcm.n.body");
            this.f37507e = k10.h("gcm.n.body");
            this.f37508f = p(k10, "gcm.n.body");
            this.f37509g = k10.p("gcm.n.icon");
            this.f37511i = k10.o();
            this.f37512j = k10.p("gcm.n.tag");
            this.f37513k = k10.p("gcm.n.color");
            this.f37514l = k10.p("gcm.n.click_action");
            this.f37515m = k10.p("gcm.n.android_channel_id");
            this.f37516n = k10.f();
            this.f37510h = k10.p("gcm.n.image");
            this.f37517o = k10.p("gcm.n.ticker");
            this.f37518p = k10.b("gcm.n.notification_priority");
            this.f37519q = k10.b("gcm.n.visibility");
            this.f37520r = k10.b("gcm.n.notification_count");
            this.f37523u = k10.a("gcm.n.sticky");
            this.f37524v = k10.a("gcm.n.local_only");
            this.f37525w = k10.a("gcm.n.default_sound");
            this.f37526x = k10.a("gcm.n.default_vibrate_timings");
            this.f37527y = k10.a("gcm.n.default_light_settings");
            this.f37522t = k10.j("gcm.n.event_time");
            this.f37521s = k10.e();
            this.f37528z = k10.q();
        }

        /* synthetic */ b(K k10, a aVar) {
            this(k10);
        }

        private static String[] p(K k10, String str) {
            Object[] objArrG = k10.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        public Integer A() {
            return this.f37519q;
        }

        public String a() {
            return this.f37506d;
        }

        public String[] b() {
            return this.f37508f;
        }

        public String c() {
            return this.f37507e;
        }

        public String d() {
            return this.f37515m;
        }

        public String e() {
            return this.f37514l;
        }

        public String f() {
            return this.f37513k;
        }

        public boolean g() {
            return this.f37527y;
        }

        public boolean h() {
            return this.f37525w;
        }

        public boolean i() {
            return this.f37526x;
        }

        public Long j() {
            return this.f37522t;
        }

        public String k() {
            return this.f37509g;
        }

        public Uri l() {
            String str = this.f37510h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public int[] m() {
            return this.f37521s;
        }

        public Uri n() {
            return this.f37516n;
        }

        public boolean o() {
            return this.f37524v;
        }

        public Integer q() {
            return this.f37520r;
        }

        public Integer r() {
            return this.f37518p;
        }

        public String s() {
            return this.f37511i;
        }

        public boolean t() {
            return this.f37523u;
        }

        public String u() {
            return this.f37512j;
        }

        public String v() {
            return this.f37517o;
        }

        public String w() {
            return this.f37503a;
        }

        public String[] x() {
            return this.f37505c;
        }

        public String y() {
            return this.f37504b;
        }

        public long[] z() {
            return this.f37528z;
        }
    }

    public T(Bundle bundle) {
        this.f37500a = bundle;
    }

    private int e4(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String a4() {
        return this.f37500a.getString("collapse_key");
    }

    public Map b4() {
        if (this.f37501b == null) {
            this.f37501b = AbstractC3110e.a.a(this.f37500a);
        }
        return this.f37501b;
    }

    public String c4() {
        return this.f37500a.getString("from");
    }

    public String d4() {
        String string = this.f37500a.getString("google.message_id");
        return string == null ? this.f37500a.getString("message_id") : string;
    }

    public String f4() {
        return this.f37500a.getString("message_type");
    }

    public b g4() {
        if (this.f37502c == null && K.t(this.f37500a)) {
            this.f37502c = new b(new K(this.f37500a), null);
        }
        return this.f37502c;
    }

    public int h4() {
        String string = this.f37500a.getString("google.original_priority");
        if (string == null) {
            string = this.f37500a.getString("google.priority");
        }
        return e4(string);
    }

    public int i4() {
        String string = this.f37500a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f37500a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f37500a.getString("google.priority");
        }
        return e4(string);
    }

    public long j4() {
        Object obj = this.f37500a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String k4() {
        return this.f37500a.getString("google.to");
    }

    public int l4() {
        Object obj = this.f37500a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        U.c(this, parcel, i10);
    }
}
