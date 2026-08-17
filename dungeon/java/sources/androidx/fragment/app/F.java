package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23883f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f23884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f23886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23888e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final F a(ViewGroup container, q fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            G gZ0 = fragmentManager.z0();
            Intrinsics.checkNotNullExpressionValue(gZ0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, gZ0);
        }

        public final F b(ViewGroup container, G factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(F1.b.f2909b);
            if (tag instanceof F) {
                return (F) tag;
            }
            F fA = factory.a(container);
            Intrinsics.checkNotNullExpressionValue(fA, "factory.createController(container)");
            container.setTag(F1.b.f2909b, fA);
            return fA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final v f23889h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b finalState, c.a lifecycleImpact, v fragmentStateManager, p128h1.d cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            i iVarK = fragmentStateManager.k();
            Intrinsics.checkNotNullExpressionValue(iVarK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, iVarK, cancellationSignal);
            this.f23889h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.F.c
        public void e() {
            super.e();
            this.f23889h.m();
        }

        @Override // androidx.fragment.app.F.c
        public void n() {
            if (i() != c.a.ADDING) {
                if (i() == c.a.REMOVING) {
                    i iVarK = this.f23889h.k();
                    Intrinsics.checkNotNullExpressionValue(iVarK, "fragmentStateManager.fragment");
                    View viewH1 = iVarK.H1();
                    Intrinsics.checkNotNullExpressionValue(viewH1, "fragment.requireView()");
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewH1.findFocus() + " on view " + viewH1 + " for Fragment " + iVarK);
                    }
                    viewH1.clearFocus();
                    return;
                }
                return;
            }
            i iVarK2 = this.f23889h.k();
            Intrinsics.checkNotNullExpressionValue(iVarK2, "fragmentStateManager.fragment");
            View viewFindFocus = iVarK2.f23993I.findFocus();
            if (viewFindFocus != null) {
                iVarK2.N1(viewFindFocus);
                if (q.H0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + iVarK2);
                }
            }
            View viewH2 = h().H1();
            Intrinsics.checkNotNullExpressionValue(viewH2, "this.fragment.requireView()");
            if (viewH2.getParent() == null) {
                this.f23889h.b();
                viewH2.setAlpha(0.0f);
            }
            if (viewH2.getAlpha() == 0.0f && viewH2.getVisibility() == 0) {
                viewH2.setVisibility(4);
            }
            viewH2.setAlpha(iVarK2.Y());
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f23890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f23891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i f23892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f23893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f23894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f23895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f23896g;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f23901a = new a(null);

            public static final class a {
                private a() {
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.F$c$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0293b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f23907a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f23907a = iArr;
                }
            }

            public static final b h(int i10) {
                return f23901a.b(i10);
            }

            public final void g(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int i10 = C0293b.f23907a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (q.H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (q.H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.F$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C0294c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23908a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f23908a = iArr;
            }
        }

        public c(b finalState, a lifecycleImpact, i fragment, p128h1.d cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.f23890a = finalState;
            this.f23891b = lifecycleImpact;
            this.f23892c = fragment;
            this.f23893d = new ArrayList();
            this.f23894e = new LinkedHashSet();
            cancellationSignal.c(new G1.r(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.d();
        }

        public final void c(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f23893d.add(listener);
        }

        public final void d() {
            if (this.f23895f) {
                return;
            }
            this.f23895f = true;
            if (this.f23894e.isEmpty()) {
                e();
                return;
            }
            Iterator it = CollectionsKt.X0(this.f23894e).iterator();
            while (it.hasNext()) {
                ((p128h1.d) it.next()).a();
            }
        }

        public void e() {
            if (this.f23896g) {
                return;
            }
            if (q.H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f23896g = true;
            Iterator it = this.f23893d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(p128h1.d signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (this.f23894e.remove(signal) && this.f23894e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.f23890a;
        }

        public final i h() {
            return this.f23892c;
        }

        public final a i() {
            return this.f23891b;
        }

        public final boolean j() {
            return this.f23895f;
        }

        public final boolean k() {
            return this.f23896g;
        }

        public final void l(p128h1.d signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            n();
            this.f23894e.add(signal);
        }

        public final void m(b finalState, a lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i10 = C0294c.f23908a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.f23890a == b.REMOVED) {
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f23892c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f23891b + " to ADDING.");
                    }
                    this.f23890a = b.VISIBLE;
                    this.f23891b = a.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (q.H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f23892c + " mFinalState = " + this.f23890a + " -> REMOVED. mLifecycleImpact  = " + this.f23891b + " to REMOVING.");
                }
                this.f23890a = b.REMOVED;
                this.f23891b = a.REMOVING;
                return;
            }
            if (i10 == 3 && this.f23890a != b.REMOVED) {
                if (q.H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f23892c + " mFinalState = " + this.f23890a + " -> " + finalState + '.');
                }
                this.f23890a = finalState;
            }
        }

        public abstract void n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f23890a + " lifecycleImpact = " + this.f23891b + " fragment = " + this.f23892c + '}';
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23909a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23909a = iArr;
        }
    }

    public F(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f23884a = container;
        this.f23885b = new ArrayList();
        this.f23886c = new ArrayList();
    }

    private final void c(c.b bVar, c.a aVar, v vVar) {
        synchronized (this.f23885b) {
            p128h1.d dVar = new p128h1.d();
            i iVarK = vVar.k();
            Intrinsics.checkNotNullExpressionValue(iVarK, "fragmentStateManager.fragment");
            c cVarL = l(iVarK);
            if (cVarL != null) {
                cVarL.m(bVar, aVar);
                return;
            }
            b bVar2 = new b(bVar, aVar, vVar, dVar);
            this.f23885b.add(bVar2);
            bVar2.c(new D(this, bVar2));
            bVar2.c(new E(this, bVar2));
            Unit unit = Unit.f48228a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(F this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.f23885b.contains(operation)) {
            c.b bVarG = operation.g();
            View view = operation.h().f23993I;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            bVarG.g(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(F this$0, b operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.f23885b.remove(operation);
        this$0.f23886c.remove(operation);
    }

    private final c l(i iVar) {
        Object next;
        Iterator it = this.f23885b.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (Intrinsics.b(cVar.h(), iVar) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    private final c m(i iVar) {
        Object next;
        Iterator it = this.f23886c.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (Intrinsics.b(cVar.h(), iVar) && !cVar.j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    public static final F r(ViewGroup viewGroup, q qVar) {
        return f23883f.a(viewGroup, qVar);
    }

    public static final F s(ViewGroup viewGroup, G g10) {
        return f23883f.b(viewGroup, g10);
    }

    private final void u() {
        for (c cVar : this.f23885b) {
            if (cVar.i() == c.a.ADDING) {
                View viewH1 = cVar.h().H1();
                Intrinsics.checkNotNullExpressionValue(viewH1, "fragment.requireView()");
                cVar.m(c.b.f23901a.b(viewH1.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void f(c.b finalState, v fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (q.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        c(finalState, c.a.ADDING, fragmentStateManager);
    }

    public final void g(v fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (q.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    public final void h(v fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (q.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    public final void i(v fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (q.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    public abstract void j(List list, boolean z10);

    public final void k() {
        if (this.f23888e) {
            return;
        }
        if (!Z.Q(this.f23884a)) {
            n();
            this.f23887d = false;
            return;
        }
        synchronized (this.f23885b) {
            try {
                if (!this.f23885b.isEmpty()) {
                    List<c> listW0 = CollectionsKt.W0(this.f23886c);
                    this.f23886c.clear();
                    for (c cVar : listW0) {
                        if (q.H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.d();
                        if (!cVar.k()) {
                            this.f23886c.add(cVar);
                        }
                    }
                    u();
                    List listW1 = CollectionsKt.W0(this.f23885b);
                    this.f23885b.clear();
                    this.f23886c.addAll(listW1);
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = listW1.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).n();
                    }
                    j(listW1, this.f23887d);
                    this.f23887d = false;
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (q.H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zQ = Z.Q(this.f23884a);
        synchronized (this.f23885b) {
            try {
                u();
                Iterator it = this.f23885b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).n();
                }
                for (c cVar : CollectionsKt.W0(this.f23886c)) {
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zQ ? "" : "Container " + this.f23884a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.d();
                }
                for (c cVar2 : CollectionsKt.W0(this.f23885b)) {
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zQ ? "" : "Container " + this.f23884a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.d();
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f23888e) {
            if (q.H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f23888e = false;
            k();
        }
    }

    public final c.a p(v fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        i iVarK = fragmentStateManager.k();
        Intrinsics.checkNotNullExpressionValue(iVarK, "fragmentStateManager.fragment");
        c cVarL = l(iVarK);
        c.a aVarI = cVarL != null ? cVarL.i() : null;
        c cVarM = m(iVarK);
        c.a aVarI2 = cVarM != null ? cVarM.i() : null;
        int i10 = aVarI == null ? -1 : d.f23909a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup q() {
        return this.f23884a;
    }

    public final void t() {
        Object objPrevious;
        synchronized (this.f23885b) {
            try {
                u();
                List list = this.f23885b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    c.b.a aVar = c.b.f23901a;
                    View view = cVar.h().f23993I;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    c.b bVarA = aVar.a(view);
                    c.b bVarG = cVar.g();
                    c.b bVar = c.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                i iVarH = cVar2 != null ? cVar2.h() : null;
                this.f23888e = iVarH != null ? iVarH.s0() : false;
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z10) {
        this.f23887d = z10;
    }
}
