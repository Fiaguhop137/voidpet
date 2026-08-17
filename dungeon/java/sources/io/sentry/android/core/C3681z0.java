package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.AbstractC3732l;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3698e0;
import io.sentry.protocol.C3761e;
import io.sentry.util.C3799a;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.android.core.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3681z0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile C3681z0 f45215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C3799a f45216j = new C3799a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f45218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3636g0 f45219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f45220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC3662p0.a f45221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC3662p0.b f45222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.protocol.n f45223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f45224h;

    /* JADX INFO: renamed from: io.sentry.android.core.z0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45225a;

        static {
            int[] iArr = new int[io.sentry.M.a.values().length];
            f45225a = iArr;
            try {
                iArr[io.sentry.M.a.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45225a[io.sentry.M.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C3681z0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f45217a = context;
        this.f45218b = sentryAndroidOptions;
        C3636g0 c3636g0 = new C3636g0(sentryAndroidOptions.getLogger());
        this.f45219c = c3636g0;
        io.sentry.android.core.internal.util.p.a().c();
        this.f45223g = w();
        this.f45220d = c3636g0.f();
        this.f45221e = AbstractC3662p0.v(context, sentryAndroidOptions.getLogger(), c3636g0);
        this.f45222f = AbstractC3662p0.w(context, c3636g0);
        ActivityManager.MemoryInfo memoryInfoN = AbstractC3662p0.n(context, sentryAndroidOptions.getLogger());
        if (memoryInfoN != null) {
            this.f45224h = Long.valueOf(memoryInfoN.totalMem);
        } else {
            this.f45224h = null;
        }
    }

    public static /* synthetic */ void b(C3681z0 c3681z0, C3761e c3761e, boolean z10) {
        StatFs statFsJ;
        c3681z0.getClass();
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory != null) {
            StatFs statFs = new StatFs(dataDirectory.getPath());
            c3761e.o0(c3681z0.r(statFs));
            c3761e.X(c3681z0.u(statFs));
        }
        if (!z10 || (statFsJ = c3681z0.j(c3681z0.f45217a.getExternalFilesDir(null))) == null) {
            return;
        }
        c3761e.U(c3681z0.q(statFsJ));
        c3761e.T(c3681z0.t(statFsJ));
    }

    private Intent d() {
        return AbstractC3662p0.u(this.f45217a, this.f45219c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
    }

    public static Float e(Intent intent, C3833z3 c3833z3) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            c3833z3.getLogger().b(EnumC3721i3.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    private Float f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f45218b.getLogger().b(EnumC3721i3.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    private Date g() {
        try {
            return AbstractC3732l.e(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e10) {
            this.f45218b.getLogger().a(EnumC3721i3.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String h() {
        try {
            return (String) this.f45218b.getRuntimeManager().a(new C3677x0(this));
        } catch (Throwable th) {
            this.f45218b.getLogger().b(EnumC3721i3.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private File i(File file) {
        File[] externalFilesDirs = this.f45217a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f45218b.getLogger().c(EnumC3721i3.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs j(File file) {
        try {
            File fileI = i(file);
            if (fileI != null) {
                return new StatFs(fileI.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.f45218b.getLogger().c(EnumC3721i3.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public static C3681z0 k(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f45215i == null) {
            InterfaceC3698e0 interfaceC3698e0A = f45216j.a();
            try {
                if (f45215i == null) {
                    f45215i = new C3681z0(AbstractC3662p0.g(context), sentryAndroidOptions);
                }
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
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
        return f45215i;
    }

    private C3761e.b m() {
        C3761e.b bVarA;
        Throwable th;
        try {
            bVarA = io.sentry.android.core.internal.util.r.a(this.f45217a.getResources().getConfiguration().orientation);
            if (bVarA != null) {
                return bVarA;
            }
            try {
                this.f45218b.getLogger().c(EnumC3721i3.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th2) {
                th = th2;
                this.f45218b.getLogger().b(EnumC3721i3.ERROR, "Error getting device orientation.", th);
                return bVarA;
            }
        } catch (Throwable th3) {
            bVarA = null;
            th = th3;
        }
    }

    private TimeZone p() {
        if (this.f45219c.d() >= 24) {
            LocaleList locales = this.f45217a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long q(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f45218b.getLogger().b(EnumC3721i3.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    private Long r(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f45218b.getLogger().b(EnumC3721i3.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    private Long t(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f45218b.getLogger().b(EnumC3721i3.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    private Long u(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f45218b.getLogger().b(EnumC3721i3.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    public static Boolean v(Intent intent, C3833z3 c3833z3) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th) {
            c3833z3.getLogger().b(EnumC3721i3.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    private io.sentry.protocol.n w() {
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        nVar.j("Android");
        nVar.m(Build.VERSION.RELEASE);
        nVar.h(Build.DISPLAY);
        String strM = AbstractC3662p0.m(this.f45218b.getLogger());
        if (strM != null) {
            nVar.i(strM);
        }
        if (this.f45218b.isEnableRootCheck()) {
            nVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.x(this.f45217a, this.f45219c, this.f45218b.getLogger()).e()));
        }
        return nVar;
    }

    private void x(C3761e c3761e, boolean z10, boolean z11) {
        Boolean bool;
        Intent intentD = d();
        if (intentD != null) {
            c3761e.M(e(intentD, this.f45218b));
            c3761e.Q(v(intentD, this.f45218b));
            c3761e.N(f(intentD));
        }
        int i10 = a.f45225a[this.f45218b.getConnectionStatusProvider().o1().ordinal()];
        if (i10 != 1) {
            bool = i10 != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        c3761e.f0(bool);
        ActivityManager.MemoryInfo memoryInfoN = AbstractC3662p0.n(this.f45217a, this.f45218b.getLogger());
        if (memoryInfoN != null && z10) {
            c3761e.W(Long.valueOf(memoryInfoN.availMem));
            c3761e.a0(Boolean.valueOf(memoryInfoN.lowMemory));
        }
        this.f45218b.getRuntimeManager().b(new RunnableC3679y0(this, c3761e, z11));
        if (c3761e.I() == null) {
            c3761e.S(this.f45218b.getConnectionStatusProvider().p0());
        }
    }

    public C3761e c(boolean z10, boolean z11) {
        C3761e c3761e = new C3761e();
        c3761e.b0(Build.MANUFACTURER);
        c3761e.P(Build.BRAND);
        c3761e.V(AbstractC3662p0.l(this.f45218b.getLogger()));
        c3761e.d0(Build.MODEL);
        c3761e.e0(Build.ID);
        c3761e.L(AbstractC3662p0.j());
        if (this.f45219c.d() >= 31) {
            c3761e.R(Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL);
        }
        c3761e.g0(m());
        Boolean bool = this.f45220d;
        if (bool != null) {
            c3761e.n0(bool);
        }
        DisplayMetrics displayMetricsK = AbstractC3662p0.k(this.f45217a, this.f45218b.getLogger());
        if (displayMetricsK != null) {
            c3761e.m0(Integer.valueOf(displayMetricsK.widthPixels));
            c3761e.l0(Integer.valueOf(displayMetricsK.heightPixels));
            c3761e.j0(Float.valueOf(displayMetricsK.density));
            c3761e.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        c3761e.O(g());
        c3761e.p0(p());
        if (c3761e.J() == null) {
            c3761e.Y(h());
        }
        Locale locale = Locale.getDefault();
        if (c3761e.K() == null) {
            c3761e.Z(locale.toString());
        }
        List listC = io.sentry.android.core.internal.util.p.a().c();
        if (!listC.isEmpty()) {
            c3761e.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            c3761e.h0(Integer.valueOf(listC.size()));
        }
        c3761e.c0(this.f45224h);
        if (z10 && this.f45218b.isCollectAdditionalContext()) {
            x(c3761e, z11, this.f45218b.isCollectExternalStorageContext());
        }
        return c3761e;
    }

    public io.sentry.protocol.n l() {
        return this.f45223g;
    }

    public AbstractC3662p0.a n() {
        return this.f45221e;
    }

    public AbstractC3662p0.b o() {
        return this.f45222f;
    }

    public Long s() {
        return this.f45224h;
    }
}
