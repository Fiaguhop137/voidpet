package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2177i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U5.x f29145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U5.k f29146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f29147c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i$a */
    class a extends AbstractC2187t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ P4.d f29148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2182n interfaceC2182n, P4.d dVar, boolean z10) {
            super(interfaceC2182n);
            this.f29148c = dVar;
            this.f29149d = z10;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC2171c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(Z4.a aVar, int i10) {
            Z4.a aVar2;
            try {
                if (p151i6.b.d()) {
                    p151i6.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zD = AbstractC2171c.d(i10);
                if (aVar == null) {
                    if (zD) {
                        o().b(null, i10);
                    }
                    if (p151i6.b.d()) {
                        p151i6.b.b();
                        return;
                    }
                    return;
                }
                if (!((p025b6.e) aVar.m()).T3() && !AbstractC2171c.m(i10, 8)) {
                    if (!zD && (aVar2 = C2177i.this.f29145a.get(this.f29148c)) != null) {
                        try {
                            p025b6.p pVarD3 = ((p025b6.e) aVar.m()).d3();
                            p025b6.p pVarD4 = ((p025b6.e) aVar2.m()).d3();
                            if (pVarD4.a() || pVarD4.c() >= pVarD3.c()) {
                                o().b(aVar2, i10);
                                Z4.a.g(aVar2);
                                if (p151i6.b.d()) {
                                    p151i6.b.b();
                                    return;
                                }
                                return;
                            }
                            Z4.a.g(aVar2);
                        } catch (Throwable th) {
                            Z4.a.g(aVar2);
                            throw th;
                        }
                    }
                    Z4.a aVarG = this.f29149d ? C2177i.this.f29145a.g(this.f29148c, aVar) : null;
                    if (zD) {
                        try {
                            o().c(1.0f);
                        } catch (Throwable th2) {
                            Z4.a.g(aVarG);
                            throw th2;
                        }
                    }
                    InterfaceC2182n interfaceC2182nO = o();
                    if (aVarG != null) {
                        aVar = aVarG;
                    }
                    interfaceC2182nO.b(aVar, i10);
                    Z4.a.g(aVarG);
                    if (p151i6.b.d()) {
                        p151i6.b.b();
                        return;
                    }
                    return;
                }
                o().b(aVar, i10);
                if (p151i6.b.d()) {
                    p151i6.b.b();
                }
            } catch (Throwable th3) {
                if (p151i6.b.d()) {
                    p151i6.b.b();
                }
                throw th3;
            }
        }
    }

    public C2177i(U5.x xVar, U5.k kVar, d0 d0Var) {
        this.f29145a = xVar;
        this.f29146b = kVar;
        this.f29147c = d0Var;
    }

    private static void f(p025b6.l lVar, e0 e0Var) {
        e0Var.m(lVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC2182n interfaceC2182n, e0 e0Var) {
        boolean zD;
        try {
            if (p151i6.b.d()) {
                p151i6.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 g0VarH = e0Var.h();
            g0VarH.d(e0Var, e());
            P4.d dVarB = this.f29146b.b(e0Var.k(), e0Var.a());
            Z4.a aVar = e0Var.k().y(1) ? this.f29145a.get(dVarB) : null;
            if (aVar != null) {
                f((p025b6.l) aVar.m(), e0Var);
                boolean zA = ((p025b6.e) aVar.m()).d3().a();
                if (zA) {
                    g0VarH.j(e0Var, e(), g0VarH.f(e0Var, e()) ? V4.g.of("cached_value_found", "true") : null);
                    g0VarH.b(e0Var, e(), true);
                    e0Var.d("memory_bitmap", d());
                    interfaceC2182n.c(1.0f);
                }
                interfaceC2182n.b(aVar, AbstractC2171c.k(zA));
                aVar.close();
                if (zA) {
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (e0Var.r().g() >= h6.b.c.BITMAP_MEMORY_CACHE.g()) {
                g0VarH.j(e0Var, e(), g0VarH.f(e0Var, e()) ? V4.g.of("cached_value_found", "false") : null);
                g0VarH.b(e0Var, e(), false);
                e0Var.d("memory_bitmap", d());
                interfaceC2182n.b(null, 1);
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            InterfaceC2182n interfaceC2182nG = g(interfaceC2182n, dVarB, e0Var.k().y(2));
            g0VarH.j(e0Var, e(), g0VarH.f(e0Var, e()) ? V4.g.of("cached_value_found", "false") : null);
            if (p151i6.b.d()) {
                p151i6.b.a("mInputProducer.produceResult");
            }
            this.f29147c.b(interfaceC2182nG, e0Var);
            if (p151i6.b.d()) {
                p151i6.b.b();
            }
        } finally {
            if (p151i6.b.d()) {
                p151i6.b.b();
            }
        }
    }

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC2182n g(InterfaceC2182n interfaceC2182n, P4.d dVar, boolean z10) {
        return new a(interfaceC2182n, dVar, z10);
    }
}
