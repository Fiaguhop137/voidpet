package p037c0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26753a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f26754b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26755c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f26756d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return z0.f26756d;
        }

        public final int b() {
            return z0.f26754b;
        }

        public final int c() {
            return z0.f26755c;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }
}
