package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class O5 implements B5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E5 f32683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f32685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32686d;

    O5(E5 e10, String str, Object[] objArr) {
        this.f32683a = e10;
        this.f32684b = str;
        this.f32685c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f32686d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f32686d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f32684b;
    }

    final Object[] b() {
        return this.f32685c;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final boolean zza() {
        return (this.f32686d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final E5 zzb() {
        return this.f32683a;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    public final int zzc() {
        int i10 = this.f32686d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
