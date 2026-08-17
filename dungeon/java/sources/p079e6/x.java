package p079e6;

import V4.k;
import Y4.h;
import Z4.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class x implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f40526b;

    public x(a aVar, int i10) {
        k.g(aVar);
        k.b(Boolean.valueOf(i10 >= 0 && i10 <= ((v) aVar.m()).a()));
        this.f40526b = aVar.clone();
        this.f40525a = i10;
    }

    @Override // Y4.h
    public synchronized int D(int i10, byte[] bArr, int i11, int i12) {
        a();
        k.b(Boolean.valueOf(i10 + i12 <= this.f40525a));
        k.g(this.f40526b);
        return ((v) this.f40526b.m()).D(i10, bArr, i11, i12);
    }

    @Override // Y4.h
    public synchronized ByteBuffer E() {
        k.g(this.f40526b);
        return ((v) this.f40526b.m()).E();
    }

    @Override // Y4.h
    public synchronized byte R(int i10) {
        a();
        k.b(Boolean.valueOf(i10 >= 0));
        k.b(Boolean.valueOf(i10 < this.f40525a));
        k.g(this.f40526b);
        return ((v) this.f40526b.m()).R(i10);
    }

    @Override // Y4.h
    public synchronized long W() {
        a();
        k.g(this.f40526b);
        return ((v) this.f40526b.m()).W();
    }

    synchronized void a() {
        if (isClosed()) {
            throw new h.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a.g(this.f40526b);
        this.f40526b = null;
    }

    @Override // Y4.h
    public synchronized boolean isClosed() {
        return !a.r(this.f40526b);
    }

    @Override // Y4.h
    public synchronized int size() {
        a();
        return this.f40525a;
    }
}
