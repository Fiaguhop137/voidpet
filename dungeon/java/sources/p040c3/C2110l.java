package p040c3;

import U1.AbstractC1459a;
import U1.F;
import java.util.Collections;
import java.util.List;
import p380v2.O;
import p380v2.r;

/* JADX INFO: renamed from: c3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2110l implements InterfaceC2111m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O[] f26959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26963g = -9223372036854775807L;

    public C2110l(List list, String str) {
        this.f26957a = list;
        this.f26958b = str;
        this.f26959c = new O[list.size()];
    }

    private boolean b(F f10, int i10) {
        if (f10.a() == 0) {
            return false;
        }
        if (f10.L() != i10) {
            this.f26960d = false;
        }
        this.f26961e--;
        return this.f26960d;
    }

    @Override // p040c3.InterfaceC2111m
    public void a() {
        this.f26960d = false;
        this.f26963g = -9223372036854775807L;
    }

    @Override // p040c3.InterfaceC2111m
    public void c(F f10) {
        if (this.f26960d) {
            if (this.f26961e != 2 || b(f10, 32)) {
                if (this.f26961e != 1 || b(f10, 0)) {
                    int iG = f10.g();
                    int iA = f10.a();
                    for (O o10 : this.f26959c) {
                        f10.a0(iG);
                        o10.f(f10, iA);
                    }
                    this.f26962f += iA;
                }
            }
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void d(boolean z10) {
        if (this.f26960d) {
            AbstractC1459a.g(this.f26963g != -9223372036854775807L);
            for (O o10 : this.f26959c) {
                o10.c(this.f26963g, 1, this.f26962f, 0, null);
            }
            this.f26960d = false;
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void e(r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f26959c.length; i10++) {
            L.a aVar = (L.a) this.f26957a.get(i10);
            dVar.a();
            O oF = rVar.f(dVar.c(), 3);
            oF.b(new R1.r.b().j0(dVar.b()).W(this.f26958b).y0("application/dvbsubs").k0(Collections.singletonList(aVar.f26848c)).n0(aVar.f26846a).P());
            this.f26959c[i10] = oF;
        }
    }

    @Override // p040c3.InterfaceC2111m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f26960d = true;
        this.f26963g = j10;
        this.f26962f = 0;
        this.f26961e = 2;
    }
}
