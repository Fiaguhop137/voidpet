package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class B4 extends C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ I4 f32485c;

    B4(I4 i10) {
        Objects.requireNonNull(i10);
        this.f32485c = i10;
        this.f32483a = 0;
        this.f32484b = i10.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32483a < this.f32484b;
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public final byte zza() {
        int i10 = this.f32483a;
        if (i10 >= this.f32484b) {
            throw new NoSuchElementException();
        }
        this.f32483a = i10 + 1;
        return this.f32485c.c(i10);
    }
}
