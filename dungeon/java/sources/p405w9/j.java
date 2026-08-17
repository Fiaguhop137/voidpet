package p405w9;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class j extends p423x9.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f56716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f56717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(m mVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f56717c = mVar;
        this.f56716b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, x9.f] */
    @Override // p423x9.j
    protected final void a() {
        try {
            ?? E10 = this.f56717c.f56723a.e();
            String str = this.f56717c.f56724b;
            Bundle bundleA = n.a();
            m mVar = this.f56717c;
            E10.u0(str, bundleA, new l(mVar, this.f56716b, mVar.f56724b));
        } catch (RemoteException e10) {
            m.f56722c.c(e10, "error requesting in-app review for %s", this.f56717c.f56724b);
            this.f56716b.trySetException(new RuntimeException(e10));
        }
    }
}
