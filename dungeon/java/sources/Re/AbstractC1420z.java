package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Re.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1420z extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E0 f11196c;

    public AbstractC1420z(E0 substitution) {
        Intrinsics.checkNotNullParameter(substitution, "substitution");
        this.f11196c = substitution;
    }

    @Override // Re.E0
    public boolean a() {
        return this.f11196c.a();
    }

    @Override // Re.E0
    public p033be.h d(p033be.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f11196c.d(annotations);
    }

    @Override // Re.E0
    public B0 e(S key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f11196c.e(key);
    }

    @Override // Re.E0
    public boolean f() {
        return this.f11196c.f();
    }

    @Override // Re.E0
    public S g(S topLevelType, N0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f11196c.g(topLevelType, position);
    }
}
