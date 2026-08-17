package app.rive.core;

import Ed.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "", "", "onFrame", "withFrame", "(Lkotlin/jvm/functions/Function1;LEd/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class FrameTickerKt$ChoreographerFrameTicker$1 implements FrameTicker {
    public static final FrameTickerKt$ChoreographerFrameTicker$1 INSTANCE = new FrameTickerKt$ChoreographerFrameTicker$1();

    /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$ChoreographerFrameTicker$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "frameTimeNs", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends o implements Function1<Long, Unit> {
        final /* synthetic */ Function1<Long, Unit> $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Long, Unit> function1) {
            super(1);
            this.$onFrame = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return Unit.f48228a;
        }

        public final void invoke(long j10) {
            this.$onFrame.invoke(Long.valueOf(j10));
        }
    }

    FrameTickerKt$ChoreographerFrameTicker$1() {
    }

    @Override // app.rive.core.FrameTicker
    @Nullable
    public final Object withFrame(@NotNull Function1<? super Long, Unit> function1, @NotNull b bVar) {
        Object objWithFrameNanosChoreographer = FrameTickerKt.withFrameNanosChoreographer(new AnonymousClass1(function1), bVar);
        return objWithFrameNanosChoreographer == Fd.b.e() ? objWithFrameNanosChoreographer : Unit.f48228a;
    }
}
