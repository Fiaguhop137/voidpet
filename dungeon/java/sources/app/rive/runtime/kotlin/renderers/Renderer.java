package app.rive.runtime.kotlin.renderers;

import Ad.InterfaceC0791a;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Surface;
import app.rive.runtime.kotlin.SharedSurface;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.NativeObject;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\"\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tH'J0\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\tJ\u0019\u0010-\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020/H\u0082 J9\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020.2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u00102\u001a\u00020*2\u0006\u0010,\u001a\u00020\tH\u0082 J\u0011\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020.H\u0082 J\u0011\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020.H\u0096 J\u0011\u00107\u001a\u00020\"2\u0006\u00104\u001a\u00020.H\u0082 J\u0011\u00108\u001a\u00020\"2\u0006\u00104\u001a\u00020.H\u0082 J\u0011\u00109\u001a\u00020/2\u0006\u00104\u001a\u00020.H\u0082 J\u0011\u0010:\u001a\u00020\"2\u0006\u00104\u001a\u00020.H\u0082 J\u0011\u0010;\u001a\u00020\"2\u0006\u00104\u001a\u00020.H\u0082 J\u0019\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>2\u0006\u00104\u001a\u00020.H\u0082 J\u0011\u0010?\u001a\u00020\"2\u0006\u00104\u001a\u00020.H\u0082 J\u0011\u0010@\u001a\u00020\"2\u0006\u00104\u001a\u00020.H\u0082 JA\u0010A\u001a\u00020\"2\u0006\u00101\u001a\u00020.2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0082 J\u0011\u0010H\u001a\u00020/2\u0006\u00104\u001a\u00020.H\u0082 J\b\u0010I\u001a\u00020\"H\u0017J\b\u0010J\u001a\u00020\"H\u0002J\b\u0010K\u001a\u00020\"H\u0015J\u0010\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020.H\u0017J\b\u0010N\u001a\u00020\"H'J\b\u0010O\u001a\u00020\"H\u0017J\u0006\u0010P\u001a\u00020\"J\u0006\u0010Q\u001a\u00020\"J\u0016\u0010R\u001a\u00020\"2\u0006\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tJ\b\u0010S\u001a\u00020\"H\u0016J\u0010\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020/H\u0001J\u0010\u0010V\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0007J\u0015\u0010V\u001a\u00020\"2\u0006\u0010=\u001a\u00020\u0019H\u0000¢\u0006\u0002\bWJ\u0006\u0010X\u001a\u00020\"J\b\u0010Y\u001a\u00020\"H\u0007J\r\u0010Z\u001a\u00020\"H\u0001¢\u0006\u0002\b[J6\u0010\\\u001a\u00020\"2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tJ\u0016\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\tR\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\u0003\u001a\u00020\u00048\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u000b¨\u0006`"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/Renderer;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "Landroid/view/Choreographer$FrameCallback;", "type", "Lapp/rive/runtime/kotlin/core/RendererType;", "trace", "", "(Lapp/rive/runtime/kotlin/core/RendererType;Z)V", "averageFps", "", "getAverageFps", "()F", "frameLock", "", "getFrameLock", "()Ljava/lang/Object;", "height", "getHeight", "isAttached", "()Z", "setAttached", "(Z)V", "<set-?>", "isPlaying", "sharedSurface", "Lapp/rive/runtime/kotlin/SharedSurface;", "getTrace", "getType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "setType", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "width", "getWidth", "advance", "", "elapsed", "align", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "targetBounds", "Landroid/graphics/RectF;", "sourceBounds", "scaleFactor", "constructor", "", "", "cppAlign", "cppPointer", "srcBounds", "cppAvgFps", "rendererPointer", "cppDelete", "pointer", "cppDestroySurface", "cppDoFrame", "cppHeight", "cppRestore", "cppSave", "cppSetSurface", "surface", "Landroid/view/Surface;", "cppStart", "cppStop", "cppTransform", "x", "sy", "sx", "y", "tx", "ty", "cppWidth", "delete", "destroySurface", "disposeDependencies", "doFrame", "frameTimeNanos", "draw", "make", "restore", "save", "scale", "scheduleFrame", "setRendererType", "newType", "setSurface", "setSurface$kotlin_release", "start", "stop", "stopThread", "stopThread$kotlin_release", "transform", "translate", "dx", "dy", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Renderer extends NativeObject implements Choreographer.FrameCallback {
    public static final int $stable = 8;

    @NotNull
    private final Object frameLock;
    private boolean isAttached;
    private boolean isPlaying;

    @Nullable
    private SharedSurface sharedSurface;
    private final boolean trace;

    @NotNull
    private RendererType type;

    public Renderer() {
        this(null, false, 3, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Renderer(@NotNull RendererType type, boolean z10) {
        super(0L);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.trace = z10;
        this.frameLock = new Object();
    }

    public /* synthetic */ Renderer(RendererType rendererType, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i10 & 2) != 0 ? false : z10);
    }

    public static /* synthetic */ void align$default(Renderer renderer, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: align");
        }
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        renderer.align(fit, alignment, rectF, rectF2, f10);
    }

    private final native long constructor(boolean trace, int type);

    private final native void cppAlign(long cppPointer, Fit fit, Alignment alignment, RectF targetBounds, RectF srcBounds, float scaleFactor);

    private final native float cppAvgFps(long rendererPointer);

    private final native void cppDestroySurface(long rendererPointer);

    private final native void cppDoFrame(long rendererPointer);

    private final native int cppHeight(long rendererPointer);

    private final native void cppRestore(long rendererPointer);

    private final native void cppSave(long rendererPointer);

    private final native void cppSetSurface(Surface surface, long rendererPointer);

    private final native void cppStart(long rendererPointer);

    private final native void cppStop(long rendererPointer);

    private final native void cppTransform(long cppPointer, float x10, float sy, float sx, float y10, float tx, float ty);

    private final native int cppWidth(long rendererPointer);

    private final void destroySurface() {
        synchronized (this.frameLock) {
            this.isAttached = false;
            stop();
            cppDestroySurface(getCppPointer());
            Unit unit = Unit.f48228a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFrame$lambda$3(Renderer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Choreographer.getInstance().postFrameCallback(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(Renderer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Choreographer.getInstance().removeFrameCallback(this$0);
    }

    public abstract void advance(float elapsed);

    public final void align(@NotNull Fit fit, @NotNull Alignment alignment, @NotNull RectF targetBounds, @NotNull RectF sourceBounds, float scaleFactor) {
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(targetBounds, "targetBounds");
        Intrinsics.checkNotNullParameter(sourceBounds, "sourceBounds");
        cppAlign(getCppPointer(), fit, alignment, targetBounds, sourceBounds, scaleFactor);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public void delete() {
        stop();
        synchronized (this.frameLock) {
            destroySurface();
            cppDelete(getCppPointer());
            setCppPointer(0L);
            Unit unit = Unit.f48228a;
        }
    }

    protected void disposeDependencies() {
        synchronized (this.frameLock) {
            try {
                SharedSurface sharedSurface = this.sharedSurface;
                if (sharedSurface != null) {
                    sharedSurface.release();
                }
                this.sharedSurface = null;
                Iterator<T> it = getDependencies().iterator();
                while (it.hasNext()) {
                    ((RefCount) it.next()).release();
                }
                getDependencies().clear();
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isPlaying) {
            synchronized (this.frameLock) {
                try {
                    if (getHasCppObject()) {
                        cppDoFrame(getCppPointer());
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.isPlaying) {
                scheduleFrame();
            }
        }
    }

    public abstract void draw();

    public final float getAverageFps() {
        return cppAvgFps(getCppPointer());
    }

    @NotNull
    public final Object getFrameLock() {
        return this.frameLock;
    }

    public final float getHeight() {
        return cppHeight(getCppPointer());
    }

    public final boolean getTrace() {
        return this.trace;
    }

    @NotNull
    public final RendererType getType() {
        return this.type;
    }

    public final float getWidth() {
        return cppWidth(getCppPointer());
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public void make() {
        if (getHasCppObject()) {
            return;
        }
        setCppPointer(constructor(this.trace, this.type.getValue()));
        getRefs().incrementAndGet();
    }

    public final void restore() {
        cppRestore(getCppPointer());
    }

    public final void save() {
        cppSave(getCppPointer());
    }

    public final void scale(float sx, float sy) {
        transform(sx, 0.0f, 0.0f, sy, 0.0f, 0.0f);
    }

    public void scheduleFrame() {
        new Handler(Looper.getMainLooper()).post(new b(this));
    }

    public final void setAttached(boolean z10) {
        this.isAttached = z10;
    }

    public final void setRendererType(int newType) {
        if (newType != this.type.getValue()) {
            this.type = RendererType.INSTANCE.fromIndex(newType);
        }
    }

    @InterfaceC0791a
    public final void setSurface(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        setSurface$kotlin_release(new SharedSurface(surface));
    }

    public final void setSurface$kotlin_release(@NotNull SharedSurface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.frameLock) {
            try {
                SharedSurface sharedSurface = this.sharedSurface;
                if (sharedSurface != null) {
                    sharedSurface.release();
                }
                surface.acquire();
                this.sharedSurface = surface;
                cppSetSurface(surface.getSurface(), getCppPointer());
                this.isAttached = true;
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
        start();
    }

    public final void setType(@NotNull RendererType rendererType) {
        Intrinsics.checkNotNullParameter(rendererType, "<set-?>");
        this.type = rendererType;
    }

    public final void start() {
        if (!this.isPlaying && this.isAttached && getHasCppObject()) {
            this.isPlaying = true;
            cppStart(getCppPointer());
            scheduleFrame();
        }
    }

    public final void stop() {
        stopThread$kotlin_release();
        new Handler(Looper.getMainLooper()).post(new a(this));
    }

    public final void stopThread$kotlin_release() {
        if (this.isPlaying && getHasCppObject()) {
            this.isPlaying = false;
            cppStop(getCppPointer());
        }
    }

    public final void transform(float x10, float sy, float sx, float y10, float tx, float ty) {
        cppTransform(getCppPointer(), x10, sy, sx, y10, tx, ty);
    }

    public final void translate(float dx, float dy) {
        transform(1.0f, 0.0f, 0.0f, 1.0f, dx, dy);
    }
}
