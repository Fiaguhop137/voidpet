package U6;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.InterfaceC2299z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements B6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13240e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SurfaceHandlerBinding f13241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f13242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f13243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f13244d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e(Context context) {
            return com.facebook.react.modules.i18nmanager.a.f29937a.a().d(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float f(Context context) {
            if (D6.b.k()) {
                return context.getResources().getConfiguration().fontScale;
            }
            return 1.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean g(Context context) {
            return com.facebook.react.modules.i18nmanager.a.f29937a.a().i(context);
        }

        public final a0 d(Context context, String moduleName, Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            a0 a0Var = new a0(context, moduleName, bundle);
            a0Var.d(new b0(context, a0Var));
            return a0Var;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Context context, String moduleName, Bundle bundle) {
        NativeMap nativeMap;
        this(new SurfaceHandlerBinding(moduleName), context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (bundle != null) {
            Object objFromBundle = Arguments.fromBundle(bundle);
            Intrinsics.d(objFromBundle, "null cannot be cast to non-null type com.facebook.react.bridge.NativeMap");
            nativeMap = (NativeMap) objFromBundle;
        } else {
            nativeMap = null;
        }
        this.f13241a.setProps(nativeMap);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        SurfaceHandlerBinding surfaceHandlerBinding = this.f13241a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
        a aVar = f13240e;
        surfaceHandlerBinding.setLayoutConstraints(iMakeMeasureSpec, iMakeMeasureSpec2, 0, 0, aVar.e(context), aVar.g(context), displayMetrics.density, aVar.f(context));
    }

    public a0(SurfaceHandlerBinding surfaceHandler, Context context) {
        Intrinsics.checkNotNullParameter(surfaceHandler, "surfaceHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13241a = surfaceHandler;
        this.f13242b = context;
        this.f13243c = new AtomicReference(null);
        this.f13244d = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a0 a0Var) {
        ViewGroup viewGroupA = a0Var.a();
        if (viewGroupA != null) {
            viewGroupA.removeAllViews();
            viewGroupA.setId(-1);
        }
    }

    @Override // B6.a
    public ViewGroup a() {
        return (ViewGroup) this.f13243c.get();
    }

    public final void c(InterfaceC2299z host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (!(host instanceof ReactHostImpl)) {
            throw new IllegalArgumentException("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
        }
        if (!p359u.G.a(this.f13244d, null, host)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
    }

    public final void d(b0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!p359u.G.a(this.f13243c, null, view)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f13242b = context;
    }

    public void e() {
        UiThreadUtil.runOnUiThread(new Z(this));
    }

    public Context g() {
        return this.f13242b;
    }

    public final EventDispatcher h() {
        ReactHostImpl reactHostImplJ = j();
        if (reactHostImplJ != null) {
            return reactHostImplJ.y0();
        }
        return null;
    }

    public String i() {
        return this.f13241a.getModuleName();
    }

    public final ReactHostImpl j() {
        return (ReactHostImpl) this.f13244d.get();
    }

    public final SurfaceHandlerBinding k() {
        return this.f13241a;
    }

    public int l() {
        return this.f13241a.getSurfaceId();
    }

    public final boolean m() {
        return j() != null;
    }

    public boolean n() {
        return this.f13241a.isRunning();
    }

    public final synchronized void o(int i10, int i11, int i12, int i13) {
        SurfaceHandlerBinding surfaceHandlerBinding = this.f13241a;
        a aVar = f13240e;
        surfaceHandlerBinding.setLayoutConstraints(i10, i11, i12, i13, aVar.e(g()), aVar.g(g()), g().getResources().getDisplayMetrics().density, aVar.f(g()));
    }

    @Override // B6.a
    public A6.a start() {
        if (this.f13243c.get() == null) {
            return V6.n.f14133g.q(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImplJ = j();
        return reactHostImplJ == null ? V6.n.f14133g.q(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHostImplJ.C1(this);
    }

    @Override // B6.a
    public A6.a stop() {
        ReactHostImpl reactHostImplJ = j();
        return reactHostImplJ == null ? V6.n.f14133g.q(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImplJ.F1(this);
    }
}
