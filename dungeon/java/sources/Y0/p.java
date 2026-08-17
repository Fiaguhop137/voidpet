package Y0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f16756d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static f f16759g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f16761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f16755c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set f16757e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f16758f = new Object();

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void d(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel f(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List g(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List h(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    static class c {
        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    private static class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f16762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f16763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f16764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f16765d;

        d(String str, int i10, String str2, Notification notification) {
            this.f16762a = str;
            this.f16763b = i10;
            this.f16764c = str2;
            this.f16765d = notification;
        }

        @Override // Y0.p.g
        public void a(p018b.a aVar) {
            aVar.W0(this.f16762a, this.f16763b, this.f16764c, this.f16765d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f16762a + ", id:" + this.f16763b + ", tag:" + this.f16764c + "]";
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f16766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f16767b;

        e(ComponentName componentName, IBinder iBinder) {
            this.f16766a = componentName;
            this.f16767b = iBinder;
        }
    }

    private static class f implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f16768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f16769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f16770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f16771d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set f16772e = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f16773a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            p018b.a f16775c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f16774b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque f16776d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f16777e = 0;

            a(ComponentName componentName) {
                this.f16773a = componentName;
            }
        }

        f(Context context) {
            this.f16768a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f16769b = handlerThread;
            handlerThread.start();
            this.f16770c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f16774b) {
                return true;
            }
            boolean zBindService = this.f16768a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f16773a), this, 33);
            aVar.f16774b = zBindService;
            if (zBindService) {
                aVar.f16777e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f16773a);
                this.f16768a.unbindService(this);
            }
            return aVar.f16774b;
        }

        private void b(a aVar) {
            if (aVar.f16774b) {
                this.f16768a.unbindService(this);
                aVar.f16774b = false;
            }
            aVar.f16775c = null;
        }

        private void c(g gVar) {
            j();
            for (a aVar : this.f16771d.values()) {
                aVar.f16776d.add(gVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f16771d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f16771d.get(componentName);
            if (aVar != null) {
                aVar.f16775c = p018b.a.AbstractBinderC0340a.g(iBinder);
                aVar.f16777e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f16771d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f16773a + ", " + aVar.f16776d.size() + " queued tasks");
            }
            if (aVar.f16776d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f16775c == null) {
                i(aVar);
                return;
            }
            while (true) {
                g gVar = (g) aVar.f16776d.peek();
                if (gVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + gVar);
                    }
                    gVar.a(aVar.f16775c);
                    aVar.f16776d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f16773a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f16773a, e10);
                }
            }
            if (aVar.f16776d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f16770c.hasMessages(3, aVar.f16773a)) {
                return;
            }
            int i10 = aVar.f16777e;
            int i11 = i10 + 1;
            aVar.f16777e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f16770c.sendMessageDelayed(this.f16770c.obtainMessage(3, aVar.f16773a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f16776d.size() + " tasks to " + aVar.f16773a + " after " + aVar.f16777e + " retries");
            aVar.f16776d.clear();
        }

        private void j() {
            Set setI = p.i(this.f16768a);
            if (setI.equals(this.f16772e)) {
                return;
            }
            this.f16772e = setI;
            List<ResolveInfo> listQueryIntentServices = this.f16768a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setI.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f16771d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f16771d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f16771d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(g gVar) {
            this.f16770c.obtainMessage(0, gVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((g) message.obj);
                return true;
            }
            if (i10 == 1) {
                e eVar = (e) message.obj;
                e(eVar.f16766a, eVar.f16767b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f16770c.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f16770c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface g {
        void a(p018b.a aVar);
    }

    private p(Context context) {
        this.f16760a = context;
        this.f16761b = (NotificationManager) context.getSystemService("notification");
    }

    public static p h(Context context) {
        return new p(context);
    }

    public static Set i(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f16755c) {
            if (string != null) {
                try {
                    if (!string.equals(f16756d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f16757e = hashSet;
                        f16756d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f16757e;
        }
        return set;
    }

    private void p(g gVar) {
        synchronized (f16758f) {
            try {
                if (f16759g == null) {
                    f16759g = new f(this.f16760a.getApplicationContext());
                }
                f16759g.h(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean q(Notification notification) {
        Bundle bundleD = l.d(notification);
        return bundleD != null && bundleD.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f16761b);
    }

    public void b(String str, int i10) {
        this.f16761b.cancel(str, i10);
    }

    public void c() {
        this.f16761b.cancelAll();
    }

    public void d(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f16761b, notificationChannel);
        }
    }

    public void e(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.b(this.f16761b, notificationChannelGroup);
        }
    }

    public void f(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.c(this.f16761b, str);
        }
    }

    public void g(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.d(this.f16761b, str);
        }
    }

    public int j() {
        return a.b(this.f16761b);
    }

    public NotificationChannel k(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(this.f16761b, str);
        }
        return null;
    }

    public NotificationChannelGroup l(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return c.a(this.f16761b, str);
        }
        if (i10 >= 26) {
            Iterator it = m().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupA = o.a(it.next());
                if (b.e(notificationChannelGroupA).equals(str)) {
                    return notificationChannelGroupA;
                }
            }
        }
        return null;
    }

    public List m() {
        return Build.VERSION.SDK_INT >= 26 ? b.g(this.f16761b) : Collections.EMPTY_LIST;
    }

    public List n() {
        return Build.VERSION.SDK_INT >= 26 ? b.h(this.f16761b) : Collections.EMPTY_LIST;
    }

    public void o(String str, int i10, Notification notification) {
        if (!q(notification)) {
            this.f16761b.notify(str, i10, notification);
        } else {
            p(new d(this.f16760a.getPackageName(), i10, str, notification));
            this.f16761b.cancel(str, i10);
        }
    }
}
