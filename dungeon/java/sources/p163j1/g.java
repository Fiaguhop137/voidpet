package p163j1;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreenView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46753b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f46754a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            g gVar = new g(activity, null);
            gVar.b();
            return gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f46755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f46757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f46758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Drawable f46759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f46760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f46761g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e f46762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private s f46763i;

        public static final class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f46765b;

            a(s sVar) {
                this.f46765b = sVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!b.this.h().a()) {
                        b.this.d(this.f46765b);
                    } else {
                        b.this.f46763i = this.f46765b;
                    }
                }
            }
        }

        public b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f46755a = activity;
            this.f46761g = new h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(s splashScreenViewProvider, e finalListener) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider, "$splashScreenViewProvider");
            Intrinsics.checkNotNullParameter(finalListener, "$finalListener");
            splashScreenViewProvider.a().bringToFront();
            finalListener.a(splashScreenViewProvider);
        }

        private final void f(View view, Drawable drawable) {
            float dimension;
            ImageView imageView = (ImageView) view.findViewById(p163j1.e.f46751a);
            if (this.f46760f) {
                Drawable drawableB = p161j.a.b(imageView.getContext(), p163j1.d.f46750a);
                dimension = imageView.getResources().getDimension(p163j1.c.f46749b) * 0.6666667f;
                if (drawableB != null) {
                    imageView.setBackground(new p163j1.a(drawableB, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(p163j1.c.f46748a) * 0.6666667f;
            }
            imageView.setImageDrawable(new p163j1.a(drawable, dimension));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l() {
            return false;
        }

        public final void d(s splashScreenViewProvider) {
            Intrinsics.checkNotNullParameter(splashScreenViewProvider, "splashScreenViewProvider");
            e eVar = this.f46762h;
            if (eVar == null) {
                return;
            }
            this.f46762h = null;
            splashScreenViewProvider.a().postOnAnimation(new i(splashScreenViewProvider, eVar));
        }

        public final Activity g() {
            return this.f46755a;
        }

        public final d h() {
            return this.f46761g;
        }

        public void i() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f46755a.getTheme();
            if (currentTheme.resolveAttribute(p163j1.b.f46747d, typedValue, true)) {
                this.f46757c = Integer.valueOf(typedValue.resourceId);
                this.f46758d = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(p163j1.b.f46746c, typedValue, true)) {
                this.f46759e = p161j.a.b(this.f46755a, typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(p163j1.b.f46745b, typedValue, true)) {
                this.f46760f = typedValue.resourceId == p163j1.c.f46749b;
            }
            Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
            k(currentTheme, typedValue);
        }

        public void j(e exitAnimationListener) {
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            this.f46762h = exitAnimationListener;
            s sVar = new s(this.f46755a);
            Integer num = this.f46757c;
            Integer num2 = this.f46758d;
            View viewA = sVar.a();
            if (num != null && num.intValue() != 0) {
                viewA.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                viewA.setBackgroundColor(num2.intValue());
            } else {
                viewA.setBackground(this.f46755a.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f46759e;
            if (drawable != null) {
                f(viewA, drawable);
            }
            viewA.addOnLayoutChangeListener(new a(sVar));
        }

        protected final void k(Resources.Theme currentTheme, TypedValue typedValue) {
            Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
            Intrinsics.checkNotNullParameter(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(p163j1.b.f46744a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f46756b = i10;
                if (i10 != 0) {
                    this.f46755a.setTheme(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f46766j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f46767k;

        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f46769b;

            a(Activity activity) {
                this.f46769b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (q.a(view2)) {
                    c cVar = c.this;
                    cVar.p(cVar.o(r.a(view2)));
                    View decorView = this.f46769b.getWindow().getDecorView();
                    Intrinsics.d(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f46766j = true;
            this.f46767k = new a(activity);
        }

        private final void n() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = g().getTheme();
            Window window = g().getWindow();
            if (theme.resolveAttribute(16843857, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(16843858, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(16843856, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            View decorView = window.getDecorView();
            Intrinsics.d(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            Intrinsics.checkNotNullExpressionValue(theme, "theme");
            w.a(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener(null);
            window.setDecorFitsSystemWindows(this.f46766j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(c this$0, e exitAnimationListener, SplashScreenView splashScreenView) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(exitAnimationListener, "$exitAnimationListener");
            Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
            if (Build.VERSION.SDK_INT < 33) {
                this$0.n();
            }
            exitAnimationListener.a(new s(splashScreenView, this$0.g()));
        }

        @Override // j1.g.b
        public void i() {
            Resources.Theme theme = g().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
            k(theme, new TypedValue());
            if (Build.VERSION.SDK_INT < 33) {
                View decorView = g().getWindow().getDecorView();
                Intrinsics.d(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f46767k);
            }
        }

        @Override // j1.g.b
        public void j(e exitAnimationListener) {
            Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
            g().getSplashScreen().setOnExitAnimationListener(new p(this, exitAnimationListener));
        }

        public final boolean o(SplashScreenView child) {
            Intrinsics.checkNotNullParameter(child, "child");
            WindowInsets windowInsetsBuild = j.a().build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void p(boolean z10) {
            this.f46766j = z10;
        }
    }

    public interface d {
        boolean a();
    }

    public interface e {
        void a(s sVar);
    }

    private g(Activity activity) {
        this.f46754a = Build.VERSION.SDK_INT >= 31 ? new c(activity) : new b(activity);
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f46754a.i();
    }

    public final void c(e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f46754a.j(listener);
    }
}
