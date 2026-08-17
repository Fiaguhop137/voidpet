package p055d0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39613a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f39614b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39615c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f39616d = d(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f39617e = d(3);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r.f39617e;
        }

        public final int b() {
            return r.f39614b;
        }

        public final int c() {
            return r.f39615c;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }
}
