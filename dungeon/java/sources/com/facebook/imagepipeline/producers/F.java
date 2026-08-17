package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends E implements p061d6.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p061d6.e f28996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p061d6.d f28997d;

    public F(p061d6.e eVar, p061d6.d dVar) {
        super(eVar, dVar);
        this.f28996c = eVar;
        this.f28997d = dVar;
    }

    @Override // p061d6.d
    public void a(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p061d6.e eVar = this.f28996c;
        if (eVar != null) {
            eVar.c(producerContext.k(), producerContext.a(), producerContext.getId(), producerContext.o());
        }
        p061d6.d dVar = this.f28997d;
        if (dVar != null) {
            dVar.a(producerContext);
        }
    }

    @Override // p061d6.d
    public void e(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p061d6.e eVar = this.f28996c;
        if (eVar != null) {
            eVar.g(producerContext.k(), producerContext.getId(), producerContext.o());
        }
        p061d6.d dVar = this.f28997d;
        if (dVar != null) {
            dVar.e(producerContext);
        }
    }

    @Override // p061d6.d
    public void g(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p061d6.e eVar = this.f28996c;
        if (eVar != null) {
            eVar.k(producerContext.getId());
        }
        p061d6.d dVar = this.f28997d;
        if (dVar != null) {
            dVar.g(producerContext);
        }
    }

    @Override // p061d6.d
    public void i(e0 producerContext, Throwable th) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        p061d6.e eVar = this.f28996c;
        if (eVar != null) {
            eVar.b(producerContext.k(), producerContext.getId(), th, producerContext.o());
        }
        p061d6.d dVar = this.f28997d;
        if (dVar != null) {
            dVar.i(producerContext, th);
        }
    }
}
