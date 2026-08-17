package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f31362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileInputStream f31363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FileChannel f31364c;

    public i(File file) {
        this.f31362a = file;
        a();
    }

    @Override // com.facebook.soloader.h
    public int L0(ByteBuffer byteBuffer, long j10) {
        return this.f31364c.read(byteBuffer, j10);
    }

    public void a() {
        FileInputStream fileInputStream = new FileInputStream(this.f31362a);
        this.f31363b = fileInputStream;
        this.f31364c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31363b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f31364c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f31364c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f31364c.write(byteBuffer);
    }
}
