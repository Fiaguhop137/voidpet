package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class H3 extends B0 {
    H3() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final void a(I3 i10, I3 i11) {
        i10.f34449b = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final void b(I3 i10, Thread thread) {
        i10.f34448a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final boolean c(K3 k10, C2789a2 c2789a2, C2789a2 c2789a3) {
        synchronized (k10) {
            try {
                if (k10.f34462b != c2789a2) {
                    return false;
                }
                k10.f34462b = c2789a3;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final boolean d(K3 k10, Object obj, Object obj2) {
        synchronized (k10) {
            try {
                if (k10.f34461a != obj) {
                    return false;
                }
                k10.f34461a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B0
    final boolean e(K3 k10, I3 i10, I3 i11) {
        synchronized (k10) {
            try {
                if (k10.f34463c != i10) {
                    return false;
                }
                k10.f34463c = i11;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
