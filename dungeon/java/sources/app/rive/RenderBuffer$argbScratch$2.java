package app.rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0015\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class RenderBuffer$argbScratch$2 extends o implements Function0<int[]> {
    final /* synthetic */ RenderBuffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RenderBuffer$argbScratch$2(RenderBuffer renderBuffer) {
        super(0);
        this.this$0 = renderBuffer;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final int[] invoke() {
        return new int[this.this$0.getWidth() * this.this$0.getHeight()];
    }
}
