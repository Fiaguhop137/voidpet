package L4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue f6333c = l.g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f6334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f6335b;

    d() {
    }

    public static d b(InputStream inputStream) {
        d dVar;
        Queue queue = f6333c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.d(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f6335b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f6334a.available();
    }

    public void c() {
        this.f6335b = null;
        this.f6334a = null;
        Queue queue = f6333c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6334a.close();
    }

    void d(InputStream inputStream) {
        this.f6334a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f6334a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f6334a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f6334a.read();
        } catch (IOException e10) {
            this.f6335b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f6334a.read(bArr);
        } catch (IOException e10) {
            this.f6335b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f6334a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f6335b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f6334a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f6334a.skip(j10);
        } catch (IOException e10) {
            this.f6335b = e10;
            throw e10;
        }
    }
}
