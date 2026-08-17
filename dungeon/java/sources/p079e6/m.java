package p079e6;

import V4.k;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class m implements v, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f40507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40509c = System.identityHashCode(this);

    public m(int i10) {
        this.f40507a = ByteBuffer.allocateDirect(i10);
        this.f40508b = i10;
    }

    private void e(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof m)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!vVar.isClosed());
        k.g(this.f40507a);
        w.b(i10, vVar.a(), i11, i12, this.f40508b);
        this.f40507a.position(i10);
        ByteBuffer byteBuffer = (ByteBuffer) k.g(vVar.E());
        byteBuffer.position(i11);
        byte[] bArr = new byte[i12];
        this.f40507a.get(bArr, 0, i12);
        byteBuffer.put(bArr, 0, i12);
    }

    @Override // p079e6.v
    public synchronized int D(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        k.g(this.f40507a);
        iA = w.a(i10, i12, this.f40508b);
        w.b(i10, bArr.length, i11, iA, this.f40508b);
        this.f40507a.position(i10);
        this.f40507a.get(bArr, i11, iA);
        return iA;
    }

    @Override // p079e6.v
    public synchronized ByteBuffer E() {
        return this.f40507a;
    }

    @Override // p079e6.v
    public synchronized byte R(int i10) {
        boolean z10 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f40508b) {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        k.g(this.f40507a);
        return this.f40507a.get(i10);
    }

    @Override // p079e6.v
    public long W() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // p079e6.v
    public int a() {
        return this.f40508b;
    }

    @Override // p079e6.v
    public long b() {
        return this.f40509c;
    }

    @Override // p079e6.v
    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        k.g(this.f40507a);
        iA = w.a(i10, i12, this.f40508b);
        w.b(i10, bArr.length, i11, iA, this.f40508b);
        this.f40507a.position(i10);
        this.f40507a.put(bArr, i11, iA);
        return iA;
    }

    @Override // p079e6.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f40507a = null;
    }

    @Override // p079e6.v
    public void d(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.b() == b()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(b()) + " to BufferMemoryChunk " + Long.toHexString(vVar.b()) + " which are the same ");
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
        return this.f40507a == null;
    }
}
