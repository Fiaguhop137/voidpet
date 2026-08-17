package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class X implements U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final U f32290c = W.f32288a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile U f32291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f32292b;

    X(U u10) {
        this.f32291a = u10;
    }

    public final String toString() {
        Object obj = this.f32291a;
        if (obj == f32290c) {
            obj = "<supplier that returned " + String.valueOf(this.f32292b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        U u10 = this.f32291a;
        U u11 = f32290c;
        if (u10 != u11) {
            synchronized (this) {
                try {
                    if (this.f32291a != u11) {
                        Object objZza = this.f32291a.zza();
                        this.f32292b = objZza;
                        this.f32291a = u11;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32292b;
    }
}
