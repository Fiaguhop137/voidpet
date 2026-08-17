package L8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class F implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ G f6410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ I0 f6411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f6412c;

    /* synthetic */ F(G g10, I0 i10, boolean z10) {
        this.f6410a = g10;
        this.f6411b = i10;
        this.f6412c = z10;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return this.f6410a.b(this.f6411b, this.f6412c, task);
    }
}
