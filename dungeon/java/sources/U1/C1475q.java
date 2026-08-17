package U1;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: U1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1475q implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1476s f12932a;

    public /* synthetic */ C1475q(C1476s c1476s) {
        this.f12932a = c1476s;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return this.f12932a.g(message);
    }
}
