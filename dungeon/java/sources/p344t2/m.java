package p344t2;

import U1.AbstractC1459a;
import U1.AbstractC1473o;
import U1.AbstractC1477t;
import U1.RunnableC1472n;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f54310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f54311e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f54313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54314c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RunnableC1472n f54315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f54316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f54317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f54318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private m f54319e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws AbstractC1473o.a {
            AbstractC1459a.e(this.f54315a);
            this.f54315a.h(i10);
            this.f54319e = new m(this, this.f54315a.g(), i10 != 0, null);
        }

        private void d() {
            AbstractC1459a.e(this.f54315a);
            this.f54315a.i();
        }

        public m a(int i10) {
            boolean z10;
            start();
            this.f54316b = new Handler(getLooper(), this);
            this.f54315a = new RunnableC1472n(this.f54316b);
            synchronized (this) {
                z10 = false;
                this.f54316b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f54319e == null && this.f54318d == null && this.f54317c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f54318d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f54317c;
            if (error == null) {
                return (m) AbstractC1459a.e(this.f54319e);
            }
            throw error;
        }

        public void c() {
            AbstractC1459a.e(this.f54316b);
            this.f54316b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th) {
                        try {
                            AbstractC1477t.d("PlaceholderSurface", "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (AbstractC1473o.a e10) {
                    AbstractC1477t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f54318d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    AbstractC1477t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f54317c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    AbstractC1477t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f54318d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private m(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f54313b = bVar;
        this.f54312a = z10;
    }

    /* synthetic */ m(b bVar, SurfaceTexture surfaceTexture, boolean z10, a aVar) {
        this(bVar, surfaceTexture, z10);
    }

    private static int f(Context context) {
        try {
            if (AbstractC1473o.h(context)) {
                return AbstractC1473o.i() ? 1 : 2;
            }
            return 0;
        } catch (AbstractC1473o.a e10) {
            AbstractC1477t.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e10.getMessage());
            return 0;
        }
    }

    public static synchronized boolean j(Context context) {
        try {
            if (!f54311e) {
                f54310d = f(context);
                f54311e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f54310d != 0;
    }

    public static m k(Context context, boolean z10) {
        AbstractC1459a.g(!z10 || j(context));
        return new b().a(z10 ? f54310d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f54313b) {
            try {
                if (!this.f54314c) {
                    this.f54313b.c();
                    this.f54314c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
