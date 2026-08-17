package I7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class d extends com.github.penfeizhou.animation.decode.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final PorterDuffXfermode f5059f = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final PorterDuffXfermode f5060g = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f5061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f5062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f5063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f5064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5065e;

    public d(J7.a aVar, c cVar) {
        super(aVar);
        this.frameWidth = cVar.f5052f;
        this.frameHeight = cVar.f5053g;
        this.frameX = cVar.f5050d;
        this.frameY = cVar.f5051e;
        int i10 = cVar.f5054h;
        this.frameDuration = i10;
        if (i10 == 0) {
            this.frameDuration = 100;
        }
        this.f5063c = cVar.d();
        this.f5064d = cVar.e();
        this.f5061a = cVar.f5068c + 24;
        int i11 = cVar.f5067b;
        this.f5062b = (i11 - 16) + (i11 & 1);
        this.f5065e = cVar.f5056j != null;
    }

    private int b(J7.b bVar) {
        int i10 = 30 + this.f5062b;
        bVar.d(i10);
        bVar.h("RIFF");
        bVar.j(i10);
        bVar.h("WEBP");
        bVar.j(k.f5073g);
        bVar.j(10);
        bVar.b((byte) (this.f5065e ? 16 : 0));
        bVar.i(0);
        bVar.g(this.frameWidth);
        bVar.g(this.frameHeight);
        try {
            ((J7.a) this.reader).reset();
            ((J7.a) this.reader).skip(this.f5061a);
            ((J7.a) this.reader).read(bVar.f(), bVar.a(), this.f5062b);
            return i10;
        } catch (IOException e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, J7.b bVar) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        int iB = b(bVar);
        byte[] bArrF = bVar.f();
        try {
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options);
        } catch (IllegalArgumentException unused) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i10;
            options2.inMutable = true;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, iB, options2);
        }
        if (bitmapDecodeByteArray == null) {
            return bitmap;
        }
        if (this.f5063c) {
            paint.setXfermode(f5060g);
        } else {
            paint.setXfermode(f5059f);
        }
        Rect rect = this.srcRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = bitmapDecodeByteArray.getWidth();
        this.srcRect.bottom = bitmapDecodeByteArray.getHeight();
        Rect rect2 = this.dstRect;
        int i11 = this.frameX;
        float f10 = i10;
        rect2.left = (int) ((i11 * 2.0f) / f10);
        rect2.top = (int) ((this.frameY * 2.0f) / f10);
        rect2.right = (int) (((i11 * 2.0f) / f10) + bitmapDecodeByteArray.getWidth());
        this.dstRect.bottom = (int) (((this.frameY * 2.0f) / f10) + bitmapDecodeByteArray.getHeight());
        canvas.drawBitmap(bitmapDecodeByteArray, this.srcRect, this.dstRect, paint);
        return bitmapDecodeByteArray;
    }
}
