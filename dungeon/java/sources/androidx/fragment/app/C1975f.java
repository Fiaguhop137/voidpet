package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.AbstractC1903e0;
import androidx.core.view.K;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p323s.C4101a;

/* JADX INFO: renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1975f extends F {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    static final class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f23941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k.a f23943e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(F.c operation, p128h1.d signal, boolean z10) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f23941c = z10;
        }

        public final k.a e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f23942d) {
                return this.f23943e;
            }
            k.a aVarB = k.b(context, b().h(), b().g() == F.c.b.VISIBLE, this.f23941c);
            this.f23943e = aVarB;
            this.f23942d = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F.c f23944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p128h1.d f23945b;

        public b(F.c operation, p128h1.d signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f23944a = operation;
            this.f23945b = signal;
        }

        public final void a() {
            this.f23944a.f(this.f23945b);
        }

        public final F.c b() {
            return this.f23944a;
        }

        public final p128h1.d c() {
            return this.f23945b;
        }

        public final boolean d() {
            F.c.b.a aVar = F.c.b.f23901a;
            View view = this.f23944a.h().f23993I;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            F.c.b bVarA = aVar.a(view);
            F.c.b bVarG = this.f23944a.g();
            if (bVarA == bVarG) {
                return true;
            }
            F.c.b bVar = F.c.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$c */
    static final class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f23946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f23947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f23948e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(F.c operation, p128h1.d signal, boolean z10, boolean z11) {
            Object objB0;
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            F.c.b bVarG = operation.g();
            F.c.b bVar = F.c.b.VISIBLE;
            if (bVarG == bVar) {
                i iVarH = operation.h();
                objB0 = z10 ? iVarH.Z() : iVarH.I();
            } else {
                i iVarH2 = operation.h();
                objB0 = z10 ? iVarH2.b0() : iVarH2.L();
            }
            this.f23946c = objB0;
            this.f23947d = operation.g() == bVar ? z10 ? operation.h().C() : operation.h().B() : true;
            this.f23948e = z11 ? z10 ? operation.h().d0() : operation.h().c0() : null;
        }

        private final A f(Object obj) {
            if (obj == null) {
                return null;
            }
            A a10 = y.f24225b;
            if (a10 != null && a10.e(obj)) {
                return a10;
            }
            A a11 = y.f24226c;
            if (a11 != null && a11.e(obj)) {
                return a11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final A e() {
            A aF = f(this.f23946c);
            A aF2 = f(this.f23948e);
            if (aF == null || aF2 == null || aF == aF2) {
                return aF == null ? aF2 : aF;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f23946c + " which uses a different Transition  type than its shared element transition " + this.f23948e).toString());
        }

        public final Object g() {
            return this.f23948e;
        }

        public final Object h() {
            return this.f23946c;
        }

        public final boolean i() {
            return this.f23948e != null;
        }

        public final boolean j() {
            return this.f23947d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$d */
    static final class d extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f23949a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Collection collection) {
            super(1);
            this.f23949a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(CollectionsKt.b0(this.f23949a, Z.I((View) entry.getValue())));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$e */
    public static final class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f23951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ F.c f23953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f23954e;

        e(View view, boolean z10, F.c cVar, a aVar) {
            this.f23951b = view;
            this.f23952c = z10;
            this.f23953d = cVar;
            this.f23954e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator anim) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            C1975f.this.q().endViewTransition(this.f23951b);
            if (this.f23952c) {
                F.c.b bVarG = this.f23953d.g();
                View viewToAnimate = this.f23951b;
                Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                bVarG.g(viewToAnimate);
            }
            this.f23954e.a();
            if (q.H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f23953d + " has ended.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    public static final class AnimationAnimationListenerC0295f implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F.c f23955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1975f f23956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f23957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f23958d;

        AnimationAnimationListenerC0295f(F.c cVar, C1975f c1975f, View view, a aVar) {
            this.f23955a = cVar;
            this.f23956b = c1975f;
            this.f23957c = view;
            this.f23958d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C1975f this$0, View view, a animationInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
            this$0.q().endViewTransition(view);
            animationInfo.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f23956b.q().post(new RunnableC1976g(this.f23956b, this.f23957c, this.f23958d));
            if (q.H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f23955a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (q.H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f23955a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1975f(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    private final void D(F.c cVar) {
        View view = cVar.h().f23993I;
        F.c.b bVarG = cVar.g();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        bVarG.g(view);
    }

    private final void E(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC1903e0.c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                E(arrayList, child);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List awaitingContainerChanges, F.c operation, C1975f this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.D(operation);
        }
    }

    private final void G(Map map, View view) {
        String strI = Z.I(view);
        if (strI != null) {
            map.put(strI, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    G(map, child);
                }
            }
        }
    }

    private final void H(C4101a c4101a, Collection collection) {
        Set entries = c4101a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.M(entries, new d(collection));
    }

    private final void I(List list, List list2, boolean z10, Map map) {
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.d()) {
                aVar.a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                k.a aVarE = aVar.e(context);
                if (aVarE == null) {
                    aVar.a();
                } else {
                    Animator animator = aVarE.f24073b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        F.c cVarB = aVar.b();
                        i iVarH = cVarB.h();
                        if (Intrinsics.b(map.get(cVarB), Boolean.TRUE)) {
                            if (q.H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + iVarH + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            boolean z12 = cVarB.g() == F.c.b.GONE;
                            if (z12) {
                                list2.remove(cVarB);
                            }
                            View view = iVarH.f23993I;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z12, cVarB, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (q.H0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + cVarB + " has started.");
                            }
                            aVar.c().c(new G1.b(animator, cVarB));
                            z11 = true;
                        }
                    }
                }
            }
        }
        for (a aVar2 : arrayList) {
            F.c cVarB2 = aVar2.b();
            i iVarH2 = cVarB2.h();
            if (z10) {
                if (q.H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + iVarH2 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z11) {
                if (q.H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + iVarH2 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                View view2 = iVarH2.f23993I;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                k.a aVarE2 = aVar2.e(context);
                if (aVarE2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = aVarE2.f24072a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (cVarB2.g() != F.c.b.REMOVED) {
                    view2.startAnimation(animation);
                    aVar2.a();
                } else {
                    q().startViewTransition(view2);
                    k.b bVar = new k.b(animation, q(), view2);
                    bVar.setAnimationListener(new AnimationAnimationListenerC0295f(cVarB2, this, view2, aVar2));
                    view2.startAnimation(bVar);
                    if (q.H0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + cVarB2 + " has started.");
                    }
                }
                aVar2.c().c(new C1973d(view2, this, aVar2, cVarB2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Animator animator, F.c operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (q.H0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view, C1975f this$0, a animationInfo, F.c operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.q().endViewTransition(view);
        animationInfo.a();
        if (q.H0(2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map L(List list, List list2, boolean z10, F.c cVar, F.c cVar2) {
        Object obj;
        View view;
        String str;
        String str2;
        Object obj2;
        String str3;
        Object obj3;
        boolean z11;
        View view2;
        Object obj4;
        ArrayList arrayList;
        Object obj5;
        F.c cVar3;
        Pair pairA;
        int i10;
        View view3;
        C1975f c1975f = this;
        F.c cVar4 = cVar2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            if (!((c) obj6).d()) {
                arrayList2.add(obj6);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj7 : arrayList2) {
            if (((c) obj7).e() != null) {
                arrayList3.add(obj7);
            }
        }
        A a10 = null;
        for (c cVar5 : arrayList3) {
            A aE = cVar5.e();
            if (a10 != null && aE != a10) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar5.b().h() + " returned Transition " + cVar5.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            a10 = aE;
        }
        if (a10 == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar6 = (c) it.next();
                linkedHashMap.put(cVar6.b(), Boolean.FALSE);
                cVar6.a();
            }
            return linkedHashMap;
        }
        View view4 = new View(c1975f.q().getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C4101a c4101a = new C4101a();
        Iterator it2 = list.iterator();
        Object obj8 = null;
        View view5 = null;
        boolean z12 = false;
        while (true) {
            obj = obj8;
            view = view5;
            str = "FragmentManager";
            if (!it2.hasNext()) {
                break;
            }
            c cVar7 = (c) it2.next();
            if (!cVar7.i() || cVar == null || cVar4 == null) {
                view4 = view4;
                arrayList4 = arrayList4;
                linkedHashMap = linkedHashMap;
                arrayList5 = arrayList5;
                obj8 = obj;
                view5 = view;
                c4101a = c4101a;
            } else {
                Object objU = a10.u(a10.f(cVar7.g()));
                ArrayList arrayListE0 = cVar4.h().e0();
                Intrinsics.checkNotNullExpressionValue(arrayListE0, "lastIn.fragment.sharedElementSourceNames");
                ArrayList arrayListE1 = cVar.h().e0();
                Intrinsics.checkNotNullExpressionValue(arrayListE1, "firstOut.fragment.sharedElementSourceNames");
                ArrayList arrayListF0 = cVar.h().f0();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                Intrinsics.checkNotNullExpressionValue(arrayListF0, "firstOut.fragment.sharedElementTargetNames");
                int size = arrayListF0.size();
                View view6 = view4;
                int i11 = 0;
                while (i11 < size) {
                    int i12 = size;
                    int iIndexOf = arrayListE0.indexOf(arrayListF0.get(i11));
                    ArrayList arrayList6 = arrayListF0;
                    if (iIndexOf != -1) {
                        arrayListE0.set(iIndexOf, arrayListE1.get(i11));
                    }
                    i11++;
                    size = i12;
                    arrayListF0 = arrayList6;
                }
                ArrayList arrayListF1 = cVar4.h().f0();
                Intrinsics.checkNotNullExpressionValue(arrayListF1, "lastIn.fragment.sharedElementTargetNames");
                if (z10) {
                    cVar.h().J();
                    cVar4.h().M();
                    pairA = Ad.v.a(null, null);
                } else {
                    cVar.h().M();
                    cVar4.h().J();
                    pairA = Ad.v.a(null, null);
                }
                android.support.v4.media.session.b.a(pairA.getFirst());
                android.support.v4.media.session.b.a(pairA.getSecond());
                int i13 = 0;
                for (int size2 = arrayListE0.size(); i13 < size2; size2 = size2) {
                    c4101a.put((String) arrayListE0.get(i13), (String) arrayListF1.get(i13));
                    i13++;
                }
                if (q.H0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator it3 = arrayListF1.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator it4 = arrayListE0.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                    }
                }
                C4101a c4101a2 = new C4101a();
                View view7 = cVar.h().f23993I;
                Intrinsics.checkNotNullExpressionValue(view7, "firstOut.fragment.mView");
                c1975f.G(c4101a2, view7);
                c4101a2.q(arrayListE0);
                c4101a.q(c4101a2.keySet());
                C4101a c4101a3 = new C4101a();
                View view8 = cVar4.h().f23993I;
                Intrinsics.checkNotNullExpressionValue(view8, "lastIn.fragment.mView");
                c1975f.G(c4101a3, view8);
                c4101a3.q(arrayListF1);
                c4101a3.q(c4101a.values());
                y.c(c4101a, c4101a3);
                Set setKeySet = c4101a.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                c1975f.H(c4101a2, setKeySet);
                Collection collectionValues = c4101a.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                c1975f.H(c4101a3, collectionValues);
                if (c4101a.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view5 = view;
                    linkedHashMap = linkedHashMap2;
                    view4 = view6;
                    obj8 = null;
                } else {
                    C4101a c4101a4 = c4101a;
                    y.a(cVar4.h(), cVar.h(), z10, c4101a2, true);
                    K.a(c1975f.q(), new G1.c(cVar4, cVar, z10, c4101a3));
                    arrayList4.addAll(c4101a2.values());
                    if (arrayListE0.isEmpty()) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        View view9 = (View) c4101a2.get((String) arrayListE0.get(0));
                        a10.p(objU, view9);
                        view = view9;
                    }
                    arrayList5.addAll(c4101a3.values());
                    if (!arrayListF1.isEmpty() && (view3 = (View) c4101a3.get((String) arrayListF1.get(i10))) != null) {
                        K.a(c1975f.q(), new G1.d(a10, view3, rect));
                        z12 = true;
                    }
                    a10.s(objU, view6, arrayList4);
                    ArrayList arrayList7 = arrayList5;
                    a10.n(objU, null, null, null, null, objU, arrayList7);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap2.put(cVar, bool);
                    linkedHashMap2.put(cVar4, bool);
                    view4 = view6;
                    obj8 = objU;
                    linkedHashMap = linkedHashMap2;
                    arrayList5 = arrayList7;
                    view5 = view;
                    c4101a = c4101a4;
                    arrayList4 = arrayList4;
                }
            }
        }
        ArrayList arrayList8 = arrayList4;
        C4101a c4101a5 = c4101a;
        ArrayList arrayList9 = arrayList5;
        boolean z13 = true;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        View view10 = view4;
        boolean z14 = false;
        ArrayList arrayList10 = new ArrayList();
        Iterator it5 = list.iterator();
        Object objK = null;
        Object objK2 = null;
        while (it5.hasNext()) {
            c cVar8 = (c) it5.next();
            if (cVar8.d()) {
                linkedHashMap3.put(cVar8.b(), Boolean.FALSE);
                cVar8.a();
            } else {
                Object objF = a10.f(cVar8.h());
                F.c cVarB = cVar8.b();
                boolean z15 = (obj == null || !(cVarB == cVar || cVarB == cVar4)) ? z14 : true;
                if (objF != null) {
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    ArrayList arrayList11 = new ArrayList();
                    View view11 = cVarB.h().f23993I;
                    ArrayList arrayList12 = arrayList8;
                    Intrinsics.checkNotNullExpressionValue(view11, "operation.fragment.mView");
                    c1975f.E(arrayList11, view11);
                    if (z15) {
                        if (cVarB == cVar) {
                            arrayList11.removeAll(CollectionsKt.Y0(arrayList12));
                        } else {
                            arrayList11.removeAll(CollectionsKt.Y0(arrayList9));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        a10.a(objF, view10);
                        obj3 = objK;
                        obj2 = objF;
                        obj5 = objK2;
                        cVar3 = cVarB;
                        str3 = str;
                        view = view;
                        linkedHashMap3 = linkedHashMap4;
                        z11 = true;
                        view2 = view10;
                        obj4 = obj;
                        arrayList = arrayList9;
                    } else {
                        a10.b(objF, arrayList11);
                        Object obj9 = objK;
                        obj2 = objF;
                        str3 = str;
                        view = view;
                        linkedHashMap3 = linkedHashMap4;
                        obj3 = obj9;
                        z11 = true;
                        view2 = view10;
                        obj4 = obj;
                        arrayList = arrayList9;
                        obj5 = objK2;
                        a10.n(obj2, objF, arrayList11, null, null, null, null);
                        if (cVarB.g() == F.c.b.GONE) {
                            cVar3 = cVarB;
                            list2.remove(cVar3);
                            ArrayList arrayList13 = new ArrayList(arrayList11);
                            arrayList13.remove(cVar3.h().f23993I);
                            a10.m(obj2, cVar3.h().f23993I, arrayList13);
                            K.a(q(), new G1.e(arrayList11));
                        } else {
                            cVar3 = cVarB;
                        }
                    }
                    if (cVar3.g() == F.c.b.VISIBLE) {
                        arrayList10.addAll(arrayList11);
                        if (z12) {
                            a10.o(obj2, rect);
                        }
                    } else {
                        a10.p(obj2, view);
                    }
                    linkedHashMap3.put(cVar3, Boolean.TRUE);
                    if (cVar8.j()) {
                        objK = a10.k(obj3, obj2, null);
                        objK2 = obj5;
                    } else {
                        objK2 = a10.k(obj5, obj2, null);
                        objK = obj3;
                    }
                    arrayList9 = arrayList;
                    z13 = z11;
                    arrayList8 = arrayList12;
                    str = str3;
                    z14 = false;
                    c1975f = this;
                    cVar4 = cVar2;
                    obj = obj4;
                    view10 = view2;
                } else if (!z15) {
                    linkedHashMap3.put(cVarB, Boolean.FALSE);
                    cVar8.a();
                }
            }
            z13 = true;
        }
        ArrayList arrayList14 = arrayList8;
        boolean z16 = z13;
        LinkedHashMap linkedHashMap5 = linkedHashMap3;
        String str4 = str;
        Object obj10 = obj;
        ArrayList arrayList15 = arrayList9;
        Object objJ = a10.j(objK, objK2, obj10);
        if (objJ == null) {
            return linkedHashMap5;
        }
        ArrayList<c> arrayList16 = new ArrayList();
        for (Object obj11 : list) {
            if (!((c) obj11).d()) {
                arrayList16.add(obj11);
            }
        }
        for (c cVar9 : arrayList16) {
            Object objH = cVar9.h();
            F.c cVarB2 = cVar9.b();
            boolean z17 = (obj10 == null || !(cVarB2 == cVar || cVarB2 == cVar2)) ? false : z16;
            if (objH == null && !z17) {
                str2 = str4;
            } else if (Z.R(q())) {
                str2 = str4;
                a10.q(cVar9.b().h(), objJ, cVar9.c(), new RunnableC1974e(cVar9, cVarB2));
            } else {
                if (q.H0(2)) {
                    str2 = str4;
                    Log.v(str2, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + cVarB2);
                } else {
                    str2 = str4;
                }
                cVar9.a();
            }
            str4 = str2;
        }
        String str5 = str4;
        if (!Z.R(q())) {
            return linkedHashMap5;
        }
        y.d(arrayList10, 4);
        ArrayList arrayListL = a10.l(arrayList15);
        if (q.H0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object sharedElementFirstOutViews : arrayList14) {
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view12 = (View) sharedElementFirstOutViews;
                Log.v(str5, "View: " + view12 + " Name: " + Z.I(view12));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            for (Object sharedElementLastInViews : arrayList15) {
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view13 = (View) sharedElementLastInViews;
                Log.v(str5, "View: " + view13 + " Name: " + Z.I(view13));
            }
        }
        a10.c(q(), objJ);
        a10.r(q(), arrayList14, arrayList15, arrayListL, c4101a5);
        y.d(arrayList10, 0);
        a10.t(obj10, arrayList14, arrayList15);
        return linkedHashMap5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(A impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.h(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        y.d(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c transitionInfo, F.c operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.a();
        if (q.H0(2)) {
            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(F.c cVar, F.c cVar2, boolean z10, C4101a lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        y.a(cVar.h(), cVar2.h(), z10, lastInViews, false);
    }

    private final void Q(List list) {
        i iVarH = ((F.c) CollectionsKt.u0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.c cVar = (F.c) it.next();
            cVar.h().f23996L.f24048c = iVarH.f23996L.f24048c;
            cVar.h().f23996L.f24049d = iVarH.f23996L.f24049d;
            cVar.h().f23996L.f24050e = iVarH.f23996L.f24050e;
            cVar.h().f23996L.f24051f = iVarH.f23996L.f24051f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
    @Override // androidx.fragment.app.F
    public void j(List operations, boolean z10) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            F.c cVar = (F.c) next;
            F.c.b.a aVar = F.c.b.f23901a;
            View view = cVar.h().f23993I;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            F.c.b bVarA = aVar.a(view);
            F.c.b bVar = F.c.b.VISIBLE;
            if (bVarA == bVar && cVar.g() != bVar) {
                break;
            }
        }
        F.c cVar2 = (F.c) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            F.c cVar3 = (F.c) objPrevious;
            F.c.b.a aVar2 = F.c.b.f23901a;
            View view2 = cVar3.h().f23993I;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            F.c.b bVarA2 = aVar2.a(view2);
            F.c.b bVar2 = F.c.b.VISIBLE;
            if (bVarA2 != bVar2 && cVar3.g() == bVar2) {
                obj = objPrevious;
                break;
            }
        }
        F.c cVar4 = (F.c) obj;
        if (q.H0(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar2 + " to " + cVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listW0 = CollectionsKt.W0(operations);
        Q(operations);
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            F.c cVar5 = (F.c) it2.next();
            p128h1.d dVar = new p128h1.d();
            cVar5.l(dVar);
            arrayList.add(new a(cVar5, dVar, z10));
            p128h1.d dVar2 = new p128h1.d();
            cVar5.l(dVar2);
            boolean z11 = false;
            if (z10) {
                if (cVar5 == cVar2) {
                    z11 = true;
                }
            } else if (cVar5 == cVar4) {
                z11 = true;
            }
            arrayList2.add(new c(cVar5, dVar2, z10, z11));
            cVar5.c(new G1.a(listW0, cVar5, this));
        }
        Map mapL = L(arrayList2, listW0, z10, cVar2, cVar4);
        I(arrayList, listW0, mapL.containsValue(Boolean.TRUE), mapL);
        Iterator it3 = listW0.iterator();
        while (it3.hasNext()) {
            D((F.c) it3.next());
        }
        listW0.clear();
        if (q.H0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + cVar2 + " to " + cVar4);
        }
    }
}
