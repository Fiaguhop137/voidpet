package p352ta;

import K9.C1135c;
import K9.f;
import K9.n;
import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f54598b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h f54599c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f54600a;

    private h() {
    }

    public static h c() {
        h hVar;
        synchronized (f54598b) {
            r.p(f54599c != null, "MlKitContext has not been initialized");
            hVar = (h) r.l(f54599c);
        }
        return hVar;
    }

    public static h d(Context context) {
        h hVarE;
        synchronized (f54598b) {
            hVarE = e(context, TaskExecutors.MAIN_THREAD);
        }
        return hVarE;
    }

    public static h e(Context context, Executor executor) {
        h hVar;
        synchronized (f54598b) {
            r.p(f54599c == null, "MlKitContext is already initialized");
            h hVar2 = new h();
            f54599c = hVar2;
            Context contextF = f(context);
            n nVarE = n.k(executor).d(f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(C1135c.q(contextF, Context.class, new Class[0])).b(C1135c.q(hVar2, h.class, new Class[0])).e();
            hVar2.f54600a = nVarE;
            nVarE.n(true);
            hVar = f54599c;
        }
        return hVar;
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        r.p(f54599c == this, "MlKitContext has been deleted");
        r.l(this.f54600a);
        return this.f54600a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
