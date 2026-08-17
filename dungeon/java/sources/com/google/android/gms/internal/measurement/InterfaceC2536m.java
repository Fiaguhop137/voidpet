package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2536m {
    static InterfaceC2572q e(InterfaceC2536m interfaceC2536m, InterfaceC2572q interfaceC2572q, Y1 y10, List list) {
        if (interfaceC2536m.l(interfaceC2572q.zzc())) {
            InterfaceC2572q interfaceC2572qH = interfaceC2536m.h(interfaceC2572q.zzc());
            if (interfaceC2572qH instanceof AbstractC2518k) {
                return ((AbstractC2518k) interfaceC2572qH).d(y10, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2572q.zzc()));
        }
        if (!"hasOwnProperty".equals(interfaceC2572q.zzc())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2572q.zzc()));
        }
        AbstractC2652z2.a("hasOwnProperty", 1, list);
        return interfaceC2536m.l(y10.a((InterfaceC2572q) list.get(0)).zzc()) ? InterfaceC2572q.f33087u1 : InterfaceC2572q.f33088v1;
    }

    static Iterator k(Map map) {
        return new C2527l(map.keySet().iterator());
    }

    InterfaceC2572q h(String str);

    void i(String str, InterfaceC2572q interfaceC2572q);

    boolean l(String str);
}
