package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20853a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20854b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20855c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20856d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20857e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20858f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20859g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20860h = false;

    Z() {
    }

    public int a() {
        return this.f20859g ? this.f20853a : this.f20854b;
    }

    public int b() {
        return this.f20853a;
    }

    public int c() {
        return this.f20854b;
    }

    public int d() {
        return this.f20859g ? this.f20854b : this.f20853a;
    }

    public void e(int i10, int i11) {
        this.f20860h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f20857e = i10;
            this.f20853a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f20858f = i11;
            this.f20854b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f20859g) {
            return;
        }
        this.f20859g = z10;
        if (!this.f20860h) {
            this.f20853a = this.f20857e;
            this.f20854b = this.f20858f;
            return;
        }
        if (z10) {
            int i10 = this.f20856d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f20857e;
            }
            this.f20853a = i10;
            int i11 = this.f20855c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f20858f;
            }
            this.f20854b = i11;
            return;
        }
        int i12 = this.f20855c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f20857e;
        }
        this.f20853a = i12;
        int i13 = this.f20856d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f20858f;
        }
        this.f20854b = i13;
    }

    public void g(int i10, int i11) {
        this.f20855c = i10;
        this.f20856d = i11;
        this.f20860h = true;
        if (this.f20859g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f20853a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f20854b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20853a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f20854b = i11;
        }
    }
}
