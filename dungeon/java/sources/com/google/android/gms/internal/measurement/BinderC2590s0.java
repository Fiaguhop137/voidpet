package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2590s0 extends AbstractBinderC2634x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f33128e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33129f;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d1(android.os.Bundle r2, java.lang.Class r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "AM"
            android.util.Log.w(r3, r2, r0)
            throw r0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.BinderC2590s0.d1(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle c1(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f33128e;
        synchronized (atomicReference) {
            if (!this.f33129f) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f33128e.get();
        }
        return bundle;
    }

    public final String h(long j10) {
        return (String) d1(c1(j10), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2642y0
    public final void j(Bundle bundle) {
        AtomicReference atomicReference = this.f33128e;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f33129f = true;
                    this.f33128e.notify();
                } catch (Throwable th) {
                    this.f33128e.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Long k(long j10) {
        return (Long) d1(c1(j10), Long.class);
    }
}
