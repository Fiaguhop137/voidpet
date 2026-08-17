package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class V7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TreeMap f32755a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TreeMap f32756b = new TreeMap();

    private static final int c(Y1 y10, C2563p c2563p, InterfaceC2572q interfaceC2572q) {
        InterfaceC2572q interfaceC2572qD = c2563p.d(y10, Collections.singletonList(interfaceC2572q));
        if (interfaceC2572qD instanceof C2509j) {
            return AbstractC2652z2.g(interfaceC2572qD.a().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, C2563p c2563p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f32756b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f32755a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c2563p);
    }

    public final void b(Y1 y10, C2446c c2446c) {
        A4 a10 = new A4(c2446c);
        TreeMap treeMap = this.f32755a;
        for (Integer num : treeMap.keySet()) {
            C2437b c2437bClone = c2446c.c().clone();
            int iC = c(y10, (C2563p) treeMap.get(num), a10);
            if (iC == 2 || iC == -1) {
                c2446c.d(c2437bClone);
            }
        }
        TreeMap treeMap2 = this.f32756b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(y10, (C2563p) treeMap2.get((Integer) it.next()), a10);
        }
    }
}
