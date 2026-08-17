package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2407s0 extends AbstractC2413u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f32453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32456e;

    /* synthetic */ C2407s0(byte[] bArr, int i10, int i11, boolean z10, AbstractC2404r0 abstractC2404r0) {
        super(null);
        this.f32456e = Integer.MAX_VALUE;
        this.f32453b = bArr;
        this.f32454c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f32456e;
        this.f32456e = 0;
        int i12 = this.f32454c + this.f32455d;
        this.f32454c = i12;
        if (i12 <= 0) {
            this.f32455d = 0;
            return i11;
        }
        this.f32455d = i12;
        this.f32454c = 0;
        return i11;
    }
}
