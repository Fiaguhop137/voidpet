package app.rive.core;

import Ad.r;
import Ed.b;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088ef.C3303p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanosChoreographer", "(Lkotlin/jvm/functions/Function1;LEd/b;)Ljava/lang/Object;", "Lapp/rive/core/FrameTicker;", "ChoreographerFrameTicker", "Lapp/rive/core/FrameTicker;", "getChoreographerFrameTicker", "()Lapp/rive/core/FrameTicker;", "ComposeFrameTicker", "getComposeFrameTicker", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FrameTickerKt {

    @NotNull
    private static final FrameTicker ChoreographerFrameTicker = FrameTickerKt$ChoreographerFrameTicker$1.INSTANCE;

    @NotNull
    private static final FrameTicker ComposeFrameTicker = FrameTickerKt$ComposeFrameTicker$1.INSTANCE;

    /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$1, reason: invalid class name */
    @f(c = "app.rive.core.FrameTickerKt", f = "FrameTicker.kt", l = {50}, m = "withFrameNanosChoreographer")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1<R> extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FrameTickerKt.withFrameNanosChoreographer(null, this);
        }
    }

    @NotNull
    public static final FrameTicker getChoreographerFrameTicker() {
        return ChoreographerFrameTicker;
    }

    @NotNull
    public static final FrameTicker getComposeFrameTicker() {
        return ComposeFrameTicker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <R> Object withFrameNanosChoreographer(@NotNull Function1<? super Long, ? extends R> function1, @NotNull b bVar) {
        AnonymousClass1 anonymousClass1;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(bVar);
        }
        Object objV = anonymousClass1.result;
        Object objE = Fd.b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            r.b(objV);
            anonymousClass1.L$0 = function1;
            anonymousClass1.label = 1;
            C3303p c3303p = new C3303p(Fd.b.c(anonymousClass1), 1);
            c3303p.E();
            Choreographer choreographer = Choreographer.getInstance();
            FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1 frameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1 = new FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1(c3303p);
            choreographer.postFrameCallback(frameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1);
            c3303p.t(new FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1(choreographer, frameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1));
            objV = c3303p.v();
            if (objV == Fd.b.e()) {
                h.c(anonymousClass1);
            }
            if (objV == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) anonymousClass1.L$0;
            r.b(objV);
        }
        return function1.invoke(kotlin.coroutines.jvm.internal.b.e(((Number) objV).longValue()));
    }
}
