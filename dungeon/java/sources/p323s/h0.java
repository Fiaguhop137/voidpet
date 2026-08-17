package p323s;

import kotlin.jvm.internal.Intrinsics;
import p341t.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f52714a = new Object();

    public static final Object c(g0 g0Var, int i10) {
        Object obj;
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        int iA = a.a(g0Var.f52711b, g0Var.f52713d, i10);
        if (iA < 0 || (obj = g0Var.f52712c[iA]) == f52714a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(g0 g0Var) {
        int i10 = g0Var.f52713d;
        int[] iArr = g0Var.f52711b;
        Object[] objArr = g0Var.f52712c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f52714a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        g0Var.f52710a = false;
        g0Var.f52713d = i11;
    }
}
