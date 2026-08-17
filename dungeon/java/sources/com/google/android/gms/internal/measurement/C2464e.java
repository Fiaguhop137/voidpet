package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2464e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2473f f32894b;

    C2464e(C2473f c2473f) {
        Objects.requireNonNull(c2473f);
        this.f32894b = c2473f;
        this.f32893a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32893a < this.f32894b.p();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C2473f c2473f = this.f32894b;
        if (this.f32893a < c2473f.p()) {
            int i10 = this.f32893a;
            this.f32893a = i10 + 1;
            return c2473f.s(i10);
        }
        int i11 = this.f32893a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
