package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class F implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y1 f32499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32500b;

    public F(Y1 y10, String str) {
        this.f32499a = y10;
        this.f32500b = str;
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final Y1 a(InterfaceC2572q interfaceC2572q) {
        Y1 y1C = this.f32499a.c();
        y1C.g(this.f32500b, interfaceC2572q);
        return y1C;
    }
}
