package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC1929s;
import androidx.core.view.C0;
import androidx.core.view.E;
import androidx.core.view.F;
import androidx.core.view.G;
import androidx.core.view.H;
import androidx.core.view.Z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements E, F {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f23025t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final Class[] f23026u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final ThreadLocal f23027v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final Comparator f23028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final p199l1.e f23029x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f23031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f23032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f23033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f23034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f23035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f23038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f23039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f23040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f23041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0 f23043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f23045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f23046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private H f23047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final G f23048s;

    class a implements H {
        a() {
        }

        @Override // androidx.core.view.H
        public C0 a(View view, C0 c10) {
            return CoordinatorLayout.this.Z(c10);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public C0 f(CoordinatorLayout coordinatorLayout, View view, C0 c10) {
            return c10;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f23046q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.J(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f23046q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f23051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f23052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23056f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23057g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f23058h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f23059i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f23060j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f23061k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f23062l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f23063m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f23064n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f23065o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f23066p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f23067q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f23068r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f23052b = false;
            this.f23053c = 0;
            this.f23054d = 0;
            this.f23055e = -1;
            this.f23056f = -1;
            this.f23057g = 0;
            this.f23058h = 0;
            this.f23067q = new Rect();
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23052b = false;
            this.f23053c = 0;
            this.f23054d = 0;
            this.f23055e = -1;
            this.f23056f = -1;
            this.f23057g = 0;
            this.f23058h = 0;
            this.f23067q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W0.c.f14446d);
            this.f23053c = typedArrayObtainStyledAttributes.getInteger(W0.c.f14447e, 0);
            this.f23056f = typedArrayObtainStyledAttributes.getResourceId(W0.c.f14448f, -1);
            this.f23054d = typedArrayObtainStyledAttributes.getInteger(W0.c.f14449g, 0);
            this.f23055e = typedArrayObtainStyledAttributes.getInteger(W0.c.f14453k, -1);
            this.f23057g = typedArrayObtainStyledAttributes.getInt(W0.c.f14452j, 0);
            this.f23058h = typedArrayObtainStyledAttributes.getInt(W0.c.f14451i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(W0.c.f14450h);
            this.f23052b = zHasValue;
            if (zHasValue) {
                this.f23051a = CoordinatorLayout.M(context, attributeSet, typedArrayObtainStyledAttributes.getString(W0.c.f14450h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f23051a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23052b = false;
            this.f23053c = 0;
            this.f23054d = 0;
            this.f23055e = -1;
            this.f23056f = -1;
            this.f23057g = 0;
            this.f23058h = 0;
            this.f23067q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f23052b = false;
            this.f23053c = 0;
            this.f23054d = 0;
            this.f23055e = -1;
            this.f23056f = -1;
            this.f23057g = 0;
            this.f23058h = 0;
            this.f23067q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f23052b = false;
            this.f23053c = 0;
            this.f23054d = 0;
            this.f23055e = -1;
            this.f23056f = -1;
            this.f23057g = 0;
            this.f23058h = 0;
            this.f23067q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f23056f);
            this.f23061k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f23062l = null;
                    this.f23061k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f23056f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f23062l = null;
                this.f23061k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f23062l = null;
                    this.f23061k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f23062l = viewFindViewById;
        }

        private boolean r(View view, int i10) {
            int iB = AbstractC1929s.b(((f) view.getLayoutParams()).f23057g, i10);
            return iB != 0 && (AbstractC1929s.b(this.f23058h, i10) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f23061k.getId() != this.f23056f) {
                return false;
            }
            View view2 = this.f23061k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f23062l = null;
                    this.f23061k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f23062l = view2;
            return true;
        }

        boolean a() {
            return this.f23061k == null && this.f23056f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f23062l || r(view2, Z.z(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f23051a;
            return cVar != null && cVar.e(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f23051a == null) {
                this.f23063m = false;
            }
            return this.f23063m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f23056f == -1) {
                this.f23062l = null;
                this.f23061k = null;
                return null;
            }
            if (this.f23061k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f23061k;
        }

        public c e() {
            return this.f23051a;
        }

        boolean f() {
            return this.f23066p;
        }

        Rect g() {
            return this.f23067q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f23063m;
            if (z10) {
                return true;
            }
            c cVar = this.f23051a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z10;
            this.f23063m = zA;
            return zA;
        }

        boolean i(int i10) {
            if (i10 == 0) {
                return this.f23064n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f23065o;
        }

        void j() {
            this.f23066p = false;
        }

        void k(int i10) {
            q(i10, false);
        }

        void l() {
            this.f23063m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f23051a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f23051a = cVar;
                this.f23068r = null;
                this.f23052b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z10) {
            this.f23066p = z10;
        }

        void p(Rect rect) {
            this.f23067q.set(rect);
        }

        void q(int i10, boolean z10) {
            if (i10 == 0) {
                this.f23064n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f23065o = z10;
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.J(0);
            return true;
        }
    }

    protected static class h extends p325s1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray f23070c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f23070c = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f23070c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p325s1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f23070c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f23070c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f23070c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = Z.L(view);
            float fL2 = Z.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f23025t = r10 != null ? r10.getName() : null;
        f23028w = new i();
        f23026u = new Class[]{Context.class, AttributeSet.class};
        f23027v = new ThreadLocal();
        f23029x = new p199l1.f(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, W0.a.f14441a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i10);
        this.f23030a = new ArrayList();
        this.f23031b = new androidx.coordinatorlayout.widget.a();
        this.f23032c = new ArrayList();
        this.f23034e = new int[2];
        this.f23035f = new int[2];
        this.f23048s = new G(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, W0.c.f14443a, 0, W0.b.f14442a) : context.obtainStyledAttributes(attributeSet, W0.c.f14443a, i10, 0);
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            Z.k0(coordinatorLayout, context2, W0.c.f14443a, attributeSet, typedArrayObtainStyledAttributes, 0, W0.b.f14442a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            Z.k0(coordinatorLayout, context2, W0.c.f14443a, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(W0.c.f14444b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f23038i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f23038i.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f23038i;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f23045p = typedArrayObtainStyledAttributes.getDrawable(W0.c.f14445c);
        typedArrayObtainStyledAttributes.recycle();
        a0();
        super.setOnHierarchyChangeListener(new e());
        if (Z.x(this) == 0) {
            Z.v0(this, 1);
        }
    }

    private void A(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f23028w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean B(View view) {
        return this.f23031b.k(view);
    }

    private void D(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f23043n != null && Z.w(this) && !Z.w(view)) {
            rectA.left += this.f23043n.k();
            rectA.top += this.f23043n.m();
            rectA.right -= this.f23043n.l();
            rectA.bottom -= this.f23043n.j();
        }
        Rect rectA2 = a();
        AbstractC1929s.a(V(fVar.f23053c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        R(rectA);
        R(rectA2);
    }

    private void E(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            u(view2, rectA);
            v(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            R(rectA);
            R(rectA2);
        }
    }

    private void F(View view, int i10, int i11) {
        int i12;
        f fVar = (f) view.getLayoutParams();
        int iB = AbstractC1929s.b(W(fVar.f23053c), i11);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iX = x(i10) - measuredWidth;
        if (i13 == 1) {
            iX += measuredWidth / 2;
        } else if (i13 == 5) {
            iX += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iX, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent G(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void H(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (Z.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            R(rectA2);
            if (rectA.isEmpty()) {
                R(rectA);
                return;
            }
            int iB = AbstractC1929s.b(fVar.f23058h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f23060j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                Y(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f23060j) < (i14 = rect.bottom)) {
                Y(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                Y(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f23059i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                X(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f23059i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                X(view, width - i11);
            }
            if (!z12) {
                X(view, 0);
            }
            R(rectA);
        }
    }

    static c M(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f23025t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f23027v;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f23026u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean N(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean O(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f23032c;
        A(list);
        int size = list.size();
        MotionEvent motionEventG = null;
        boolean zN = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zN || z10) || actionMasked == 0) {
                if (!z10 && !zN && cVarE != null && (zN = N(cVarE, view, motionEvent, i10))) {
                    this.f23039j = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view2 = (View) list.get(i12);
                            c cVarE2 = ((f) view2.getLayoutParams()).e();
                            if (cVarE2 != null) {
                                if (motionEventG == null) {
                                    motionEventG = G(motionEvent);
                                }
                                N(cVarE2, view2, motionEventG, i10);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z10 = zH && !zC;
                if (zH && !z10) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventG == null) {
                    motionEventG = G(motionEvent);
                }
                N(cVarE, view, motionEventG, i10);
            }
        }
        list.clear();
        if (motionEventG != null) {
            motionEventG.recycle();
        }
        return zN;
    }

    private void P() {
        this.f23030a.clear();
        this.f23031b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarZ = z(childAt);
            fVarZ.d(this, childAt);
            this.f23031b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarZ.b(this, childAt, childAt2)) {
                        if (!this.f23031b.d(childAt2)) {
                            this.f23031b.b(childAt2);
                        }
                        this.f23031b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f23030a.addAll(this.f23031b.j());
        Collections.reverse(this.f23030a);
    }

    private static void R(Rect rect) {
        rect.setEmpty();
        f23029x.a(rect);
    }

    private void T() {
        View view = this.f23039j;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cVarE.D(this, this.f23039j, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f23039j = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).l();
        }
        this.f23036g = false;
    }

    private static int U(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int V(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int W(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void X(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f23059i;
        if (i11 != i10) {
            Z.W(view, i10 - i11);
            fVar.f23059i = i10;
        }
    }

    private void Y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f23060j;
        if (i11 != i10) {
            Z.X(view, i10 - i11);
            fVar.f23060j = i10;
        }
    }

    private static Rect a() {
        Rect rect = (Rect) f23029x.acquire();
        return rect == null ? new Rect() : rect;
    }

    private void a0() {
        if (!Z.w(this)) {
            Z.A0(this, null);
            return;
        }
        if (this.f23047r == null) {
            this.f23047r = new a();
        }
        Z.A0(this, this.f23047r);
        setSystemUiVisibility(1280);
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                cVarE.k(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int d(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void e(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private C0 f(C0 c10) {
        c cVarE;
        if (c10.q()) {
            return c10;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (Z.w(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                c10 = cVarE.f(this, childAt, c10);
                if (c10.q()) {
                    return c10;
                }
            }
        }
        return c10;
    }

    private void w(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iB = AbstractC1929s.b(U(fVar.f23053c), i10);
        int iB2 = AbstractC1929s.b(V(fVar.f23054d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int x(int i10) {
        int[] iArr = this.f23038i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public boolean C(View view, int i10, int i11) {
        Rect rectA = a();
        u(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            R(rectA);
        }
    }

    void I(View view, int i10) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f23061k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            u(fVar.f23061k, rectA);
            r(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            e(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                Z.W(view, i11);
            }
            if (i12 != 0) {
                Z.X(view, i12);
            }
            if (z10 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f23061k);
            }
            R(rectA);
            R(rectA2);
            R(rectA3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void J(int i10) {
        int i11;
        c cVarE;
        boolean zH;
        int iZ = Z.z(this);
        int size = this.f23030a.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f23030a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f23062l == ((View) this.f23030a.get(i13))) {
                        I(view, iZ);
                    }
                }
                r(view, true, rectA2);
                if (fVar.f23057g != 0 && !rectA2.isEmpty()) {
                    int iB = AbstractC1929s.b(fVar.f23057g, iZ);
                    int i14 = iB & 112;
                    if (i14 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i14 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i15 = iB & 7;
                    if (i15 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i15 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar.f23058h != 0 && view.getVisibility() == 0) {
                    H(view, rectA, iZ);
                }
                if (i10 != 2) {
                    y(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        Q(view, rectA2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = (View) this.f23030a.get(i11);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarE = fVar2.e();
                            if (cVarE == null && cVarE.e(this, view2, view)) {
                                if (i10 == 0 && fVar2.f()) {
                                    fVar2.j();
                                } else {
                                    if (i10 != 2) {
                                        zH = cVarE.h(this, view2, view);
                                    } else {
                                        cVarE.i(this, view2, view);
                                        zH = true;
                                    }
                                    if (i10 == 1) {
                                        fVar2.o(zH);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = (View) this.f23030a.get(i11);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarE = fVar3.e();
                        if (cVarE == null) {
                        }
                    }
                }
            }
        }
        R(rectA);
        R(rectA2);
        R(rectA3);
    }

    public void K(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f23061k;
        if (view2 != null) {
            E(view, view2, i10);
            return;
        }
        int i11 = fVar.f23055e;
        if (i11 >= 0) {
            F(view, i11, i10);
        } else {
            D(view, i10);
        }
    }

    public void L(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void Q(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void S() {
        if (this.f23037h && this.f23041l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f23041l);
        }
        this.f23042m = false;
    }

    final C0 Z(C0 c10) {
        if (p199l1.c.a(this.f23043n, c10)) {
            return c10;
        }
        this.f23043n = c10;
        boolean z10 = false;
        boolean z11 = c10 != null && c10.m() > 0;
        this.f23044o = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        C0 c0F = f(c10);
        requestLayout();
        return c0F;
    }

    void b() {
        if (this.f23037h) {
            if (this.f23041l == null) {
                this.f23041l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f23041l);
        }
        this.f23042m = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f23051a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f23033d == null) {
                    this.f23033d = new Paint();
                }
                this.f23033d.setColor(fVar.f23051a.c(this, view));
                this.f23033d.setAlpha(d(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f23033d);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f23045p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void g(View view) {
        ArrayList arrayListH = this.f23031b.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayListH.size(); i10++) {
            View view2 = (View) arrayListH.get(i10);
            c cVarE = ((f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.h(this, view2, view);
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        P();
        return Collections.unmodifiableList(this.f23030a);
    }

    public final C0 getLastWindowInsets() {
        return this.f23043n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f23048s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f23045p;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    void h() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (B(getChildAt(i10))) {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f23042m) {
            if (z10) {
                b();
            } else {
                S();
            }
        }
    }

    @Override // androidx.core.view.E
    public void i(View view, View view2, int i10, int i11) {
        c cVarE;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f23048s.c(view, view2, i10, i11);
        this.f23040k = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarE.v(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.E
    public void j(View view, int i10) {
        this.f23048s.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i10)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i10);
                }
                fVar.k(i10);
                fVar.j();
            }
        }
        this.f23040k = null;
    }

    @Override // androidx.core.view.E
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f23034e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, this.f23034e[0]) : Math.min(iMax, this.f23034e[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, this.f23034e[1]) : Math.min(iMax2, this.f23034e[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            J(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.F
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i14) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f23034e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, this.f23034e[0]) : Math.min(iMax, this.f23034e[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, this.f23034e[1]) : Math.min(iMax2, this.f23034e[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            J(1);
        }
    }

    @Override // androidx.core.view.E
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f23035f);
    }

    @Override // androidx.core.view.E
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i10, i11);
                    z10 |= zA;
                    fVar.q(i11, zA);
                } else {
                    fVar.q(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
        if (this.f23042m) {
            if (this.f23041l == null) {
                this.f23041l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f23041l);
        }
        if (this.f23043n == null && Z.w(this)) {
            Z.j0(this);
        }
        this.f23037h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T();
        if (this.f23042m && this.f23041l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f23041l);
        }
        View view = this.f23040k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f23037h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f23044o || this.f23045p == null) {
            return;
        }
        C0 c10 = this.f23043n;
        int iM = c10 != null ? c10.m() : 0;
        if (iM > 0) {
            this.f23045p.setBounds(0, 0, getWidth(), iM);
            this.f23045p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        boolean zO = O(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zO;
        }
        this.f23039j = null;
        T();
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarE;
        int iZ = Z.z(this);
        int size = this.f23030a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f23030a.get(i14);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iZ))) {
                K(view, iZ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarE;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.P();
        coordinatorLayout.h();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iZ = Z.z(coordinatorLayout);
        boolean z10 = iZ == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f23043n != null && Z.w(coordinatorLayout);
        int size3 = coordinatorLayout.f23030a.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = (View) coordinatorLayout.f23030a.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i18 = paddingLeft;
                i15 = iZ;
                suggestedMinimumWidth = i27;
                i22 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i28 = fVar.f23055e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iX = coordinatorLayout.x(i28);
                    int iB = AbstractC1929s.b(W(fVar.f23053c), iZ) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iB != 3 || z10) && !(iB == 5 && z10)) {
                        if ((iB == 5 && !z10) || (iB == 3 && z10)) {
                            iMax = Math.max(0, iX - paddingLeft);
                        }
                        if (z11 || Z.w(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iK = coordinatorLayout.f23043n.k() + coordinatorLayout.f23043n.l();
                            int iM = coordinatorLayout.f23043n.m() + coordinatorLayout.f23043n.j();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iK, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM, mode2);
                        }
                        cVarE = fVar.e();
                        if (cVarE != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            int i30 = i12;
                            i15 = iZ;
                            i16 = i30;
                            i18 = paddingLeft;
                            i19 = i27;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i31 = iMakeMeasureSpec2;
                            zM = cVarE.m(this, view, i29, i14, i31, 0);
                            i21 = i29;
                            i20 = i31;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i32 = i12;
                            i15 = iZ;
                            i16 = i32;
                            i17 = size3;
                            i18 = paddingLeft;
                            i19 = i27;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.L(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iX);
                    }
                    int i33 = i26;
                    i14 = iMax;
                    i13 = i33;
                    if (z11) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVarE = fVar.e();
                    if (cVarE != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        int i34 = i12;
                        i15 = iZ;
                        i16 = i34;
                        i18 = paddingLeft;
                        i19 = i27;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i35 = iMakeMeasureSpec2;
                        zM = cVarE.m(this, view, i210, i14, i35, 0);
                        i21 = i210;
                        i20 = i35;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i36 = i12;
                        i15 = iZ;
                        i16 = i36;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i27;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.L(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z11) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVarE = fVar.e();
                if (cVarE != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    int i37 = i12;
                    i15 = iZ;
                    i16 = i37;
                    i18 = paddingLeft;
                    i19 = i27;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zM = cVarE.m(this, view, i211, i14, i38, 0);
                    i21 = i211;
                    i20 = i38;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i39 = i12;
                    i15 = iZ;
                    i16 = i39;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i27;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.L(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i18;
            paddingRight = i22;
            iZ = i15;
            size3 = i17;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i11, i40 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c cVarE;
        View view2;
        float f12;
        float f13;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zN = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z11 = z10;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                    zN |= cVarE.n(this, childAt, view2, f12, f13, z11);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z10 = z11;
        }
        if (zN) {
            J(1);
        }
        return zN;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarE;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zO = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zO |= cVarE.o(this, childAt, view2, f12, f13);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f());
        SparseArray sparseArray = hVar.f23070c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarE = z(childAt).e();
            if (id2 != -1 && cVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id2 != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id2, parcelableY);
            }
        }
        hVar.f23070c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zO;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f23039j;
        boolean z10 = false;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            zO = cVarE != null ? cVarE.D(this, this.f23039j, motionEvent) : false;
        } else {
            zO = O(motionEvent, 1);
            if (actionMasked != 0 && zO) {
                z10 = true;
            }
        }
        if (this.f23039j == null || actionMasked == 3) {
            zO |= super.onTouchEvent(motionEvent);
        } else if (z10) {
            MotionEvent motionEventG = G(motionEvent);
            super.onTouchEvent(motionEventG);
            motionEventG.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zO;
        }
        this.f23039j = null;
        T();
        return zO;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void r(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f23036g) {
            return;
        }
        if (this.f23039j == null) {
            c();
        }
        T();
        this.f23036g = true;
    }

    public List s(View view) {
        List listI = this.f23031b.i(view);
        return listI == null ? Collections.EMPTY_LIST : listI;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        a0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f23046q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f23045p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f23045p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f23045p.setState(getDrawableState());
                }
                p038c1.a.m(this.f23045p, Z.z(this));
                this.f23045p.setVisible(getVisibility() == 0, false);
                this.f23045p.setCallback(this);
            }
            Z.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? Z0.b.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f23045p;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f23045p.setVisible(z10, false);
    }

    public List t(View view) {
        List listG = this.f23031b.g(view);
        return listG == null ? Collections.EMPTY_LIST : listG;
    }

    void u(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void v(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23045p;
    }

    void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f23052b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
                fVar.f23052b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.n((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.f23052b = true;
        }
        return fVar;
    }
}
