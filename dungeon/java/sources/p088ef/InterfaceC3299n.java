package p088ef;

import Ed.b;
import Md.n;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ef.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3299n extends b {

    /* JADX INFO: renamed from: ef.n$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC3299n interfaceC3299n, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC3299n.C(th);
        }
    }

    void A(K k10, Object obj);

    boolean C(Throwable th);

    void J(Object obj, n nVar);

    Object Q(Object obj, Object obj2, n nVar);

    void T(Object obj);

    boolean a();

    boolean isCancelled();

    boolean p();

    void t(Function1 function1);

    Object z(Throwable th);
}
