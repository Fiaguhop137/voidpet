package p202l4;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f48596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f48597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f48598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f48599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f48601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48602g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f48604i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48606k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f48603h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f48605j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f48607l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f48608m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0573b(null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable f48609n = new a();

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (b.this) {
                try {
                    if (b.this.f48604i == null) {
                        return null;
                    }
                    b.this.S();
                    if (b.this.x()) {
                        b.this.L();
                        b.this.f48606k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l4.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0573b implements ThreadFactory {
        private ThreadFactoryC0573b() {
        }

        /* synthetic */ ThreadFactoryC0573b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f48611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f48612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f48613c;

        private c(d dVar) {
            this.f48611a = dVar;
            this.f48612b = dVar.f48619e ? null : new boolean[b.this.f48602g];
        }

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            b.this.m(this, false);
        }

        public void b() {
            if (this.f48613c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            b.this.m(this, true);
            this.f48613c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (b.this) {
                try {
                    if (this.f48611a.f48620f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f48611a.f48619e) {
                        this.f48612b[i10] = true;
                    }
                    fileK = this.f48611a.k(i10);
                    b.this.f48596a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileK;
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f48616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f48617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f48618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f48619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f48620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f48621g;

        private d(String str) {
            this.f48615a = str;
            this.f48616b = new long[b.this.f48602g];
            this.f48617c = new File[b.this.f48602g];
            this.f48618d = new File[b.this.f48602g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f48602g; i10++) {
                sb2.append(i10);
                this.f48617c[i10] = new File(b.this.f48596a, sb2.toString());
                sb2.append(".tmp");
                this.f48618d[i10] = new File(b.this.f48596a, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f48602g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f48616b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f48617c[i10];
        }

        public File k(int i10) {
            return this.f48618d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f48616b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f48625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f48626d;

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f48623a = str;
            this.f48624b = j10;
            this.f48626d = fileArr;
            this.f48625c = jArr;
        }

        /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f48626d[i10];
        }
    }

    private b(File file, int i10, int i11, long j10) {
        this.f48596a = file;
        this.f48600e = i10;
        this.f48597b = new File(file, "journal");
        this.f48598c = new File(file, "journal.tmp");
        this.f48599d = new File(file, "journal.bkp");
        this.f48602g = i11;
        this.f48601f = j10;
    }

    private void F() throws IOException {
        p(this.f48598c);
        Iterator it = this.f48605j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f48620f == null) {
                while (i10 < this.f48602g) {
                    this.f48603h += dVar.f48616b[i10];
                    i10++;
                }
            } else {
                dVar.f48620f = null;
                while (i10 < this.f48602g) {
                    p(dVar.j(i10));
                    p(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void G() {
        p202l4.c cVar = new p202l4.c(new FileInputStream(this.f48597b), p202l4.d.f48634a);
        try {
            String strD = cVar.d();
            String strD2 = cVar.d();
            String strD3 = cVar.d();
            String strD4 = cVar.d();
            String strD5 = cVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f48600e).equals(strD3) || !Integer.toString(this.f48602g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    K(cVar.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f48606k = i10 - this.f48605j.size();
                    if (cVar.c()) {
                        L();
                    } else {
                        this.f48604i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48597b, true), p202l4.d.f48634a));
                    }
                    p202l4.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            p202l4.d.a(cVar);
            throw th;
        }
    }

    private void K(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f48605j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f48605j.get(strSubstring);
        if (dVar == null) {
            dVar = new d(this, strSubstring, null);
            this.f48605j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f48619e = true;
            dVar.f48620f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f48620f = new c(this, dVar, null);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void L() {
        try {
            Writer writer = this.f48604i;
            if (writer != null) {
                k(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48598c), p202l4.d.f48634a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f48600e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f48602g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f48605j.values()) {
                    if (dVar.f48620f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f48615a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f48615a + dVar.l() + '\n');
                    }
                }
                k(bufferedWriter);
                if (this.f48597b.exists()) {
                    P(this.f48597b, this.f48599d, true);
                }
                P(this.f48598c, this.f48597b, false);
                this.f48599d.delete();
                this.f48604i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48597b, true), p202l4.d.f48634a));
            } catch (Throwable th) {
                k(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void P(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        while (this.f48603h > this.f48601f) {
            O((String) ((Map.Entry) this.f48605j.entrySet().iterator().next()).getKey());
        }
    }

    private void i() {
        if (this.f48604i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void k(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m(c cVar, boolean z10) {
        d dVar = cVar.f48611a;
        if (dVar.f48620f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f48619e) {
            for (int i10 = 0; i10 < this.f48602g; i10++) {
                if (!cVar.f48612b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f48602g; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                p(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f48616b[i11];
                long length = fileJ.length();
                dVar.f48616b[i11] = length;
                this.f48603h = (this.f48603h - j10) + length;
            }
        }
        this.f48606k++;
        dVar.f48620f = null;
        if (dVar.f48619e || z10) {
            dVar.f48619e = true;
            this.f48604i.append((CharSequence) "CLEAN");
            this.f48604i.append(' ');
            this.f48604i.append((CharSequence) dVar.f48615a);
            this.f48604i.append((CharSequence) dVar.l());
            this.f48604i.append('\n');
            if (z10) {
                long j11 = this.f48607l;
                this.f48607l = 1 + j11;
                dVar.f48621g = j11;
            }
        } else {
            this.f48605j.remove(dVar.f48615a);
            this.f48604i.append((CharSequence) "REMOVE");
            this.f48604i.append(' ');
            this.f48604i.append((CharSequence) dVar.f48615a);
            this.f48604i.append('\n');
        }
        t(this.f48604i);
        if (this.f48603h > this.f48601f || x()) {
            this.f48608m.submit(this.f48609n);
        }
    }

    private static void p(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c s(String str, long j10) {
        i();
        d dVar = (d) this.f48605j.get(str);
        if (j10 != -1 && (dVar == null || dVar.f48621g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, null);
            this.f48605j.put(str, dVar);
        } else if (dVar.f48620f != null) {
            return null;
        }
        c cVar = new c(this, dVar, null);
        dVar.f48620f = cVar;
        this.f48604i.append((CharSequence) "DIRTY");
        this.f48604i.append(' ');
        this.f48604i.append((CharSequence) str);
        this.f48604i.append('\n');
        t(this.f48604i);
        return cVar;
    }

    private static void t(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        int i10 = this.f48606k;
        return i10 >= 2000 && i10 >= this.f48605j.size();
    }

    public static b z(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                P(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f48597b.exists()) {
            try {
                bVar.G();
                bVar.F();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.o();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.L();
        return bVar2;
    }

    public synchronized boolean O(String str) {
        try {
            i();
            d dVar = (d) this.f48605j.get(str);
            if (dVar != null && dVar.f48620f == null) {
                for (int i10 = 0; i10 < this.f48602g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f48603h -= dVar.f48616b[i10];
                    dVar.f48616b[i10] = 0;
                }
                this.f48606k++;
                this.f48604i.append((CharSequence) "REMOVE");
                this.f48604i.append(' ');
                this.f48604i.append((CharSequence) str);
                this.f48604i.append('\n');
                this.f48605j.remove(str);
                if (x()) {
                    this.f48608m.submit(this.f48609n);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f48604i == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f48605j.values())) {
                if (dVar.f48620f != null) {
                    dVar.f48620f.a();
                }
            }
            S();
            k(this.f48604i);
            this.f48604i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void o() throws IOException {
        close();
        p202l4.d.b(this.f48596a);
    }

    public c r(String str) {
        return s(str, -1L);
    }

    public synchronized e u(String str) {
        Throwable th;
        try {
            try {
                i();
                d dVar = (d) this.f48605j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f48619e) {
                    return null;
                }
                for (File file : dVar.f48617c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f48606k++;
                this.f48604i.append((CharSequence) "READ");
                this.f48604i.append(' ');
                this.f48604i.append((CharSequence) str);
                this.f48604i.append('\n');
                if (x()) {
                    this.f48608m.submit(this.f48609n);
                }
                return new e(this, str, dVar.f48621g, dVar.f48617c, dVar.f48616b, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }
}
