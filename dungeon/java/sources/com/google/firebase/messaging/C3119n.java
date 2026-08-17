package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3119n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f37638c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static o0 f37639d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f37641b = new androidx.privacysandbox.ads.adservices.measurement.k();

    public C3119n(Context context) {
        this.f37640a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z10, Task task) {
        return (com.google.android.gms.common.util.m.g() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z10).continueWith(new androidx.privacysandbox.ads.adservices.measurement.k(), new C3117l()) : task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer d(Task task) {
        return 403;
    }

    private static Task e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        o0 o0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return o0VarF.d(intent).continueWith(new androidx.privacysandbox.ads.adservices.measurement.k(), new C3118m());
        }
        if (Y.b().e(context)) {
            j0.e(context, o0VarF, intent);
        } else {
            o0VarF.d(intent);
        }
        return Tasks.forResult(-1);
    }

    private static o0 f(Context context, String str) {
        o0 o0Var;
        synchronized (f37638c) {
            try {
                if (f37639d == null) {
                    f37639d = new o0(context, str);
                }
                o0Var = f37639d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }

    public Task g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f37640a, intent);
    }

    public Task h(Context context, Intent intent) {
        boolean z10 = com.google.android.gms.common.util.m.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.call(this.f37641b, new CallableC3115j(context, intent)).continueWithTask(this.f37641b, new C3116k(context, intent, z11)) : e(context, intent, z11);
    }
}
