package app.rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class RiveKt$Rive$8$1$1$1$onSurfaceTextureDestroyed$1 extends o implements Function0<String> {
    public static final RiveKt$Rive$8$1$1$1$onSurfaceTextureDestroyed$1 INSTANCE = new RiveKt$Rive$8$1$1$1$onSurfaceTextureDestroyed$1();

    RiveKt$Rive$8$1$1$1$onSurfaceTextureDestroyed$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "Surface texture destroyed (final release deferred to RenderContext disposal)";
    }
}
