package H1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.collections.W;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f4120a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0094c f4121b = C0094c.f4133d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* JADX INFO: renamed from: H1.c$c, reason: collision with other inner class name */
    public static final class C0094c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4132c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0094c f4133d = new C0094c(W.d(), null, N.i());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f4134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f4135b;

        /* JADX INFO: renamed from: H1.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C0094c(Set flags, b bVar, Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f4134a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f4135b = linkedHashMap;
        }

        public final Set a() {
            return this.f4134a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f4135b;
        }
    }

    private c() {
    }

    private final C0094c b(androidx.fragment.app.i iVar) {
        while (iVar != null) {
            if (iVar.n0()) {
                q qVarU = iVar.U();
                Intrinsics.checkNotNullExpressionValue(qVarU, "declaringFragment.parentFragmentManager");
                if (qVarU.A0() != null) {
                    C0094c c0094cA0 = qVarU.A0();
                    Intrinsics.c(c0094cA0);
                    return c0094cA0;
                }
            }
            iVar = iVar.T();
        }
        return f4121b;
    }

    private final void c(C0094c c0094c, g gVar) {
        androidx.fragment.app.i iVarA = gVar.a();
        String name = iVarA.getClass().getName();
        if (c0094c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        c0094c.b();
        if (c0094c.a().contains(a.PENALTY_DEATH)) {
            k(iVarA, new H1.b(name, gVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, g violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(g gVar) {
        if (q.H0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + gVar.a().getClass().getName(), gVar);
        }
    }

    public static final void f(androidx.fragment.app.i fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        H1.a aVar = new H1.a(fragment, previousFragmentId);
        c cVar = f4120a;
        cVar.e(aVar);
        C0094c c0094cB = cVar.b(fragment);
        if (c0094cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.l(c0094cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c0094cB, aVar);
        }
    }

    public static final void g(androidx.fragment.app.i fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f4120a;
        cVar.e(dVar);
        C0094c c0094cB = cVar.b(fragment);
        if (c0094cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.l(c0094cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c0094cB, dVar);
        }
    }

    public static final void h(androidx.fragment.app.i fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f4120a;
        cVar.e(eVar);
        C0094c c0094cB = cVar.b(fragment);
        if (c0094cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.l(c0094cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c0094cB, eVar);
        }
    }

    public static final void i(androidx.fragment.app.i fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        h hVar = new h(fragment, container);
        c cVar = f4120a;
        cVar.e(hVar);
        C0094c c0094cB = cVar.b(fragment);
        if (c0094cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.l(c0094cB, fragment.getClass(), hVar.getClass())) {
            cVar.c(c0094cB, hVar);
        }
    }

    public static final void j(androidx.fragment.app.i fragment, androidx.fragment.app.i expectedParentFragment, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        i iVar = new i(fragment, expectedParentFragment, i10);
        c cVar = f4120a;
        cVar.e(iVar);
        C0094c c0094cB = cVar.b(fragment);
        if (c0094cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.l(c0094cB, fragment.getClass(), iVar.getClass())) {
            cVar.c(c0094cB, iVar);
        }
    }

    private final void k(androidx.fragment.app.i iVar, Runnable runnable) {
        if (!iVar.n0()) {
            runnable.run();
            return;
        }
        Handler handlerO = iVar.U().u0().o();
        Intrinsics.checkNotNullExpressionValue(handlerO, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.b(handlerO.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerO.post(runnable);
        }
    }

    private final boolean l(C0094c c0094c, Class cls, Class cls2) {
        Set set = (Set) c0094c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.b(cls2.getSuperclass(), g.class) || !CollectionsKt.b0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
