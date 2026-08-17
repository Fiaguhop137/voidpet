package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f39181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f39182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f39183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f39184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f39185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f39186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f39187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f39190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n0 f39191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f39193m;

    public enum a {
        NONE,
        WORDS,
        SENTENCES,
        CHARACTERS;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f39199f = Gd.a.a(e());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f39200a = new d("TEXT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f39201b = new c("PHONE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f39202c = new C0432b("NUMBER", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f39203d = new a("EMAIL", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f39204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f39205f;

        static final class a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.m0.b
            public int g(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 32;
            }
        }

        /* JADX INFO: renamed from: com.swmansion.rnscreens.m0$b$b, reason: collision with other inner class name */
        static final class C0432b extends b {
            C0432b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.m0.b
            public int g(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 2;
            }
        }

        static final class c extends b {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.m0.b
            public int g(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 3;
            }
        }

        static final class d extends b {

            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f39206a;

                static {
                    int[] iArr = new int[a.values().length];
                    try {
                        iArr[a.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.WORDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.SENTENCES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.CHARACTERS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f39206a = iArr;
                }
            }

            d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.swmansion.rnscreens.m0.b
            public int g(a capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                int i10 = a.f39206a[capitalize.ordinal()];
                if (i10 == 1) {
                    return 1;
                }
                if (i10 == 2) {
                    return 8192;
                }
                if (i10 == 3) {
                    return 16384;
                }
                if (i10 == 4) {
                    return 4096;
                }
                throw new Ad.n();
            }
        }

        static {
            b[] bVarArrE = e();
            f39204e = bVarArrE;
            f39205f = Gd.a.a(bVarArrE);
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ b(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ b[] e() {
            return new b[]{f39200a, f39201b, f39202c, f39203d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f39204e.clone();
        }

        public abstract int g(a aVar);
    }

    public static final class c implements SearchView.m {
        c() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            m0.this.I(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            m0.this.J(str);
            return true;
        }
    }

    public m0(ReactContext reactContext) {
        super(reactContext);
        this.f39181a = b.f39200a;
        this.f39182b = a.NONE;
        this.f39187g = "";
        this.f39188h = true;
        this.f39190j = true;
        this.f39193m = C2270o0.f(this);
    }

    private final void D() {
        N(new La.o(this.f39193m, getId()));
        setToolbarElementsVisibility(0);
    }

    private final void E(boolean z10) {
        N(z10 ? new La.p(this.f39193m, getId()) : new La.m(this.f39193m, getId()));
    }

    private final void G() {
        N(new La.q(this.f39193m, getId()));
        setToolbarElementsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str) {
        N(new La.n(this.f39193m, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(String str) {
        N(new La.r(this.f39193m, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(m0 m0Var, C3192c newSearchView) {
        U screenStackFragment;
        C3192c searchView;
        Intrinsics.checkNotNullParameter(newSearchView, "newSearchView");
        if (m0Var.f39191k == null) {
            m0Var.f39191k = new n0(newSearchView);
        }
        m0Var.R();
        if (m0Var.f39189i && (screenStackFragment = m0Var.getScreenStackFragment()) != null && (searchView = screenStackFragment.getSearchView()) != null) {
            searchView.p0();
        }
        return Unit.f48228a;
    }

    private final void N(com.facebook.react.uimanager.events.d dVar) {
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = C2270o0.c((ReactContext) context, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(m0 m0Var, View view, boolean z10) {
        m0Var.E(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P(m0 m0Var) {
        m0Var.D();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(m0 m0Var, View view) {
        m0Var.G();
    }

    private final void R() {
        U screenStackFragment = getScreenStackFragment();
        C3192c searchView = screenStackFragment != null ? screenStackFragment.getSearchView() : null;
        if (searchView != null) {
            if (!this.f39192l) {
                setSearchViewListeners(searchView);
                this.f39192l = true;
            }
            searchView.setInputType(this.f39181a.g(this.f39182b));
            n0 n0Var = this.f39191k;
            if (n0Var != null) {
                n0Var.h(this.f39183c);
            }
            n0 n0Var2 = this.f39191k;
            if (n0Var2 != null) {
                n0Var2.i(this.f39184d);
            }
            n0 n0Var3 = this.f39191k;
            if (n0Var3 != null) {
                n0Var3.e(this.f39185e);
            }
            n0 n0Var4 = this.f39191k;
            if (n0Var4 != null) {
                n0Var4.f(this.f39186f);
            }
            n0 n0Var5 = this.f39191k;
            if (n0Var5 != null) {
                n0Var5.g(this.f39187g, this.f39190j);
            }
            searchView.setOverrideBackAction(this.f39188h);
        }
    }

    private final X getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof Z) {
            return ((Z) parent).getConfig();
        }
        return null;
    }

    private final U getScreenStackFragment() {
        X headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new c());
        searchView.setOnQueryTextFocusChangeListener(new j0(this));
        searchView.setOnCloseListener(new k0(this));
        searchView.setOnSearchClickListener(new l0(this));
    }

    private final void setToolbarElementsVisibility(int i10) {
        X headerConfig = getHeaderConfig();
        int i11 = 0;
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            X headerConfig2 = getHeaderConfig();
            Z zG = headerConfig2 != null ? headerConfig2.g(i11) : null;
            if ((zG != null ? zG.getType() : null) != Z.a.SEARCH_BAR && zG != null) {
                zG.setVisibility(i10);
            }
            if (i11 == configSubviewsCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void B() {
        C3192c searchView;
        U screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearFocus();
    }

    public final void C() {
        C3192c searchView;
        U screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.o0();
    }

    public final void F() {
        C3192c searchView;
        U screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.p0();
    }

    public final void H(String str) {
        U screenStackFragment;
        C3192c searchView;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.setText(str);
    }

    public final void K(boolean z10) {
    }

    public final void M() {
        R();
    }

    @NotNull
    public final a getAutoCapitalize() {
        return this.f39182b;
    }

    public final boolean getAutoFocus() {
        return this.f39189i;
    }

    @Nullable
    public final Integer getHeaderIconColor() {
        return this.f39185e;
    }

    @Nullable
    public final Integer getHintTextColor() {
        return this.f39186f;
    }

    @NotNull
    public final b getInputType() {
        return this.f39181a;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.f39187g;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f39188h;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f39190j;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.f39183c;
    }

    @Nullable
    public final Integer getTintColor() {
        return this.f39184d;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        U screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.L2(new i0(this));
        }
    }

    public final void setAutoCapitalize(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f39182b = aVar;
    }

    public final void setAutoFocus(boolean z10) {
        this.f39189i = z10;
    }

    public final void setHeaderIconColor(@Nullable Integer num) {
        this.f39185e = num;
    }

    public final void setHintTextColor(@Nullable Integer num) {
        this.f39186f = num;
    }

    public final void setInputType(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f39181a = bVar;
    }

    public final void setPlaceholder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f39187g = str;
    }

    public final void setShouldOverrideBackButton(boolean z10) {
        this.f39188h = z10;
    }

    public final void setShouldShowHintSearchIcon(boolean z10) {
        this.f39190j = z10;
    }

    public final void setTextColor(@Nullable Integer num) {
        this.f39183c = num;
    }

    public final void setTintColor(@Nullable Integer num) {
        this.f39184d = num;
    }
}
