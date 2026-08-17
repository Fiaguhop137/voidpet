package p323s;

import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p341t.d;

/* JADX INFO: loaded from: classes.dex */
public final class L extends U {
    public L(int i10) {
        super(i10, null);
    }

    public /* synthetic */ L(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean k(Object obj) {
        int i10 = this.f52646b + 1;
        Object[] objArr = this.f52645a;
        if (objArr.length < i10) {
            t(i10, objArr);
        }
        Object[] objArr2 = this.f52645a;
        int i11 = this.f52646b;
        objArr2[i11] = obj;
        this.f52646b = i11 + 1;
        return true;
    }

    public final boolean l(List elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f52646b;
        o(elements);
        return i10 != this.f52646b;
    }

    public final boolean m(U elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i10 = this.f52646b;
        p(elements);
        return i10 != this.f52646b;
    }

    public final void n() {
        AbstractC3952n.v(this.f52645a, null, 0, this.f52646b);
        this.f52646b = 0;
    }

    public final void o(List elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f52646b;
        int size = elements.size() + i10;
        Object[] objArr = this.f52645a;
        if (objArr.length < size) {
            t(size, objArr);
        }
        Object[] objArr2 = this.f52645a;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this.f52646b += elements.size();
    }

    public final void p(U elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.f()) {
            return;
        }
        int i10 = this.f52646b + elements.f52646b;
        Object[] objArr = this.f52645a;
        if (objArr.length < i10) {
            t(i10, objArr);
        }
        AbstractC3952n.l(elements.f52645a, this.f52645a, this.f52646b, 0, elements.f52646b);
        this.f52646b += elements.f52646b;
    }

    public final boolean q(Object obj) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        r(iE);
        return true;
    }

    public final Object r(int i10) {
        if (i10 < 0 || i10 >= this.f52646b) {
            j(i10);
        }
        Object[] objArr = this.f52645a;
        Object obj = objArr[i10];
        int i11 = this.f52646b;
        if (i10 != i11 - 1) {
            AbstractC3952n.l(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f52646b - 1;
        this.f52646b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void s(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f52646b) || i11 < 0 || i11 > i12) {
            d.c("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f52646b);
        }
        if (i11 < i10) {
            d.a("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            int i13 = this.f52646b;
            if (i11 < i13) {
                Object[] objArr = this.f52645a;
                AbstractC3952n.l(objArr, objArr, i10, i11, i13);
            }
            int i14 = this.f52646b;
            int i15 = i14 - (i11 - i10);
            AbstractC3952n.v(this.f52645a, null, i15, i14);
            this.f52646b = i15;
        }
    }

    public final void t(int i10, Object[] oldContent) {
        Intrinsics.checkNotNullParameter(oldContent, "oldContent");
        int length = oldContent.length;
        this.f52645a = AbstractC3952n.l(oldContent, new Object[Math.max(i10, (length * 3) / 2)], 0, 0, length);
    }

    public final Object u(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f52646b) {
            j(i10);
        }
        Object[] objArr = this.f52645a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
