package p026b7;

import Ad.n;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.Intrinsics;
import p080e7.e;
import p080e7.k;
import p080e7.l;
import p080e7.p;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f26412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f26413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f26415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f26417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f26418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f26419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f26420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f26421k;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26422a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26422a = iArr;
        }
    }

    public h(Context context, e eVar, int i10, float f10, p outlineStyle, float f11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(outlineStyle, "outlineStyle");
        this.f26411a = context;
        this.f26412b = eVar;
        this.f26413c = 0.8f;
        this.f26414d = f10;
        this.f26415e = outlineStyle;
        this.f26416f = i10;
        this.f26417g = f11;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i10);
        paint.setStrokeWidth(f11);
        paint.setPathEffect(d(outlineStyle, f11));
        this.f26418h = paint;
        this.f26420j = new RectF();
        this.f26421k = new Path();
    }

    private final float a(float f10, float f11, float f12) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f10 + (f11 * 0.5f) + f12;
    }

    private final void b(Canvas canvas) {
        this.f26421k.addRect(this.f26420j, Path.Direction.CW);
        canvas.drawPath(this.f26421k, this.f26418h);
    }

    private final void c(Canvas canvas) {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVarB;
        l lVarA;
        l lVarD;
        l lVarC;
        k kVar = this.f26419i;
        if (kVar == null || (lVarC = kVar.c()) == null || (lVar = lVarC.c()) == null) {
            lVar = new l(0.0f, 0.0f);
        }
        k kVar2 = this.f26419i;
        if (kVar2 == null || (lVarD = kVar2.d()) == null || (lVar2 = lVarD.c()) == null) {
            lVar2 = new l(0.0f, 0.0f);
        }
        k kVar3 = this.f26419i;
        if (kVar3 == null || (lVarA = kVar3.a()) == null || (lVar3 = lVarA.c()) == null) {
            lVar3 = new l(0.0f, 0.0f);
        }
        k kVar4 = this.f26419i;
        if (kVar4 == null || (lVarB = kVar4.b()) == null || (lVar4 = lVarB.c()) == null) {
            lVar4 = new l(0.0f, 0.0f);
        }
        this.f26421k.addRoundRect(this.f26420j, new float[]{a(lVar.a(), this.f26417g, this.f26414d), a(lVar.b(), this.f26417g, this.f26414d), a(lVar2.a(), this.f26417g, this.f26414d), a(lVar2.b(), this.f26417g, this.f26414d), a(lVar4.a(), this.f26417g, this.f26414d), a(lVar4.b(), this.f26417g, this.f26414d), a(lVar3.a(), this.f26417g, this.f26414d), a(lVar3.b(), this.f26417g, this.f26414d)}, Path.Direction.CW);
        canvas.drawPath(this.f26421k, this.f26418h);
    }

    private final PathEffect d(p pVar, float f10) {
        int i10 = a.f26422a[pVar.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f11 = f10 * 3;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
        }
        if (i10 == 3) {
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        }
        throw new n();
    }

    private final void j() {
        this.f26420j.set(getBounds());
        RectF rectF = this.f26420j;
        float f10 = rectF.top;
        float f11 = this.f26417g;
        float f12 = this.f26414d;
        float f13 = this.f26413c;
        rectF.top = f10 - (((f11 * 0.5f) + f12) - f13);
        rectF.bottom += ((f11 * 0.5f) + f12) - f13;
        rectF.left -= ((f11 * 0.5f) + f12) - f13;
        rectF.right += ((f11 * 0.5f) + f12) - f13;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        k kVarD;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f26417g == 0.0f) {
            return;
        }
        this.f26421k.reset();
        e eVar = this.f26412b;
        if (eVar != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.f26411a;
            H h10 = H.f30189a;
            kVarD = eVar.d(layoutDirection, context, h10.f(getBounds().width()), h10.f(getBounds().height()));
        } else {
            kVarD = null;
        }
        this.f26419i = kVarD;
        j();
        k kVar = this.f26419i;
        if (kVar == null || kVar == null || !kVar.e()) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(e eVar) {
        this.f26412b = eVar;
    }

    public final void f(int i10) {
        if (i10 != this.f26416f) {
            this.f26416f = i10;
            this.f26418h.setColor(i10);
            invalidateSelf();
        }
    }

    public final void g(float f10) {
        if (f10 == this.f26414d) {
            return;
        }
        this.f26414d = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int alpha = this.f26418h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    public final void h(p value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != this.f26415e) {
            this.f26415e = value;
            this.f26418h.setPathEffect(d(value, this.f26417g));
            invalidateSelf();
        }
    }

    public final void i(float f10) {
        if (f10 == this.f26417g) {
            return;
        }
        this.f26417g = f10;
        this.f26418h.setStrokeWidth(f10);
        this.f26418h.setPathEffect(d(this.f26415e, f10));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f26418h.setAlpha(Od.a.c((i10 / 255.0f) * (Color.alpha(this.f26416f) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26418h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
