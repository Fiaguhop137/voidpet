package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2136i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27720b;

    /* JADX INFO: renamed from: com.android.billingclient.api.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27722b;

        private a() {
        }

        /* synthetic */ a(p131h4.P p10) {
            this();
        }

        public C2136i a() {
            if (this.f27721a) {
                return new C2136i(true, this.f27722b, null);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public a b() {
            this.f27721a = true;
            return this;
        }
    }

    private C2136i(boolean z10, boolean z11) {
        this.f27719a = z10;
        this.f27720b = z11;
    }

    /* synthetic */ C2136i(boolean z10, boolean z11, p131h4.P p10) {
        this(z10, z11);
    }

    public static a c() {
        return new a(null);
    }

    boolean a() {
        return this.f27719a;
    }

    boolean b() {
        return this.f27720b;
    }
}
