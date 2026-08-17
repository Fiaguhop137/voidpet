package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21479a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21480b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21481c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21482d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f21480b;
        }

        public final int b() {
            return d.f21482d;
        }

        public final int c() {
            return d.f21481c;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }
}
