package I;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: I.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1072s0 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final b f4862i1 = b.f4863a;

    /* JADX INFO: renamed from: I.s0$a */
    public static final class a {
        public static Object a(InterfaceC1072s0 interfaceC1072s0, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(interfaceC1072s0, obj, function2);
        }

        public static CoroutineContext.Element b(InterfaceC1072s0 interfaceC1072s0, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(interfaceC1072s0, bVar);
        }

        public static CoroutineContext c(InterfaceC1072s0 interfaceC1072s0, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(interfaceC1072s0, bVar);
        }

        public static CoroutineContext d(InterfaceC1072s0 interfaceC1072s0, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(interfaceC1072s0, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: I.s0$b */
    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f4863a = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.b getKey() {
        return f4862i1;
    }

    Object s(Function1 function1, Ed.b bVar);
}
