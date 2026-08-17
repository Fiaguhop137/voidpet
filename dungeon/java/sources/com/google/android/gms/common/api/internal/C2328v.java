package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2328v implements h8.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f31861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2330x f31862b;

    C2328v(C2330x c2330x, BasePendingResult basePendingResult) {
        this.f31862b = c2330x;
        this.f31861a = basePendingResult;
    }

    @Override // h8.h.a
    public final void a(Status status) {
        this.f31862b.f31865a.remove(this.f31861a);
    }
}
