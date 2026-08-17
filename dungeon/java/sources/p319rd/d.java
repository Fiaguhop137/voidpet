package p319rd;

import Ad.r;
import Ed.b;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import expo.modules.updates.reloadscreen.ReloadScreenOptions;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p088ef.AbstractC3293k;
import p088ef.C3282e0;
import p088ef.O;
import p088ef.P;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p319rd.a f52447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f52448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f52449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f52450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f52451e = P.a(C3282e0.c());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactMarker.MarkerListener f52452f = new b(this);

    static final class a extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52453a;

        a(b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final b create(Object obj, b bVar) {
            return d.this.new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, b bVar) {
            return ((a) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Fd.b.e();
            if (this.f52453a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            d.this.c();
            return Unit.f48228a;
        }
    }

    private final void d() {
        e eVar;
        WeakReference weakReference = this.f52448b;
        if (weakReference == null || (eVar = (e) weakReference.get()) == null) {
            return;
        }
        p319rd.a aVar = this.f52447a;
        if (aVar == null || !aVar.b()) {
            g(eVar);
        } else {
            eVar.animate().alpha(0.0f).setDuration(300L).withEndAction(new c(this, eVar)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(d dVar, e eVar) {
        dVar.g(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar, ReactMarkerConstants name, String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == ReactMarkerConstants.RUN_JS_BUNDLE_END && dVar.f52450d) {
            AbstractC3293k.d(dVar.f52451e, null, null, dVar.new a(null), 3, null);
        }
    }

    private final void g(e eVar) {
        ViewParent parent = eVar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(eVar);
        }
        this.f52448b = null;
        ReactMarker.removeListener(this.f52452f);
    }

    private final void j(Activity activity) {
        p319rd.a aVarA = this.f52447a;
        if (aVarA == null) {
            aVarA = p319rd.a.f52437g.a(null);
        }
        e eVar = new e(activity, null, 0, 6, null);
        eVar.h(aVarA);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (viewGroup != null) {
            viewGroup.addView(eVar, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f52448b = new WeakReference(eVar);
    }

    public final void c() {
        if (this.f52450d) {
            d();
            this.f52450d = false;
        }
    }

    public final void h(ReloadScreenOptions reloadScreenOptions) {
        this.f52447a = p319rd.a.f52437g.a(reloadScreenOptions);
    }

    public final void i(Activity activity) {
        if (this.f52450d) {
            return;
        }
        ReactMarker.addListener(this.f52452f);
        if (activity == null) {
            WeakReference weakReference = this.f52449c;
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        if (activity == null) {
            return;
        }
        j(activity);
        this.f52450d = true;
    }
}
