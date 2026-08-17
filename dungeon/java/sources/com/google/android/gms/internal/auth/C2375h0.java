package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2375h0 implements Comparator {
    C2375h0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC2402q0 abstractC2402q0 = (AbstractC2402q0) obj;
        AbstractC2402q0 abstractC2402q1 = (AbstractC2402q0) obj2;
        C2372g0 c2372g0 = new C2372g0(abstractC2402q0);
        C2372g0 c2372g1 = new C2372g0(abstractC2402q1);
        while (c2372g0.hasNext() && c2372g1.hasNext()) {
            int iCompareTo = Integer.valueOf(c2372g0.zza() & 255).compareTo(Integer.valueOf(c2372g1.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC2402q0.e()).compareTo(Integer.valueOf(abstractC2402q1.e()));
    }
}
