package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2182n f28975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f28976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28977c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private V5.b f28979e;

    public C(InterfaceC2182n interfaceC2182n, e0 e0Var) {
        this.f28975a = interfaceC2182n;
        this.f28976b = e0Var;
    }

    public InterfaceC2182n a() {
        return this.f28975a;
    }

    public e0 b() {
        return this.f28976b;
    }

    public long c() {
        return this.f28977c;
    }

    public g0 d() {
        return this.f28976b.h();
    }

    public int e() {
        return this.f28978d;
    }

    public V5.b f() {
        return this.f28979e;
    }

    public Uri g() {
        return this.f28976b.k().v();
    }

    public void h(long j10) {
        this.f28977c = j10;
    }

    public void i(int i10) {
        this.f28978d = i10;
    }

    public void j(V5.b bVar) {
        this.f28979e = bVar;
    }
}
