package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC2332z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p135h8.e f31768c;

    public L(p135h8.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f31768c = eVar;
    }

    @Override // p135h8.f
    public final AbstractC2311d a(AbstractC2311d abstractC2311d) {
        return this.f31768c.h(abstractC2311d);
    }

    @Override // p135h8.f
    public final AbstractC2311d b(AbstractC2311d abstractC2311d) {
        return this.f31768c.j(abstractC2311d);
    }

    @Override // p135h8.f
    public final Looper d() {
        return this.f31768c.q();
    }
}
