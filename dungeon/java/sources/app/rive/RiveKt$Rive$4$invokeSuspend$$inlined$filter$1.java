package app.rive;

import Ad.r;
import Ed.b;
import app.rive.core.StateMachineHandle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142hf.InterfaceC3564c;
import p142hf.InterfaceC3565d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lhf/c;", "Lhf/d;", "collector", "", "collect", "(Lhf/d;LEd/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$Rive$4$invokeSuspend$$inlined$filter$1 implements InterfaceC3564c {
    final /* synthetic */ long $stateMachineHandle$inlined;
    final /* synthetic */ InterfaceC3564c $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;LEd/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2<T> implements InterfaceC3565d {
        final /* synthetic */ long $stateMachineHandle$inlined;
        final /* synthetic */ InterfaceC3565d $this_unsafeFlow;

        /* JADX INFO: renamed from: app.rive.RiveKt$Rive$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
        @f(c = "app.rive.RiveKt$Rive$4$invokeSuspend$$inlined$filter$1$2", f = "Rive.kt", l = {219}, m = "emit")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(InterfaceC3565d interfaceC3565d, long j10) {
            this.$this_unsafeFlow = interfaceC3565d;
            this.$stateMachineHandle$inlined = j10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p142hf.InterfaceC3565d
        @Nullable
        public final Object emit(Object obj, @NotNull b bVar) {
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
            Object obj2 = anonymousClass1.result;
            Object objE = Fd.b.e();
            int i11 = anonymousClass1.label;
            if (i11 == 0) {
                r.b(obj2);
                InterfaceC3565d interfaceC3565d = this.$this_unsafeFlow;
                if (((StateMachineHandle) obj).m233unboximpl() == this.$stateMachineHandle$inlined) {
                    anonymousClass1.label = 1;
                    if (interfaceC3565d.emit(obj, anonymousClass1) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj2);
            }
            return Unit.f48228a;
        }
    }

    public RiveKt$Rive$4$invokeSuspend$$inlined$filter$1(InterfaceC3564c interfaceC3564c, long j10) {
        this.$this_unsafeTransform$inlined = interfaceC3564c;
        this.$stateMachineHandle$inlined = j10;
    }

    @Override // p142hf.InterfaceC3564c
    @Nullable
    public Object collect(@NotNull InterfaceC3565d interfaceC3565d, @NotNull b bVar) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(interfaceC3565d, this.$stateMachineHandle$inlined), bVar);
        return objCollect == Fd.b.e() ? objCollect : Unit.f48228a;
    }
}
