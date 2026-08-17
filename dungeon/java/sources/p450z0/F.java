package p450z0;

import O0.t;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o;
import p019b0.g;
import p323s.AbstractC4114n;
import p323s.AbstractC4115o;
import p324s0.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator[] f58226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f58227b;

    static final class a extends o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58228a = new a();

        /* JADX INFO: renamed from: z0.F$a$a, reason: collision with other inner class name */
        static final class C0759a extends o implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0759a f58229a = new C0759a();

            C0759a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        static final class b extends o implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f58230a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(r rVar, r rVar2) {
            SemanticsConfiguration semanticsConfigurationY = rVar.y();
            w wVar = w.f58331a;
            return Integer.valueOf(Float.compare(((Number) semanticsConfigurationY.n(wVar.K(), C0759a.f58229a)).floatValue(), ((Number) rVar2.y().n(wVar.K(), b.f58230a)).floatValue()));
        }
    }

    static final class b extends o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58231a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class c implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f58232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f58233b;

        public c(Comparator comparator, Comparator comparator2) {
            this.f58232a = comparator;
            this.f58233b = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f58232a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : this.f58233b.compare(((r) obj).s(), ((r) obj2).s());
        }
    }

    public static final class d implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f58234a;

        public d(Comparator comparator) {
            this.f58234a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f58234a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : Cd.a.d(Integer.valueOf(((r) obj).q()), Integer.valueOf(((r) obj2).q()));
        }
    }

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new d(new c(i10 == 0 ? h.f58262a : C4366e.f58245a, I.f52823S.b()));
            i10++;
        }
        f58226a = comparatorArr;
        f58227b = a.f58228a;
    }

    private static final void b(r rVar, ArrayList arrayList, Function1 function1, Function1 function2, p323s.F f10) {
        boolean zBooleanValue = ((Boolean) rVar.y().n(w.f58331a.t(), b.f58231a)).booleanValue();
        if ((zBooleanValue || ((Boolean) function2.invoke(rVar)).booleanValue()) && ((Boolean) function1.invoke(rVar)).booleanValue()) {
            arrayList.add(rVar);
        }
        if (zBooleanValue) {
            f10.q(rVar.q(), f(rVar, function1, function2, rVar.m()));
            return;
        }
        List listM = rVar.m();
        int size = listM.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((r) listM.get(i10), arrayList, function1, function2, f10);
        }
    }

    private static final boolean c(ArrayList arrayList, r rVar) {
        float fH = rVar.l().h();
        float fC = rVar.l().c();
        boolean z10 = fH >= fC;
        int iN = CollectionsKt.n(arrayList);
        if (iN >= 0) {
            int i10 = 0;
            while (true) {
                g gVar = (g) ((Pair) arrayList.get(i10)).c();
                boolean z11 = gVar.h() >= gVar.c();
                if (!z10 && !z11 && Math.max(fH, gVar.h()) < Math.min(fC, gVar.c())) {
                    arrayList.set(i10, new Pair(gVar.i(0.0f, fH, Float.POSITIVE_INFINITY, fC), ((Pair) arrayList.get(i10)).d()));
                    ((List) ((Pair) arrayList.get(i10)).d()).add(rVar);
                    return true;
                }
                if (i10 != iN) {
                    i10++;
                }
            }
        }
        return false;
    }

    public static final List d(r rVar, List list, Function1 function1, AbstractC4114n abstractC4114n) {
        int size = 0;
        char c10 = rVar.r().getLayoutDirection() == t.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int iN = CollectionsKt.n(list);
        if (iN >= 0) {
            int i10 = 0;
            while (true) {
                r rVar2 = (r) list.get(i10);
                if (i10 == 0 || !c(arrayList, rVar2)) {
                    arrayList.add(new Pair(rVar2.l(), CollectionsKt.r(rVar2)));
                }
                if (i10 == iN) {
                    break;
                }
                i10++;
            }
        }
        CollectionsKt.A(arrayList, G.f58235a);
        ArrayList arrayList2 = new ArrayList();
        Comparator comparator = f58226a[c10 ^ 1];
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Pair pair = (Pair) arrayList.get(i11);
            CollectionsKt.A((List) pair.d(), comparator);
            arrayList2.addAll((Collection) pair.d());
        }
        CollectionsKt.A(arrayList2, new E(f58227b));
        while (size <= CollectionsKt.n(arrayList2)) {
            List list2 = (List) abstractC4114n.b(((r) arrayList2.get(size)).q());
            if (list2 != null) {
                if (((Boolean) function1.invoke(arrayList2.get(size))).booleanValue()) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, list2);
                size += list2.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final List f(r rVar, Function1 function1, Function1 function2, List list) {
        p323s.F fC = AbstractC4115o.c();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((r) list.get(i10), arrayList, function1, function2, fC);
        }
        return d(rVar, arrayList, function2, fC);
    }
}
