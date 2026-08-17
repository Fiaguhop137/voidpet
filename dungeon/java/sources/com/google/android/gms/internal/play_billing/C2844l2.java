package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2844l2 implements Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2799c2 f34757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f34759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f34760d;

    C2844l2(InterfaceC2799c2 interfaceC2799c2, String str, Object[] objArr) {
        this.f34757a = interfaceC2799c2;
        this.f34758b = str;
        this.f34759c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f34760d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f34760d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f34758b;
    }

    final Object[] b() {
        return this.f34759c;
    }

    @Override // com.google.android.gms.internal.play_billing.Y1
    public final InterfaceC2799c2 zza() {
        return this.f34757a;
    }

    @Override // com.google.android.gms.internal.play_billing.Y1
    public final boolean zzb() {
        return (this.f34760d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.Y1
    public final int zzc() {
        int i10 = this.f34760d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
