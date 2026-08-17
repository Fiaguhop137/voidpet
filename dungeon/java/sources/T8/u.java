package T8;

/* JADX INFO: loaded from: classes2.dex */
public enum u {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12360a;

    u(String str) {
        this.f12360a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12360a;
    }
}
