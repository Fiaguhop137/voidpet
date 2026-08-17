package p060d5;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    YES,
    NO,
    UNSET;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39815a;

        static {
            int[] iArr = new int[e.values().length];
            f39815a = iArr;
            try {
                iArr[e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39815a[e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39815a[e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e h(boolean z10) {
        return z10 ? YES : NO;
    }

    public boolean e() {
        int i10 = a.f39815a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public boolean g() {
        return this != UNSET;
    }
}
