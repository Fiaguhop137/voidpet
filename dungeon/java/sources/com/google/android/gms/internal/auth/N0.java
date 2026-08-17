package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class N0 extends P0 {
    /* synthetic */ N0(M0 m10) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j10) {
        ((E0) A1.f(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void b(Object obj, Object obj2, long j10) {
        E0 e0M = (E0) A1.f(obj, j10);
        E0 e10 = (E0) A1.f(obj2, j10);
        int size = e0M.size();
        int size2 = e10.size();
        if (size > 0 && size2 > 0) {
            if (!e0M.zzc()) {
                e0M = e0M.m(size2 + size);
            }
            e0M.addAll(e10);
        }
        if (size > 0) {
            e10 = e0M;
        }
        A1.p(obj, j10, e10);
    }
}
