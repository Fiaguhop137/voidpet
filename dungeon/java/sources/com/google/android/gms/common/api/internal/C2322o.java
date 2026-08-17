package com.google.android.gms.common.api.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2322o extends p135h8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BasePendingResult f31853a;

    public C2322o(p135h8.h hVar) {
        this.f31853a = (BasePendingResult) hVar;
    }

    @Override // p135h8.h
    public final void c(h8.h.a aVar) {
        this.f31853a.c(aVar);
    }

    @Override // p135h8.h
    public final p135h8.k d(long j10, TimeUnit timeUnit) {
        return this.f31853a.d(j10, timeUnit);
    }
}
