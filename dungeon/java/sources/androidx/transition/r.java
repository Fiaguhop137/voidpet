package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC2013k f25648a = new C2003a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f25649b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f25650c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AbstractC2013k f25651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f25652b;

        /* JADX INFO: renamed from: androidx.transition.r$a$a, reason: collision with other inner class name */
        class C0325a extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4101a f25653a;

            C0325a(C4101a c4101a) {
                this.f25653a = c4101a;
            }

            @Override // androidx.transition.AbstractC2013k.f
            public void e(AbstractC2013k abstractC2013k) {
                ((ArrayList) this.f25653a.get(a.this.f25652b)).remove(abstractC2013k);
                abstractC2013k.X(this);
            }
        }

        a(AbstractC2013k abstractC2013k, ViewGroup viewGroup) {
            this.f25651a = abstractC2013k;
            this.f25652b = viewGroup;
        }

        private void a() {
            this.f25652b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f25652b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!r.f25650c.remove(this.f25652b)) {
                return true;
            }
            C4101a c4101aB = r.b();
            ArrayList arrayList = (ArrayList) c4101aB.get(this.f25652b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c4101aB.put(this.f25652b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f25651a);
            this.f25651a.b(new C0325a(c4101aB));
            this.f25651a.m(this.f25652b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC2013k) it.next()).Z(this.f25652b);
                }
            }
            this.f25651a.W(this.f25652b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            r.f25650c.remove(this.f25652b);
            ArrayList arrayList = (ArrayList) r.b().get(this.f25652b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC2013k) it.next()).Z(this.f25652b);
                }
            }
            this.f25651a.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, AbstractC2013k abstractC2013k) {
        if (f25650c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f25650c.add(viewGroup);
        if (abstractC2013k == null) {
            abstractC2013k = f25648a;
        }
        AbstractC2013k abstractC2013kClone = abstractC2013k.clone();
        d(viewGroup, abstractC2013kClone);
        AbstractC2012j.b(viewGroup, null);
        c(viewGroup, abstractC2013kClone);
    }

    static C4101a b() {
        C4101a c4101a;
        WeakReference weakReference = (WeakReference) f25649b.get();
        if (weakReference != null && (c4101a = (C4101a) weakReference.get()) != null) {
            return c4101a;
        }
        C4101a c4101a2 = new C4101a();
        f25649b.set(new WeakReference(c4101a2));
        return c4101a2;
    }

    private static void c(ViewGroup viewGroup, AbstractC2013k abstractC2013k) {
        if (abstractC2013k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC2013k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC2013k abstractC2013k) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC2013k) it.next()).V(viewGroup);
            }
        }
        if (abstractC2013k != null) {
            abstractC2013k.m(viewGroup, true);
        }
        AbstractC2012j.a(viewGroup);
    }
}
