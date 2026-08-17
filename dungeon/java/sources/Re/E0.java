package Re;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11034a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E0 f11035b = new a();

    public static final class a extends E0 {
        a() {
        }

        @Override // Re.E0
        public /* bridge */ /* synthetic */ B0 e(S s10) {
            return (B0) i(s10);
        }

        @Override // Re.E0
        public boolean f() {
            return true;
        }

        public Void i(S key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c extends E0 {
        c() {
        }

        @Override // Re.E0
        public boolean a() {
            return false;
        }

        @Override // Re.E0
        public boolean b() {
            return false;
        }

        @Override // Re.E0
        public p033be.h d(p033be.h annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return E0.this.d(annotations);
        }

        @Override // Re.E0
        public B0 e(S key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return E0.this.e(key);
        }

        @Override // Re.E0
        public boolean f() {
            return E0.this.f();
        }

        @Override // Re.E0
        public S g(S topLevelType, N0 position) {
            Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
            Intrinsics.checkNotNullParameter(position, "position");
            return E0.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final G0 c() {
        G0 g0G = G0.g(this);
        Intrinsics.checkNotNullExpressionValue(g0G, "create(...)");
        return g0G;
    }

    public p033be.h d(p033be.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    public abstract B0 e(S s10);

    public boolean f() {
        return false;
    }

    public S g(S topLevelType, N0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }

    public final E0 h() {
        return new c();
    }
}
