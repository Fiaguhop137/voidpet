package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
final class U1 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L1 f33387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f33389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33390d;

    U1(L1 l10, String str, Object[] objArr) {
        this.f33387a = l10;
        this.f33388b = str;
        this.f33389c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f33390d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f33390d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f33388b;
    }

    final Object[] b() {
        return this.f33389c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I1
    public final L1 zza() {
        return this.f33387a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I1
    public final boolean zzb() {
        return (this.f33390d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I1
    public final int zzc() {
        int i10 = this.f33390d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
