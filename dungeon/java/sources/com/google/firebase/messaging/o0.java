package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class o0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f37644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f37645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f37646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l0 f37647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37648f;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f37649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource f37650b = new TaskCompletionSource();

        a(Intent intent) {
            this.f37649a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f37649a.getAction() + " finishing.");
            aVar.d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            e().addOnCompleteListener(scheduledExecutorService, new n0(scheduledExecutorService.schedule(new m0(this), 20L, TimeUnit.SECONDS)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f37650b.trySetResult(null);
        }

        Task e() {
            return this.f37650b.getTask();
        }
    }

    o0(Context context, String str) {
        this(context, str, a());
    }

    o0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f37646d = new ArrayDeque();
        this.f37648f = false;
        Context applicationContext = context.getApplicationContext();
        this.f37643a = applicationContext;
        this.f37644b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f37645c = scheduledExecutorService;
    }

    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new p260o8.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f37646d.isEmpty()) {
            ((a) this.f37646d.poll()).d();
        }
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f37646d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                l0 l0Var = this.f37647e;
                if (l0Var == null || !l0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f37647e.b((a) this.f37646d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f37648f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f37648f) {
            return;
        }
        this.f37648f = true;
        try {
            if (p242n8.a.b().a(this.f37643a, this.f37644b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f37648f = false;
        b();
    }

    synchronized Task d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f37645c);
            this.f37646d.add(aVar);
            c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f37648f = false;
            if (iBinder instanceof l0) {
                this.f37647e = (l0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }
}
