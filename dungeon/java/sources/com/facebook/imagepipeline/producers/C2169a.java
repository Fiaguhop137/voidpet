package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2169a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f29103a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a, reason: collision with other inner class name */
    private static class C0368a extends AbstractC2187t {
        private C0368a(InterfaceC2182n interfaceC2182n) {
            super(interfaceC2182n);
        }

        /* synthetic */ C0368a(InterfaceC2182n interfaceC2182n, AbstractC2170b abstractC2170b) {
            this(interfaceC2182n);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(p025b6.k kVar, int i10) {
            if (kVar == null) {
                o().b(null, i10);
                return;
            }
            if (!p025b6.k.x(kVar)) {
                kVar.G();
            }
            o().b(kVar, i10);
        }
    }

    public C2169a(d0 d0Var) {
        this.f29103a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC2182n interfaceC2182n, e0 e0Var) {
        this.f29103a.b(new C0368a(interfaceC2182n, null), e0Var);
    }
}
