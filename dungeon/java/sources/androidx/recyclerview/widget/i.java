package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f25329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f25331c;

    static class a extends i {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f25329a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f25329a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f25329a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f25329a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f25329a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f25329a.s0() - this.f25329a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f25329a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f25329a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f25329a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f25329a.i0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f25329a.s0() - this.f25329a.i0()) - this.f25329a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f25329a.r0(view, true, this.f25331c);
            return this.f25331c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f25329a.r0(view, true, this.f25331c);
            return this.f25331c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f25329a.G0(i10);
        }
    }

    static class b extends i {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f25329a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f25329a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f25329a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f25329a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f25329a.b0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f25329a.b0() - this.f25329a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f25329a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f25329a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f25329a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f25329a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f25329a.b0() - this.f25329a.k0()) - this.f25329a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f25329a.r0(view, true, this.f25331c);
            return this.f25331c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f25329a.r0(view, true, this.f25331c);
            return this.f25331c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f25329a.H0(i10);
        }
    }

    private i(RecyclerView.o oVar) {
        this.f25330b = Integer.MIN_VALUE;
        this.f25331c = new Rect();
        this.f25329a = oVar;
    }

    /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i10) {
        if (i10 == 0) {
            return a(oVar);
        }
        if (i10 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f25330b) {
            return 0;
        }
        return n() - this.f25330b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f25330b = n();
    }
}
