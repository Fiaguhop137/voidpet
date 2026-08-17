package com.github.penfeizhou.animation.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ByteBuffer f31565a;

    public b() {
        d(10240);
    }

    public int a() {
        return this.f31565a.position();
    }

    public void b(byte b10) {
        this.f31565a.put(b10);
    }

    public void c(byte[] bArr) {
        this.f31565a.put(bArr);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }

    public void d(int i10) {
        ByteBuffer byteBuffer = this.f31565a;
        if (byteBuffer == null || i10 > byteBuffer.capacity()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            this.f31565a = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f31565a.clear();
    }

    public void e(int i10) {
        this.f31565a.position(i10 + a());
    }

    public byte[] f() {
        return this.f31565a.array();
    }
}
