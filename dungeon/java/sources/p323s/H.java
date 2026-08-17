package p323s;

import java.util.Arrays;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p341t.d;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC4118s {
    public H(int i10) {
        super(i10, null);
    }

    public /* synthetic */ H(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean d(long j10) {
        g(this.f52762b + 1);
        long[] jArr = this.f52761a;
        int i10 = this.f52762b;
        jArr[i10] = j10;
        this.f52762b = i10 + 1;
        return true;
    }

    public final boolean e(int i10, long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i10 < 0 || i10 > this.f52762b) {
            d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        g(this.f52762b + elements.length);
        long[] jArr = this.f52761a;
        int i11 = this.f52762b;
        if (i10 != i11) {
            AbstractC3952n.k(jArr, jArr, elements.length + i10, i10, i11);
        }
        AbstractC3952n.p(elements, jArr, i10, 0, 0, 12, null);
        this.f52762b += elements.length;
        return true;
    }

    public final void f() {
        this.f52762b = 0;
    }

    public final void g(int i10) {
        long[] jArr = this.f52761a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f52761a = jArrCopyOf;
        }
    }

    public final long h(int i10) {
        if (i10 < 0 || i10 >= this.f52762b) {
            d.c("Index must be between 0 and size");
        }
        long[] jArr = this.f52761a;
        long j10 = jArr[i10];
        int i11 = this.f52762b;
        if (i10 != i11 - 1) {
            AbstractC3952n.k(jArr, jArr, i10, i10 + 1, i11);
        }
        this.f52762b--;
        return j10;
    }

    public final void i(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f52762b) || i11 < 0 || i11 > i12) {
            d.c("Index must be between 0 and size");
        }
        if (i11 < i10) {
            d.a("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this.f52762b;
            if (i11 < i13) {
                long[] jArr = this.f52761a;
                AbstractC3952n.k(jArr, jArr, i10, i11, i13);
            }
            this.f52762b -= i11 - i10;
        }
    }
}
