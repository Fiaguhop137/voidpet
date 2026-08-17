package p324s0;

import F0.AbstractC0974h;
import F0.InterfaceC0973g;
import G0.I;
import O0.d;
import O0.t;
import W.G;
import W.H;
import W.InterfaceC1589k;
import Y.c;
import android.view.View;
import androidx.compose.ui.layout.p;
import androidx.compose.ui.platform.InterfaceC1859i;
import androidx.compose.ui.platform.InterfaceC1868m0;
import androidx.compose.ui.platform.InterfaceC1870n0;
import androidx.compose.ui.platform.X0;
import androidx.compose.ui.platform.Z0;
import androidx.compose.ui.platform.e1;
import androidx.compose.ui.platform.j1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p001a0.j;
import p037c0.f0;
import p091f0.C3406c;
import p216m0.O;
import p216m0.w;
import p450z0.u;

/* JADX INFO: loaded from: classes.dex */
public interface o0 extends O {

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public static final a f53190E1 = a.f53191a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f53191a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static boolean f53192b;

        private a() {
        }

        public final boolean a() {
            return f53192b;
        }
    }

    public interface b {
        void j();
    }

    static /* synthetic */ n0 d(o0 o0Var, Function2 function2, Function0 function0, C3406c c3406c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            c3406c = null;
        }
        return o0Var.g(function2, function0, c3406c);
    }

    static /* synthetic */ void i(o0 o0Var, I i10, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        o0Var.e(i10, z10, z11, z12);
    }

    static /* synthetic */ void l(o0 o0Var, I i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        o0Var.u(i10, z10);
    }

    static /* synthetic */ void o(o0 o0Var, I i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        o0Var.E(i10, z10, z11);
    }

    static /* synthetic */ void r(o0 o0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        o0Var.c(z10);
    }

    void B();

    void C(I i10);

    void D();

    void E(I i10, boolean z10, boolean z11);

    void c(boolean z10);

    void e(I i10, boolean z10, boolean z11, boolean z12);

    n0 g(Function2 function2, Function0 function0, C3406c c3406c);

    InterfaceC1859i getAccessibilityManager();

    InterfaceC1589k getAutofill();

    G getAutofillManager();

    H getAutofillTree();

    InterfaceC1868m0 getClipboard();

    InterfaceC1870n0 getClipboardManager();

    CoroutineContext getCoroutineContext();

    d getDensity();

    c getDragAndDropManager();

    j getFocusOwner();

    AbstractC0974h.b getFontFamilyResolver();

    InterfaceC0973g getFontLoader();

    f0 getGraphicsContext();

    p127h0.a getHapticFeedBack();

    p145i0.b getInputModeManager();

    t getLayoutDirection();

    m0 getOutOfFrameExecutor();

    p.a getPlacementScope();

    w getPointerIconService();

    A0.b getRectManager();

    I getRoot();

    u getSemanticsOwner();

    K getSharedDrawScope();

    boolean getShowLayoutBounds();

    q0 getSnapshotObserver();

    X0 getSoftwareKeyboardController();

    I getTextInputService();

    Z0 getTextToolbar();

    e1 getViewConfiguration();

    j1 getWindowInfo();

    long h(long j10);

    void j(View view);

    void k(I i10);

    void n(I i10, int i11);

    void p(I i10, int i11);

    void s(I i10);

    void setShowLayoutBounds(boolean z10);

    void t(float f10);

    void u(I i10, boolean z10);

    void v(I i10);

    void w(I i10);

    void x(Function0 function0);

    void y(I i10);
}
