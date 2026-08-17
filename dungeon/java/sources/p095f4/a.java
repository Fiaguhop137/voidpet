package p095f4;

import R3.C1364k;
import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1364k f41712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f41714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f41715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f41716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f41717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f41718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f41719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f41720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f41721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f41724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f41725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f41726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f41727p;

    public a(C1364k c1364k, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f41720i = -3987645.8f;
        this.f41721j = -3987645.8f;
        this.f41722k = 784923401;
        this.f41723l = 784923401;
        this.f41724m = Float.MIN_VALUE;
        this.f41725n = Float.MIN_VALUE;
        this.f41726o = null;
        this.f41727p = null;
        this.f41712a = c1364k;
        this.f41713b = obj;
        this.f41714c = obj2;
        this.f41715d = interpolator;
        this.f41716e = null;
        this.f41717f = null;
        this.f41718g = f10;
        this.f41719h = f11;
    }

    public a(C1364k c1364k, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f41720i = -3987645.8f;
        this.f41721j = -3987645.8f;
        this.f41722k = 784923401;
        this.f41723l = 784923401;
        this.f41724m = Float.MIN_VALUE;
        this.f41725n = Float.MIN_VALUE;
        this.f41726o = null;
        this.f41727p = null;
        this.f41712a = c1364k;
        this.f41713b = obj;
        this.f41714c = obj2;
        this.f41715d = null;
        this.f41716e = interpolator;
        this.f41717f = interpolator2;
        this.f41718g = f10;
        this.f41719h = f11;
    }

    protected a(C1364k c1364k, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f41720i = -3987645.8f;
        this.f41721j = -3987645.8f;
        this.f41722k = 784923401;
        this.f41723l = 784923401;
        this.f41724m = Float.MIN_VALUE;
        this.f41725n = Float.MIN_VALUE;
        this.f41726o = null;
        this.f41727p = null;
        this.f41712a = c1364k;
        this.f41713b = obj;
        this.f41714c = obj2;
        this.f41715d = interpolator;
        this.f41716e = interpolator2;
        this.f41717f = interpolator3;
        this.f41718g = f10;
        this.f41719h = f11;
    }

    public a(Object obj) {
        this.f41720i = -3987645.8f;
        this.f41721j = -3987645.8f;
        this.f41722k = 784923401;
        this.f41723l = 784923401;
        this.f41724m = Float.MIN_VALUE;
        this.f41725n = Float.MIN_VALUE;
        this.f41726o = null;
        this.f41727p = null;
        this.f41712a = null;
        this.f41713b = obj;
        this.f41714c = obj;
        this.f41715d = null;
        this.f41716e = null;
        this.f41717f = null;
        this.f41718g = Float.MIN_VALUE;
        this.f41719h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(Object obj, Object obj2) {
        this.f41720i = -3987645.8f;
        this.f41721j = -3987645.8f;
        this.f41722k = 784923401;
        this.f41723l = 784923401;
        this.f41724m = Float.MIN_VALUE;
        this.f41725n = Float.MIN_VALUE;
        this.f41726o = null;
        this.f41727p = null;
        this.f41712a = null;
        this.f41713b = obj;
        this.f41714c = obj2;
        this.f41715d = null;
        this.f41716e = null;
        this.f41717f = null;
        this.f41718g = Float.MIN_VALUE;
        this.f41719h = Float.valueOf(Float.MAX_VALUE);
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a b(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public float c() {
        if (this.f41712a == null) {
            return 1.0f;
        }
        if (this.f41725n == Float.MIN_VALUE) {
            if (this.f41719h == null) {
                this.f41725n = 1.0f;
            } else {
                float f10 = f();
                this.f41725n = (float) (((double) f10) + (((double) (this.f41719h.floatValue() - this.f41718g)) / ((double) this.f41712a.e())));
            }
        }
        return this.f41725n;
    }

    public float d() {
        if (this.f41721j == -3987645.8f) {
            this.f41721j = ((Float) this.f41714c).floatValue();
        }
        return this.f41721j;
    }

    public int e() {
        if (this.f41723l == 784923401) {
            this.f41723l = ((Integer) this.f41714c).intValue();
        }
        return this.f41723l;
    }

    public float f() {
        C1364k c1364k = this.f41712a;
        if (c1364k == null) {
            return 0.0f;
        }
        if (this.f41724m == Float.MIN_VALUE) {
            this.f41724m = (this.f41718g - c1364k.p()) / this.f41712a.e();
        }
        return this.f41724m;
    }

    public float g() {
        if (this.f41720i == -3987645.8f) {
            this.f41720i = ((Float) this.f41713b).floatValue();
        }
        return this.f41720i;
    }

    public int h() {
        if (this.f41722k == 784923401) {
            this.f41722k = ((Integer) this.f41713b).intValue();
        }
        return this.f41722k;
    }

    public boolean i() {
        return this.f41715d == null && this.f41716e == null && this.f41717f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f41713b + ", endValue=" + this.f41714c + ", startFrame=" + this.f41718g + ", endFrame=" + this.f41719h + ", interpolator=" + this.f41715d + '}';
    }
}
