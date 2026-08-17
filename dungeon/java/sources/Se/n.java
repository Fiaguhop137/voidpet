package Se;

import Re.B0;
import Re.M0;
import Re.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;
import p015ae.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Ee.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B0 f11626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function0 f11627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f11628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0 f11629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f11630e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(B0 projection, List supertypes, n nVar) {
        this(projection, new k(supertypes), nVar, null, 8, null);
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
    }

    public /* synthetic */ n(B0 b10, List list, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, list, (i10 & 4) != 0 ? null : nVar);
    }

    public n(B0 projection, Function0 function0, n nVar, m0 m0Var) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f11626a = projection;
        this.f11627b = function0;
        this.f11628c = nVar;
        this.f11629d = m0Var;
        this.f11630e = Ad.j.a(Ad.m.PUBLICATION, new j(this));
    }

    public /* synthetic */ n(B0 b10, Function0 function0, n nVar, m0 m0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, (i10 & 2) != 0 ? null : function0, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : m0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(n nVar) {
        Function0 function0 = nVar.f11627b;
        if (function0 != null) {
            return (List) function0.invoke();
        }
        return null;
    }

    private final List j() {
        return (List) this.f11630e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(n nVar, g gVar) {
        List listA = nVar.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((M0) it.next()).X0(gVar));
        }
        return arrayList;
    }

    @Override // Ee.b
    public B0 b() {
        return this.f11626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f11628c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f11628c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // Re.v0
    public List getParameters() {
        return CollectionsKt.l();
    }

    public int hashCode() {
        n nVar = this.f11628c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    @Override // Re.v0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public List a() {
        List listJ = j();
        return listJ == null ? CollectionsKt.l() : listJ;
    }

    public final void k(List supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        this.f11627b = new l(supertypes);
    }

    @Override // Re.v0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public n o(g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        B0 b0O = b().o(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(b0O, "refine(...)");
        m mVar = this.f11627b != null ? new m(this, kotlinTypeRefiner) : null;
        n nVar = this.f11628c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(b0O, mVar, nVar, this.f11629d);
    }

    @Override // Re.v0
    public Xd.i n() {
        S type = b().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return We.d.n(type);
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
        return "CapturedType(" + b() + ')';
    }
}
