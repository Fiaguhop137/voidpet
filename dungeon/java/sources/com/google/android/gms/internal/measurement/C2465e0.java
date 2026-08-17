package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2465e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C2635x1 f32895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Y1 f32896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final C2446c f32897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V7 f32898d;

    public C2465e0() {
        C2635x1 c2635x1 = new C2635x1();
        this.f32895a = c2635x1;
        this.f32896b = c2635x1.f33175b.c();
        this.f32897c = new C2446c();
        this.f32898d = new V7();
        c2635x1.f33177d.a("internal.registerCallback", new C(this));
        c2635x1.f33177d.a("internal.eventLogger", new CallableC2428a(this));
    }

    public final void a(String str, Callable callable) {
        this.f32895a.f33177d.a(str, callable);
    }

    public final boolean b(C2437b c2437b) throws D0 {
        try {
            C2446c c2446c = this.f32897c;
            c2446c.b(c2437b);
            this.f32895a.f33176c.e("runtime.counter", new C2509j(Double.valueOf(0.0d)));
            this.f32898d.b(this.f32896b.c(), c2446c);
            return c() || d();
        } catch (Throwable th) {
            throw new D0(th);
        }
    }

    public final boolean c() {
        C2446c c2446c = this.f32897c;
        return !c2446c.c().equals(c2446c.a());
    }

    public final boolean d() {
        return !this.f32897c.f().isEmpty();
    }

    public final C2446c e() {
        return this.f32897c;
    }

    public final void f(C3 c10) throws D0 {
        AbstractC2518k abstractC2518k;
        try {
            C2635x1 c2635x1 = this.f32895a;
            this.f32896b = c2635x1.f33175b.c();
            if (c2635x1.a(this.f32896b, (G3[]) c10.C().toArray(new G3[0])) instanceof C2491h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C2653z3 c2653z3 : c10.D().C()) {
                List listD = c2653z3.D();
                String strC = c2653z3.C();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    InterfaceC2572q interfaceC2572qA = c2635x1.a(this.f32896b, (G3) it.next());
                    if (!(interfaceC2572qA instanceof C2545n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Y1 y10 = this.f32896b;
                    if (y10.d(strC)) {
                        InterfaceC2572q interfaceC2572qH = y10.h(strC);
                        if (!(interfaceC2572qH instanceof AbstractC2518k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strC)));
                        }
                        abstractC2518k = (AbstractC2518k) interfaceC2572qH;
                    } else {
                        abstractC2518k = null;
                    }
                    if (abstractC2518k == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strC)));
                    }
                    abstractC2518k.d(this.f32896b, Collections.singletonList(interfaceC2572qA));
                }
            }
        } catch (Throwable th) {
            throw new D0(th);
        }
    }

    final /* synthetic */ AbstractC2518k g() {
        return new R7(this.f32898d);
    }
}
