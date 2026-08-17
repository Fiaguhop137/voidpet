package p117g8;

import J8.f;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class i extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3431c f42209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C3431c c3431c, Looper looper) {
        super(looper);
        this.f42209b = c3431c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C3431c.g(this.f42209b, message);
    }
}
