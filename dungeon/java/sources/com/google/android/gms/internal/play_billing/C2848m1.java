package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2848m1 extends AbstractC2858o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34766d;

    /* synthetic */ C2848m1(byte[] bArr, int i10, int i11, boolean z10, AbstractC2853n1 abstractC2853n1) {
        super(null);
        this.f34766d = Integer.MAX_VALUE;
        this.f34764b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f34766d;
        this.f34766d = 0;
        int i12 = this.f34764b + this.f34765c;
        this.f34764b = i12;
        if (i12 <= 0) {
            this.f34765c = 0;
            return i11;
        }
        this.f34765c = i12;
        this.f34764b = 0;
        return i11;
    }
}
