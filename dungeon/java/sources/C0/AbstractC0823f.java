package C0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C3951m;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0823f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0819d f1144a = new C0819d("", null, 2, null);

    /* JADX INFO: renamed from: C0.f$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cd.a.d(Integer.valueOf(((C0819d.c) obj).h()), Integer.valueOf(((C0819d.c) obj2).h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(List list, int i10, int i11) {
        if (!(i10 <= i11)) {
            H0.a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C0819d.c cVar = (C0819d.c) list.get(i12);
            if (f(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(new C0819d.c(cVar.g(), Math.max(i10, cVar.h()) - i10, Math.min(i11, cVar.f()) - i10, cVar.i()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List e(C0819d c0819d, int i10, int i11, Function1 function1) {
        List listB;
        if (i10 == i11 || (listB = c0819d.b()) == null) {
            return null;
        }
        if (i10 != 0 || i11 < c0819d.g().length()) {
            ArrayList arrayList = new ArrayList(listB.size());
            int size = listB.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0819d.c cVar = (C0819d.c) listB.get(i12);
                if ((function1 != null ? ((Boolean) function1.invoke(cVar.g())).booleanValue() : true) && f(i10, i11, cVar.h(), cVar.f())) {
                    arrayList.add(new C0819d.c((C0819d.a) cVar.g(), kotlin.ranges.e.m(cVar.h(), i10, i11) - i10, kotlin.ranges.e.m(cVar.f(), i10, i11) - i10, cVar.i()));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return listB;
        }
        ArrayList arrayList2 = new ArrayList(listB.size());
        int size2 = listB.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj = listB.get(i13);
            if (((Boolean) function1.invoke(((C0819d.c) obj).g())).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean f(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }

    public static final List g(C0819d c0819d, C0857z c0857z) {
        List listL;
        List listE = c0819d.e();
        if (listE == null || (listL = CollectionsKt.K0(listE, new a())) == null) {
            listL = CollectionsKt.l();
        }
        ArrayList arrayList = new ArrayList();
        C3951m c3951m = new C3951m();
        int size = listL.size();
        int iF = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C0819d.c cVar = (C0819d.c) listL.get(i10);
            C0819d.c cVarE = C0819d.c.e(cVar, c0857z.l((C0857z) cVar.g()), 0, 0, null, 14, null);
            while (iF < cVarE.h() && !c3951m.isEmpty()) {
                C0819d.c cVar2 = (C0819d.c) c3951m.last();
                if (cVarE.h() < cVar2.f()) {
                    arrayList.add(new C0819d.c(cVar2.g(), iF, cVarE.h()));
                    iF = cVarE.h();
                } else {
                    arrayList.add(new C0819d.c(cVar2.g(), iF, cVar2.f()));
                    iF = cVar2.f();
                    while (!c3951m.isEmpty() && iF == ((C0819d.c) c3951m.last()).f()) {
                        c3951m.removeLast();
                    }
                }
            }
            if (iF < cVarE.h()) {
                arrayList.add(new C0819d.c(c0857z, iF, cVarE.h()));
                iF = cVarE.h();
            }
            C0819d.c cVar3 = (C0819d.c) c3951m.n();
            if (cVar3 == null) {
                c3951m.add(new C0819d.c(cVarE.g(), cVarE.h(), cVarE.f()));
            } else if (cVar3.h() == cVarE.h() && cVar3.f() == cVarE.f()) {
                c3951m.removeLast();
                c3951m.add(new C0819d.c(((C0857z) cVar3.g()).l((C0857z) cVarE.g()), cVarE.h(), cVarE.f()));
            } else if (cVar3.h() == cVar3.f()) {
                arrayList.add(new C0819d.c(cVar3.g(), cVar3.h(), cVar3.f()));
                c3951m.removeLast();
                c3951m.add(new C0819d.c(cVarE.g(), cVarE.h(), cVarE.f()));
            } else {
                if (cVar3.f() < cVarE.f()) {
                    throw new IllegalArgumentException();
                }
                c3951m.add(new C0819d.c(((C0857z) cVar3.g()).l((C0857z) cVarE.g()), cVarE.h(), cVarE.f()));
            }
        }
        while (iF <= c0819d.g().length() && !c3951m.isEmpty()) {
            C0819d.c cVar4 = (C0819d.c) c3951m.last();
            arrayList.add(new C0819d.c(cVar4.g(), iF, cVar4.f()));
            iF = cVar4.f();
            while (!c3951m.isEmpty() && iF == ((C0819d.c) c3951m.last()).f()) {
                c3951m.removeLast();
            }
        }
        if (iF < c0819d.g().length()) {
            arrayList.add(new C0819d.c(c0857z, iF, c0819d.g().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C0819d.c(c0857z, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0819d h(C0819d c0819d, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = c0819d.g().substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List listE = e(c0819d, i10, i11, new C0821e());
        if (listE == null) {
            listE = CollectionsKt.l();
        }
        return new C0819d(strSubstring, listE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(C0819d.a aVar) {
        return !(aVar instanceof C0857z);
    }
}
