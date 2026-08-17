package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class j extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f25332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f25333e;

    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.y
        protected void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            j jVar = j.this;
            int[] iArrC = jVar.c(jVar.f25340a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iW = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iW > 0) {
                aVar.d(i10, i11, iW, this.f25321j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int l(RecyclerView.o oVar, View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View m(RecyclerView.o oVar, i iVar) {
        int iO = oVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iM = iVar.m() + (iVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = oVar.N(i11);
            int iAbs = Math.abs((iVar.g(viewN) + (iVar.e(viewN) / 2)) - iM);
            if (iAbs < i10) {
                view = viewN;
                i10 = iAbs;
            }
        }
        return view;
    }

    private i n(RecyclerView.o oVar) {
        i iVar = this.f25333e;
        if (iVar == null || iVar.f25329a != oVar) {
            this.f25333e = i.a(oVar);
        }
        return this.f25333e;
    }

    private i o(RecyclerView.o oVar) {
        if (oVar.q()) {
            return p(oVar);
        }
        if (oVar.p()) {
            return n(oVar);
        }
        return null;
    }

    private i p(RecyclerView.o oVar) {
        i iVar = this.f25332d;
        if (iVar == null || iVar.f25329a != oVar) {
            this.f25332d = i.c(oVar);
        }
        return this.f25332d;
    }

    private boolean q(RecyclerView.o oVar, int i10, int i11) {
        if (oVar.p()) {
            return i10 > 0;
        }
        return i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean r(RecyclerView.o oVar) {
        PointF pointFC;
        int iE = oVar.e();
        if (!(oVar instanceof RecyclerView.y.b) || (pointFC = ((RecyclerView.y.b) oVar).c(iE - 1)) == null) {
            return false;
        }
        return pointFC.x < 0.0f || pointFC.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.o
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.p()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.q()) {
            iArr[1] = l(oVar, view, p(oVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    protected g e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.f25340a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public View g(RecyclerView.o oVar) {
        if (oVar.q()) {
            return m(oVar, p(oVar));
        }
        if (oVar.p()) {
            return m(oVar, n(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public int h(RecyclerView.o oVar, int i10, int i11) {
        i iVarO;
        int iE = oVar.e();
        if (iE == 0 || (iVarO = o(oVar)) == null) {
            return -1;
        }
        int iO = oVar.O();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < iO; i14++) {
            View viewN = oVar.N(i14);
            if (viewN != null) {
                int iL = l(oVar, viewN, iVarO);
                if (iL <= 0 && iL > i13) {
                    view2 = viewN;
                    i13 = iL;
                }
                if (iL >= 0 && iL < i12) {
                    view = viewN;
                    i12 = iL;
                }
            }
        }
        boolean zQ = q(oVar, i10, i11);
        if (zQ && view != null) {
            return oVar.l0(view);
        }
        if (!zQ && view2 != null) {
            return oVar.l0(view2);
        }
        if (zQ) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iL0 = oVar.l0(view) + (r(oVar) == zQ ? -1 : 1);
        if (iL0 < 0 || iL0 >= iE) {
            return -1;
        }
        return iL0;
    }
}
