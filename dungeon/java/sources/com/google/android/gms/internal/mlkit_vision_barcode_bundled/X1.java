package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f33400a = new ArrayDeque();

    /* synthetic */ X1(W1 w10) {
    }

    static /* bridge */ /* synthetic */ I0 a(X1 x10, I0 i10, I0 i11) {
        x10.b(i10);
        x10.b(i11);
        I0 c2670c2 = (I0) x10.f33400a.pop();
        while (!x10.f33400a.isEmpty()) {
            c2670c2 = new C2670c2((I0) x10.f33400a.pop(), c2670c2, null);
        }
        return c2670c2;
    }

    private final void b(I0 i10) {
        if (!i10.j()) {
            if (!(i10 instanceof C2670c2)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(i10.getClass())));
            }
            C2670c2 c2670c2 = (C2670c2) i10;
            b(c2670c2.f33470d);
            b(c2670c2.f33471e);
            return;
        }
        int iC = c(i10.g());
        ArrayDeque arrayDeque = this.f33400a;
        int iD = C2670c2.D(iC + 1);
        if (arrayDeque.isEmpty() || ((I0) this.f33400a.peek()).g() >= iD) {
            this.f33400a.push(i10);
            return;
        }
        int iD2 = C2670c2.D(iC);
        I0 c2670c3 = (I0) this.f33400a.pop();
        while (!this.f33400a.isEmpty() && ((I0) this.f33400a.peek()).g() < iD2) {
            c2670c3 = new C2670c2((I0) this.f33400a.pop(), c2670c3, null);
        }
        C2670c2 c2670c4 = new C2670c2(c2670c3, i10, null);
        while (!this.f33400a.isEmpty()) {
            int iC2 = c(c2670c4.g()) + 1;
            ArrayDeque arrayDeque2 = this.f33400a;
            if (((I0) arrayDeque2.peek()).g() >= C2670c2.D(iC2)) {
                break;
            } else {
                c2670c4 = new C2670c2((I0) this.f33400a.pop(), c2670c4, null);
            }
        }
        this.f33400a.push(c2670c4);
    }

    private static final int c(int i10) {
        int iBinarySearch = Arrays.binarySearch(C2670c2.f33468h, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
