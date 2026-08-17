package androidx.compose.ui.platform;

import I.InterfaceC1087x0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
final class O0 implements V.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1087x0 f21930a = I.U0.a(1.0f);

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return V.m.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext S(CoroutineContext.b bVar) {
        return V.m.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object b0(Object obj, Function2 function2) {
        return V.m.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element e(CoroutineContext.b bVar) {
        return V.m.a.b(this, bVar);
    }

    public void g(float f10) {
        this.f21930a.u(f10);
    }

    @Override // V.m
    public float o() {
        return this.f21930a.j();
    }
}
