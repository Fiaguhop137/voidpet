package p037c0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p091f0.C3406c;
import p091f0.C3409f;
import p091f0.I;
import p091f0.InterfaceC3407d;
import p091f0.J;

/* JADX INFO: loaded from: classes.dex */
final class G implements f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f26663f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f26664g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f26665a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.compose.ui.graphics.layer.view.a f26667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26668d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f26666b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ComponentCallbacks2 f26669e = new a();

    public static final class a implements ComponentCallbacks2 {
        a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 >= 40) {
                G.this.f();
            }
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            G.this.i(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            G.this.j(view.getContext());
            G.this.f();
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26672a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public G(ViewGroup viewGroup) {
        this.f26665a = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            i(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
    }

    private final long g(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(view);
        }
        return -1L;
    }

    private final androidx.compose.ui.graphics.layer.view.a h(ViewGroup viewGroup) {
        androidx.compose.ui.graphics.layer.view.a aVar = this.f26667c;
        if (aVar != null) {
            return aVar;
        }
        androidx.compose.ui.graphics.layer.view.b bVar = new androidx.compose.ui.graphics.layer.view.b(viewGroup.getContext());
        viewGroup.addView(bVar);
        this.f26667c = bVar;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Context context) {
        if (this.f26668d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.f26669e);
        this.f26668d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Context context) {
        if (this.f26668d) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f26669e);
            this.f26668d = false;
        }
    }

    @Override // p037c0.f0
    public void a(C3406c c3406c) {
        synchronized (this.f26666b) {
            c3406c.H();
            Unit unit = Unit.f48228a;
        }
    }

    @Override // p037c0.f0
    public C3406c b() {
        InterfaceC3407d j10;
        C3406c c3406c;
        synchronized (this.f26666b) {
            try {
                long jG = g(this.f26665a);
                if (Build.VERSION.SDK_INT >= 29) {
                    j10 = new I(jG, null, null, 6, null);
                } else if (f26664g) {
                    try {
                        j10 = new C3409f(this.f26665a, jG, null, null, 12, null);
                    } catch (Throwable unused) {
                        f26664g = false;
                        j10 = new J(h(this.f26665a), jG, null, null, 12, null);
                    }
                } else {
                    j10 = new J(h(this.f26665a), jG, null, null, 12, null);
                }
                c3406c = new C3406c(j10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3406c;
    }
}
