package p279p9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p020b1.AbstractC2044c;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f50866i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f50867j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f50868k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f50869l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f50870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f50871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f50872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f50876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f50877h;

    public a() {
        this(-16777216);
    }

    public a(int i10) {
        this.f50876g = new Path();
        Paint paint = new Paint();
        this.f50877h = paint;
        this.f50870a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f50871b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f50872c = new Paint(paint2);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f50876g;
        if (z10) {
            int[] iArr = f50868k;
            iArr[0] = 0;
            iArr[1] = this.f50875f;
            iArr[2] = this.f50874e;
            iArr[3] = this.f50873d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f50868k;
            iArr2[0] = 0;
            iArr2[1] = this.f50873d;
            iArr2[2] = this.f50874e;
            iArr2[3] = this.f50875f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f50869l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f50871b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f50868k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f50877h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f50871b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f50866i;
        iArr[0] = this.f50875f;
        iArr[1] = this.f50874e;
        iArr[2] = this.f50873d;
        Paint paint = this.f50872c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f50867j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f50872c);
        canvas.restore();
    }

    public Paint c() {
        return this.f50870a;
    }

    public void d(int i10) {
        this.f50873d = AbstractC2044c.k(i10, 68);
        this.f50874e = AbstractC2044c.k(i10, 20);
        this.f50875f = AbstractC2044c.k(i10, 0);
        this.f50870a.setColor(this.f50873d);
    }
}
