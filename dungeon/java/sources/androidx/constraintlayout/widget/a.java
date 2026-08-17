package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private U0.a f22548k;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void o(U0.e eVar, int i10, boolean z10) {
        this.f22547j = i10;
        if (z10) {
            int i11 = this.f22546i;
            if (i11 == 5) {
                this.f22547j = 1;
            } else if (i11 == 6) {
                this.f22547j = 0;
            }
        } else {
            int i12 = this.f22546i;
            if (i12 == 5) {
                this.f22547j = 0;
            } else if (i12 == 6) {
                this.f22547j = 1;
            }
        }
        if (eVar instanceof U0.a) {
            ((U0.a) eVar).P0(this.f22547j);
        }
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f22548k = new U0.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f22847a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f22959q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f22952p1) {
                    this.f22548k.O0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f22966r1) {
                    this.f22548k.Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f22568d = this.f22548k;
        m();
    }

    public int getMargin() {
        return this.f22548k.M0();
    }

    public int getType() {
        return this.f22546i;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(U0.e eVar, boolean z10) {
        o(eVar, this.f22546i, z10);
    }

    public boolean n() {
        return this.f22548k.K0();
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f22548k.O0(z10);
    }

    public void setDpMargin(int i10) {
        this.f22548k.Q0((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f22548k.Q0(i10);
    }

    public void setType(int i10) {
        this.f22546i = i10;
    }
}
