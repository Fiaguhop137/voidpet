package U1;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* JADX INFO: renamed from: U1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1472n implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f12920g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f12921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f12922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLDisplay f12923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLContext f12924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLSurface f12925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SurfaceTexture f12926f;

    /* JADX INFO: renamed from: U1.n$a */
    public interface a {
    }

    public RunnableC1472n(Handler handler) {
        this(handler, null);
    }

    public RunnableC1472n(Handler handler, a aVar) {
        this.f12921a = handler;
        this.f12922b = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws AbstractC1473o.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f12920g, 0, eGLConfigArr, 0, 1, iArr, 0);
        AbstractC1473o.b(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, S.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws AbstractC1473o.a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1473o.b(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws AbstractC1473o.a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1473o.b(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC1473o.b(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private void d() {
    }

    private static void e(int[] iArr) throws AbstractC1473o.a {
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC1473o.a();
    }

    private static EGLDisplay f() throws AbstractC1473o.a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1473o.b(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC1473o.b(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) AbstractC1459a.e(this.f12926f);
    }

    public void h(int i10) throws AbstractC1473o.a {
        EGLDisplay eGLDisplayF = f();
        this.f12923c = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f12923c, eGLConfigA, i10);
        this.f12924d = eGLContextB;
        this.f12925e = c(this.f12923c, eGLConfigA, eGLContextB, i10);
        e(this.f12922b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12922b[0]);
        this.f12926f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f12921a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f12926f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f12922b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f12923c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f12923c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f12925e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f12923c, this.f12925e);
            }
            EGLContext eGLContext = this.f12924d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f12923c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f12923c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f12923c);
            }
            this.f12923c = null;
            this.f12924d = null;
            this.f12925e = null;
            this.f12926f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f12921a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f12926f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
