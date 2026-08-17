package p329s5;

import V4.k;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: s5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4161a extends Drawable implements Drawable.Callback, D, C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D f53301a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable[] f53303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4163c[] f53304d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4164d f53302b = new C4164d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f53305e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53306f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53307g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53308h = false;

    /* JADX INFO: renamed from: s5.a$a, reason: collision with other inner class name */
    class C0648a implements InterfaceC4163c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f53309a;

        C0648a(int i10) {
            this.f53309a = i10;
        }

        @Override // p329s5.InterfaceC4163c
        public Drawable g(Drawable drawable) {
            return AbstractC4161a.this.f(this.f53309a, drawable);
        }

        @Override // p329s5.InterfaceC4163c
        public Drawable s() {
            return AbstractC4161a.this.b(this.f53309a);
        }
    }

    public AbstractC4161a(Drawable[] drawableArr) {
        int i10 = 0;
        k.g(drawableArr);
        this.f53303c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f53303c;
            if (i10 >= drawableArr2.length) {
                this.f53304d = new InterfaceC4163c[drawableArr2.length];
                return;
            } else {
                C4165e.d(drawableArr2[i10], this, this);
                i10++;
            }
        }
    }

    private InterfaceC4163c a(int i10) {
        return new C0648a(i10);
    }

    public Drawable b(int i10) {
        k.b(Boolean.valueOf(i10 >= 0));
        k.b(Boolean.valueOf(i10 < this.f53303c.length));
        return this.f53303c[i10];
    }

    public InterfaceC4163c c(int i10) {
        k.b(Boolean.valueOf(i10 >= 0));
        k.b(Boolean.valueOf(i10 < this.f53304d.length));
        InterfaceC4163c[] interfaceC4163cArr = this.f53304d;
        if (interfaceC4163cArr[i10] == null) {
            interfaceC4163cArr[i10] = a(i10);
        }
        return this.f53304d[i10];
    }

    @Override // p329s5.D
    public void d(Matrix matrix) {
        D d10 = this.f53301a;
        if (d10 != null) {
            d10.d(matrix);
        } else {
            matrix.reset();
        }
    }

    public int e() {
        return this.f53303c.length;
    }

    public Drawable f(int i10, Drawable drawable) {
        k.b(Boolean.valueOf(i10 >= 0));
        k.b(Boolean.valueOf(i10 < this.f53303c.length));
        Drawable drawable2 = this.f53303c[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f53308h) {
                drawable.mutate();
            }
            C4165e.d(this.f53303c[i10], null, null);
            C4165e.d(drawable, null, null);
            C4165e.e(drawable, this.f53302b);
            C4165e.a(drawable, this);
            C4165e.d(drawable, this, this);
            this.f53307g = false;
            this.f53303c[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f53303c.length == 0) {
            return -2;
        }
        int i10 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f53305e;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    @Override // p329s5.C
    public void i(D d10) {
        this.f53301a = d10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f53307g) {
            this.f53306f = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.f53303c;
                boolean z10 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z11 = this.f53306f;
                if (drawable == null || !drawable.isStateful()) {
                    z10 = false;
                }
                this.f53306f = z11 | z10;
                i10++;
            }
            this.f53307g = true;
        }
        return this.f53306f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                this.f53308h = true;
                return this;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.mutate();
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i11 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z10 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z10 = true;
            }
            i10++;
        }
    }

    @Override // p329s5.D
    public void p(RectF rectF) {
        D d10 = this.f53301a;
        if (d10 != null) {
            d10.p(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f53302b.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f53302b.d(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setDither(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f53302b.e(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setFilterBitmap(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f53303c;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z10, z11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
