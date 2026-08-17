package com.swmansion.rnscreens;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC1812a;
import androidx.appcompat.widget.Toolbar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends AbstractC3194e implements com.facebook.react.uimanager.S {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f39001B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f39002A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.facebook.react.uimanager.S f39003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f39004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3193d f39005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f39008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f39010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f39011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f39012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f39014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f39015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f39016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f39017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f39018t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f39019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f39021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f39022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f39023y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final View.OnClickListener f39024z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextView a(Toolbar toolbar) {
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = toolbar.getChildAt(i10);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (TextUtils.equals(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39025a;

        static {
            int[] iArr = new int[Z.a.values().length];
            try {
                iArr[Z.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Z.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39025a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public X(Context context) {
        this(context, new C3205p());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Context context, com.facebook.react.uimanager.S pointerEventsImpl) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
        this.f39003e = pointerEventsImpl;
        this.f39004f = new ArrayList(3);
        this.f39019u = true;
        this.f39024z = new W(this);
        setVisibility(8);
        C3193d c3193d = new C3193d(context, this);
        this.f39005g = c3193d;
        this.f39022x = c3193d.getContentInsetStart();
        this.f39023y = c3193d.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843827, typedValue, true)) {
            c3193d.setBackgroundColor(typedValue.data);
        }
        c3193d.setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(X x10, View view) {
        U screenFragment = x10.getScreenFragment();
        if (screenFragment != null) {
            M screenStack = x10.getScreenStack();
            if (screenStack == null || !Intrinsics.b(screenStack.getRootScreen(), screenFragment.j())) {
                if (screenFragment.j().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.t2();
                    return;
                } else {
                    screenFragment.X1();
                    return;
                }
            }
            androidx.fragment.app.i iVarT = screenFragment.T();
            if (iVarT instanceof U) {
                U u10 = (U) iVarT;
                if (u10.j().getNativeBackButtonDismissalEnabled()) {
                    u10.t2();
                } else {
                    u10.X1();
                }
            }
        }
    }

    private final C3208t getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C3208t) {
            return (C3208t) parent;
        }
        return null;
    }

    private final M getScreenStack() {
        C3208t screen = getScreen();
        C3210v container = screen != null ? screen.getContainer() : null;
        if (container instanceof M) {
            return (M) container;
        }
        return null;
    }

    private final void j() {
        C3208t screen;
        if (getParent() == null || this.f39017s || (screen = getScreen()) == null || screen.h()) {
            return;
        }
        l();
    }

    public final void d(Z child, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f39004f.add(i10, child);
        j();
    }

    public final void f() {
        this.f39017s = true;
    }

    public final Z g(int i10) {
        Object obj = this.f39004f.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Z) obj;
    }

    public final int getConfigSubviewsCount() {
        return this.f39004f.size();
    }

    @Override // com.facebook.react.uimanager.S
    @NotNull
    public com.facebook.react.uimanager.I getPointerEvents() {
        return this.f39003e.getPointerEvents();
    }

    public final int getPreferredContentInsetEnd() {
        return this.f39022x;
    }

    public final int getPreferredContentInsetStart() {
        return this.f39022x;
    }

    public final int getPreferredContentInsetStartWithNavigation() {
        if (this.f39002A) {
            return 0;
        }
        return this.f39023y;
    }

    @Nullable
    public final U getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof C3208t)) {
            return null;
        }
        androidx.fragment.app.i fragment = ((C3208t) parent).getFragment();
        if (fragment instanceof U) {
            return (U) fragment;
        }
        return null;
    }

    @NotNull
    public final C3193d getToolbar() {
        return this.f39005g;
    }

    public final boolean h() {
        return this.f39006h;
    }

    public final boolean i() {
        return this.f39019u;
    }

    public final void k(Toolbar toolbar, boolean z10) {
        Object next;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (z10) {
            int currentContentInsetStart = toolbar.getNavigationIcon() != null ? toolbar.getCurrentContentInsetStart() + toolbar.getPaddingStart() : Math.max(toolbar.getCurrentContentInsetStart(), toolbar.getPaddingStart());
            Iterator it = this.f39004f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Z) next).getType() != Z.a.LEFT);
            Z z11 = (Z) next;
            if (z11 != null) {
                currentContentInsetStart = z11.getLeft();
            }
            a(toolbar.getWidth(), toolbar.getHeight(), currentContentInsetStart, toolbar.getCurrentContentInsetEnd() + toolbar.getPaddingEnd());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void l() {
        Drawable navigationIcon;
        U screenFragment;
        U screenFragment2;
        ReactContext reactContextT;
        M screenStack = getScreenStack();
        boolean z10 = screenStack == null || Intrinsics.b(screenStack.getTopScreen(), getParent());
        if (this.f39021w && z10 && !this.f39017s) {
            U screenFragment3 = getScreenFragment();
            androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) (screenFragment3 != null ? screenFragment3.A() : null);
            if (cVar == null) {
                return;
            }
            String str = this.f39011m;
            if (str != null) {
                if (Intrinsics.b(str, "rtl")) {
                    this.f39005g.setLayoutDirection(1);
                } else if (Intrinsics.b(this.f39011m, "ltr")) {
                    this.f39005g.setLayoutDirection(0);
                }
            }
            C3208t screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextT = (ReactContext) context;
                } else {
                    B fragmentWrapper = screen.getFragmentWrapper();
                    reactContextT = fragmentWrapper != null ? fragmentWrapper.t() : null;
                }
                e0.f39065a.x(screen, cVar, reactContextT);
            }
            if (this.f39006h) {
                if (this.f39005g.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                screenFragment2.G2();
                return;
            }
            if (this.f39005g.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.M2(this.f39005g);
            }
            cVar.z0(this.f39005g);
            AbstractC1812a abstractC1812aP0 = cVar.p0();
            if (abstractC1812aP0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            U screenFragment4 = getScreenFragment();
            abstractC1812aP0.r((screenFragment4 == null || !screenFragment4.r2() || this.f39015q) ? false : true);
            abstractC1812aP0.u(this.f39008j);
            if (TextUtils.isEmpty(this.f39008j)) {
                this.f39002A = true;
            }
            this.f39005g.X();
            this.f39005g.setNavigationOnClickListener(this.f39024z);
            U screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.N2(this.f39016r);
            }
            U screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.O2(this.f39007i);
            }
            TextView textViewA = f39001B.a(this.f39005g);
            int i10 = this.f39009k;
            if (i10 != 0) {
                this.f39005g.setTitleTextColor(i10);
            }
            if (textViewA != null) {
                String str2 = this.f39010l;
                if (str2 != null || this.f39013o > 0) {
                    int i11 = this.f39013o;
                    AssetManager assets = getContext().getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    textViewA.setTypeface(com.facebook.react.views.text.q.a(null, 0, i11, str2, assets));
                }
                float f10 = this.f39012n;
                if (f10 > 0.0f) {
                    textViewA.setTextSize(f10);
                }
            }
            Integer num = this.f39014p;
            if (num != null) {
                this.f39005g.setBackgroundColor(num.intValue());
            }
            if (this.f39020v != 0 && (navigationIcon = this.f39005g.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f39020v, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.f39005g.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.f39005g.getChildAt(childCount) instanceof Z) {
                    this.f39005g.removeViewAt(childCount);
                }
            }
            int size = this.f39004f.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = this.f39004f.get(i12);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Z z11 = (Z) obj;
                Z.a type = z11.getType();
                if (type == Z.a.BACK) {
                    View childAt = z11.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    abstractC1812aP0.s(imageView.getDrawable());
                } else {
                    Toolbar.g gVar = new Toolbar.g(-2, -1);
                    int i13 = b.f39025a[type.ordinal()];
                    if (i13 == 1) {
                        if (!this.f39018t) {
                            this.f39005g.setNavigationIcon((Drawable) null);
                        }
                        this.f39005g.setTitle((CharSequence) null);
                        gVar.f19987a = 8388611;
                    } else if (i13 == 2) {
                        gVar.f19987a = 8388613;
                    } else if (i13 == 3) {
                        ((ViewGroup.MarginLayoutParams) gVar).width = -1;
                        gVar.f19987a = 1;
                        this.f39005g.setTitle((CharSequence) null);
                    }
                    z11.setLayoutParams(gVar);
                    this.f39005g.addView(z11);
                }
            }
        }
    }

    public final void m() {
        this.f39004f.clear();
        j();
    }

    public final void n(int i10) {
        this.f39004f.remove(i10);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39021w = true;
        int iF = C2270o0.f(this);
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new La.a(iF, getId()));
        }
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39021w = false;
        int iF = C2270o0.f(this);
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new La.c(iF, getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setBackButtonInCustomView(boolean z10) {
        this.f39018t = z10;
    }

    public final void setBackgroundColor(@Nullable Integer num) {
        this.f39014p = num;
    }

    public final void setDirection(@Nullable String str) {
        this.f39011m = str;
    }

    public final void setHeaderHidden(boolean z10) {
        this.f39006h = z10;
    }

    public final void setHeaderTranslucent(boolean z10) {
        this.f39007i = z10;
    }

    public final void setHidden(boolean z10) {
        this.f39006h = z10;
    }

    public final void setHideBackButton(boolean z10) {
        this.f39015q = z10;
    }

    public final void setHideShadow(boolean z10) {
        this.f39016r = z10;
    }

    public final void setTintColor(int i10) {
        this.f39020v = i10;
    }

    public final void setTitle(@Nullable String str) {
        this.f39008j = str;
    }

    public final void setTitleColor(int i10) {
        this.f39009k = i10;
    }

    public final void setTitleEmpty(boolean z10) {
        this.f39002A = z10;
    }

    public final void setTitleFontFamily(@Nullable String str) {
        this.f39010l = str;
    }

    public final void setTitleFontSize(float f10) {
        this.f39012n = f10;
    }

    public final void setTitleFontWeight(@Nullable String str) {
        this.f39013o = com.facebook.react.views.text.q.d(str);
    }

    public final void setTopInsetEnabled(boolean z10) {
        this.f39019u = z10;
    }

    public final void setTranslucent(boolean z10) {
        this.f39007i = z10;
    }
}
