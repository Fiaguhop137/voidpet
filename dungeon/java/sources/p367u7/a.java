package p367u7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends Drawable implements Animatable, com.github.penfeizhou.animation.decode.b.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f55022l = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f55023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.github.penfeizhou.animation.decode.b f55024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DrawFilter f55025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f55026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f55027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f55028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f55029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f55030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f55031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f55032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f55033k;

    /* JADX INFO: renamed from: u7.a$a, reason: collision with other inner class name */
    class HandlerC0692a extends Handler {
        HandlerC0692a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Iterator it = new ArrayList(a.this.f55027e).iterator();
                while (it.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it.next()).c(a.this);
                }
            } else {
                if (i10 != 2) {
                    return;
                }
                Iterator it2 = new ArrayList(a.this.f55027e).iterator();
                while (it2.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it2.next()).b(a.this);
                }
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.invalidateSelf();
        }
    }

    public a(com.github.penfeizhou.animation.decode.b bVar) {
        Paint paint = new Paint();
        this.f55023a = paint;
        this.f55025c = new PaintFlagsDrawFilter(0, 3);
        this.f55026d = new Matrix();
        this.f55027e = new HashSet();
        this.f55029g = new HandlerC0692a(Looper.getMainLooper());
        this.f55030h = new b();
        this.f55031i = true;
        this.f55032j = new HashSet();
        this.f55033k = false;
        paint.setAntiAlias(true);
        this.f55024b = bVar;
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        boolean z10 = false;
        for (WeakReference weakReference : new HashSet(this.f55032j)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z10 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f55032j.remove((WeakReference) it.next());
        }
        if (z10) {
            return;
        }
        this.f55032j.add(new WeakReference(callback));
    }

    private void g() {
        this.f55024b.p(this);
        if (this.f55031i) {
            this.f55024b.S();
        } else {
            if (this.f55024b.H()) {
                return;
            }
            this.f55024b.S();
        }
    }

    private void h() {
        this.f55024b.N(this);
        if (this.f55031i) {
            this.f55024b.U();
        } else {
            this.f55024b.V();
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void a(ByteBuffer byteBuffer) {
        if (isRunning()) {
            Bitmap bitmap = this.f55028f;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f55028f = Bitmap.createBitmap(this.f55024b.s().width() / this.f55024b.B(), this.f55024b.s().height() / this.f55024b.B(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f55028f.getByteCount()) {
                Log.e(f55022l, "onRender:Buffer not large enough for pixels");
            } else {
                this.f55028f.copyPixelsFromBuffer(byteBuffer);
                this.f55029g.post(this.f55030h);
            }
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void b() {
        Message.obtain(this.f55029g, 2).sendToTarget();
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void c() {
        Message.obtain(this.f55029g, 1).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f55028f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f55025c);
        canvas.drawBitmap(this.f55028f, this.f55026d, this.f55023a);
    }

    public int e() {
        int iY = this.f55024b.y();
        Bitmap bitmap = this.f55028f;
        if (bitmap != null && !bitmap.isRecycled()) {
            iY += this.f55028f.getAllocationByteCount();
        }
        return Math.max(1, iY);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f55033k) {
            return -1;
        }
        try {
            return this.f55024b.s().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f55033k) {
            return -1;
        }
        try {
            return this.f55024b.s().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean i() {
        return this.f55024b.G();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.f55032j).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f55024b.H();
    }

    public void j() {
        this.f55024b.J();
    }

    public void k() {
        this.f55024b.Q();
    }

    public void l(boolean z10) {
        this.f55031i = z10;
    }

    public void m(boolean z10) {
        this.f55033k = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f55023a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int iB = this.f55024b.B();
        int iR = this.f55024b.R(getBounds().width(), getBounds().height());
        float f10 = iR;
        this.f55026d.setScale(((getBounds().width() * 1.0f) * f10) / this.f55024b.s().width(), ((getBounds().height() * 1.0f) * f10) / this.f55024b.s().height());
        if (iR != iB) {
            this.f55028f = Bitmap.createBitmap(this.f55024b.s().width() / iR, this.f55024b.s().height() / iR, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f55023a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        f();
        if (this.f55031i) {
            if (z10) {
                if (!isRunning()) {
                    g();
                }
            } else if (isRunning()) {
                h();
            }
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f55024b.H()) {
            this.f55024b.U();
        }
        this.f55024b.P();
        g();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        h();
    }
}
