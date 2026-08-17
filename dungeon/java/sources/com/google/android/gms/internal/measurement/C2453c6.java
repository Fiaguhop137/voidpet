package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2453c6 extends AbstractC2435a6 {
    C2453c6() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2435a6
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        AbstractC2461d5 abstractC2461d5 = (AbstractC2461d5) obj;
        C2444b6 c2444b6 = abstractC2461d5.zzc;
        if (c2444b6 != C2444b6.a()) {
            return c2444b6;
        }
        C2444b6 c2444b6B = C2444b6.b();
        abstractC2461d5.zzc = c2444b6B;
        return c2444b6B;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2435a6
    final void b(Object obj) {
        ((AbstractC2461d5) obj).zzc.d();
    }
}
