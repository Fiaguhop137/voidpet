package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface k extends p288q0.j {
    static /* synthetic */ p288q0.y I(k kVar, int i10, int i11, Map map, Function1 function1, Function1 function2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = N.i();
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            function1 = null;
        }
        return kVar.h1(i10, i11, map2, function1, function2);
    }

    static /* synthetic */ p288q0.y s0(k kVar, int i10, int i11, Map map, Function1 function1, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = N.i();
        }
        return kVar.I0(i10, i11, map, function1);
    }

    default p288q0.y I0(int i10, int i11, Map map, Function1 function1) {
        return h1(i10, i11, map, null, function1);
    }

    p288q0.y h1(int i10, int i11, Map map, Function1 function1, Function1 function2);
}
