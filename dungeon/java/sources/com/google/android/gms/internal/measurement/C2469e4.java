package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2469e4 extends AbstractC2559o4 {
    C2469e4(C2505i4 c2505i4, String str, Long l10, boolean z10) {
        super(c2505i4, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2559o4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f33063b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
