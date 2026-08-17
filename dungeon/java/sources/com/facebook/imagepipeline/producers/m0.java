package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 extends T4.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2182n f29193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f29194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f29195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29196e;

    public m0(InterfaceC2182n consumer, g0 producerListener, e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.f29193b = consumer;
        this.f29194c = producerListener;
        this.f29195d = producerContext;
        this.f29196e = producerName;
        producerListener.d(producerContext, producerName);
    }

    @Override // T4.h
    protected void d() {
        g0 g0Var = this.f29194c;
        e0 e0Var = this.f29195d;
        String str = this.f29196e;
        g0Var.c(e0Var, str, g0Var.f(e0Var, str) ? g() : null);
        this.f29193b.a();
    }

    @Override // T4.h
    protected void e(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        g0 g0Var = this.f29194c;
        e0 e0Var = this.f29195d;
        String str = this.f29196e;
        g0Var.k(e0Var, str, e10, g0Var.f(e0Var, str) ? h(e10) : null);
        this.f29193b.onFailure(e10);
    }

    @Override // T4.h
    protected void f(Object obj) {
        g0 g0Var = this.f29194c;
        e0 e0Var = this.f29195d;
        String str = this.f29196e;
        g0Var.j(e0Var, str, g0Var.f(e0Var, str) ? i(obj) : null);
        this.f29193b.b(obj, 1);
    }

    protected Map g() {
        return null;
    }

    protected Map h(Exception exc) {
        return null;
    }

    protected Map i(Object obj) {
        return null;
    }
}
