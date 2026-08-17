package p230me;

import Qe.n;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;
import p176je.E;
import p266oe.e;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f49284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f49285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f49286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f49287d;

    public k(d components, p typeParameterResolver, Lazy delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f49284a = components;
        this.f49285b = typeParameterResolver;
        this.f49286c = delegateForDefaultTypeQualifiers;
        this.f49287d = new e(this, typeParameterResolver);
    }

    public final d a() {
        return this.f49284a;
    }

    public final E b() {
        return (E) this.f49286c.getValue();
    }

    public final Lazy c() {
        return this.f49286c;
    }

    public final H d() {
        return this.f49284a.m();
    }

    public final n e() {
        return this.f49284a.u();
    }

    public final p f() {
        return this.f49285b;
    }

    public final e g() {
        return this.f49287d;
    }
}
