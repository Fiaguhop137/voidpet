package app.rive.core;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1 extends o implements Function1<Throwable, Unit> {
    final /* synthetic */ Choreographer $choreographer;
    final /* synthetic */ Choreographer.FrameCallback $onFrameCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1(Choreographer choreographer, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$choreographer = choreographer;
        this.$onFrameCallback = frameCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f48228a;
    }

    public final void invoke(@Nullable Throwable th) {
        this.$choreographer.removeFrameCallback(this.$onFrameCallback);
    }
}
