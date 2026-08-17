package p040c3;

import U1.AbstractC1459a;
import U1.F;
import V1.k;
import java.util.List;
import p380v2.O;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O[] f26802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f26803d = new k(new F(this));

    public G(List list, String str) {
        this.f26800a = list;
        this.f26801b = str;
        this.f26802c = new O[list.size()];
    }

    public void b() {
        this.f26803d.d();
    }

    public void c(long j10, F f10) {
        this.f26803d.a(j10, f10);
    }

    public void d(r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f26802c.length; i10++) {
            dVar.a();
            O oF = rVar.f(dVar.c(), 3);
            R1.r rVar2 = (R1.r) this.f26800a.get(i10);
            String str = rVar2.f10277o;
            AbstractC1459a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = rVar2.f10263a;
            if (strB == null) {
                strB = dVar.b();
            }
            oF.b(new R1.r.b().j0(strB).W(this.f26801b).y0(str).A0(rVar2.f10267e).n0(rVar2.f10266d).Q(rVar2.f10257L).k0(rVar2.f10280r).P());
            this.f26802c[i10] = oF;
        }
    }

    public void e() {
        this.f26803d.d();
    }

    public void f(int i10) {
        this.f26803d.g(i10);
    }
}
