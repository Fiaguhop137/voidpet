package p293q5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p311r5.b;
import p329s5.q;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f51444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f51445g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51448j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f51454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f51455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f51456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f51457s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f51458t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f51459u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f51460v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap f51446h = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f51449k = 80;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f51450l = new Paint(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Matrix f51451m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f51452n = new Rect();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f51453o = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f51461w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f51462x = 0;

    public a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float fMeasureText = this.f51450l.measureText(str3);
        float fMeasureText2 = this.f51450l.measureText(str2);
        this.f51450l.setColor(1711276032);
        int i11 = this.f51457s;
        int i12 = this.f51458t;
        canvas.drawRect(i11 - 4, i12 + 8, i11 + fMeasureText + fMeasureText2 + 4.0f, i12 + this.f51456r + 8, this.f51450l);
        this.f51450l.setColor(-1);
        canvas.drawText(str3, this.f51457s, this.f51458t, this.f51450l);
        this.f51450l.setColor(i10);
        canvas.drawText(str2, this.f51457s + fMeasureText, this.f51458t, this.f51450l);
        this.f51458t += this.f51456r;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i10, int i11) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f51450l.setTextSize(iMin);
        int i12 = iMin + 8;
        this.f51456r = i12;
        int i13 = this.f51449k;
        if (i13 == 80) {
            this.f51456r = i12 * (-1);
        }
        this.f51454p = rect.left + 10;
        this.f51455q = i13 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // p311r5.b
    public void a(long j10) {
        this.f51459u = j10;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f51446h.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f51450l.setStyle(Paint.Style.STROKE);
        this.f51450l.setStrokeWidth(2.0f);
        this.f51450l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f51450l);
        Paint paint = this.f51450l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f51450l.setColor(this.f51462x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f51450l);
        this.f51450l.setStyle(style);
        this.f51450l.setStrokeWidth(0.0f);
        this.f51450l.setColor(-1);
        this.f51457s = this.f51454p;
        this.f51458t = this.f51455q;
        String str = this.f51440b;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f51439a, str));
        } else {
            d(canvas, "ID", this.f51439a);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f51441c), Integer.valueOf(this.f51442d)), f(this.f51441c, this.f51442d, this.f51445g));
        int i10 = this.f51442d;
        if (i10 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f51441c / i10));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f51443e / 1024)));
        String str2 = this.f51444f;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i11 = this.f51447i;
        if (i11 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f51448j)));
        }
        q qVar = this.f51445g;
        if (qVar != null) {
            c(canvas, "scale", qVar);
        }
        long j10 = this.f51459u;
        if (j10 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f51460v;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f51461w);
        }
        for (Map.Entry entry : this.f51446h.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    int f(int i10, int i11, q qVar) {
        int i12;
        int i13;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i10 > 0 && i11 > 0) {
            if (qVar != null) {
                Rect rect = this.f51452n;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f51451m.reset();
                i12 = i10;
                i13 = i11;
                qVar.a(this.f51451m, this.f51452n, i12, i13, 0.0f, 0.0f);
                RectF rectF = this.f51453o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i12;
                rectF.bottom = i13;
                this.f51451m.mapRect(rectF);
                int iWidth2 = (int) this.f51453o.width();
                int iHeight2 = (int) this.f51453o.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i12 = i10;
                i13 = i11;
            }
            float f10 = iWidth;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = iHeight;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int iAbs = Math.abs(i12 - iWidth);
            int iAbs2 = Math.abs(i13 - iHeight);
            float f16 = iAbs;
            if (f16 < f11 && iAbs2 < f14) {
                return -16711936;
            }
            if (f16 < f12 && iAbs2 < f15) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f51441c = -1;
        this.f51442d = -1;
        this.f51443e = -1;
        this.f51446h = new HashMap();
        this.f51447i = -1;
        this.f51448j = -1;
        this.f51444f = null;
        j(null);
        this.f51459u = -1L;
        this.f51460v = null;
        this.f51461w = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f51439a = str;
        invalidateSelf();
    }

    public void k(int i10, int i11) {
        this.f51441c = i10;
        this.f51442d = i11;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f51443e = i10;
    }

    public void m(q qVar) {
        this.f51445g = qVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
