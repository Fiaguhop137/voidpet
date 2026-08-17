package p195kf;

import kotlin.coroutines.CoroutineContext;
import p088ef.InterfaceC3286g0;
import p088ef.InterfaceC3299n;
import p088ef.K;
import p088ef.V;
import p088ef.Y;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends K implements Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Y f48175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K f48176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48177e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(K k10, String str) {
        Y y10 = k10 instanceof Y ? (Y) k10 : null;
        this.f48175c = y10 == null ? V.a() : y10;
        this.f48176d = k10;
        this.f48177e = str;
    }

    @Override // p088ef.K
    public void e0(CoroutineContext coroutineContext, Runnable runnable) {
        this.f48176d.e0(coroutineContext, runnable);
    }

    @Override // p088ef.K
    public boolean h0(CoroutineContext coroutineContext) {
        return this.f48176d.h0(coroutineContext);
    }

    @Override // p088ef.Y
    public InterfaceC3286g0 t(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f48175c.t(j10, runnable, coroutineContext);
    }

    @Override // p088ef.K
    public String toString() {
        return this.f48177e;
    }

    @Override // p088ef.Y
    public void z(long j10, InterfaceC3299n interfaceC3299n) {
        this.f48175c.z(j10, interfaceC3299n);
    }
}
