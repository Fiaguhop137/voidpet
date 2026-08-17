package p037c0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26724a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f26725b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26726c = c(1);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return n0.f26725b;
        }

        public final int b() {
            return n0.f26726c;
        }
    }

    public static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }
}
