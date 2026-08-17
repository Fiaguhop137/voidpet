package p180k0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47765a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f47766b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47767c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47768d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return c.f47768d;
        }

        public final int b() {
            return c.f47767c;
        }

        public final int c() {
            return c.f47766b;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }
}
