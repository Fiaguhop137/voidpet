package Re;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;

/* JADX INFO: renamed from: Re.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1411p extends AbstractC1416v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Qe.i f11150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11151c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Re.p$a */
    final class a implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Se.g f11152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f11153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1411p f11154c;

        public a(AbstractC1411p abstractC1411p, Se.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f11154c = abstractC1411p;
            this.f11152a = kotlinTypeRefiner;
            this.f11153b = Ad.j.a(Ad.m.PUBLICATION, new C1409o(this, abstractC1411p));
        }

        private final List d() {
            return (List) this.f11153b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(a aVar, AbstractC1411p abstractC1411p) {
            return Se.h.b(aVar.f11152a, abstractC1411p.a());
        }

        @Override // Re.v0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List a() {
            return d();
        }

        public boolean equals(Object obj) {
            return this.f11154c.equals(obj);
        }

        @Override // Re.v0
        public List getParameters() {
            List parameters = this.f11154c.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f11154c.hashCode();
        }

        @Override // Re.v0
        public Xd.i n() {
            Xd.i iVarN = this.f11154c.n();
            Intrinsics.checkNotNullExpressionValue(iVarN, "getBuiltIns(...)");
            return iVarN;
        }

        @Override // Re.v0
        public v0 o(Se.g kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f11154c.o(kotlinTypeRefiner);
        }

        @Override // Re.v0
        public InterfaceC1794h p() {
            return this.f11154c.p();
        }

        @Override // Re.v0
        public boolean q() {
            return this.f11154c.q();
        }

        public String toString() {
            return this.f11154c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Re.p$b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection f11155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f11156b;

        public b(Collection allSupertypes) {
            Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
            this.f11155a = allSupertypes;
            this.f11156b = CollectionsKt.e(Te.l.f12582a.l());
        }

        public final Collection a() {
            return this.f11155a;
        }

        public final List b() {
            return this.f11156b;
        }

        public final void c(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f11156b = list;
        }
    }

    public AbstractC1411p(Qe.n storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f11150b = storageManager.f(new C1395h(this), C1397i.f11127a, new C1399j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b A(AbstractC1411p abstractC1411p) {
        return new b(abstractC1411p.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b B(boolean z10) {
        return new b(CollectionsKt.e(Te.l.f12582a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(AbstractC1411p abstractC1411p, b supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        Collection collectionA = abstractC1411p.v().a(abstractC1411p, supertypes.a(), new C1401k(abstractC1411p), new C1403l(abstractC1411p));
        if (collectionA.isEmpty()) {
            S s10 = abstractC1411p.s();
            collectionA = s10 != null ? CollectionsKt.e(s10) : null;
            if (collectionA == null) {
                collectionA = CollectionsKt.l();
            }
        }
        if (abstractC1411p.u()) {
            abstractC1411p.v().a(abstractC1411p, collectionA, new C1405m(abstractC1411p), new C1407n(abstractC1411p));
        }
        List listU0 = collectionA instanceof List ? (List) collectionA : null;
        if (listU0 == null) {
            listU0 = CollectionsKt.U0(collectionA);
        }
        supertypes.c(abstractC1411p.x(listU0));
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable D(AbstractC1411p abstractC1411p, v0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractC1411p.m(it, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(AbstractC1411p abstractC1411p, S it) {
        Intrinsics.checkNotNullParameter(it, "it");
        abstractC1411p.z(it);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(AbstractC1411p abstractC1411p, v0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return abstractC1411p.m(it, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(AbstractC1411p abstractC1411p, S it) {
        Intrinsics.checkNotNullParameter(it, "it");
        abstractC1411p.y(it);
        return Unit.f48228a;
    }

    private final Collection m(v0 v0Var, boolean z10) {
        List listC0;
        AbstractC1411p abstractC1411p = v0Var instanceof AbstractC1411p ? (AbstractC1411p) v0Var : null;
        if (abstractC1411p != null && (listC0 = CollectionsKt.C0(((b) abstractC1411p.f11150b.invoke()).a(), abstractC1411p.t(z10))) != null) {
            return listC0;
        }
        Collection collectionA = v0Var.a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        return collectionA;
    }

    @Override // Re.v0
    public v0 o(Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    protected abstract Collection r();

    protected abstract S s();

    protected Collection t(boolean z10) {
        return CollectionsKt.l();
    }

    protected boolean u() {
        return this.f11151c;
    }

    protected abstract p015ae.k0 v();

    @Override // Re.v0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public List a() {
        return ((b) this.f11150b.invoke()).b();
    }

    protected List x(List supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    protected void y(S type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    protected void z(S type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
