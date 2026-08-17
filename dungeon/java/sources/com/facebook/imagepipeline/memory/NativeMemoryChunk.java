package com.facebook.imagepipeline.memory;

import V4.k;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p079e6.v;
import p079e6.w;

/* JADX INFO: loaded from: classes2.dex */
@V4.d
public class NativeMemoryChunk implements v, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28921c;

    static {
        p241n7.a.d("imagepipeline");
    }

    public NativeMemoryChunk() {
        this.f28920b = 0;
        this.f28919a = 0L;
        this.f28921c = true;
    }

    public NativeMemoryChunk(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f28920b = i10;
        this.f28919a = nativeAllocate(i10);
        this.f28921c = false;
    }

    private void e(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!vVar.isClosed());
        w.b(i10, vVar.a(), i11, i12, this.f28920b);
        nativeMemcpy(vVar.W() + ((long) i11), this.f28919a + ((long) i10), i12);
    }

    @V4.d
    private static native long nativeAllocate(int i10);

    @V4.d
    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    @V4.d
    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    @V4.d
    private static native void nativeFree(long j10);

    @V4.d
    private static native void nativeMemcpy(long j10, long j11, int i10);

    @V4.d
    private static native byte nativeReadByte(long j10);

    @Override // p079e6.v
    public synchronized int D(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = w.a(i10, i12, this.f28920b);
        w.b(i10, bArr.length, i11, iA, this.f28920b);
        nativeCopyToByteArray(this.f28919a + ((long) i10), bArr, i11, iA);
        return iA;
    }

    @Override // p079e6.v
    public ByteBuffer E() {
        return null;
    }

    @Override // p079e6.v
    public synchronized byte R(int i10) {
        boolean z10 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f28920b) {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        return nativeReadByte(this.f28919a + ((long) i10));
    }

    @Override // p079e6.v
    public long W() {
        return this.f28919a;
    }

    @Override // p079e6.v
    public int a() {
        return this.f28920b;
    }

    @Override // p079e6.v
    public long b() {
        return this.f28919a;
    }

    @Override // p079e6.v
    public synchronized int c(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = w.a(i10, i12, this.f28920b);
        w.b(i10, bArr.length, i11, iA, this.f28920b);
        nativeCopyFromByteArray(this.f28919a + ((long) i10), bArr, i11, iA);
        return iA;
    }

    @Override // p079e6.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f28921c) {
            this.f28921c = true;
            nativeFree(this.f28919a);
        }
    }

    @Override // p079e6.v
    public void d(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.b() == b()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(vVar)) + " which share the same address " + Long.toHexString(this.f28919a));
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

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // p079e6.v
    public synchronized boolean isClosed() {
        return this.f28921c;
    }
}
