package p166j4;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.g;
import com.android.volley.v;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d implements com.android.volley.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f46822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f46824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f46825d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f46826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f46827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f46828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f46829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f46830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f46831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f46832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List f46833h;

        a(String str, com.android.volley.b.a aVar) {
            this(str, aVar.f27846b, aVar.f27847c, aVar.f27848d, aVar.f27849e, aVar.f27850f, a(aVar));
        }

        private a(String str, String str2, long j10, long j11, long j12, long j13, List list) {
            this.f46827b = str;
            this.f46828c = "".equals(str2) ? null : str2;
            this.f46829d = j10;
            this.f46830e = j11;
            this.f46831f = j12;
            this.f46832g = j13;
            this.f46833h = list;
        }

        private static List a(com.android.volley.b.a aVar) {
            List list = aVar.f27852h;
            return list != null ? list : e.g(aVar.f27851g);
        }

        static a b(b bVar) throws IOException {
            if (d.m(bVar) == 538247942) {
                return new a(d.o(bVar), d.o(bVar), d.n(bVar), d.n(bVar), d.n(bVar), d.n(bVar), d.l(bVar));
            }
            throw new IOException();
        }

        com.android.volley.b.a c(byte[] bArr) {
            com.android.volley.b.a aVar = new com.android.volley.b.a();
            aVar.f27845a = bArr;
            aVar.f27846b = this.f46828c;
            aVar.f27847c = this.f46829d;
            aVar.f27848d = this.f46830e;
            aVar.f27849e = this.f46831f;
            aVar.f27850f = this.f46832g;
            aVar.f27851g = e.h(this.f46833h);
            aVar.f27852h = Collections.unmodifiableList(this.f46833h);
            return aVar;
        }

        boolean d(OutputStream outputStream) {
            try {
                d.t(outputStream, 538247942);
                d.v(outputStream, this.f46827b);
                String str = this.f46828c;
                if (str == null) {
                    str = "";
                }
                d.v(outputStream, str);
                d.u(outputStream, this.f46829d);
                d.u(outputStream, this.f46830e);
                d.u(outputStream, this.f46831f);
                d.u(outputStream, this.f46832g);
                d.s(this.f46833h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e10) {
                v.b("%s", e10.toString());
                return false;
            }
        }
    }

    static class b extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f46834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f46835b;

        b(InputStream inputStream, long j10) {
            super(inputStream);
            this.f46834a = j10;
        }

        long a() {
            return this.f46834a - this.f46835b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 != -1) {
                this.f46835b++;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = super.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f46835b += (long) i12;
            }
            return i12;
        }
    }

    public interface c {
        File get();
    }

    public d(c cVar) {
        this(cVar, 5242880);
    }

    public d(c cVar, int i10) {
        this.f46822a = new LinkedHashMap(16, 0.75f, true);
        this.f46823b = 0L;
        this.f46824c = cVar;
        this.f46825d = i10;
    }

    private String g(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void h() {
        if (this.f46824c.get().exists()) {
            return;
        }
        v.b("Re-initializing cache after external clearing.", new Object[0]);
        this.f46822a.clear();
        this.f46823b = 0L;
        initialize();
    }

    private void i() {
        if (this.f46823b < this.f46825d) {
            return;
        }
        int i10 = 0;
        if (v.f27911b) {
            v.e("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f46823b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f46822a.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((Map.Entry) it.next()).getValue();
            if (f(aVar.f46827b).delete()) {
                this.f46823b -= aVar.f46826a;
            } else {
                String str = aVar.f46827b;
                v.b("Could not delete cache entry for key=%s, filename=%s", str, g(str));
            }
            it.remove();
            i10++;
            if (this.f46823b < this.f46825d * 0.9f) {
                break;
            }
        }
        if (v.f27911b) {
            v.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f46823b - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void j(String str, a aVar) {
        if (this.f46822a.containsKey(str)) {
            this.f46823b += aVar.f46826a - ((a) this.f46822a.get(str)).f46826a;
        } else {
            this.f46823b += aVar.f46826a;
        }
        this.f46822a.put(str, aVar);
    }

    private static int k(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    static List l(b bVar) throws IOException {
        int iM = m(bVar);
        if (iM < 0) {
            throw new IOException("readHeaderList size=" + iM);
        }
        List arrayList = iM == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iM; i10++) {
            arrayList.add(new g(o(bVar).intern(), o(bVar).intern()));
        }
        return arrayList;
    }

    static int m(InputStream inputStream) {
        return (k(inputStream) << 24) | k(inputStream) | (k(inputStream) << 8) | (k(inputStream) << 16);
    }

    static long n(InputStream inputStream) {
        return (((long) k(inputStream)) & 255) | ((((long) k(inputStream)) & 255) << 8) | ((((long) k(inputStream)) & 255) << 16) | ((((long) k(inputStream)) & 255) << 24) | ((((long) k(inputStream)) & 255) << 32) | ((((long) k(inputStream)) & 255) << 40) | ((((long) k(inputStream)) & 255) << 48) | ((255 & ((long) k(inputStream))) << 56);
    }

    static String o(b bVar) {
        return new String(r(bVar, n(bVar)), "UTF-8");
    }

    private void q(String str) {
        a aVar = (a) this.f46822a.remove(str);
        if (aVar != null) {
            this.f46823b -= aVar.f46826a;
        }
    }

    static byte[] r(b bVar, long j10) throws IOException {
        long jA = bVar.a();
        if (j10 >= 0 && j10 <= jA) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + jA);
    }

    static void s(List list, OutputStream outputStream) throws IOException {
        if (list == null) {
            t(outputStream, 0);
            return;
        }
        t(outputStream, list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            v(outputStream, gVar.a());
            v(outputStream, gVar.b());
        }
    }

    static void t(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void u(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void v(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        u(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.b
    public synchronized com.android.volley.b.a a(String str) {
        a aVar = (a) this.f46822a.get(str);
        if (aVar == null) {
            return null;
        }
        File fileF = f(str);
        try {
            b bVar = new b(new BufferedInputStream(d(fileF)), fileF.length());
            try {
                a aVarB = a.b(bVar);
                if (TextUtils.equals(str, aVarB.f46827b)) {
                    com.android.volley.b.a aVarC = aVar.c(r(bVar, bVar.a()));
                    bVar.close();
                    return aVarC;
                }
                v.b("%s: key=%s, found=%s", fileF.getAbsolutePath(), str, aVarB.f46827b);
                q(str);
                bVar.close();
                return null;
            } catch (Throwable th) {
                bVar.close();
                throw th;
            }
        } catch (IOException e10) {
            v.b("%s: %s", fileF.getAbsolutePath(), e10.toString());
            p(str);
            return null;
        }
    }

    @Override // com.android.volley.b
    public synchronized void b(String str, boolean z10) {
        try {
            com.android.volley.b.a aVarA = a(str);
            if (aVarA != null) {
                aVarA.f27850f = 0L;
                if (z10) {
                    aVarA.f27849e = 0L;
                }
                c(str, aVarA);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.b
    public synchronized void c(String str, com.android.volley.b.a aVar) {
        long j10 = this.f46823b;
        byte[] bArr = aVar.f27845a;
        long length = j10 + ((long) bArr.length);
        int i10 = this.f46825d;
        if (length > i10 && bArr.length > i10 * 0.9f) {
            return;
        }
        File fileF = f(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(e(fileF));
            a aVar2 = new a(str, aVar);
            if (!aVar2.d(bufferedOutputStream)) {
                bufferedOutputStream.close();
                v.b("Failed to write header for %s", fileF.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f27845a);
            bufferedOutputStream.close();
            aVar2.f46826a = fileF.length();
            j(str, aVar2);
            i();
        } catch (IOException unused) {
            if (!fileF.delete()) {
                v.b("Could not clean up file %s", fileF.getAbsolutePath());
            }
            h();
        }
    }

    InputStream d(File file) {
        return new FileInputStream(file);
    }

    OutputStream e(File file) {
        return new FileOutputStream(file);
    }

    public File f(String str) {
        return new File(this.f46824c.get(), g(str));
    }

    @Override // com.android.volley.b
    public synchronized void initialize() {
        File file = this.f46824c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                v.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                b bVar = new b(new BufferedInputStream(d(file2)), length);
                try {
                    a aVarB = a.b(bVar);
                    aVarB.f46826a = length;
                    j(aVarB.f46827b, aVarB);
                    bVar.close();
                } catch (Throwable th) {
                    bVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    public synchronized void p(String str) {
        boolean zDelete = f(str).delete();
        q(str);
        if (!zDelete) {
            v.b("Could not delete cache entry for key=%s, filename=%s", str, g(str));
        }
    }
}
