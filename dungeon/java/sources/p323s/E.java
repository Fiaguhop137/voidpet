package p323s;

import java.util.Arrays;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p341t.d;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC4112l {
    public E(int i10) {
        super(i10, null);
    }

    public /* synthetic */ E(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean f(int i10) {
        i(this.f52736b + 1);
        int[] iArr = this.f52735a;
        int i11 = this.f52736b;
        iArr[i11] = i10;
        this.f52736b = i11 + 1;
        return true;
    }

    public final boolean g(int i10, int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f52736b) {
            d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        i(this.f52736b + elements.length);
        int[] iArr = this.f52735a;
        int i11 = this.f52736b;
        if (i10 != i11) {
            AbstractC3952n.j(iArr, iArr, elements.length + i10, i10, i11);
        }
        AbstractC3952n.o(elements, iArr, i10, 0, 0, 12, null);
        this.f52736b += elements.length;
        return true;
    }

    public final void h() {
        this.f52736b = 0;
    }

    public final void i(int i10) {
        int[] iArr = this.f52735a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f52735a = iArrCopyOf;
        }
    }

    public final int j(int i10) {
        if (i10 < 0 || i10 >= this.f52736b) {
            d.c("Index must be between 0 and size");
        }
        int[] iArr = this.f52735a;
        int i11 = iArr[i10];
        int i12 = this.f52736b;
        if (i10 != i12 - 1) {
            AbstractC3952n.j(iArr, iArr, i10, i10 + 1, i12);
        }
        this.f52736b--;
        return i11;
    }

    public final void k(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f52736b) || i11 < 0 || i11 > i12) {
            d.c("Index must be between 0 and size");
        }
        if (i11 < i10) {
            d.a("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f52736b;
            if (i11 < i13) {
                int[] iArr = this.f52735a;
                AbstractC3952n.j(iArr, iArr, i10, i11, i13);
            }
            this.f52736b -= i11 - i10;
        }
    }

    public final int l(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f52736b) {
            d.c("Index must be between 0 and size");
        }
        int[] iArr = this.f52735a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }
}
