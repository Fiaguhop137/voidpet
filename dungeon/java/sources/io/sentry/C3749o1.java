package io.sentry;

import io.sentry.util.AbstractC3801c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3749o1 extends AbstractC3787t implements Q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Charset f46028i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3619a0 f46029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P f46030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3703f0 f46031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f46032h;

    public C3749o1(InterfaceC3619a0 interfaceC3619a0, P p10, InterfaceC3703f0 interfaceC3703f0, ILogger iLogger, long j10, int i10) {
        super(interfaceC3619a0, iLogger, j10, i10);
        this.f46029e = (InterfaceC3619a0) io.sentry.util.w.c(interfaceC3619a0, "Scopes are required.");
        this.f46030f = (P) io.sentry.util.w.c(p10, "Envelope reader is required.");
        this.f46031g = (InterfaceC3703f0) io.sentry.util.w.c(interfaceC3703f0, "Serializer is required.");
        this.f46032h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(C3749o1 c3749o1, File file, io.sentry.hints.l lVar) {
        c3749o1.getClass();
        if (lVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            c3749o1.f46032h.c(EnumC3721i3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            c3749o1.f46032h.a(EnumC3721i3.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private g4 h(e4 e4Var) {
        String strB;
        if (e4Var != null && (strB = e4Var.b()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strB));
                if (io.sentry.util.A.h(dValueOf, false)) {
                    String strA = e4Var.a();
                    if (strA != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(strA));
                        if (io.sentry.util.A.h(dValueOf2, false)) {
                            return new g4(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.A.a(new g4(Boolean.TRUE, dValueOf));
                }
                this.f46032h.c(EnumC3721i3.ERROR, "Invalid sample rate parsed from TraceContext: %s", strB);
            } catch (Exception unused) {
                this.f46032h.c(EnumC3721i3.ERROR, "Unable to parse sample rate from TraceContext: %s", strB);
            }
        }
        return new g4(Boolean.TRUE);
    }

    private void i(T2 t10, int i10) {
        this.f46032h.c(EnumC3721i3.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i10), t10.O().e());
    }

    private void j(int i10) {
        this.f46032h.c(EnumC3721i3.DEBUG, "Item %d is being captured.", Integer.valueOf(i10));
    }

    private void k(io.sentry.protocol.x xVar) {
        this.f46032h.c(EnumC3721i3.WARNING, "Timed out waiting for event id submission: %s", xVar);
    }

    private void l(C3771q2 c3771q2, io.sentry.protocol.x xVar, int i10) {
        this.f46032h.c(EnumC3721i3.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i10), c3771q2.b().a(), xVar);
    }

    private void m(C3771q2 c3771q2, H h10) {
        Object objE;
        this.f46032h.c(EnumC3721i3.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(AbstractC3801c.e(c3771q2.c())));
        int i10 = 0;
        for (T2 t10 : c3771q2.c()) {
            i10++;
            if (t10.O() == null) {
                this.f46032h.c(EnumC3721i3.ERROR, "Item %d has no header", Integer.valueOf(i10));
            } else if (EnumC3716h3.Event.equals(t10.O().e())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t10.M()), f46028i));
                    try {
                        V2 v10 = (V2) this.f46031g.c(bufferedReader, V2.class);
                        if (v10 == null) {
                            i(t10, i10);
                        } else {
                            if (v10.L() != null) {
                                io.sentry.util.l.l(h10, v10.L().e());
                            }
                            if (c3771q2.b().a() == null || c3771q2.b().a().equals(v10.G())) {
                                this.f46029e.G(v10, h10);
                                j(i10);
                                if (!n(h10)) {
                                    k(v10.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(c3771q2, v10.G(), i10);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                        objE = io.sentry.util.l.e(h10);
                        if (!(objE instanceof io.sentry.hints.q) && !((io.sentry.hints.q) objE).e()) {
                            this.f46032h.c(EnumC3721i3.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i10));
                            return;
                        }
                        io.sentry.util.l.h(h10, io.sentry.hints.k.class, new C3744n1());
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    this.f46032h.b(EnumC3721i3.ERROR, "Item failed to process.", th3);
                }
            } else {
                if (EnumC3716h3.Transaction.equals(t10.O().e())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t10.M()), f46028i));
                        try {
                            io.sentry.protocol.E e10 = (io.sentry.protocol.E) this.f46031g.c(bufferedReader2, io.sentry.protocol.E.class);
                            if (e10 == null) {
                                i(t10, i10);
                            } else if (c3771q2.b().a() == null || c3771q2.b().a().equals(e10.G())) {
                                e4 e4VarC = c3771q2.b().c();
                                if (e10.C().j() != null) {
                                    e10.C().j().u(h(e4VarC));
                                }
                                this.f46029e.y(e10, e4VarC, h10);
                                j(i10);
                                if (!n(h10)) {
                                    k(e10.G());
                                    bufferedReader2.close();
                                    return;
                                }
                            } else {
                                l(c3771q2, e10.G(), i10);
                                bufferedReader2.close();
                            }
                            bufferedReader2.close();
                        } catch (Throwable th4) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        this.f46032h.b(EnumC3721i3.ERROR, "Item failed to process.", th6);
                    }
                } else {
                    this.f46029e.x(new C3771q2(c3771q2.b().a(), c3771q2.b().b(), t10), h10);
                    this.f46032h.c(EnumC3721i3.DEBUG, "%s item %d is being captured.", t10.O().e().getItemType(), Integer.valueOf(i10));
                    if (!n(h10)) {
                        this.f46032h.c(EnumC3721i3.WARNING, "Timed out waiting for item type submission: %s", t10.O().e().getItemType());
                        return;
                    }
                }
                objE = io.sentry.util.l.e(h10);
                if (!(objE instanceof io.sentry.hints.q)) {
                }
                io.sentry.util.l.h(h10, io.sentry.hints.k.class, new C3744n1());
            }
        }
    }

    private boolean n(H h10) {
        Object objE = io.sentry.util.l.e(h10);
        if (objE instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) objE).g();
        }
        io.sentry.util.t.a(io.sentry.hints.i.class, objE, this.f46032h);
        return true;
    }

    @Override // io.sentry.Q
    public void a(String str, H h10) {
        io.sentry.util.w.c(str, "Path is required.");
        e(new File(str), h10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.AbstractC3787t
    public boolean c(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC3787t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.AbstractC3787t
    protected void e(File file, H h10) {
        io.sentry.util.w.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f46032h.c(EnumC3721i3.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C3771q2 c3771q2A = this.f46030f.a(bufferedInputStream);
                    if (c3771q2A == null) {
                        this.f46032h.c(EnumC3721i3.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m(c3771q2A, h10);
                        this.f46032h.c(EnumC3721i3.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f46032h, new C3739m1(this, file));
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f46032h.b(EnumC3721i3.ERROR, "Error processing envelope.", e10);
                io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f46032h, new C3739m1(this, file));
            }
        } catch (Throwable th3) {
            io.sentry.util.l.j(h10, io.sentry.hints.l.class, this.f46032h, new C3739m1(this, file));
            throw th3;
        }
    }
}
