package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class t extends AbstractC2013k {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f25657O;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    ArrayList f25655M = new ArrayList();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f25656N = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    boolean f25658P = false;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f25659Q = 0;

    class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2013k f25660a;

        a(AbstractC2013k abstractC2013k) {
            this.f25660a = abstractC2013k;
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            this.f25660a.b0();
            abstractC2013k.X(this);
        }
    }

    static class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        t f25662a;

        b(t tVar) {
            this.f25662a = tVar;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
            t tVar = this.f25662a;
            if (tVar.f25658P) {
                return;
            }
            tVar.l0();
            this.f25662a.f25658P = true;
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            t tVar = this.f25662a;
            int i10 = tVar.f25657O - 1;
            tVar.f25657O = i10;
            if (i10 == 0) {
                tVar.f25658P = false;
                tVar.r();
            }
            abstractC2013k.X(this);
        }
    }

    private void A0() {
        b bVar = new b(this);
        Iterator it = this.f25655M.iterator();
        while (it.hasNext()) {
            ((AbstractC2013k) it.next()).b(bVar);
        }
        this.f25657O = this.f25655M.size();
    }

    private void q0(AbstractC2013k abstractC2013k) {
        this.f25655M.add(abstractC2013k);
        abstractC2013k.f25625r = this;
    }

    @Override // androidx.transition.AbstractC2013k
    public void V(View view) {
        super.V(view);
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).V(view);
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public void Z(View view) {
        super.Z(view);
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).Z(view);
        }
    }

    @Override // androidx.transition.AbstractC2013k
    protected void b0() {
        if (this.f25655M.isEmpty()) {
            l0();
            r();
            return;
        }
        A0();
        if (this.f25656N) {
            Iterator it = this.f25655M.iterator();
            while (it.hasNext()) {
                ((AbstractC2013k) it.next()).b0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f25655M.size(); i10++) {
            ((AbstractC2013k) this.f25655M.get(i10 - 1)).b(new a((AbstractC2013k) this.f25655M.get(i10)));
        }
        AbstractC2013k abstractC2013k = (AbstractC2013k) this.f25655M.get(0);
        if (abstractC2013k != null) {
            abstractC2013k.b0();
        }
    }

    @Override // androidx.transition.AbstractC2013k
    protected void cancel() {
        super.cancel();
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).cancel();
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public void f0(AbstractC2013k.e eVar) {
        super.f0(eVar);
        this.f25659Q |= 8;
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).f0(eVar);
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public void g(v vVar) {
        if (M(vVar.f25665b)) {
            for (AbstractC2013k abstractC2013k : this.f25655M) {
                if (abstractC2013k.M(vVar.f25665b)) {
                    abstractC2013k.g(vVar);
                    vVar.f25666c.add(abstractC2013k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public void i0(AbstractC2009g abstractC2009g) {
        super.i0(abstractC2009g);
        this.f25659Q |= 4;
        if (this.f25655M != null) {
            for (int i10 = 0; i10 < this.f25655M.size(); i10++) {
                ((AbstractC2013k) this.f25655M.get(i10)).i0(abstractC2009g);
            }
        }
    }

    @Override // androidx.transition.AbstractC2013k
    void j(v vVar) {
        super.j(vVar);
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).j(vVar);
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public void j0(s sVar) {
        super.j0(sVar);
        this.f25659Q |= 2;
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).j0(sVar);
        }
    }

    @Override // androidx.transition.AbstractC2013k
    public void l(v vVar) {
        if (M(vVar.f25665b)) {
            for (AbstractC2013k abstractC2013k : this.f25655M) {
                if (abstractC2013k.M(vVar.f25665b)) {
                    abstractC2013k.l(vVar);
                    vVar.f25666c.add(abstractC2013k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2013k
    String m0(String str) {
        String strM0 = super.m0(str);
        for (int i10 = 0; i10 < this.f25655M.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM0);
            sb2.append("\n");
            sb2.append(((AbstractC2013k) this.f25655M.get(i10)).m0(str + "  "));
            strM0 = sb2.toString();
        }
        return strM0;
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public t b(AbstractC2013k.f fVar) {
        return (t) super.b(fVar);
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC2013k clone() {
        t tVar = (t) super.clone();
        tVar.f25655M = new ArrayList();
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            tVar.q0(((AbstractC2013k) this.f25655M.get(i10)).clone());
        }
        return tVar;
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public t c(View view) {
        for (int i10 = 0; i10 < this.f25655M.size(); i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).c(view);
        }
        return (t) super.c(view);
    }

    public t p0(AbstractC2013k abstractC2013k) {
        q0(abstractC2013k);
        long j10 = this.f25610c;
        if (j10 >= 0) {
            abstractC2013k.d0(j10);
        }
        if ((this.f25659Q & 1) != 0) {
            abstractC2013k.g0(v());
        }
        if ((this.f25659Q & 2) != 0) {
            z();
            abstractC2013k.j0(null);
        }
        if ((this.f25659Q & 4) != 0) {
            abstractC2013k.i0(y());
        }
        if ((this.f25659Q & 8) != 0) {
            abstractC2013k.f0(u());
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2013k
    void q(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jC = C();
        int size = this.f25655M.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2013k abstractC2013k = (AbstractC2013k) this.f25655M.get(i10);
            if (jC > 0 && (this.f25656N || i10 == 0)) {
                long jC2 = abstractC2013k.C();
                if (jC2 > 0) {
                    abstractC2013k.k0(jC2 + jC);
                } else {
                    abstractC2013k.k0(jC);
                }
            }
            abstractC2013k.q(viewGroup, wVar, wVar2, arrayList, arrayList2);
        }
    }

    public AbstractC2013k r0(int i10) {
        if (i10 < 0 || i10 >= this.f25655M.size()) {
            return null;
        }
        return (AbstractC2013k) this.f25655M.get(i10);
    }

    public int s0() {
        return this.f25655M.size();
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public t X(AbstractC2013k.f fVar) {
        return (t) super.X(fVar);
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public t Y(View view) {
        for (int i10 = 0; i10 < this.f25655M.size(); i10++) {
            ((AbstractC2013k) this.f25655M.get(i10)).Y(view);
        }
        return (t) super.Y(view);
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public t d0(long j10) {
        ArrayList arrayList;
        super.d0(j10);
        if (this.f25610c >= 0 && (arrayList = this.f25655M) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC2013k) this.f25655M.get(i10)).d0(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public t g0(TimeInterpolator timeInterpolator) {
        this.f25659Q |= 1;
        ArrayList arrayList = this.f25655M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC2013k) this.f25655M.get(i10)).g0(timeInterpolator);
            }
        }
        return (t) super.g0(timeInterpolator);
    }

    public t y0(int i10) {
        if (i10 == 0) {
            this.f25656N = true;
            return this;
        }
        if (i10 == 1) {
            this.f25656N = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // androidx.transition.AbstractC2013k
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public t k0(long j10) {
        return (t) super.k0(j10);
    }
}
