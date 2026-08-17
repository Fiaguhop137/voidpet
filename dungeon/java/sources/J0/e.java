package J0;

import C0.C0819d;
import C0.G0;
import C0.InterfaceC0854w;
import C0.P0;
import D0.I;
import F0.AbstractC0974h;
import F0.H;
import I.d2;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0854w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P0 f5642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f5643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f5644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC0974h.b f5645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O0.d f5646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f5647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CharSequence f5648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final I f5649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t f5650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f5651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f5652l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public e(String str, P0 p10, List list, List list2, AbstractC0974h.b bVar, O0.d dVar) {
        Object obj;
        ?? arrayList;
        this.f5641a = str;
        this.f5642b = p10;
        this.f5643c = list;
        this.f5644d = list2;
        this.f5645e = bVar;
        this.f5646f = dVar;
        i iVar = new i(1, dVar.getDensity());
        this.f5647g = iVar;
        this.f5651k = !f.c(p10) ? false : ((Boolean) o.f5670a.a().getValue()).booleanValue();
        this.f5652l = f.d(p10.B(), p10.u());
        d dVar2 = new d(this);
        K0.e.e(iVar, p10.E());
        G0 g0O = p10.O();
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (((C0819d.c) obj).g() instanceof G0) {
                break;
            } else {
                i10++;
            }
        }
        G0 g0A = K0.e.a(iVar, g0O, dVar2, dVar, obj != null);
        if (g0A != null) {
            int size2 = this.f5643c.size() + 1;
            arrayList = new ArrayList(size2);
            int i11 = 0;
            while (i11 < size2) {
                arrayList.add(i11 == 0 ? new C0819d.c(g0A, 0, this.f5641a.length()) : (C0819d.c) this.f5643c.get(i11 - 1));
                i11++;
            }
        } else {
            arrayList = this.f5643c;
        }
        CharSequence charSequenceA = c.a(this.f5641a, this.f5647g.getTextSize(), this.f5642b, arrayList, this.f5644d, this.f5646f, dVar2, this.f5651k);
        this.f5648h = charSequenceA;
        this.f5649i = new I(charSequenceA, this.f5647g, this.f5652l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface e(e eVar, AbstractC0974h abstractC0974h, F0.r rVar, F0.p pVar, F0.q qVar) {
        d2 d2VarB = eVar.f5645e.b(abstractC0974h, rVar, pVar.i(), qVar.h());
        if (d2VarB instanceof H.a) {
            Object value = ((H.a) d2VarB).getValue();
            Intrinsics.d(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }
        t tVar = new t(d2VarB, eVar.f5650j);
        eVar.f5650j = tVar;
        return tVar.a();
    }

    @Override // C0.InterfaceC0854w
    public boolean a() {
        t tVar = this.f5650j;
        if (tVar != null ? tVar.b() : false) {
            return true;
        }
        return !this.f5651k && f.c(this.f5642b) && ((Boolean) o.f5670a.a().getValue()).booleanValue();
    }

    @Override // C0.InterfaceC0854w
    public float b() {
        return this.f5649i.j();
    }

    @Override // C0.InterfaceC0854w
    public float d() {
        return this.f5649i.i();
    }

    public final CharSequence f() {
        return this.f5648h;
    }

    public final I g() {
        return this.f5649i;
    }

    public final P0 h() {
        return this.f5642b;
    }

    public final int i() {
        return this.f5652l;
    }

    public final i j() {
        return this.f5647g;
    }
}
