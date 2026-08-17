package Re;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11029e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E0 f11030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E0 f11031d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E0 a(E0 first, E0 second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (first.f()) {
                return second;
            }
            return second.f() ? first : new D(first, second, null);
        }
    }

    private D(E0 e10, E0 e11) {
        this.f11030c = e10;
        this.f11031d = e11;
    }

    public /* synthetic */ D(E0 e10, E0 e11, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, e11);
    }

    public static final E0 i(E0 e10, E0 e11) {
        return f11029e.a(e10, e11);
    }

    @Override // Re.E0
    public boolean a() {
        return this.f11030c.a() || this.f11031d.a();
    }

    @Override // Re.E0
    public boolean b() {
        return this.f11030c.b() || this.f11031d.b();
    }

    @Override // Re.E0
    public p033be.h d(p033be.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f11031d.d(this.f11030c.d(annotations));
    }

    @Override // Re.E0
    public B0 e(S key) {
        Intrinsics.checkNotNullParameter(key, "key");
        B0 b0E = this.f11030c.e(key);
        return b0E == null ? this.f11031d.e(key) : b0E;
    }

    @Override // Re.E0
    public boolean f() {
        return false;
    }

    @Override // Re.E0
    public S g(S topLevelType, N0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f11031d.g(this.f11030c.g(topLevelType, position), position);
    }
}
