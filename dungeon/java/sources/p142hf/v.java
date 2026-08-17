package p142hf;

import Ed.b;
import kotlin.coroutines.CoroutineContext;
import p088ef.B0;
import p124gf.a;
import p177jf.m;

/* JADX INFO: loaded from: classes3.dex */
final class v implements H, InterfaceC3564c, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ H f43036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B0 f43037b;

    public v(H h10, B0 b10) {
        this.f43036a = h10;
        this.f43037b = b10;
    }

    @Override // p177jf.m
    public InterfaceC3564c a(CoroutineContext coroutineContext, int i10, a aVar) {
        return J.d(this, coroutineContext, i10, aVar);
    }

    @Override // p142hf.x, p142hf.InterfaceC3564c
    public Object collect(InterfaceC3565d interfaceC3565d, b bVar) {
        return this.f43036a.collect(interfaceC3565d, bVar);
    }

    @Override // p142hf.H
    public Object getValue() {
        return this.f43036a.getValue();
    }
}
