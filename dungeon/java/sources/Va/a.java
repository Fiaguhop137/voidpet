package Va;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.voidpet.dungeon.MainActivity;
import p350t8.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14244a;

    public /* synthetic */ a(f fVar) {
        this.f14244a = fVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        MainActivity.G0(this.f14244a, task);
    }
}
