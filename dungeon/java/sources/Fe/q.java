package Fe;

import Re.AbstractC1388d0;
import Re.D0;
import Re.F0;
import Re.N0;
import Re.S;
import Re.V;
import Re.r0;
import Re.v0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3075f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f3077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f3078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1388d0 f3079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f3080e;

    public static final class a {

        /* JADX INFO: renamed from: Fe.q$a$a, reason: collision with other inner class name */
        private enum EnumC0063a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f3084d = Gd.a.a(e());
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3085a;

            static {
                int[] iArr = new int[EnumC0063a.values().length];
                try {
                    iArr[EnumC0063a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0063a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f3085a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final AbstractC1388d0 a(Collection collection, EnumC0063a enumC0063a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC1388d0 abstractC1388d0 = (AbstractC1388d0) it.next();
                next = q.f3075f.e((AbstractC1388d0) next, abstractC1388d0, enumC0063a);
            }
            return (AbstractC1388d0) next;
        }

        private final AbstractC1388d0 c(q qVar, q qVar2, EnumC0063a enumC0063a) {
            Set setO0;
            int i10 = b.f3085a[enumC0063a.ordinal()];
            if (i10 == 1) {
                setO0 = CollectionsKt.o0(qVar.g(), qVar2.g());
            } else {
                if (i10 != 2) {
                    throw new Ad.n();
                }
                setO0 = CollectionsKt.Z0(qVar.g(), qVar2.g());
            }
            return V.f(r0.f11157b.k(), new q(qVar.f3076a, qVar.f3077b, setO0, null), false);
        }

        private final AbstractC1388d0 d(q qVar, AbstractC1388d0 abstractC1388d0) {
            if (qVar.g().contains(abstractC1388d0)) {
                return abstractC1388d0;
            }
            return null;
        }

        private final AbstractC1388d0 e(AbstractC1388d0 abstractC1388d0, AbstractC1388d0 abstractC1388d1, EnumC0063a enumC0063a) {
            if (abstractC1388d0 != null && abstractC1388d1 != null) {
                v0 v0VarN0 = abstractC1388d0.N0();
                v0 v0VarN1 = abstractC1388d1.N0();
                boolean z10 = v0VarN0 instanceof q;
                if (z10 && (v0VarN1 instanceof q)) {
                    return c((q) v0VarN0, (q) v0VarN1, enumC0063a);
                }
                if (z10) {
                    return d((q) v0VarN0, abstractC1388d1);
                }
                if (v0VarN1 instanceof q) {
                    return d((q) v0VarN1, abstractC1388d0);
                }
            }
            return null;
        }

        public final AbstractC1388d0 b(Collection types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return a(types, EnumC0063a.INTERSECTION_TYPE);
        }
    }

    private q(long j10, H h10, Set set) {
        this.f3079d = V.f(r0.f11157b.k(), this, false);
        this.f3080e = Ad.j.b(new o(this));
        this.f3076a = j10;
        this.f3077b = h10;
        this.f3078c = set;
    }

    public /* synthetic */ q(long j10, H h10, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, h10, set);
    }

    private final List h() {
        return (List) this.f3080e.getValue();
    }

    private final boolean i() {
        Collection collectionA = v.a(this.f3077b);
        if ((collectionA instanceof Collection) && collectionA.isEmpty()) {
            return true;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f3078c.contains((S) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(q qVar) {
        AbstractC1388d0 abstractC1388d0Q = qVar.n().y().q();
        Intrinsics.checkNotNullExpressionValue(abstractC1388d0Q, "getDefaultType(...)");
        List listR = CollectionsKt.r(F0.f(abstractC1388d0Q, CollectionsKt.e(new D0(N0.IN_VARIANCE, qVar.f3079d)), null, 2, null));
        if (!qVar.i()) {
            listR.add(qVar.n().M());
        }
        return listR;
    }

    private final String k() {
        return '[' + CollectionsKt.s0(this.f3078c, ",", null, null, 0, null, p.f3074a, 30, null) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(S it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    @Override // Re.v0
    public Collection a() {
        return h();
    }

    public final Set g() {
        return this.f3078c;
    }

    @Override // Re.v0
    public List getParameters() {
        return CollectionsKt.l();
    }

    @Override // Re.v0
    public Xd.i n() {
        return this.f3077b.n();
    }

    @Override // Re.v0
    public v0 o(Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Re.v0
    public InterfaceC1794h p() {
        return null;
    }

    @Override // Re.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return "IntegerLiteralType" + k();
    }
}
