package p214lg;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f48748d = new c("dilithium2", 2, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f48749e = new c("dilithium3", 3, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f48750f = new c("dilithium5", 5, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f48753c;

    private c(String str, int i10, boolean z10) {
        this.f48752b = str;
        this.f48751a = i10;
        this.f48753c = z10;
    }

    a a(SecureRandom secureRandom) {
        return new a(this.f48751a, secureRandom, this.f48753c);
    }

    public String b() {
        return this.f48752b;
    }
}
