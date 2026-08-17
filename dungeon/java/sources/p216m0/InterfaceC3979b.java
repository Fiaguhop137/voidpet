package p216m0;

import Ed.b;
import O0.d;
import androidx.compose.ui.platform.e1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: m0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3979b extends d {
    static /* synthetic */ Object x0(InterfaceC3979b interfaceC3979b, r rVar, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            rVar = r.Main;
        }
        return interfaceC3979b.f0(rVar, bVar);
    }

    C3993p D0();

    Object N(long j10, Function2 function2, b bVar);

    Object O0(long j10, Function2 function2, b bVar);

    Object f0(r rVar, b bVar);

    long g();

    e1 getViewConfiguration();

    long l0();
}
