package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2612u4 implements E5 {
    protected int zza = 0;

    protected static void g(Iterable iterable, List list) {
        AbstractC2603t4.j(iterable, list);
    }

    public final byte[] a() {
        try {
            int iB = b();
            byte[] bArr = new byte[iB];
            int i10 = N4.f32665d;
            L4 l10 = new L4(bArr, 0, iB);
            c(l10);
            l10.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    abstract int f(P5 p10);
}
