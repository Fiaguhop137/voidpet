package p435y3;

import Ad.v;
import B3.j;
import B3.k;
import E3.d;
import E3.f;
import If.Q;
import Q3.InterfaceC1340f;
import Q3.h;
import Q3.s;
import Q3.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import p088ef.C3282e0;
import p088ef.L;
import p088ef.O;
import p088ef.P;
import p088ef.W0;
import p453z3.InterfaceC4380l;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    public static final class a extends kotlin.coroutines.a implements L {
        public a(L.b bVar, s sVar) {
            super(bVar);
        }

        @Override // p088ef.L
        public void L(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cd.a.d(Integer.valueOf(((h) obj2).a()), Integer.valueOf(((h) obj).a()));
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cd.a.d(Integer.valueOf(((InterfaceC1340f) obj2).a()), Integer.valueOf(((InterfaceC1340f) obj).a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O c(s sVar) {
        return P.a(W0.b(null, 1, null).P(C3282e0.c().t0()).P(new a(L.f40784y1, sVar)));
    }

    public static final h.a e(h.a aVar) {
        return aVar.j(new f(), F.b(String.class)).j(new d(), F.b(Q.class)).i(new D3.b(), F.b(C.class)).i(new D3.d(), F.b(C.class)).g(new k.a(), F.b(C.class)).g(new B3.c.a(), F.b(byte[].class));
    }

    public static final h.a f(h.a aVar, v.a aVar2) {
        if (s.a(aVar2)) {
            aVar.o(new w());
            aVar.n(new x());
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g() {
        kotlin.reflect.d dVarType;
        List listK0 = CollectionsKt.K0(z.f9371a.f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listK0.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) listK0.get(i10);
            Intrinsics.d(hVar, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            j.a aVarB = hVar.b();
            Pair pairA = null;
            if (aVarB != null && (dVarType = hVar.type()) != null) {
                pairA = v.a(aVarB, dVarType);
            }
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h() {
        List listK0 = CollectionsKt.K0(z.f9371a.e(), new c());
        ArrayList arrayList = new ArrayList();
        int size = listK0.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4380l.a aVarB = ((InterfaceC1340f) listK0.get(i10)).b();
            if (aVarB != null) {
                arrayList.add(aVarB);
            }
        }
        return arrayList;
    }
}
