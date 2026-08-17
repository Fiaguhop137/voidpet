package p217m1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f48932d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f48933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48934b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48935c = -1;

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f48936A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f48937B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f48938C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f48939D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f48940E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f48941F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f48942G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f48943H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f48944I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f48945J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f48946K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f48947L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f48948M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f48949N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f48950O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f48951P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f48952Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final a f48953R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final a f48954S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final a f48955T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final a f48956U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final a f48957V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f48958e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f48959f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f48960g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f48961h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f48962i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f48963j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f48964k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f48965l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f48966m = new a(256, (CharSequence) null, E.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f48967n = new a(512, (CharSequence) null, E.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f48968o = new a(1024, (CharSequence) null, E.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f48969p = new a(2048, (CharSequence) null, E.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f48970q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f48971r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f48972s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f48973t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f48974u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f48975v = new a(131072, (CharSequence) null, E.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f48976w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f48977x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f48978y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f48979z = new a(2097152, (CharSequence) null, E.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f48982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final E f48983d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f48936A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            f48937B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, E.e.class);
            f48938C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            f48939D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            f48940E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            f48941F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            f48942G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            f48943H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            f48944I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            f48945J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            f48946K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            f48947L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, E.f.class);
            f48948M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, E.d.class);
            f48949N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            f48950O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            f48951P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            f48952Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
            f48953R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            f48954S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            f48955T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
            f48956U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
            f48957V = new a(i10 >= 34 ? d.a() : null, 16908382, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(int i10, CharSequence charSequence, E e10) {
            this(null, i10, charSequence, e10, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, E e10, Class cls) {
            this.f48981b = i10;
            this.f48983d = e10;
            if (obj == null) {
                this.f48980a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f48980a = obj;
            }
            this.f48982c = cls;
        }

        public a a(CharSequence charSequence, E e10) {
            return new a(null, this.f48981b, charSequence, e10, this.f48982c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f48980a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f48980a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f48983d == null) {
                return false;
            }
            Class cls = this.f48982c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f48982c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f48983d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f48980a;
            if (obj2 == null) {
                return aVar.f48980a == null;
            }
            return obj2.equals(aVar.f48980a);
        }

        public int hashCode() {
            Object obj = this.f48980a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strJ = B.j(this.f48981b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb2.append(strJ);
            return sb2.toString();
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }
    }

    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48984a;

        f(Object obj) {
            this.f48984a = obj;
        }

        public static f a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48985a;

        g(Object obj) {
            this.f48985a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static g b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48986a;

        h(Object obj) {
            this.f48986a = obj;
        }

        public static h d(int i10, float f10, float f11, float f12) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f48986a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f48986a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f48986a).getMin();
        }
    }

    private B(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f48933a = accessibilityNodeInfo;
    }

    private SparseArray E(View view) {
        SparseArray sparseArrayH = H(view);
        if (sparseArrayH != null) {
            return sparseArrayH;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(X0.c.f15142I, sparseArray);
        return sparseArray;
    }

    private SparseArray H(View view) {
        return (SparseArray) view.getTag(X0.c.f15142I);
    }

    private boolean O() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int P(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f48932d;
        f48932d = i11 + 1;
        return i11;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void g() {
        this.f48933a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f48933a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f48933a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f48933a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f48933a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f48933a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static B k0() {
        return s1(AccessibilityNodeInfo.obtain());
    }

    private boolean l(int i10) {
        Bundle bundleA = A();
        return bundleA != null && (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static B l0(View view) {
        return s1(AccessibilityNodeInfo.obtain(view));
    }

    public static B m0(B b10) {
        return s1(AccessibilityNodeInfo.obtain(b10.f48933a));
    }

    private String q() {
        int iP = p();
        if (iP == 1) {
            return "TRUE";
        }
        return iP == 2 ? "PARTIAL" : "FALSE";
    }

    private void q0(View view) {
        SparseArray sparseArrayH = H(view);
        if (sparseArrayH != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayH.size(); i10++) {
                if (((WeakReference) sparseArrayH.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayH.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public static B s1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new B(accessibilityNodeInfo);
    }

    public static ClickableSpan[] t(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private void u0(int i10, boolean z10) {
        Bundle bundleA = A();
        if (bundleA != null) {
            int i11 = bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleA.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    static String z(int i10) {
        if (i10 == 0) {
            return "UNDEFINED";
        }
        if (i10 == 1) {
            return "COLLAPSED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN" : "FULL";
        }
        return "PARTIAL";
    }

    public Bundle A() {
        return this.f48933a.getExtras();
    }

    public void A0(boolean z10) {
        this.f48933a.setClickable(z10);
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 26 ? this.f48933a.getHintText() : this.f48933a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public void B0(Object obj) {
        this.f48933a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f48984a);
    }

    public int C() {
        return this.f48933a.getMaxTextLength();
    }

    public void C0(Object obj) {
        this.f48933a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f48985a);
    }

    public int D() {
        return this.f48933a.getMovementGranularities();
    }

    public void D0(CharSequence charSequence) {
        this.f48933a.setContentDescription(charSequence);
    }

    public void E0(boolean z10) {
        this.f48933a.setContentInvalid(z10);
    }

    public CharSequence F() {
        return this.f48933a.getPackageName();
    }

    public void F0(int i10) {
        this.f48933a.setDrawingOrder(i10);
    }

    public h G() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f48933a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    public void G0(boolean z10) {
        this.f48933a.setEditable(z10);
    }

    public void H0(boolean z10) {
        this.f48933a.setEnabled(z10);
    }

    public CharSequence I() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f48933a) : this.f48933a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void I0(CharSequence charSequence) {
        this.f48933a.setError(charSequence);
    }

    public CharSequence J() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f48933a) : this.f48933a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void J0(boolean z10) {
        this.f48933a.setFocusable(z10);
    }

    public CharSequence K() {
        if (!O()) {
            return this.f48933a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f48933a.getText(), 0, this.f48933a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new C3999a(((Integer) listH4.get(i10)).intValue(), this, A().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i10)).intValue(), ((Integer) listH2.get(i10)).intValue(), ((Integer) listH3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void K0(boolean z10) {
        this.f48933a.setFocused(z10);
    }

    public CharSequence L() {
        return Build.VERSION.SDK_INT >= 28 ? this.f48933a.getTooltipText() : this.f48933a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void L0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f48933a.setHeading(z10);
        } else {
            u0(2, z10);
        }
    }

    public String M() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f48933a) : this.f48933a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void M0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f48933a.setHintText(charSequence);
        } else {
            this.f48933a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String N() {
        return this.f48933a.getViewIdResourceName();
    }

    public void N0(boolean z10) {
        this.f48933a.setImportantForAccessibility(z10);
    }

    public void O0(View view) {
        this.f48933a.setLabelFor(view);
    }

    public void P0(View view) {
        this.f48933a.setLabeledBy(view);
    }

    public boolean Q() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f48933a) : l(64);
    }

    public void Q0(int i10) {
        this.f48933a.setLiveRegion(i10);
    }

    public boolean R() {
        return this.f48933a.isAccessibilityFocused();
    }

    public void R0(boolean z10) {
        this.f48933a.setLongClickable(z10);
    }

    public boolean S() {
        return this.f48933a.isCheckable();
    }

    public void S0(int i10) {
        this.f48933a.setMaxTextLength(i10);
    }

    public boolean T() {
        return this.f48933a.isChecked();
    }

    public void T0(int i10) {
        this.f48933a.setMovementGranularities(i10);
    }

    public boolean U() {
        return this.f48933a.isClickable();
    }

    public void U0(CharSequence charSequence) {
        this.f48933a.setPackageName(charSequence);
    }

    public boolean V() {
        return this.f48933a.isContextClickable();
    }

    public void V0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f48933a.setPaneTitle(charSequence);
        } else {
            this.f48933a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean W() {
        return this.f48933a.isEnabled();
    }

    public void W0(View view) {
        this.f48934b = -1;
        this.f48933a.setParent(view);
    }

    public boolean X() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f48933a) : this.f48933a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void X0(View view, int i10) {
        this.f48934b = i10;
        this.f48933a.setParent(view, i10);
    }

    public boolean Y() {
        return this.f48933a.isFocusable();
    }

    public void Y0(boolean z10) {
        this.f48933a.setPassword(z10);
    }

    public boolean Z() {
        return this.f48933a.isFocused();
    }

    public void Z0(h hVar) {
        this.f48933a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f48986a);
    }

    public void a(int i10) {
        this.f48933a.addAction(i10);
    }

    public boolean a0() {
        return l(67108864);
    }

    public void a1(CharSequence charSequence) {
        this.f48933a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void b(a aVar) {
        this.f48933a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f48980a);
    }

    public boolean b0() {
        return this.f48933a.isImportantForAccessibility();
    }

    public void b1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f48933a.setScreenReaderFocusable(z10);
        } else {
            u0(1, z10);
        }
    }

    public void c(View view) {
        this.f48933a.addChild(view);
    }

    public boolean c0() {
        return this.f48933a.isLongClickable();
    }

    public void c1(boolean z10) {
        this.f48933a.setScrollable(z10);
    }

    public void d(View view, int i10) {
        this.f48933a.addChild(view, i10);
    }

    public boolean d0() {
        return this.f48933a.isPassword();
    }

    public void d1(boolean z10) {
        this.f48933a.setSelected(z10);
    }

    public boolean e0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f48933a.isScreenReaderFocusable() : l(1);
    }

    public void e1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f48933a.setShowingHintText(z10);
        } else {
            u0(4, z10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f48933a;
        if (accessibilityNodeInfo == null) {
            if (b10.f48933a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(b10.f48933a)) {
            return false;
        }
        return this.f48935c == b10.f48935c && this.f48934b == b10.f48934b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            q0(view);
            ClickableSpan[] clickableSpanArrT = t(charSequence);
            if (clickableSpanArrT == null || clickableSpanArrT.length <= 0) {
                return;
            }
            A().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", X0.c.f15154a);
            SparseArray sparseArrayE = E(view);
            for (int i10 = 0; i10 < clickableSpanArrT.length; i10++) {
                int iP = P(clickableSpanArrT[i10], sparseArrayE);
                sparseArrayE.put(iP, new WeakReference(clickableSpanArrT[i10]));
                e(clickableSpanArrT[i10], (Spanned) charSequence, iP);
            }
        }
    }

    public boolean f0() {
        return this.f48933a.isScrollable();
    }

    public void f1(View view) {
        this.f48935c = -1;
        this.f48933a.setSource(view);
    }

    public boolean g0() {
        return this.f48933a.isSelected();
    }

    public void g1(View view, int i10) {
        this.f48935c = i10;
        this.f48933a.setSource(view, i10);
    }

    public boolean h0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f48933a.isShowingHintText() : l(4);
    }

    public void h1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f48933a, charSequence);
        } else {
            this.f48933a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f48933a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f48933a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f48933a) : l(8388608);
    }

    public void i1(CharSequence charSequence) {
        this.f48933a.setText(charSequence);
    }

    public boolean j0() {
        return this.f48933a.isVisibleToUser();
    }

    public void j1(int i10, int i11) {
        this.f48933a.setTextSelection(i10, i11);
    }

    public int k() {
        return this.f48933a.getActions();
    }

    public void k1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f48933a.setTooltipText(charSequence);
        } else {
            this.f48933a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void l1(View view) {
        this.f48933a.setTraversalAfter(view);
    }

    public void m(Rect rect) {
        this.f48933a.getBoundsInParent(rect);
    }

    public void m1(View view, int i10) {
        this.f48933a.setTraversalAfter(view, i10);
    }

    public void n(Rect rect) {
        this.f48933a.getBoundsInScreen(rect);
    }

    public boolean n0(int i10, Bundle bundle) {
        return this.f48933a.performAction(i10, bundle);
    }

    public void n1(View view) {
        this.f48933a.setTraversalBefore(view);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f48933a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f48933a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0() {
    }

    public void o1(View view, int i10) {
        this.f48933a.setTraversalBefore(view, i10);
    }

    public int p() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f48933a) : this.f48933a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f48933a.isChecked() ? 1 : 0);
    }

    public boolean p0(a aVar) {
        return this.f48933a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f48980a);
    }

    public void p1(String str) {
        this.f48933a.setViewIdResourceName(str);
    }

    public void q1(boolean z10) {
        this.f48933a.setVisibleToUser(z10);
    }

    public int r() {
        return this.f48933a.getChildCount();
    }

    public void r0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.e(this.f48933a, z10);
        } else {
            u0(64, z10);
        }
    }

    public AccessibilityNodeInfo r1() {
        return this.f48933a;
    }

    public CharSequence s() {
        return this.f48933a.getClassName();
    }

    public void s0(boolean z10) {
        this.f48933a.setAccessibilityFocused(z10);
    }

    public void t0(List list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f48933a.setAvailableExtraData(list);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(F());
        sb2.append("; className: ");
        sb2.append(s());
        sb2.append("; text: ");
        sb2.append(K());
        sb2.append("; error: ");
        sb2.append(x());
        sb2.append("; maxTextLength: ");
        sb2.append(C());
        sb2.append("; stateDescription: ");
        sb2.append(I());
        sb2.append("; contentDescription: ");
        sb2.append(w());
        sb2.append("; supplementalDescription: ");
        sb2.append(J());
        sb2.append("; tooltipText: ");
        sb2.append(L());
        sb2.append("; viewIdResName: ");
        sb2.append(N());
        sb2.append("; uniqueId: ");
        sb2.append(M());
        sb2.append("; checkable: ");
        sb2.append(S());
        sb2.append("; checked: ");
        sb2.append(q());
        sb2.append("; fieldRequired: ");
        sb2.append(X());
        sb2.append("; focusable: ");
        sb2.append(Y());
        sb2.append("; focused: ");
        sb2.append(Z());
        sb2.append("; selected: ");
        sb2.append(g0());
        sb2.append("; clickable: ");
        sb2.append(U());
        sb2.append("; longClickable: ");
        sb2.append(c0());
        sb2.append("; contextClickable: ");
        sb2.append(V());
        sb2.append("; expandedState: ");
        sb2.append(z(y()));
        sb2.append("; enabled: ");
        sb2.append(W());
        sb2.append("; password: ");
        sb2.append(d0());
        sb2.append("; scrollable: " + f0());
        sb2.append("; containerTitle: ");
        sb2.append(v());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(a0());
        sb2.append("; importantForAccessibility: ");
        sb2.append(b0());
        sb2.append("; visible: ");
        sb2.append(j0());
        sb2.append("; isTextSelectable: ");
        sb2.append(i0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(Q());
        sb2.append("; [");
        List listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = (a) listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb2.append(strJ);
            if (i10 != listI.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public f u() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f48933a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f48933a) : this.f48933a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void v0(Rect rect) {
        this.f48933a.setBoundsInParent(rect);
    }

    public CharSequence w() {
        return this.f48933a.getContentDescription();
    }

    public void w0(Rect rect) {
        this.f48933a.setBoundsInScreen(rect);
    }

    public CharSequence x() {
        return this.f48933a.getError();
    }

    public void x0(boolean z10) {
        this.f48933a.setCheckable(z10);
    }

    public int y() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f48933a) : this.f48933a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void y0(boolean z10) {
        this.f48933a.setChecked(z10);
    }

    public void z0(CharSequence charSequence) {
        this.f48933a.setClassName(charSequence);
    }
}
