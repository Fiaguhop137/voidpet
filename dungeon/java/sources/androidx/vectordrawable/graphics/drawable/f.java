package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.k;
import p002a1.n;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f25705k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f25706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f25707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f25708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f25711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f25712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f25713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f25714j;

    private static class b extends AbstractC0327f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f25741b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f25740a = p020b1.f.d(string2);
            }
            this.f25742c = n.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC0327f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f25678d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }
    }

    private static class c extends AbstractC0327f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f25715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        p002a1.d f25716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f25717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        p002a1.d f25718h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f25719i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f25720j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f25721k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f25722l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f25723m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f25724n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f25725o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f25726p;

        c() {
            this.f25717g = 0.0f;
            this.f25719i = 1.0f;
            this.f25720j = 1.0f;
            this.f25721k = 0.0f;
            this.f25722l = 1.0f;
            this.f25723m = 0.0f;
            this.f25724n = Paint.Cap.BUTT;
            this.f25725o = Paint.Join.MITER;
            this.f25726p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f25717g = 0.0f;
            this.f25719i = 1.0f;
            this.f25720j = 1.0f;
            this.f25721k = 0.0f;
            this.f25722l = 1.0f;
            this.f25723m = 0.0f;
            this.f25724n = Paint.Cap.BUTT;
            this.f25725o = Paint.Join.MITER;
            this.f25726p = 4.0f;
            this.f25715e = cVar.f25715e;
            this.f25716f = cVar.f25716f;
            this.f25717g = cVar.f25717g;
            this.f25719i = cVar.f25719i;
            this.f25718h = cVar.f25718h;
            this.f25742c = cVar.f25742c;
            this.f25720j = cVar.f25720j;
            this.f25721k = cVar.f25721k;
            this.f25722l = cVar.f25722l;
            this.f25723m = cVar.f25723m;
            this.f25724n = cVar.f25724n;
            this.f25725o = cVar.f25725o;
            this.f25726p = cVar.f25726p;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f25715e = null;
            if (n.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f25741b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f25740a = p020b1.f.d(string2);
                }
                this.f25718h = n.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f25720j = n.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f25720j);
                this.f25724n = e(n.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f25724n);
                this.f25725o = f(n.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f25725o);
                this.f25726p = n.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f25726p);
                this.f25716f = n.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f25719i = n.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f25719i);
                this.f25717g = n.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f25717g);
                this.f25722l = n.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f25722l);
                this.f25723m = n.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f25723m);
                this.f25721k = n.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f25721k);
                this.f25742c = n.g(typedArray, xmlPullParser, "fillType", 13, this.f25742c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f25718h.i() || this.f25716f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f25716f.j(iArr) | this.f25718h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f25677c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f25720j;
        }

        int getFillColor() {
            return this.f25718h.e();
        }

        float getStrokeAlpha() {
            return this.f25719i;
        }

        int getStrokeColor() {
            return this.f25716f.e();
        }

        float getStrokeWidth() {
            return this.f25717g;
        }

        float getTrimPathEnd() {
            return this.f25722l;
        }

        float getTrimPathOffset() {
            return this.f25723m;
        }

        float getTrimPathStart() {
            return this.f25721k;
        }

        void setFillAlpha(float f10) {
            this.f25720j = f10;
        }

        void setFillColor(int i10) {
            this.f25718h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f25719i = f10;
        }

        void setStrokeColor(int i10) {
            this.f25716f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f25717g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f25722l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f25723m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f25721k = f10;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f25727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f25728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f25729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f25730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f25731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f25732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f25733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f25734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f25735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f25736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f25737k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f25738l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f25739m;

        public d() {
            super(null);
            this.f25727a = new Matrix();
            this.f25728b = new ArrayList();
            this.f25729c = 0.0f;
            this.f25730d = 0.0f;
            this.f25731e = 0.0f;
            this.f25732f = 1.0f;
            this.f25733g = 1.0f;
            this.f25734h = 0.0f;
            this.f25735i = 0.0f;
            this.f25736j = new Matrix();
            this.f25739m = null;
        }

        public d(d dVar, C4101a c4101a) {
            AbstractC0327f bVar;
            super(null);
            this.f25727a = new Matrix();
            this.f25728b = new ArrayList();
            this.f25729c = 0.0f;
            this.f25730d = 0.0f;
            this.f25731e = 0.0f;
            this.f25732f = 1.0f;
            this.f25733g = 1.0f;
            this.f25734h = 0.0f;
            this.f25735i = 0.0f;
            Matrix matrix = new Matrix();
            this.f25736j = matrix;
            this.f25739m = null;
            this.f25729c = dVar.f25729c;
            this.f25730d = dVar.f25730d;
            this.f25731e = dVar.f25731e;
            this.f25732f = dVar.f25732f;
            this.f25733g = dVar.f25733g;
            this.f25734h = dVar.f25734h;
            this.f25735i = dVar.f25735i;
            this.f25738l = dVar.f25738l;
            String str = dVar.f25739m;
            this.f25739m = str;
            this.f25737k = dVar.f25737k;
            if (str != null) {
                c4101a.put(str, this);
            }
            matrix.set(dVar.f25736j);
            ArrayList arrayList = dVar.f25728b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f25728b.add(new d((d) obj, c4101a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f25728b.add(bVar);
                    Object obj2 = bVar.f25741b;
                    if (obj2 != null) {
                        c4101a.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f25736j.reset();
            this.f25736j.postTranslate(-this.f25730d, -this.f25731e);
            this.f25736j.postScale(this.f25732f, this.f25733g);
            this.f25736j.postRotate(this.f25729c, 0.0f, 0.0f);
            this.f25736j.postTranslate(this.f25734h + this.f25730d, this.f25735i + this.f25731e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f25738l = null;
            this.f25729c = n.f(typedArray, xmlPullParser, "rotation", 5, this.f25729c);
            this.f25730d = typedArray.getFloat(1, this.f25730d);
            this.f25731e = typedArray.getFloat(2, this.f25731e);
            this.f25732f = n.f(typedArray, xmlPullParser, "scaleX", 3, this.f25732f);
            this.f25733g = n.f(typedArray, xmlPullParser, "scaleY", 4, this.f25733g);
            this.f25734h = n.f(typedArray, xmlPullParser, "translateX", 6, this.f25734h);
            this.f25735i = n.f(typedArray, xmlPullParser, "translateY", 7, this.f25735i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f25739m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f25728b.size(); i10++) {
                if (((e) this.f25728b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f25728b.size(); i10++) {
                zB |= ((e) this.f25728b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f25676b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f25739m;
        }

        public Matrix getLocalMatrix() {
            return this.f25736j;
        }

        public float getPivotX() {
            return this.f25730d;
        }

        public float getPivotY() {
            return this.f25731e;
        }

        public float getRotation() {
            return this.f25729c;
        }

        public float getScaleX() {
            return this.f25732f;
        }

        public float getScaleY() {
            return this.f25733g;
        }

        public float getTranslateX() {
            return this.f25734h;
        }

        public float getTranslateY() {
            return this.f25735i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f25730d) {
                this.f25730d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f25731e) {
                this.f25731e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f25729c) {
                this.f25729c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f25732f) {
                this.f25732f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f25733g) {
                this.f25733g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f25734h) {
                this.f25734h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f25735i) {
                this.f25735i = f10;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    private static abstract class AbstractC0327f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected b1.f.b[] f25740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f25741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25743d;

        public AbstractC0327f() {
            super(null);
            this.f25740a = null;
            this.f25742c = 0;
        }

        public AbstractC0327f(AbstractC0327f abstractC0327f) {
            super(null);
            this.f25740a = null;
            this.f25742c = 0;
            this.f25741b = abstractC0327f.f25741b;
            this.f25743d = abstractC0327f.f25743d;
            this.f25740a = p020b1.f.f(abstractC0327f.f25740a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            b1.f.b[] bVarArr = this.f25740a;
            if (bVarArr != null) {
                b1.f.b.h(bVarArr, path);
            }
        }

        public b1.f.b[] getPathData() {
            return this.f25740a;
        }

        public String getPathName() {
            return this.f25741b;
        }

        public void setPathData(b1.f.b[] bVarArr) {
            if (p020b1.f.b(this.f25740a, bVarArr)) {
                p020b1.f.k(this.f25740a, bVarArr);
            } else {
                this.f25740a = p020b1.f.f(bVarArr);
            }
        }
    }

    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f25744q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f25745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f25746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f25747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f25748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f25749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f25750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f25751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f25752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f25753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f25754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f25755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f25756l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f25757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f25758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f25759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final C4101a f25760p;

        public g() {
            this.f25747c = new Matrix();
            this.f25753i = 0.0f;
            this.f25754j = 0.0f;
            this.f25755k = 0.0f;
            this.f25756l = 0.0f;
            this.f25757m = 255;
            this.f25758n = null;
            this.f25759o = null;
            this.f25760p = new C4101a();
            this.f25752h = new d();
            this.f25745a = new Path();
            this.f25746b = new Path();
        }

        public g(g gVar) {
            this.f25747c = new Matrix();
            this.f25753i = 0.0f;
            this.f25754j = 0.0f;
            this.f25755k = 0.0f;
            this.f25756l = 0.0f;
            this.f25757m = 255;
            this.f25758n = null;
            this.f25759o = null;
            C4101a c4101a = new C4101a();
            this.f25760p = c4101a;
            this.f25752h = new d(gVar.f25752h, c4101a);
            this.f25745a = new Path(gVar.f25745a);
            this.f25746b = new Path(gVar.f25746b);
            this.f25753i = gVar.f25753i;
            this.f25754j = gVar.f25754j;
            this.f25755k = gVar.f25755k;
            this.f25756l = gVar.f25756l;
            this.f25751g = gVar.f25751g;
            this.f25757m = gVar.f25757m;
            this.f25758n = gVar.f25758n;
            String str = gVar.f25758n;
            if (str != null) {
                c4101a.put(str, this);
            }
            this.f25759o = gVar.f25759o;
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f25727a.set(matrix);
            dVar2.f25727a.preConcat(dVar2.f25736j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f25728b.size()) {
                e eVar = (e) dVar2.f25728b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f25727a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0327f) {
                    d(dVar2, (AbstractC0327f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC0327f abstractC0327f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f25755k;
            float f11 = i11 / this.f25756l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f25727a;
            this.f25747c.set(matrix);
            this.f25747c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0327f.d(this.f25745a);
            Path path = this.f25745a;
            this.f25746b.reset();
            if (abstractC0327f.c()) {
                this.f25746b.setFillType(abstractC0327f.f25742c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f25746b.addPath(path, this.f25747c);
                canvas.clipPath(this.f25746b);
                return;
            }
            c cVar = (c) abstractC0327f;
            float f12 = cVar.f25721k;
            if (f12 != 0.0f || cVar.f25722l != 1.0f) {
                float f13 = cVar.f25723m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f25722l + f13) % 1.0f;
                if (this.f25750f == null) {
                    this.f25750f = new PathMeasure();
                }
                this.f25750f.setPath(this.f25745a, false);
                float length = this.f25750f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f25750f.getSegment(f16, length, path, true);
                    this.f25750f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f25750f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f25746b.addPath(path, this.f25747c);
            if (cVar.f25718h.l()) {
                p002a1.d dVar2 = cVar.f25718h;
                if (this.f25749e == null) {
                    Paint paint = new Paint(1);
                    this.f25749e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f25749e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f25747c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f25720j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f25720j));
                }
                paint2.setColorFilter(colorFilter);
                this.f25746b.setFillType(cVar.f25742c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f25746b, paint2);
            }
            if (cVar.f25716f.l()) {
                p002a1.d dVar3 = cVar.f25716f;
                if (this.f25748d == null) {
                    Paint paint3 = new Paint(1);
                    this.f25748d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f25748d;
                Paint.Join join = cVar.f25725o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f25724n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f25726p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f25747c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f25719i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f25719i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f25717g * fMin * fE);
                canvas.drawPath(this.f25746b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f25752h, f25744q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f25759o == null) {
                this.f25759o = Boolean.valueOf(this.f25752h.a());
            }
            return this.f25759o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f25752h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f25757m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f25757m = i10;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f25762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f25763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f25764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f25765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f25766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f25767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f25768h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f25769i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f25770j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f25771k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f25772l;

        public h() {
            this.f25763c = null;
            this.f25764d = f.f25705k;
            this.f25762b = new g();
        }

        public h(h hVar) {
            this.f25763c = null;
            this.f25764d = f.f25705k;
            if (hVar != null) {
                this.f25761a = hVar.f25761a;
                g gVar = new g(hVar.f25762b);
                this.f25762b = gVar;
                if (hVar.f25762b.f25749e != null) {
                    gVar.f25749e = new Paint(hVar.f25762b.f25749e);
                }
                if (hVar.f25762b.f25748d != null) {
                    this.f25762b.f25748d = new Paint(hVar.f25762b.f25748d);
                }
                this.f25763c = hVar.f25763c;
                this.f25764d = hVar.f25764d;
                this.f25765e = hVar.f25765e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f25766f.getWidth() && i11 == this.f25766f.getHeight();
        }

        public boolean b() {
            return !this.f25771k && this.f25767g == this.f25763c && this.f25768h == this.f25764d && this.f25770j == this.f25765e && this.f25769i == this.f25762b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f25766f == null || !a(i10, i11)) {
                this.f25766f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f25771k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f25766f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f25772l == null) {
                Paint paint = new Paint();
                this.f25772l = paint;
                paint.setFilterBitmap(true);
            }
            this.f25772l.setAlpha(this.f25762b.getRootAlpha());
            this.f25772l.setColorFilter(colorFilter);
            return this.f25772l;
        }

        public boolean f() {
            return this.f25762b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f25762b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25761a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f25762b.g(iArr);
            this.f25771k |= zG;
            return zG;
        }

        public void i() {
            this.f25767g = this.f25763c;
            this.f25768h = this.f25764d;
            this.f25769i = this.f25762b.getRootAlpha();
            this.f25770j = this.f25765e;
            this.f25771k = false;
        }

        public void j(int i10, int i11) {
            this.f25766f.eraseColor(0);
            this.f25762b.b(new Canvas(this.f25766f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f25773a;

        public i(Drawable.ConstantState constantState) {
            this.f25773a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f25773a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25773a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f25704a = (VectorDrawable) this.f25773a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f25704a = (VectorDrawable) this.f25773a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f25704a = (VectorDrawable) this.f25773a.newDrawable(resources, theme);
            return fVar;
        }
    }

    f() {
        this.f25710f = true;
        this.f25712h = new float[9];
        this.f25713i = new Matrix();
        this.f25714j = new Rect();
        this.f25706b = new h();
    }

    f(h hVar) {
        this.f25710f = true;
        this.f25712h = new float[9];
        this.f25713i = new Matrix();
        this.f25714j = new Rect();
        this.f25706b = hVar;
        this.f25707c = i(this.f25707c, hVar.f25763c, hVar.f25764d);
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f25704a = k.f(resources, i10, theme);
        fVar.f25711g = new i(fVar.f25704a.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f25706b;
        g gVar = hVar.f25762b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f25752h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f25728b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f25760p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f25761a = cVar.f25743d | hVar.f25761a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f25728b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f25760p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f25761a = bVar.f25743d | hVar.f25761a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f25728b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f25760p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f25761a = dVar2.f25737k | hVar.f25761a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && p038c1.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f25706b;
        g gVar = hVar.f25762b;
        hVar.f25764d = f(n.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = n.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f25763c = colorStateListC;
        }
        hVar.f25765e = n.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f25765e);
        gVar.f25755k = n.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f25755k);
        float f10 = n.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f25756l);
        gVar.f25756l = f10;
        if (gVar.f25755k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f25753i = typedArray.getDimension(3, gVar.f25753i);
        float dimension = typedArray.getDimension(2, gVar.f25754j);
        gVar.f25754j = dimension;
        if (gVar.f25753i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(n.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f25758n = string;
            gVar.f25760p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f25706b.f25762b.f25760p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f25704a;
        if (drawable == null) {
            return false;
        }
        p038c1.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f25714j);
        if (this.f25714j.width() <= 0 || this.f25714j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f25708d;
        if (colorFilter == null) {
            colorFilter = this.f25707c;
        }
        canvas.getMatrix(this.f25713i);
        this.f25713i.getValues(this.f25712h);
        float fAbs = Math.abs(this.f25712h[0]);
        float fAbs2 = Math.abs(this.f25712h[4]);
        float fAbs3 = Math.abs(this.f25712h[1]);
        float fAbs4 = Math.abs(this.f25712h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f25714j.width() * fAbs);
        int iHeight = (int) (this.f25714j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f25714j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f25714j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f25714j.offsetTo(0, 0);
        this.f25706b.c(iMin, iMin2);
        if (!this.f25710f) {
            this.f25706b.j(iMin, iMin2);
        } else if (!this.f25706b.b()) {
            this.f25706b.j(iMin, iMin2);
            this.f25706b.i();
        }
        this.f25706b.d(canvas, colorFilter, this.f25714j);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f25710f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f25704a;
        return drawable != null ? p038c1.a.d(drawable) : this.f25706b.f25762b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f25706b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f25704a;
        return drawable != null ? p038c1.a.e(drawable) : this.f25708d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f25704a != null) {
            return new i(this.f25704a.getConstantState());
        }
        this.f25706b.f25761a = getChangingConfigurations();
        return this.f25706b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f25706b.f25762b.f25754j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f25706b.f25762b.f25753i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f25706b;
        hVar.f25762b = new g();
        TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f25675a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f25761a = getChangingConfigurations();
        hVar.f25771k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f25707c = i(this.f25707c, hVar.f25763c, hVar.f25764d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f25704a;
        return drawable != null ? p038c1.a.h(drawable) : this.f25706b.f25765e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f25706b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f25706b.f25763c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f25709e && super.mutate() == this) {
            this.f25706b = new h(this.f25706b);
            this.f25709e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f25706b;
        ColorStateList colorStateList = hVar.f25763c;
        if (colorStateList == null || (mode = hVar.f25764d) == null) {
            z10 = false;
        } else {
            this.f25707c = i(this.f25707c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f25706b.f25762b.getRootAlpha() != i10) {
            this.f25706b.f25762b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.j(drawable, z10);
        } else {
            this.f25706b.f25765e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f25708d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f25706b;
        if (hVar.f25763c != colorStateList) {
            hVar.f25763c = colorStateList;
            this.f25707c = i(this.f25707c, colorStateList, hVar.f25764d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.p(drawable, mode);
            return;
        }
        h hVar = this.f25706b;
        if (hVar.f25764d != mode) {
            hVar.f25764d = mode;
            this.f25707c = i(this.f25707c, hVar.f25763c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
