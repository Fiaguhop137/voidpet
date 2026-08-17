package app.rive.core;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import app.rive.RiveInitializationException;
import app.rive.RiveLog;
import app.rive.RiveRenderException;
import app.rive.RiveShutdownException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0019H\u0082 J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0082 J2\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J*\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u0019H\u0002J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020 HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Lapp/rive/core/RenderContextGL;", "Lapp/rive/core/RenderContext;", "Lapp/rive/core/CheckableAutoCloseable;", "display", "Landroid/opengl/EGLDisplay;", "config", "Landroid/opengl/EGLConfig;", "context", "Landroid/opengl/EGLContext;", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;)V", "getConfig", "()Landroid/opengl/EGLConfig;", "getContext", "()Landroid/opengl/EGLContext;", "cppPointer", "Lapp/rive/core/UniquePointer;", "getCppPointer", "()Lapp/rive/core/UniquePointer;", "getDisplay", "()Landroid/opengl/EGLDisplay;", "component1", "component2", "component3", "copy", "cppConstructor", "", "cppDelete", "", "pointer", "createImageSurface", "Lapp/rive/core/RiveSurface;", "width", "", "height", "drawKey", "Lapp/rive/core/DrawKey;", "commandQueue", "Lapp/rive/core/CommandQueue;", "createImageSurface-i4dAsZ4", "(IIJLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createSurface", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "createSurface-mDlYe8U", "(Landroid/graphics/SurfaceTexture;JLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "dispose", "address", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RenderContextGL extends RenderContext implements CheckableAutoCloseable {

    @NotNull
    public static final String TAG = "Rive/RenderContextGL";

    @NotNull
    private final EGLConfig config;

    @NotNull
    private final EGLContext context;

    @NotNull
    private final UniquePointer cppPointer;

    @NotNull
    private final EGLDisplay display;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lapp/rive/core/RenderContextGL$Companion;", "", "()V", "TAG", "", "createConfig", "Landroid/opengl/EGLConfig;", "display", "Landroid/opengl/EGLDisplay;", "createContext", "Landroid/opengl/EGLContext;", "config", "createDisplay", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLConfig createConfig(EGLDisplay display) throws RiveInitializationException {
            EGLConfig eGLConfig;
            RenderContextGL$Companion$createConfig$1 renderContextGL$Companion$createConfig$1 = RenderContextGL$Companion$createConfig$1.INSTANCE;
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d("Rive/RenderContextGL", renderContextGL$Companion$createConfig$1);
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(display, new int[]{12352, 4, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                riveLog.getLogger().e("Rive/RenderContextGL", null, new RenderContextGL$Companion$createConfig$2(strErrorString));
                throw new RiveInitializationException("EGL config creation failed: " + strErrorString, new Throwable(strErrorString));
            }
            if (iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                riveLog.getLogger().e("Rive/RenderContextGL", null, RenderContextGL$Companion$createConfig$3.INSTANCE);
                throw new RiveInitializationException("Unable to find a suitable EGL config", null, 2, null);
            }
            Intrinsics.c(eGLConfig);
            riveLog.getLogger().d("Rive/RenderContextGL", new RenderContextGL$Companion$createConfig$4(display, eGLConfig));
            return eGLConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int createConfig$attr(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
            int[] iArr = new int[1];
            EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr, 0);
            return iArr[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLContext createContext(EGLDisplay display, EGLConfig config) throws RiveInitializationException {
            RenderContextGL$Companion$createContext$1 renderContextGL$Companion$createContext$1 = RenderContextGL$Companion$createContext$1.INSTANCE;
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d("Rive/RenderContextGL", renderContextGL$Companion$createContext$1);
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(display, config, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (!Intrinsics.b(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                Intrinsics.c(eGLContextEglCreateContext);
                return eGLContextEglCreateContext;
            }
            String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e("Rive/RenderContextGL", null, new RenderContextGL$Companion$createContext$2(strErrorString));
            throw new RiveInitializationException("Unable to create EGL context", new Throwable(strErrorString));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLDisplay createDisplay() throws RiveInitializationException {
            RenderContextGL$Companion$createDisplay$1 renderContextGL$Companion$createDisplay$1 = RenderContextGL$Companion$createDisplay$1.INSTANCE;
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d("Rive/RenderContextGL", renderContextGL$Companion$createDisplay$1);
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (Intrinsics.b(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                riveLog.getLogger().e("Rive/RenderContextGL", null, new RenderContextGL$Companion$createDisplay$2(strErrorString));
                throw new RiveInitializationException("Unable to get EGL display", new Throwable(strErrorString));
            }
            riveLog.getLogger().d("Rive/RenderContextGL", RenderContextGL$Companion$createDisplay$3.INSTANCE);
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr2, 0)) {
                riveLog.getLogger().d("Rive/RenderContextGL", new RenderContextGL$Companion$createDisplay$5(iArr, iArr2));
                Intrinsics.c(eGLDisplayEglGetDisplay);
                return eGLDisplayEglGetDisplay;
            }
            String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e("Rive/RenderContextGL", null, new RenderContextGL$Companion$createDisplay$4(strErrorString2));
            throw new RiveInitializationException("Unable to initialize EGL", new Throwable(strErrorString2));
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends o implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Destroying EGL context";
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends o implements Function0<String> {
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            this.$error = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "eglDestroyContext failed with error: " + this.$error;
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass3 extends o implements Function0<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Terminating EGL display";
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass4 extends o implements Function0<String> {
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str) {
            super(0);
            this.$error = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "eglTerminate failed with error: " + this.$error;
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextGL$dispose$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass5 extends o implements Function0<String> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Deleting RenderContextGL native object";
        }
    }

    public RenderContextGL() {
        this(null, null, null, 7, null);
    }

    public RenderContextGL(@NotNull EGLDisplay display, @NotNull EGLConfig config, @NotNull EGLContext context) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        this.display = display;
        this.config = config;
        this.context = context;
        this.cppPointer = new UniquePointer(cppConstructor(display.getNativeHandle(), context.getNativeHandle()), "Rive/RenderContextGL", new RenderContextGL$cppPointer$1(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RenderContextGL(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        eGLDisplay = (i10 & 1) != 0 ? INSTANCE.createDisplay() : eGLDisplay;
        eGLConfig = (i10 & 2) != 0 ? INSTANCE.createConfig(eGLDisplay) : eGLConfig;
        this(eGLDisplay, eGLConfig, (i10 & 4) != 0 ? INSTANCE.createContext(eGLDisplay, eGLConfig) : eGLContext);
    }

    public static /* synthetic */ RenderContextGL copy$default(RenderContextGL renderContextGL, EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eGLDisplay = renderContextGL.display;
        }
        if ((i10 & 2) != 0) {
            eGLConfig = renderContextGL.config;
        }
        if ((i10 & 4) != 0) {
            eGLContext = renderContextGL.context;
        }
        return renderContextGL.copy(eGLDisplay, eGLConfig, eGLContext);
    }

    private final native long cppConstructor(long display, long context);

    private final native void cppDelete(long pointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispose(long address) throws RiveShutdownException {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d("Rive/RenderContextGL", anonymousClass1);
        if (!EGL14.eglDestroyContext(this.display, this.context)) {
            String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e("Rive/RenderContextGL", null, new AnonymousClass2(strErrorString));
            throw new RiveShutdownException("Unable to destroy EGL context", new Throwable(strErrorString));
        }
        riveLog.getLogger().d("Rive/RenderContextGL", AnonymousClass3.INSTANCE);
        if (EGL14.eglTerminate(this.display)) {
            riveLog.getLogger().d("Rive/RenderContextGL", AnonymousClass5.INSTANCE);
            cppDelete(address);
        } else {
            String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e("Rive/RenderContextGL", null, new AnonymousClass4(strErrorString2));
            throw new RiveShutdownException("Unable to terminate EGL display", new Throwable(strErrorString2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EGLDisplay getDisplay() {
        return this.display;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EGLConfig getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EGLContext getContext() {
        return this.context;
    }

    @NotNull
    public final RenderContextGL copy(@NotNull EGLDisplay display, @NotNull EGLConfig config, @NotNull EGLContext context) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        return new RenderContextGL(display, config, context);
    }

    @Override // app.rive.core.RenderContext
    @NotNull
    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4 */
    public RiveSurface mo224createImageSurfacei4dAsZ4(int width, int height, long drawKey, @NotNull CommandQueue commandQueue) throws RiveRenderException {
        Intrinsics.checkNotNullParameter(commandQueue, "commandQueue");
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Image surfaces require a positive width and height.");
        }
        RenderContextGL$createImageSurface$2 renderContextGL$createImageSurface$2 = new RenderContextGL$createImageSurface$2(width, height);
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d("Rive/RenderContextGL", renderContextGL$createImageSurface$2);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.display, this.config, new int[]{12375, width, 12374, height, 12344}, 0);
        if (!Intrinsics.b(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            long jCreateRiveRenderTarget = commandQueue.createRiveRenderTarget(width, height);
            Intrinsics.c(eGLSurfaceEglCreatePbufferSurface);
            return new RiveEGLPBufferSurface(eGLSurfaceEglCreatePbufferSurface, this.display, jCreateRiveRenderTarget, drawKey, width, height, null);
        }
        String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
        riveLog.getLogger().e("Rive/RenderContextGL", null, new RenderContextGL$createImageSurface$3(strErrorString));
        throw new RiveRenderException("Unable to create EGL PBuffer surface", new Throwable(strErrorString));
    }

    @Override // app.rive.core.RenderContext
    @NotNull
    /* JADX INFO: renamed from: createSurface-mDlYe8U */
    public RiveSurface mo225createSurfacemDlYe8U(@NotNull SurfaceTexture surfaceTexture, long drawKey, @NotNull CommandQueue commandQueue) throws RiveRenderException {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        Intrinsics.checkNotNullParameter(commandQueue, "commandQueue");
        RenderContextGL$createSurface$1 renderContextGL$createSurface$1 = RenderContextGL$createSurface$1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d("Rive/RenderContextGL", renderContextGL$createSurface$1);
        Surface surface = new Surface(surfaceTexture);
        if (!surface.isValid()) {
            throw new RiveRenderException("Unable to create Android Surface from SurfaceTexture", null, 2, null);
        }
        riveLog.getLogger().d("Rive/RenderContextGL", RenderContextGL$createSurface$2.INSTANCE);
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.display, this.config, surface, new int[]{12344}, 0);
        if (Intrinsics.b(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e("Rive/RenderContextGL", null, new RenderContextGL$createSurface$3(strErrorString));
            throw new RiveRenderException("Unable to create EGL surface", new Throwable(strErrorString));
        }
        surface.release();
        int[] iArr = new int[2];
        EGL14.eglQuerySurface(this.display, eGLSurfaceEglCreateWindowSurface, 12375, iArr, 0);
        EGL14.eglQuerySurface(this.display, eGLSurfaceEglCreateWindowSurface, 12374, iArr, 1);
        int i10 = iArr[0];
        int i11 = iArr[1];
        riveLog.getLogger().d("Rive/RenderContextGL", new RenderContextGL$createSurface$4(i10, i11));
        long jCreateRiveRenderTarget = commandQueue.createRiveRenderTarget(i10, i11);
        Intrinsics.c(eGLSurfaceEglCreateWindowSurface);
        return new RiveEGLSurface(surfaceTexture, eGLSurfaceEglCreateWindowSurface, this.display, jCreateRiveRenderTarget, drawKey, i10, i11, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderContextGL)) {
            return false;
        }
        RenderContextGL renderContextGL = (RenderContextGL) other;
        return Intrinsics.b(this.display, renderContextGL.display) && Intrinsics.b(this.config, renderContextGL.config) && Intrinsics.b(this.context, renderContextGL.context);
    }

    @NotNull
    public final EGLConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final EGLContext getContext() {
        return this.context;
    }

    @Override // app.rive.core.RenderContext
    @NotNull
    protected UniquePointer getCppPointer() {
        return this.cppPointer;
    }

    @NotNull
    public final EGLDisplay getDisplay() {
        return this.display;
    }

    public int hashCode() {
        return (((this.display.hashCode() * 31) + this.config.hashCode()) * 31) + this.context.hashCode();
    }

    @NotNull
    public String toString() {
        return "RenderContextGL(display=" + this.display + ", config=" + this.config + ", context=" + this.context + ")";
    }
}
