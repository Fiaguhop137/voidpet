package com.facebook.react.modules.debug;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((Number) arrayList.get(i11)).longValue() < j10) {
                i10++;
            }
        }
        if (i10 > 0) {
            int i12 = size - i10;
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.set(i13, arrayList.get(i13 + i10));
            }
            CollectionsKt.e0(arrayList, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(ArrayList arrayList, long j10, long j11) {
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        long j12 = -1;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            long jLongValue = ((Number) next).longValue();
            if (j10 <= jLongValue && jLongValue < j11) {
                j12 = jLongValue;
            } else if (jLongValue >= j11) {
                break;
            }
        }
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ArrayList arrayList, long j10, long j11) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (j10 <= jLongValue && jLongValue < j11) {
                return true;
            }
        }
        return false;
    }
}
