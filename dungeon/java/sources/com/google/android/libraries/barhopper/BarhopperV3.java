package com.google.android.libraries.barhopper;

import A9.C0787a;
import Ba.C0797a;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2753t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U0;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class BarhopperV3 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36069b = "BarhopperV3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36070a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j10);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private static C0797a e(byte[] bArr) {
        bArr.getClass();
        try {
            return C0797a.E(bArr, U0.a());
        } catch (C2753t1 e10) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e10);
        }
    }

    private native byte[] recognizeBitmapNative(long j10, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j10, int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j10, int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j10, int i10, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j10, int i10, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions);

    public void a(C0787a c0787a) {
        if (this.f36070a != 0) {
            Log.w(f36069b, "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(c0787a.c());
        this.f36070a = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    public C0797a b(int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j10 = this.f36070a;
        if (j10 != 0) {
            return e(recognizeBufferNative(j10, i10, i11, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C0797a c(int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j10 = this.f36070a;
        if (j10 != 0) {
            return e(recognizeNative(j10, i10, i11, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f36070a;
        if (j10 != 0) {
            closeNative(j10);
            this.f36070a = 0L;
        }
    }

    public C0797a d(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f36070a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d(f36069b, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return e(recognizeBitmapNative(this.f36070a, bitmap, recognitionOptions));
    }
}
