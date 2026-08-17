package p177jf;

import Ed.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: loaded from: classes3.dex */
final class w implements b, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f47436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f47437b;

    public w(b bVar, CoroutineContext coroutineContext) {
        this.f47436a = bVar;
        this.f47437b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        b bVar = this.f47436a;
        if (bVar instanceof e) {
            return (e) bVar;
        }
        return null;
    }

    @Override // Ed.b
    public CoroutineContext getContext() {
        return this.f47437b;
    }

    @Override // Ed.b
    public void resumeWith(Object obj) {
        this.f47436a.resumeWith(obj);
    }
}
