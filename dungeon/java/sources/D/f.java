package D;

import C0.AbstractC0855x;
import C0.P0;
import C0.Q0;
import F0.AbstractC0974h;
import I.AbstractC1083w;
import I.H;
import I.InterfaceC1054m;
import I.Z0;
import O0.t;
import S.AbstractC1432l;
import S.C1424d;
import android.os.Build;
import android.os.Trace;
import androidx.compose.ui.platform.AbstractC1876q0;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Z0 f2012a = H.j(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f2013b;

    /* JADX WARN: Code duplicated, block: B:13:0x004f A[Catch: RejectedExecutionException -> 0x009c, TryCatch #0 {RejectedExecutionException -> 0x009c, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x0066, B:24:0x0071, B:26:0x0083, B:29:0x0097, B:28:0x008b, B:21:0x006c, B:13:0x004f), top: B:37:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[Catch: RejectedExecutionException -> 0x009c, TryCatch #0 {RejectedExecutionException -> 0x009c, blocks: (B:11:0x0049, B:17:0x0056, B:19:0x0066, B:24:0x0071, B:26:0x0083, B:29:0x0097, B:28:0x008b, B:21:0x006c, B:13:0x004f), top: B:37:0x0049 }] */
    public static final void c(String str, P0 p10, AbstractC0974h.b bVar, InterfaceC1054m interfaceC1054m, int i10) {
        boolean z10;
        boolean zC;
        Object objD;
        if (AbstractC1083w.L()) {
            AbstractC1083w.U(1589371739, i10, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        Executor executor = (Executor) interfaceC1054m.T(f2012a);
        if (executor == null || !g(str.length())) {
            interfaceC1054m.V(1255196839);
            interfaceC1054m.O();
        } else {
            interfaceC1054m.V(1254328095);
            t tVar = (t) interfaceC1054m.T(AbstractC1876q0.h());
            O0.d dVar = (O0.d) interfaceC1054m.T(AbstractC1876q0.d());
            if (((i10 & 112) ^ 48) > 32) {
                try {
                    if (interfaceC1054m.U(p10)) {
                        z10 = true;
                    } else if ((i10 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zC = z10 | interfaceC1054m.c(tVar.ordinal()) | ((((i10 & 14) ^ 6) <= 4 && interfaceC1054m.U(str)) || (i10 & 6) == 4) | interfaceC1054m.U(dVar) | interfaceC1054m.F(bVar);
                    objD = interfaceC1054m.D();
                    if (zC || objD == InterfaceC1054m.f4688a.a()) {
                        Object eVar = new e(p10, tVar, str, dVar, bVar);
                        interfaceC1054m.t(eVar);
                        objD = eVar;
                    }
                    executor.execute((Runnable) objD);
                } catch (RejectedExecutionException unused) {
                }
                interfaceC1054m.O();
            } else {
                if ((i10 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zC = z10 | interfaceC1054m.c(tVar.ordinal()) | ((((i10 & 14) ^ 6) <= 4 && interfaceC1054m.U(str)) || (i10 & 6) == 4) | interfaceC1054m.U(dVar) | interfaceC1054m.F(bVar);
                objD = interfaceC1054m.D();
                if (zC) {
                    Object eVar2 = new e(p10, tVar, str, dVar, bVar);
                    interfaceC1054m.t(eVar2);
                    objD = eVar2;
                } else {
                    Object eVar3 = new e(p10, tVar, str, dVar, bVar);
                    interfaceC1054m.t(eVar3);
                    objD = eVar3;
                }
                executor.execute((Runnable) objD);
                interfaceC1054m.O();
            }
        }
        if (AbstractC1083w.L()) {
            AbstractC1083w.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P0 p10, t tVar, String str, O0.d dVar, AbstractC0974h.b bVar) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            C1424d c1424dO = AbstractC1432l.a.o(AbstractC1432l.f11377e, null, null, 3, null);
            try {
                AbstractC1432l abstractC1432lL = c1424dO.l();
                try {
                    AbstractC0855x.b(str, Q0.c(p10, tVar), CollectionsKt.l(), dVar, bVar, null, 32, null).d();
                    Unit unit = Unit.f48228a;
                    c1424dO.s(abstractC1432lL);
                    c1424dO.C().a();
                    c1424dO.d();
                    Trace.endSection();
                } catch (Throwable th) {
                    c1424dO.s(abstractC1432lL);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c1424dO.d();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor e() {
        return null;
    }

    public static final boolean f() {
        if (f2013b == null) {
            f2013b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
        }
        Boolean bool = f2013b;
        Intrinsics.c(bool);
        return bool.booleanValue();
    }

    public static final boolean g(int i10) {
        return Build.VERSION.SDK_INT >= 28 && i10 >= 8 && i10 < 1000 && f();
    }
}
