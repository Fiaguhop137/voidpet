package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends AbstractC2633x {
    @Override // com.google.android.gms.internal.measurement.AbstractC2633x
    public final InterfaceC2572q a(String str, Y1 y10, List list) {
        if (str == null || str.isEmpty() || !y10.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC2572q interfaceC2572qH = y10.h(str);
        if (interfaceC2572qH instanceof AbstractC2518k) {
            return ((AbstractC2518k) interfaceC2572qH).d(y10, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
