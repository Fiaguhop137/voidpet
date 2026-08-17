package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class Q7 extends AbstractC2518k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f32709c;

    public Q7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f32709c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        try {
            return AbstractC2432a3.a(this.f32709c.call());
        } catch (Exception unused) {
            return InterfaceC2572q.f33082p1;
        }
    }
}
