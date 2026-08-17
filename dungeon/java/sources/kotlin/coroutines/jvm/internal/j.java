package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends a {
    public j(Ed.b bVar) {
        super(bVar);
        if (bVar != null && bVar.getContext() != kotlin.coroutines.e.f48283a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // Ed.b
    public CoroutineContext getContext() {
        return kotlin.coroutines.e.f48283a;
    }
}
