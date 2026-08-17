package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2563p extends AbstractC2518k implements InterfaceC2536m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List f33071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final List f33072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Y1 f33073e;

    private C2563p(C2563p c2563p) {
        super(c2563p.f32959a);
        ArrayList arrayList = new ArrayList(c2563p.f33071c.size());
        this.f33071c = arrayList;
        arrayList.addAll(c2563p.f33071c);
        ArrayList arrayList2 = new ArrayList(c2563p.f33072d.size());
        this.f33072d = arrayList2;
        arrayList2.addAll(c2563p.f33072d);
        this.f33073e = c2563p.f33073e;
    }

    public C2563p(String str, List list, List list2, Y1 y10) {
        super(str);
        this.f33071c = new ArrayList();
        this.f33073e = y10;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f33071c.add(((InterfaceC2572q) it.next()).zzc());
            }
        }
        this.f33072d = new ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        Y1 y1C = this.f33073e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f33071c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                y1C.f((String) list2.get(i10), y10.a((InterfaceC2572q) list.get(i10)));
            } else {
                y1C.f((String) list2.get(i10), InterfaceC2572q.f33082p1);
            }
            i10++;
        }
        for (InterfaceC2572q interfaceC2572q : this.f33072d) {
            InterfaceC2572q interfaceC2572qA = y1C.a(interfaceC2572q);
            if (interfaceC2572qA instanceof r) {
                interfaceC2572qA = y1C.a(interfaceC2572q);
            }
            if (interfaceC2572qA instanceof C2491h) {
                return ((C2491h) interfaceC2572qA).d();
            }
        }
        return InterfaceC2572q.f33082p1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k, com.google.android.gms.internal.measurement.InterfaceC2572q
    public final InterfaceC2572q g() {
        return new C2563p(this);
    }
}
