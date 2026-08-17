package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.C3697e;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3619a0;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3753p0;
import io.sentry.android.core.internal.util.C3648h;
import io.sentry.util.C3799a;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC3753p0, Closeable, C3628c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile b f44764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f44765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC3619a0 f44766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f44767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f44768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f44769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile IntentFilter f44770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile HandlerThread f44771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f44772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C3799a f44773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f44774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Handler f44775m;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f44776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Boolean f44777b;

        a(Integer num, Boolean bool) {
            this.f44776a = num;
            this.f44777b = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.w.a(this.f44776a, aVar.f44776a) && io.sentry.util.w.a(this.f44777b, aVar.f44777b);
        }

        public int hashCode() {
            return io.sentry.util.w.b(this.f44776a, this.f44777b);
        }
    }

    final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3619a0 f44778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SentryAndroidOptions f44779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.android.core.internal.util.q f44780c = new io.sentry.android.core.internal.util.q(C3648h.b(), 60000, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f44781d = new char[64];

        b(InterfaceC3619a0 interfaceC3619a0, SentryAndroidOptions sentryAndroidOptions) {
            this.f44778a = interfaceC3619a0;
            this.f44779b = sentryAndroidOptions;
        }

        private C3697e a(long j10, Intent intent, String str, a aVar) {
            Bundle extras;
            C3697e c3697e = new C3697e(j10);
            c3697e.K("system");
            c3697e.F("device.event");
            String strB = b(str);
            if (strB != null) {
                c3697e.G("action", strB);
            }
            if (aVar != null) {
                if (aVar.f44776a != null) {
                    c3697e.G("level", aVar.f44776a);
                }
                if (aVar.f44777b != null) {
                    c3697e.G("charging", aVar.f44777b);
                }
            } else if (this.f44779b.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th) {
                        this.f44779b.getLogger().a(EnumC3721i3.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                c3697e.G("extras", map);
            }
            c3697e.H(EnumC3721i3.INFO);
            return c3697e;
        }

        String b(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.f44781d.length;
            for (int i10 = length - 1; i10 >= 0; i10--) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '.') {
                    char[] cArr = this.f44781d;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return io.sentry.util.D.d(str);
                }
                length2--;
                this.f44781d[length2] = cCharAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a aVar;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                aVar = null;
            } else {
                if (this.f44780c.a()) {
                    return;
                }
                Float fE = C3681z0.e(intent, this.f44779b);
                a aVar2 = new a(fE != null ? Integer.valueOf(fE.intValue()) : null, C3681z0.v(intent, this.f44779b));
                if (aVar2.equals(SystemEventsBreadcrumbsIntegration.this.f44774l)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.f44774l = aVar2;
                aVar = aVar2;
            }
            C3697e c3697eA = a(System.currentTimeMillis(), intent, action, aVar);
            io.sentry.H h10 = new io.sentry.H();
            h10.l("android:intent", intent);
            this.f44778a.e(c3697eA, h10);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, h(), null);
    }

    SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, Handler handler) {
        this.f44768f = false;
        this.f44769g = false;
        this.f44770h = null;
        this.f44771i = null;
        this.f44772j = new AtomicBoolean(false);
        this.f44773k = new C3799a();
        this.f44775m = null;
        this.f44763a = AbstractC3662p0.g(context);
        this.f44767e = strArr;
        this.f44775m = handler;
    }

    public static /* synthetic */ void d(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC3619a0 interfaceC3619a0, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC3698e0 interfaceC3698e0A = systemEventsBreadcrumbsIntegration.f44773k.a();
        try {
            if (!systemEventsBreadcrumbsIntegration.f44768f && !systemEventsBreadcrumbsIntegration.f44769g && systemEventsBreadcrumbsIntegration.f44764b == null) {
                systemEventsBreadcrumbsIntegration.f44764b = systemEventsBreadcrumbsIntegration.new b(interfaceC3619a0, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.f44770h == null) {
                    systemEventsBreadcrumbsIntegration.f44770h = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.f44767e) {
                        systemEventsBreadcrumbsIntegration.f44770h.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f44775m == null && systemEventsBreadcrumbsIntegration.f44771i == null) {
                    systemEventsBreadcrumbsIntegration.f44771i = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f44771i.start();
                }
                try {
                    Handler handler = systemEventsBreadcrumbsIntegration.f44775m;
                    if (handler == null) {
                        handler = new Handler(systemEventsBreadcrumbsIntegration.f44771i.getLooper());
                    }
                    AbstractC3662p0.t(systemEventsBreadcrumbsIntegration.f44763a, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.f44764b, systemEventsBreadcrumbsIntegration.f44770h, handler);
                    if (!systemEventsBreadcrumbsIntegration.f44772j.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.n.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().b(EnumC3721i3.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
                }
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private static String[] h() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    private void i(InterfaceC3619a0 interfaceC3619a0, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f44768f && !this.f44769g && this.f44764b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new i1(this, interfaceC3619a0, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(EnumC3721i3.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void k() {
        SentryAndroidOptions sentryAndroidOptions = this.f44765c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new h1(this));
        } catch (RejectedExecutionException unused) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44773k.a();
        try {
            this.f44769g = true;
            b bVar = this.f44764b;
            this.f44764b = null;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            if (bVar != null) {
                this.f44763a.unregisterReceiver(bVar);
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.C3628c0.a
    public void a() {
        if (this.f44766d == null || this.f44765c == null) {
            return;
        }
        this.f44769g = false;
        i(this.f44766d, this.f44765c);
    }

    @Override // io.sentry.android.core.C3628c0.a
    public void b() {
        k();
    }

    @Override // io.sentry.InterfaceC3753p0
    public void c(InterfaceC3619a0 interfaceC3619a0, C3833z3 c3833z3) {
        io.sentry.util.w.c(interfaceC3619a0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c3833z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c3833z3 : null, "SentryAndroidOptions is required");
        this.f44765c = sentryAndroidOptions;
        this.f44766d = interfaceC3619a0;
        sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f44765c.isEnableSystemEventBreadcrumbs()));
        if (this.f44765c.isEnableSystemEventBreadcrumbs()) {
            C3628c0.g().d(this);
            if (AbstractC3662p0.s()) {
                i(this.f44766d, this.f44765c);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC3698e0 interfaceC3698e0A = this.f44773k.a();
        try {
            this.f44768f = true;
            this.f44770h = null;
            if (this.f44771i != null) {
                this.f44771i.quit();
            }
            this.f44771i = null;
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            C3628c0.g().k(this);
            k();
            SentryAndroidOptions sentryAndroidOptions = this.f44765c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
