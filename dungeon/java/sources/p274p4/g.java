package p274p4;

import L4.k;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f50779e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f50780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f50781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile byte[] f50783d;

    class a implements b {
        a() {
        }

        @Override // p4.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f50782c = k.b(str);
        this.f50780a = obj;
        this.f50781b = (b) k.d(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f50779e;
    }

    private byte[] d() {
        if (this.f50783d == null) {
            this.f50783d = this.f50782c.getBytes(f.f50778a);
        }
        return this.f50783d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f50780a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f50782c.equals(((g) obj).f50782c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f50781b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f50782c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f50782c + "'}";
    }
}
