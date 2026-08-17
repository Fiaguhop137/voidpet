package p170j8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import p135h8.h;

/* JADX INFO: loaded from: classes2.dex */
final class N implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f46881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f46882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3852q.a f46883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ P f46884d;

    N(h hVar, TaskCompletionSource taskCompletionSource, AbstractC3852q.a aVar, P p10) {
        this.f46881a = hVar;
        this.f46882b = taskCompletionSource;
        this.f46883c = aVar;
        this.f46884d = p10;
    }

    @Override // h8.h.a
    public final void a(Status status) {
        if (!status.g4()) {
            this.f46882b.setException(AbstractC3836b.a(status));
        } else {
            this.f46882b.setResult(this.f46883c.a(this.f46881a.d(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
