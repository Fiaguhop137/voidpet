package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2133f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27707c;

    /* JADX INFO: renamed from: com.android.billingclient.api.f$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f27709b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27710c = "";

        /* synthetic */ a(p131h4.J j10) {
        }

        public C2133f a() {
            C2133f c2133f = new C2133f();
            c2133f.f27705a = this.f27708a;
            c2133f.f27706b = this.f27709b;
            c2133f.f27707c = this.f27710c;
            return c2133f;
        }

        public a b(String str) {
            this.f27710c = str;
            return this;
        }

        public a c(int i10) {
            this.f27709b = i10;
            return this;
        }

        public a d(int i10) {
            this.f27708a = i10;
            return this;
        }
    }

    public static a d() {
        return new a(null);
    }

    public String a() {
        return this.f27707c;
    }

    public int b() {
        return this.f27706b;
    }

    public int c() {
        return this.f27705a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.O.j(this.f27705a) + ", Debug Message: " + this.f27707c;
    }
}
