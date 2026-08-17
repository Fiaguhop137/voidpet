package com.facebook.imagepipeline.nativecode;

import V4.p;
import V5.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.soloader.InterfaceC2306g;
import java.util.Locale;
import p025b6.k;
import p079e6.g;
import p079e6.h;

/* JADX INFO: loaded from: classes2.dex */
@V4.d
public abstract class DalvikPurgeableDecoder implements p097f6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final byte[] f28949b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f28950a = h.a();

    @InterfaceC2306g
    private static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        a.a();
        f28949b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(Z4.a aVar, int i10) {
        Y4.h hVar = (Y4.h) aVar.m();
        return i10 >= 2 && hVar.R(i10 + (-2)) == -1 && hVar.R(i10 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i10, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        options.inMutable = true;
        return options;
    }

    @V4.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // p097f6.d
    public Z4.a a(k kVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.o(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        Z4.a aVarE = kVar.e();
        V4.k.g(aVarE);
        try {
            return g(d(aVarE, i10, optionsF));
        } finally {
            Z4.a.g(aVarE);
        }
    }

    @Override // p097f6.d
    public Z4.a b(k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(kVar.o(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        Z4.a aVarE = kVar.e();
        V4.k.g(aVarE);
        try {
            return g(c(aVarE, optionsF));
        } finally {
            Z4.a.g(aVarE);
        }
    }

    protected abstract Bitmap c(Z4.a aVar, BitmapFactory.Options options);

    protected abstract Bitmap d(Z4.a aVar, int i10, BitmapFactory.Options options);

    public Z4.a g(Bitmap bitmap) {
        V4.k.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f28950a.g(bitmap)) {
                return Z4.a.x(bitmap, this.f28950a.e());
            }
            int iJ = p222m6.c.j(bitmap);
            bitmap.recycle();
            throw new i(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iJ), Integer.valueOf(this.f28950a.b()), Long.valueOf(this.f28950a.f()), Integer.valueOf(this.f28950a.c()), Integer.valueOf(this.f28950a.d())));
        } catch (Exception e10) {
            bitmap.recycle();
            throw p.a(e10);
        }
    }
}
