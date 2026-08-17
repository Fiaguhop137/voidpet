package p088ef;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public interface L extends CoroutineContext.Element {

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final b f40784y1 = b.f40785a;

    public static final class a {
        public static Object a(L l10, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(l10, obj, function2);
        }

        public static CoroutineContext.Element b(L l10, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(l10, bVar);
        }

        public static CoroutineContext c(L l10, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(l10, bVar);
        }

        public static CoroutineContext d(L l10, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(l10, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f40785a = new b();

        private b() {
        }
    }

    void L(CoroutineContext coroutineContext, Throwable th);
}
