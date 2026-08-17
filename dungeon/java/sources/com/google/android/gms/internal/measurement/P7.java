package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class P7 extends AbstractC2518k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2615u7 f32697c;

    public P7(InterfaceC2615u7 interfaceC2615u7) {
        super("internal.logger");
        this.f32697c = interfaceC2615u7;
        this.f32960b.put("log", new O7(this, false, true));
        this.f32960b.put("silent", new C2596s6(this, "silent"));
        ((AbstractC2518k) this.f32960b.get("silent")).i("log", new O7(this, true, true));
        this.f32960b.put("unmonitored", new T6(this, "unmonitored"));
        ((AbstractC2518k) this.f32960b.get("unmonitored")).i("log", new O7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        return InterfaceC2572q.f33082p1;
    }

    final /* synthetic */ InterfaceC2615u7 m() {
        return this.f32697c;
    }
}
