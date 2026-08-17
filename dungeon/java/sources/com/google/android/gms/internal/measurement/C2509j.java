package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2509j implements InterfaceC2572q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f32953a;

    public C2509j(Double d10) {
        if (d10 == null) {
            this.f32953a = Double.valueOf(Double.NaN);
        } else {
            this.f32953a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Double a() {
        return this.f32953a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Boolean b() {
        Double d10 = this.f32953a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final Iterator c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2509j) {
            return this.f32953a.equals(((C2509j) obj).f32953a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        return new C2509j(this.f32953a);
    }

    public final int hashCode() {
        return this.f32953a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q j(String str, Y1 y10, List list) {
        if ("toString".equals(str)) {
            return new C2607u(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2572q
    public final String zzc() {
        Double d10 = this.f32953a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalA = AbstractC2500i.a(BigDecimal.valueOf(d10.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalA.scale() > 0 ? bigDecimalA.precision() : bigDecimalA.scale()) - 1);
        String str = decimalFormat.format(bigDecimalA);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalA.toPlainString();
    }
}
