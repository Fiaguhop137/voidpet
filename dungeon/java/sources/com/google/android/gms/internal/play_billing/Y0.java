package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y0 implements InterfaceC2799c2 {
    protected transient int zza = 0;

    protected static void d(Iterable iterable, List list) {
        byte[] bArr = M1.f34481b;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof C2839k2) {
            ((C2839k2) list).e(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = list2.get(i10);
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] a() {
        try {
            int iX = x();
            byte[] bArr = new byte[iX];
            int i10 = AbstractC2881t1.f34808c;
            C2863p1 c2863p1 = new C2863p1(bArr, 0, iX);
            b(c2863p1);
            c2863p1.a();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    abstract int c(InterfaceC2849m2 interfaceC2849m2);
}
