package p225m9;

import Y8.j;
import Y8.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1833v;
import androidx.core.widget.c;
import com.google.android.material.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public class a extends C1833v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f49183g = j.f17214s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f49184h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f49185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49186f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y8.a.f16972T);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f49183g;
        super(p351t9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, k.f17449Z3, i10, i11, new int[0]);
        if (typedArrayI.hasValue(k.f17459a4)) {
            c.d(this, p243n9.c.a(context2, typedArrayI, k.f17459a4));
        }
        this.f49186f = typedArrayI.getBoolean(k.f17469b4, false);
        typedArrayI.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f49185e == null) {
            int iD = p118g9.a.d(this, Y8.a.f16991h);
            int iD2 = p118g9.a.d(this, Y8.a.f16996m);
            int iD3 = p118g9.a.d(this, Y8.a.f17002s);
            int[][] iArr = f49184h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = p118g9.a.j(iD3, iD, 1.0f);
            iArr2[1] = p118g9.a.j(iD3, iD2, 0.54f);
            iArr2[2] = p118g9.a.j(iD3, iD2, 0.38f);
            iArr2[3] = p118g9.a.j(iD3, iD2, 0.38f);
            this.f49185e = new ColorStateList(iArr, iArr2);
        }
        return this.f49185e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49186f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f49186f = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }
}
