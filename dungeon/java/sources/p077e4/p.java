package p077e4;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import p020b1.EnumC2042a;
import p020b1.e;
import p091f0.AbstractC3410g;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Matrix f40391B = new Matrix();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private d f40392A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f40393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f40394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f40395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RectF f40396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f40397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f40398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f40399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f40400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f40401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f40402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f40403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap f40404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Canvas f40405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f40406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private S3.a f40407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Matrix f40408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float[] f40409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Bitmap f40410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bitmap f40411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Canvas f40412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Canvas f40413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private S3.a f40414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private BlurMaskFilter f40415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f40416x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RenderNode f40417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private RenderNode f40418z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40419a;

        static {
            int[] iArr = new int[c.values().length];
            f40419a = iArr;
            try {
                iArr[c.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40419a[c.SAVE_LAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40419a[c.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40419a[c.RENDER_NODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EnumC2042a f40421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f40422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f40423d;

        public b() {
            f();
        }

        public boolean a() {
            EnumC2042a enumC2042a = this.f40421b;
            return (enumC2042a == null || enumC2042a == EnumC2042a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f40422c != null;
        }

        public boolean c() {
            return this.f40423d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f40420a < 255;
        }

        public void f() {
            this.f40420a = 255;
            this.f40421b = null;
            this.f40422c = null;
            this.f40423d = null;
        }
    }

    protected enum c {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    private RectF b(RectF rectF, d dVar) {
        if (this.f40397e == null) {
            this.f40397e = new RectF();
        }
        if (this.f40399g == null) {
            this.f40399g = new RectF();
        }
        this.f40397e.set(rectF);
        this.f40397e.offsetTo(rectF.left + dVar.f(), rectF.top + dVar.g());
        this.f40397e.inset(-dVar.h(), -dVar.h());
        this.f40399g.set(rectF);
        this.f40397e.union(this.f40399g);
        return this.f40397e;
    }

    private c c(Canvas canvas, b bVar) {
        if (bVar.d()) {
            return c.DIRECT;
        }
        if (!bVar.c()) {
            return c.SAVE_LAYER;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || !canvas.isHardwareAccelerated()) {
            return c.BITMAP;
        }
        return i10 <= 31 ? c.BITMAP : c.RENDER_NODE;
    }

    private void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    private boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    private void h(Canvas canvas, d dVar) {
        S3.a aVar;
        RectF rectF = this.f40396d;
        if (rectF == null || this.f40404l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, dVar);
        if (this.f40398f == null) {
            this.f40398f = new Rect();
        }
        this.f40398f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f40409q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f40400h == null) {
            this.f40400h = new RectF();
        }
        this.f40400h.set(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        if (this.f40401i == null) {
            this.f40401i = new Rect();
        }
        this.f40401i.set(0, 0, Math.round(this.f40400h.width()), Math.round(this.f40400h.height()));
        if (g(this.f40410r, this.f40400h)) {
            Bitmap bitmap = this.f40410r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f40411s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f40410r = a(this.f40400h, Bitmap.Config.ARGB_8888);
            this.f40411s = a(this.f40400h, Bitmap.Config.ALPHA_8);
            this.f40412t = new Canvas(this.f40410r);
            this.f40413u = new Canvas(this.f40411s);
        } else {
            Canvas canvas2 = this.f40412t;
            if (canvas2 == null || this.f40413u == null || (aVar = this.f40407o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f40401i, aVar);
            this.f40413u.drawRect(this.f40401i, this.f40407o);
        }
        if (this.f40411s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f40414v == null) {
            this.f40414v = new S3.a(1);
        }
        RectF rectF2 = this.f40396d;
        this.f40413u.drawBitmap(this.f40404l, Math.round((rectF2.left - rectFB.left) * f10), Math.round((rectF2.top - rectFB.top) * f11), (Paint) null);
        if (this.f40415w == null || this.f40416x != dVar.h()) {
            float fH = (dVar.h() * (f10 + f11)) / 2.0f;
            if (fH > 0.0f) {
                this.f40415w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f40415w = null;
            }
            this.f40416x = dVar.h();
        }
        this.f40414v.setColor(dVar.e());
        if (dVar.h() > 0.0f) {
            this.f40414v.setMaskFilter(this.f40415w);
        } else {
            this.f40414v.setMaskFilter(null);
        }
        this.f40414v.setFilterBitmap(true);
        this.f40412t.drawBitmap(this.f40411s, Math.round(dVar.f() * f10), Math.round(dVar.g() * f11), this.f40414v);
        canvas.drawBitmap(this.f40410r, this.f40401i, this.f40398f, this.f40403k);
    }

    private void i(Canvas canvas, d dVar) {
        if (this.f40417y == null || this.f40418z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f40409q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        d dVar2 = this.f40392A;
        if (dVar2 == null || !dVar.j(dVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(dVar.e(), PorterDuff.Mode.SRC_IN));
            if (dVar.h() > 0.0f) {
                float fH = (dVar.h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f40418z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.f40392A = dVar;
        }
        RectF rectFB = b(this.f40396d, dVar);
        RectF rectF = new RectF(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        this.f40418z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f40418z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (dVar.f() * f10), (-rectF.top) + (dVar.g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f40417y);
        this.f40418z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f40418z);
        canvas.restore();
    }

    public void e() {
        if (this.f40393a == null || this.f40394b == null || this.f40409q == null || this.f40396d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i10 = a.f40419a[this.f40395c.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f40393a.restore();
        } else if (i10 != 3) {
            if (i10 == 4) {
                if (this.f40417y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f40393a.save();
                Canvas canvas = this.f40393a;
                float[] fArr = this.f40409q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f40417y.endRecording();
                if (this.f40394b.c()) {
                    i(this.f40393a, this.f40394b.f40423d);
                }
                this.f40393a.drawRenderNode(this.f40417y);
                this.f40393a.restore();
            }
        } else {
            if (this.f40404l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f40394b.c()) {
                h(this.f40393a, this.f40394b.f40423d);
            }
            if (this.f40406n == null) {
                this.f40406n = new Rect();
            }
            this.f40406n.set(0, 0, (int) (this.f40396d.width() * this.f40409q[0]), (int) (this.f40396d.height() * this.f40409q[4]));
            this.f40393a.drawBitmap(this.f40404l, this.f40406n, this.f40396d, this.f40403k);
        }
        this.f40393a = null;
    }

    public boolean f() {
        return this.f40395c == c.RENDER_NODE;
    }

    public Canvas j(Canvas canvas, RectF rectF, b bVar) {
        if (this.f40393a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f40409q == null) {
            this.f40409q = new float[9];
        }
        if (this.f40408p == null) {
            this.f40408p = new Matrix();
        }
        canvas.getMatrix(this.f40408p);
        this.f40408p.getValues(this.f40409q);
        float[] fArr = this.f40409q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f40402j == null) {
            this.f40402j = new RectF();
        }
        this.f40402j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f40393a = canvas;
        this.f40394b = bVar;
        this.f40395c = c(canvas, bVar);
        if (this.f40396d == null) {
            this.f40396d = new RectF();
        }
        this.f40396d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f40403k == null) {
            this.f40403k = new S3.a();
        }
        this.f40403k.reset();
        int i10 = a.f40419a[this.f40395c.ordinal()];
        if (i10 == 1) {
            canvas.save();
            return canvas;
        }
        if (i10 == 2) {
            this.f40403k.setAlpha(bVar.f40420a);
            this.f40403k.setColorFilter(bVar.f40422c);
            if (bVar.a()) {
                e.b(this.f40403k, bVar.f40421b);
            }
            r.n(canvas, rectF, this.f40403k);
            return canvas;
        }
        if (i10 == 3) {
            if (this.f40407o == null) {
                S3.a aVar = new S3.a();
                this.f40407o = aVar;
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f40404l, this.f40402j)) {
                Bitmap bitmap = this.f40404l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f40404l = a(this.f40402j, Bitmap.Config.ARGB_8888);
                this.f40405m = new Canvas(this.f40404l);
            } else {
                Canvas canvas2 = this.f40405m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(f40391B);
                this.f40405m.drawRect(-1.0f, -1.0f, this.f40402j.width() + 1.0f, this.f40402j.height() + 1.0f, this.f40407o);
            }
            e.b(this.f40403k, bVar.f40421b);
            this.f40403k.setColorFilter(bVar.f40422c);
            this.f40403k.setAlpha(bVar.f40420a);
            Canvas canvas3 = this.f40405m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i10 != 4) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f40417y == null) {
            this.f40417y = AbstractC3410g.a("OffscreenLayer.main");
        }
        if (bVar.c() && this.f40418z == null) {
            this.f40418z = AbstractC3410g.a("OffscreenLayer.shadow");
            this.f40392A = null;
        }
        if (bVar.a() || bVar.b()) {
            if (this.f40403k == null) {
                this.f40403k = new S3.a();
            }
            this.f40403k.reset();
            e.b(this.f40403k, bVar.f40421b);
            this.f40403k.setColorFilter(bVar.f40422c);
            this.f40417y.setUseCompositingLayer(true, this.f40403k);
            if (bVar.c()) {
                RenderNode renderNode = this.f40418z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f40403k);
            }
        }
        this.f40417y.setAlpha(bVar.f40420a / 255.0f);
        if (bVar.c()) {
            RenderNode renderNode2 = this.f40418z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(bVar.f40420a / 255.0f);
        }
        this.f40417y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f40417y;
        RectF rectF2 = this.f40402j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f40417y.beginRecording((int) this.f40402j.width(), (int) this.f40402j.height());
        recordingCanvasBeginRecording.setMatrix(f40391B);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
