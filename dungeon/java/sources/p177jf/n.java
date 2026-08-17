package p177jf;

import Ed.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes3.dex */
final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f47421a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CoroutineContext f47422b = e.f48283a;

    private n() {
    }

    @Override // Ed.b
    public CoroutineContext getContext() {
        return f47422b;
    }

    @Override // Ed.b
    public void resumeWith(Object obj) {
    }
}
