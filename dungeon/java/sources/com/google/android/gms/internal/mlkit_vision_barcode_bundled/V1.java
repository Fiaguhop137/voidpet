package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class V1 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C2660a2 f33392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    E0 f33393b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2670c2 f33394c;

    V1(C2670c2 c2670c2) {
        this.f33394c = c2670c2;
        this.f33392a = new C2660a2(c2670c2, null);
    }

    private final E0 a() {
        C2660a2 c2660a2 = this.f33392a;
        if (c2660a2.hasNext()) {
            return c2660a2.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33393b != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final byte zza() {
        E0 e10 = this.f33393b;
        if (e10 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = e10.zza();
        if (!this.f33393b.hasNext()) {
            this.f33393b = a();
        }
        return bZza;
    }
}
