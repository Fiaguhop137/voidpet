package T8;

/* JADX INFO: loaded from: classes2.dex */
public enum F {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    BACKOFF(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12340a;

    F(int i10) {
        this.f12340a = i10;
    }

    public final int zza() {
        return this.f12340a;
    }
}
