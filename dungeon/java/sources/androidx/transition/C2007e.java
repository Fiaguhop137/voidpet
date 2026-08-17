package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2007e extends androidx.fragment.app.A {

    /* JADX INFO: renamed from: androidx.transition.e$a */
    class a extends AbstractC2013k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f25575a;

        a(Rect rect) {
            this.f25575a = rect;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    class b implements AbstractC2013k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f25577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f25578b;

        b(View view, ArrayList arrayList) {
            this.f25577a = view;
            this.f25578b = arrayList;
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void a(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
            abstractC2013k.X(this);
            abstractC2013k.b(this);
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void c(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            abstractC2013k.X(this);
            this.f25577a.setVisibility(8);
            int size = this.f25578b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f25578b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void f(AbstractC2013k abstractC2013k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f25580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f25581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f25582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f25583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f25584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f25585f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f25580a = obj;
            this.f25581b = arrayList;
            this.f25582c = obj2;
            this.f25583d = arrayList2;
            this.f25584e = obj3;
            this.f25585f = arrayList3;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
            Object obj = this.f25580a;
            if (obj != null) {
                C2007e.this.x(obj, this.f25581b, null);
            }
            Object obj2 = this.f25582c;
            if (obj2 != null) {
                C2007e.this.x(obj2, this.f25583d, null);
            }
            Object obj3 = this.f25584e;
            if (obj3 != null) {
                C2007e.this.x(obj3, this.f25585f, null);
            }
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            abstractC2013k.X(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    class d implements AbstractC2013k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f25587a;

        d(Runnable runnable) {
            this.f25587a = runnable;
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void a(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void b(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void c(AbstractC2013k abstractC2013k) {
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void e(AbstractC2013k abstractC2013k) {
            this.f25587a.run();
        }

        @Override // androidx.transition.AbstractC2013k.f
        public void f(AbstractC2013k abstractC2013k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C0324e extends AbstractC2013k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f25589a;

        C0324e(Rect rect) {
            this.f25589a = rect;
        }
    }

    public static /* synthetic */ void v(Runnable runnable, AbstractC2013k abstractC2013k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC2013k.cancel();
            runnable2.run();
        }
    }

    private static boolean w(AbstractC2013k abstractC2013k) {
        return (androidx.fragment.app.A.i(abstractC2013k.D()) && androidx.fragment.app.A.i(abstractC2013k.E()) && androidx.fragment.app.A.i(abstractC2013k.F())) ? false : true;
    }

    @Override // androidx.fragment.app.A
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC2013k) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.A
    public void b(Object obj, ArrayList arrayList) {
        AbstractC2013k abstractC2013k = (AbstractC2013k) obj;
        if (abstractC2013k == null) {
            return;
        }
        int i10 = 0;
        if (abstractC2013k instanceof t) {
            t tVar = (t) abstractC2013k;
            int iS0 = tVar.s0();
            while (i10 < iS0) {
                b(tVar.r0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (w(abstractC2013k) || !androidx.fragment.app.A.i(abstractC2013k.H())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC2013k.c((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.A
    public void c(ViewGroup viewGroup, Object obj) {
        r.a(viewGroup, (AbstractC2013k) obj);
    }

    @Override // androidx.fragment.app.A
    public boolean e(Object obj) {
        return obj instanceof AbstractC2013k;
    }

    @Override // androidx.fragment.app.A
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC2013k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.A
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC2013k abstractC2013kY0 = (AbstractC2013k) obj;
        AbstractC2013k abstractC2013k = (AbstractC2013k) obj2;
        AbstractC2013k abstractC2013k2 = (AbstractC2013k) obj3;
        if (abstractC2013kY0 != null && abstractC2013k != null) {
            abstractC2013kY0 = new t().p0(abstractC2013kY0).p0(abstractC2013k).y0(1);
        } else if (abstractC2013kY0 == null) {
            abstractC2013kY0 = abstractC2013k != null ? abstractC2013k : null;
        }
        if (abstractC2013k2 == null) {
            return abstractC2013kY0;
        }
        t tVar = new t();
        if (abstractC2013kY0 != null) {
            tVar.p0(abstractC2013kY0);
        }
        tVar.p0(abstractC2013k2);
        return tVar;
    }

    @Override // androidx.fragment.app.A
    public Object k(Object obj, Object obj2, Object obj3) {
        t tVar = new t();
        if (obj != null) {
            tVar.p0((AbstractC2013k) obj);
        }
        if (obj2 != null) {
            tVar.p0((AbstractC2013k) obj2);
        }
        if (obj3 != null) {
            tVar.p0((AbstractC2013k) obj3);
        }
        return tVar;
    }

    @Override // androidx.fragment.app.A
    public void m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC2013k) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.A
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC2013k) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.A
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC2013k) obj).f0(new C0324e(rect));
        }
    }

    @Override // androidx.fragment.app.A
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC2013k) obj).f0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.A
    public void q(androidx.fragment.app.i iVar, Object obj, p128h1.d dVar, Runnable runnable) {
        y(iVar, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.A
    public void s(Object obj, View view, ArrayList arrayList) {
        t tVar = (t) obj;
        List listH = tVar.H();
        listH.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.A.d(listH, (View) arrayList.get(i10));
        }
        listH.add(view);
        arrayList.add(view);
        b(tVar, arrayList);
    }

    @Override // androidx.fragment.app.A
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        if (tVar != null) {
            tVar.H().clear();
            tVar.H().addAll(arrayList2);
            x(tVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.A
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        t tVar = new t();
        tVar.p0((AbstractC2013k) obj);
        return tVar;
    }

    public void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2013k abstractC2013k = (AbstractC2013k) obj;
        int i10 = 0;
        if (abstractC2013k instanceof t) {
            t tVar = (t) abstractC2013k;
            int iS0 = tVar.s0();
            while (i10 < iS0) {
                x(tVar.r0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (w(abstractC2013k)) {
            return;
        }
        List listH = abstractC2013k.H();
        if (listH.size() == arrayList.size() && listH.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC2013k.c((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC2013k.Y((View) arrayList.get(size2));
            }
        }
    }

    public void y(androidx.fragment.app.i iVar, Object obj, p128h1.d dVar, Runnable runnable, Runnable runnable2) {
        AbstractC2013k abstractC2013k = (AbstractC2013k) obj;
        dVar.c(new C2006d(runnable, abstractC2013k, runnable2));
        abstractC2013k.b(new d(runnable2));
    }
}
