package p117g8;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F f42185a = new F();

    private /* synthetic */ F() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return C3431c.e((Bundle) obj);
    }
}
