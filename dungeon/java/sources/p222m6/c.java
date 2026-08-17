package p222m6;

import Ad.j;
import Y4.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p199l1.f;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f49137a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f49138b = j.b(new p222m6.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f49139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f49140d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49141a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f49141a = iArr;
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f b() {
        return new f(12);
    }

    private final ByteBuffer c() {
        return f49139c ? b.f16936a.acquire() : (ByteBuffer) g().acquire();
    }

    public static final Pair d(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c cVar = f49137a;
        ByteBuffer byteBufferK = cVar.k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferK.array();
            Pair pair = null;
            cVar.f(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            return pair;
        } finally {
            f49137a.l(byteBufferK);
        }
    }

    public static final e e(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c cVar = f49137a;
        ByteBuffer byteBufferK = cVar.k();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferK.array();
            cVar.f(inputStream, null, options);
            return new e(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
        } finally {
            f49137a.l(byteBufferK);
        }
    }

    private final f g() {
        return (f) f49138b.getValue();
    }

    public static final int h(Bitmap.Config config) {
        switch (config == null ? -1 : a.f49141a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int i(int i10, int i11, Bitmap.Config config) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + i10).toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + i11).toString());
        }
        int iH = h(config);
        int i12 = i10 * i11 * iH;
        if (i12 > 0) {
            return i12;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i12 + ", width: " + i10 + ", height: " + i11 + ", pixelSize: " + iH).toString());
    }

    public static final int j(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    private final ByteBuffer k() {
        ByteBuffer byteBufferC = c();
        if (byteBufferC != null) {
            return byteBufferC;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b.d());
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    private final void l(ByteBuffer byteBuffer) {
        if (f49139c) {
            return;
        }
        g().a(byteBuffer);
    }

    public final Bitmap f(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (!f49140d) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
