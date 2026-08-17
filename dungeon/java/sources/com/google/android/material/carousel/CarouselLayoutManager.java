package com.google.android.material.carousel;

import Y8.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p020b1.AbstractC2044c;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.o implements com.google.android.material.carousel.b, RecyclerView.y.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f36347A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Map f36348B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private com.google.android.material.carousel.c f36349C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final View.OnLayoutChangeListener f36350D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f36351E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f36352F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f36353G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f36354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f36355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f36356u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f36357v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c f36358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.d f36359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private g f36360y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private f f36361z;

    class a extends androidx.recyclerview.widget.g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public PointF a(int i10) {
            return CarouselLayoutManager.this.c(i10);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f36360y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f36360y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f36363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f36364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f36365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f36366d;

        b(View view, float f10, float f11, d dVar) {
            this.f36363a = view;
            this.f36364b = f10;
            this.f36365c = f11;
            this.f36366d = dVar;
        }
    }

    private static class c extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f36367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f36368b;

        c() {
            Paint paint = new Paint();
            this.f36367a = paint;
            this.f36368b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            super.i(canvas, recyclerView, zVar);
            this.f36367a.setStrokeWidth(recyclerView.getResources().getDimension(Y8.c.f17080v));
            for (f.c cVar : this.f36368b) {
                this.f36367a.setColor(AbstractC2044c.c(-65281, -16776961, cVar.f36399c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.f36398b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.f36398b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), this.f36367a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.f36398b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f36398b, this.f36367a);
                }
            }
        }

        void j(List list) {
            this.f36368b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f.c f36369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f.c f36370b;

        d(f.c cVar, f.c cVar2) {
            p199l1.g.a(cVar.f36397a <= cVar2.f36397a);
            this.f36369a = cVar;
            this.f36370b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f36357v = false;
        this.f36358w = new c();
        this.f36347A = 0;
        this.f36350D = new p064d9.a(this);
        this.f36352F = -1;
        this.f36353G = 0;
        S2(new h());
        R2(context, attributeSet);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i10) {
        this.f36357v = false;
        this.f36358w = new c();
        this.f36347A = 0;
        this.f36350D = new p064d9.a(this);
        this.f36352F = -1;
        this.f36353G = 0;
        S2(dVar);
        T2(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A2() {
        return this.f36349C.j();
    }

    private int B2() {
        if (R() || !this.f36359x.f()) {
            return 0;
        }
        return u2() == 1 ? h0() : j0();
    }

    private int C2(int i10, f fVar) {
        return F2() ? (int) (((n2() - fVar.h().f36397a) - (i10 * fVar.f())) - (fVar.f() / 2.0f)) : (int) (((i10 * fVar.f()) - fVar.a().f36397a) + (fVar.f() / 2.0f));
    }

    private int D2(int i10, f fVar) {
        int i11 = Integer.MAX_VALUE;
        for (f.c cVar : fVar.e()) {
            float f10 = (i10 * fVar.f()) + (fVar.f() / 2.0f);
            int iN2 = (F2() ? (int) ((n2() - cVar.f36397a) - f10) : (int) (f10 - cVar.f36397a)) - this.f36354s;
            if (Math.abs(i11) > Math.abs(iN2)) {
                i11 = iN2;
            }
        }
        return i11;
    }

    private static d E2(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = (f.c) list.get(i14);
            float f15 = z10 ? cVar.f36398b : cVar.f36397a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((f.c) list.get(i10), (f.c) list.get(i12));
    }

    private boolean G2(float f10, d dVar) {
        float fZ1 = Z1(f10, s2(f10, dVar) / 2.0f);
        if (F2()) {
            return fZ1 < 0.0f;
        }
        return fZ1 > ((float) n2());
    }

    private boolean H2(float f10, d dVar) {
        float fY1 = Y1(f10, s2(f10, dVar) / 2.0f);
        if (F2()) {
            return fY1 > ((float) n2());
        }
        return fY1 < 0.0f;
    }

    private void I2() {
        if (this.f36357v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < O(); i10++) {
                View viewN = N(i10);
                Log.d("CarouselLayoutManager", "item position " + l0(viewN) + ", center:" + o2(viewN) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b J2(RecyclerView.u uVar, float f10, int i10) {
        View viewO = uVar.o(i10);
        E0(viewO, 0, 0);
        float fY1 = Y1(f10, this.f36361z.f() / 2.0f);
        d dVarE2 = E2(this.f36361z.g(), fY1, false);
        return new b(viewO, fY1, d2(viewO, fY1, dVarE2), dVarE2);
    }

    private float K2(View view, float f10, float f11, Rect rect) {
        float fY1 = Y1(f10, f11);
        d dVarE2 = E2(this.f36361z.g(), fY1, false);
        float fD2 = d2(view, fY1, dVarE2);
        super.U(view, rect);
        U2(view, fY1, dVarE2);
        this.f36349C.l(view, rect, f11, fD2);
        return fD2;
    }

    private void L2(RecyclerView.u uVar) {
        View viewO = uVar.o(0);
        E0(viewO, 0, 0);
        f fVarG = this.f36359x.g(this, viewO);
        if (F2()) {
            fVarG = f.n(fVarG, n2());
        }
        this.f36360y = g.f(this, fVarG, p2(), r2(), B2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        this.f36360y = null;
        x1();
    }

    private void N2(RecyclerView.u uVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fO2 = o2(viewN);
            if (!H2(fO2, E2(this.f36361z.g(), fO2, true))) {
                break;
            } else {
                q1(viewN, uVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fO3 = o2(viewN2);
            if (!G2(fO3, E2(this.f36361z.g(), fO3, true))) {
                return;
            } else {
                q1(viewN2, uVar);
            }
        }
    }

    private int O2(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f36360y == null) {
            L2(uVar);
        }
        int iH2 = h2(i10, this.f36354s, this.f36355t, this.f36356u);
        this.f36354s += iH2;
        V2(this.f36360y);
        float f10 = this.f36361z.f() / 2.0f;
        float fE2 = e2(l0(N(0)));
        Rect rect = new Rect();
        float f11 = F2() ? this.f36361z.h().f36398b : this.f36361z.a().f36398b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < O(); i11++) {
            View viewN = N(i11);
            float fAbs = Math.abs(f11 - K2(viewN, fE2, f10, rect));
            if (viewN != null && fAbs < f12) {
                this.f36352F = l0(viewN);
                f12 = fAbs;
            }
            fE2 = Y1(fE2, this.f36361z.f());
        }
        k2(uVar, zVar);
        return iH2;
    }

    private void P2(RecyclerView recyclerView, int i10) {
        if (f()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    public static /* synthetic */ void R1(CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new p064d9.b(carouselLayoutManager));
    }

    private void R2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f17347O0);
            Q2(typedArrayObtainStyledAttributes.getInt(k.f17356P0, 0));
            T2(typedArrayObtainStyledAttributes.getInt(k.f17582n5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void U2(View view, float f10, d dVar) {
    }

    private void V2(g gVar) {
        int i10 = this.f36356u;
        int i11 = this.f36355t;
        if (i10 <= i11) {
            this.f36361z = F2() ? gVar.h() : gVar.l();
        } else {
            this.f36361z = gVar.j(this.f36354s, i11, i10);
        }
        this.f36358w.j(this.f36361z.g());
    }

    private void W2() {
        int iE = e();
        int i10 = this.f36351E;
        if (iE == i10 || this.f36360y == null) {
            return;
        }
        if (this.f36359x.h(this, i10)) {
            M2();
        }
        this.f36351E = iE;
    }

    private void X1(View view, int i10, b bVar) {
        float f10 = this.f36361z.f() / 2.0f;
        j(view, i10);
        float f11 = bVar.f36365c;
        this.f36349C.k(view, (int) (f11 - f10), (int) (f11 + f10));
        U2(view, bVar.f36364b, bVar.f36366d);
    }

    private void X2() {
        if (!this.f36357v || O() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < O() - 1) {
            int iL0 = l0(N(i10));
            int i11 = i10 + 1;
            int iL1 = l0(N(i11));
            if (iL0 > iL1) {
                I2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iL0 + "] and child at index [" + i11 + "] had adapter position [" + iL1 + "].");
            }
            i10 = i11;
        }
    }

    private float Y1(float f10, float f11) {
        return F2() ? f10 - f11 : f10 + f11;
    }

    private float Z1(float f10, float f11) {
        return F2() ? f10 + f11 : f10 - f11;
    }

    private void a2(RecyclerView.u uVar, int i10, int i11) {
        if (i10 < 0 || i10 >= e()) {
            return;
        }
        b bVarJ2 = J2(uVar, e2(i10), i10);
        X1(bVarJ2.f36363a, i11, bVarJ2);
    }

    private void b2(RecyclerView.u uVar, RecyclerView.z zVar, int i10) {
        float fE2 = e2(i10);
        while (i10 < zVar.b()) {
            b bVarJ2 = J2(uVar, fE2, i10);
            if (G2(bVarJ2.f36365c, bVarJ2.f36366d)) {
                return;
            }
            fE2 = Y1(fE2, this.f36361z.f());
            if (!H2(bVarJ2.f36365c, bVarJ2.f36366d)) {
                X1(bVarJ2.f36363a, -1, bVarJ2);
            }
            i10++;
        }
    }

    private void c2(RecyclerView.u uVar, int i10) {
        float fE2 = e2(i10);
        while (i10 >= 0) {
            b bVarJ2 = J2(uVar, fE2, i10);
            if (H2(bVarJ2.f36365c, bVarJ2.f36366d)) {
                return;
            }
            fE2 = Z1(fE2, this.f36361z.f());
            if (!G2(bVarJ2.f36365c, bVarJ2.f36366d)) {
                X1(bVarJ2.f36363a, 0, bVarJ2);
            }
            i10--;
        }
    }

    private float d2(View view, float f10, d dVar) {
        f.c cVar = dVar.f36369a;
        float f11 = cVar.f36398b;
        f.c cVar2 = dVar.f36370b;
        float fB = Z8.a.b(f11, cVar2.f36398b, cVar.f36397a, cVar2.f36397a, f10);
        if (dVar.f36370b != this.f36361z.c() && dVar.f36369a != this.f36361z.j()) {
            return fB;
        }
        float fD = this.f36349C.d((RecyclerView.p) view.getLayoutParams()) / this.f36361z.f();
        f.c cVar3 = dVar.f36370b;
        return fB + ((f10 - cVar3.f36397a) * ((1.0f - cVar3.f36399c) + fD));
    }

    private float e2(int i10) {
        return Y1(z2() - this.f36354s, this.f36361z.f() * i10);
    }

    private int f2(RecyclerView.z zVar, g gVar) {
        boolean zF2 = F2();
        f fVarL = zF2 ? gVar.l() : gVar.h();
        f.c cVarA = zF2 ? fVarL.a() : fVarL.h();
        int iB = (int) (((((zVar.b() - 1) * fVarL.f()) * (zF2 ? -1.0f : 1.0f)) - (cVarA.f36397a - z2())) + (w2() - cVarA.f36397a) + (zF2 ? -cVarA.f36403g : cVarA.f36404h));
        return zF2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int h2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int i2(g gVar) {
        boolean zF2 = F2();
        f fVarH = zF2 ? gVar.h() : gVar.l();
        return (int) (z2() - Z1((zF2 ? fVarH.h() : fVarH.a()).f36397a, fVarH.f() / 2.0f));
    }

    private int j2(int i10) {
        int iU2 = u2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (iU2 == 0) {
                return F2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return iU2 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (iU2 == 0) {
                return F2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130) {
            return iU2 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return Integer.MIN_VALUE;
    }

    private void k2(RecyclerView.u uVar, RecyclerView.z zVar) {
        N2(uVar);
        if (O() == 0) {
            c2(uVar, this.f36347A - 1);
            b2(uVar, zVar, this.f36347A);
        } else {
            int iL0 = l0(N(0));
            int iL1 = l0(N(O() - 1));
            c2(uVar, iL0 - 1);
            b2(uVar, zVar, iL1 + 1);
        }
        X2();
    }

    private View l2() {
        return N(F2() ? 0 : O() - 1);
    }

    private View m2() {
        return N(F2() ? O() - 1 : 0);
    }

    private int n2() {
        return f() ? a() : b();
    }

    private float o2(View view) {
        Rect rect = new Rect();
        super.U(view, rect);
        return f() ? rect.centerX() : rect.centerY();
    }

    private int p2() {
        int i10;
        int i11;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) N(0).getLayoutParams();
        if (this.f36349C.f36379a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) pVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
        return i10 + i11;
    }

    private f q2(int i10) {
        f fVar;
        Map map = this.f36348B;
        return (map == null || (fVar = (f) map.get(Integer.valueOf(p092f1.a.b(i10, 0, Math.max(0, e() + (-1)))))) == null) ? this.f36360y.g() : fVar;
    }

    private int r2() {
        if (R() || !this.f36359x.f()) {
            return 0;
        }
        return u2() == 1 ? k0() : i0();
    }

    private float s2(float f10, d dVar) {
        f.c cVar = dVar.f36369a;
        float f11 = cVar.f36400d;
        f.c cVar2 = dVar.f36370b;
        return Z8.a.b(f11, cVar2.f36400d, cVar.f36398b, cVar2.f36398b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v2() {
        return this.f36349C.e();
    }

    private int w2() {
        return this.f36349C.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.f36349C.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.f36349C.h();
    }

    private int z2() {
        return this.f36349C.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return this.f36356u - this.f36355t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (p()) {
            return O2(i10, uVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i10) {
        this.f36352F = i10;
        if (this.f36360y == null) {
            return;
        }
        this.f36354s = C2(i10, q2(i10));
        this.f36347A = p092f1.a.b(i10, 0, Math.max(0, e() - 1));
        V2(this.f36360y);
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (q()) {
            return O2(i10, uVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void E0(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    boolean F2() {
        return f() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(RecyclerView recyclerView) {
        super.K0(recyclerView);
        this.f36359x.e(recyclerView.getContext());
        M2();
        recyclerView.addOnLayoutChangeListener(this.f36350D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        recyclerView.removeOnLayoutChangeListener(this.f36350D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        N1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i10, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iJ2;
        if (O() == 0 || (iJ2 = j2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iJ2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            a2(uVar, l0(N(0)) - 1, 0);
            return m2();
        }
        if (l0(view) == e() - 1) {
            return null;
        }
        a2(uVar, l0(N(O() - 1)) + 1, -1);
        return l2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void Q2(int i10) {
        this.f36353G = i10;
        M2();
    }

    public void S2(com.google.android.material.carousel.d dVar) {
        this.f36359x = dVar;
        M2();
    }

    public void T2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        com.google.android.material.carousel.c cVar = this.f36349C;
        if (cVar == null || i10 != cVar.f36379a) {
            this.f36349C = com.google.android.material.carousel.c.b(this, i10);
            M2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (f()) {
            fCenterY = rect.centerX();
        }
        float fS2 = s2(fCenterY, E2(this.f36361z.g(), fCenterY, true));
        float fWidth = f() ? (rect.width() - fS2) / 2.0f : 0.0f;
        float fHeight = f() ? 0.0f : (rect.height() - fS2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        super.V0(recyclerView, i10, i11);
        W2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        super.Y0(recyclerView, i10, i11);
        W2();
    }

    @Override // com.google.android.material.carousel.b
    public int a() {
        return s0();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.b() <= 0 || n2() <= 0.0f) {
            o1(uVar);
            this.f36347A = 0;
            return;
        }
        boolean zF2 = F2();
        boolean z10 = this.f36360y == null;
        if (z10) {
            L2(uVar);
        }
        int iI2 = i2(this.f36360y);
        int iF2 = f2(zVar, this.f36360y);
        this.f36355t = zF2 ? iF2 : iI2;
        if (zF2) {
            iF2 = iI2;
        }
        this.f36356u = iF2;
        if (z10) {
            this.f36354s = iI2;
            this.f36348B = this.f36360y.i(e(), this.f36355t, this.f36356u, F2());
            int i10 = this.f36352F;
            if (i10 != -1) {
                this.f36354s = C2(i10, q2(i10));
            }
        }
        int i11 = this.f36354s;
        this.f36354s = i11 + h2(0, i11, this.f36355t, this.f36356u);
        this.f36347A = p092f1.a.b(this.f36347A, 0, zVar.b());
        V2(this.f36360y);
        B(uVar);
        k2(uVar, zVar);
        this.f36351E = e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF c(int i10) {
        if (this.f36360y == null) {
            return null;
        }
        int iT2 = t2(i10, q2(i10));
        return f() ? new PointF(iT2, 0.0f) : new PointF(0.0f, iT2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        if (O() == 0) {
            this.f36347A = 0;
        } else {
            this.f36347A = l0(N(0));
        }
        X2();
    }

    @Override // com.google.android.material.carousel.b
    public int d() {
        return this.f36353G;
    }

    @Override // com.google.android.material.carousel.b
    public boolean f() {
        return this.f36349C.f36379a == 0;
    }

    int g2(int i10) {
        return (int) (this.f36354s - C2(i10, q2(i10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return !f();
    }

    int t2(int i10, f fVar) {
        return C2(i10, fVar) - this.f36354s;
    }

    public int u2() {
        return this.f36349C.f36379a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        if (O() == 0 || this.f36360y == null || e() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f36360y.g().f() / x(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return this.f36354s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iD2;
        if (this.f36360y == null || (iD2 = D2(l0(view), q2(l0(view)))) == 0) {
            return false;
        }
        P2(recyclerView, D2(l0(view), this.f36360y.j(this.f36354s + h2(iD2, this.f36354s, this.f36355t, this.f36356u), this.f36355t, this.f36356u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return this.f36356u - this.f36355t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        if (O() == 0 || this.f36360y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f36360y.g().f() / A(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return this.f36354s;
    }
}
