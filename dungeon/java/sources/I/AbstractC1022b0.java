package I;

import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: I.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1022b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Y f4602a = new Y();

    public static final void a(Object obj, Function1 function1, InterfaceC1054m interfaceC1054m, int i10) {
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean zU = interfaceC1054m.U(obj);
        Object objD = interfaceC1054m.D();
        if (zU || objD == InterfaceC1054m.f4688a.a()) {
            objD = new W(function1);
            interfaceC1054m.t(objD);
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
    }

    public static final void b(Object obj, Object obj2, Object obj3, Function2 function2, InterfaceC1054m interfaceC1054m, int i10) {
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext coroutineContextQ = interfaceC1054m.q();
        boolean zU = interfaceC1054m.U(obj) | interfaceC1054m.U(obj2) | interfaceC1054m.U(obj3);
        Object objD = interfaceC1054m.D();
        if (zU || objD == InterfaceC1054m.f4688a.a()) {
            objD = new C1064p0(coroutineContextQ, function2);
            interfaceC1054m.t(objD);
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
    }

    public static final void c(Object obj, Object obj2, Function2 function2, InterfaceC1054m interfaceC1054m, int i10) {
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext coroutineContextQ = interfaceC1054m.q();
        boolean zU = interfaceC1054m.U(obj) | interfaceC1054m.U(obj2);
        Object objD = interfaceC1054m.D();
        if (zU || objD == InterfaceC1054m.f4688a.a()) {
            objD = new C1064p0(coroutineContextQ, function2);
            interfaceC1054m.t(objD);
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
    }

    public static final void d(Object obj, Function2 function2, InterfaceC1054m interfaceC1054m, int i10) {
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        CoroutineContext coroutineContextQ = interfaceC1054m.q();
        boolean zU = interfaceC1054m.U(obj);
        Object objD = interfaceC1054m.D();
        if (zU || objD == InterfaceC1054m.f4688a.a()) {
            objD = new C1064p0(coroutineContextQ, function2);
            interfaceC1054m.t(objD);
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
    }

    public static final void e(Object[] objArr, Function2 function2, InterfaceC1054m interfaceC1054m, int i10) {
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:407)");
        }
        CoroutineContext coroutineContextQ = interfaceC1054m.q();
        boolean zU = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zU |= interfaceC1054m.U(obj);
        }
        Object objD = interfaceC1054m.D();
        if (zU || objD == InterfaceC1054m.f4688a.a()) {
            interfaceC1054m.t(new C1064p0(coroutineContextQ, function2));
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
    }

    public static final void f(Function0 function0, InterfaceC1054m interfaceC1054m, int i10) {
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        interfaceC1054m.x(function0);
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
    }

    public static final p088ef.O h(CoroutineContext coroutineContext, InterfaceC1054m interfaceC1054m) {
        if (coroutineContext.e(p088ef.B0.f40749z1) == null) {
            return new C1082v1(interfaceC1054m.q(), coroutineContext);
        }
        p088ef.A aB = p088ef.F0.b(null, 1, null);
        aB.c(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return p088ef.P.a(aB);
    }
}
