package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class J4 extends K4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32552d;

    /* synthetic */ J4(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f32552d = Integer.MAX_VALUE;
        this.f32550b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f32552d;
        this.f32552d = 0;
        int i12 = this.f32550b + this.f32551c;
        this.f32550b = i12;
        if (i12 <= 0) {
            this.f32551c = 0;
            return i11;
        }
        this.f32551c = i12;
        this.f32550b = 0;
        return i11;
    }
}
