package p040c3;

import U1.AbstractC1459a;
import U1.F;
import V1.k;
import java.util.List;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p380v2.O[] f26862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f26863d;

    public O(List list, String str) {
        this.f26860a = list;
        this.f26861b = str;
        this.f26862c = new p380v2.O[list.size()];
        k kVar = new k(new N(this));
        this.f26863d = kVar;
        kVar.g(3);
    }

    public void b(long j10, F f10) {
        if (f10.a() < 9) {
            return;
        }
        int iU = f10.u();
        int iU2 = f10.u();
        int iL = f10.L();
        if (iU == 434 && iU2 == 1195456820 && iL == 3) {
            this.f26863d.a(j10, f10);
        }
    }

    public void c(r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f26862c.length; i10++) {
            dVar.a();
            p380v2.O oF = rVar.f(dVar.c(), 3);
            R1.r rVar2 = (R1.r) this.f26860a.get(i10);
            String str = rVar2.f10277o;
            AbstractC1459a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            oF.b(new R1.r.b().j0(dVar.b()).W(this.f26861b).y0(str).A0(rVar2.f10267e).n0(rVar2.f10266d).Q(rVar2.f10257L).k0(rVar2.f10280r).P());
            this.f26862c[i10] = oF;
        }
    }
}
