package p037c0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f26675c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26673a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f26674b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f26675c = iArr3;
        }
    }

    public static final m0 a() {
        return new b();
    }

    public static final m0 b(Paint paint) {
        return new b(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return AbstractC2073b0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? AbstractC2077d0.f26711a.b() : AbstractC2077d0.f26711a.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f26674b[strokeCap.ordinal()];
        if (i10 == 1) {
            return y0.f26749a.a();
        }
        if (i10 != 2) {
            return i10 != 3 ? y0.f26749a.a() : y0.f26749a.c();
        }
        return y0.f26749a.b();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f26675c[strokeJoin.ordinal()];
        if (i10 == 1) {
            return z0.f26753a.b();
        }
        if (i10 != 2) {
            return i10 != 3 ? z0.f26753a.b() : z0.f26753a.c();
        }
        return z0.f26753a.a();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void l(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            D0.f26661a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i10)));
        }
    }

    public static final void m(Paint paint, long j10) {
        paint.setColor(AbstractC2073b0.g(j10));
    }

    public static final void n(Paint paint, AbstractC2071a0 abstractC2071a0) {
        paint.setColorFilter(null);
    }

    public static final void o(Paint paint, int i10) {
        paint.setFilterBitmap(!AbstractC2077d0.d(i10, AbstractC2077d0.f26711a.b()));
    }

    public static final void p(Paint paint, p0 p0Var) {
        android.support.v4.media.session.b.a(p0Var);
        paint.setPathEffect(null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i10) {
        Paint.Cap cap;
        y0.a aVar = y0.f26749a;
        if (y0.e(i10, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (y0.e(i10, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = y0.e(i10, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void s(Paint paint, int i10) {
        Paint.Join join;
        z0.a aVar = z0.f26753a;
        if (z0.e(i10, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (z0.e(i10, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = z0.e(i10, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void t(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void u(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void v(Paint paint, int i10) {
        paint.setStyle(n0.d(i10, n0.f26724a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
