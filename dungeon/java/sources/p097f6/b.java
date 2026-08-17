package p097f6;

import T5.f;
import V4.k;
import Z4.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p079e6.i;
import p079e6.r;
import p199l1.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f41775f = b.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f41776g = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f41777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PreverificationHelper f41780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final e f41781e;

    private static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f41782a = new a();

        private a() {
        }

        @Override // Z4.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
        }
    }

    public b(i iVar, e eVar, f fVar) {
        this.f41780d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f41777a = iVar;
        if (iVar instanceof r) {
            this.f41778b = fVar.a();
            this.f41779c = fVar.b();
        }
        this.f41781e = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:36:0x007d, B:39:0x0087, B:49:0x009f, B:68:0x00c7, B:64:0x00c0, B:65:0x00c3, B:62:0x00ba), top: B:98:0x007d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private Z4.a c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        k.g(inputStream);
        int i10 = options.outWidth;
        int iHeight = options.outHeight;
        ?? r10 = i10;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r10 = iWidth;
        }
        int i11 = Build.VERSION.SDK_INT;
        boolean z10 = i11 >= 26 && (preverificationHelper = this.f41780d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                if (rect != null || !z10) {
                    if (rect != null && z10) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f41778b) {
                        bitmap = (Bitmap) this.f41777a.get(d(r10, iHeight, options));
                        if (bitmap == null) {
                            bitmap2 = bitmap;
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                    }
                    bitmap2 = bitmap;
                    options.inBitmap = bitmap2;
                    if (i11 >= 26) {
                        if (colorSpace == null) {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    byteBufferAllocate = (ByteBuffer) this.f41781e.acquire();
                    if (byteBufferAllocate == null) {
                        byteBufferAllocate = ByteBuffer.allocate(Y4.b.d());
                    }
                    options.inTempStorage = byteBufferAllocate.array();
                    if (rect != null || bitmap2 == 0) {
                        bitmapDecodeStream = null;
                    } else {
                        Bitmap.Config config = options.inPreferredConfig;
                        try {
                            if (config != null) {
                                try {
                                    bitmap2.reconfigure(r10, iHeight, config);
                                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        try {
                                            bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            W4.a.k(f41775f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoderNewInstance != null) {
                                                bitmapRegionDecoderNewInstance.recycle();
                                            }
                                            bitmapDecodeStream = null;
                                        }
                                    } else {
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                } catch (IOException unused2) {
                                    bitmapRegionDecoderNewInstance = null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (bitmapRegionDecoder != 0) {
                                        bitmapRegionDecoder.recycle();
                                    }
                                    throw th;
                                }
                            } else {
                                bitmapDecodeStream = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bitmapRegionDecoder = r10;
                        }
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f41781e.a(byteBufferAllocate);
                    if (bitmap2 != 0 || bitmap2 == bitmapDecodeStream) {
                        return this.f41779c ? Z4.a.x(bitmapDecodeStream, a.f41782a) : Z4.a.x(bitmapDecodeStream, this.f41777a);
                    }
                    this.f41777a.a(bitmap2);
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    throw new IllegalStateException();
                }
                options.inMutable = false;
                options.inTempStorage = byteBufferAllocate.array();
                if (rect != null) {
                    bitmapDecodeStream = null;
                } else {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                }
                this.f41781e.a(byteBufferAllocate);
                if (bitmap2 != 0) {
                }
                if (this.f41779c) {
                }
            } catch (Throwable th3) {
                this.f41781e.a(byteBufferAllocate);
                throw th3;
            }
        } catch (IllegalArgumentException e10) {
            if (bitmap2 != 0) {
                this.f41777a.a(bitmap2);
            }
            try {
                inputStream.reset();
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                if (bitmapDecodeStream2 == null) {
                    throw e10;
                }
                Z4.a aVarX = Z4.a.x(bitmapDecodeStream2, f.b());
                this.f41781e.a(byteBufferAllocate);
                return aVarX;
            } catch (IOException unused3) {
                throw e10;
            }
        } catch (RuntimeException e11) {
            if (bitmap2 != 0) {
                this.f41777a.a(bitmap2);
            }
            throw e11;
        }
        bitmap2 = 0;
        bitmap2 = bitmap;
        options.inBitmap = bitmap2;
        if (i11 >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        byteBufferAllocate = (ByteBuffer) this.f41781e.acquire();
        if (byteBufferAllocate == null) {
            byteBufferAllocate = ByteBuffer.allocate(Y4.b.d());
        }
    }

    private static BitmapFactory.Options e(p025b6.k kVar, Bitmap.Config config, boolean z10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = kVar.o();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z11 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z11) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z10) {
            BitmapFactory.decodeStream(kVar.k(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z11) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // p097f6.d
    public Z4.a a(p025b6.k kVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        boolean zU = kVar.u(i10);
        BitmapFactory.Options optionsE = e(kVar, config, this.f41778b);
        InputStream inputStreamK = kVar.k();
        k.g(inputStreamK);
        if (kVar.p() > i10) {
            inputStreamK = new p024b5.a(inputStreamK, i10);
        }
        if (!zU) {
            inputStreamK = new p024b5.b(inputStreamK, f41776g);
        }
        boolean z10 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                Z4.a aVarC = c(inputStreamK, optionsE, rect, colorSpace);
                try {
                    inputStreamK.close();
                    return aVarC;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return aVarC;
                }
            } catch (Throwable th) {
                try {
                    inputStreamK.close();
                    throw th;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    throw th;
                }
            }
        } catch (RuntimeException e12) {
            if (!z10) {
                throw e12;
            }
            Z4.a aVarA = a(kVar, Bitmap.Config.ARGB_8888, rect, i10, colorSpace);
            try {
                inputStreamK.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
            return aVarA;
        }
    }

    @Override // p097f6.d
    public Z4.a b(p025b6.k kVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsE = e(kVar, config, this.f41778b);
        boolean z10 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c((InputStream) k.g(kVar.k()), optionsE, rect, colorSpace);
        } catch (RuntimeException e10) {
            if (z10) {
                return b(kVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e10;
        }
    }

    public abstract int d(int i10, int i11, BitmapFactory.Options options);
}
