package p404w8;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import com.google.android.gms.tasks.TaskExecutors;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p170j8.r;
import p359u.G;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicReference f56690g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f56691h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f56692a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f56696e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f56693b = new n(this, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f56694c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f56695d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f56697f = false;

    public o(Application application) {
        this.f56692a = application;
    }

    public static o a(Application application) {
        r.l(application);
        AtomicReference atomicReference = f56690g;
        o oVar = (o) atomicReference.get();
        if (oVar != null) {
            return oVar;
        }
        G.a(atomicReference, null, new o(application));
        return (o) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(l lVar) {
        Activity activityD = d();
        if (activityD == null) {
            return;
        }
        lVar.a(activityD);
    }

    public final void b() {
        synchronized (this.f56694c) {
            try {
                if (!this.f56697f) {
                    this.f56692a.registerActivityLifecycleCallbacks(this.f56693b);
                    this.f56697f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(l lVar) {
        r.l(lVar);
        synchronized (this.f56694c) {
            this.f56695d.add(lVar);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e(lVar);
        } else {
            TaskExecutors.MAIN_THREAD.execute(new m(this, lVar));
        }
    }

    public final Activity d() {
        Activity activity;
        synchronized (this.f56694c) {
            WeakReference weakReference = this.f56696e;
            activity = weakReference == null ? null : (Activity) weakReference.get();
        }
        return activity;
    }

    final /* synthetic */ void f(Activity activity) {
        r.l(activity);
        synchronized (this.f56694c) {
            try {
                if (d() == activity) {
                    return;
                }
                this.f56696e = new WeakReference(activity);
                Iterator it = this.f56695d.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).a(activity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void g(Activity activity) {
        synchronized (this.f56694c) {
            try {
                WeakReference weakReference = this.f56696e;
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() == activity) {
                    this.f56696e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
