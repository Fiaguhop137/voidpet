package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class P3 extends AbstractC2514j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B9.t f32693b;

    P3(Context context, B9.t tVar) {
        this.f32692a = context;
        this.f32693b = tVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2514j4
    final Context a() {
        return this.f32692a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2514j4
    final B9.t b() {
        return this.f32693b;
    }

    public final boolean equals(Object obj) {
        B9.t tVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2514j4) {
            AbstractC2514j4 abstractC2514j4 = (AbstractC2514j4) obj;
            if (this.f32692a.equals(abstractC2514j4.a()) && ((tVar = this.f32693b) != null ? tVar.equals(abstractC2514j4.b()) : abstractC2514j4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f32692a.hashCode() ^ 1000003;
        B9.t tVar = this.f32693b;
        return (iHashCode * 1000003) ^ (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        String string = this.f32692a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f32693b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
