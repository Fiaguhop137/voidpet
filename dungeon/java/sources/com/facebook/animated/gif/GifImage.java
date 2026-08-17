package com.facebook.animated.gif;

import O5.b;
import O5.c;
import V4.d;
import V4.k;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import p241n7.a;

/* JADX INFO: loaded from: classes.dex */
@d
public class GifImage implements c, P5.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f28692b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap.Config f28693a = null;

    @d
    private long mNativeContext;

    @d
    public GifImage() {
    }

    @d
    GifImage(long j10) {
        this.mNativeContext = j10;
    }

    public static GifImage f(ByteBuffer byteBuffer, V5.d dVar) {
        h();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, dVar.f14072b, dVar.f14077g);
        gifImageNativeCreateFromDirectByteBuffer.f28693a = dVar.f14079i;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage g(long j10, int i10, V5.d dVar) {
        h();
        k.b(Boolean.valueOf(j10 != 0));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j10, i10, dVar.f14072b, dVar.f14077g);
        gifImageNativeCreateFromNativeMemory.f28693a = dVar.f14079i;
        return gifImageNativeCreateFromNativeMemory;
    }

    private static synchronized void h() {
        if (!f28692b) {
            f28692b = true;
            a.d("gifimage");
        }
    }

    private static b.EnumC0142b i(int i10) {
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                return b.EnumC0142b.DISPOSE_TO_BACKGROUND;
            }
            return i10 == 3 ? b.EnumC0142b.DISPOSE_TO_PREVIOUS : b.EnumC0142b.DISPOSE_DO_NOT;
        }
        return b.EnumC0142b.DISPOSE_DO_NOT;
    }

    @d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i10, boolean z10);

    @d
    private static native GifImage nativeCreateFromFileDescriptor(int i10, int i11, boolean z10);

    @d
    private static native GifImage nativeCreateFromNativeMemory(long j10, int i10, int i11, boolean z10);

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDuration();

    @d
    private native GifFrame nativeGetFrame(int i10);

    @d
    private native int nativeGetFrameCount();

    @d
    private native int[] nativeGetFrameDurations();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetLoopCount();

    @d
    private native int nativeGetSizeInBytes();

    @d
    private native int nativeGetWidth();

    @d
    private native boolean nativeIsAnimated();

    @Override // O5.c
    public int M() {
        return nativeGetSizeInBytes();
    }

    @Override // O5.c
    public boolean N() {
        return false;
    }

    @Override // O5.c
    public Bitmap.Config O() {
        return this.f28693a;
    }

    @Override // O5.c
    public int[] Q() {
        return nativeGetFrameDurations();
    }

    @Override // O5.c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // O5.c
    public int b() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // O5.c
    public b c(int i10) {
        GifFrame gifFrameP = P(i10);
        try {
            return new b(i10, gifFrameP.b(), gifFrameP.c(), gifFrameP.getWidth(), gifFrameP.getHeight(), b.a.BLEND_WITH_PREVIOUS, i(gifFrameP.d()));
        } finally {
            gifFrameP.dispose();
        }
    }

    @Override // P5.c
    public c d(long j10, int i10, V5.d dVar) {
        return g(j10, i10, dVar);
    }

    @Override // P5.c
    public c e(ByteBuffer byteBuffer, V5.d dVar) {
        return f(byteBuffer, dVar);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // O5.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // O5.c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // O5.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public GifFrame P(int i10) {
        return nativeGetFrame(i10);
    }
}
