package p432y0;

import V.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f57730a = new f();

    private f() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return m.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext S(CoroutineContext.b bVar) {
        return m.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object b0(Object obj, Function2 function2) {
        return m.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element e(CoroutineContext.b bVar) {
        return m.a.b(this, bVar);
    }

    @Override // V.m
    public float o() {
        return 0.0f;
    }
}
