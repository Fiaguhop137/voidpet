package U;

/* JADX INFO: loaded from: classes.dex */
final class t extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12618a;

    public t(String str) {
        super(str);
        this.f12618a = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f12618a;
    }
}
