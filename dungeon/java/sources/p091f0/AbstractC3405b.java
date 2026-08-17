package p091f0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3405b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f41602a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f41603b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41604c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f41605d = d(2);

    /* JADX INFO: renamed from: f0.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC3405b.f41603b;
        }

        public final int b() {
            return AbstractC3405b.f41605d;
        }

        public final int c() {
            return AbstractC3405b.f41604c;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }
}
