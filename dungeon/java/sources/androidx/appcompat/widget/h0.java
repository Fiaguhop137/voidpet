package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f21010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f21011c;

    private h0(Context context, TypedArray typedArray) {
        this.f21009a = context;
        this.f21010b = typedArray;
    }

    public static h0 t(Context context, int i10, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static h0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static h0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f21010b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f21010b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f21010b.hasValue(i10) || (resourceId = this.f21010b.getResourceId(i10, 0)) == 0 || (colorStateListA = p161j.a.a(this.f21009a, resourceId)) == null) ? this.f21010b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f21010b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f21010b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f21010b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f21010b.hasValue(i10) || (resourceId = this.f21010b.getResourceId(i10, 0)) == 0) ? this.f21010b.getDrawable(i10) : p161j.a.b(this.f21009a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f21010b.hasValue(i10) || (resourceId = this.f21010b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C1823k.b().d(this.f21009a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f21010b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, a1.k.e eVar) {
        int resourceId = this.f21010b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f21011c == null) {
            this.f21011c = new TypedValue();
        }
        return p002a1.k.i(this.f21009a, resourceId, this.f21011c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f21010b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f21010b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f21010b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f21010b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f21010b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f21010b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f21010b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f21010b;
    }

    public boolean s(int i10) {
        return this.f21010b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f21010b.peekValue(i10);
    }

    public void x() {
        this.f21010b.recycle();
    }
}
