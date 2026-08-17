package p436y4;

import L4.l;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p274p4.c;
import p274p4.g;
import p274p4.h;
import p274p4.k;
import p310r4.v;
import p328s4.b;

/* JADX INFO: renamed from: y4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4359c implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f57884b = g.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f57885c = g.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f57886a;

    public C4359c(b bVar) {
        this.f57886a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, h hVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(f57885c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p274p4.k
    public c b(h hVar) {
        return c.TRANSFORMED;
    }

    @Override // p274p4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(v vVar, File file, h hVar) {
        boolean z10;
        Bitmap bitmap = (Bitmap) vVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, hVar);
        M4.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = L4.g.b();
            int iIntValue = ((Integer) hVar.c(f57884b)).intValue();
            OutputStream cVar = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        cVar = this.f57886a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f57886a) : fileOutputStream;
                        bitmap.compress(compressFormatD, iIntValue, cVar);
                        cVar.close();
                        try {
                            cVar.close();
                        } catch (IOException unused) {
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        e = e10;
                        cVar = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z10 = false;
                    } catch (Throwable th) {
                        th = th;
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e11) {
                e = e11;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormatD + " of size " + l.i(bitmap) + " in " + L4.g.a(jB) + ", options format: " + hVar.c(f57885c) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            M4.b.e();
            return z10;
        } catch (Throwable th3) {
            M4.b.e();
            throw th3;
        }
    }
}
