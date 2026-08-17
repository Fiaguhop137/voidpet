package app.rive.core;

import Ad.q;
import android.view.Choreographer;
import kotlin.Metadata;
import p088ef.InterfaceC3299n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "timeNs", "", "doFrame"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1 implements Choreographer.FrameCallback {
    final /* synthetic */ InterfaceC3299n $cont;

    FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1(InterfaceC3299n interfaceC3299n) {
        this.$cont = interfaceC3299n;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.$cont.resumeWith(q.b(Long.valueOf(j10)));
    }
}
