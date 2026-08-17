package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2187t extends AbstractC2171c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2182n f29254b;

    public AbstractC2187t(InterfaceC2182n consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f29254b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC2171c
    protected void f() {
        this.f29254b.a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC2171c
    protected void g(Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        this.f29254b.onFailure(t10);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC2171c
    protected void i(float f10) {
        this.f29254b.c(f10);
    }

    public final InterfaceC2182n o() {
        return this.f29254b;
    }
}
