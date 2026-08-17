package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import p323s.C4102b;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c f19996a = new c(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19997b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static p128h1.i f19998c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p128h1.i f19999d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f20000e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f20001f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C4102b f20002g = new C4102b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f20003h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f20004i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f20005a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue f20006b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f20007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Runnable f20008d;

        c(Executor executor) {
            this.f20007c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        protected void b() {
            synchronized (this.f20005a) {
                try {
                    Runnable runnable = (Runnable) this.f20006b.poll();
                    this.f20008d = runnable;
                    if (runnable != null) {
                        this.f20007c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            synchronized (this.f20005a) {
                try {
                    this.f20006b.add(new g(this, runnable));
                    if (this.f20008d == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    f() {
    }

    static void F(f fVar) {
        synchronized (f20003h) {
            G(fVar);
        }
    }

    private static void G(f fVar) {
        synchronized (f20003h) {
            try {
                Iterator it = f20002g.iterator();
                while (it.hasNext()) {
                    f fVar2 = (f) ((WeakReference) it.next()).get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void L(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f19997b != i10) {
            f19997b = i10;
            g();
        }
    }

    static void Q(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().f()) {
                    String strB = Y0.f.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void R(Context context) {
        if (w(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f20001f) {
                    return;
                }
                f19996a.execute(new e(context));
                return;
            }
            synchronized (f20004i) {
                try {
                    p128h1.i iVar = f19998c;
                    if (iVar == null) {
                        if (f19999d == null) {
                            f19999d = p128h1.i.b(Y0.f.b(context));
                        }
                        if (f19999d.f()) {
                        } else {
                            f19998c = f19999d;
                        }
                    } else if (!iVar.equals(f19999d)) {
                        p128h1.i iVar2 = f19998c;
                        f19999d = iVar2;
                        Y0.f.a(context, iVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        Q(context);
        f20001f = true;
    }

    static void d(f fVar) {
        synchronized (f20003h) {
            G(fVar);
            f20002g.add(new WeakReference(fVar));
        }
    }

    private static void g() {
        synchronized (f20003h) {
            try {
                Iterator it = f20002g.iterator();
                while (it.hasNext()) {
                    f fVar = (f) ((WeakReference) it.next()).get();
                    if (fVar != null) {
                        fVar.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f j(Activity activity, androidx.appcompat.app.d dVar) {
        return new h(activity, dVar);
    }

    public static f k(Dialog dialog, androidx.appcompat.app.d dVar) {
        return new h(dialog, dVar);
    }

    public static p128h1.i m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objQ = q();
            if (objQ != null) {
                return p128h1.i.i(b.a(objQ));
            }
        } else {
            p128h1.i iVar = f19998c;
            if (iVar != null) {
                return iVar;
            }
        }
        return p128h1.i.e();
    }

    public static int o() {
        return f19997b;
    }

    static Object q() {
        Context contextN;
        Iterator it = f20002g.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null && (contextN = fVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static p128h1.i s() {
        return f19998c;
    }

    static boolean w(Context context) {
        if (f20000e == null) {
            try {
                Bundle bundle = t.a(context).metaData;
                if (bundle != null) {
                    f20000e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f20000e = Boolean.FALSE;
            }
        }
        return f20000e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void I(int i10);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void N(Toolbar toolbar);

    public abstract void O(int i10);

    public abstract void P(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract int p();

    public abstract MenuInflater r();

    public abstract AbstractC1812a t();

    public abstract void u();

    public abstract void v();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
