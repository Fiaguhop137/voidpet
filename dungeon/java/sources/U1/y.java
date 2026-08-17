package U1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static y f12963f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f12965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f12966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12968e;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final y f12969a;

            public a(y yVar) {
                this.f12969a = yVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f12969a.m(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC1459a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(yVar);
                telephonyManager.registerTelephonyCallback(yVar.f12964a, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                yVar.m(5);
            }
        }
    }

    public interface c {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f12970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f12971b;

        public d(c cVar, Executor executor) {
            this.f12970a = new WeakReference(cVar);
            this.f12971b = executor;
        }

        public static /* synthetic */ void a(d dVar) {
            c cVar = (c) dVar.f12970a.get();
            if (cVar != null) {
                cVar.a(y.this.g());
            }
        }

        public void b() {
            this.f12971b.execute(new C(this));
        }

        public boolean c() {
            return this.f12970a.get() == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends BroadcastReceiver {
        private e() {
        }

        /* synthetic */ e(y yVar, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            y.this.f12964a.execute(new D(this, context));
        }
    }

    private y(Context context) {
        Executor executorA = AbstractC1460b.a();
        this.f12964a = executorA;
        this.f12965b = new CopyOnWriteArrayList();
        this.f12966c = new Object();
        this.f12967d = 0;
        executorA.execute(new x(this, context));
    }

    public static synchronized y e(Context context) {
        try {
            if (f12963f == null) {
                f12963f = new y(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12963f;
    }

    private static int f(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return Build.VERSION.SDK_INT >= 29 ? 9 : 0;
        }
    }

    private static int h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return f(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        int iH = h(context);
        if (Build.VERSION.SDK_INT < 31 || iH != 5) {
            m(iH);
        } else {
            b.a(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new e(this, null), intentFilter);
    }

    private void l() {
        for (d dVar : this.f12965b) {
            if (dVar.c()) {
                this.f12965b.remove(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i10) {
        l();
        synchronized (this.f12966c) {
            try {
                if (this.f12968e && this.f12967d == i10) {
                    return;
                }
                this.f12968e = true;
                this.f12967d = i10;
                Iterator it = this.f12965b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int g() {
        int i10;
        synchronized (this.f12966c) {
            i10 = this.f12967d;
        }
        return i10;
    }

    public void k(c cVar, Executor executor) {
        boolean z10;
        l();
        d dVar = new d(cVar, executor);
        synchronized (this.f12966c) {
            this.f12965b.add(dVar);
            z10 = this.f12968e;
        }
        if (z10) {
            dVar.b();
        }
    }
}
