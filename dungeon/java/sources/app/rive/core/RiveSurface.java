package app.rive.core;

import app.rive.RiveLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0017J\u0011\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0082 J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H\u0015R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lapp/rive/core/RiveSurface;", "Lapp/rive/core/CheckableAutoCloseable;", "renderTargetPointer", "", "drawKey", "Lapp/rive/core/DrawKey;", "width", "", "height", "(JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "closed", "", "getClosed", "()Z", "getDrawKey-DhFih_o", "()J", "J", "getHeight", "()I", "Lapp/rive/core/UniquePointer;", "getRenderTargetPointer", "()Lapp/rive/core/UniquePointer;", "surfaceNativePointer", "getSurfaceNativePointer", "getWidth", "close", "", "cppDeleteRenderTarget", "pointer", "dispose", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RiveSurface implements CheckableAutoCloseable {
    public static final int $stable = 8;
    private final long drawKey;
    private final int height;

    @NotNull
    private final UniquePointer renderTargetPointer;
    private final int width;

    /* JADX INFO: renamed from: app.rive.core.RiveSurface$dispose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends o implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Deleting Rive render target";
        }
    }

    private RiveSurface(long j10, long j11, int i10, int i11) {
        this.drawKey = j11;
        this.width = i10;
        this.height = i11;
        this.renderTargetPointer = new UniquePointer(j10, "Rive/RenderTarget", new RiveSurface$renderTargetPointer$1(this));
    }

    public /* synthetic */ RiveSurface(long j10, long j11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, i10, i11);
    }

    private final native void cppDeleteRenderTarget(long pointer);

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.renderTargetPointer.close();
    }

    protected void dispose(long renderTargetPointer) {
        RiveLog.INSTANCE.getLogger().d("Rive/RenderTarget", AnonymousClass1.INSTANCE);
        cppDeleteRenderTarget(renderTargetPointer);
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.renderTargetPointer.getClosed();
    }

    /* JADX INFO: renamed from: getDrawKey-DhFih_o, reason: not valid java name and from getter */
    public final long getDrawKey() {
        return this.drawKey;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final UniquePointer getRenderTargetPointer() {
        return this.renderTargetPointer;
    }

    public abstract long getSurfaceNativePointer();

    public final int getWidth() {
        return this.width;
    }
}
