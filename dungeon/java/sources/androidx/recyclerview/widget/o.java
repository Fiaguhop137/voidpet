package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f25340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f25341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.s f25342c = new a();

    class a extends RecyclerView.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f25343a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f25343a) {
                this.f25343a = false;
                o.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f25343a = true;
        }
    }

    private void f() {
        this.f25340a.X0(this.f25342c);
        this.f25340a.setOnFlingListener(null);
    }

    private void i() {
        if (this.f25340a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f25340a.k(this.f25342c);
        this.f25340a.setOnFlingListener(this);
    }

    private boolean j(RecyclerView.o oVar, int i10, int i11) {
        RecyclerView.y yVarD;
        int iH;
        if (!(oVar instanceof RecyclerView.y.b) || (yVarD = d(oVar)) == null || (iH = h(oVar, i10, i11)) == -1) {
            return false;
        }
        yVarD.p(iH);
        oVar.N1(yVarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i10, int i11) {
        RecyclerView.o layoutManager = this.f25340a.getLayoutManager();
        if (layoutManager == null || this.f25340a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f25340a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && j(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f25340a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f25340a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f25341b = new Scroller(this.f25340a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected RecyclerView.y d(RecyclerView.o oVar) {
        return e(oVar);
    }

    protected abstract g e(RecyclerView.o oVar);

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i10, int i11);

    void k() {
        RecyclerView.o layoutManager;
        View viewG;
        RecyclerView recyclerView = this.f25340a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewG);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f25340a.k1(i10, iArrC[1]);
    }
}
