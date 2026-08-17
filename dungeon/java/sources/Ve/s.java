package Ve;

import Re.N0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14325a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14325a = iArr;
        }
    }

    public static final v a(N0 n10) {
        Intrinsics.checkNotNullParameter(n10, "<this>");
        int i10 = a.f14325a[n10.ordinal()];
        if (i10 == 1) {
            return v.INV;
        }
        if (i10 == 2) {
            return v.IN;
        }
        if (i10 == 3) {
            return v.OUT;
        }
        throw new Ad.n();
    }
}
