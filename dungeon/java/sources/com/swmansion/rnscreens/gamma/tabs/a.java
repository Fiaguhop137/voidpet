package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C2262k0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ViewGroup implements Na.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2262k0 f39087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f39088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.tabs.c f39089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pd.d f39091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pd.d f39092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Pd.d f39093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Pd.d f39094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Pd.d f39095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pd.d f39096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39097k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f39086m = {F.d(new kotlin.jvm.internal.q(a.class, "tabTitle", "getTabTitle()Ljava/lang/String;", 0)), F.d(new kotlin.jvm.internal.q(a.class, "badgeValue", "getBadgeValue()Ljava/lang/String;", 0)), F.d(new kotlin.jvm.internal.q(a.class, "tabBarItemBadgeTextColor", "getTabBarItemBadgeTextColor()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(a.class, "tabBarItemBadgeBackgroundColor", "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;", 0)), F.d(new kotlin.jvm.internal.q(a.class, "iconResourceName", "getIconResourceName()Ljava/lang/String;", 0)), F.d(new kotlin.jvm.internal.q(a.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0))};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0430a f39085l = new C0430a(null);

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.a$a, reason: collision with other inner class name */
    public static final class C0430a {
        private C0430a() {
        }

        public /* synthetic */ C0430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f39098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, a aVar) {
            super(obj);
            this.f39098b = aVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f39098b;
            aVar.g((String) obj, (String) obj2);
        }
    }

    public static final class c extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f39099b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, a aVar) {
            super(obj);
            this.f39099b = aVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f39099b;
            aVar.g((String) obj, (String) obj2);
        }
    }

    public static final class d extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f39100b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, a aVar) {
            super(obj);
            this.f39100b = aVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f39100b;
            aVar.g((Integer) obj, (Integer) obj2);
        }
    }

    public static final class e extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f39101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, a aVar) {
            super(obj);
            this.f39101b = aVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f39101b;
            aVar.g((Integer) obj, (Integer) obj2);
        }
    }

    public static final class f extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f39102b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, a aVar) {
            super(obj);
            this.f39102b = aVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            String str = (String) obj2;
            if (Intrinsics.b(str, (String) obj)) {
                return;
            }
            a aVar = this.f39102b;
            aVar.setIcon(Oa.d.a(aVar.getReactContext(), str));
        }
    }

    public static final class g extends Pd.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f39103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, a aVar) {
            super(obj);
            this.f39103b = aVar;
        }

        @Override // Pd.b
        protected void c(kotlin.reflect.k property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f39103b;
            aVar.g((Drawable) obj, (Drawable) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C2262k0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f39087a = reactContext;
        this.f39088b = new WeakReference(null);
        Pd.a aVar = Pd.a.f8891a;
        this.f39091e = new b(null, this);
        this.f39092f = new c(null, this);
        this.f39093g = new d(null, this);
        this.f39094h = new e(null, this);
        this.f39095i = new f(null, this);
        this.f39096j = new g(null, this);
    }

    private final void d() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f39088b.get();
        if (bVar != null) {
            bVar.c(this);
        }
    }

    private final void e() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f39088b.get();
        if (bVar != null) {
            bVar.d(this, this.f39097k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Object obj, Object obj2) {
        if (Intrinsics.b(obj2, obj)) {
            return;
        }
        d();
    }

    public final boolean b() {
        return this.f39097k;
    }

    public final void c(com.swmansion.rnscreens.gamma.tabs.e fragment, Configuration config) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f39088b.get();
        if (bVar != null) {
            bVar.b(this, config);
        }
    }

    public final void f() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabScreen must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new com.swmansion.rnscreens.gamma.tabs.c(this.f39087a, getId()));
    }

    @Override // Na.b
    @Nullable
    public androidx.fragment.app.i getAssociatedFragment() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f39088b.get();
        if (bVar != null) {
            return bVar.a(this);
        }
        return null;
    }

    @Nullable
    public final String getBadgeValue() {
        return (String) this.f39092f.a(this, f39086m[1]);
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.tabs.c getEventEmitter$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.tabs.c cVar = this.f39089c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("eventEmitter");
        return null;
    }

    @Nullable
    public final Drawable getIcon() {
        return (Drawable) this.f39096j.a(this, f39086m[5]);
    }

    @Nullable
    public final String getIconResourceName() {
        return (String) this.f39095i.a(this, f39086m[4]);
    }

    @NotNull
    public final C2262k0 getReactContext() {
        return this.f39087a;
    }

    @Nullable
    public final Integer getTabBarItemBadgeBackgroundColor() {
        return (Integer) this.f39094h.a(this, f39086m[3]);
    }

    @Nullable
    public final Integer getTabBarItemBadgeTextColor() {
        return (Integer) this.f39093g.a(this, f39086m[2]);
    }

    @Nullable
    public final String getTabKey() {
        return this.f39090d;
    }

    @Nullable
    public final String getTabTitle() {
        return (String) this.f39091e.a(this, f39086m[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Ta.f.f12386a.a("TabScreen", "TabScreen [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setBadgeValue(@Nullable String str) {
        this.f39092f.b(this, f39086m[1], str);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull com.swmansion.rnscreens.gamma.tabs.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f39089c = cVar;
    }

    public final void setFocusedTab(boolean z10) {
        if (this.f39097k != z10) {
            this.f39097k = z10;
            e();
        }
    }

    public final void setIcon(@Nullable Drawable drawable) {
        this.f39096j.b(this, f39086m[5], drawable);
    }

    public final void setIconResourceName(@Nullable String str) {
        this.f39095i.b(this, f39086m[4], str);
    }

    public final void setTabBarItemBadgeBackgroundColor(@Nullable Integer num) {
        this.f39094h.b(this, f39086m[3], num);
    }

    public final void setTabBarItemBadgeTextColor(@Nullable Integer num) {
        this.f39093g.b(this, f39086m[2], num);
    }

    public final void setTabKey(@Nullable String str) {
        if (str != null && StringsKt.j0(str)) {
            str = null;
        }
        this.f39090d = str;
    }

    public final void setTabScreenDelegate$react_native_screens_release(@Nullable com.swmansion.rnscreens.gamma.tabs.b bVar) {
        this.f39088b = new WeakReference(bVar);
    }

    public final void setTabTitle(@Nullable String str) {
        this.f39091e.b(this, f39086m[0], str);
    }
}
