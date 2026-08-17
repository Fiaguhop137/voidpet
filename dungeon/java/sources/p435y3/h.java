package p435y3;

import Ad.v;
import B3.j;
import C3.c;
import K3.o;
import Q3.AbstractC1337c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import p453z3.InterfaceC4380l;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f57792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f57793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f57794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f57795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f57796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f57797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f57798g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f57799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f57800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f57801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f57802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f57803e;

        public a() {
            this.f57799a = new ArrayList();
            this.f57800b = new ArrayList();
            this.f57801c = new ArrayList();
            this.f57802d = new ArrayList();
            this.f57803e = new ArrayList();
        }

        public a(h hVar) {
            this.f57799a = CollectionsKt.W0(hVar.g());
            this.f57800b = CollectionsKt.W0(hVar.i());
            this.f57801c = CollectionsKt.W0(hVar.h());
            List listF = hVar.f();
            ArrayList arrayList = new ArrayList();
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(new C4356e((Pair) it.next()));
            }
            this.f57802d = arrayList;
            List listE = hVar.e();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new f((InterfaceC4380l.a) it2.next()));
            }
            this.f57803e = arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e(Pair pair) {
            return CollectionsKt.e(pair);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(InterfaceC4380l.a aVar) {
            return CollectionsKt.e(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List l(InterfaceC4380l.a aVar) {
            return CollectionsKt.e(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List m(j.a aVar, d dVar) {
            return CollectionsKt.e(v.a(aVar, dVar));
        }

        public final a g(j.a aVar, d dVar) {
            this.f57802d.add(new g(aVar, dVar));
            return this;
        }

        public final a h(c cVar) {
            this.f57799a.add(cVar);
            return this;
        }

        public final a i(D3.c cVar, d dVar) {
            this.f57801c.add(v.a(cVar, dVar));
            return this;
        }

        public final a j(E3.c cVar, d dVar) {
            this.f57800b.add(v.a(cVar, dVar));
            return this;
        }

        public final a k(InterfaceC4380l.a aVar) {
            this.f57803e.add(new C4355d(aVar));
            return this;
        }

        public final a n(Function0 function0) {
            this.f57803e.add(function0);
            return this;
        }

        public final a o(Function0 function0) {
            this.f57802d.add(function0);
            return this;
        }

        public final h p() {
            return new h(AbstractC1337c.c(this.f57799a), AbstractC1337c.c(this.f57800b), AbstractC1337c.c(this.f57801c), AbstractC1337c.c(this.f57802d), AbstractC1337c.c(this.f57803e), null);
        }

        public final List q() {
            return this.f57803e;
        }

        public final List r() {
            return this.f57802d;
        }
    }

    public h() {
        this(CollectionsKt.l(), CollectionsKt.l(), CollectionsKt.l(), CollectionsKt.l(), CollectionsKt.l());
    }

    private h(List list, List list2, List list3, List list4, List list5) {
        this.f57792a = list;
        this.f57793b = list2;
        this.f57794c = list3;
        this.f57795d = list4;
        this.f57796e = list5;
        this.f57797f = Ad.j.b(new C4353b(this));
        this.f57798g = Ad.j.b(new C4354c(this));
    }

    public /* synthetic */ h(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(h hVar) {
        List list = hVar.f57796e;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            CollectionsKt.B(arrayList, (List) ((Function0) list.get(i10)).invoke());
        }
        hVar.f57796e = CollectionsKt.l();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(h hVar) {
        List list = hVar.f57795d;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            CollectionsKt.B(arrayList, (List) ((Function0) list.get(i10)).invoke());
        }
        hVar.f57795d = CollectionsKt.l();
        return arrayList;
    }

    public final List e() {
        return (List) this.f57798g.getValue();
    }

    public final List f() {
        return (List) this.f57797f.getValue();
    }

    public final List g() {
        return this.f57792a;
    }

    public final List h() {
        return this.f57794c;
    }

    public final List i() {
        return this.f57793b;
    }

    public final String j(Object obj, o oVar) {
        List list = this.f57794c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            D3.c cVar = (D3.c) pair.getFirst();
            if (((d) pair.getSecond()).i(obj)) {
                Intrinsics.d(cVar, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strA = cVar.a(obj, oVar);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    public final Object k(Object obj, o oVar) {
        List list = this.f57793b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            E3.c cVar = (E3.c) pair.getFirst();
            if (((d) pair.getSecond()).i(obj)) {
                Intrinsics.d(cVar, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objA = cVar.a(obj, oVar);
                if (objA != null) {
                    obj = objA;
                }
            }
        }
        return obj;
    }

    public final a l() {
        return new a(this);
    }

    public final Pair m(B3.o oVar, o oVar2, r rVar, int i10) {
        int size = e().size();
        while (i10 < size) {
            InterfaceC4380l interfaceC4380lA = ((InterfaceC4380l.a) e().get(i10)).a(oVar, oVar2, rVar);
            if (interfaceC4380lA != null) {
                return v.a(interfaceC4380lA, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final Pair n(Object obj, o oVar, r rVar, int i10) {
        int size = f().size();
        while (i10 < size) {
            Pair pair = (Pair) f().get(i10);
            j.a aVar = (j.a) pair.getFirst();
            if (((d) pair.getSecond()).i(obj)) {
                Intrinsics.d(aVar, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                j jVarA = aVar.a(obj, oVar, rVar);
                if (jVarA != null) {
                    return v.a(jVarA, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }
}
