package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Z4 extends AbstractC2518k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ S5 f32851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z4(C2586r5 c2586r5, String str, S5 s10) {
        super("getValue");
        this.f32851c = s10;
        Objects.requireNonNull(c2586r5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        AbstractC2652z2.a("getValue", 2, list);
        InterfaceC2572q interfaceC2572qA = y10.a((InterfaceC2572q) list.get(0));
        InterfaceC2572q interfaceC2572qA2 = y10.a((InterfaceC2572q) list.get(1));
        String strA = this.f32851c.a(interfaceC2572qA.zzc());
        return strA != null ? new C2607u(strA) : interfaceC2572qA2;
    }
}
