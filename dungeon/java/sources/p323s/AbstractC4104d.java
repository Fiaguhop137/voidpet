package p323s;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;
import p341t.a;

/* JADX INFO: renamed from: s.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4104d {
    public static final void a(C4102b c4102b, int i10) {
        Intrinsics.checkNotNullParameter(c4102b, "<this>");
        c4102b.n(new int[i10]);
        c4102b.k(new Object[i10]);
    }

    public static final int b(C4102b c4102b, int i10) {
        Intrinsics.checkNotNullParameter(c4102b, "<this>");
        try {
            return a.a(c4102b.e(), c4102b.h(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C4102b c4102b, Object obj, int i10) {
        Intrinsics.checkNotNullParameter(c4102b, "<this>");
        int iH = c4102b.h();
        if (iH == 0) {
            return -1;
        }
        int iB = b(c4102b, i10);
        if (iB < 0 || Intrinsics.b(obj, c4102b.c()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iH && c4102b.e()[i11] == i10) {
            if (Intrinsics.b(obj, c4102b.c()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && c4102b.e()[i12] == i10; i12--) {
            if (Intrinsics.b(obj, c4102b.c()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(C4102b c4102b) {
        Intrinsics.checkNotNullParameter(c4102b, "<this>");
        return c(c4102b, null, 0);
    }
}
