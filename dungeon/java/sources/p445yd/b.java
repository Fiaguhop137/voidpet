package p445yd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import java.security.MessageDigest;
import p274p4.f;
import p328s4.d;
import p463zd.a;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58025c;

    public b(int i10, int i11) {
        this.f58024b = i10;
        this.f58025c = i11;
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.BlurTransformation.1" + this.f58024b + this.f58025c).getBytes(f.f50778a));
    }

    @Override // p445yd.a
    protected Bitmap d(Context context, d dVar, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = this.f58025c;
        Bitmap bitmapD = dVar.d(width / i12, height / i12, Bitmap.Config.ARGB_8888);
        c(bitmap, bitmapD);
        Canvas canvas = new Canvas(bitmapD);
        int i13 = this.f58025c;
        canvas.scale(1.0f / i13, 1.0f / i13);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return p463zd.b.a(context, bitmapD, this.f58024b);
        } catch (RSRuntimeException unused) {
            return a.a(bitmapD, this.f58024b, true);
        }
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f58024b == this.f58024b && bVar.f58025c == this.f58025c;
    }

    @Override // p274p4.f
    public int hashCode() {
        return 737513610 + (this.f58024b * 1000) + (this.f58025c * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f58024b + ", sampling=" + this.f58025c + ")";
    }
}
