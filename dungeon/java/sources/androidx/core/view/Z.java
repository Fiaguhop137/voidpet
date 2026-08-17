package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap f23161a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f23162b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f23163c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f23164d = {X0.c.f15155b, X0.c.f15156c, X0.c.f15167n, X0.c.f15178y, X0.c.f15135B, X0.c.f15136C, X0.c.f15137D, X0.c.f15138E, X0.c.f15139F, X0.c.f15140G, X0.c.f15157d, X0.c.f15158e, X0.c.f15159f, X0.c.f15160g, X0.c.f15161h, X0.c.f15162i, X0.c.f15163j, X0.c.f15164k, X0.c.f15165l, X0.c.f15166m, X0.c.f15168o, X0.c.f15169p, X0.c.f15170q, X0.c.f15171r, X0.c.f15172s, X0.c.f15173t, X0.c.f15174u, X0.c.f15175v, X0.c.f15176w, X0.c.f15177x, X0.c.f15179z, X0.c.f15134A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final J f23165e = new Y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f23166f = new e();

    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.Z.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap f23167a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                Z.V(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f23167a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f23167a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f23167a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f23169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f23171d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class cls, int i11, int i12) {
            this.f23168a = i10;
            this.f23169b = cls;
            this.f23171d = i11;
            this.f23170c = i12;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f23170c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f23168a);
            if (this.f23169b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                Z.j(view);
                view.setTag(this.f23168a, obj);
                Z.V(view, this.f23171d);
            }
        }

        abstract boolean g(Object obj, Object obj2);
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return AbstractC1903e0.f23214b ? AbstractC1903e0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            C0 f23172a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f23173b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f23174c;

            a(View view, H h10) {
                this.f23173b = view;
                this.f23174c = h10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0 c0A = C0.A(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f23173b);
                    if (c0A.equals(this.f23172a)) {
                        return this.f23174c.a(view, c0A).y();
                    }
                }
                this.f23172a = c0A;
                C0 c0A2 = this.f23174c.a(view, c0A);
                if (i10 >= 30) {
                    return c0A2.y();
                }
                Z.j0(view);
                return c0A2.y();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(X0.c.f15153T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C0 b(View view, C0 c10, Rect rect) {
            WindowInsets windowInsetsY = c10.y();
            if (windowInsetsY != null) {
                return C0.A(view.computeSystemWindowInsets(windowInsetsY, rect), view);
            }
            rect.setEmpty();
            return c10;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getZ();
        }

        static boolean h(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void k(View view, float f10) {
            view.setElevation(f10);
        }

        static void l(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void m(View view, H h10) {
            a aVar = h10 != null ? new a(view, h10) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(X0.c.f15146M, aVar);
            }
            if (view.getTag(X0.c.f15145L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(X0.c.f15153T));
            }
        }

        static void n(View view, String str) {
            view.setTransitionName(str);
        }

        static void o(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static C0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0 c0Z = C0.z(rootWindowInsets);
            c0Z.v(c0Z);
            c0Z.d(view.getRootView());
            return c0Z;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static class n {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static c1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return c1.i(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1900d b(View view, C1900d c1900d) {
            ContentInfo contentInfoF = c1900d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c1900d : C1900d.g(contentInfoPerformReceiveContent);
        }
    }

    static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f23175d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f23176a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f23177b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f23178c = null;

        p() {
        }

        static p a(View view) {
            p pVar = (p) view.getTag(X0.c.f15151R);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(X0.c.f15151R, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f23176a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f23177b == null) {
                this.f23177b = new SparseArray();
            }
            return this.f23177b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(X0.c.f15152S);
            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f23176a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f23175d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f23176a == null) {
                        this.f23176a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f23175d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f23176a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f23176a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f23178c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f23178c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, H h10) {
        h.m(view, h10);
    }

    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(X0.c.f15148O);
    }

    public static void C0(View view, L l10) {
        j.a(view, (PointerIcon) (l10 != null ? l10.a() : null));
    }

    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, boolean z10) {
        l0().f(view, Boolean.valueOf(z10));
    }

    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static ViewParent F(View view) {
        return view.getParentForAccessibility();
    }

    public static void F0(View view, CharSequence charSequence) {
        I0().f(view, charSequence);
    }

    public static C0 G(View view) {
        return i.a(view);
    }

    public static void G0(View view, String str) {
        h.n(view, str);
    }

    public static CharSequence H(View view) {
        return (CharSequence) I0().e(view);
    }

    public static void H0(View view, C1923o0.b bVar) {
        C1923o0.e(view, bVar);
    }

    public static String I(View view) {
        return h.f(view);
    }

    private static f I0() {
        return new c(X0.c.f15150Q, CharSequence.class, 64, 30);
    }

    public static c1 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC1921n0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void J0(View view) {
        h.o(view);
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float L(View view) {
        return h.g(view);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    public static boolean N(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.h(view);
    }

    public static boolean T(View view) {
        return view.isPaddingRelative();
    }

    public static boolean U(View view) {
        Boolean bool = (Boolean) l0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void V(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(o(view));
                    w0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void W(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void X(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static C0 Y(View view, C0 c10) {
        WindowInsets windowInsetsY = c10.y();
        if (windowInsetsY != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsY);
            if (!windowInsetsB.equals(windowInsetsY)) {
                return C0.A(windowInsetsB, view);
            }
        }
        return c10;
    }

    public static void Z(View view, p217m1.B b10) {
        view.onInitializeAccessibilityNodeInfo(b10.r1());
    }

    public static /* synthetic */ C1900d a(C1900d c1900d) {
        return c1900d;
    }

    private static f a0() {
        return new b(X0.c.f15144K, CharSequence.class, 8, 28);
    }

    private static f b() {
        return new d(X0.c.f15143J, Boolean.class, 28);
    }

    public static boolean b0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static int c(View view, CharSequence charSequence, p217m1.E e10) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new m1.B.a(iQ, charSequence, e10));
        }
        return iQ;
    }

    public static C1900d c0(View view, C1900d c1900d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1900d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c1900d);
        }
        I i10 = (I) view.getTag(X0.c.f15147N);
        if (i10 == null) {
            return v(view).a(c1900d);
        }
        C1900d c1900dA = i10.a(view, c1900d);
        if (c1900dA == null) {
            return null;
        }
        return v(view).a(c1900dA);
    }

    private static void d(View view, m1.B.a aVar) {
        j(view);
        h0(aVar.b(), view);
        p(view).add(aVar);
        V(view, 0);
    }

    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static C1913j0 e(View view) {
        if (f23161a == null) {
            f23161a = new WeakHashMap();
        }
        C1913j0 c1913j0 = (C1913j0) f23161a.get(view);
        if (c1913j0 != null) {
            return c1913j0;
        }
        C1913j0 c1913j1 = new C1913j0(view);
        f23161a.put(view, c1913j1);
        return c1913j1;
    }

    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static C0 f(View view, C0 c10, Rect rect) {
        return h.b(view, c10, rect);
    }

    public static void f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static C0 g(View view, C0 c10) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsY = c10.y();
        if (windowInsetsY != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? n.a(view, windowInsetsY) : g.a(view, windowInsetsY);
            if (!windowInsetsA.equals(windowInsetsY)) {
                return C0.A(windowInsetsA, view);
            }
        }
        return c10;
    }

    public static void g0(View view, int i10) {
        h0(i10, view);
        V(view, 0);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    private static void h0(int i10, View view) {
        List listP = p(view);
        for (int i11 = 0; i11 < listP.size(); i11++) {
            if (((m1.B.a) listP.get(i11)).b() == i10) {
                listP.remove(i11);
                return;
            }
        }
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    public static void i0(View view, m1.B.a aVar, CharSequence charSequence, p217m1.E e10) {
        if (e10 == null && charSequence == null) {
            g0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, e10));
        }
    }

    static void j(View view) {
        C1894a c1894aL = l(view);
        if (c1894aL == null) {
            c1894aL = new C1894a();
        }
        m0(view, c1894aL);
    }

    public static void j0(View view) {
        g.c(view);
    }

    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static C1894a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof C1894a.C0279a ? ((C1894a.C0279a) accessibilityDelegateM).f23182a : new C1894a(accessibilityDelegateM);
    }

    private static f l0() {
        return new a(X0.c.f15149P, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static void m0(View view, C1894a c1894a) {
        if (c1894a == null && (m(view) instanceof C1894a.C0279a)) {
            c1894a = new C1894a();
        }
        w0(view);
        view.setAccessibilityDelegate(c1894a == null ? null : c1894a.d());
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f23163c) {
            return null;
        }
        if (f23162b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f23162b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f23163c = true;
                return null;
            }
        }
        try {
            Object obj = f23162b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f23163c = true;
            return null;
        }
    }

    public static void n0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static CharSequence o(View view) {
        return (CharSequence) a0().e(view);
    }

    public static void o0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    private static List p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(X0.c.f15141H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(X0.c.f15141H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, CharSequence charSequence) {
        a0().f(view, charSequence);
        if (charSequence != null) {
            f23166f.a(view);
        } else {
            f23166f.d(view);
        }
    }

    private static int q(View view, CharSequence charSequence) {
        List listP = p(view);
        for (int i10 = 0; i10 < listP.size(); i10++) {
            if (TextUtils.equals(charSequence, ((m1.B.a) listP.get(i10)).c())) {
                return ((m1.B.a) listP.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f23164d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listP.size(); i14++) {
                z10 &= ((m1.B.a) listP.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, ColorStateList colorStateList) {
        h.i(view, colorStateList);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, PorterDuff.Mode mode) {
        h.j(view, mode);
    }

    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view, float f10) {
        h.k(view, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static J v(View view) {
        return view instanceof J ? (J) view : f23165e;
    }

    public static void v0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    private static void w0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    public static void x0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i10);
        }
    }

    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    public static void y0(View view, int i10) {
        view.setLabelFor(i10);
    }

    public static int z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, boolean z10) {
        h.l(view, z10);
    }
}
