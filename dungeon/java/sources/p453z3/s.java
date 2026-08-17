package p453z3;

import If.InterfaceC1108j;
import Q3.AbstractC1336b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.a;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f58448a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Paint f58449b = new Paint(3);

    private s() {
    }

    public final C4381m a(String str, InterfaceC1108j interfaceC1108j, r rVar) {
        if (!rVar.c(str, interfaceC1108j)) {
            return C4381m.f58438d;
        }
        a aVar = new a(new C4382n(interfaceC1108j.peek().Y()));
        return new C4381m(aVar.s(), aVar.l());
    }

    public final Bitmap b(Bitmap bitmap, C4381m c4381m) {
        if (!c4381m.b() && !t.a(c4381m)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (c4381m.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (t.a(c4381m)) {
            matrix.postRotate(c4381m.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = t.b(c4381m) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), AbstractC1336b.c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), AbstractC1336b.c(bitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f58449b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
