package C0;

import F0.AbstractC0974h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: C0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0841o implements InterfaceC0854w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0819d f1177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f1178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f1179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f1180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f1181e;

    public C0841o(C0819d c0819d, P0 p10, List list, O0.d dVar, AbstractC0974h.b bVar) {
        this.f1177a = c0819d;
        this.f1178b = list;
        Ad.m mVar = Ad.m.NONE;
        this.f1179c = Ad.j.a(mVar, new C0837m(this));
        this.f1180d = Ad.j.a(mVar, new C0839n(this));
        C0857z c0857zN = p10.N();
        List listG = AbstractC0823f.g(c0819d, c0857zN);
        ArrayList arrayList = new ArrayList(listG.size());
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0819d.c cVar = (C0819d.c) listG.get(i10);
            C0819d c0819dH = AbstractC0823f.h(c0819d, cVar.h(), cVar.f());
            C0857z c0857zL = l((C0857z) cVar.g(), c0857zN);
            String strG = c0819dH.g();
            P0 p0H = p10.H(c0857zL);
            List listB = c0819dH.b();
            if (listB == null) {
                listB = CollectionsKt.l();
            }
            arrayList.add(new C0853v(AbstractC0855x.a(strG, p0H, listB, dVar, bVar, AbstractC0843p.b(i(), cVar.h(), cVar.f())), cVar.h(), cVar.f()));
        }
        this.f1181e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(C0841o c0841o) {
        Object obj;
        InterfaceC0854w interfaceC0854wB;
        List list = c0841o.f1181e;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fD = ((C0853v) obj2).b().d();
            int iN = CollectionsKt.n(list);
            int i10 = 1;
            if (1 <= iN) {
                while (true) {
                    Object obj3 = list.get(i10);
                    float fD2 = ((C0853v) obj3).b().d();
                    if (Float.compare(fD, fD2) < 0) {
                        obj2 = obj3;
                        fD = fD2;
                    }
                    if (i10 == iN) {
                        break;
                    }
                    i10++;
                }
            }
            obj = obj2;
        }
        C0853v c0853v = (C0853v) obj;
        if (c0853v == null || (interfaceC0854wB = c0853v.b()) == null) {
            return 0.0f;
        }
        return interfaceC0854wB.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(C0841o c0841o) {
        Object obj;
        InterfaceC0854w interfaceC0854wB;
        List list = c0841o.f1181e;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fB = ((C0853v) obj2).b().b();
            int iN = CollectionsKt.n(list);
            int i10 = 1;
            if (1 <= iN) {
                while (true) {
                    Object obj3 = list.get(i10);
                    float fB2 = ((C0853v) obj3).b().b();
                    if (Float.compare(fB, fB2) < 0) {
                        obj2 = obj3;
                        fB = fB2;
                    }
                    if (i10 == iN) {
                        break;
                    }
                    i10++;
                }
            }
            obj = obj2;
        }
        C0853v c0853v = (C0853v) obj;
        if (c0853v == null || (interfaceC0854wB = c0853v.b()) == null) {
            return 0.0f;
        }
        return interfaceC0854wB.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0857z l(C0857z c0857z, C0857z c0857z2) {
        return !M0.k.j(c0857z.i(), M0.k.f6742b.f()) ? c0857z : C0857z.b(c0857z, 0, c0857z2.i(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // C0.InterfaceC0854w
    public boolean a() {
        List list = this.f1181e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C0853v) list.get(i10)).b().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.InterfaceC0854w
    public float b() {
        return ((Number) this.f1179c.getValue()).floatValue();
    }

    @Override // C0.InterfaceC0854w
    public float d() {
        return ((Number) this.f1180d.getValue()).floatValue();
    }

    public final C0819d g() {
        return this.f1177a;
    }

    public final List h() {
        return this.f1181e;
    }

    public final List i() {
        return this.f1178b;
    }
}
