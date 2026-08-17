package p423x9;

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
import p405w9.i;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f57433o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f57434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f57435b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f57440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f57441h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ServiceConnection f57445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IInterface f57446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final i f57447n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f57437d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f57438e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f57439f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f57443j = new l(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f57444k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f57436c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference f57442i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, i iVar2, o oVar, byte[] bArr) {
        this.f57434a = context;
        this.f57435b = iVar;
        this.f57441h = intent;
        this.f57447n = iVar2;
    }

    public static /* synthetic */ void h(t tVar) {
        tVar.f57435b.d("reportBinderDeath", new Object[0]);
        b.a(tVar.f57442i.get());
        tVar.f57435b.d("%s : Binder has died.", tVar.f57436c);
        Iterator it = tVar.f57437d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(tVar.s());
        }
        tVar.f57437d.clear();
        tVar.t();
    }

    static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f57446m != null || tVar.f57440g) {
            if (!tVar.f57440g) {
                jVar.run();
                return;
            } else {
                tVar.f57435b.d("Waiting to bind to the service.", new Object[0]);
                tVar.f57437d.add(jVar);
                return;
            }
        }
        tVar.f57435b.d("Initiate binding to the service.", new Object[0]);
        tVar.f57437d.add(jVar);
        s sVar = new s(tVar, null);
        tVar.f57445l = sVar;
        tVar.f57440g = true;
        if (tVar.f57434a.bindService(tVar.f57441h, sVar, 1)) {
            return;
        }
        tVar.f57435b.d("Failed to bind to the service.", new Object[0]);
        tVar.f57440g = false;
        Iterator it = tVar.f57437d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f57437d.clear();
    }

    static /* bridge */ /* synthetic */ void n(t tVar) {
        tVar.f57435b.d("linkToDeath", new Object[0]);
        try {
            tVar.f57446m.asBinder().linkToDeath(tVar.f57443j, 0);
        } catch (RemoteException e10) {
            tVar.f57435b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f57435b.d("unlinkToDeath", new Object[0]);
        tVar.f57446m.asBinder().unlinkToDeath(tVar.f57443j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f57436c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        synchronized (this.f57439f) {
            try {
                Iterator it = this.f57438e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(s());
                }
                this.f57438e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f57433o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f57436c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f57436c, 10);
                    handlerThread.start();
                    map.put(this.f57436c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f57436c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f57446m;
    }

    public final void p(j jVar, TaskCompletionSource taskCompletionSource) {
        synchronized (this.f57439f) {
            this.f57438e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new k(this, taskCompletionSource));
        }
        synchronized (this.f57439f) {
            try {
                if (this.f57444k.getAndIncrement() > 0) {
                    this.f57435b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    final /* synthetic */ void q(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f57439f) {
            this.f57438e.remove(taskCompletionSource);
        }
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f57439f) {
            this.f57438e.remove(taskCompletionSource);
        }
        synchronized (this.f57439f) {
            try {
                if (this.f57444k.get() > 0 && this.f57444k.decrementAndGet() > 0) {
                    this.f57435b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new n(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
