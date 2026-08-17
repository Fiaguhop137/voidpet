package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class L0 extends P0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f32239c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ L0(K0 k10) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) A1.f(obj, j10);
        if (list instanceof J0) {
            objUnmodifiableList = ((J0) list).b();
        } else if (f32239c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        A1.p(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void b(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        List list3 = (List) A1.f(obj2, j10);
        int size = list3.size();
        List list4 = (List) A1.f(obj, j10);
        if (list4.isEmpty()) {
            List i10 = list4 instanceof J0 ? new I0(size) : new ArrayList(size);
            A1.p(obj, j10, i10);
            list2 = i10;
        } else {
            if (f32239c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                A1.p(obj, j10, arrayList);
                list = arrayList;
            } else if (list4 instanceof C2417v1) {
                list2 = list4;
                I0 i11 = new I0(list4.size() + size);
                i11.addAll(i11.size(), (C2417v1) list4);
                A1.p(obj, j10, i11);
                list = i11;
            }
            list2 = list;
        }
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        A1.p(obj, j10, list3);
    }
}
