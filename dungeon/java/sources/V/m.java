package V;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface m extends CoroutineContext.Element {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final b f13771j1 = b.f13772a;

    public static final class a {
        public static Object a(m mVar, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(mVar, obj, function2);
        }

        public static CoroutineContext.Element b(m mVar, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(mVar, bVar);
        }

        public static CoroutineContext c(m mVar, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(mVar, bVar);
        }

        public static CoroutineContext d(m mVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(mVar, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f13772a = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.b getKey() {
        return f13771j1;
    }

    float o();
}
