package p231mf;

import kotlin.coroutines.CoroutineContext;
import p088ef.K;
import p195kf.AbstractC3934l;

/* JADX INFO: loaded from: classes3.dex */
final class k extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f49347c = new k();

    private k() {
    }

    @Override // p088ef.K
    public void e0(CoroutineContext coroutineContext, Runnable runnable) {
        c.f49331i.t0(runnable, true, false);
    }

    @Override // p088ef.K
    public K m0(int i10, String str) {
        AbstractC3934l.a(i10);
        return i10 >= j.f49344d ? AbstractC3934l.b(this, str) : super.m0(i10, str);
    }

    @Override // p088ef.K
    public String toString() {
        return "Dispatchers.IO";
    }
}
