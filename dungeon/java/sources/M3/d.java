package M3;

import Ad.AbstractC0793c;
import If.InterfaceC1108j;
import K3.o;
import L3.g;
import N3.f;
import Q3.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p088ef.AbstractC3321y0;
import p435y3.n;
import p435y3.r;
import p435y3.u;
import p453z3.C4378j;
import p453z3.C4379k;
import p453z3.InterfaceC4380l;
import p453z3.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC4380l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f6789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f6790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6793e;

    public static final class a implements InterfaceC4380l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f6794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f6795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f6796c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f6794a = z10;
            this.f6795b = z11;
            this.f6796c = z12;
        }

        public /* synthetic */ a(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? false : z12);
        }

        private final boolean b(B3.o oVar) {
            return Intrinsics.b(oVar.b(), "image/svg+xml") || M3.a.a(C4379k.f58435a, oVar.c().P3());
        }

        @Override // p453z3.InterfaceC4380l.a
        public InterfaceC4380l a(B3.o oVar, o oVar2, r rVar) {
            if (b(oVar)) {
                return new d(oVar.c(), oVar2, this.f6794a, this.f6795b, this.f6796c);
            }
            return null;
        }
    }

    public d(v vVar, o oVar, boolean z10, boolean z11, boolean z12) {
        this.f6789a = vVar;
        this.f6790b = oVar;
        this.f6791c = z10;
        this.f6792d = z11;
        this.f6793e = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4378j c(d dVar) throws Throwable {
        Throwable th;
        N3.b bVarA;
        float width;
        float height;
        InterfaceC1108j interfaceC1108jP3 = dVar.f6789a.P3();
        try {
            bVarA = N3.d.a(interfaceC1108jP3);
            if (interfaceC1108jP3 != null) {
                try {
                    interfaceC1108jP3.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (interfaceC1108jP3 != null) {
                try {
                    interfaceC1108jP3.close();
                } catch (Throwable th4) {
                    AbstractC0793c.a(th3, th4);
                }
            }
            th = th3;
            bVarA = null;
        }
        if (th != null) {
            throw th;
        }
        float[] fArrE = bVarA.e();
        if (!dVar.f6791c || fArrE == null) {
            width = bVarA.getWidth();
            height = bVarA.getHeight();
        } else {
            width = fArrE[2] - fArrE[0];
            height = fArrE[3] - fArrE[1];
        }
        if (dVar.f6793e && g.b(dVar.f6790b.k())) {
            float fA = f.a(dVar.f6790b.c());
            if (width > 0.0f) {
                width *= fA;
            }
            if (height > 0.0f) {
                height *= fA;
            }
        }
        long jB = C4379k.b(width > 0.0f ? Od.a.c(width) : 512, height > 0.0f ? Od.a.c(height) : 512, dVar.f6790b.k(), dVar.f6790b.j(), K3.g.c(dVar.f6790b));
        int iC = p.c(jB);
        int iD = p.d(jB);
        if (width > 0.0f && height > 0.0f) {
            float fE = C4379k.e(width, height, iC, iD, dVar.f6790b.j());
            int i10 = (int) (fE * width);
            iD = (int) (fE * height);
            if (fArrE == null) {
                bVarA.c(new float[]{0.0f, 0.0f, width, height});
            }
            iC = i10;
        }
        bVarA.a("100%");
        bVarA.b("100%");
        bVarA.d(dVar.f6790b);
        n nVarF = bVarA.f(iC, iD);
        if (dVar.f6792d) {
            nVarF = u.d(u.g(nVarF, 0, 0, 3, null), false, 1, null);
        }
        return new C4378j(nVarF, dVar.f6792d);
    }

    @Override // p453z3.InterfaceC4380l
    public Object a(Ed.b bVar) {
        return AbstractC3321y0.b(kotlin.coroutines.e.f48283a, new c(this), bVar);
    }
}
