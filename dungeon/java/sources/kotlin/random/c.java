package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f48371a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f48372b = Hd.b.f4289a.b();

    public static final class a extends c implements Serializable {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // kotlin.random.c
        public int b(int i10) {
            return c.f48372b.b(i10);
        }

        @Override // kotlin.random.c
        public int c() {
            return c.f48372b.c();
        }

        @Override // kotlin.random.c
        public int d(int i10) {
            return c.f48372b.d(i10);
        }

        @Override // kotlin.random.c
        public int e(int i10, int i11) {
            return c.f48372b.e(i10, i11);
        }
    }

    public abstract int b(int i10);

    public int c() {
        return b(32);
    }

    public int d(int i10) {
        return e(0, i10);
    }

    public int e(int i10, int i11) {
        int iC;
        int i12;
        int iB;
        d.b(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iB = b(d.c(i13));
            } else {
                do {
                    iC = c() >>> 1;
                    i12 = iC % i13;
                } while ((iC - i12) + (i13 - 1) < 0);
                iB = i12;
            }
            return i10 + iB;
        }
        while (true) {
            int iC2 = c();
            if (i10 <= iC2 && iC2 < i11) {
                return iC2;
            }
        }
    }
}
