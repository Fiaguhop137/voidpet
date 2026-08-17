package com.facebook.imagepipeline.producers;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2186s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f29252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f29253b;

    public C2186s(d0 inputProducer, ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f29252a = inputProducer;
        this.f29253b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2186s this$0, InterfaceC2182n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.f29252a.b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC2182n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        p133h6.b bVarK = context.k();
        ScheduledExecutorService scheduledExecutorService = this.f29253b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new r(this, consumer, context), bVarK.e(), TimeUnit.MILLISECONDS);
        } else {
            this.f29252a.b(consumer, context);
        }
    }
}
