package Vg;

/* JADX INFO: loaded from: classes3.dex */
public class a extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f14363a;

    a(String str, Throwable th) {
        super(str);
        this.f14363a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f14363a;
    }
}
