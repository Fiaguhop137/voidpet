package I;

/* JADX INFO: renamed from: I.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048k extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4671a;

    public C1048k(String str) {
        this.f4671a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f4671a;
    }
}
