package p176je;

import De.j;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1791e;
import p015ae.Z;
import p248ne.AbstractC4032d;

/* JADX INFO: renamed from: je.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3887s implements j {
    @Override // De.j
    public j.b a(InterfaceC1787a superDescriptor, InterfaceC1787a subDescriptor, InterfaceC1791e interfaceC1791e) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof Z) || !(superDescriptor instanceof Z)) {
            return j.b.UNKNOWN;
        }
        Z z10 = (Z) subDescriptor;
        Z z11 = (Z) superDescriptor;
        if (!Intrinsics.b(z10.getName(), z11.getName())) {
            return j.b.UNKNOWN;
        }
        if (AbstractC4032d.a(z10) && AbstractC4032d.a(z11)) {
            return j.b.OVERRIDABLE;
        }
        return (AbstractC4032d.a(z10) || AbstractC4032d.a(z11)) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }

    @Override // De.j
    public j.a b() {
        return j.a.BOTH;
    }
}
