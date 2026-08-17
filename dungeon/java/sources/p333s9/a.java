package p333s9;

import Y8.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.D;
import p243n9.b;
import p243n9.c;

/* JADX INFO: loaded from: classes2.dex */
public class a extends D {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(p351t9.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        v(attributeSet, i10, 0);
    }

    private void s(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f17518g4);
        int iW = w(getContext(), typedArrayObtainStyledAttributes, k.f17536i4, k.f17545j4);
        typedArrayObtainStyledAttributes.recycle();
        if (iW >= 0) {
            setLineHeight(iW);
        }
    }

    private static boolean t(Context context) {
        return b.b(context, Y8.a.f16982b0, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f17554k4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(k.f17563l4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void v(AttributeSet attributeSet, int i10, int i11) {
        int iU;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (x(context, theme, attributeSet, i10, i11) || (iU = u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            s(theme, iU);
        }
    }

    private static int w(Context context, TypedArray typedArray, int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f17554k4, i10, i11);
        int iW = w(context, typedArrayObtainStyledAttributes, k.f17572m4, k.f17581n4);
        typedArrayObtainStyledAttributes.recycle();
        return iW != -1;
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (t(context)) {
            s(context.getTheme(), i10);
        }
    }
}
