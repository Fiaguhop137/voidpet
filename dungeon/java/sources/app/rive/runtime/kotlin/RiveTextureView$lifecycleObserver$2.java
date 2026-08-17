package app.rive.runtime.kotlin;

import androidx.lifecycle.InterfaceC1993p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/p;", "invoke", "()Landroidx/lifecycle/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class RiveTextureView$lifecycleObserver$2 extends o implements Function0<InterfaceC1993p> {
    final /* synthetic */ RiveTextureView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RiveTextureView$lifecycleObserver$2(RiveTextureView riveTextureView) {
        super(0);
        this.this$0 = riveTextureView;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final InterfaceC1993p invoke() {
        return this.this$0.createObserver();
    }
}
