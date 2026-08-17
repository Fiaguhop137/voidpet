package G;

import kotlin.Unit;
import p359u.AbstractC4225y;
import p359u.C4203b;
import p359u.C4222v;
import p359u.InterfaceC4210i;

/* JADX INFO: renamed from: G.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1003y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p359u.W f3709a = new p359u.W(120, 0, AbstractC4225y.c(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p359u.W f3710b = new p359u.W(150, 0, new C4222v(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p359u.W f3711c = new p359u.W(120, 0, new C4222v(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(C4203b c4203b, float f10, p431y.h hVar, p431y.h hVar2, Ed.b bVar) {
        InterfaceC4210i interfaceC4210iB;
        if (hVar2 != null) {
            interfaceC4210iB = C1002x.f3708a.a(hVar2);
        } else {
            interfaceC4210iB = hVar != null ? C1002x.f3708a.b(hVar) : null;
        }
        InterfaceC4210i interfaceC4210i = interfaceC4210iB;
        if (interfaceC4210i != null) {
            Object objF = C4203b.f(c4203b, O0.h.g(f10), interfaceC4210i, null, null, bVar, 12, null);
            return objF == Fd.b.e() ? objF : Unit.f48228a;
        }
        Object objS = c4203b.s(O0.h.g(f10), bVar);
        return objS == Fd.b.e() ? objS : Unit.f48228a;
    }
}
