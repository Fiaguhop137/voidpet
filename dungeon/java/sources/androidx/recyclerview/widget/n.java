package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends RecyclerView.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f25339g = true;

    public final void A(RecyclerView.C c10) {
        I(c10);
        h(c10);
    }

    public final void B(RecyclerView.C c10) {
        J(c10);
    }

    public final void C(RecyclerView.C c10, boolean z10) {
        K(c10, z10);
        h(c10);
    }

    public final void D(RecyclerView.C c10, boolean z10) {
        L(c10, z10);
    }

    public final void E(RecyclerView.C c10) {
        M(c10);
        h(c10);
    }

    public final void F(RecyclerView.C c10) {
        N(c10);
    }

    public final void G(RecyclerView.C c10) {
        O(c10);
        h(c10);
    }

    public final void H(RecyclerView.C c10) {
        P(c10);
    }

    public void I(RecyclerView.C c10) {
    }

    public void J(RecyclerView.C c10) {
    }

    public void K(RecyclerView.C c10, boolean z10) {
    }

    public void L(RecyclerView.C c10, boolean z10) {
    }

    public void M(RecyclerView.C c10) {
    }

    public void N(RecyclerView.C c10) {
    }

    public void O(RecyclerView.C c10) {
    }

    public void P(RecyclerView.C c10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i10;
        int i11;
        return (bVar == null || ((i10 = bVar.f25055a) == (i11 = bVar2.f25055a) && bVar.f25056b == bVar2.f25056b)) ? w(c10) : y(c10, i10, bVar.f25056b, i11, bVar2.f25056b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.C c10, RecyclerView.C c11, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f25055a;
        int i13 = bVar.f25056b;
        if (c11.J()) {
            int i14 = bVar.f25055a;
            i11 = bVar.f25056b;
            i10 = i14;
        } else {
            i10 = bVar2.f25055a;
            i11 = bVar2.f25056b;
        }
        return x(c10, c11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i10 = bVar.f25055a;
        int i11 = bVar.f25056b;
        View view = c10.f25024a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f25055a;
        int top = bVar2 == null ? view.getTop() : bVar2.f25056b;
        if (c10.v() || (i10 == left && i11 == top)) {
            return z(c10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(c10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i10 = bVar.f25055a;
        int i11 = bVar2.f25055a;
        if (i10 != i11 || bVar.f25056b != bVar2.f25056b) {
            return y(c10, i10, bVar.f25056b, i11, bVar2.f25056b);
        }
        E(c10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.C c10) {
        return !this.f25339g || c10.t();
    }

    public abstract boolean w(RecyclerView.C c10);

    public abstract boolean x(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.C c10, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.C c10);
}
