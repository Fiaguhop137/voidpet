package com.facebook.animated.gif;

import O5.d;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class GifFrame implements d {

    @V4.d
    private long mNativeContext;

    @V4.d
    GifFrame(long j10) {
        this.mNativeContext = j10;
    }

    @V4.d
    private native void nativeDispose();

    @V4.d
    private native void nativeFinalize();

    @V4.d
    private native int nativeGetDisposalMode();

    @V4.d
    private native int nativeGetDurationMs();

    @V4.d
    private native int nativeGetHeight();

    @V4.d
    private native int nativeGetTransparentPixelColor();

    @V4.d
    private native int nativeGetWidth();

    @V4.d
    private native int nativeGetXOffset();

    @V4.d
    private native int nativeGetYOffset();

    @V4.d
    private native boolean nativeHasTransparency();

    @V4.d
    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

    @Override // O5.d
    public void a(int i10, int i11, Bitmap bitmap) {
        nativeRenderFrame(i10, i11, bitmap);
    }

    @Override // O5.d
    public int b() {
        return nativeGetXOffset();
    }

    @Override // O5.d
    public int c() {
        return nativeGetYOffset();
    }

    public int d() {
        return nativeGetDisposalMode();
    }

    @Override // O5.d
    public void dispose() {
        nativeDispose();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // O5.d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // O5.d
    public int getWidth() {
        return nativeGetWidth();
    }
}
