package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2633x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f33173a = new ArrayList();

    protected AbstractC2633x() {
    }

    public abstract InterfaceC2572q a(String str, Y1 y10, List list);

    final InterfaceC2572q b(String str) {
        if (this.f33173a.contains(AbstractC2652z2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
