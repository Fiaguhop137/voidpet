package io.sentry.cache;

import io.sentry.AbstractC3732l;
import io.sentry.C3745n2;
import io.sentry.C3771q2;
import io.sentry.C3833z3;
import io.sentry.EnumC3716h3;
import io.sentry.EnumC3721i3;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.InterfaceC3698e0;
import io.sentry.InterfaceC3703f0;
import io.sentry.M3;
import io.sentry.O3;
import io.sentry.T2;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.util.C3799a;
import io.sentry.util.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class f extends c implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f45702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f45703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final C3799a f45704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final C3799a f45705i;

    public f(C3833z3 c3833z3, String str, int i10) {
        super(c3833z3, str, i10);
        this.f45703g = new WeakHashMap();
        this.f45704h = new C3799a();
        this.f45705i = new C3799a();
        this.f45702f = new CountDownLatch(1);
    }

    private File A(C3771q2 c3771q2) {
        String str;
        InterfaceC3698e0 interfaceC3698e0A = this.f45704h.a();
        try {
            if (this.f45703g.containsKey(c3771q2)) {
                str = (String) this.f45703g.get(c3771q2);
            } else {
                String str2 = M3.a() + ".envelope";
                this.f45703g.put(c3771q2, str2);
                str = str2;
            }
            File file = new File(this.f45699c.getAbsolutePath(), str);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return file;
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

    public static File B(String str) {
        return new File(str, "previous_session.json");
    }

    private boolean D(C3771q2 c3771q2, H h10) {
        w.c(c3771q2, "Envelope is required.");
        p(v());
        File fileY = y(this.f45699c.getAbsolutePath());
        File fileB = B(this.f45699c.getAbsolutePath());
        if (io.sentry.util.l.f(h10, io.sentry.hints.m.class) && !fileY.delete()) {
            this.f45697a.getLogger().c(EnumC3721i3.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.l.f(h10, io.sentry.hints.a.class) || io.sentry.util.l.f(h10, io.sentry.hints.j.class)) {
            E(h10);
        }
        if (io.sentry.util.l.f(h10, io.sentry.hints.o.class)) {
            C(fileY, fileB);
            F(fileY, c3771q2);
            boolean zExists = new File(this.f45697a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f45697a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f45697a.getLogger().c(EnumC3721i3.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f45697a.getLogger().c(EnumC3721i3.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            C3745n2.a().d(zExists);
            x();
        }
        File fileA = A(c3771q2);
        if (fileA.exists()) {
            this.f45697a.getLogger().c(EnumC3721i3.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileA.getAbsolutePath());
            return true;
        }
        this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Adding Envelope to offline storage: %s", fileA.getAbsolutePath());
        boolean zI = I(fileA, c3771q2);
        if (io.sentry.util.l.f(h10, UncaughtExceptionHandlerIntegration.a.class)) {
            H();
        }
        return zI;
    }

    private void E(H h10) {
        Date dateE;
        Object objE = io.sentry.util.l.e(h10);
        File fileB = B(this.f45699c.getAbsolutePath());
        if (!fileB.exists()) {
            this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "No previous session file to end.", new Object[0]);
            return;
        }
        ILogger logger = this.f45697a.getLogger();
        EnumC3721i3 enumC3721i3 = EnumC3721i3.WARNING;
        logger.c(enumC3721i3, "Previous session is not ended, we'd need to end it.", new Object[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileB), c.f45696e));
            try {
                O3 o10 = (O3) ((InterfaceC3703f0) this.f45698b.a()).c(bufferedReader, O3.class);
                if (o10 != null) {
                    Date date = null;
                    if (objE instanceof io.sentry.hints.a) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objE;
                        Long lA = aVar.a();
                        if (lA != null) {
                            dateE = AbstractC3732l.e(lA.longValue());
                            Date dateK = o10.k();
                            if (dateK == null || dateE.before(dateK)) {
                                this.f45697a.getLogger().c(enumC3721i3, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            }
                        } else {
                            dateE = null;
                        }
                        o10.q(O3.b.Abnormal, null, true, aVar.h());
                        date = dateE;
                        o10.d(date);
                        J(fileB, o10);
                    } else if (objE instanceof io.sentry.hints.j) {
                        Date dateE2 = AbstractC3732l.e(((io.sentry.hints.j) objE).a().longValue());
                        Date dateK2 = o10.k();
                        if (dateK2 == null || dateE2.before(dateK2)) {
                            this.f45697a.getLogger().c(enumC3721i3, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                        } else {
                            o10.q(O3.b.Crashed, null, true, null);
                            date = dateE2;
                            o10.d(date);
                            J(fileB, o10);
                        }
                    } else {
                        o10.d(date);
                        J(fileB, o10);
                    }
                }
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Error processing previous session.", th3);
        }
    }

    private void F(File file, C3771q2 c3771q2) {
        Iterable iterableC = c3771q2.c();
        if (!iterableC.iterator().hasNext()) {
            this.f45697a.getLogger().c(EnumC3721i3.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        T2 t10 = (T2) iterableC.iterator().next();
        if (!EnumC3716h3.Session.equals(t10.O().e())) {
            this.f45697a.getLogger().c(EnumC3721i3.INFO, "Current envelope has a different envelope type %s", t10.O().e());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(t10.M()), c.f45696e));
            try {
                O3 o10 = (O3) ((InterfaceC3703f0) this.f45698b.a()).c(bufferedReader, O3.class);
                if (o10 == null) {
                    this.f45697a.getLogger().c(EnumC3721i3.ERROR, "Item of type %s returned null by the parser.", t10.O().e());
                } else {
                    J(file, o10);
                }
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Item failed to process.", th3);
        }
    }

    private void H() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f45697a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(AbstractC3732l.h(AbstractC3732l.d()).getBytes(c.f45696e));
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
            this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Error writing the crash marker file to the disk", th3);
        }
    }

    private boolean I(File file, C3771q2 c3771q2) {
        if (file.exists()) {
            this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f45697a.getLogger().c(EnumC3721i3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC3703f0) this.f45698b.a()).b(c3771q2, fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f45697a.getLogger().a(EnumC3721i3.ERROR, th3, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return false;
        }
    }

    private void J(File file, O3 o10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f45696e));
                try {
                    this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Overwriting session to offline storage: %s", o10.j());
                    ((InterfaceC3703f0) this.f45698b.a()).a(o10, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            this.f45697a.getLogger().a(EnumC3721i3.ERROR, th5, "Error writing Session to offline storage: %s", o10.j());
        }
    }

    private File[] v() {
        File[] fileArrListFiles;
        return (!h() || (fileArrListFiles = this.f45699c.listFiles(new e())) == null) ? new File[0] : fileArrListFiles;
    }

    public static g w(C3833z3 c3833z3) {
        String cacheDirPath = c3833z3.getCacheDirPath();
        int maxCacheItems = c3833z3.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(c3833z3, cacheDirPath, maxCacheItems);
        }
        c3833z3.getLogger().c(EnumC3721i3.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return io.sentry.transport.r.a();
    }

    public static File y(String str) {
        return new File(str, "session.json");
    }

    public void C(File file, File file2) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45705i.a();
        try {
            if (!file.exists()) {
                if (interfaceC3698e0A != null) {
                    interfaceC3698e0A.close();
                    return;
                }
                return;
            }
            if (file2.exists()) {
                this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    this.f45697a.getLogger().c(EnumC3721i3.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            this.f45697a.getLogger().c(EnumC3721i3.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    this.f45697a.getLogger().c(EnumC3721i3.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                this.f45697a.getLogger().b(EnumC3721i3.ERROR, "Error moving current session to previous session.", th);
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

    public boolean G() {
        try {
            return this.f45702f.await(this.f45697a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public boolean T2(C3771q2 c3771q2, H h10) {
        return D(c3771q2, h10);
    }

    @Override // io.sentry.cache.g
    public void b0(C3771q2 c3771q2) {
        w.c(c3771q2, "Envelope is required.");
        File fileA = A(c3771q2);
        if (fileA.delete()) {
            this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Discarding envelope from cache: %s", fileA.getAbsolutePath());
        } else {
            this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Envelope was not cached or could not be deleted: %s", fileA.getAbsolutePath());
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        File[] fileArrV = v();
        ArrayList arrayList = new ArrayList(fileArrV.length);
        for (File file : fileArrV) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((InterfaceC3703f0) this.f45698b.a()).d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                this.f45697a.getLogger().c(EnumC3721i3.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                this.f45697a.getLogger().b(EnumC3721i3.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e10);
            }
        }
        return arrayList.iterator();
    }

    public void x() {
        this.f45702f.countDown();
    }
}
