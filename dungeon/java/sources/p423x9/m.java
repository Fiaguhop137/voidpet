package p423x9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class m extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f57426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f57427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(t tVar, TaskCompletionSource taskCompletionSource, j jVar) {
        super(taskCompletionSource);
        this.f57427c = tVar;
        this.f57426b = jVar;
    }

    @Override // p423x9.j
    public final void a() {
        t.m(this.f57427c, this.f57426b);
    }
}
