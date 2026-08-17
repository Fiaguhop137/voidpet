package Ad;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f321a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f321a = iArr;
        }
    }

    public static Lazy a(m mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i10 = a.f321a[mode.ordinal()];
        if (i10 == 1) {
            return new t(initializer, null, 2, null);
        }
        if (i10 == 2) {
            return new s(initializer);
        }
        if (i10 == 3) {
            return new D(initializer);
        }
        throw new n();
    }

    public static Lazy b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new t(initializer, null, 2, null);
    }
}
