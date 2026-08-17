package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
class g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f37603i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J f37605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f37606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f37607d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f37609f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0 f37611h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f37608e = new C4101a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37610g = false;

    private g0(FirebaseMessaging firebaseMessaging, J j10, e0 e0Var, E e10, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f37607d = firebaseMessaging;
        this.f37605b = j10;
        this.f37611h = e0Var;
        this.f37606c = e10;
        this.f37604a = context;
        this.f37609f = scheduledExecutorService;
    }

    public static /* synthetic */ g0 a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, J j10, E e10) {
        return new g0(firebaseMessaging, j10, e0.a(context, scheduledExecutorService), e10, context, scheduledExecutorService);
    }

    private static void b(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void c(String str) throws IOException {
        b(this.f37606c.m(this.f37607d.l(), str));
    }

    private void d(String str) throws IOException {
        b(this.f37606c.n(this.f37607d.l(), str));
    }

    static Task e(FirebaseMessaging firebaseMessaging, J j10, E e10, Context context, ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new f0(context, scheduledExecutorService, firebaseMessaging, j10, e10));
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private void i(d0 d0Var) {
        synchronized (this.f37608e) {
            try {
                String strE = d0Var.e();
                if (this.f37608e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f37608e.get(strE);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f37608e.remove(strE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void m() {
        if (h()) {
            return;
        }
        p(0L);
    }

    boolean f() {
        return this.f37611h.b() != null;
    }

    synchronized boolean h() {
        return this.f37610g;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    boolean j(d0 d0Var) throws IOException {
        byte b10;
        try {
            String strB = d0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strB.equals("U")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strB.equals("S")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                c(d0Var.c());
                if (g()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + d0Var.c() + " succeeded.");
                }
            } else if (b10 == 1) {
                d(d0Var.c());
                if (g()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + d0Var.c() + " succeeded.");
                }
            } else if (g()) {
                Log.d("FirebaseMessaging", "Unknown topic operation" + d0Var + ".");
            }
            return true;
        } catch (IOException e10) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    void k(Runnable runnable, long j10) {
        this.f37609f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    synchronized void l(boolean z10) {
        this.f37610g = z10;
    }

    void n() {
        if (f()) {
            m();
        }
    }

    boolean o() {
        while (true) {
            synchronized (this) {
                try {
                    d0 d0VarB = this.f37611h.b();
                    if (d0VarB == null) {
                        if (g()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                    if (!j(d0VarB)) {
                        return false;
                    }
                    this.f37611h.d(d0VarB);
                    i(d0VarB);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void p(long j10) {
        k(new h0(this, this.f37604a, this.f37605b, Math.min(Math.max(30L, 2 * j10), f37603i)), j10);
        l(true);
    }
}
