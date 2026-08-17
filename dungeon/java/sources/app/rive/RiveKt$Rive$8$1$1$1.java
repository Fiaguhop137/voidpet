package app.rive;

import I.A0;
import I.InterfaceC1090y0;
import I.d2;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import app.rive.core.CommandQueue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"app/rive/RiveKt$Rive$8$1$1$1", "Landroid/view/TextureView$SurfaceTextureListener;", "onSurfaceTextureAvailable", "", "newSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureDestroyed", "", "destroyedSurfaceTexture", "onSurfaceTextureSizeChanged", "surfaceTexture", "onSurfaceTextureUpdated", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$Rive$8$1$1$1 implements TextureView.SurfaceTextureListener {
    final /* synthetic */ A0 $bitmapCallbackSent$delegate;
    final /* synthetic */ d2 $currentOnBitmapAvailable$delegate;
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ A0 $surface$delegate;
    final /* synthetic */ InterfaceC1090y0 $surfaceHeight$delegate;
    final /* synthetic */ InterfaceC1090y0 $surfaceWidth$delegate;
    final /* synthetic */ TextureView $this_apply;

    RiveKt$Rive$8$1$1$1(CommandQueue commandQueue, A0 a10, InterfaceC1090y0 interfaceC1090y0, InterfaceC1090y0 interfaceC1090y1, A0 a11, TextureView textureView, d2 d2Var) {
        this.$riveWorker = commandQueue;
        this.$surface$delegate = a10;
        this.$surfaceWidth$delegate = interfaceC1090y0;
        this.$surfaceHeight$delegate = interfaceC1090y1;
        this.$bitmapCallbackSent$delegate = a11;
        this.$this_apply = textureView;
        this.$currentOnBitmapAvailable$delegate = d2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceTextureUpdated$lambda$0(d2 currentOnBitmapAvailable$delegate, TextureView this_apply) {
        Intrinsics.checkNotNullParameter(currentOnBitmapAvailable$delegate, "$currentOnBitmapAvailable$delegate");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Function1 function1Rive$lambda$12 = RiveKt.Rive$lambda$12(currentOnBitmapAvailable$delegate);
        if (function1Rive$lambda$12 != null) {
            function1Rive$lambda$12.invoke(new RiveKt$Rive$8$1$1$1$onSurfaceTextureUpdated$1$1(this_apply));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture newSurfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(newSurfaceTexture, "newSurfaceTexture");
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new RiveKt$Rive$8$1$1$1$onSurfaceTextureAvailable$1(width, height));
        this.$surface$delegate.setValue(this.$riveWorker.createRiveSurface(newSurfaceTexture));
        this.$surfaceWidth$delegate.o(width);
        this.$surfaceHeight$delegate.o(height);
        RiveKt.Rive$lambda$15(this.$bitmapCallbackSent$delegate, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture destroyedSurfaceTexture) {
        Intrinsics.checkNotNullParameter(destroyedSurfaceTexture, "destroyedSurfaceTexture");
        RiveLog.INSTANCE.getLogger().d("Rive/UI", RiveKt$Rive$8$1$1$1$onSurfaceTextureDestroyed$1.INSTANCE);
        this.$surface$delegate.setValue(null);
        RiveKt.Rive$lambda$15(this.$bitmapCallbackSent$delegate, false);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int width, int height) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new RiveKt$Rive$8$1$1$1$onSurfaceTextureSizeChanged$1(width, height));
        this.$surfaceWidth$delegate.o(width);
        this.$surfaceHeight$delegate.o(height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        if (RiveKt.Rive$lambda$14(this.$bitmapCallbackSent$delegate) || this.$this_apply.getBitmap() == null) {
            return;
        }
        RiveKt.Rive$lambda$15(this.$bitmapCallbackSent$delegate, true);
        TextureView textureView = this.$this_apply;
        textureView.post(new a(this.$currentOnBitmapAvailable$delegate, textureView));
    }
}
