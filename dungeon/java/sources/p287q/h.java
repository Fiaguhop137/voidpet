package p287q;

import android.os.CancellationSignal;
import android.util.Log;
import p128h1.d;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f51101a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CancellationSignal f51102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f51103c;

    class a implements c {
        a() {
        }

        @Override // q.h.c
        public d a() {
            return new d();
        }

        @Override // q.h.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    interface c {
        d a();

        CancellationSignal b();
    }

    h() {
    }

    void a() {
        CancellationSignal cancellationSignal = this.f51102b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            this.f51102b = null;
        }
        d dVar = this.f51103c;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.f51103c = null;
        }
    }

    CancellationSignal b() {
        if (this.f51102b == null) {
            this.f51102b = this.f51101a.b();
        }
        return this.f51102b;
    }

    d c() {
        if (this.f51103c == null) {
            this.f51103c = this.f51101a.a();
        }
        return this.f51103c;
    }
}
