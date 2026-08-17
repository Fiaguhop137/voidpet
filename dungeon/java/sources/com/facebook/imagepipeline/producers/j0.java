package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f29159a;

    private final class a extends AbstractC2187t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f29160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, InterfaceC2182n consumer) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f29160c = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(p025b6.k kVar, int i10) {
            Z4.a aVarE = null;
            try {
                if (p025b6.k.F(kVar) && kVar != null) {
                    aVarE = kVar.e();
                }
                o().b(aVarE, i10);
            } finally {
                Z4.a.g(aVarE);
            }
        }
    }

    public j0(d0 inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f29159a = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC2182n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29159a.b(new a(this, consumer), context);
    }
}
