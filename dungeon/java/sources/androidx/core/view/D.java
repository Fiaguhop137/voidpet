package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f23135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f23136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f23137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f23139e;

    public D(View view) {
        this.f23137c = view;
    }

    private boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentH;
        int i15;
        int i16;
        int[] iArr3;
        if (!l() || (viewParentH = h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f23137c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        AbstractC1909h0.d(viewParentH, this.f23137c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f23137c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent h(int i10) {
        if (i10 == 0) {
            return this.f23135a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f23136b;
    }

    private int[] i() {
        if (this.f23139e == null) {
            this.f23139e = new int[2];
        }
        return this.f23139e;
    }

    private void n(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f23135a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f23136b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return AbstractC1909h0.a(viewParentH, this.f23137c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return AbstractC1909h0.b(viewParentH, this.f23137c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentH;
        int i13;
        int i14;
        if (!l() || (viewParentH = h(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f23137c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        AbstractC1909h0.c(viewParentH, this.f23137c, i10, i11, iArr3, i12);
        if (iArr2 != null) {
            this.f23137c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return g(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i10) {
        return h(i10) != null;
    }

    public boolean l() {
        return this.f23138d;
    }

    public void m(boolean z10) {
        if (this.f23138d) {
            Z.J0(this.f23137c);
        }
        this.f23138d = z10;
    }

    public boolean o(int i10) {
        return p(i10, 0);
    }

    public boolean p(int i10, int i11) {
        if (k(i11)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f23137c;
        for (ViewParent parent = this.f23137c.getParent(); parent != null; parent = parent.getParent()) {
            if (AbstractC1909h0.f(parent, view, this.f23137c, i10, i11)) {
                n(i11, parent);
                AbstractC1909h0.e(parent, view, this.f23137c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i10) {
        ViewParent viewParentH = h(i10);
        if (viewParentH != null) {
            AbstractC1909h0.g(viewParentH, this.f23137c, i10);
            n(i10, null);
        }
    }
}
