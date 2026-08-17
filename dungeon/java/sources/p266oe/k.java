package p266oe;

import Ce.n;
import Ce.w;
import Re.AbstractC1388d0;
import Re.B0;
import Re.I;
import Re.InterfaceC1386c0;
import Re.S;
import Re.r0;
import Se.e;
import Se.g;
import We.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends I implements InterfaceC1386c0 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(AbstractC1388d0 lowerBound, AbstractC1388d0 upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    private k(AbstractC1388d0 abstractC1388d0, AbstractC1388d0 abstractC1388d1, boolean z10) {
        super(abstractC1388d0, abstractC1388d1);
        if (z10) {
            return;
        }
        e.f11611a.b(abstractC1388d0, abstractC1388d1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "(raw) " + it;
    }

    private static final boolean c1(String str, String str2) {
        return Intrinsics.b(str, StringsKt.A0(str2, "out ")) || Intrinsics.b(str2, "*");
    }

    private static final List d1(n nVar, S s10) {
        List listL0 = s10.L0();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.T((B0) it.next()));
        }
        return arrayList;
    }

    private static final String e1(String str, String str2) {
        if (!StringsKt.T(str, '<', false, 2, null)) {
            return str;
        }
        return StringsKt.Z0(str, '<', null, 2, null) + '<' + str2 + '>' + StringsKt.V0(str, '>', null, 2, null);
    }

    @Override // Re.I
    public AbstractC1388d0 U0() {
        return V0();
    }

    @Override // Re.I
    public String X0(n renderer, w options) {
        Pair pair;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        String strS = renderer.S(V0());
        String strS2 = renderer.S(W0());
        if (options.i()) {
            return "raw (" + strS + ".." + strS2 + ')';
        }
        if (W0().L0().isEmpty()) {
            return renderer.P(strS, strS2, d.n(this));
        }
        List listD1 = d1(renderer, V0());
        List listD2 = d1(renderer, W0());
        String strS0 = CollectionsKt.s0(listD1, ", ", null, null, 0, null, j.f50624a, 30, null);
        List listC1 = CollectionsKt.c1(listD1, listD2);
        if (listC1 != null && listC1.isEmpty()) {
            strS2 = e1(strS2, strS0);
            break;
        }
        Iterator it = listC1.iterator();
        do {
            if (!it.hasNext()) {
                strS2 = e1(strS2, strS0);
                break;
            }
            pair = (Pair) it.next();
        } while (c1((String) pair.c(), (String) pair.d()));
        String strE1 = e1(strS, strS0);
        return Intrinsics.b(strE1, strS2) ? strE1 : renderer.P(strE1, strS2, d.n(this));
    }

    @Override // Re.M0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public k R0(boolean z10) {
        return new k(V0().R0(z10), W0().R0(z10));
    }

    @Override // Re.M0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public I X0(g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(V0());
        Intrinsics.d(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(W0());
        Intrinsics.d(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((AbstractC1388d0) sA, (AbstractC1388d0) sA2, true);
    }

    @Override // Re.M0
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public k T0(r0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new k(V0().T0(newAttributes), W0().T0(newAttributes));
    }

    @Override // Re.I, Re.S
    public Ke.k o() {
        InterfaceC1794h interfaceC1794hP = N0().p();
        InterfaceC1791e interfaceC1791e = interfaceC1794hP instanceof InterfaceC1791e ? (InterfaceC1791e) interfaceC1794hP : null;
        if (interfaceC1791e != null) {
            Ke.k kVarN = interfaceC1791e.N(new i(null, 1, null));
            Intrinsics.checkNotNullExpressionValue(kVarN, "getMemberScope(...)");
            return kVarN;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().p()).toString());
    }
}
