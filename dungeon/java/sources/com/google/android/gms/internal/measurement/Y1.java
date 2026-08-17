package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y1 f32838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C2641y f32839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f32840c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f32841d = new HashMap();

    public Y1(Y1 y10, C2641y c2641y) {
        this.f32838a = y10;
        this.f32839b = c2641y;
    }

    public final InterfaceC2572q a(InterfaceC2572q interfaceC2572q) {
        return this.f32839b.b(this, interfaceC2572q);
    }

    public final InterfaceC2572q b(C2473f c2473f) {
        InterfaceC2572q interfaceC2572qB = InterfaceC2572q.f33082p1;
        Iterator itO = c2473f.o();
        while (itO.hasNext()) {
            interfaceC2572qB = this.f32839b.b(this, c2473f.s(((Integer) itO.next()).intValue()));
            if (interfaceC2572qB instanceof C2491h) {
                break;
            }
        }
        return interfaceC2572qB;
    }

    public final Y1 c() {
        return new Y1(this, this.f32839b);
    }

    public final boolean d(String str) {
        if (this.f32840c.containsKey(str)) {
            return true;
        }
        Y1 y10 = this.f32838a;
        if (y10 != null) {
            return y10.d(str);
        }
        return false;
    }

    public final void e(String str, InterfaceC2572q interfaceC2572q) {
        Y1 y10;
        Map map = this.f32840c;
        if (!map.containsKey(str) && (y10 = this.f32838a) != null && y10.d(str)) {
            y10.e(str, interfaceC2572q);
        } else {
            if (this.f32841d.containsKey(str)) {
                return;
            }
            if (interfaceC2572q == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC2572q);
            }
        }
    }

    public final void f(String str, InterfaceC2572q interfaceC2572q) {
        if (this.f32841d.containsKey(str)) {
            return;
        }
        if (interfaceC2572q == null) {
            this.f32840c.remove(str);
        } else {
            this.f32840c.put(str, interfaceC2572q);
        }
    }

    public final void g(String str, InterfaceC2572q interfaceC2572q) {
        f(str, interfaceC2572q);
        this.f32841d.put(str, Boolean.TRUE);
    }

    public final InterfaceC2572q h(String str) {
        Map map = this.f32840c;
        if (map.containsKey(str)) {
            return (InterfaceC2572q) map.get(str);
        }
        Y1 y10 = this.f32838a;
        if (y10 != null) {
            return y10.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
