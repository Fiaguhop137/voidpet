package com.facebook.imagepipeline.platform;

import V4.d;
import V4.k;
import V4.p;
import Y4.h;
import Y4.j;
import Z4.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p078e5.b;
import p078e5.c;

/* JADX INFO: loaded from: classes2.dex */
@d
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f28961d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f28962c = c.i();

    @d
    public GingerbreadPurgeableDecoder() {
    }

    private static MemoryFile h(a aVar, int i10, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        p024b5.a aVar2;
        j jVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i10);
        memoryFile.allowPurging(false);
        try {
            j jVar2 = new j((h) aVar.m());
            try {
                aVar2 = new p024b5.a(jVar2, i10);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    V4.a.a(aVar2, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i10, bArr.length);
                    }
                    a.g(aVar);
                    V4.b.b(jVar2);
                    V4.b.b(aVar2);
                    V4.b.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    jVar = jVar2;
                    a.g(aVar);
                    V4.b.b(jVar);
                    V4.b.b(aVar2);
                    V4.b.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar2 = null;
        }
    }

    private Bitmap i(a aVar, int i10, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile memoryFileH = h(aVar, i10, bArr);
                try {
                    FileDescriptor fileDescriptorK = k(memoryFileH);
                    b bVar = this.f28962c;
                    if (bVar == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmap = (Bitmap) k.h(bVar.a(fileDescriptorK, null, options), "BitmapFactory returned null");
                    if (memoryFileH != null) {
                        memoryFileH.close();
                    }
                    return bitmap;
                } catch (IOException e10) {
                    e = e10;
                    memoryFile = memoryFileH;
                    throw p.a(e);
                } catch (Throwable th) {
                    th = th;
                    memoryFile = memoryFileH;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private synchronized Method j() {
        if (f28961d == null) {
            try {
                f28961d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e10) {
                throw p.a(e10);
            }
        }
        return f28961d;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, null));
        } catch (Exception e10) {
            throw p.a(e10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        return i(aVar, ((h) aVar.m()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        return i(aVar, i10, DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.f28949b, options);
    }
}
