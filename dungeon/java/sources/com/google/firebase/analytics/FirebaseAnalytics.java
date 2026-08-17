package com.google.firebase.analytics;

import T8.E;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.C2651z1;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f37340c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2651z1 f37341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f37342b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(C2651z1 c2651z1) {
        r.l(c2651z1);
        this.f37341a = c2651z1;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f37340c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f37340c == null) {
                        f37340c = new FirebaseAnalytics(C2651z1.s(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37340c;
    }

    @Keep
    public static E getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2651z1 c2651z1S = C2651z1.s(context, bundle);
        if (c2651z1S == null) {
            return null;
        }
        return new d(c2651z1S);
    }

    private final ExecutorService l() throws Throwable {
        FirebaseAnalytics firebaseAnalytics;
        synchronized (FirebaseAnalytics.class) {
            try {
                try {
                    if (this.f37342b == null) {
                        firebaseAnalytics = this;
                        firebaseAnalytics.f37342b = new com.google.firebase.analytics.a(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    } else {
                        firebaseAnalytics = this;
                    }
                    return firebaseAnalytics.f37342b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public Task a() {
        try {
            return Tasks.call(l(), new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e10) {
            this.f37341a.d(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public Task b() {
        try {
            return Tasks.call(l(), new c(this));
        } catch (RuntimeException e10) {
            this.f37341a.d(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public void c(String str, Bundle bundle) {
        this.f37341a.v(str, bundle);
    }

    public void d() {
        this.f37341a.F();
    }

    public void e(boolean z10) {
        this.f37341a.D(Boolean.valueOf(z10));
    }

    public void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f37341a.E(bundle);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f37341a.i(bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(com.google.firebase.installations.c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(long j10) {
        this.f37341a.G(j10);
    }

    public void i(String str) {
        this.f37341a.B(str);
    }

    public void j(String str, String str2) {
        this.f37341a.x(null, str, str2, false);
    }

    final /* synthetic */ C2651z1 k() {
        return this.f37341a;
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f37341a.C(J0.a4(activity), str, str2);
    }
}
