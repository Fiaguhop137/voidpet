package app.rive;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class RenderBuffer$closer$1 extends o implements Function0<Unit> {
    final /* synthetic */ RenderBuffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RenderBuffer$closer$1(RenderBuffer renderBuffer) {
        super(0);
        this.this$0 = renderBuffer;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m45invoke();
        return Unit.f48228a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m45invoke() {
        this.this$0.getSurface().close();
    }
}
