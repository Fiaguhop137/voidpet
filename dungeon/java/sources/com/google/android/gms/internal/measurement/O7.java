package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class O7 extends AbstractC2518k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f32687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f32688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ P7 f32689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(P7 p10, boolean z10, boolean z11) {
        super("log");
        Objects.requireNonNull(p10);
        this.f32689e = p10;
        this.f32687c = z10;
        this.f32688d = z11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        int i10;
        int i11;
        String strZzc;
        ArrayList arrayList;
        AbstractC2652z2.b("log", 1, list);
        if (list.size() == 1) {
            P7 p10 = this.f32689e;
            p10.m().a(3, y10.a((InterfaceC2572q) list.get(0)).zzc(), Collections.EMPTY_LIST, this.f32687c, this.f32688d);
            return InterfaceC2572q.f33082p1;
        }
        int iG = AbstractC2652z2.g(y10.a((InterfaceC2572q) list.get(0)).a().doubleValue());
        if (iG != 2) {
            i10 = 3;
            if (iG == 3) {
                i11 = 1;
            } else if (iG == 5) {
                i11 = 5;
            } else if (iG == 6) {
                i11 = 2;
            }
            strZzc = y10.a((InterfaceC2572q) list.get(1)).zzc();
            if (list.size() == 2) {
                P7 p11 = this.f32689e;
                p11.m().a(i11, strZzc, Collections.EMPTY_LIST, this.f32687c, this.f32688d);
                return InterfaceC2572q.f33082p1;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(y10.a((InterfaceC2572q) list.get(i12)).zzc());
            }
            this.f32689e.m().a(i11, strZzc, arrayList, this.f32687c, this.f32688d);
            return InterfaceC2572q.f33082p1;
        }
        i10 = 4;
        i11 = i10;
        strZzc = y10.a((InterfaceC2572q) list.get(1)).zzc();
        if (list.size() == 2) {
            P7 p12 = this.f32689e;
            p12.m().a(i11, strZzc, Collections.EMPTY_LIST, this.f32687c, this.f32688d);
            return InterfaceC2572q.f33082p1;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(y10.a((InterfaceC2572q) list.get(i12)).zzc());
        }
        this.f32689e.m().a(i11, strZzc, arrayList, this.f32687c, this.f32688d);
        return InterfaceC2572q.f33082p1;
    }
}
