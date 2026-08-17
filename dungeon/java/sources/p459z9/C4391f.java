package p459z9;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: z9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4391f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f58513o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f58514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f58515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f58516c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f58521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G f58522i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ServiceConnection f58526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IInterface f58527n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f58517d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f58518e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f58519f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f58524k = new B(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f58525l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f58523j = new WeakReference(null);

    public C4391f(Context context, z zVar, String str, Intent intent, G g10, F f10) {
        this.f58514a = context;
        this.f58515b = zVar;
        this.f58516c = str;
        this.f58521h = intent;
        this.f58522i = g10;
    }

    public static /* synthetic */ void k(C4391f c4391f) {
        c4391f.f58515b.c("reportBinderDeath", new Object[0]);
        b.a(c4391f.f58523j.get());
        c4391f.f58515b.c("%s : Binder has died.", c4391f.f58516c);
        Iterator it = c4391f.f58517d.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(c4391f.w());
        }
        c4391f.f58517d.clear();
        synchronized (c4391f.f58519f) {
            c4391f.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(C4391f c4391f, TaskCompletionSource taskCompletionSource) {
        c4391f.f58518e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new C(c4391f, taskCompletionSource));
    }

    static /* bridge */ /* synthetic */ void q(C4391f c4391f, A a10) {
        if (c4391f.f58527n != null || c4391f.f58520g) {
            if (!c4391f.f58520g) {
                a10.run();
                return;
            } else {
                c4391f.f58515b.c("Waiting to bind to the service.", new Object[0]);
                c4391f.f58517d.add(a10);
                return;
            }
        }
        c4391f.f58515b.c("Initiate binding to the service.", new Object[0]);
        c4391f.f58517d.add(a10);
        ServiceConnectionC4390e serviceConnectionC4390e = new ServiceConnectionC4390e(c4391f, null);
        c4391f.f58526m = serviceConnectionC4390e;
        c4391f.f58520g = true;
        if (c4391f.f58514a.bindService(c4391f.f58521h, serviceConnectionC4390e, 1)) {
            return;
        }
        c4391f.f58515b.c("Failed to bind to the service.", new Object[0]);
        c4391f.f58520g = false;
        Iterator it = c4391f.f58517d.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(new C4392g());
        }
        c4391f.f58517d.clear();
    }

    static /* bridge */ /* synthetic */ void r(C4391f c4391f) {
        c4391f.f58515b.c("linkToDeath", new Object[0]);
        try {
            c4391f.f58527n.asBinder().linkToDeath(c4391f.f58524k, 0);
        } catch (RemoteException e10) {
            c4391f.f58515b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(C4391f c4391f) {
        c4391f.f58515b.c("unlinkToDeath", new Object[0]);
        c4391f.f58527n.asBinder().unlinkToDeath(c4391f.f58524k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f58516c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f58518e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f58518e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f58513o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f58516c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f58516c, 10);
                    handlerThread.start();
                    map.put(this.f58516c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f58516c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f58527n;
    }

    public final void t(A a10, TaskCompletionSource taskCompletionSource) {
        c().post(new D(this, a10.c(), taskCompletionSource, a10));
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f58519f) {
            this.f58518e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f58519f) {
            this.f58518e.remove(taskCompletionSource);
        }
        c().post(new E(this));
    }
}
