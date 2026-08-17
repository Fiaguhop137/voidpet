package p459z9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class D extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f58503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ A f58504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4391f f58505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(C4391f c4391f, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, A a10) {
        super(taskCompletionSource);
        this.f58505d = c4391f;
        this.f58503b = taskCompletionSource2;
        this.f58504c = a10;
    }

    @Override // p459z9.A
    public final void b() {
        synchronized (this.f58505d.f58519f) {
            try {
                C4391f.o(this.f58505d, this.f58503b);
                if (this.f58505d.f58525l.getAndIncrement() > 0) {
                    this.f58505d.f58515b.c("Already connected to the service.", new Object[0]);
                }
                C4391f.q(this.f58505d, this.f58504c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
