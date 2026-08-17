package io.sentry.android.replay.util;

import C0.L0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45566c = L0.f1104g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L0 f45567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45568b;

    public b(L0 layout, boolean z10) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f45567a = layout;
        this.f45568b = z10;
    }

    @Override // io.sentry.android.replay.util.q
    public int a(int i10) {
        return Od.a.c(this.f45567a.v(i10));
    }

    @Override // io.sentry.android.replay.util.q
    public int b(int i10) {
        return this.f45567a.u(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int c() {
        return this.f45567a.n();
    }

    @Override // io.sentry.android.replay.util.q
    public float d(int i10, int i11) {
        float fJ = this.f45567a.j(i11, true);
        return (this.f45568b || c() != 1) ? fJ : fJ - this.f45567a.s(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int e(int i10) {
        return Od.a.c(this.f45567a.m(i10));
    }

    @Override // io.sentry.android.replay.util.q
    public Integer f() {
        return null;
    }

    @Override // io.sentry.android.replay.util.q
    public int g(int i10) {
        return this.f45567a.o(i10, true);
    }

    @Override // io.sentry.android.replay.util.q
    public int h(int i10) {
        return this.f45567a.A(i10) ? 1 : 0;
    }
}
