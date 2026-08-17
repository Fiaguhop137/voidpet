package Se;

import Re.AbstractC1388d0;
import Re.AbstractC1396h0;
import Re.C1419y;
import Re.L;
import Re.M0;
import Re.Q;
import Re.S;
import Re.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f11643a = new z();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11644a = new c("START", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11645b = new C0173a("ACCEPT_NULL", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f11646c = new d("UNKNOWN", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f11647d = new b("NOT_NULL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f11648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f11649f;

        /* JADX INFO: renamed from: Se.z$a$a, reason: collision with other inner class name */
        static final class C0173a extends a {
            C0173a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Se.z.a
            public a g(M0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return h(nextType);
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Se.z.a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public b g(M0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Se.z.a
            public a g(M0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return h(nextType);
            }
        }

        static final class d extends a {
            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // Se.z.a
            public a g(M0 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                a aVarH = h(nextType);
                return aVarH == a.f11645b ? this : aVarH;
            }
        }

        static {
            a[] aVarArrE = e();
            f11648e = aVarArrE;
            f11649f = Gd.a.a(aVarArrE);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] e() {
            return new a[]{f11644a, f11645b, f11646c, f11647d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f11648e.clone();
        }

        public abstract a g(M0 m10);

        protected final a h(M0 m10) {
            Intrinsics.checkNotNullParameter(m10, "<this>");
            if (m10.O0()) {
                return f11645b;
            }
            if (m10 instanceof C1419y) {
                ((C1419y) m10).Z0();
            }
            return r.f11637a.a(m10) ? f11647d : f11646c;
        }
    }

    /* synthetic */ class b extends AbstractC3975l implements Function2 {
        b(Object obj) {
            super(2, obj, z.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p10, S p11) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            Intrinsics.checkNotNullParameter(p11, "p1");
            return Boolean.valueOf(((z) this.receiver).g(p10, p11));
        }
    }

    /* synthetic */ class c extends AbstractC3975l implements Function2 {
        c(Object obj) {
            super(2, obj, q.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(S p10, S p11) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            Intrinsics.checkNotNullParameter(p11, "p1");
            return Boolean.valueOf(((q) this.receiver).c(p10, p11));
        }
    }

    private z() {
    }

    private final Collection c(Collection collection, Function2 function2) {
        ArrayList<AbstractC1388d0> arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC1388d0 abstractC1388d0 = (AbstractC1388d0) it.next();
            if (!arrayList.isEmpty()) {
                for (AbstractC1388d0 abstractC1388d1 : arrayList) {
                    if (abstractC1388d1 != abstractC1388d0) {
                        Intrinsics.c(abstractC1388d1);
                        Intrinsics.c(abstractC1388d0);
                        if (((Boolean) function2.invoke(abstractC1388d1, abstractC1388d0)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final AbstractC1388d0 e(Set set) {
        if (set.size() == 1) {
            return (AbstractC1388d0) CollectionsKt.E0(set);
        }
        new y(set);
        Set set2 = set;
        Collection collectionC = c(set2, new b(this));
        collectionC.isEmpty();
        AbstractC1388d0 abstractC1388d0B = Fe.q.f3075f.b(collectionC);
        if (abstractC1388d0B != null) {
            return abstractC1388d0B;
        }
        Collection collectionC2 = c(collectionC, new c(p.f11631b.a()));
        collectionC2.isEmpty();
        return collectionC2.size() < 2 ? (AbstractC1388d0) CollectionsKt.E0(collectionC2) : new Q(set2).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(Set set) {
        return "This collections cannot be empty! input types: " + CollectionsKt.s0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(S s10, S s11) {
        q qVarA = p.f11631b.a();
        return qVarA.b(s10, s11) && !qVarA.b(s11, s10);
    }

    public final AbstractC1388d0 d(List types) {
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<AbstractC1388d0> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            AbstractC1388d0 abstractC1388d0 = (AbstractC1388d0) it.next();
            if (abstractC1388d0.N0() instanceof Q) {
                Collection collectionA = abstractC1388d0.N0().a();
                Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
                Collection<S> collection = collectionA;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.w(collection, 10));
                for (S s10 : collection) {
                    Intrinsics.c(s10);
                    AbstractC1388d0 abstractC1388d0D = L.d(s10);
                    if (abstractC1388d0.O0()) {
                        abstractC1388d0D = abstractC1388d0D.R0(true);
                    }
                    arrayList2.add(abstractC1388d0D);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(abstractC1388d0);
            }
        }
        a aVarG = a.f11644a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVarG = aVarG.g((M0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC1388d0 abstractC1388d0I : arrayList) {
            if (aVarG == a.f11647d) {
                if (abstractC1388d0I instanceof i) {
                    abstractC1388d0I = AbstractC1396h0.k((i) abstractC1388d0I);
                }
                abstractC1388d0I = AbstractC1396h0.i(abstractC1388d0I, false, 1, null);
            }
            linkedHashSet.add(abstractC1388d0I);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.w(types, 10));
        Iterator it3 = types.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AbstractC1388d0) it3.next()).M0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((r0) next).p((r0) it4.next());
        }
        return e(linkedHashSet).T0((r0) next);
    }
}
