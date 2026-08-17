package p079e6;

import V4.k;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: e6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3272f implements v, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedMemory f40486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f40487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40488c;

    public C3272f(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f40486a = sharedMemoryCreate;
            this.f40487b = sharedMemoryCreate.mapReadWrite();
            this.f40488c = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    private void e(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof C3272f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!vVar.isClosed());
        k.g(this.f40487b);
        k.g(vVar.E());
        w.b(i10, vVar.a(), i11, i12, a());
        this.f40487b.position(i10);
        vVar.E().position(i11);
        byte[] bArr = new byte[i12];
        this.f40487b.get(bArr, 0, i12);
        vVar.E().put(bArr, 0, i12);
    }

    @Override // p079e6.v
    public synchronized int D(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.g(this.f40487b);
        iA = w.a(i10, i12, a());
        w.b(i10, bArr.length, i11, iA, a());
        this.f40487b.position(i10);
        this.f40487b.get(bArr, i11, iA);
        return iA;
    }

    @Override // p079e6.v
    public ByteBuffer E() {
        return this.f40487b;
    }

    @Override // p079e6.v
    public synchronized byte R(int i10) {
        boolean z10 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= a()) {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        k.g(this.f40487b);
        return this.f40487b.get(i10);
    }

    @Override // p079e6.v
    public long W() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // p079e6.v
    public int a() {
        k.g(this.f40486a);
        return this.f40486a.getSize();
    }

    @Override // p079e6.v
    public long b() {
        return this.f40488c;
    }

    @Override // p079e6.v
    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.g(this.f40487b);
        iA = w.a(i10, i12, a());
        w.b(i10, bArr.length, i11, iA, a());
        this.f40487b.position(i10);
        this.f40487b.put(bArr, i11, iA);
        return iA;
    }

    @Override // p079e6.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f40486a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f40487b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f40487b = null;
                this.f40486a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p079e6.v
    public void d(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.b() == b()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(b()) + " to AshmemMemoryChunk " + Long.toHexString(vVar.b()) + " which are the same ");
            k.b(Boolean.FALSE);
        }
        if (vVar.b() < b()) {
            synchronized (vVar) {
                synchronized (this) {
                    e(i10, vVar, i11, i12);
                }
            }
        } else {
            synchronized (this) {
                synchronized (vVar) {
                    e(i10, vVar, i11, i12);
                }
            }
        }
    }

    @Override // p079e6.v
    public synchronized boolean isClosed() {
        return this.f40487b == null || this.f40486a == null;
    }
}
