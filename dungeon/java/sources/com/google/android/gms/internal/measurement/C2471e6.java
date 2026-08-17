package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2471e6 extends AbstractC2489g6 {
    C2471e6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2489g6
    public final void a(Object obj, long j10, byte b10) {
        if (AbstractC2498h6.f32938h) {
            AbstractC2498h6.d(obj, j10, b10);
        } else {
            AbstractC2498h6.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2489g6
    public final boolean b(Object obj, long j10) {
        return AbstractC2498h6.f32938h ? AbstractC2498h6.z(obj, j10) : AbstractC2498h6.A(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2489g6
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC2498h6.f32938h) {
            AbstractC2498h6.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC2498h6.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2489g6
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f32919a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2489g6
    public final void e(Object obj, long j10, float f10) {
        this.f32919a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2489g6
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f32919a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2489g6
    public final void g(Object obj, long j10, double d10) {
        this.f32919a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
