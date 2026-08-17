package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2808e1 extends AbstractC2813f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2843l1 f34705c;

    C2808e1(AbstractC2843l1 abstractC2843l1) {
        Objects.requireNonNull(abstractC2843l1);
        this.f34705c = abstractC2843l1;
        this.f34703a = 0;
        this.f34704b = abstractC2843l1.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34703a < this.f34704b;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2823h1
    public final byte zza() {
        int i10 = this.f34703a;
        if (i10 >= this.f34704b) {
            throw new NoSuchElementException();
        }
        this.f34703a = i10 + 1;
        return this.f34705c.c(i10);
    }
}
