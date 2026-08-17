package U3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o extends g {

    class a extends p095f4.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p095f4.b f13078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p095f4.c f13079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ X3.b f13080f;

        a(p095f4.b bVar, p095f4.c cVar, X3.b bVar2) {
            this.f13078d = bVar;
            this.f13079e = cVar;
            this.f13080f = bVar2;
        }

        @Override // p095f4.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public X3.b a(p095f4.b bVar) {
            this.f13078d.h(bVar.f(), bVar.a(), ((X3.b) bVar.g()).f15255a, ((X3.b) bVar.b()).f15255a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f13079e.a(this.f13078d);
            X3.b bVar2 = (X3.b) (bVar.c() == 1.0f ? bVar.b() : bVar.g());
            this.f13080f.a(str, bVar2.f15256b, bVar2.f15257c, bVar2.f15258d, bVar2.f15259e, bVar2.f15260f, bVar2.f15261g, bVar2.f15262h, bVar2.f15263i, bVar2.f15264j, bVar2.f15265k, bVar2.f15266l, bVar2.f15267m);
            return this.f13080f;
        }
    }

    public o(List list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public X3.b i(p095f4.a aVar, float f10) {
        Object obj;
        p095f4.c cVar = this.f13034e;
        if (cVar == null) {
            return (f10 != 1.0f || (obj = aVar.f41714c) == null) ? (X3.b) aVar.f41713b : (X3.b) obj;
        }
        float f11 = aVar.f41718g;
        Float f12 = aVar.f41719h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        Object obj2 = aVar.f41713b;
        X3.b bVar = (X3.b) obj2;
        Object obj3 = aVar.f41714c;
        return (X3.b) cVar.b(f11, fFloatValue, bVar, obj3 == null ? (X3.b) obj2 : (X3.b) obj3, f10, d(), f());
    }

    public void s(p095f4.c cVar) {
        super.o(new a(new p095f4.b(), cVar, new X3.b()));
    }
}
