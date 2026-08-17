package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2651z1;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34951a;

    public D5(Context context) {
        p170j8.r.l(context);
        this.f34951a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    private final void k(q6 q6Var, Runnable runnable) {
        q6Var.b().t(new RunnableC3097z5(this, q6Var, runnable));
    }

    public final void a() {
        Log.v("FA", this.f34951a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.f34951a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(Intent intent, int i10, int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f34951a;
        X2 x2O = X2.O(context, null, null);
        C3032q2 c3032q2A = x2O.a();
        String action = intent.getAction();
        x2O.c();
        c3032q2A.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(q6.F(context), new C5(this, i11, c3032q2A, intent));
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC3095z3(q6.F(this.f34951a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean e(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) p170j8.r.l(string);
            q6 q6VarF = q6.F(this.f34951a);
            C3032q2 c3032q2A = q6VarF.a();
            q6VarF.c();
            c3032q2A.w().b("Local AppMeasurementJobService called. action", str);
            k(q6VarF, new A5(this, c3032q2A, jobParameters));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C2651z1.s(this.f34951a, null).J(new B5(this, jobParameters));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(int i10, C3032q2 c3032q2, Intent intent) {
        Context context = this.f34951a;
        T8.I i11 = (T8.I) context;
        if (i11.e(i10)) {
            c3032q2.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            X2.O(context, null, null).a().w().a("Completed wakeful intent.");
            i11.f(intent);
        }
    }

    final /* synthetic */ void g(C3032q2 c3032q2, JobParameters jobParameters) {
        c3032q2.w().a("AppMeasurementJobService processed last upload request.");
        ((T8.I) this.f34951a).g(jobParameters, false);
    }

    final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((T8.I) this.f34951a).g(jobParameters, false);
    }
}
