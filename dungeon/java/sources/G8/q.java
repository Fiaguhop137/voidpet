package G8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f3967a;

    public /* synthetic */ q(r rVar) {
        this.f3967a = rVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return r.a(this.f3967a, task);
    }
}
