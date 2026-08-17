package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Class f38602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Class f38603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Class f38604h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f38605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f38606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f38607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f38608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f38609e;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements InvocationHandler {

        /* JADX INFO: renamed from: com.learnium.RNDeviceInfo.i$a$a, reason: collision with other inner class name */
        class RunnableC0419a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f38611a;

            RunnableC0419a(int i10) {
                this.f38611a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f38611a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        private a() {
        }

        /* synthetic */ a(i iVar, j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            try {
                Log.d("InstallReferrerState", "OK");
                String str = (String) i.f38604h.getMethod("getInstallReferrer", null).invoke(i.f38602f.getMethod("getInstallReferrer", null).invoke(i.this.f38606b, null), null);
                SharedPreferences.Editor editorEdit = i.this.f38605a.edit();
                editorEdit.putString("installReferrer", str);
                editorEdit.apply();
                i.f38602f.getMethod("endConnection", null).invoke(i.this.f38606b, null);
            } catch (Exception e10) {
                System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
                e10.printStackTrace(System.err);
            }
        }

        public void c() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void d(int i10) {
            if (i10 == 0) {
                i.this.f38608d.execute(new h(this));
            } else if (i10 == 1) {
                Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
            } else {
                if (i10 != 2) {
                    return;
                }
                Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        i.this.f38609e.post(new RunnableC0419a(((Integer) obj2).intValue()));
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                i.this.f38609e.post(new b());
                return null;
            } catch (Exception e10) {
                throw new RuntimeException("unexpected invocation exception: " + e10.getMessage());
            }
        }
    }

    static {
        try {
            f38602f = InstallReferrerClient.class;
            f38603g = InstallReferrerStateListener.class;
            f38604h = ReferrerDetails.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    i(Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f38608d = executorServiceNewSingleThreadExecutor;
        this.f38609e = new Handler(Looper.getMainLooper());
        this.f38605a = context.getSharedPreferences("react-native-device-info", 0);
        if (f38602f == null || f38603g == null || f38604h == null) {
            return;
        }
        executorServiceNewSingleThreadExecutor.execute(new g(this, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        try {
            Object objInvoke = f38602f.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f38606b = objInvoke.getClass().getMethod("build", null).invoke(objInvoke, null);
            this.f38607c = Proxy.newProxyInstance(f38603g.getClassLoader(), new Class[]{f38603g}, new a(this, null));
            f38602f.getMethod("startConnection", f38603g).invoke(this.f38606b, this.f38607c);
        } catch (Exception e10) {
            System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
            e10.printStackTrace(System.err);
        }
    }
}
