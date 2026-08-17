package io.sentry.android.ndk;

import io.sentry.AbstractC3732l;
import io.sentry.C3697e;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.H1;
import io.sentry.T3;
import io.sentry.Y;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.I;
import io.sentry.util.w;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3833z3 f45245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.ndk.a f45246b;

    public i(C3833z3 c3833z3) {
        this(c3833z3, new NativeScope());
    }

    i(C3833z3 c3833z3, io.sentry.ndk.a aVar) {
        this.f45245a = (C3833z3) w.c(c3833z3, "The SentryOptions object is required.");
        this.f45246b = (io.sentry.ndk.a) w.c(aVar, "The NativeScope object is required.");
    }

    public static /* synthetic */ void n(i iVar, I i10) {
        if (i10 == null) {
            iVar.f45246b.e();
        } else {
            iVar.f45246b.g(i10.i(), i10.h(), i10.j(), i10.k());
        }
    }

    public static /* synthetic */ void q(i iVar, C3697e c3697e) {
        iVar.getClass();
        String strF = null;
        String lowerCase = c3697e.x() != null ? c3697e.x().name().toLowerCase(Locale.ROOT) : null;
        String strH = AbstractC3732l.h(c3697e.A());
        try {
            Map mapW = c3697e.w();
            if (!mapW.isEmpty()) {
                strF = iVar.f45245a.getSerializer().f(mapW);
            }
        } catch (Throwable th) {
            iVar.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
        }
        iVar.f45246b.a(lowerCase, c3697e.y(), c3697e.u(), c3697e.B(), strH, strF);
    }

    @Override // io.sentry.Z
    public void a(C3697e c3697e) {
        try {
            this.f45245a.getExecutorService().submit(new c(this, c3697e));
        } catch (Throwable th) {
            this.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void b(String str) {
        try {
            this.f45245a.getExecutorService().submit(new g(this, str));
        } catch (Throwable th) {
            this.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void c(String str, String str2) {
        try {
            this.f45245a.getExecutorService().submit(new f(this, str, str2));
        } catch (Throwable th) {
            this.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void d(String str, String str2) {
        try {
            this.f45245a.getExecutorService().submit(new d(this, str, str2));
        } catch (Throwable th) {
            this.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void f(String str) {
        try {
            this.f45245a.getExecutorService().submit(new e(this, str));
        } catch (Throwable th) {
            this.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.Z
    public void h(I i10) {
        try {
            this.f45245a.getExecutorService().submit(new b(this, i10));
        } catch (Throwable th) {
            this.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.Z
    public void i(T3 t10, Y y10) {
        if (t10 == null) {
            return;
        }
        try {
            this.f45245a.getExecutorService().submit(new h(this, t10));
        } catch (Throwable th) {
            this.f45245a.getLogger().a(EnumC3721i3.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
