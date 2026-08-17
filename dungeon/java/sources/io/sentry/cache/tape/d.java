package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Closeable, Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f45737m = new byte[4096];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RandomAccessFile f45738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f45739b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f45741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f45742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b f45743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f45744g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f45747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f45748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f45749l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f45740c = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f45745h = new byte[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f45746i = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f45750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f45751b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45752c = -1;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f45750a = file;
        }

        public d a() throws IOException {
            RandomAccessFile randomAccessFileI = d.i(this.f45750a);
            try {
                return new d(this.f45750a, randomAccessFileI, this.f45751b, this.f45752c);
            } catch (Throwable th) {
                randomAccessFileI.close();
                throw th;
            }
        }

        public a b(int i10) {
            this.f45752c = i10;
            return this;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f45753c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f45754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f45755b;

        b(long j10, int i10) {
            this.f45754a = j10;
            this.f45755b = i10;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f45754a + ", length=" + this.f45755b + "]";
        }
    }

    private final class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45756a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f45757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45758c;

        c() {
            this.f45757b = d.this.f45743f.f45754a;
            this.f45758c = d.this.f45746i;
        }

        private void a() {
            if (d.this.f45746i != this.f45758c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (d.this.f45749l) {
                throw new IllegalStateException("closed");
            }
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f45756a;
            d dVar = d.this;
            if (i10 >= dVar.f45742e) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    b bVarP = dVar.p(this.f45757b);
                    byte[] bArr = new byte[bVarP.f45755b];
                    long jR0 = d.this.r0(bVarP.f45754a + 4);
                    this.f45757b = jR0;
                    if (!d.this.Z(jR0, bArr, 0, bVarP.f45755b)) {
                        this.f45756a = d.this.f45742e;
                        return d.f45737m;
                    }
                    this.f45757b = d.this.r0(bVarP.f45754a + 4 + ((long) bVarP.f45755b));
                    this.f45756a++;
                    return bArr;
                } catch (IOException e10) {
                    throw ((Error) d.h(e10));
                }
            } catch (IOException e11) {
                throw ((Error) d.h(e11));
            } catch (OutOfMemoryError unused) {
                d.this.P();
                this.f45756a = d.this.f45742e;
                return d.f45737m;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (d.this.f45749l) {
                throw new IllegalStateException("closed");
            }
            a();
            return this.f45756a != d.this.f45742e;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f45756a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                d.this.G();
                this.f45758c = d.this.f45746i;
                this.f45756a--;
            } catch (IOException e10) {
                throw ((Error) d.h(e10));
            }
        }
    }

    d(File file, RandomAccessFile randomAccessFile, boolean z10, int i10) throws IOException {
        this.f45739b = file;
        this.f45738a = randomAccessFile;
        this.f45747j = z10;
        this.f45748k = i10;
        s();
    }

    private long F() {
        return this.f45741d - h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() throws IOException {
        this.f45738a.close();
        this.f45739b.delete();
        this.f45738a = i(this.f45739b);
        s();
    }

    private void U(long j10, long j11) throws IOException {
        long j12 = j10;
        while (j11 > 0) {
            byte[] bArr = f45737m;
            int iMin = (int) Math.min(j11, bArr.length);
            c0(j12, bArr, 0, iMin);
            long j13 = iMin;
            j11 -= j13;
            j12 += j13;
        }
    }

    private void c0(long j10, byte[] bArr, int i10, int i11) throws IOException {
        long jR0 = r0(j10);
        long j11 = ((long) i11) + jR0;
        long j12 = this.f45741d;
        if (j11 <= j12) {
            this.f45738a.seek(jR0);
            this.f45738a.write(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - jR0);
        this.f45738a.seek(jR0);
        this.f45738a.write(bArr, i10, i12);
        this.f45738a.seek(32L);
        this.f45738a.write(bArr, i10 + i12, i11 - i12);
    }

    private void e0(long j10) throws IOException {
        this.f45738a.setLength(j10);
        this.f45738a.getChannel().force(true);
    }

    private void g(long j10) throws IOException {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long jF = F();
        if (jF >= j13) {
            return;
        }
        long j14 = this.f45741d;
        do {
            jF += j14;
            j14 <<= 1;
        } while (jF < j13);
        e0(j14);
        b bVar = this.f45744g;
        long jR0 = r0(bVar.f45754a + 4 + ((long) bVar.f45755b));
        if (jR0 <= this.f45743f.f45754a) {
            FileChannel channel = this.f45738a.getChannel();
            channel.position(this.f45741d);
            j11 = jR0 - 32;
            if (channel.transferTo(32L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j11 = 0;
        }
        long j15 = this.f45744g.f45754a;
        long j16 = this.f45743f.f45754a;
        if (j15 < j16) {
            long j17 = (this.f45741d + j15) - 32;
            s0(j14, this.f45742e, j16, j17);
            this.f45744g = new b(j17, this.f45744g.f45755b);
            j12 = j14;
        } else {
            s0(j14, this.f45742e, j16, j15);
            j12 = j14;
        }
        this.f45741d = j12;
        if (this.f45747j) {
            U(32L, j11);
        }
    }

    static Throwable h(Throwable th) throws Throwable {
        throw th;
    }

    private long h0() {
        if (this.f45742e == 0) {
            return 32L;
        }
        b bVar = this.f45744g;
        long j10 = bVar.f45754a;
        long j11 = this.f45743f.f45754a;
        return j10 >= j11 ? (j10 - j11) + 4 + ((long) bVar.f45755b) + 32 : (((j10 + 4) + ((long) bVar.f45755b)) + this.f45741d) - j11;
    }

    static RandomAccessFile i(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileO = o(file2);
            try {
                randomAccessFileO.setLength(4096L);
                randomAccessFileO.seek(0L);
                randomAccessFileO.writeInt(-2147483647);
                randomAccessFileO.writeLong(4096L);
                randomAccessFileO.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFileO.close();
                throw th;
            }
        }
        return o(file);
    }

    private static RandomAccessFile o(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void s() throws IOException {
        this.f45738a.seek(0L);
        this.f45738a.readFully(this.f45745h);
        this.f45741d = x(this.f45745h, 4);
        this.f45742e = t(this.f45745h, 12);
        long jX = x(this.f45745h, 16);
        long jX2 = x(this.f45745h, 24);
        if (this.f45741d > this.f45738a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f45741d + ", Actual length: " + this.f45738a.length());
        }
        if (this.f45741d > 32) {
            this.f45743f = p(jX);
            this.f45744g = p(jX2);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f45741d + ") is invalid.");
        }
    }

    private void s0(long j10, int i10, long j11, long j12) throws IOException {
        this.f45738a.seek(0L);
        t0(this.f45745h, 0, -2147483647);
        u0(this.f45745h, 4, j10);
        t0(this.f45745h, 12, i10);
        u0(this.f45745h, 16, j11);
        u0(this.f45745h, 24, j12);
        this.f45738a.write(this.f45745h, 0, 32);
    }

    private static int t(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private static void t0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void u0(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >> 56);
        bArr[i10 + 1] = (byte) (j10 >> 48);
        bArr[i10 + 2] = (byte) (j10 >> 40);
        bArr[i10 + 3] = (byte) (j10 >> 32);
        bArr[i10 + 4] = (byte) (j10 >> 24);
        bArr[i10 + 5] = (byte) (j10 >> 16);
        bArr[i10 + 6] = (byte) (j10 >> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    private static long x(byte[] bArr, int i10) {
        return ((((long) bArr[i10]) & 255) << 56) + ((((long) bArr[i10 + 1]) & 255) << 48) + ((((long) bArr[i10 + 2]) & 255) << 40) + ((((long) bArr[i10 + 3]) & 255) << 32) + ((((long) bArr[i10 + 4]) & 255) << 24) + ((((long) bArr[i10 + 5]) & 255) << 16) + ((((long) bArr[i10 + 6]) & 255) << 8) + (((long) bArr[i10 + 7]) & 255);
    }

    public void G() throws IOException {
        L(1);
    }

    public void L(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i10 + ") number of elements.");
        }
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f45742e) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i10 > this.f45742e) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i10 + ") than present in queue (" + this.f45742e + ").");
        }
        b bVar = this.f45743f;
        long j10 = bVar.f45754a;
        int iT = bVar.f45755b;
        long j11 = 0;
        int i11 = 0;
        long j12 = j10;
        while (i11 < i10) {
            j11 += (long) (iT + 4);
            long jR0 = r0(j12 + 4 + ((long) iT));
            if (!Z(jR0, this.f45745h, 0, 4)) {
                return;
            }
            iT = t(this.f45745h, 0);
            i11++;
            j12 = jR0;
        }
        s0(this.f45741d, this.f45742e - i10, j12, this.f45744g.f45754a);
        this.f45742e -= i10;
        this.f45746i++;
        this.f45743f = new b(j12, iT);
        if (this.f45747j) {
            U(j10, j11);
        }
    }

    boolean Z(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            long jR0 = r0(j10);
            long j11 = ((long) i11) + jR0;
            long j12 = this.f45741d;
            if (j11 <= j12) {
                this.f45738a.seek(jR0);
                this.f45738a.readFully(bArr, i10, i11);
                return true;
            }
            int i12 = (int) (j12 - jR0);
            this.f45738a.seek(jR0);
            this.f45738a.readFully(bArr, i10, i12);
            this.f45738a.seek(32L);
            this.f45738a.readFully(bArr, i10 + i12, i11 - i12);
            return true;
        } catch (EOFException unused) {
            P();
            return false;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable unused2) {
            P();
            return false;
        }
    }

    public void clear() throws IOException {
        if (this.f45749l) {
            throw new IllegalStateException("closed");
        }
        s0(4096L, 0, 0L, 0L);
        if (this.f45747j) {
            this.f45738a.seek(32L);
            this.f45738a.write(f45737m, 0, 4064);
        }
        this.f45742e = 0;
        b bVar = b.f45753c;
        this.f45743f = bVar;
        this.f45744g = bVar;
        if (this.f45741d > 4096) {
            e0(4096L);
        }
        this.f45741d = 4096L;
        this.f45746i++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f45749l = true;
        this.f45738a.close();
    }

    public void e(byte[] bArr, int i10, int i11) throws IOException {
        long jR0;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f45749l) {
            throw new IllegalStateException("closed");
        }
        if (k()) {
            G();
        }
        g(i11);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jR0 = 32;
        } else {
            b bVar = this.f45744g;
            jR0 = r0(bVar.f45754a + 4 + ((long) bVar.f45755b));
        }
        b bVar2 = new b(jR0, i11);
        t0(this.f45745h, 0, i11);
        c0(bVar2.f45754a, this.f45745h, 0, 4);
        c0(bVar2.f45754a + 4, bArr, i10, i11);
        s0(this.f45741d, this.f45742e + 1, zIsEmpty ? bVar2.f45754a : this.f45743f.f45754a, bVar2.f45754a);
        this.f45744g = bVar2;
        this.f45742e++;
        this.f45746i++;
        if (zIsEmpty) {
            this.f45743f = bVar2;
        }
    }

    public boolean isEmpty() {
        return this.f45742e == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    public boolean k() {
        return this.f45748k != -1 && size() == this.f45748k;
    }

    b p(long j10) {
        if (j10 != 0 && Z(j10, this.f45745h, 0, 4)) {
            return new b(j10, t(this.f45745h, 0));
        }
        return b.f45753c;
    }

    long r0(long j10) {
        long j11 = this.f45741d;
        return j10 < j11 ? j10 : (j10 + 32) - j11;
    }

    public int size() {
        return this.f45742e;
    }

    public String toString() {
        return "QueueFile{file=" + this.f45739b + ", zero=" + this.f45747j + ", length=" + this.f45741d + ", size=" + this.f45742e + ", first=" + this.f45743f + ", last=" + this.f45744g + '}';
    }
}
