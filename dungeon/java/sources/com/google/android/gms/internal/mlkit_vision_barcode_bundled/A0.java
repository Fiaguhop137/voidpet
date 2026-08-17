package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class A0 extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33283a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ I0 f33285c;

    A0(I0 i10) {
        this.f33285c = i10;
        this.f33284b = i10.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33283a < this.f33284b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final byte zza() {
        int i10 = this.f33283a;
        if (i10 >= this.f33284b) {
            throw new NoSuchElementException();
        }
        this.f33283a = i10 + 1;
        return this.f33285c.c(i10);
    }
}
