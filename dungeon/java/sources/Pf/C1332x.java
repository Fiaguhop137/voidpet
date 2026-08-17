package Pf;

/* JADX INFO: renamed from: Pf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1332x extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f9171a;

    public C1332x(String str) {
        super(str);
    }

    public C1332x(String str, Throwable th) {
        super(str);
        this.f9171a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9171a;
    }
}
