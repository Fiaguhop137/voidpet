package androidx.compose.ui.platform;

import I.AbstractC1083w;
import I.AbstractC1089y;
import I.C1056m1;
import I.InterfaceC1054m;
import I.InterfaceC1086x;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1843a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f21973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder f21974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1086x f21975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC1089y f21976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function0 f21977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21980h;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    static final class C0263a extends kotlin.jvm.internal.o implements Function2 {
        C0263a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC1054m) obj, ((Number) obj2).intValue());
            return Unit.f48228a;
        }

        public final void invoke(InterfaceC1054m interfaceC1054m, int i10) {
            if (!interfaceC1054m.o((i10 & 3) != 2, i10 & 1)) {
                interfaceC1054m.L();
                return;
            }
            if (AbstractC1083w.L()) {
                AbstractC1083w.U(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:249)");
            }
            AbstractC1843a.this.a(interfaceC1054m, 0);
            if (AbstractC1083w.L()) {
                AbstractC1083w.T();
            }
        }
    }

    public AbstractC1843a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.f21977e = c1.f21996a.a().a(this);
    }

    private final AbstractC1089y b(AbstractC1089y abstractC1089y) {
        AbstractC1089y abstractC1089y2 = i(abstractC1089y) ? abstractC1089y : null;
        if (abstractC1089y2 != null) {
            this.f21973a = new WeakReference(abstractC1089y2);
        }
        return abstractC1089y;
    }

    private final void c() {
        if (this.f21979g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.f21975c == null) {
            try {
                this.f21979g = true;
                this.f21975c = s1.c(this, j(), Q.h.c(-656146368, true, new C0263a()));
            } finally {
                this.f21979g = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean i(AbstractC1089y abstractC1089y) {
        return !(abstractC1089y instanceof C1056m1) || ((C1056m1.d) ((C1056m1) abstractC1089y).n0().getValue()).compareTo(C1056m1.d.ShuttingDown) > 0;
    }

    private final AbstractC1089y j() {
        AbstractC1089y abstractC1089y;
        AbstractC1089y abstractC1089yB = this.f21976d;
        if (abstractC1089yB == null) {
            AbstractC1089y abstractC1089yD = o1.d(this);
            AbstractC1089y abstractC1089y2 = null;
            abstractC1089yB = abstractC1089yD != null ? b(abstractC1089yD) : null;
            if (abstractC1089yB == null) {
                WeakReference weakReference = this.f21973a;
                if (weakReference != null && (abstractC1089y = (AbstractC1089y) weakReference.get()) != null && i(abstractC1089y)) {
                    abstractC1089y2 = abstractC1089y;
                }
                return abstractC1089y2 == null ? b(o1.h(this)) : abstractC1089y2;
            }
        }
        return abstractC1089yB;
    }

    private final void setParentContext(AbstractC1089y abstractC1089y) {
        if (this.f21976d != abstractC1089y) {
            this.f21976d = abstractC1089y;
            if (abstractC1089y != null) {
                this.f21973a = null;
            }
            InterfaceC1086x interfaceC1086x = this.f21975c;
            if (interfaceC1086x != null) {
                interfaceC1086x.dispose();
                this.f21975c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f21974b != iBinder) {
            this.f21974b = iBinder;
            this.f21973a = null;
        }
    }

    public abstract void a(InterfaceC1054m interfaceC1054m, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    public final void d() {
        if (this.f21976d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        InterfaceC1086x interfaceC1086x = this.f21975c;
        if (interfaceC1086x != null) {
            interfaceC1086x.dispose();
        }
        this.f21975c = null;
        requestLayout();
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f21975c != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f21978f;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f21980h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(@Nullable AbstractC1089y abstractC1089y) {
        setParentContext(abstractC1089y);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f21978f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((p324s0.o0) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f21980h = true;
    }

    public final void setViewCompositionStrategy(@NotNull c1 c1Var) {
        Function0 function0 = this.f21977e;
        if (function0 != null) {
            function0.invoke();
        }
        this.f21977e = c1Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
