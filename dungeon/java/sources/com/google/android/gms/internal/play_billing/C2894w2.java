package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2894w2 extends AbstractC2902y2 {
    C2894w2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2902y2
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f34824a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2902y2
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f34824a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2902y2
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC2906z2.f34836h) {
            AbstractC2906z2.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC2906z2.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2902y2
    public final void d(Object obj, long j10, byte b10) {
        if (AbstractC2906z2.f34836h) {
            AbstractC2906z2.d(obj, j10, b10);
        } else {
            AbstractC2906z2.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2902y2
    public final void e(Object obj, long j10, double d10) {
        this.f34824a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2902y2
    public final void f(Object obj, long j10, float f10) {
        this.f34824a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2902y2
    public final boolean g(Object obj, long j10) {
        return AbstractC2906z2.f34836h ? AbstractC2906z2.y(obj, j10) : AbstractC2906z2.z(obj, j10);
    }
}
