package F0;

import I.d2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class k implements AbstractC0974h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f2849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f2850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f2851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f2852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f2853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f2854f;

    public k(w wVar, x xVar, G g10, n nVar, v vVar) {
        this.f2849a = wVar;
        this.f2850b = xVar;
        this.f2851c = g10;
        this.f2852d = nVar;
        this.f2853e = vVar;
        this.f2854f = new i(this);
    }

    public /* synthetic */ k(w wVar, x xVar, G g10, n nVar, v vVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, (i10 & 2) != 0 ? x.f2899a.a() : xVar, (i10 & 4) != 0 ? l.b() : g10, (i10 & 8) != 0 ? new n(l.a(), null, 2, null) : nVar, (i10 & 16) != 0 ? new v() : vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(k kVar, E e10) {
        return kVar.f(E.b(e10, null, null, 0, 0, null, 30, null)).getValue();
    }

    private final d2 f(E e10) {
        return this.f2851c.b(e10, new j(this, e10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H g(k kVar, E e10, Function1 function1) {
        H hA = kVar.f2852d.a(e10, kVar.f2849a, function1, kVar.f2854f);
        if (hA != null) {
            return hA;
        }
        H hA2 = kVar.f2853e.a(e10, kVar.f2849a, function1, kVar.f2854f);
        if (hA2 != null) {
            return hA2;
        }
        throw new IllegalStateException("Could not load font");
    }

    @Override // F0.AbstractC0974h.b
    public d2 b(AbstractC0974h abstractC0974h, r rVar, int i10, int i11) {
        return f(new E(this.f2850b.c(abstractC0974h), this.f2850b.b(rVar), this.f2850b.a(i10), this.f2850b.d(i11), this.f2849a.a(), null));
    }
}
