package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2694h1 implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f34226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final E2 f34227b;

    C2694h1(InterfaceC2719m1 interfaceC2719m1, int i10, E2 e10, boolean z10, boolean z11) {
        this.f34226a = i10;
        this.f34227b = e10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y0
    public final E2 a() {
        return this.f34227b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y0
    public final F2 b() {
        return this.f34227b.e();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y0
    public final boolean c() {
        return false;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f34226a - ((C2694h1) obj).f34226a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y0
    public final K1 q(K1 k10, L1 l10) {
        AbstractC2679e1 abstractC2679e1 = (AbstractC2679e1) k10;
        abstractC2679e1.e((AbstractC2704j1) l10);
        return abstractC2679e1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y0
    public final int zza() {
        return this.f34226a;
    }
}
