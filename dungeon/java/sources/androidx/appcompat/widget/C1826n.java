package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1826n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f21067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E1.f f21068b;

    C1826n(TextView textView) {
        this.f21067a = textView;
        this.f21068b = new E1.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f21068b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f21068b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f21067a.getContext().obtainStyledAttributes(attributeSet, p144i.j.f43400g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(p144i.j.f43470u0) ? typedArrayObtainStyledAttributes.getBoolean(p144i.j.f43470u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z10) {
        this.f21068b.c(z10);
    }

    void e(boolean z10) {
        this.f21068b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f21068b.e(transformationMethod);
    }
}
