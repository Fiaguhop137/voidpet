package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f22565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f22566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f22567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected U0.i f22568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f22569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f22570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View[] f22571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap f22572h;

    public c(Context context) {
        super(context);
        this.f22565a = new int[32];
        this.f22569e = false;
        this.f22571g = null;
        this.f22572h = new HashMap();
        this.f22567c = context;
        g(null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22565a = new int[32];
        this.f22569e = false;
        this.f22571g = null;
        this.f22572h = new HashMap();
        this.f22567c = context;
        g(attributeSet);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f22567c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iF = f(strTrim);
        if (iF != 0) {
            this.f22572h.put(Integer.valueOf(iF), strTrim);
            b(iF);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f22566b + 1;
        int[] iArr = this.f22565a;
        if (i11 > iArr.length) {
            this.f22565a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f22565a;
        int i12 = this.f22566b;
        iArr2[i12] = i10;
        this.f22566b = i12 + 1;
    }

    private int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f22567c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iE = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iE = ((Integer) objF).intValue();
            }
        }
        if (iE == 0 && constraintLayout != null) {
            iE = e(constraintLayout, str);
        }
        if (iE == 0) {
            try {
                iE = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iE == 0 ? this.f22567c.getResources().getIdentifier(str, "id", this.f22567c.getPackageName()) : iE;
    }

    protected void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    protected void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f22566b; i10++) {
            View viewH = constraintLayout.h(this.f22565a[i10]);
            if (viewH != null) {
                viewH.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f22847a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f22980t1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f22570f = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f22565a, this.f22566b);
    }

    public abstract void h(U0.e eVar, boolean z10);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int iE;
        if (isInEditMode()) {
            setIds(this.f22570f);
        }
        U0.i iVar = this.f22568d;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i10 = 0; i10 < this.f22566b; i10++) {
            int i11 = this.f22565a[i10];
            View viewH = constraintLayout.h(i11);
            if (viewH == null && (iE = e(constraintLayout, (str = (String) this.f22572h.get(Integer.valueOf(i11))))) != 0) {
                this.f22565a[i10] = iE;
                this.f22572h.put(Integer.valueOf(iE), str);
                viewH = constraintLayout.h(iE);
            }
            if (viewH != null) {
                this.f22568d.c(constraintLayout.i(viewH));
            }
        }
        this.f22568d.a(constraintLayout.f22448c);
    }

    public void m() {
        if (this.f22568d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f22523n0 = (U0.e) this.f22568d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f22570f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f22569e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f22570f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f22566b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f22570f = null;
        this.f22566b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }
}
