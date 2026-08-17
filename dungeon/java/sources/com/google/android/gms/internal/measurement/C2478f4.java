package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2478f4 extends AbstractC2559o4 {
    C2478f4(C2505i4 c2505i4, String str, Boolean bool, boolean z10) {
        super(c2505i4, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2559o4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (I3.f32537c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (I3.f32538d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f33063b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + string.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(string);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
