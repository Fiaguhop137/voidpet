package io.sentry.cache;

import io.sentry.C3771q2;
import io.sentry.C3833z3;
import io.sentry.EnumC3716h3;
import io.sentry.EnumC3721i3;
import io.sentry.InterfaceC3703f0;
import io.sentry.O3;
import io.sentry.T2;
import io.sentry.util.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Charset f45696e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C3833z3 f45697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.p f45698b = new io.sentry.util.p(new a(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final File f45699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45700d;

    c(C3833z3 c3833z3, String str, int i10) {
        w.c(str, "Directory is required.");
        this.f45697a = (C3833z3) w.c(c3833z3, "SentryOptions is required.");
        this.f45699c = new File(str);
        this.f45700d = i10;
    }

    private C3771q2 e(C3771q2 c3771q2, T2 t10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c3771q2.c().iterator();
        while (it.hasNext()) {
            arrayList.add((T2) it.next());
        }
        arrayList.add(t10);
        return new C3771q2(c3771q2.b(), arrayList);
    }

    private O3 g(C3771q2 c3771q2) {
        for (T2 t10 : c3771q2.c()) {
            if (i(t10)) {
                return o(t10);
            }
        }
        return null;
    }

    private boolean i(T2 t10) {
        if (t10 == null) {
            return false;
        }
        return t10.O().e().equals(EnumC3716h3.Session);
    }

    private boolean j(C3771q2 c3771q2) {
        return c3771q2.c().iterator().hasNext();
    }

    private boolean k(O3 o10) {
        return o10.l().equals(O3.b.Ok) && o10.j() != null;
    }

    private void l(File file, File[] fileArr) {
        Boolean boolG;
        T2 t2K;
        O3 o3O;
        C3771q2 c3771q2N = n(file);
        if (c3771q2N == null || !j(c3771q2N)) {
            return;
        }
        this.f45697a.getClientReportRecorder().b(io.sentry.clientreport.f.CACHE_OVERFLOW, c3771q2N);
        O3 o3G = g(c3771q2N);
        if (o3G == null || !k(o3G) || (boolG = o3G.g()) == null || !boolG.booleanValue()) {
            return;
        }
        for (File file2 : fileArr) {
            C3771q2 c3771q2N2 = n(file2);
            if (c3771q2N2 != null && j(c3771q2N2)) {
                Iterator it = c3771q2N2.c().iterator();
                while (true) {
                    t2K = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T2 t10 = (T2) it.next();
                    if (i(t10) && (o3O = o(t10)) != null && k(o3O)) {
                        Boolean boolG2 = o3O.g();
                        if (boolG2 != null && boolG2.booleanValue()) {
                            this.f45697a.getLogger().c(EnumC3721i3.ERROR, "Session %s has 2 times the init flag.", o3G.j());
                            return;
                        }
                        if (o3G.j() != null && o3G.j().equals(o3O.j())) {
                            o3O.n();
                            try {
                                t2K = T2.K((InterfaceC3703f0) this.f45698b.a(), o3O);
                                it.remove();
                                break;
                            } catch (IOException e10) {
                                this.f45697a.getLogger().a(EnumC3721i3.ERROR, e10, "Failed to create new envelope item for the session %s", o3G.j());
                                break;
                            }
                        }
                    }
                }
                if (t2K != null) {
                    C3771q2 c3771q2E = e(c3771q2N2, t2K);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.f45697a.getLogger().c(EnumC3721i3.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    q(c3771q2E, file2, jLastModified);
                    return;
                }
            }
        }
    }

    private C3771q2 n(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C3771q2 c3771q2D = ((InterfaceC3703f0) this.f45698b.a()).d(bufferedInputStream);
                bufferedInputStream.close();
                return c3771q2D;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    private O3 o(T2 t10) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t10.M()), f45696e));
            try {
                O3 o10 = (O3) ((InterfaceC3703f0) this.f45698b.a()).c(bufferedReader, O3.class);
                bufferedReader.close();
                return o10;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    private void q(C3771q2 c3771q2, File file, long j10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC3703f0) this.f45698b.a()).b(c3771q2, fileOutputStream);
                file.setLastModified(j10);
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
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Failed to serialize the new envelope to the disk.", th3);
        }
    }

    private void s(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new b());
        }
    }

    protected boolean h() {
        if (this.f45699c.isDirectory() && this.f45699c.canWrite() && this.f45699c.canRead()) {
            return true;
        }
        this.f45697a.getLogger().c(EnumC3721i3.ERROR, "The directory for caching files is inaccessible.: %s", this.f45699c.getAbsolutePath());
        return false;
    }

    protected void p(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f45700d) {
            this.f45697a.getLogger().c(EnumC3721i3.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i10 = (length - this.f45700d) + 1;
            s(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i10, length);
            for (int i11 = 0; i11 < i10; i11++) {
                File file = fileArr[i11];
                l(file, fileArr2);
                if (!file.delete()) {
                    this.f45697a.getLogger().c(EnumC3721i3.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
