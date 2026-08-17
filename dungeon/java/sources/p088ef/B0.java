package p088ef;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public interface B0 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final b f40749z1 = b.f40750a;

    public static final class a {
        public static /* synthetic */ void a(B0 b10, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            b10.d(cancellationException);
        }

        public static Object b(B0 b10, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(b10, obj, function2);
        }

        public static CoroutineContext.Element c(B0 b10, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(b10, bVar);
        }

        public static CoroutineContext d(B0 b10, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(b10, bVar);
        }

        public static CoroutineContext e(B0 b10, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(b10, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f40750a = new b();

        private b() {
        }
    }

    InterfaceC3312u O(InterfaceC3316w interfaceC3316w);

    Object U(Ed.b bVar);

    boolean a();

    Sequence b();

    void d(CancellationException cancellationException);

    InterfaceC3286g0 k(boolean z10, boolean z11, Function1 function1);

    CancellationException m();

    boolean p();

    boolean start();

    InterfaceC3286g0 u(Function1 function1);
}
