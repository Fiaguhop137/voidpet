package I5;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    ERROR(5),
    EMPTY_EVENT(7),
    RELEASED(8);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4951a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f4950l = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4940b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e[] f4941c = values();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4952a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.INTERMEDIATE_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4952a = iArr;
        }
    }

    e(int i10) {
        this.f4951a = i10;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = b.f4952a[ordinal()];
        if (i10 == 1) {
            return "requested";
        }
        if (i10 == 2) {
            return "success";
        }
        if (i10 == 3) {
            return "intermediate_available";
        }
        if (i10 != 4) {
            return i10 != 5 ? "unknown" : "released";
        }
        return "error";
    }
}
