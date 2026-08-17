package com.github.penfeizhou.animation.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements Reader {
    protected Reader reader;

    public c(Reader reader) {
        this.reader = reader;
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int available() throws IOException {
        return this.reader.available();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public byte peek() throws IOException {
        return this.reader.peek();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int position() {
        return this.reader.position();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.reader.read(bArr, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public void reset() throws IOException {
        this.reader.reset();
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public long skip(long j10) throws IOException {
        return this.reader.skip(j10);
    }

    @Override // com.github.penfeizhou.animation.io.Reader
    public InputStream toInputStream() throws IOException {
        reset();
        return this.reader.toInputStream();
    }
}
