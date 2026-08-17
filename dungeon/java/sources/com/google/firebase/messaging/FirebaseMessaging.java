package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p117g8.C3429a;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static b0 f37466m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static ScheduledExecutorService f37468o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.e f37469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f37470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f37471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W f37472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f37473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f37474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f37475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Task f37476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final J f37477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f37479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f37465l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static W9.b f37467n = new r();

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T9.d f37480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T9.b f37482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f37483d;

        a(T9.d dVar) {
            this.f37480a = dVar;
        }

        public static /* synthetic */ void a(a aVar, T9.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.D();
            }
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextL = FirebaseMessaging.this.f37469a.l();
            SharedPreferences sharedPreferences = contextL.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextL.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextL.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f37481b) {
                    return;
                }
                Boolean boolD = d();
                this.f37483d = boolD;
                if (boolD == null) {
                    B b10 = new B(this);
                    this.f37482c = b10;
                    this.f37480a.a(H9.b.class, b10);
                }
                this.f37481b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f37483d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f37469a.w();
        }
    }

    FirebaseMessaging(H9.e eVar, V9.a aVar, W9.b bVar, T9.d dVar, J j10, E e10, Executor executor, Executor executor2, Executor executor3) {
        this.f37478j = false;
        f37467n = bVar;
        this.f37469a = eVar;
        this.f37473e = new a(dVar);
        Context contextL = eVar.l();
        this.f37470b = contextL;
        C3122q c3122q = new C3122q();
        this.f37479k = c3122q;
        this.f37477i = j10;
        this.f37471c = e10;
        this.f37472d = new W(executor);
        this.f37474f = executor2;
        this.f37475g = executor3;
        Context contextL2 = eVar.l();
        if (contextL2 instanceof Application) {
            ((Application) contextL2).registerActivityLifecycleCallbacks(c3122q);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextL2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new C3123s(this));
        }
        executor2.execute(new RunnableC3124t(this));
        Task taskE = g0.e(this, j10, e10, contextL, AbstractC3120o.g());
        this.f37476h = taskE;
        taskE.addOnSuccessListener(executor2, new C3125u(this));
        executor2.execute(new RunnableC3126v(this));
    }

    FirebaseMessaging(H9.e eVar, V9.a aVar, W9.b bVar, W9.b bVar2, X9.e eVar2, W9.b bVar3, T9.d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, bVar3, dVar, new J(eVar.l()));
    }

    FirebaseMessaging(H9.e eVar, V9.a aVar, W9.b bVar, W9.b bVar2, X9.e eVar2, W9.b bVar3, T9.d dVar, J j10) {
        this(eVar, aVar, bVar3, dVar, j10, new E(eVar, j10, bVar, bVar2, eVar2), AbstractC3120o.f(), AbstractC3120o.c(), AbstractC3120o.b());
    }

    private boolean B() {
        P.c(this.f37470b);
        if (!P.d(this.f37470b)) {
            return false;
        }
        if (this.f37469a.j(I9.a.class) != null) {
            return true;
        }
        return I.a() && f37467n != null;
    }

    private synchronized void C() {
        if (!this.f37478j) {
            E(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (F(t())) {
            C();
        }
    }

    public static /* synthetic */ Task a(FirebaseMessaging firebaseMessaging, String str, b0.a aVar, String str2) {
        q(firebaseMessaging.f37470b).g(firebaseMessaging.r(), str, str2, firebaseMessaging.f37477i.a());
        if (aVar == null || !str2.equals(aVar.f37571a)) {
            firebaseMessaging.x(str2);
        }
        return Tasks.forResult(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.y()) {
            firebaseMessaging.D();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            taskCompletionSource.setResult(firebaseMessaging.l());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ L7.i d() {
        return null;
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, C3429a c3429a) {
        firebaseMessaging.getClass();
        if (c3429a != null) {
            I.y(c3429a.a4());
            firebaseMessaging.v();
        }
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull H9.e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.j(FirebaseMessaging.class);
        p170j8.r.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, g0 g0Var) {
        if (firebaseMessaging.y()) {
            g0Var.n();
        }
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            Tasks.await(firebaseMessaging.f37471c.c());
            q(firebaseMessaging.f37470b).d(firebaseMessaging.r(), J.c(firebaseMessaging.f37469a));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static synchronized FirebaseMessaging p() {
        return getInstance(H9.e.n());
    }

    private static synchronized b0 q(Context context) {
        try {
            if (f37466m == null) {
                f37466m = new b0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f37466m;
    }

    private String r() {
        return "[DEFAULT]".equals(this.f37469a.p()) ? "" : this.f37469a.r();
    }

    public static L7.i u() {
        return (L7.i) f37467n.get();
    }

    private void v() {
        this.f37471c.f().addOnSuccessListener(this.f37474f, new C3128x(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        P.c(this.f37470b);
        S.f(this.f37470b, this.f37471c, B());
        if (B()) {
            v();
        }
    }

    private void x(String str) {
        if ("[DEFAULT]".equals(this.f37469a.p())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f37469a.p());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C3119n(this.f37470b).g(intent);
        }
    }

    synchronized void A(boolean z10) {
        this.f37478j = z10;
    }

    synchronized void E(long j10) {
        n(new c0(this, Math.min(Math.max(30L, 2 * j10), f37465l)), j10);
        this.f37478j = true;
    }

    boolean F(b0.a aVar) {
        return aVar == null || aVar.b(this.f37477i.a());
    }

    String l() throws IOException {
        b0.a aVarT = t();
        if (!F(aVarT)) {
            return aVarT.f37571a;
        }
        String strC = J.c(this.f37469a);
        try {
            return (String) Tasks.await(this.f37472d.b(strC, new C3129y(this, strC, aVarT)));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public Task m() {
        if (t() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AbstractC3120o.e().execute(new RunnableC3130z(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    void n(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f37468o == null) {
                    f37468o = new ScheduledThreadPoolExecutor(1, new p260o8.a("TAG"));
                }
                f37468o.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context o() {
        return this.f37470b;
    }

    public Task s() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f37474f.execute(new RunnableC3127w(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    b0.a t() {
        return q(this.f37470b).e(r(), J.c(this.f37469a));
    }

    public boolean y() {
        return this.f37473e.c();
    }

    boolean z() {
        return this.f37477i.g();
    }
}
