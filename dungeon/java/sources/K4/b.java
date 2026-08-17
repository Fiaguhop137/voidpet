package K4;

import java.security.MessageDigest;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f6033b = new b();

    private b() {
    }

    public static b c() {
        return f6033b;
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
