package io.sentry.cache;

import io.sentry.C3697e;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.H1;
import io.sentry.T3;
import io.sentry.Y;
import io.sentry.protocol.C3759c;
import io.sentry.protocol.I;
import io.sentry.protocol.x;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends H1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f45728c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3833z3 f45729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.p f45730b = new io.sentry.util.p(new k(this));

    class a implements io.sentry.cache.tape.c.a {
        a() {
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C3697e b(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), t.f45728c));
                try {
                    C3697e c3697e = (C3697e) t.this.f45729a.getSerializer().c(bufferedReader, C3697e.class);
                    bufferedReader.close();
                    return c3697e;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                t.this.f45729a.getLogger().a(EnumC3721i3.ERROR, th3, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(C3697e c3697e, OutputStream outputStream) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, t.f45728c));
            try {
                t.this.f45729a.getSerializer().a(c3697e, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public t(C3833z3 c3833z3) {
        this.f45729a = c3833z3;
    }

    private void A(String str) {
        d.a(this.f45729a, ".scope-cache", str);
    }

    private void D(Runnable runnable) {
        if (this.f45729a.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    this.f45729a.getLogger().b(EnumC3721i3.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                this.f45729a.getExecutorService().submit(new l(this, runnable));
            } catch (Throwable th2) {
                this.f45729a.getLogger().b(EnumC3721i3.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    public static void E(C3833z3 c3833z3, Object obj, String str) {
        d.d(c3833z3, obj, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Object obj, String str) {
        E(this.f45729a, obj, str);
    }

    public static /* synthetic */ void o(t tVar, T3 t10, Y y10) {
        if (t10 != null) {
            tVar.F(t10, "trace.json");
        } else {
            tVar.getClass();
            tVar.F(y10.I().g(), "trace.json");
        }
    }

    public static /* synthetic */ void p(t tVar, I i10) {
        if (i10 == null) {
            tVar.A("user.json");
        } else {
            tVar.F(i10, "user.json");
        }
    }

    public static /* synthetic */ void s(t tVar) {
        tVar.getClass();
        try {
            ((io.sentry.cache.tape.c) tVar.f45730b.a()).clear();
        } catch (IOException e10) {
            tVar.f45729a.getLogger().b(EnumC3721i3.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
    }

    public static /* synthetic */ void t(t tVar, String str) {
        if (str == null) {
            tVar.A("transaction.json");
        } else {
            tVar.F(str, "transaction.json");
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c u(t tVar) {
        io.sentry.cache.tape.d dVarA;
        File fileB = d.b(tVar.f45729a, ".scope-cache");
        if (fileB == null) {
            tVar.f45729a.getLogger().c(EnumC3721i3.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.g();
        }
        File file = new File(fileB, "breadcrumbs.json");
        try {
            try {
                dVarA = new io.sentry.cache.tape.d.a(file).b(tVar.f45729a.getMaxBreadcrumbs()).a();
            } catch (IOException e10) {
                tVar.f45729a.getLogger().b(EnumC3721i3.ERROR, "Failed to create breadcrumbs queue", e10);
                return io.sentry.cache.tape.c.g();
            }
        } catch (IOException unused) {
            file.delete();
            dVarA = new io.sentry.cache.tape.d.a(file).b(tVar.f45729a.getMaxBreadcrumbs()).a();
        }
        return io.sentry.cache.tape.c.e(dVarA, tVar.new a());
    }

    public static /* synthetic */ void v(t tVar, Runnable runnable) {
        tVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th) {
            tVar.f45729a.getLogger().b(EnumC3721i3.ERROR, "Serialization task failed", th);
        }
    }

    public static /* synthetic */ void x(t tVar, C3697e c3697e) {
        tVar.getClass();
        try {
            ((io.sentry.cache.tape.c) tVar.f45730b.a()).a(c3697e);
        } catch (IOException e10) {
            tVar.f45729a.getLogger().b(EnumC3721i3.ERROR, "Failed to add breadcrumb to file queue", e10);
        }
    }

    public Object B(C3833z3 c3833z3, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return d.c(c3833z3, ".scope-cache", str, cls, null);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.c) this.f45730b.a()).c());
        } catch (IOException unused) {
            c3833z3.getLogger().c(EnumC3721i3.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void C() {
        try {
            ((io.sentry.cache.tape.c) this.f45730b.a()).clear();
        } catch (IOException e10) {
            this.f45729a.getLogger().b(EnumC3721i3.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
        A("user.json");
        A("level.json");
        A("request.json");
        A("fingerprint.json");
        A("contexts.json");
        A("extras.json");
        A("tags.json");
        A("trace.json");
        A("transaction.json");
    }

    @Override // io.sentry.Z
    public void a(C3697e c3697e) {
        D(new n(this, c3697e));
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void e(Map map) {
        D(new m(this, map));
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void g(Collection collection) {
        if (collection.isEmpty()) {
            D(new q(this));
        }
    }

    @Override // io.sentry.Z
    public void h(I i10) {
        D(new i(this, i10));
    }

    @Override // io.sentry.Z
    public void i(T3 t10, Y y10) {
        D(new j(this, t10, y10));
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void j(C3759c c3759c) {
        D(new o(this, c3759c));
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void k(Map map) {
        D(new p(this, map));
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void l(String str) {
        D(new s(this, str));
    }

    @Override // io.sentry.H1, io.sentry.Z
    public void m(x xVar) {
        D(new r(this, xVar));
    }
}
