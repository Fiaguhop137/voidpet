package p088ef;

import Ad.n;
import Ed.b;
import Ed.c;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public enum Q {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f40795f = Gd.a.a(e());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40796a;

        static {
            int[] iArr = new int[Q.values().length];
            try {
                iArr[Q.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Q.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f40796a = iArr;
        }
    }

    public final void g(Function2 function2, Object obj, b bVar) {
        int i10 = a.f40796a[ordinal()];
        if (i10 == 1) {
            p213lf.a.c(function2, obj, bVar);
            return;
        }
        if (i10 == 2) {
            c.b(function2, obj, bVar);
        } else if (i10 == 3) {
            p213lf.b.a(function2, obj, bVar);
        } else if (i10 != 4) {
            throw new n();
        }
    }

    public final boolean h() {
        return this == LAZY;
    }
}
