package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f25209s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f25210h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f25211i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f25212j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f25213k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList f25214l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f25215m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f25216n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f25217o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f25218p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f25219q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f25220r = new ArrayList();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f25221a;

        a(ArrayList arrayList) {
            this.f25221a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f25221a) {
                c.this.S(jVar.f25255a, jVar.f25256b, jVar.f25257c, jVar.f25258d, jVar.f25259e);
            }
            this.f25221a.clear();
            c.this.f25215m.remove(this.f25221a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f25223a;

        b(ArrayList arrayList) {
            this.f25223a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f25223a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f25223a.clear();
            c.this.f25216n.remove(this.f25223a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0314c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f25225a;

        RunnableC0314c(ArrayList arrayList) {
            this.f25225a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f25225a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.C) it.next());
            }
            this.f25225a.clear();
            c.this.f25214l.remove(this.f25225a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f25227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f25228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f25229c;

        d(RecyclerView.C c10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f25227a = c10;
            this.f25228b = viewPropertyAnimator;
            this.f25229c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25228b.setListener(null);
            this.f25229c.setAlpha(1.0f);
            c.this.G(this.f25227a);
            c.this.f25219q.remove(this.f25227a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f25227a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f25231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f25232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f25233c;

        e(RecyclerView.C c10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f25231a = c10;
            this.f25232b = view;
            this.f25233c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f25232b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25233c.setListener(null);
            c.this.A(this.f25231a);
            c.this.f25217o.remove(this.f25231a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f25231a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f25235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f25236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f25237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f25238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f25239e;

        f(RecyclerView.C c10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f25235a = c10;
            this.f25236b = i10;
            this.f25237c = view;
            this.f25238d = i11;
            this.f25239e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f25236b != 0) {
                this.f25237c.setTranslationX(0.0f);
            }
            if (this.f25238d != 0) {
                this.f25237c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25239e.setListener(null);
            c.this.E(this.f25235a);
            c.this.f25218p.remove(this.f25235a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f25235a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f25241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f25242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f25243c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f25241a = iVar;
            this.f25242b = viewPropertyAnimator;
            this.f25243c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25242b.setListener(null);
            this.f25243c.setAlpha(1.0f);
            this.f25243c.setTranslationX(0.0f);
            this.f25243c.setTranslationY(0.0f);
            c.this.C(this.f25241a.f25249a, true);
            c.this.f25220r.remove(this.f25241a.f25249a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f25241a.f25249a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f25245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f25246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f25247c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f25245a = iVar;
            this.f25246b = viewPropertyAnimator;
            this.f25247c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25246b.setListener(null);
            this.f25247c.setAlpha(1.0f);
            this.f25247c.setTranslationX(0.0f);
            this.f25247c.setTranslationY(0.0f);
            c.this.C(this.f25245a.f25250b, false);
            c.this.f25220r.remove(this.f25245a.f25250b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f25245a.f25250b, false);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.C f25249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.C f25250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25254f;

        private i(RecyclerView.C c10, RecyclerView.C c11) {
            this.f25249a = c10;
            this.f25250b = c11;
        }

        i(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13) {
            this(c10, c11);
            this.f25251c = i10;
            this.f25252d = i11;
            this.f25253e = i12;
            this.f25254f = i13;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f25249a + ", newHolder=" + this.f25250b + ", fromX=" + this.f25251c + ", fromY=" + this.f25252d + ", toX=" + this.f25253e + ", toY=" + this.f25254f + '}';
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.C f25255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f25259e;

        j(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
            this.f25255a = c10;
            this.f25256b = i10;
            this.f25257c = i11;
            this.f25258d = i12;
            this.f25259e = i13;
        }
    }

    private void T(RecyclerView.C c10) {
        View view = c10.f25024a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f25219q.add(c10);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(c10, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.C c10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, c10) && iVar.f25249a == null && iVar.f25250b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.C c10 = iVar.f25249a;
        if (c10 != null) {
            Y(iVar, c10);
        }
        RecyclerView.C c11 = iVar.f25250b;
        if (c11 != null) {
            Y(iVar, c11);
        }
    }

    private boolean Y(i iVar, RecyclerView.C c10) {
        boolean z10 = false;
        if (iVar.f25250b == c10) {
            iVar.f25250b = null;
        } else {
            if (iVar.f25249a != c10) {
                return false;
            }
            iVar.f25249a = null;
            z10 = true;
        }
        c10.f25024a.setAlpha(1.0f);
        c10.f25024a.setTranslationX(0.0f);
        c10.f25024a.setTranslationY(0.0f);
        C(c10, z10);
        return true;
    }

    private void Z(RecyclerView.C c10) {
        if (f25209s == null) {
            f25209s = new ValueAnimator().getInterpolator();
        }
        c10.f25024a.animate().setInterpolator(f25209s);
        j(c10);
    }

    void Q(RecyclerView.C c10) {
        View view = c10.f25024a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f25217o.add(c10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(c10, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.C c10 = iVar.f25249a;
        View view = c10 == null ? null : c10.f25024a;
        RecyclerView.C c11 = iVar.f25250b;
        View view2 = c11 != null ? c11.f25024a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f25220r.add(iVar.f25249a);
            duration.translationX(iVar.f25253e - iVar.f25251c);
            duration.translationY(iVar.f25254f - iVar.f25252d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f25220r.add(iVar.f25250b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
        View view = c10.f25024a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f25218p.add(c10);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(c10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) list.get(size)).f25024a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.C c10, List list) {
        return !list.isEmpty() || super.g(c10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.C c10) {
        View view = c10.f25024a;
        view.animate().cancel();
        int size = this.f25212j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f25212j.get(size)).f25255a == c10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c10);
                this.f25212j.remove(size);
            }
        }
        W(this.f25213k, c10);
        if (this.f25210h.remove(c10)) {
            view.setAlpha(1.0f);
            G(c10);
        }
        if (this.f25211i.remove(c10)) {
            view.setAlpha(1.0f);
            A(c10);
        }
        for (int size2 = this.f25216n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f25216n.get(size2);
            W(arrayList, c10);
            if (arrayList.isEmpty()) {
                this.f25216n.remove(size2);
            }
        }
        for (int size3 = this.f25215m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f25215m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (((j) arrayList2.get(size4)).f25255a == c10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c10);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f25215m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f25214l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f25214l.get(size5);
            if (arrayList3.remove(c10)) {
                view.setAlpha(1.0f);
                A(c10);
                if (arrayList3.isEmpty()) {
                    this.f25214l.remove(size5);
                }
            }
        }
        this.f25219q.remove(c10);
        this.f25217o.remove(c10);
        this.f25220r.remove(c10);
        this.f25218p.remove(c10);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f25212j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f25212j.get(size);
            View view = jVar.f25255a.f25024a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f25255a);
            this.f25212j.remove(size);
        }
        for (int size2 = this.f25210h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.C) this.f25210h.get(size2));
            this.f25210h.remove(size2);
        }
        int size3 = this.f25211i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c10 = (RecyclerView.C) this.f25211i.get(size3);
            c10.f25024a.setAlpha(1.0f);
            A(c10);
            this.f25211i.remove(size3);
        }
        for (int size4 = this.f25213k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f25213k.get(size4));
        }
        this.f25213k.clear();
        if (p()) {
            for (int size5 = this.f25215m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f25215m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f25255a.f25024a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f25255a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f25215m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f25214l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f25214l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c11 = (RecyclerView.C) arrayList2.get(size8);
                    c11.f25024a.setAlpha(1.0f);
                    A(c11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f25214l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f25216n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f25216n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f25216n.remove(arrayList3);
                    }
                }
            }
            U(this.f25219q);
            U(this.f25218p);
            U(this.f25217o);
            U(this.f25220r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f25211i.isEmpty() && this.f25213k.isEmpty() && this.f25212j.isEmpty() && this.f25210h.isEmpty() && this.f25218p.isEmpty() && this.f25219q.isEmpty() && this.f25217o.isEmpty() && this.f25220r.isEmpty() && this.f25215m.isEmpty() && this.f25214l.isEmpty() && this.f25216n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean zIsEmpty = this.f25210h.isEmpty();
        boolean zIsEmpty2 = this.f25212j.isEmpty();
        boolean zIsEmpty3 = this.f25213k.isEmpty();
        boolean zIsEmpty4 = this.f25211i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f25210h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.C) it.next());
        }
        this.f25210h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f25212j);
            this.f25215m.add(arrayList);
            this.f25212j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                Z.f0(((j) arrayList.get(0)).f25255a.f25024a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f25213k);
            this.f25216n.add(arrayList2);
            this.f25213k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                Z.f0(((i) arrayList2.get(0)).f25249a.f25024a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f25211i);
        this.f25214l.add(arrayList3);
        this.f25211i.clear();
        RunnableC0314c runnableC0314c = new RunnableC0314c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0314c.run();
        } else {
            Z.f0(((RecyclerView.C) arrayList3.get(0)).f25024a, runnableC0314c, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean w(RecyclerView.C c10) {
        Z(c10);
        c10.f25024a.setAlpha(0.0f);
        this.f25211i.add(c10);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean x(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13) {
        if (c10 == c11) {
            return y(c10, i10, i11, i12, i13);
        }
        float translationX = c10.f25024a.getTranslationX();
        float translationY = c10.f25024a.getTranslationY();
        float alpha = c10.f25024a.getAlpha();
        Z(c10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        c10.f25024a.setTranslationX(translationX);
        c10.f25024a.setTranslationY(translationY);
        c10.f25024a.setAlpha(alpha);
        if (c11 != null) {
            Z(c11);
            c11.f25024a.setTranslationX(-i14);
            c11.f25024a.setTranslationY(-i15);
            c11.f25024a.setAlpha(0.0f);
        }
        this.f25213k.add(new i(c10, c11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean y(RecyclerView.C c10, int i10, int i11, int i12, int i13) {
        View view = c10.f25024a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) c10.f25024a.getTranslationY());
        Z(c10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(c10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f25212j.add(new j(c10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean z(RecyclerView.C c10) {
        Z(c10);
        this.f25210h.add(c10);
        return true;
    }
}
