package p404w8;

import com.google.android.gms.tasks.TaskCompletionSource;
import p350t8.g;

/* JADX INFO: loaded from: classes2.dex */
final class x extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TaskCompletionSource f56709e;

    x(TaskCompletionSource taskCompletionSource) {
        this.f56709e = taskCompletionSource;
    }

    @Override // p404w8.a, p404w8.e
    public final void J0(int i10, String str) {
        if (i10 == 0 || i10 == 3003) {
            this.f56709e.setResult(null);
        } else {
            g.b(this.f56709e, i10);
        }
    }
}
