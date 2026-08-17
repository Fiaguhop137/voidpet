package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f28653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f28654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p328s4.b f28655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28656d;

    public c(OutputStream outputStream, p328s4.b bVar) {
        this(outputStream, bVar, 65536);
    }

    c(OutputStream outputStream, p328s4.b bVar, int i10) {
        this.f28653a = outputStream;
        this.f28655c = bVar;
        this.f28654b = (byte[]) bVar.c(i10, byte[].class);
    }

    private void a() throws IOException {
        int i10 = this.f28656d;
        if (i10 > 0) {
            this.f28653a.write(this.f28654b, 0, i10);
            this.f28656d = 0;
        }
    }

    private void b() throws IOException {
        if (this.f28656d == this.f28654b.length) {
            a();
        }
    }

    private void c() {
        byte[] bArr = this.f28654b;
        if (bArr != null) {
            this.f28655c.put(bArr);
            this.f28654b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f28653a.close();
            c();
        } catch (Throwable th) {
            this.f28653a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f28653a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f28654b;
        int i11 = this.f28656d;
        this.f28656d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f28656d;
            if (i15 == 0 && i13 >= this.f28654b.length) {
                this.f28653a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f28654b.length - i15);
            System.arraycopy(bArr, i14, this.f28654b, this.f28656d, iMin);
            this.f28656d += iMin;
            i12 += iMin;
            b();
        } while (i12 < i11);
    }
}
