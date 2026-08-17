package app.rive.core;

import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class RenderContextGL$Companion$createConfig$4 extends o implements Function0<String> {
    final /* synthetic */ EGLConfig $chosenConfig;
    final /* synthetic */ EGLDisplay $display;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RenderContextGL$Companion$createConfig$4(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        super(0);
        this.$display = eGLDisplay;
        this.$chosenConfig = eGLConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return "EGL config chosen successfully:\n  R=" + RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12324) + "\n  G=" + RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12323) + "\n  B=" + RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12322) + "\n  A=" + RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12321) + "\n  Depth=" + RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12325) + "\n  Stencil=" + RenderContextGL.Companion.createConfig$attr(this.$display, this.$chosenConfig, 12326);
    }
}
