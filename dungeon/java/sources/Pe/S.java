package Pe;

import Ne.C1242p;
import Ne.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1799m;
import p015ae.h0;
import p015ae.k0;
import p069de.AbstractC3228b;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends AbstractC3228b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1242p f8932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p374ue.t f8933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1274a f8934m;

    /* JADX WARN: Illegal instructions before constructor call */
    public S(C1242p c10, p374ue.t proto, int i10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Qe.n nVarH = c10.h();
        InterfaceC1799m interfaceC1799mE = c10.e();
        p033be.h hVarB = p033be.h.f26532n1.b();
        p464ze.f fVarB = Ne.L.b(c10.g(), proto.H());
        Ne.O o10 = Ne.O.f8118a;
        ue.t.c cVarN = proto.N();
        Intrinsics.checkNotNullExpressionValue(cVarN, "getVariance(...)");
        super(nVarH, interfaceC1799mE, hVarB, fVarB, o10.d(cVarN), proto.I(), i10, h0.f19733a, k0.a.f19736a);
        this.f8932k = c10;
        this.f8933l = proto;
        this.f8934m = new C1274a(c10.h(), new Q(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(S s10) {
        return CollectionsKt.U0(s10.f8932k.c().d().j(s10.f8933l, s10.f8932k.g()));
    }

    @Override // p069de.AbstractC3234h
    protected List L0() {
        List listS = p410we.g.s(this.f8933l, this.f8932k.j());
        if (listS.isEmpty()) {
            return CollectionsKt.e(He.e.m(this).z());
        }
        X xI = this.f8932k.i();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(xI.u((p374ue.r) it.next()));
        }
        return arrayList;
    }

    @Override // p033be.b, p033be.a
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C1274a getAnnotations() {
        return this.f8934m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p069de.AbstractC3234h
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Void K0(Re.S type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
