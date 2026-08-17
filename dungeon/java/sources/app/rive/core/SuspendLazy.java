package app.rive.core;

import Ad.n;
import Ad.r;
import Ed.b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p267of.a;
import p267of.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\b\u0010\tR*\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lapp/rive/core/SuspendLazy;", "T", "", "Lkotlin/Function1;", "LEd/b;", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "await", "(LEd/b;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "Lapp/rive/core/DeferredResult;", "result", "Lapp/rive/core/DeferredResult;", "Lof/a;", "mutex", "Lof/a;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SuspendLazy<T> {
    public static final int $stable = 8;

    @NotNull
    private final Function1<b, Object> block;

    @NotNull
    private final a mutex;

    @NotNull
    private volatile DeferredResult<? extends T> result;

    /* JADX INFO: renamed from: app.rive.core.SuspendLazy$await$1, reason: invalid class name */
    @f(c = "app.rive.core.SuspendLazy", f = "SuspendLazy.kt", l = {60, 43}, m = "await")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SuspendLazy<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SuspendLazy<T> suspendLazy, b bVar) {
            super(bVar);
            this.this$0 = suspendLazy;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.await(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendLazy(@NotNull Function1<? super b, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
        this.result = DeferredResult.Uninitialized.INSTANCE;
        this.mutex = g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object await(@NotNull b bVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        a aVar;
        SuspendLazy<T> suspendLazy;
        a aVar2;
        Throwable th;
        SuspendLazy<T> suspendLazy2;
        Object value;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, bVar);
        }
        Object obj = anonymousClass1.result;
        Object objE = Fd.b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                DeferredResult<? extends T> deferredResult = this.result;
                if (deferredResult instanceof DeferredResult.Success) {
                    return ((DeferredResult.Success) deferredResult).getValue();
                }
                if (deferredResult instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult).getError();
                }
                if (!Intrinsics.b(deferredResult, DeferredResult.Uninitialized.INSTANCE)) {
                    throw new n();
                }
                aVar = this.mutex;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = aVar;
                anonymousClass1.label = 1;
                if (aVar.a(null, anonymousClass1) != objE) {
                    suspendLazy = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (a) anonymousClass1.L$1;
                suspendLazy2 = (SuspendLazy) anonymousClass1.L$0;
                try {
                    r.b(obj);
                    suspendLazy2.result = new DeferredResult.Success(obj);
                    value = obj;
                    aVar = aVar2;
                    aVar.e(null);
                    return value;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        suspendLazy2.result = new DeferredResult.Failure(th);
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar = aVar2;
                        aVar.e(null);
                        throw th;
                    }
                }
            }
            a aVar3 = (a) anonymousClass1.L$1;
            suspendLazy = (SuspendLazy) anonymousClass1.L$0;
            r.b(obj);
            aVar = aVar3;
            DeferredResult<? extends T> deferredResult2 = suspendLazy.result;
            if (!(deferredResult2 instanceof DeferredResult.Success)) {
                if (deferredResult2 instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult2).getError();
                }
                if (!Intrinsics.b(deferredResult2, DeferredResult.Uninitialized.INSTANCE)) {
                    throw new n();
                }
                try {
                    Function1<b, Object> function1 = suspendLazy.block;
                    anonymousClass1.L$0 = suspendLazy;
                    anonymousClass1.L$1 = aVar;
                    anonymousClass1.label = 2;
                    Object objInvoke = function1.invoke(anonymousClass1);
                    if (objInvoke != objE) {
                        aVar2 = aVar;
                        obj = objInvoke;
                        suspendLazy2 = suspendLazy;
                        suspendLazy2.result = new DeferredResult.Success(obj);
                        value = obj;
                        aVar = aVar2;
                    }
                    return objE;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    th = th4;
                    suspendLazy2 = suspendLazy;
                    suspendLazy2.result = new DeferredResult.Failure(th);
                    throw th;
                }
            }
            value = ((DeferredResult.Success) deferredResult2).getValue();
            aVar.e(null);
            return value;
        } catch (Throwable th5) {
            th = th5;
            aVar.e(null);
            throw th;
        }
    }
}
