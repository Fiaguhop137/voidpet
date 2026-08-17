package p047ca;

import com.google.firebase.messaging.L;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f27306b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p047ca.a f27307a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p047ca.a f27308a = null;

        a() {
        }

        public b a() {
            return new b(this.f27308a);
        }

        public a b(p047ca.a aVar) {
            this.f27308a = aVar;
            return this;
        }
    }

    b(p047ca.a aVar) {
        this.f27307a = aVar;
    }

    public static a b() {
        return new a();
    }

    public p047ca.a a() {
        return this.f27307a;
    }

    public byte[] c() {
        return L.a(this);
    }
}
