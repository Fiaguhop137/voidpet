package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes2.dex */
class K extends B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float[] f38220s = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SVGLength f38221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SVGLength f38222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SVGLength f38223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SVGLength f38224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3164a.b f38225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C3164a.b f38226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f38227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f38228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f38229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f38230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String f38231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f38232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Matrix f38233r;

    public K(ReactContext reactContext) {
        super(reactContext);
        this.f38233r = null;
    }

    public void G(Dynamic dynamic) {
        this.f38224i = SVGLength.b(dynamic);
        invalidate();
    }

    public void H(int i10) {
        if (i10 == 0) {
            this.f38226k = C3164a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38226k = C3164a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void I(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f38220s;
            int iC = M.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.f38233r == null) {
                    this.f38233r = new Matrix();
                }
                this.f38233r.setValues(fArr);
            } else if (iC != -1) {
                W4.a.I("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f38233r = null;
        }
        invalidate();
    }

    public void J(int i10) {
        if (i10 == 0) {
            this.f38225j = C3164a.b.OBJECT_BOUNDING_BOX;
        } else if (i10 == 1) {
            this.f38225j = C3164a.b.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void K(Dynamic dynamic) {
        this.f38223h = SVGLength.b(dynamic);
        invalidate();
    }

    public void L(Dynamic dynamic) {
        this.f38221f = SVGLength.b(dynamic);
        invalidate();
    }

    public void M(Dynamic dynamic) {
        this.f38222g = SVGLength.b(dynamic);
        invalidate();
    }

    RectF getViewBox() {
        float f10 = this.f38227l;
        float f11 = this.mScale;
        float f12 = this.f38228m;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.f38229n) * f11, (f12 + this.f38230o) * f11);
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            C3164a c3164a = new C3164a(C3164a.EnumC0418a.PATTERN, new SVGLength[]{this.f38221f, this.f38222g, this.f38223h, this.f38224i}, this.f38225j);
            c3164a.d(this.f38226k);
            c3164a.g(this);
            Matrix matrix = this.f38233r;
            if (matrix != null) {
                c3164a.f(matrix);
            }
            SvgView svgView = getSvgView();
            C3164a.b bVar = this.f38225j;
            C3164a.b bVar2 = C3164a.b.USER_SPACE_ON_USE;
            if (bVar == bVar2 || this.f38226k == bVar2) {
                c3164a.h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(c3164a, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f38231p = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f38232q = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f38227l = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f38228m = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f38230o = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f38229n = f10;
        invalidate();
    }
}
