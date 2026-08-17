package p177jf;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f47419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f47420b;

    public k(Throwable th, CoroutineContext coroutineContext) {
        this.f47419a = coroutineContext;
        this.f47420b = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return this.f47419a.P(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext S(CoroutineContext.b bVar) {
        return this.f47419a.S(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object b0(Object obj, Function2 function2) {
        return this.f47419a.b0(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element e(CoroutineContext.b bVar) {
        return this.f47419a.e(bVar);
    }
}
