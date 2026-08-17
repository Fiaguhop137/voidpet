package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2178j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f29153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29156d;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class a extends AbstractC2187t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f29157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f29158d;

        a(InterfaceC2182n interfaceC2182n, int i10, int i11) {
            super(interfaceC2182n);
            this.f29157c = i10;
            this.f29158d = i11;
        }

        private void p(Z4.a aVar) {
            p025b6.e eVar;
            Bitmap bitmapN3;
            int rowBytes;
            if (aVar == null || !aVar.p() || (eVar = (p025b6.e) aVar.m()) == null || eVar.isClosed() || !(eVar instanceof p025b6.f) || (bitmapN3 = ((p025b6.f) eVar).n3()) == null || (rowBytes = bitmapN3.getRowBytes() * bitmapN3.getHeight()) < this.f29157c || rowBytes > this.f29158d) {
                return;
            }
            bitmapN3.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Z4.a aVar, int i10) {
            p(aVar);
            o().b(aVar, i10);
        }
    }

    public C2178j(d0 d0Var, int i10, int i11, boolean z10) {
        V4.k.b(Boolean.valueOf(i10 <= i11));
        this.f29153a = (d0) V4.k.g(d0Var);
        this.f29154b = i10;
        this.f29155c = i11;
        this.f29156d = z10;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC2182n interfaceC2182n, e0 e0Var) {
        if (!e0Var.o() || this.f29156d) {
            this.f29153a.b(new a(interfaceC2182n, this.f29154b, this.f29155c), e0Var);
        } else {
            this.f29153a.b(interfaceC2182n, e0Var);
        }
    }
}
