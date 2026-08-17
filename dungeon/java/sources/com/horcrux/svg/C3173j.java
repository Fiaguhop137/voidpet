package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3173j extends AbstractC3180q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f38421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f38422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    EnumC3182s f38423e;

    /* JADX INFO: renamed from: com.horcrux.svg.j$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38424a;

        static {
            int[] iArr = new int[EnumC3182s.values().length];
            f38424a = iArr;
            try {
                iArr[EnumC3182s.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38424a[EnumC3182s.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38424a[EnumC3182s.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38424a[EnumC3182s.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38424a[EnumC3182s.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38424a[EnumC3182s.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C3173j(ReactContext reactContext) {
        super(reactContext);
        this.f38480b.mX = new SVGLength(0.0d);
        this.f38480b.mY = new SVGLength(0.0d);
        this.f38480b.mW = new SVGLength("100%");
        this.f38480b.mH = new SVGLength("100%");
    }

    public static /* synthetic */ float[] D(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = 1.0f - f10;
        float f12 = fArr2[0];
        float f13 = 1.0f - f12;
        float f14 = fArr[1] * f10;
        float f15 = fArr2[1];
        float f16 = (f14 * f13) + (f15 * f12 * f11) + (f14 * f15 * f12);
        float f17 = fArr[2] * f10;
        float f18 = fArr2[2];
        float f19 = fArr[3] * f10;
        float f20 = fArr2[3];
        return new float[]{1.0f - (f11 * f13), f16, (f17 * f13) + (f18 * f12 * f11) + (f17 * f18 * f12), (f13 * f19) + (f20 * f12 * f11) + (f19 * f20 * f12)};
    }

    public void E(String str) {
        this.f38421c = str;
        invalidate();
    }

    public void F(String str) {
        this.f38422d = str;
        invalidate();
    }

    public void G(String str) {
        this.f38423e = EnumC3182s.g(str);
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC3180q
    public Bitmap v(HashMap map, Bitmap bitmap) {
        Bitmap bitmapX = AbstractC3180q.x(map, bitmap, this.f38421c);
        Bitmap bitmapX2 = AbstractC3180q.x(map, bitmap, this.f38422d);
        if (this.f38423e == EnumC3182s.MULTIPLY) {
            return CustomFilter.apply(bitmapX, bitmapX2, new C3172i());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapX.getWidth(), bitmapX.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapX, 0.0f, 0.0f, paint);
        int i10 = a.f38424a[this.f38423e.ordinal()];
        if (i10 == 1 || i10 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i10 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i10 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(bitmapX2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
