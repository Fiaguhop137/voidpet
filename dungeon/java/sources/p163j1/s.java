package p163j1;

import Ad.j;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f46774a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f46775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f46776b;

        /* JADX INFO: renamed from: j1.s$a$a, reason: collision with other inner class name */
        static final class C0547a extends o implements Function0 {
            C0547a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ViewGroup invoke() {
                View viewInflate = View.inflate(a.this.b(), f.f46752a, null);
                Intrinsics.d(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
                return (ViewGroup) viewInflate;
            }
        }

        public a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f46775a = activity;
            this.f46776b = j.b(new C0547a());
        }

        private final ViewGroup d() {
            return (ViewGroup) this.f46776b.getValue();
        }

        public void a() {
            View rootView = ((ViewGroup) this.f46775a.findViewById(16908290)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(d());
            }
        }

        public final Activity b() {
            return this.f46775a;
        }

        public ViewGroup c() {
            return d();
        }

        public void e() {
            ViewParent parent = c().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c());
            }
        }
    }

    private static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SplashScreenView f46778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // j1.s.a
        public void a() {
        }

        @Override // j1.s.a
        public void e() {
            f().remove();
            if (Build.VERSION.SDK_INT < 33) {
                Resources.Theme theme = b().getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
                View decorView = b().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
                w.b(theme, decorView, null, 4, null);
            }
        }

        public final SplashScreenView f() {
            SplashScreenView splashScreenView = this.f46778c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            Intrinsics.r("platformView");
            return null;
        }

        @Override // j1.s.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SplashScreenView c() {
            return f();
        }

        public final void h(SplashScreenView splashScreenView) {
            Intrinsics.checkNotNullParameter(splashScreenView, "<set-?>");
            this.f46778c = splashScreenView;
        }
    }

    public s(Activity ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        a bVar = Build.VERSION.SDK_INT >= 31 ? new b(ctx) : new a(ctx);
        bVar.a();
        this.f46774a = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(SplashScreenView platformView, Activity ctx) {
        this(ctx);
        Intrinsics.checkNotNullParameter(platformView, "platformView");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        a aVar = this.f46774a;
        Intrinsics.d(aVar, "null cannot be cast to non-null type androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31");
        ((b) aVar).h(platformView);
    }

    public final View a() {
        return this.f46774a.c();
    }

    public final void b() {
        this.f46774a.e();
    }
}
