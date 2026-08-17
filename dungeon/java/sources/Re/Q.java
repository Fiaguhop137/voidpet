package Re;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements v0, Ve.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private S f11078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f11079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11080c;

    public static final class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f11081a;

        public a(Function1 function1) {
            this.f11081a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            S s10 = (S) obj;
            Function1 function1 = this.f11081a;
            Intrinsics.c(s10);
            String string = function1.invoke(s10).toString();
            S s11 = (S) obj2;
            Function1 function2 = this.f11081a;
            Intrinsics.c(s11);
            return Cd.a.d(string, function2.invoke(s11).toString());
        }
    }

    public Q(Collection typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f11079b = linkedHashSet;
        this.f11080c = linkedHashSet.hashCode();
    }

    private Q(Collection collection, S s10) {
        this(collection);
        this.f11078a = s10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1388d0 h(Q q10, Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return q10.o(kotlinTypeRefiner).g();
    }

    public static /* synthetic */ String k(Q q10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = O.f11076a;
        }
        return q10.j(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(S it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Function1 function1, S s10) {
        Intrinsics.c(s10);
        return function1.invoke(s10).toString();
    }

    @Override // Re.v0
    public Collection a() {
        return this.f11079b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q) {
            return Intrinsics.b(this.f11079b, ((Q) obj).f11079b);
        }
        return false;
    }

    public final Ke.k f() {
        return Ke.x.f6245d.a("member scope for intersection type", this.f11079b);
    }

    public final AbstractC1388d0 g() {
        return V.n(r0.f11157b.k(), this, CollectionsKt.l(), false, f(), new P(this));
    }

    @Override // Re.v0
    public List getParameters() {
        return CollectionsKt.l();
    }

    public int hashCode() {
        return this.f11080c;
    }

    public final S i() {
        return this.f11078a;
    }

    public final String j(Function1 getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.s0(CollectionsKt.K0(this.f11079b, new a(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new N(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // Re.v0
    public Xd.i n() {
        Xd.i iVarN = ((S) this.f11079b.iterator().next()).N0().n();
        Intrinsics.checkNotNullExpressionValue(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    @Override // Re.v0
    public InterfaceC1794h p() {
        return null;
    }

    @Override // Re.v0
    public boolean q() {
        return false;
    }

    @Override // Re.v0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Q o(Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection collectionA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(collectionA, 10));
        Iterator it = collectionA.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((S) it.next()).X0(kotlinTypeRefiner));
            z10 = true;
        }
        Q qS = null;
        if (z10) {
            S sI = i();
            qS = new Q(arrayList).s(sI != null ? sI.X0(kotlinTypeRefiner) : null);
        }
        return qS == null ? this : qS;
    }

    public final Q s(S s10) {
        return new Q(this.f11079b, s10);
    }

    public String toString() {
        return k(this, null, 1, null);
    }
}
