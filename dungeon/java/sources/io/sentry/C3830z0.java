package io.sentry;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: io.sentry.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3830z0 implements InterfaceC3729k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.c f46709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3825y0 f46710b;

    public C3830z0(Writer writer, int i10) {
        this.f46709a = new io.sentry.vendor.gson.stream.c(writer);
        this.f46710b = new C3825y0(i10);
    }

    @Override // io.sentry.InterfaceC3729k1
    public void Q(boolean z10) {
        this.f46709a.Q(z10);
    }

    @Override // io.sentry.InterfaceC3729k1
    public String f() {
        return this.f46709a.h();
    }

    @Override // io.sentry.InterfaceC3729k1
    public InterfaceC3729k1 g(String str) throws IOException {
        this.f46709a.i(str);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    public void h(String str) {
        this.f46709a.u(str);
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3830z0 N() throws IOException {
        this.f46709a.c();
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3830z0 I() throws IOException {
        this.f46709a.d();
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3830z0 J() {
        this.f46709a.f();
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C3830z0 T() {
        this.f46709a.g();
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C3830z0 d(String str) {
        this.f46709a.k(str);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C3830z0 l() throws IOException {
        this.f46709a.o();
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C3830z0 b(double d10) throws IOException {
        this.f46709a.z(d10);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public C3830z0 a(long j10) throws IOException {
        this.f46709a.F(j10);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public C3830z0 j(ILogger iLogger, Object obj) {
        this.f46710b.a(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C3830z0 k(Boolean bool) throws IOException {
        this.f46709a.G(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C3830z0 i(Number number) throws IOException {
        this.f46709a.K(number);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C3830z0 e(String str) throws IOException {
        this.f46709a.L(str);
        return this;
    }

    @Override // io.sentry.InterfaceC3729k1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C3830z0 c(boolean z10) throws IOException {
        this.f46709a.O(z10);
        return this;
    }
}
