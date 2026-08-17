package p142hf;

import Ed.b;
import kotlin.coroutines.CoroutineContext;
import p088ef.B0;
import p124gf.a;
import p177jf.m;

/* JADX INFO: loaded from: classes3.dex */
final class u implements x, InterfaceC3564c, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ x f43034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0 f43035b;

    public u(x xVar, B0 b10) {
        this.f43034a = xVar;
        this.f43035b = b10;
    }

    @Override // p177jf.m
    public InterfaceC3564c a(CoroutineContext coroutineContext, int i10, a aVar) {
        return z.e(this, coroutineContext, i10, aVar);
    }

    @Override // p142hf.x, p142hf.InterfaceC3564c
    public Object collect(InterfaceC3565d interfaceC3565d, b bVar) {
        return this.f43034a.collect(interfaceC3565d, bVar);
    }
}
