package p117g8;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3431c f42187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f42188b;

    public /* synthetic */ H(C3431c c3431c, Bundle bundle) {
        this.f42187a = c3431c;
        this.f42188b = bundle;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.f42187a.f(this.f42188b, task);
    }
}
