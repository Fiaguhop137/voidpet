package p177jf;

import Ed.b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p124gf.a;
import p142hf.InterfaceC3564c;
import p142hf.InterfaceC3565d;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {
    public h(InterfaceC3564c interfaceC3564c, CoroutineContext coroutineContext, int i10, a aVar) {
        super(interfaceC3564c, coroutineContext, i10, aVar);
    }

    public /* synthetic */ h(InterfaceC3564c interfaceC3564c, CoroutineContext coroutineContext, int i10, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3564c, (i11 & 2) != 0 ? e.f48283a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? a.SUSPEND : aVar);
    }

    @Override // p177jf.e
    protected e i(CoroutineContext coroutineContext, int i10, a aVar) {
        return new h(this.f47396d, coroutineContext, i10, aVar);
    }

    @Override // p177jf.e
    public InterfaceC3564c j() {
        return this.f47396d;
    }

    @Override // p177jf.g
    protected Object q(InterfaceC3565d interfaceC3565d, b bVar) {
        Object objCollect = this.f47396d.collect(interfaceC3565d, bVar);
        return objCollect == Fd.b.e() ? objCollect : Unit.f48228a;
    }
}
