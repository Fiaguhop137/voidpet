package app.rive;

import Ad.j;
import Ad.m;
import android.graphics.Bitmap;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.RiveSurface;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J*\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020!R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006,"}, d2 = {"Lapp/rive/RenderBuffer;", "Lapp/rive/core/CheckableAutoCloseable;", "width", "", "height", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "(IILapp/rive/core/CommandQueue;)V", "argbScratch", "", "getArgbScratch", "()[I", "argbScratch$delegate", "Lkotlin/Lazy;", "closed", "", "getClosed", "()Z", "closer", "Lapp/rive/core/CloseOnce;", "getHeight", "()I", "pixels", "", "surface", "Lapp/rive/core/RiveSurface;", "getSurface", "()Lapp/rive/core/RiveSurface;", "getWidth", "close", "", "copyInto", "Landroid/graphics/Bitmap;", "bitmap", "snapshot", "artboard", "Lapp/rive/Artboard;", "stateMachine", "Lapp/rive/StateMachine;", "fit", "Lapp/rive/Fit;", "clearColor", "toBitmap", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RenderBuffer implements CheckableAutoCloseable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: argbScratch$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy argbScratch;
    private final boolean closed;

    @NotNull
    private final CloseOnce closer;
    private final int height;

    @NotNull
    private final byte[] pixels;

    @NotNull
    private final RiveSurface surface;
    private final int width;

    public RenderBuffer(int i10, int i11, @NotNull CommandQueue riveWorker) {
        Intrinsics.checkNotNullParameter(riveWorker, "riveWorker");
        this.width = i10;
        this.height = i11;
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("RenderBuffer width/height must be > 0");
        }
        CloseOnce closeOnce = new CloseOnce("RenderBuffer", new RenderBuffer$closer$1(this));
        this.closer = closeOnce;
        this.closed = closeOnce.getClosed();
        this.surface = riveWorker.createImageSurface(i10, i11);
        this.pixels = new byte[i10 * i11 * 4];
        this.argbScratch = j.a(m.NONE, new RenderBuffer$argbScratch$2(this));
    }

    private final int[] getArgbScratch() {
        return (int[]) this.argbScratch.getValue();
    }

    public static /* synthetic */ RenderBuffer snapshot$default(RenderBuffer renderBuffer, Artboard artboard, StateMachine stateMachine, Fit fit, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fit = new Fit.Contain(null, 1, null);
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return renderBuffer.snapshot(artboard, stateMachine, fit, i10);
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    @NotNull
    public final Bitmap copyInto(@NotNull Bitmap bitmap) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.getWidth() != this.width || bitmap.getHeight() != this.height || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException(("Bitmap must be " + this.width + "x" + this.height + " ARGB_8888").toString());
        }
        int[] argbScratch = getArgbScratch();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.pixels;
            if (i10 >= bArr.length) {
                int i12 = this.width;
                bitmap.setPixels(argbScratch, 0, i12, 0, 0, i12, this.height);
                return bitmap;
            }
            argbScratch[i11] = ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8) | (bArr[i10 + 2] & 255);
            i10 += 4;
            i11++;
        }
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closed;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final RiveSurface getSurface() {
        return this.surface;
    }

    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final RenderBuffer snapshot(@NotNull Artboard artboard, @NotNull StateMachine stateMachine, @NotNull Fit fit, int clearColor) throws RiveDrawToBufferException {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(fit, "fit");
        artboard.getRiveWorker().m154drawToBufferfS7xHJs(artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), this.surface, this.pixels, this.width, this.height, fit, clearColor);
        return this;
    }

    @NotNull
    public final Bitmap toBitmap() {
        return copyInto(Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888));
    }
}
