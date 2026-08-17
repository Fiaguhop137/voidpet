package p015ae;

import Xd.i;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public interface H extends InterfaceC1799m {

    public static final class a {
        public static Object a(H h10, InterfaceC1801o visitor, Object obj) {
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            return visitor.b(h10, obj);
        }

        public static InterfaceC1799m b(H h10) {
            return null;
        }
    }

    V V(c cVar);

    i n();

    Object n0(G g10);

    Collection p(c cVar, Function1 function1);

    boolean x(H h10);

    List z0();
}
