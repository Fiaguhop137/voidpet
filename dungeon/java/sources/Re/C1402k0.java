package Re;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Re.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1402k0 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p015ae.m0 f11132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f11133b;

    public C1402k0(p015ae.m0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f11132a = typeParameter;
        this.f11133b = Ad.j.a(Ad.m.PUBLICATION, new C1400j0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S c(C1402k0 c1402k0) {
        return AbstractC1404l0.b(c1402k0.f11132a);
    }

    private final S e() {
        return (S) this.f11133b.getValue();
    }

    @Override // Re.B0
    public boolean a() {
        return true;
    }

    @Override // Re.B0
    public N0 b() {
        return N0.OUT_VARIANCE;
    }

    @Override // Re.B0
    public S getType() {
        return e();
    }

    @Override // Re.B0
    public B0 o(Se.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
