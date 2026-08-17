package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2372g0 extends AbstractC2378i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32330a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2402q0 f32332c;

    C2372g0(AbstractC2402q0 abstractC2402q0) {
        this.f32332c = abstractC2402q0;
        this.f32331b = abstractC2402q0.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32330a < this.f32331b;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2387l0
    public final byte zza() {
        int i10 = this.f32330a;
        if (i10 >= this.f32331b) {
            throw new NoSuchElementException();
        }
        this.f32330a = i10 + 1;
        return this.f32332c.c(i10);
    }
}
