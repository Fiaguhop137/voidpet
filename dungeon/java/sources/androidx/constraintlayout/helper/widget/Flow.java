package androidx.constraintlayout.helper.widget;

import U0.e;
import U0.g;
import U0.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.j;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g f22445k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.j, androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f22445k = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f22847a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f22854b1) {
                    this.f22445k.S1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f22861c1) {
                    this.f22445k.Y0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22931m1) {
                    this.f22445k.d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22938n1) {
                    this.f22445k.a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22868d1) {
                    this.f22445k.b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22875e1) {
                    this.f22445k.e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22882f1) {
                    this.f22445k.c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22889g1) {
                    this.f22445k.Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22757L1) {
                    this.f22445k.X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f22697B1) {
                    this.f22445k.M1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f22751K1) {
                    this.f22445k.W1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f22994v1) {
                    this.f22445k.G1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f22709D1) {
                    this.f22445k.O1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f23007x1) {
                    this.f22445k.I1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f22721F1) {
                    this.f22445k.Q1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f23019z1) {
                    this.f22445k.K1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f22987u1) {
                    this.f22445k.F1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f22703C1) {
                    this.f22445k.N1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f23001w1) {
                    this.f22445k.H1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f22715E1) {
                    this.f22445k.P1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f22739I1) {
                    this.f22445k.U1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f23013y1) {
                    this.f22445k.J1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f22733H1) {
                    this.f22445k.T1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f22691A1) {
                    this.f22445k.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22745J1) {
                    this.f22445k.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f22727G1) {
                    this.f22445k.R1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f22568d = this.f22445k;
        m();
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(e eVar, boolean z10) {
        this.f22445k.K0(z10);
    }

    @Override // androidx.constraintlayout.widget.j
    public void n(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.N0(), lVar.M0());
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    protected void onMeasure(int i10, int i11) {
        n(this.f22445k, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f22445k.F1(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f22445k.G1(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f22445k.H1(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f22445k.I1(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f22445k.J1(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f22445k.K1(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f22445k.L1(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f22445k.M1(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f22445k.R1(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f22445k.S1(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f22445k.Y0(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f22445k.Z0(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f22445k.b1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f22445k.c1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f22445k.e1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f22445k.T1(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f22445k.U1(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f22445k.V1(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f22445k.W1(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f22445k.X1(i10);
        requestLayout();
    }
}
