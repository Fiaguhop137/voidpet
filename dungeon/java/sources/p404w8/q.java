package p404w8;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f56698a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56699b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56700c = false;

    /* synthetic */ q(byte[] bArr) {
    }

    public final q a(boolean z10) {
        this.f56698a = true;
        return this;
    }

    public final q b(boolean z10) {
        this.f56699b = true;
        return this;
    }

    public final q c(boolean z10) {
        this.f56700c = true;
        return this;
    }

    public final r d() {
        return new r(this, null);
    }

    final /* synthetic */ boolean e() {
        return this.f56698a;
    }

    final /* synthetic */ boolean f() {
        return this.f56699b;
    }

    final /* synthetic */ boolean g() {
        return this.f56700c;
    }
}
