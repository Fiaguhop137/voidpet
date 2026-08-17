package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends AbstractC3787t implements Q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3619a0 f44208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3703f0 f44209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ILogger f44210g;

    public B(InterfaceC3619a0 interfaceC3619a0, InterfaceC3703f0 interfaceC3703f0, ILogger iLogger, long j10, int i10) {
        super(interfaceC3619a0, iLogger, j10, i10);
        this.f44208e = (InterfaceC3619a0) io.sentry.util.w.c(interfaceC3619a0, "Scopes are required.");
        this.f44209f = (InterfaceC3703f0) io.sentry.util.w.c(interfaceC3703f0, "Serializer is required.");
        this.f44210g = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(B b10, io.sentry.hints.i iVar) {
        b10.getClass();
        if (iVar.g()) {
            return;
        }
        b10.f44210g.c(EnumC3721i3.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void g(B b10, File file, io.sentry.hints.l lVar) {
        b10.getClass();
        if (lVar.a()) {
            b10.f44210g.c(EnumC3721i3.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            b10.i(file, "after trying to capture it");
            b10.f44210g.c(EnumC3721i3.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void h(B b10, Throwable th, File file, io.sentry.hints.l lVar) {
        b10.getClass();
        lVar.d(false);
        b10.f44210g.a(EnumC3721i3.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    private void i(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f44210g.c(EnumC3721i3.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.f44210g.a(EnumC3721i3.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.Q
    public void a(String str, H h10) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), h10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.AbstractC3787t
    public boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC3787t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC3787t
    protected void e(File file, H h10) {
        ILogger iLogger;
        C3829z c3829z;
        if (!file.isFile()) {
            this.f44210g.c(EnumC3721i3.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f44210g.c(EnumC3721i3.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f44210g.c(EnumC3721i3.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        C3771q2 c3771q2D = this.f44209f.d(bufferedInputStream);
                        if (c3771q2D == null) {
                            this.f44210g.c(EnumC3721i3.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f44208e.x(c3771q2D, h10);
                        }
                        io.sentry.util.l.j(h10, io.sentry.hints.i.class, this.f44210g, new C3824y(this));
                        bufferedInputStream.close();
                        io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f44210g, new C3829z(this, file));
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e10) {
                    this.f44210g.a(EnumC3721i3.ERROR, e10, "File '%s' cannot be found.", file.getAbsolutePath());
                    iLogger = this.f44210g;
                    c3829z = new C3829z(this, file);
                    io.sentry.util.l.j(h10, io.sentry.hints.l.class, iLogger, c3829z);
                }
            } catch (IOException e11) {
                this.f44210g.a(EnumC3721i3.ERROR, e11, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.f44210g;
                c3829z = new C3829z(this, file);
                io.sentry.util.l.j(h10, io.sentry.hints.l.class, iLogger, c3829z);
            } catch (Throwable th3) {
                this.f44210g.a(EnumC3721i3.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f44210g, new A(this, th3, file));
                iLogger = this.f44210g;
                c3829z = new C3829z(this, file);
                io.sentry.util.l.j(h10, io.sentry.hints.l.class, iLogger, c3829z);
            }
        } catch (Throwable th4) {
            io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f44210g, new C3829z(this, file));
            throw th4;
        }
    }
}
