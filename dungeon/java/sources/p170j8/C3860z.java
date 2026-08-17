package p170j8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.i;
import p038c1.a;
import p099f8.b;
import p099f8.c;

/* JADX INFO: renamed from: j8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3860z extends Button {
    public C3860z(Context context, AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int b(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            return i11;
        }
        if (i10 == 1) {
            return i12;
        }
        if (i10 == 2) {
            return i13;
        }
        throw new IllegalStateException("Unknown color scheme: " + i10);
    }

    public final void a(Resources resources, int i10, int i11) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i12 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i12);
        setMinWidth(i12);
        int i13 = b.f41794b;
        int i14 = b.f41795c;
        int iB = b(i11, i13, i14, i14);
        int i15 = b.f41796d;
        int i16 = b.f41797e;
        int iB2 = b(i11, i15, i16, i16);
        if (i10 == 0 || i10 == 1) {
            iB = iB2;
        } else if (i10 != 2) {
            throw new IllegalStateException("Unknown button size: " + i10);
        }
        Drawable drawableR = a.r(resources.getDrawable(iB));
        a.o(drawableR, resources.getColorStateList(p099f8.a.f41792c));
        a.p(drawableR, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableR);
        int i17 = p099f8.a.f41790a;
        int i18 = p099f8.a.f41791b;
        setTextColor((ColorStateList) r.l(resources.getColorStateList(b(i11, i17, i18, i18))));
        if (i10 == 0) {
            setText(resources.getString(c.f41813p));
        } else if (i10 == 1) {
            setText(resources.getString(c.f41814q));
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown button size: " + i10);
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (i.c(getContext())) {
            setGravity(19);
        }
    }
}
