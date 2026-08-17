package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class V implements Serializable, U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final U f32283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile transient boolean f32284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object f32285c;

    V(U u10) {
        this.f32283a = u10;
    }

    public final String toString() {
        Object obj;
        if (this.f32284b) {
            obj = "<supplier that returned " + String.valueOf(this.f32285c) + ">";
        } else {
            obj = this.f32283a;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        if (!this.f32284b) {
            synchronized (this) {
                try {
                    if (!this.f32284b) {
                        Object objZza = this.f32283a.zza();
                        this.f32285c = objZza;
                        this.f32284b = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32285c;
    }
}
