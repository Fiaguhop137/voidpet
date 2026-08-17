package p457z7;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.e;
import org.aomedia.avif.android.AvifDecoder;

/* JADX INFO: loaded from: classes2.dex */
public class a extends b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AvifDecoder f58486w;

    public a(G7.b bVar, b.j jVar) {
        super(bVar, jVar);
        this.f58486w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int B() {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected /* bridge */ /* synthetic */ e C() {
        X();
        return null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        AvifDecoder avifDecoder = this.f58486w;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.f58486w = null;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap bitmapI = I(this.f58486w.getWidth(), this.f58486w.getHeight());
        AvifDecoder avifDecoder = this.f58486w;
        if (avifDecoder == null) {
            return;
        }
        int i10 = this.f31520e;
        int i11 = ((b) aVar).f58487a;
        if (i10 != i11) {
            avifDecoder.nthFrame(i11, bitmapI);
        } else if (i10 == 0) {
            avifDecoder.nthFrame(0, bitmapI);
        } else {
            avifDecoder.nextFrame(bitmapI);
        }
        this.f31530o.rewind();
        try {
            bitmapI.copyPixelsToBuffer(this.f31530o);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public A7.a A(Reader reader) {
        return new A7.a(reader);
    }

    protected A7.b X() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(A7.a aVar) {
        this.f58486w = AvifDecoder.create(aVar.a());
        return new Rect(0, 0, this.f58486w.getWidth(), this.f58486w.getHeight());
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public com.github.penfeizhou.animation.decode.a u(int i10) {
        b bVar = new b(null);
        bVar.f58487a = i10;
        bVar.frameDuration = (int) (this.f58486w.getFrameDurations()[i10] * 1000.0d);
        return bVar;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public Bitmap v(int i10) {
        if (this.f58486w == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        this.f58486w.nthFrame(i10, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int w() {
        AvifDecoder avifDecoder = this.f58486w;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        AvifDecoder avifDecoder = this.f58486w;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.f58486w.getRepetitionCount();
    }
}
