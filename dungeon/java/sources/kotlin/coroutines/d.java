package kotlin.coroutines;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends CoroutineContext.Element {

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    @NotNull
    public static final b f48281C1 = b.f48282a;

    public static final class a {
        public static CoroutineContext.Element a(d dVar, CoroutineContext.b key) {
            CoroutineContext.Element elementB;
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (d.f48281C1 != key) {
                    return null;
                }
                Intrinsics.d(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.a(dVar.getKey()) || (elementB = bVar.b(dVar)) == null) {
                return null;
            }
            return elementB;
        }

        public static CoroutineContext b(d dVar, CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return d.f48281C1 == key ? e.f48283a : dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(dVar.getKey()) || bVar.b(dVar) == null) ? dVar : e.f48283a;
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f48282a = new b();

        private b() {
        }
    }

    Ed.b h(Ed.b bVar);

    void r(Ed.b bVar);
}
