package io.sentry.android.core.cache;

import io.sentry.C3771q2;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.H;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.internal.util.C3648h;
import io.sentry.android.core.performance.h;
import io.sentry.transport.o;
import io.sentry.util.AbstractC3807i;
import io.sentry.util.l;
import io.sentry.util.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends io.sentry.cache.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final List f44864k = Arrays.asList(new a(AnrV2Integration.a.class, "ANR", "last_anr_report", new io.sentry.android.core.cache.a()), new a(TombstoneIntegration.a.class, "Tombstone", "last_tombstone_report", new b()));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o f44865j;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f44866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f44867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f44868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC0520a f44869d;

        /* JADX INFO: renamed from: io.sentry.android.core.cache.f$a$a, reason: collision with other inner class name */
        interface InterfaceC0520a {
            Long a(Object obj);
        }

        a(Class cls, String str, String str2, InterfaceC0520a interfaceC0520a) {
            this.f44866a = cls;
            this.f44867b = str;
            this.f44868c = str2;
            this.f44869d = interfaceC0520a;
        }

        public static /* synthetic */ void a(a aVar, SentryAndroidOptions sentryAndroidOptions, f fVar, Object obj) {
            Long lA = aVar.f44869d.a(obj);
            sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "Writing last reported %s marker with timestamp %d", aVar.f44867b, lA);
            fVar.Y(lA, aVar.f44868c, aVar.f44867b);
        }

        void b(f fVar, H h10, SentryAndroidOptions sentryAndroidOptions) {
            l.h(h10, this.f44866a, new e(this, sentryAndroidOptions, fVar));
        }
    }

    public f(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, C3648h.b());
    }

    f(SentryAndroidOptions sentryAndroidOptions, o oVar) {
        super(sentryAndroidOptions, (String) w.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f44865j = oVar;
    }

    public static boolean R(C3833z3 c3833z3) {
        String outboxPath = c3833z3.getOutboxPath();
        if (outboxPath == null) {
            c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean zBooleanValue = ((Boolean) c3833z3.getRuntimeManager().a(new c(file))).booleanValue();
            if (!zBooleanValue || ((Boolean) c3833z3.getRuntimeManager().a(new d(file))).booleanValue()) {
                return zBooleanValue;
            }
            c3833z3.getLogger().c(EnumC3721i3.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zBooleanValue;
        } catch (Throwable th) {
            c3833z3.getLogger().b(EnumC3721i3.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    public static Long T(C3833z3 c3833z3) {
        return U(c3833z3, "last_anr_report", "ANR");
    }

    private static Long U(C3833z3 c3833z3, String str, String str2) {
        File file = new File((String) w.c(c3833z3.getCacheDirPath(), "Cache dir path should be set for getting " + str2 + "s reported"), str);
        try {
            String strC = AbstractC3807i.c(file);
            if (strC != null && !strC.equals("null")) {
                return Long.valueOf(Long.parseLong(strC.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                c3833z3.getLogger().c(EnumC3721i3.DEBUG, "Last " + str2 + " marker does not exist. %s.", file.getAbsolutePath());
            } else {
                c3833z3.getLogger().b(EnumC3721i3.ERROR, "Error reading last " + str2 + " marker", th);
            }
            return null;
        }
    }

    public static Long W(C3833z3 c3833z3) {
        return U(c3833z3, "last_tombstone_report", "Tombstone");
    }

    private boolean X(C3771q2 c3771q2, H h10) {
        boolean zT2 = super.T2(c3771q2, h10);
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f45697a;
        h hVarR = io.sentry.android.core.performance.f.q().r();
        if (l.f(h10, UncaughtExceptionHandlerIntegration.a.class) && hVarR.x()) {
            long jA = this.f44865j.a() - hVarR.u();
            if (jA <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(EnumC3721i3.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jA));
                Z();
            }
        }
        Iterator it = f44864k.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this, h10, sentryAndroidOptions);
        }
        return zT2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(Long l10, String str, String str2) {
        String cacheDirPath = this.f45697a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Cache dir path is null, the " + str2 + " marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(f45696e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Error writing the " + str2 + " marker to the disk", th3);
        }
    }

    private void Z() {
        String outboxPath = this.f45697a.getOutboxPath();
        if (outboxPath == null) {
            this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th) {
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public boolean T2(C3771q2 c3771q2, H h10) {
        return X(c3771q2, h10);
    }
}
