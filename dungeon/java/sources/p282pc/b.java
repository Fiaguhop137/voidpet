package p282pc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f50893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Path f50894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f50895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f50896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f50897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f50898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f50899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f50900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f50901i;

    public b(Context context) {
        super(context);
        this.f50893a = new Paint(5);
        this.f50897e = new float[]{0.5f, 0.0f};
        this.f50898f = new float[]{0.5f, 1.0f};
        this.f50900h = new int[]{0, 0};
        this.f50901i = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private void a() {
        int[] iArr = this.f50899g;
        if (iArr != null) {
            float[] fArr = this.f50896d;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f50897e;
                float f10 = fArr2[0];
                int[] iArr2 = this.f50900h;
                int i10 = iArr2[0];
                float f11 = fArr2[1];
                int i11 = iArr2[1];
                float[] fArr3 = this.f50898f;
                this.f50893a.setShader(new LinearGradient(f10 * i10, f11 * i11, i10 * fArr3[0], fArr3[1] * i11, this.f50899g, this.f50896d, Shader.TileMode.CLAMP));
                invalidate();
            }
        }
    }

    private float d(float f10) {
        return TypedValue.applyDimension(1, f10, getContext().getResources().getDisplayMetrics());
    }

    private void e() {
        if (this.f50894b == null) {
            this.f50894b = new Path();
            this.f50895c = new RectF();
        }
        this.f50894b.reset();
        RectF rectF = this.f50895c;
        int[] iArr = this.f50900h;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f50894b.addRoundRect(this.f50895c, this.f50901i, Path.Direction.CW);
    }

    public void b(float f10, float f11) {
        this.f50898f = new float[]{f10, f11};
        a();
    }

    public void c(float f10, float f11) {
        this.f50897e = new float[]{f10, f11};
        a();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f50894b;
        if (path == null) {
            canvas.drawPaint(this.f50893a);
        } else {
            canvas.drawPath(path, this.f50893a);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f50900h = new int[]{i10, i11};
        e();
        a();
    }

    public void setBorderRadii(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = d(fArr[i10]);
        }
        this.f50901i = fArr;
        e();
        a();
    }

    public void setColors(int[] iArr) {
        this.f50899g = iArr;
        a();
    }

    public void setDither(boolean z10) {
        this.f50893a.setDither(z10);
        a();
    }

    public void setLocations(float[] fArr) {
        this.f50896d = fArr;
        a();
    }
}
