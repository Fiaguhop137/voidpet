package M6;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.facebook.react.modules.core.b f6812a;

    public /* synthetic */ h(com.facebook.react.modules.core.b bVar) {
        this.f6812a = bVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        com.facebook.react.modules.core.b.g(this.f6812a, j10);
    }
}
