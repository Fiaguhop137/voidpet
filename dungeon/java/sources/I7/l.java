package I7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public class l extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f5077A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f5078B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f5079C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private J7.b f5080D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f5081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Paint f5082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5083y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f5084z;

    public l(G7.b bVar, com.github.penfeizhou.animation.decode.b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.f5081w = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap bitmapI;
        Bitmap bitmapI2;
        int i10;
        if (aVar == null || this.f31531p == null || this.f31531p.width() <= 0 || this.f31531p.height() <= 0 || (bitmapI = I(this.f31531p.width() / this.f31526k, this.f31531p.height() / this.f31526k)) == null) {
            return;
        }
        Canvas canvas = (Canvas) this.f31529n.get(bitmapI);
        if (canvas == null) {
            canvas = new Canvas(bitmapI);
            this.f31529n.put(bitmapI, canvas);
        }
        Canvas canvas2 = canvas;
        this.f31530o.rewind();
        bitmapI.copyPixelsFromBuffer(this.f31530o);
        int i11 = this.f31520e;
        if (i11 != 0) {
            com.github.penfeizhou.animation.decode.a aVar2 = (com.github.penfeizhou.animation.decode.a) this.f31519d.get(i11 - 1);
            if ((aVar2 instanceof d) && ((d) aVar2).f5064d) {
                int i12 = aVar2.frameX;
                int i13 = this.f31526k;
                int i14 = aVar2.frameY;
                canvas2.drawRect((i12 * 2.0f) / i13, (i14 * 2.0f) / i13, ((i12 * 2) + aVar2.frameWidth) / i13, ((i14 * 2) + aVar2.frameHeight) / i13, this.f5081w);
            }
        } else if (this.f5078B) {
            canvas2.drawColor(0, PorterDuff.Mode.SRC);
        } else {
            canvas2.drawColor(this.f5079C, PorterDuff.Mode.SRC);
        }
        int i15 = aVar.frameWidth;
        if (i15 <= 0 || (i10 = aVar.frameHeight) <= 0) {
            bitmapI2 = null;
        } else {
            int i16 = this.f31526k;
            bitmapI2 = I(i15 / i16, i10 / i16);
        }
        Bitmap bitmap = bitmapI2;
        L(aVar.draw(canvas2, this.f5082x, this.f31526k, bitmap, C()));
        L(bitmap);
        this.f31530o.rewind();
        bitmapI.copyPixelsToBuffer(this.f31530o);
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public J7.a A(Reader reader) {
        return new J7.a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public J7.b C() {
        if (this.f5080D == null) {
            this.f5080D = new J7.b();
        }
        return this.f5080D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(J7.a aVar) {
        boolean z10 = false;
        boolean z11 = false;
        for (e eVar : m.b(aVar)) {
            if (eVar instanceof k) {
                k kVar = (k) eVar;
                this.f5084z = kVar.f5075e;
                this.f5077A = kVar.f5076f;
                this.f5078B = kVar.d();
                z11 = true;
            } else if (eVar instanceof b) {
                b bVar = (b) eVar;
                this.f5079C = bVar.f5047d;
                this.f5083y = bVar.f5048e;
                z10 = true;
            } else if (eVar instanceof c) {
                this.f31519d.add(new d(aVar, (c) eVar));
            }
        }
        if (!z10) {
            if (!z11) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(aVar.toInputStream(), null, options);
                this.f5084z = options.outWidth;
                this.f5077A = options.outHeight;
            }
            this.f31519d.add(new h(aVar, this.f5084z, this.f5077A));
            this.f5083y = 1;
        }
        Paint paint = new Paint();
        this.f5082x = paint;
        paint.setAntiAlias(true);
        if (!this.f5078B) {
            this.f5081w.setColor(this.f5079C);
        }
        return new Rect(0, 0, this.f5084z, this.f5077A);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f5083y;
    }
}
