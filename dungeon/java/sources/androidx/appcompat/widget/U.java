package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class U implements p233n.e {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static Method f20791G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static Method f20792H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Runnable f20793A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final Handler f20794B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Rect f20795C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Rect f20796D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f20797E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    PopupWindow f20798F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f20800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    P f20801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f20813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f20814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DataSetObserver f20816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f20817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f20818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f20819u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f20820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final i f20821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final h f20822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g f20823y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e f20824z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = U.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            U.this.c();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            P p10;
            if (i10 == -1 || (p10 = U.this.f20801c) == null) {
                return;
            }
            p10.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            U.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (U.this.a()) {
                U.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            U.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || U.this.A() || U.this.f20798F.getContentView() == null) {
                return;
            }
            U u10 = U.this;
            u10.f20794B.removeCallbacks(u10.f20821w);
            U.this.f20821w.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = U.this.f20798F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < U.this.f20798F.getWidth() && y10 >= 0 && y10 < U.this.f20798F.getHeight()) {
                U u10 = U.this;
                u10.f20794B.postDelayed(u10.f20821w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            U u11 = U.this;
            u11.f20794B.removeCallbacks(u11.f20821w);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P p10 = U.this.f20801c;
            if (p10 == null || !p10.isAttachedToWindow() || U.this.f20801c.getCount() <= U.this.f20801c.getChildCount()) {
                return;
            }
            int childCount = U.this.f20801c.getChildCount();
            U u10 = U.this;
            if (childCount <= u10.f20813o) {
                u10.f20798F.setInputMethodMode(2);
                U.this.c();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f20791G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f20792H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public U(Context context) {
        this(context, null, p144i.a.f43062C);
    }

    public U(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public U(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f20802d = -2;
        this.f20803e = -2;
        this.f20806h = 1002;
        this.f20810l = 0;
        this.f20811m = false;
        this.f20812n = false;
        this.f20813o = Integer.MAX_VALUE;
        this.f20815q = 0;
        this.f20821w = new i();
        this.f20822x = new h();
        this.f20823y = new g();
        this.f20824z = new e();
        this.f20795C = new Rect();
        this.f20799a = context;
        this.f20794B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p144i.j.f43426l1, i10, i11);
        this.f20804f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p144i.j.f43431m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p144i.j.f43436n1, 0);
        this.f20805g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f20807i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1831t c1831t = new C1831t(context, attributeSet, i10, i11);
        this.f20798F = c1831t;
        c1831t.setInputMethodMode(1);
    }

    private void C() {
        View view = this.f20814p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f20814p);
            }
        }
    }

    private void O(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f20798F, z10);
            return;
        }
        Method method = f20791G;
        if (method != null) {
            try {
                method.invoke(this.f20798F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f20801c == null) {
            Context context = this.f20799a;
            this.f20793A = new a();
            P pS = s(context, !this.f20797E);
            this.f20801c = pS;
            Drawable drawable = this.f20818t;
            if (drawable != null) {
                pS.setSelector(drawable);
            }
            this.f20801c.setAdapter(this.f20800b);
            this.f20801c.setOnItemClickListener(this.f20819u);
            this.f20801c.setFocusable(true);
            this.f20801c.setFocusableInTouchMode(true);
            this.f20801c.setOnItemSelectedListener(new b());
            this.f20801c.setOnScrollListener(this.f20823y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f20820v;
            if (onItemSelectedListener != null) {
                this.f20801c.setOnItemSelectedListener(onItemSelectedListener);
            }
            P p10 = this.f20801c;
            View view2 = this.f20814p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f20815q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(p10, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f20815q);
                } else {
                    linearLayout.addView(p10, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f20803e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = p10;
            }
            this.f20798F.setContentView(view);
        } else {
            View view3 = this.f20814p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f20798F.getBackground();
        if (background != null) {
            background.getPadding(this.f20795C);
            Rect rect = this.f20795C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f20807i) {
                this.f20805g = -i14;
            }
        } else {
            this.f20795C.setEmpty();
            i10 = 0;
        }
        int iU = u(t(), this.f20805g, this.f20798F.getInputMethodMode() == 2);
        if (this.f20811m || this.f20802d == -1) {
            return iU + i10;
        }
        int i15 = this.f20803e;
        if (i15 == -2) {
            int i16 = this.f20799a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f20795C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f20799a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f20795C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f20801c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f20801c.getPaddingTop() + this.f20801c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.f20798F, view, i10, z10);
    }

    public boolean A() {
        return this.f20798F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f20797E;
    }

    public void D(View view) {
        this.f20817s = view;
    }

    public void E(int i10) {
        this.f20798F.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f20798F.getBackground();
        if (background == null) {
            R(i10);
            return;
        }
        background.getPadding(this.f20795C);
        Rect rect = this.f20795C;
        this.f20803e = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f20810l = i10;
    }

    public void H(Rect rect) {
        this.f20796D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f20798F.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f20797E = z10;
        this.f20798F.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f20798F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f20819u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f20820v = onItemSelectedListener;
    }

    public void N(boolean z10) {
        this.f20809k = true;
        this.f20808j = z10;
    }

    public void P(int i10) {
        this.f20815q = i10;
    }

    public void Q(int i10) {
        P p10 = this.f20801c;
        if (!a() || p10 == null) {
            return;
        }
        p10.setListSelectionHidden(false);
        p10.setSelection(i10);
        if (p10.getChoiceMode() != 0) {
            p10.setItemChecked(i10, true);
        }
    }

    public void R(int i10) {
        this.f20803e = i10;
    }

    @Override // p233n.e
    public boolean a() {
        return this.f20798F.isShowing();
    }

    public int b() {
        return this.f20804f;
    }

    @Override // p233n.e
    public void c() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.h.b(this.f20798F, this.f20806h);
        if (this.f20798F.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f20803e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i10 = this.f20802d;
                if (i10 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f20798F.setWidth(this.f20803e == -1 ? -1 : 0);
                        this.f20798F.setHeight(0);
                    } else {
                        this.f20798F.setWidth(this.f20803e == -1 ? -1 : 0);
                        this.f20798F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.f20798F.setOutsideTouchable((this.f20812n || this.f20811m) ? false : true);
                this.f20798F.update(t(), this.f20804f, this.f20805g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f20803e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i11 = this.f20802d;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.f20798F.setWidth(width2);
        this.f20798F.setHeight(iQ);
        O(true);
        this.f20798F.setOutsideTouchable((this.f20812n || this.f20811m) ? false : true);
        this.f20798F.setTouchInterceptor(this.f20822x);
        if (this.f20809k) {
            androidx.core.widget.h.a(this.f20798F, this.f20808j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f20792H;
            if (method != null) {
                try {
                    method.invoke(this.f20798F, this.f20796D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f20798F, this.f20796D);
        }
        androidx.core.widget.h.c(this.f20798F, t(), this.f20804f, this.f20805g, this.f20810l);
        this.f20801c.setSelection(-1);
        if (!this.f20797E || this.f20801c.isInTouchMode()) {
            r();
        }
        if (this.f20797E) {
            return;
        }
        this.f20794B.post(this.f20824z);
    }

    @Override // p233n.e
    public void dismiss() {
        this.f20798F.dismiss();
        C();
        this.f20798F.setContentView(null);
        this.f20801c = null;
        this.f20794B.removeCallbacks(this.f20821w);
    }

    public void e(int i10) {
        this.f20804f = i10;
    }

    public Drawable g() {
        return this.f20798F.getBackground();
    }

    public void i(int i10) {
        this.f20805g = i10;
        this.f20807i = true;
    }

    public int l() {
        if (this.f20807i) {
            return this.f20805g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f20816r;
        if (dataSetObserver == null) {
            this.f20816r = new f();
        } else {
            ListAdapter listAdapter2 = this.f20800b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f20800b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f20816r);
        }
        P p10 = this.f20801c;
        if (p10 != null) {
            p10.setAdapter(this.f20800b);
        }
    }

    @Override // p233n.e
    public ListView o() {
        return this.f20801c;
    }

    public void p(Drawable drawable) {
        this.f20798F.setBackgroundDrawable(drawable);
    }

    public void r() {
        P p10 = this.f20801c;
        if (p10 != null) {
            p10.setListSelectionHidden(true);
            p10.requestLayout();
        }
    }

    P s(Context context, boolean z10) {
        return new P(context, z10);
    }

    public View t() {
        return this.f20817s;
    }

    public Object v() {
        if (a()) {
            return this.f20801c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f20801c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f20801c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f20801c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f20803e;
    }
}
