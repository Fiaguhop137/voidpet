package M;

import I.T0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC3946h;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3966c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC3946h implements L.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private L.e f6647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f6648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f6649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private P.e f6651e = new P.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object[] f6652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f6653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6654h;

    public h(L.e eVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f6647a = eVar;
        this.f6648b = objArr;
        this.f6649c = objArr2;
        this.f6650d = i10;
        this.f6652f = this.f6648b;
        this.f6653g = this.f6649c;
        this.f6654h = this.f6647a.size();
    }

    private final Object[] A() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f6651e;
        return objArr;
    }

    private final Object[] B(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f6651e;
        return objArr;
    }

    private final Object[] C(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            T0.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iA = n.a(i10, i11);
        Object obj = objArr[iA];
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objC = C((Object[]) obj, i10, i11 - 5);
        if (iA < 31) {
            int i12 = iA + 1;
            if (objArr[i12] != null) {
                if (v(objArr)) {
                    AbstractC3952n.v(objArr, null, i12, 32);
                }
                objArr = AbstractC3952n.l(objArr, A(), 0, 0, i12);
            }
        }
        if (objC == objArr[iA]) {
            return objArr;
        }
        Object[] objArrX = x(objArr);
        objArrX[iA] = objC;
        return objArrX;
    }

    private final Object[] D(Object[] objArr, int i10, int i11, e eVar) {
        Object[] objArrD;
        int iA = n.a(i11 - 1, i10);
        if (i10 == 5) {
            eVar.b(objArr[iA]);
            objArrD = null;
        } else {
            Object obj = objArr[iA];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrD = D((Object[]) obj, i10 - 5, i11, eVar);
        }
        if (objArrD == null && iA == 0) {
            return null;
        }
        Object[] objArrX = x(objArr);
        objArrX[iA] = objArrD;
        return objArrX;
    }

    private final void E(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f6652f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f6653g = objArr;
            this.f6654h = i10;
            this.f6650d = i11;
            return;
        }
        e eVar = new e(null);
        Intrinsics.c(objArr);
        Object[] objArrD = D(objArr, i11, i10, eVar);
        Intrinsics.c(objArrD);
        Object objA = eVar.a();
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f6653g = (Object[]) objA;
        this.f6654h = i10;
        if (objArrD[1] == null) {
            this.f6652f = (Object[]) objArrD[0];
            this.f6650d = i11 - 5;
        } else {
            this.f6652f = objArrD;
            this.f6650d = i11;
        }
    }

    private final Object[] F(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            T0.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            T0.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrX = x(objArr);
        int iA = n.a(i10, i11);
        int i12 = i11 - 5;
        objArrX[iA] = F((Object[]) objArrX[iA], i10, i12, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrX[iA] = F((Object[]) objArrX[iA], 0, i12, it);
        }
        return objArrX;
    }

    private final Object[] G(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator itA = AbstractC3966c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f6650d;
        Object[] objArrF = i11 < (1 << i12) ? F(objArr, i10, i12, itA) : x(objArr);
        while (itA.hasNext()) {
            this.f6650d += 5;
            objArrF = B(objArrF);
            int i13 = this.f6650d;
            F(objArrF, 1 << i13, i13, itA);
        }
        return objArrF;
    }

    private final void H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f6650d;
        if (size > (1 << i10)) {
            this.f6652f = I(B(objArr), objArr2, this.f6650d + 5);
            this.f6653g = objArr3;
            this.f6650d += 5;
            this.f6654h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f6652f = objArr2;
            this.f6653g = objArr3;
            this.f6654h = size() + 1;
        } else {
            this.f6652f = I(objArr, objArr2, i10);
            this.f6653g = objArr3;
            this.f6654h = size() + 1;
        }
    }

    private final Object[] I(Object[] objArr, Object[] objArr2, int i10) {
        int iA = n.a(size() - 1, i10);
        Object[] objArrX = x(objArr);
        if (i10 == 5) {
            objArrX[iA] = objArr2;
            return objArrX;
        }
        objArrX[iA] = I((Object[]) objArrX[iA], objArr2, i10 - 5);
        return objArrX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int J(Function1 function1, Object[] objArr, int i10, int i11, e eVar, List list, List list2) {
        if (v(objArr)) {
            list.add(objArr);
        }
        Object objA = eVar.a();
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        Object[] objArrA = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i11 == 32) {
                    objArrA = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : A();
                    i11 = 0;
                }
                objArrA[i11] = obj;
                i11++;
            }
        }
        eVar.b(objArrA);
        if (objArr2 != eVar.a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    private final int L(Function1 function1, Object[] objArr, int i10, e eVar) {
        Object[] objArrX = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrX = x(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrX[i11] = obj;
                i11++;
            }
        }
        eVar.b(objArrX);
        return i11;
    }

    private final boolean M(Function1 function1) {
        Object[] objArrF;
        int iA0 = a0();
        e eVar = new e(null);
        if (this.f6652f == null) {
            return P(function1, iA0, eVar) != iA0;
        }
        ListIterator listIteratorW = w(0);
        int iL = 32;
        while (iL == 32 && listIteratorW.hasNext()) {
            iL = L(function1, (Object[]) listIteratorW.next(), 32, eVar);
        }
        if (iL == 32) {
            P.a.a(!listIteratorW.hasNext());
            int iP = P(function1, iA0, eVar);
            if (iP == 0) {
                E(this.f6652f, size(), this.f6650d);
            }
            return iP != iA0;
        }
        int iPreviousIndex = listIteratorW.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iJ = iL;
        while (listIteratorW.hasNext()) {
            iJ = J(function1, (Object[]) listIteratorW.next(), 32, iJ, eVar, arrayList2, arrayList);
        }
        int iJ2 = J(function1, this.f6653g, iA0, iJ, eVar, arrayList2, arrayList);
        Object objA = eVar.a();
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC3952n.v(objArr, null, iJ2, 32);
        if (arrayList.isEmpty()) {
            objArrF = this.f6652f;
            Intrinsics.c(objArrF);
        } else {
            objArrF = F(this.f6652f, iPreviousIndex, this.f6650d, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.f6652f = U(objArrF, size);
        this.f6653g = objArr;
        this.f6654h = size + iJ2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final int P(Function1 function1, int i10, e eVar) {
        int iL = L(function1, this.f6653g, i10, eVar);
        if (iL == i10) {
            P.a.a(eVar.a() == this.f6653g);
            return i10;
        }
        Object objA = eVar.a();
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC3952n.v(objArr, null, iL, i10);
        this.f6653g = objArr;
        this.f6654h = size() - (i10 - iL);
        return iL;
    }

    private final Object[] R(Object[] objArr, int i10, int i11, e eVar) {
        int iA = n.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iA];
            Object[] objArrL = AbstractC3952n.l(objArr, x(objArr), iA, iA + 1, 32);
            objArrL[31] = eVar.a();
            eVar.b(obj);
            return objArrL;
        }
        int iA2 = objArr[31] == null ? n.a(W() - 1, i10) : 31;
        Object[] objArrX = x(objArr);
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj2 = objArrX[iA2];
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrX[iA2] = R((Object[]) obj2, i12, 0, eVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrX[iA];
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrX[iA] = R((Object[]) obj3, i12, i11, eVar);
        return objArrX;
    }

    private final Object T(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        P.a.a(i12 < size);
        if (size == 1) {
            Object obj = this.f6653g[0];
            E(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f6653g;
        Object obj2 = objArr2[i12];
        Object[] objArrL = AbstractC3952n.l(objArr2, x(objArr2), i12, i12 + 1, size);
        objArrL[size - 1] = null;
        this.f6652f = objArr;
        this.f6653g = objArrL;
        this.f6654h = (i10 + size) - 1;
        this.f6650d = i11;
        return obj2;
    }

    private final Object[] U(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            T0.a("invalid size");
        }
        if (i10 == 0) {
            this.f6650d = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f6650d;
            if ((i11 >> i12) != 0) {
                return C(objArr, i11, i12);
            }
            this.f6650d = i12 - 5;
            Object[] objArr2 = objArr[0];
            Intrinsics.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int W() {
        if (size() <= 32) {
            return 0;
        }
        return n.d(size());
    }

    private final Object[] X(Object[] objArr, int i10, int i11, Object obj, e eVar) {
        int iA = n.a(i11, i10);
        Object[] objArrX = x(objArr);
        if (i10 != 0) {
            Object obj2 = objArrX[iA];
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrX[iA] = X((Object[]) obj2, i10 - 5, i11, obj, eVar);
            return objArrX;
        }
        if (objArrX != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.b(objArrX[iA]);
        objArrX[iA] = obj;
        return objArrX;
    }

    private final Object[] Y(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f6652f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator listIteratorW = w(W() >> 5);
        while (listIteratorW.previousIndex() != i10) {
            Object[] objArr3 = (Object[]) listIteratorW.previous();
            AbstractC3952n.l(objArr3, objArr2, 0, 32 - i11, 32);
            objArr2 = y(objArr3, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return (Object[]) listIteratorW.previous();
    }

    private final void Z(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrA;
        if (!(i12 >= 1)) {
            T0.a("requires at least one nullBuffer");
        }
        Object[] objArrX = x(objArr);
        objArr2[0] = objArrX;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC3952n.l(objArrX, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrA = objArrX;
            } else {
                objArrA = A();
                i12--;
                objArr2[i12] = objArrA;
            }
            int i16 = i11 - i15;
            AbstractC3952n.l(objArrX, objArr3, 0, i16, i11);
            AbstractC3952n.l(objArrX, objArrA, size + 1, i13, i16);
            objArr3 = objArrA;
        }
        Iterator it = collection.iterator();
        h(objArrX, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = h(A(), 0, it);
        }
        h(objArr3, 0, it);
    }

    private final int a0() {
        return c0(size());
    }

    private final int c0(int i10) {
        return i10 <= 32 ? i10 : i10 - n.d(i10);
    }

    private final Object[] g(int i10) {
        if (W() <= i10) {
            return this.f6653g;
        }
        Object[] objArr = this.f6652f;
        Intrinsics.c(objArr);
        for (int i11 = this.f6650d; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[n.a(i10, i11)];
            Intrinsics.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] h(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final void q(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        Object[] objArr3;
        if (this.f6652f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        Object[] objArrY = Y(i13, i11, objArr, i12, objArr2);
        int iW = i12 - (((W() >> 5) - 1) - i13);
        if (iW < i12) {
            Object[] objArr4 = objArr[iW];
            Intrinsics.c(objArr4);
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        Z(collection, i10, objArrY, 32, objArr, iW, objArr3);
    }

    private final Object[] s(Object[] objArr, int i10, int i11, Object obj, e eVar) {
        Object obj2;
        int iA = n.a(i11, i10);
        if (i10 == 0) {
            eVar.b(objArr[31]);
            Object[] objArrL = AbstractC3952n.l(objArr, x(objArr), iA + 1, iA, 31);
            objArrL[iA] = obj;
            return objArrL;
        }
        Object[] objArrX = x(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrX[iA];
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrX[iA] = s((Object[]) obj3, i12, i11, obj, eVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrX[iA]) == null) {
                break;
            }
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrX[iA] = s((Object[]) obj2, i12, 0, eVar.a(), eVar);
        }
        return objArrX;
    }

    private final void t(Object[] objArr, int i10, Object obj) {
        int iA0 = a0();
        Object[] objArrX = x(this.f6653g);
        if (iA0 < 32) {
            AbstractC3952n.l(this.f6653g, objArrX, i10 + 1, i10, iA0);
            objArrX[i10] = obj;
            this.f6652f = objArr;
            this.f6653g = objArrX;
            this.f6654h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f6653g;
        Object obj2 = objArr2[31];
        AbstractC3952n.l(objArr2, objArrX, i10 + 1, i10, 31);
        objArrX[i10] = obj;
        H(objArr, objArrX, B(obj2));
    }

    private final boolean v(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f6651e;
    }

    private final ListIterator w(int i10) {
        Object[] objArr = this.f6652f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iW = W() >> 5;
        P.d.b(i10, iW);
        int i11 = this.f6650d;
        return i11 == 0 ? new k(objArr, i10) : new m(objArr, i10, iW, i11 / 5);
    }

    private final Object[] x(Object[] objArr) {
        if (objArr == null) {
            return A();
        }
        return v(objArr) ? objArr : AbstractC3952n.q(objArr, A(), 0, 0, kotlin.ranges.e.i(objArr.length, 32), 6, null);
    }

    private final Object[] y(Object[] objArr, int i10) {
        return v(objArr) ? AbstractC3952n.l(objArr, objArr, i10, 0, 32 - i10) : AbstractC3952n.l(objArr, A(), i10, 0, 32 - i10);
    }

    public final boolean Q(Function1 function1) {
        boolean zM = M(function1);
        if (zM) {
            ((AbstractList) this).modCount++;
        }
        return zM;
    }

    @Override // kotlin.collections.AbstractC3946h
    public int a() {
        return this.f6654h;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        P.d.b(i10, size());
        if (i10 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iW = W();
        if (i10 >= iW) {
            t(this.f6652f, i10 - iW, obj);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f6652f;
        Intrinsics.c(objArr);
        t(s(objArr, this.f6650d, i10, obj, eVar), 0, eVar.a());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iA0 = a0();
        if (iA0 < 32) {
            Object[] objArrX = x(this.f6653g);
            objArrX[iA0] = obj;
            this.f6653g = objArrX;
            this.f6654h = size() + 1;
        } else {
            H(this.f6652f, this.f6653g, B(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        h hVar;
        Collection collection2;
        Object[] objArrL;
        Object[][] objArr;
        P.d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            P.a.a(i10 >= W());
            int i12 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr2 = this.f6653g;
            Object[] objArrL2 = AbstractC3952n.l(objArr2, x(objArr2), size2 + 1, i12, a0());
            h(objArrL2, i12, collection.iterator());
            this.f6653g = objArrL2;
            this.f6654h = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iA0 = a0();
        int iC0 = c0(size() + collection.size());
        if (i10 >= W()) {
            objArrL = A();
            objArr = objArr3;
            hVar = this;
            collection2 = collection;
            hVar.Z(collection2, i10, this.f6653g, iA0, objArr, size, objArrL);
        } else {
            hVar = this;
            collection2 = collection;
            if (iC0 > iA0) {
                int i13 = iC0 - iA0;
                Object[] objArrY = y(hVar.f6653g, i13);
                hVar.q(collection2, i10, i13, objArr3, size, objArrY);
                objArr = objArr3;
                objArrL = objArrY;
            } else {
                int i14 = iA0 - iC0;
                objArrL = AbstractC3952n.l(hVar.f6653g, A(), 0, i14, iA0);
                int i15 = 32 - i14;
                Object[] objArrY2 = y(hVar.f6653g, i15);
                int i16 = size - 1;
                objArr3[i16] = objArrY2;
                hVar.q(collection2, i10, i15, objArr3, i16, objArrY2);
                collection2 = collection2;
                objArr = objArr3;
                hVar = hVar;
            }
        }
        hVar.f6652f = G(hVar.f6652f, i11, objArr);
        hVar.f6653g = objArrL;
        hVar.f6654h = size() + collection2.size();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iA0 = a0();
        Iterator it = collection.iterator();
        if (32 - iA0 >= collection.size()) {
            this.f6653g = h(x(this.f6653g), iA0, it);
            this.f6654h = size() + collection.size();
        } else {
            int size = ((collection.size() + iA0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = h(x(this.f6653g), iA0, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = h(A(), 0, it);
            }
            this.f6652f = G(this.f6652f, W(), objArr);
            this.f6653g = h(A(), 0, it);
            this.f6654h = size() + collection.size();
        }
        return true;
    }

    @Override // L.e.a
    public L.e build() {
        L.e fVar;
        if (this.f6652f == this.f6648b && this.f6653g == this.f6649c) {
            fVar = this.f6647a;
        } else {
            this.f6651e = new P.e();
            Object[] objArr = this.f6652f;
            this.f6648b = objArr;
            Object[] objArr2 = this.f6653g;
            this.f6649c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f6652f;
                Intrinsics.c(objArr3);
                fVar = new f(objArr3, this.f6653g, size(), this.f6650d);
            } else if (objArr2.length == 0) {
                fVar = n.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f6653g, size());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                fVar = new l(objArrCopyOf);
            }
        }
        this.f6647a = fVar;
        return fVar;
    }

    @Override // kotlin.collections.AbstractC3946h
    public Object c(int i10) {
        P.d.a(i10, size());
        ((AbstractList) this).modCount++;
        int iW = W();
        if (i10 >= iW) {
            return T(this.f6652f, iW, this.f6650d, i10 - iW);
        }
        e eVar = new e(this.f6653g[0]);
        Object[] objArr = this.f6652f;
        Intrinsics.c(objArr);
        T(R(objArr, this.f6650d, i10, eVar), iW, this.f6650d, 0);
        return eVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        P.d.a(i10, size());
        return g(i10)[i10 & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    public final Object[] k() {
        return this.f6652f;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        P.d.b(i10, size());
        return new j(this, i10);
    }

    public final int n() {
        return this.f6650d;
    }

    public final Object[] p() {
        return this.f6653g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        return Q(new g(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        P.d.a(i10, size());
        if (W() > i10) {
            e eVar = new e(null);
            Object[] objArr = this.f6652f;
            Intrinsics.c(objArr);
            this.f6652f = X(objArr, this.f6650d, i10, obj, eVar);
            return eVar.a();
        }
        Object[] objArrX = x(this.f6653g);
        if (objArrX != this.f6653g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrX[i11];
        objArrX[i11] = obj;
        this.f6653g = objArrX;
        return obj2;
    }
}
