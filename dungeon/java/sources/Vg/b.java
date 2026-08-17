package Vg;

/* JADX INFO: loaded from: classes3.dex */
public class b extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f14364a;

    b(String str, Throwable th) {
        super(str);
        this.f14364a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f14364a;
    }
}
