package app.rive.core;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import app.rive.RiveLog;
import app.rive.RiveShutdownException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lapp/rive/core/RiveEGLSurface;", "Lapp/rive/core/RiveSurface;", "Ljava/lang/AutoCloseable;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "eglSurface", "Landroid/opengl/EGLSurface;", "display", "Landroid/opengl/EGLDisplay;", "renderTargetPointer", "", "drawKey", "Lapp/rive/core/DrawKey;", "width", "", "height", "(Landroid/graphics/SurfaceTexture;Landroid/opengl/EGLSurface;Landroid/opengl/EGLDisplay;JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "surfaceNativePointer", "getSurfaceNativePointer", "()J", "dispose", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveEGLSurface extends RiveSurface implements AutoCloseable {

    @NotNull
    public static final String TAG = "Rive/EGLSurface";

    @NotNull
    private final EGLDisplay display;

    @NotNull
    private final EGLSurface eglSurface;

    @NotNull
    private final SurfaceTexture surfaceTexture;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.core.RiveEGLSurface$dispose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends o implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Destroying EGL surface";
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RiveEGLSurface$dispose$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends o implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Releasing SurfaceTexture";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RiveEGLSurface(SurfaceTexture surfaceTexture, EGLSurface eglSurface, EGLDisplay display, long j10, long j11, int i10, int i11) {
        super(j10, j11, i10, i11, null);
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        Intrinsics.checkNotNullParameter(display, "display");
        this.surfaceTexture = surfaceTexture;
        this.eglSurface = eglSurface;
        this.display = display;
    }

    public /* synthetic */ RiveEGLSurface(SurfaceTexture surfaceTexture, EGLSurface eGLSurface, EGLDisplay eGLDisplay, long j10, long j11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(surfaceTexture, eGLSurface, eGLDisplay, j10, j11, i10, i11);
    }

    @Override // app.rive.core.RiveSurface
    protected void dispose(long renderTargetPointer) throws RiveShutdownException {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d("Rive/EGLSurface", anonymousClass1);
        if (!EGL14.eglDestroySurface(this.display, this.eglSurface)) {
            throw new RiveShutdownException("Unable to destroy EGL surface", null, 2, null);
        }
        riveLog.getLogger().d("Rive/EGLSurface", AnonymousClass2.INSTANCE);
        this.surfaceTexture.release();
        super.dispose(renderTargetPointer);
    }

    @Override // app.rive.core.RiveSurface
    public long getSurfaceNativePointer() {
        return this.eglSurface.getNativeHandle();
    }
}
