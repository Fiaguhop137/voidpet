package p037c0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26693a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f26694b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26695c = c(1);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Y.f26694b;
        }

        public final int b() {
            return Y.f26695c;
        }
    }

    public static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }
}
