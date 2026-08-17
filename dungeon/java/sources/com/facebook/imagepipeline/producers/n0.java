package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes2.dex */
public class n0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f29197a;

    class a extends AbstractC2187t {
        a(InterfaceC2182n interfaceC2182n) {
            super(interfaceC2182n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        protected void h(Object obj, int i10) {
            if (AbstractC2171c.d(i10)) {
                o().b(null, i10);
            }
        }
    }

    public n0(d0 d0Var) {
        this.f29197a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC2182n interfaceC2182n, e0 e0Var) {
        this.f29197a.b(new a(interfaceC2182n), e0Var);
    }
}
