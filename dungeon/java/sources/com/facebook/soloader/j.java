package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f31365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZipEntry f31366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZipFile f31367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31369e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f31370f = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f31367c = zipFile;
        this.f31366b = zipEntry;
        this.f31368d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f31365a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.h
    public int L0(ByteBuffer byteBuffer, long j10) throws IOException {
        if (this.f31365a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j11 = this.f31368d - j10;
        if (j11 <= 0) {
            return -1;
        }
        int i10 = (int) j11;
        if (iRemaining > i10) {
            iRemaining = i10;
        }
        a(j10);
        if (byteBuffer.hasArray()) {
            this.f31365a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f31365a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f31370f += (long) iRemaining;
        return iRemaining;
    }

    public h a(long j10) throws IOException {
        InputStream inputStream = this.f31365a;
        if (inputStream == null) {
            throw new IOException(this.f31366b.getName() + "'s InputStream is null");
        }
        long j11 = this.f31370f;
        if (j10 == j11) {
            return this;
        }
        long j12 = this.f31368d;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j10 >= j11) {
            inputStream.skip(j10 - j11);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f31367c.getInputStream(this.f31366b);
            this.f31365a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f31366b.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j10);
        }
        this.f31370f = j10;
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f31365a;
        if (inputStream != null) {
            inputStream.close();
            this.f31369e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f31369e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return L0(byteBuffer, this.f31370f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
