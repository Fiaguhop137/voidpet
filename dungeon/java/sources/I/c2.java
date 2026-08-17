package I;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {
    public static final void a(ArrayList arrayList) {
        arrayList.clear();
    }

    public static ArrayList b(ArrayList arrayList) {
        return arrayList;
    }

    public static /* synthetic */ ArrayList c(ArrayList arrayList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return b(arrayList);
    }

    public static final int d(ArrayList arrayList) {
        return arrayList.size();
    }

    public static final boolean e(ArrayList arrayList) {
        return arrayList.isEmpty();
    }

    public static final boolean f(ArrayList arrayList) {
        return !e(arrayList);
    }

    public static final Object g(ArrayList arrayList) {
        return arrayList.get(d(arrayList) - 1);
    }

    public static final Object h(ArrayList arrayList, int i10) {
        return arrayList.get(i10);
    }

    public static final Object i(ArrayList arrayList) {
        return arrayList.remove(d(arrayList) - 1);
    }

    public static final boolean j(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    public static final Object[] k(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = arrayList.get(i10);
        }
        return objArr;
    }
}
