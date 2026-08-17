package com.github.penfeizhou.animation.gif.decode;

import D7.c;
import D7.i;
import D7.j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.a;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class GifFrame extends a {
    private static final int DEFAULT_DELAY = 10;
    private static final ThreadLocal<byte[]> sDataBlock;
    public final c colorTable;
    public final int disposalMethod;
    private final int imageDataOffset;
    private final boolean interlace;
    private final int lzwMinCodeSize;
    public final int transparentColorIndex;

    static {
        System.loadLibrary("animation-decoder-gif");
        sDataBlock = new ThreadLocal<>();
    }

    public GifFrame(GifReader gifReader, c cVar, i iVar, j jVar) {
        super(gifReader);
        if (iVar != null) {
            this.disposalMethod = iVar.c();
            int i10 = iVar.f2237c;
            this.frameDuration = (i10 <= 0 ? 10 : i10) * 10;
            if (iVar.d()) {
                this.transparentColorIndex = iVar.f2238d;
            } else {
                this.transparentColorIndex = -1;
            }
        } else {
            this.disposalMethod = 0;
            this.transparentColorIndex = -1;
        }
        this.frameX = jVar.f2239a;
        this.frameY = jVar.f2240b;
        this.frameWidth = jVar.f2241c;
        this.frameHeight = jVar.f2242d;
        this.interlace = jVar.b();
        if (jVar.c()) {
            this.colorTable = jVar.f2244f;
        } else {
            this.colorTable = cVar;
        }
        this.lzwMinCodeSize = jVar.f2245g;
        this.imageDataOffset = jVar.f2246h;
    }

    private native void uncompressLZW(GifReader gifReader, int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, boolean z10, byte[] bArr);

    @Override // com.github.penfeizhou.animation.decode.a
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, E7.a aVar) {
        try {
            aVar.c((this.frameWidth * this.frameHeight) / (i10 * i10));
            encode(aVar.b(), i10);
            bitmap.copyPixelsFromBuffer(aVar.a().rewind());
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            this.srcRect.bottom = bitmap.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f10 = i10;
            rect2.left = (int) (i11 / f10);
            rect2.top = (int) (this.frameY / f10);
            rect2.right = (int) ((i11 / f10) + bitmap.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f10) + bitmap.getHeight());
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, paint);
            return bitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return bitmap;
        }
    }

    public void encode(int[] iArr, int i10) throws IOException {
        ((GifReader) this.reader).reset();
        ((GifReader) this.reader).skip(this.imageDataOffset);
        ThreadLocal<byte[]> threadLocal = sDataBlock;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[255];
            threadLocal.set(bArr);
        }
        uncompressLZW((GifReader) this.reader, this.colorTable.b(), this.transparentColorIndex, iArr, this.frameWidth / i10, this.frameHeight / i10, this.lzwMinCodeSize, this.interlace, bArr);
    }

    public boolean transparencyFlag() {
        return this.transparentColorIndex >= 0;
    }
}
