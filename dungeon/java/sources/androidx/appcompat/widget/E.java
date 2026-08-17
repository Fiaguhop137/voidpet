package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f20587l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f20588m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20589a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20590b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20591c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f20592d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f20593e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f20594f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20595g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f20596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f20597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f20598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f20599k;

    private static final class a {
        @NonNull
        static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) E.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.E.b, androidx.appcompat.widget.E.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.E.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class d {
        d() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) E.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    E(TextView textView) {
        this.f20597i = textView;
        this.f20598j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20599k = new c();
        } else {
            this.f20599k = new b();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f20589a = 0;
        this.f20592d = -1.0f;
        this.f20593e = -1.0f;
        this.f20591c = -1.0f;
        this.f20594f = new int[0];
        this.f20590b = false;
    }

    private int e(RectF rectF) {
        int length = this.f20594f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f20594f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f20594f[i12];
    }

    private static Method k(String str) {
        try {
            Method declaredMethod = (Method) f20588m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f20588m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    private void s(float f10) {
        if (f10 != this.f20597i.getPaint().getTextSize()) {
            this.f20597i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f20597i.isInLayout();
            if (this.f20597i.getLayout() != null) {
                this.f20590b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f20597i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f20597i.forceLayout();
                } else {
                    this.f20597i.requestLayout();
                }
                this.f20597i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f20589a == 1) {
            if (!this.f20595g || this.f20594f.length == 0) {
                int iFloor = ((int) Math.floor((this.f20593e - this.f20592d) / this.f20591c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f20592d + (i10 * this.f20591c));
                }
                this.f20594f = b(iArr);
            }
            this.f20590b = true;
        } else {
            this.f20590b = false;
        }
        return this.f20590b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f20594f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f20594f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f20595g = z10;
        if (z10) {
            this.f20589a = 1;
            this.f20592d = iArr[0];
            this.f20593e = iArr[length - 1];
            this.f20591c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f20597i.getText();
        TransformationMethod transformationMethod = this.f20597i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f20597i)) != null) {
            text = transformation;
        }
        int maxLines = this.f20597i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f20597i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f20597i instanceof C1824l);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f20589a = 1;
        this.f20592d = f10;
        this.f20593e = f11;
        this.f20591c = f12;
        this.f20595g = false;
    }

    void a() {
        if (n()) {
            if (this.f20590b) {
                if (this.f20597i.getMeasuredHeight() <= 0 || this.f20597i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f20599k.b(this.f20597i) ? 1048576 : (this.f20597i.getMeasuredWidth() - this.f20597i.getTotalPaddingLeft()) - this.f20597i.getTotalPaddingRight();
                int height = (this.f20597i.getHeight() - this.f20597i.getCompoundPaddingBottom()) - this.f20597i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f20587l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f20597i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f20590b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f20597i, this.f20596h, this.f20599k);
    }

    int f() {
        return Math.round(this.f20593e);
    }

    int g() {
        return Math.round(this.f20592d);
    }

    int h() {
        return Math.round(this.f20591c);
    }

    int[] i() {
        return this.f20594f;
    }

    int j() {
        return this.f20589a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f20596h;
        if (textPaint == null) {
            this.f20596h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f20596h.set(this.f20597i.getPaint());
        this.f20596h.setTextSize(i10);
    }

    boolean n() {
        return y() && this.f20589a != 0;
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f20598j.obtainStyledAttributes(attributeSet, p144i.j.f43400g0, i10, 0);
        TextView textView = this.f20597i;
        androidx.core.view.Z.k0(textView, textView.getContext(), p144i.j.f43400g0, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(p144i.j.f43425l0)) {
            this.f20589a = typedArrayObtainStyledAttributes.getInt(p144i.j.f43425l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(p144i.j.f43420k0) ? typedArrayObtainStyledAttributes.getDimension(p144i.j.f43420k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(p144i.j.f43410i0) ? typedArrayObtainStyledAttributes.getDimension(p144i.j.f43410i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(p144i.j.f43405h0) ? typedArrayObtainStyledAttributes.getDimension(p144i.j.f43405h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(p144i.j.f43415j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(p144i.j.f43415j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f20589a = 0;
            return;
        }
        if (this.f20589a == 1) {
            if (!this.f20595g) {
                DisplayMetrics displayMetrics = this.f20598j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f20598j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f20598j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f20594f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f20595g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f20598j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i10, float f10) {
        Context context = this.f20598j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
