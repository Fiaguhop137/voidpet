package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class G implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y1 f32503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32504b;

    public G(Y1 y10, String str) {
        this.f32503a = y10;
        this.f32504b = str;
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final Y1 a(InterfaceC2572q interfaceC2572q) {
        Y1 y1C = this.f32503a.c();
        y1C.f(this.f32504b, interfaceC2572q);
        return y1C;
    }
}
