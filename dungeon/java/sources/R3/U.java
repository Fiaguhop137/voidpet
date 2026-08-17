package R3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f10721b;

    public U(Object obj) {
        this.f10720a = obj;
        this.f10721b = null;
    }

    public U(Throwable th) {
        this.f10721b = th;
        this.f10720a = null;
    }

    public Throwable a() {
        return this.f10721b;
    }

    public Object b() {
        return this.f10720a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        if (b() != null && b().equals(u10.b())) {
            return true;
        }
        if (a() == null || u10.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }
}
