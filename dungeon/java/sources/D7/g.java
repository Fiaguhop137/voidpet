package D7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.gif.decode.GifFrame;
import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class g extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f2229A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private E7.a f2230w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f2231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2232y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final b f2233z;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ByteBuffer f2234a;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public g(G7.b bVar, com.github.penfeizhou.animation.decode.b.j jVar) {
        super(bVar, jVar);
        this.f2230w = new E7.a();
        Paint paint = new Paint();
        this.f2231x = paint;
        this.f2232y = 0;
        this.f2233z = new b(null);
        this.f2229A = 1;
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        this.f2233z.f2234a = null;
        this.f2230w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        GifFrame gifFrame = (GifFrame) aVar;
        Bitmap bitmapI = I(this.f31531p.width() / this.f31526k, this.f31531p.height() / this.f31526k);
        Canvas canvas = (Canvas) this.f31529n.get(bitmapI);
        if (canvas == null) {
            canvas = new Canvas(bitmapI);
            this.f31529n.put(bitmapI, canvas);
        }
        this.f31530o.rewind();
        bitmapI.copyPixelsFromBuffer(this.f31530o);
        int i10 = !gifFrame.transparencyFlag() ? this.f2232y : 0;
        int i11 = this.f31520e;
        if (i11 == 0) {
            bitmapI.eraseColor(i10);
        } else {
            GifFrame gifFrame2 = (GifFrame) this.f31519d.get(i11 - 1);
            canvas.save();
            int i12 = gifFrame2.frameX;
            int i13 = this.f31526k;
            int i14 = gifFrame2.frameY;
            canvas.clipRect(i12 / i13, i14 / i13, (i12 + gifFrame2.frameWidth) / i13, (i14 + gifFrame2.frameHeight) / i13);
            int i15 = gifFrame2.disposalMethod;
            if (i15 == 2) {
                canvas.drawColor(this.f2232y, PorterDuff.Mode.CLEAR);
            } else if (i15 == 3) {
                this.f2233z.f2234a.rewind();
                canvas.drawColor(this.f2232y, PorterDuff.Mode.CLEAR);
                Bitmap bitmapI2 = I(this.f31531p.width() / this.f31526k, this.f31531p.height() / this.f31526k);
                bitmapI2.copyPixelsFromBuffer(this.f2233z.f2234a);
                canvas.drawBitmap(bitmapI2, 0.0f, 0.0f, this.f2231x);
                L(bitmapI2);
            }
            canvas.restore();
            if (gifFrame.disposalMethod == 3 && gifFrame2.disposalMethod != 3) {
                this.f31530o.rewind();
                this.f2233z.f2234a.rewind();
                this.f2233z.f2234a.put(this.f31530o);
            }
        }
        int i16 = aVar.frameWidth;
        int i17 = this.f31526k;
        Bitmap bitmapI3 = I(i16 / i17, aVar.frameHeight / i17);
        gifFrame.draw(canvas, this.f2231x, this.f31526k, bitmapI3, C());
        canvas.drawColor(i10, PorterDuff.Mode.DST_OVER);
        L(bitmapI3);
        this.f31530o.rewind();
        bitmapI.copyPixelsToBuffer(this.f31530o);
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public GifReader A(Reader reader) {
        return new GifReader(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public E7.a C() {
        if (this.f2230w == null) {
            this.f2230w = new E7.a();
        }
        return this.f2230w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(GifReader gifReader) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        c cVar = null;
        i iVar = null;
        for (D7.b bVar : h.c(gifReader)) {
            if (bVar instanceof k) {
                k kVar = (k) bVar;
                i11 = kVar.f2247a;
                i12 = kVar.f2248b;
                if (kVar.b()) {
                    i10 = kVar.f2250d & 255;
                }
            } else if (bVar instanceof c) {
                cVar = (c) bVar;
            } else if (bVar instanceof i) {
                iVar = (i) bVar;
            } else if (bVar instanceof j) {
                this.f31519d.add(new GifFrame(gifReader, cVar, iVar, (j) bVar));
            } else if (bVar instanceof D7.a) {
                D7.a aVar = (D7.a) bVar;
                if ("NETSCAPE2.0".equals(aVar.f2223b)) {
                    int i13 = aVar.f2222a;
                    if (i13 == 0) {
                        this.f2229A = 0;
                    } else if (i13 > 0) {
                        this.f2229A = i13 + 1;
                    }
                }
            }
        }
        int i14 = this.f31526k;
        long j10 = (((((long) i11) * ((long) i12)) / (((long) i14) * ((long) i14))) + 1) * 4;
        int i15 = (int) j10;
        try {
            this.f31530o = ByteBuffer.allocate(i15);
            this.f2233z.f2234a = ByteBuffer.allocate(i15);
            if (cVar != null && i10 >= 0 && i10 < cVar.b().length) {
                int i16 = cVar.b()[i10];
                this.f2232y = Color.rgb(i16 & 255, (i16 >> 8) & 255, (i16 >> 16) & 255);
            }
            return new Rect(0, 0, i11, i12);
        } catch (OutOfMemoryError e10) {
            Log.e("GifDecoder", String.format("OutOfMemoryError in GifDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j10 / 1048576.0d), Long.valueOf(j10)));
            this.f31530o = null;
            this.f2233z.f2234a = null;
            throw e10;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int t(int i10, int i11) {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f2229A;
    }
}
