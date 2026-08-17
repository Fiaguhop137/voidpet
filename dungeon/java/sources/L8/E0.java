package L8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class E0 extends AbstractBinderC1159k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6409e;

    E0(G0 g10, TaskCompletionSource taskCompletionSource) {
        this.f6409e = taskCompletionSource;
        Objects.requireNonNull(g10);
    }

    @Override // L8.N0
    public final void b0(Status status, K0 k10) {
        if (k10 == null) {
            this.f6409e.setException(new p135h8.b(status));
        } else {
            this.f6409e.setResult(k10);
        }
    }
}
