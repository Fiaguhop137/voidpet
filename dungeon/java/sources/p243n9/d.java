package p243n9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import p002a1.k;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f49920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f49921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f49922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f49927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f49928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f49929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f49930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f49931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f49932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f49933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f49934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f49935p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Typeface f49936q;

    class a extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f49937a;

        a(f fVar) {
            this.f49937a = fVar;
        }

        @Override // a1.k.e
        public void f(int i10) {
            d.this.f49935p = true;
            this.f49937a.a(i10);
        }

        @Override // a1.k.e
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f49936q = Typeface.create(typeface, dVar.f49924e);
            d.this.f49935p = true;
            this.f49937a.b(d.this.f49936q, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f49940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f49941c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f49939a = context;
            this.f49940b = textPaint;
            this.f49941c = fVar;
        }

        @Override // p243n9.f
        public void a(int i10) {
            this.f49941c.a(i10);
        }

        @Override // p243n9.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f49939a, this.f49940b, typeface);
            this.f49941c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, Y8.k.f17529h6);
        l(typedArrayObtainStyledAttributes.getDimension(Y8.k.f17538i6, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17565l6));
        this.f49920a = c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17574m6);
        this.f49921b = c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17583n6);
        this.f49924e = typedArrayObtainStyledAttributes.getInt(Y8.k.f17556k6, 0);
        this.f49925f = typedArrayObtainStyledAttributes.getInt(Y8.k.f17547j6, 1);
        int iG = c.g(typedArrayObtainStyledAttributes, Y8.k.f17637t6, Y8.k.f17628s6);
        this.f49934o = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.f49923d = typedArrayObtainStyledAttributes.getString(iG);
        this.f49926g = typedArrayObtainStyledAttributes.getBoolean(Y8.k.f17646u6, false);
        this.f49922c = c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17592o6);
        this.f49927h = typedArrayObtainStyledAttributes.getFloat(Y8.k.f17601p6, 0.0f);
        this.f49928i = typedArrayObtainStyledAttributes.getFloat(Y8.k.f17610q6, 0.0f);
        this.f49929j = typedArrayObtainStyledAttributes.getFloat(Y8.k.f17619r6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, Y8.k.f17518g4);
        this.f49930k = typedArrayObtainStyledAttributes2.hasValue(Y8.k.f17527h4);
        this.f49931l = typedArrayObtainStyledAttributes2.getFloat(Y8.k.f17527h4, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f49936q == null && (str = this.f49923d) != null) {
            this.f49936q = Typeface.create(str, this.f49924e);
        }
        if (this.f49936q == null) {
            int i10 = this.f49925f;
            if (i10 == 1) {
                this.f49936q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f49936q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f49936q = Typeface.DEFAULT;
            } else {
                this.f49936q = Typeface.MONOSPACE;
            }
            this.f49936q = Typeface.create(this.f49936q, this.f49924e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f49934o;
        return (i10 != 0 ? k.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f49936q;
    }

    public Typeface f(Context context) {
        if (this.f49935p) {
            return this.f49936q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = k.h(context, this.f49934o);
                this.f49936q = typefaceH;
                if (typefaceH != null) {
                    this.f49936q = Typeface.create(typefaceH, this.f49924e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f49923d, e10);
            }
        }
        d();
        this.f49935p = true;
        return this.f49936q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f49934o;
        if (i10 == 0) {
            this.f49935p = true;
        }
        if (this.f49935p) {
            fVar.b(this.f49936q, true);
            return;
        }
        try {
            k.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f49935p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f49923d, e10);
            this.f49935p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f49932m;
    }

    public float j() {
        return this.f49933n;
    }

    public void k(ColorStateList colorStateList) {
        this.f49932m = colorStateList;
    }

    public void l(float f10) {
        this.f49933n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f49932m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f49929j;
        float f11 = this.f49927h;
        float f12 = this.f49928i;
        ColorStateList colorStateList2 = this.f49922c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = h.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f49924e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f49933n);
        if (this.f49930k) {
            textPaint.setLetterSpacing(this.f49931l);
        }
    }
}
