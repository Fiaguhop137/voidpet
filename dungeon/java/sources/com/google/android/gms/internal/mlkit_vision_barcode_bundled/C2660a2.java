package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2660a2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f33463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private G0 f33464b;

    /* synthetic */ C2660a2(I0 i10, Z1 z10) {
        if (!(i10 instanceof C2670c2)) {
            this.f33463a = null;
            this.f33464b = (G0) i10;
            return;
        }
        C2670c2 c2670c2 = (C2670c2) i10;
        ArrayDeque arrayDeque = new ArrayDeque(c2670c2.i());
        this.f33463a = arrayDeque;
        arrayDeque.push(c2670c2);
        this.f33464b = b(c2670c2.f33470d);
    }

    private final G0 b(I0 i10) {
        while (i10 instanceof C2670c2) {
            C2670c2 c2670c2 = (C2670c2) i10;
            this.f33463a.push(c2670c2);
            i10 = c2670c2.f33470d;
        }
        return (G0) i10;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G0 next() {
        G0 g0B;
        G0 g10 = this.f33464b;
        if (g10 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f33463a;
            g0B = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            g0B = b(((C2670c2) this.f33463a.pop()).f33471e);
        } while (g0B.g() == 0);
        this.f33464b = g0B;
        return g10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33464b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
