package p231mf;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import p088ef.AbstractC3307r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends AbstractC3307r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f49334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f49335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f49336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f49337h = s0();

    public f(int i10, int i11, long j10, String str) {
        this.f49333d = i10;
        this.f49334e = i11;
        this.f49335f = j10;
        this.f49336g = str;
    }

    private final a s0() {
        return new a(this.f49333d, this.f49334e, this.f49335f, this.f49336g);
    }

    @Override // p088ef.K
    public void e0(CoroutineContext coroutineContext, Runnable runnable) {
        a.h(this.f49337h, runnable, false, false, 6, null);
    }

    @Override // p088ef.AbstractC3307r0
    public Executor r0() {
        return this.f49337h;
    }

    public final void t0(Runnable runnable, boolean z10, boolean z11) {
        this.f49337h.f(runnable, z10, z11);
    }
}
