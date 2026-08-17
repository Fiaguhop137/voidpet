package C4;

import L4.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;
import p274p4.l;

/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f1385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Paint f1393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f1394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f1395k;

    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f1396a;

        a(g gVar) {
            this.f1396a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    c(a aVar) {
        this.f1389e = true;
        this.f1391g = -1;
        this.f1385a = (a) k.d(aVar);
    }

    public c(Context context, p220m4.a aVar, l lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.d(context), aVar, i10, i11, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f1394j == null) {
            this.f1394j = new Rect();
        }
        return this.f1394j;
    }

    private Paint h() {
        if (this.f1393i == null) {
            this.f1393i = new Paint(2);
        }
        return this.f1393i;
    }

    private void j() {
        List list = this.f1395k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f1395k.get(i10)).b(this);
            }
        }
    }

    private void l() {
        this.f1390f = 0;
    }

    private void n() {
        k.a(!this.f1388d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f1385a.f1396a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f1386b) {
                return;
            }
            this.f1386b = true;
            this.f1385a.f1396a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f1386b = false;
        this.f1385a.f1396a.s(this);
    }

    @Override // C4.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f1390f++;
        }
        int i10 = this.f1391g;
        if (i10 == -1 || this.f1390f < i10) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f1385a.f1396a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1388d) {
            return;
        }
        if (this.f1392h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f1392h = false;
        }
        canvas.drawBitmap(this.f1385a.f1396a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f1385a.f1396a.e();
    }

    public int f() {
        return this.f1385a.f1396a.f();
    }

    public int g() {
        return this.f1385a.f1396a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f1385a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1385a.f1396a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1385a.f1396a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f1385a.f1396a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f1386b;
    }

    public void k() {
        this.f1388d = true;
        this.f1385a.f1396a.a();
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f1385a.f1396a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1392h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f1388d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f1389e = z10;
        if (!z10) {
            o();
        } else if (this.f1387c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f1387c = true;
        l();
        if (this.f1389e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f1387c = false;
        o();
    }
}
