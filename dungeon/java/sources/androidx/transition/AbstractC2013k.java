package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p323s.C4101a;
import p323s.C4123x;

/* JADX INFO: renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2013k implements Cloneable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Animator[] f25596I = new Animator[0];

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int[] f25597J = {2, 1, 3, 4};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final AbstractC2009g f25598K = new a();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static ThreadLocal f25599L = new ThreadLocal();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private e f25605F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private C4101a f25606G;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f25627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f25628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f[] f25629v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25608a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25609b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f25610c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f25611d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f25612e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f25613f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f25614g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f25615h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f25616i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f25617j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f25618k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList f25619l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f25620m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f25621n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList f25622o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private w f25623p = new w();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private w f25624q = new w();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    t f25625r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int[] f25626s = f25597J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f25630w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ArrayList f25631x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Animator[] f25632y = f25596I;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f25633z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f25600A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    boolean f25601B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private AbstractC2013k f25602C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ArrayList f25603D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    ArrayList f25604E = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private AbstractC2009g f25607H = f25598K;

    /* JADX INFO: renamed from: androidx.transition.k$a */
    class a extends AbstractC2009g {
        a() {
        }

        @Override // androidx.transition.AbstractC2009g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4101a f25634a;

        b(C4101a c4101a) {
            this.f25634a = c4101a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25634a.remove(animator);
            AbstractC2013k.this.f25631x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC2013k.this.f25631x.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2013k.this.r();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$d */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f25637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f25638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f25639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f25640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        AbstractC2013k f25641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f25642f;

        d(View view, String str, AbstractC2013k abstractC2013k, WindowId windowId, v vVar, Animator animator) {
            this.f25637a = view;
            this.f25638b = str;
            this.f25639c = vVar;
            this.f25640d = windowId;
            this.f25641e = abstractC2013k;
            this.f25642f = animator;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: androidx.transition.k$f */
    public interface f {
        void a(AbstractC2013k abstractC2013k);

        void b(AbstractC2013k abstractC2013k);

        void c(AbstractC2013k abstractC2013k);

        default void d(AbstractC2013k abstractC2013k, boolean z10) {
            e(abstractC2013k);
        }

        void e(AbstractC2013k abstractC2013k);

        void f(AbstractC2013k abstractC2013k);

        default void g(AbstractC2013k abstractC2013k, boolean z10) {
            b(abstractC2013k);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.k$g */
    interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f25643a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f25644b = new m();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f25645c = new n();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f25646d = new o();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final g f25647e = new p();

        void b(f fVar, AbstractC2013k abstractC2013k, boolean z10);
    }

    private static C4101a B() {
        C4101a c4101a = (C4101a) f25599L.get();
        if (c4101a != null) {
            return c4101a;
        }
        C4101a c4101a2 = new C4101a();
        f25599L.set(c4101a2);
        return c4101a2;
    }

    private static boolean N(v vVar, v vVar2, String str) {
        Object obj = vVar.f25664a.get(str);
        Object obj2 = vVar2.f25664a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void O(C4101a c4101a, C4101a c4101a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && M(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && M(view)) {
                v vVar = (v) c4101a.get(view2);
                v vVar2 = (v) c4101a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f25627t.add(vVar);
                    this.f25628u.add(vVar2);
                    c4101a.remove(view2);
                    c4101a2.remove(view);
                }
            }
        }
    }

    private void P(C4101a c4101a, C4101a c4101a2) {
        v vVar;
        for (int size = c4101a.size() - 1; size >= 0; size--) {
            View view = (View) c4101a.f(size);
            if (view != null && M(view) && (vVar = (v) c4101a2.remove(view)) != null && M(vVar.f25665b)) {
                this.f25627t.add((v) c4101a.h(size));
                this.f25628u.add(vVar);
            }
        }
    }

    private void Q(C4101a c4101a, C4101a c4101a2, C4123x c4123x, C4123x c4123x2) {
        View view;
        int iN = c4123x.n();
        for (int i10 = 0; i10 < iN; i10++) {
            View view2 = (View) c4123x.o(i10);
            if (view2 != null && M(view2) && (view = (View) c4123x2.e(c4123x.h(i10))) != null && M(view)) {
                v vVar = (v) c4101a.get(view2);
                v vVar2 = (v) c4101a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f25627t.add(vVar);
                    this.f25628u.add(vVar2);
                    c4101a.remove(view2);
                    c4101a2.remove(view);
                }
            }
        }
    }

    private void R(C4101a c4101a, C4101a c4101a2, C4101a c4101a3, C4101a c4101a4) {
        View view;
        int size = c4101a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c4101a3.k(i10);
            if (view2 != null && M(view2) && (view = (View) c4101a4.get(c4101a3.f(i10))) != null && M(view)) {
                v vVar = (v) c4101a.get(view2);
                v vVar2 = (v) c4101a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f25627t.add(vVar);
                    this.f25628u.add(vVar2);
                    c4101a.remove(view2);
                    c4101a2.remove(view);
                }
            }
        }
    }

    private void S(w wVar, w wVar2) {
        C4101a c4101a = new C4101a(wVar.f25667a);
        C4101a c4101a2 = new C4101a(wVar2.f25667a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f25626s;
            if (i10 >= iArr.length) {
                d(c4101a, c4101a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                P(c4101a, c4101a2);
            } else if (i11 == 2) {
                R(c4101a, c4101a2, wVar.f25670d, wVar2.f25670d);
            } else if (i11 == 3) {
                O(c4101a, c4101a2, wVar.f25668b, wVar2.f25668b);
            } else if (i11 == 4) {
                Q(c4101a, c4101a2, wVar.f25669c, wVar2.f25669c);
            }
            i10++;
        }
    }

    private void T(AbstractC2013k abstractC2013k, g gVar, boolean z10) {
        AbstractC2013k abstractC2013k2 = this.f25602C;
        if (abstractC2013k2 != null) {
            abstractC2013k2.T(abstractC2013k, gVar, z10);
        }
        ArrayList arrayList = this.f25603D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f25603D.size();
        f[] fVarArr = this.f25629v;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f25629v = null;
        f[] fVarArr2 = (f[]) this.f25603D.toArray(fVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            gVar.b(fVarArr2[i10], abstractC2013k, z10);
            fVarArr2[i10] = null;
        }
        this.f25629v = fVarArr2;
    }

    private void a0(Animator animator, C4101a c4101a) {
        if (animator != null) {
            animator.addListener(new b(c4101a));
            f(animator);
        }
    }

    private void d(C4101a c4101a, C4101a c4101a2) {
        for (int i10 = 0; i10 < c4101a.size(); i10++) {
            v vVar = (v) c4101a.k(i10);
            if (M(vVar.f25665b)) {
                this.f25627t.add(vVar);
                this.f25628u.add(null);
            }
        }
        for (int i11 = 0; i11 < c4101a2.size(); i11++) {
            v vVar2 = (v) c4101a2.k(i11);
            if (M(vVar2.f25665b)) {
                this.f25628u.add(vVar2);
                this.f25627t.add(null);
            }
        }
    }

    private static void e(w wVar, View view, v vVar) {
        wVar.f25667a.put(view, vVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (wVar.f25668b.indexOfKey(id2) >= 0) {
                wVar.f25668b.put(id2, null);
            } else {
                wVar.f25668b.put(id2, view);
            }
        }
        String strI = Z.I(view);
        if (strI != null) {
            if (wVar.f25670d.containsKey(strI)) {
                wVar.f25670d.put(strI, null);
            } else {
                wVar.f25670d.put(strI, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (wVar.f25669c.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    wVar.f25669c.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) wVar.f25669c.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    wVar.f25669c.j(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f25616i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f25617j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f25618k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f25618k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    v vVar = new v(view);
                    if (z10) {
                        l(vVar);
                    } else {
                        g(vVar);
                    }
                    vVar.f25666c.add(this);
                    j(vVar);
                    if (z10) {
                        e(this.f25623p, view, vVar);
                    } else {
                        e(this.f25624q, view, vVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f25620m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f25621n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f25622o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f25622o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                h(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public final AbstractC2013k A() {
        t tVar = this.f25625r;
        return tVar != null ? tVar.A() : this;
    }

    public long C() {
        return this.f25609b;
    }

    public List D() {
        return this.f25612e;
    }

    public List E() {
        return this.f25614g;
    }

    public List F() {
        return this.f25615h;
    }

    public List H() {
        return this.f25613f;
    }

    public String[] I() {
        return null;
    }

    public v J(View view, boolean z10) {
        t tVar = this.f25625r;
        if (tVar != null) {
            return tVar.J(view, z10);
        }
        return (v) (z10 ? this.f25623p : this.f25624q).f25667a.get(view);
    }

    public boolean K(v vVar, v vVar2) {
        if (vVar != null && vVar2 != null) {
            String[] strArrI = I();
            if (strArrI != null) {
                for (String str : strArrI) {
                    if (N(vVar, vVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = vVar.f25664a.keySet().iterator();
                while (it.hasNext()) {
                    if (N(vVar, vVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean M(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f25616i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f25617j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f25618k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f25618k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f25619l != null && Z.I(view) != null && this.f25619l.contains(Z.I(view))) {
            return false;
        }
        if ((this.f25612e.size() == 0 && this.f25613f.size() == 0 && (((arrayList = this.f25615h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f25614g) == null || arrayList2.isEmpty()))) || this.f25612e.contains(Integer.valueOf(id2)) || this.f25613f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f25614g;
        if (arrayList6 != null && arrayList6.contains(Z.I(view))) {
            return true;
        }
        if (this.f25615h != null) {
            for (int i11 = 0; i11 < this.f25615h.size(); i11++) {
                if (((Class) this.f25615h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void U(g gVar, boolean z10) {
        T(this, gVar, z10);
    }

    public void V(View view) {
        if (this.f25601B) {
            return;
        }
        int size = this.f25631x.size();
        Animator[] animatorArr = (Animator[]) this.f25631x.toArray(this.f25632y);
        this.f25632y = f25596I;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f25632y = animatorArr;
        U(g.f25646d, false);
        this.f25600A = true;
    }

    void W(ViewGroup viewGroup) {
        d dVar;
        this.f25627t = new ArrayList();
        this.f25628u = new ArrayList();
        S(this.f25623p, this.f25624q);
        C4101a c4101aB = B();
        int size = c4101aB.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) c4101aB.f(i10);
            if (animator != null && (dVar = (d) c4101aB.get(animator)) != null && dVar.f25637a != null && windowId.equals(dVar.f25640d)) {
                v vVar = dVar.f25639c;
                View view = dVar.f25637a;
                v vVarJ = J(view, true);
                v vVarW = w(view, true);
                if (vVarJ == null && vVarW == null) {
                    vVarW = (v) this.f25624q.f25667a.get(view);
                }
                if ((vVarJ != null || vVarW != null) && dVar.f25641e.K(vVar, vVarW)) {
                    dVar.f25641e.A().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c4101aB.remove(animator);
                    }
                }
            }
        }
        q(viewGroup, this.f25623p, this.f25624q, this.f25627t, this.f25628u);
        b0();
    }

    public AbstractC2013k X(f fVar) {
        AbstractC2013k abstractC2013k;
        ArrayList arrayList = this.f25603D;
        if (arrayList != null) {
            if (!arrayList.remove(fVar) && (abstractC2013k = this.f25602C) != null) {
                abstractC2013k.X(fVar);
            }
            if (this.f25603D.size() == 0) {
                this.f25603D = null;
            }
        }
        return this;
    }

    public AbstractC2013k Y(View view) {
        this.f25613f.remove(view);
        return this;
    }

    public void Z(View view) {
        if (this.f25600A) {
            if (!this.f25601B) {
                int size = this.f25631x.size();
                Animator[] animatorArr = (Animator[]) this.f25631x.toArray(this.f25632y);
                this.f25632y = f25596I;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f25632y = animatorArr;
                U(g.f25647e, false);
            }
            this.f25600A = false;
        }
    }

    public AbstractC2013k b(f fVar) {
        if (this.f25603D == null) {
            this.f25603D = new ArrayList();
        }
        this.f25603D.add(fVar);
        return this;
    }

    protected void b0() {
        l0();
        C4101a c4101aB = B();
        for (Animator animator : this.f25604E) {
            if (c4101aB.containsKey(animator)) {
                l0();
                a0(animator, c4101aB);
            }
        }
        this.f25604E.clear();
        r();
    }

    public AbstractC2013k c(View view) {
        this.f25613f.add(view);
        return this;
    }

    protected void cancel() {
        int size = this.f25631x.size();
        Animator[] animatorArr = (Animator[]) this.f25631x.toArray(this.f25632y);
        this.f25632y = f25596I;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f25632y = animatorArr;
        U(g.f25645c, false);
    }

    public AbstractC2013k d0(long j10) {
        this.f25610c = j10;
        return this;
    }

    protected void f(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (v() != null) {
            animator.setInterpolator(v());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void f0(e eVar) {
        this.f25605F = eVar;
    }

    public abstract void g(v vVar);

    public AbstractC2013k g0(TimeInterpolator timeInterpolator) {
        this.f25611d = timeInterpolator;
        return this;
    }

    public void i0(AbstractC2009g abstractC2009g) {
        if (abstractC2009g == null) {
            this.f25607H = f25598K;
        } else {
            this.f25607H = abstractC2009g;
        }
    }

    void j(v vVar) {
    }

    public void j0(s sVar) {
    }

    public AbstractC2013k k0(long j10) {
        this.f25609b = j10;
        return this;
    }

    public abstract void l(v vVar);

    protected void l0() {
        if (this.f25633z == 0) {
            U(g.f25643a, false);
            this.f25601B = false;
        }
        this.f25633z++;
    }

    void m(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C4101a c4101a;
        n(z10);
        if ((this.f25612e.size() > 0 || this.f25613f.size() > 0) && (((arrayList = this.f25614g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f25615h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f25612e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f25612e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    v vVar = new v(viewFindViewById);
                    if (z10) {
                        l(vVar);
                    } else {
                        g(vVar);
                    }
                    vVar.f25666c.add(this);
                    j(vVar);
                    if (z10) {
                        e(this.f25623p, viewFindViewById, vVar);
                    } else {
                        e(this.f25624q, viewFindViewById, vVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f25613f.size(); i11++) {
                View view = (View) this.f25613f.get(i11);
                v vVar2 = new v(view);
                if (z10) {
                    l(vVar2);
                } else {
                    g(vVar2);
                }
                vVar2.f25666c.add(this);
                j(vVar2);
                if (z10) {
                    e(this.f25623p, view, vVar2);
                } else {
                    e(this.f25624q, view, vVar2);
                }
            }
        } else {
            h(viewGroup, z10);
        }
        if (z10 || (c4101a = this.f25606G) == null) {
            return;
        }
        int size = c4101a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f25623p.f25670d.remove((String) this.f25606G.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f25623p.f25670d.put((String) this.f25606G.k(i13), view2);
            }
        }
    }

    String m0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f25610c != -1) {
            sb2.append("dur(");
            sb2.append(this.f25610c);
            sb2.append(") ");
        }
        if (this.f25609b != -1) {
            sb2.append("dly(");
            sb2.append(this.f25609b);
            sb2.append(") ");
        }
        if (this.f25611d != null) {
            sb2.append("interp(");
            sb2.append(this.f25611d);
            sb2.append(") ");
        }
        if (this.f25612e.size() > 0 || this.f25613f.size() > 0) {
            sb2.append("tgts(");
            if (this.f25612e.size() > 0) {
                for (int i10 = 0; i10 < this.f25612e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f25612e.get(i10));
                }
            }
            if (this.f25613f.size() > 0) {
                for (int i11 = 0; i11 < this.f25613f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f25613f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    void n(boolean z10) {
        if (z10) {
            this.f25623p.f25667a.clear();
            this.f25623p.f25668b.clear();
            this.f25623p.f25669c.b();
        } else {
            this.f25624q.f25667a.clear();
            this.f25624q.f25668b.clear();
            this.f25624q.f25669c.b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: o */
    public AbstractC2013k clone() {
        try {
            AbstractC2013k abstractC2013k = (AbstractC2013k) super.clone();
            abstractC2013k.f25604E = new ArrayList();
            abstractC2013k.f25623p = new w();
            abstractC2013k.f25624q = new w();
            abstractC2013k.f25627t = null;
            abstractC2013k.f25628u = null;
            abstractC2013k.f25602C = this;
            abstractC2013k.f25603D = null;
            return abstractC2013k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator p(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    void q(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        v vVar;
        View view2;
        Animator animator2;
        C4101a c4101aB = B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        A().getClass();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar2 = (v) arrayList.get(i10);
            v vVar3 = (v) arrayList2.get(i10);
            if (vVar2 != null && !vVar2.f25666c.contains(this)) {
                vVar2 = null;
            }
            if (vVar3 != null && !vVar3.f25666c.contains(this)) {
                vVar3 = null;
            }
            if ((vVar2 != null || vVar3 != null) && (vVar2 == null || vVar3 == null || K(vVar2, vVar3))) {
                Animator animatorP = p(viewGroup, vVar2, vVar3);
                if (animatorP != null) {
                    if (vVar3 != null) {
                        View view3 = vVar3.f25665b;
                        String[] strArrI = I();
                        if (strArrI != null && strArrI.length > 0) {
                            vVar = new v(view3);
                            v vVar4 = (v) wVar2.f25667a.get(view3);
                            if (vVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrI.length) {
                                    Map map = vVar.f25664a;
                                    String[] strArr = strArrI;
                                    String str = strArr[i11];
                                    map.put(str, vVar4.f25664a.get(str));
                                    i11++;
                                    strArrI = strArr;
                                }
                            }
                            int size2 = c4101aB.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorP;
                                    break;
                                }
                                d dVar = (d) c4101aB.get((Animator) c4101aB.f(i12));
                                if (dVar.f25639c != null && dVar.f25637a == view3) {
                                    view2 = view3;
                                    if (dVar.f25638b.equals(x()) && dVar.f25639c.equals(vVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i12++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorP;
                            vVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = vVar2.f25665b;
                        animator = animatorP;
                        vVar = null;
                    }
                    if (animator != null) {
                        c4101aB.put(animator, new d(view, x(), this, viewGroup.getWindowId(), vVar, animator));
                        this.f25604E.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar2 = (d) c4101aB.get((Animator) this.f25604E.get(sparseIntArray.keyAt(i13)));
                dVar2.f25642f.setStartDelay((((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE) + dVar2.f25642f.getStartDelay());
            }
        }
    }

    protected void r() {
        int i10 = this.f25633z - 1;
        this.f25633z = i10;
        if (i10 == 0) {
            U(g.f25644b, false);
            for (int i11 = 0; i11 < this.f25623p.f25669c.n(); i11++) {
                View view = (View) this.f25623p.f25669c.o(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f25624q.f25669c.n(); i12++) {
                View view2 = (View) this.f25624q.f25669c.o(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f25601B = true;
        }
    }

    public long s() {
        return this.f25610c;
    }

    public String toString() {
        return m0("");
    }

    public e u() {
        return this.f25605F;
    }

    public TimeInterpolator v() {
        return this.f25611d;
    }

    v w(View view, boolean z10) {
        t tVar = this.f25625r;
        if (tVar != null) {
            return tVar.w(view, z10);
        }
        ArrayList arrayList = z10 ? this.f25627t : this.f25628u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            v vVar = (v) arrayList.get(i10);
            if (vVar == null) {
                return null;
            }
            if (vVar.f25665b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (v) (z10 ? this.f25628u : this.f25627t).get(i10);
        }
        return null;
    }

    public String x() {
        return this.f25608a;
    }

    public AbstractC2009g y() {
        return this.f25607H;
    }

    public s z() {
        return null;
    }
}
