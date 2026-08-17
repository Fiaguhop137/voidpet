package C0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final int b(List list, int i10) {
        int i11;
        byte b10;
        int iB = ((C0852u) CollectionsKt.u0(list)).b();
        boolean z10 = false;
        if (!(i10 <= ((C0852u) CollectionsKt.u0(list)).b())) {
            H0.a.a("Index " + i10 + " should be less or equal than last line's end " + iB);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i11 = -(i12 + 1);
                break;
            }
            i11 = (i12 + size) >>> 1;
            C0852u c0852u = (C0852u) list.get(i11);
            if (c0852u.f() > i10) {
                b10 = 1;
            } else {
                b10 = c0852u.b() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i12 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            z10 = true;
        }
        if (!z10) {
            H0.a.a("Found paragraph index " + i11 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i10 + ", paragraphs=[" + Q0.a.d(list, null, null, null, 0, null, new C0845q(), 31, null) + ']');
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(C0852u c0852u) {
        return '[' + c0852u.f() + ", " + c0852u.b() + ')';
    }

    public static final int d(List list, int i10) {
        byte b10;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C0852u c0852u = (C0852u) list.get(i12);
            if (c0852u.g() > i10) {
                b10 = 1;
            } else {
                b10 = c0852u.c() <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int e(List list, float f10) {
        byte b10;
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C0852u) CollectionsKt.u0(list)).a()) {
            return CollectionsKt.n(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C0852u c0852u = (C0852u) list.get(i11);
            if (c0852u.h() > f10) {
                b10 = 1;
            } else {
                b10 = c0852u.a() <= f10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void f(List list, long j10, Function1 function1) {
        int size = list.size();
        for (int iB = b(list, N0.j(j10)); iB < size; iB++) {
            C0852u c0852u = (C0852u) list.get(iB);
            if (c0852u.f() >= N0.i(j10)) {
                return;
            }
            if (c0852u.f() != c0852u.b()) {
                function1.invoke(c0852u);
            }
        }
    }
}
