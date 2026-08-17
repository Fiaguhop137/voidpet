package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3698e0;
import io.sentry.android.replay.r;
import io.sentry.android.replay.s;
import io.sentry.util.C3799a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.android.replay.b f45508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f45509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3833z3 f45510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f45511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Bitmap f45512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicReference f45513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3799a f45514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f45515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f45516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n f45517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f45518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SurfaceTexture f45519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Surface f45520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f45521n;

    static final class a extends o implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            e eVar = e.this;
            matrix.preScale(eVar.f45511d.e(), eVar.f45511d.f());
            return matrix;
        }
    }

    public e(io.sentry.android.replay.b executor, r rVar, C3833z3 options, s config) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f45508a = executor;
        this.f45509b = rVar;
        this.f45510c = options;
        this.f45511d = config;
        this.f45513f = new AtomicReference(null);
        this.f45514g = new C3799a();
        this.f45515h = Ad.j.a(Ad.m.NONE, new a());
        this.f45516i = new AtomicBoolean(false);
        this.f45517j = new n();
        this.f45518k = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureA = io.sentry.android.replay.screenshot.a.a(false);
        surfaceTextureA.setDefaultBufferSize(config.d(), config.c());
        this.f45519l = surfaceTextureA;
        this.f45520m = new Surface(surfaceTextureA);
        io.sentry.util.n.a("ReplayCanvasStrategy");
        this.f45521n = new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(e eVar) {
        Bitmap bitmap = eVar.f45512e;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        eVar.f45520m.release();
        eVar.f45519l.release();
    }

    private final Matrix i() {
        return (Matrix) this.f45515h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(e eVar) {
        if (eVar.f45518k.get()) {
            eVar.f45510c.getLogger().c(EnumC3721i3.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture picture = (Picture) eVar.f45513f.getAndSet(null);
        if (picture == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = eVar.f45520m.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                picture.draw(canvasLockHardwareCanvas);
                eVar.f45520m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (eVar.f45512e == null) {
                    InterfaceC3698e0 interfaceC3698e0A = eVar.f45514g.a();
                    try {
                        if (eVar.f45512e == null) {
                            eVar.f45512e = Bitmap.createBitmap(eVar.f45511d.d(), eVar.f45511d.c(), Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.f48228a;
                        Kd.a.a(interfaceC3698e0A, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Kd.a.a(interfaceC3698e0A, th);
                            throw th2;
                        }
                    }
                }
                if (eVar.f45518k.get()) {
                    eVar.f45510c.getLogger().c(EnumC3721i3.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = eVar.f45520m;
                Bitmap bitmap = eVar.f45512e;
                Intrinsics.c(bitmap);
                PixelCopy.request(surface, bitmap, new d(eVar), eVar.f45508a.d());
            } catch (Throwable th3) {
                eVar.f45520m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th3;
            }
        } catch (Throwable th4) {
            eVar.f45510c.getLogger().b(EnumC3721i3.ERROR, "Canvas Strategy: picture render failed", th4);
            eVar.f45516i.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(e eVar, int i10) {
        r rVar;
        if (eVar.f45518k.get()) {
            eVar.f45510c.getLogger().c(EnumC3721i3.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 == 0) {
            eVar.f45516i.set(true);
            Bitmap bitmap = eVar.f45512e;
            if (bitmap == null || bitmap.isRecycled() || (rVar = eVar.f45509b) == null) {
                return;
            }
            rVar.e(bitmap);
            return;
        }
        eVar.f45510c.getLogger().c(EnumC3721i3.ERROR, "Canvas Strategy: PixelCopy failed with code " + i10, new Object[0]);
        eVar.f45516i.set(false);
    }

    @Override // io.sentry.android.replay.screenshot.k
    public boolean a() {
        return this.f45516i.get();
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void b() {
        Bitmap bitmap;
        r rVar;
        if (!a() || (bitmap = this.f45512e) == null || bitmap.isRecycled() || (rVar = this.f45509b) == null) {
            return;
        }
        rVar.e(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void c(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (this.f45518k.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(this.f45511d.d(), this.f45511d.c());
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "beginRecording(...)");
        this.f45517j.e(canvasBeginRecording);
        this.f45517j.setMatrix(i());
        root.draw(this.f45517j);
        picture.endRecording();
        if (this.f45518k.get()) {
            return;
        }
        this.f45513f.set(picture);
        l(this.f45508a.d(), new io.sentry.android.replay.util.m("screenshot_recorder.canvas", this.f45521n));
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void close() {
        this.f45518k.set(true);
        l(this.f45508a.d(), new io.sentry.android.replay.util.m("CanvasStrategy.close", new c(this)));
        this.f45513f.getAndSet(null);
    }

    public final void l(Handler handler, io.sentry.android.replay.util.m runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th) {
            this.f45510c.getLogger().b(EnumC3721i3.ERROR, "Canvas Strategy: failed to post runnable " + runnable.a(), th);
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void onContentChanged() {
    }
}
