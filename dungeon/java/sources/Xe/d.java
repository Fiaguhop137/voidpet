package Xe;

import Re.S;
import Se.e;
import kotlin.jvm.internal.Intrinsics;
import p015ae.m0;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f16477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f16478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f16479c;

    public d(m0 typeParameter, S inProjection, S outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.f16477a = typeParameter;
        this.f16478b = inProjection;
        this.f16479c = outProjection;
    }

    public final S a() {
        return this.f16478b;
    }

    public final S b() {
        return this.f16479c;
    }

    public final m0 c() {
        return this.f16477a;
    }

    public final boolean d() {
        return e.f11611a.b(this.f16478b, this.f16479c);
    }
}
