package com.github.penfeizhou.animation.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f31564a;

    public a(ByteBuffer byteBuffer) {
        this.f31564a = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int available() {
        return this.f31564a.limit() - this.f31564a.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void close() {
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() {
        return this.f31564a.get();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.f31564a.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) {
        this.f31564a.get(bArr, i10, i11);
        return i11;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void reset() {
        this.f31564a.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) {
        ByteBuffer byteBuffer = this.f31564a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j10));
        return j10;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() {
        return new ByteArrayInputStream(this.f31564a.array());
    }
}
