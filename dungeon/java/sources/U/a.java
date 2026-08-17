package U;

import I.AbstractC1040h0;
import I.C1021b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12598a = new ArrayList();

    private final void a(AbstractC1040h0 abstractC1040h0, Object obj) {
        c cVarB = b(abstractC1040h0, obj);
        if (cVarB != null) {
            this.f12598a.add(cVarB);
        }
    }

    private final c b(AbstractC1040h0 abstractC1040h0, Object obj) {
        String strG = abstractC1040h0.g();
        w wVarE = strG != null ? x.e(strG) : null;
        if (wVarE == null) {
            return null;
        }
        if (obj == null) {
            return new c(wVarE, null);
        }
        ArrayList arrayListE = abstractC1040h0.e();
        if (arrayListE != null) {
            int size = arrayListE.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = arrayListE.get(i10);
                if (Intrinsics.b(obj2, obj)) {
                    break;
                }
                h(obj2);
            }
        }
        return new c(wVarE, 0);
    }

    private final boolean c(AbstractC1040h0 abstractC1040h0, Object obj) {
        ArrayList arrayListE = abstractC1040h0.e();
        boolean z10 = false;
        if (arrayListE == null) {
            if (!abstractC1040h0.b()) {
                a(abstractC1040h0, null);
                return true;
            }
            int iD = abstractC1040h0.d();
            int iC = abstractC1040h0.c();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iD <= iIntValue && iIntValue < iC) || (iD == iC && obj != null && iD == number.intValue())) {
                    z10 = true;
                }
                if (z10) {
                    a(abstractC1040h0, null);
                }
            }
            return z10;
        }
        int size = arrayListE.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayListE.get(i10);
            if (obj2 instanceof C1021b) {
                if (Intrinsics.b(obj2, obj)) {
                    a(abstractC1040h0, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof AbstractC1040h0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (c((AbstractC1040h0) obj2, obj)) {
                    a(abstractC1040h0, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean e(AbstractC1040h0 abstractC1040h0) {
        String strG = abstractC1040h0.g();
        return strG != null && StringsKt.O(strG, "C", false, 2, null);
    }

    private final AbstractC1040h0 h(Object obj) {
        if (obj instanceof C1021b) {
            return g((C1021b) obj);
        }
        if (obj instanceof AbstractC1040h0) {
            return (AbstractC1040h0) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    public abstract int d(C1021b c1021b);

    public final void f(AbstractC1040h0 abstractC1040h0, Object obj) {
    }

    public abstract AbstractC1040h0 g(C1021b c1021b);

    public final List i() {
        return this.f12598a;
    }
}
