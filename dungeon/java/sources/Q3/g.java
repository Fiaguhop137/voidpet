package Q3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p453z3.C4379k;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9345a = new g();

    private g() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == AbstractC1336b.e(config);
    }

    private final boolean c(boolean z10, Bitmap bitmap, L3.f fVar, L3.e eVar) {
        if (z10) {
            return true;
        }
        long jB = C4379k.b(bitmap.getWidth(), bitmap.getHeight(), fVar, eVar, L3.f.f6318d);
        return C4379k.d(bitmap.getWidth(), bitmap.getHeight(), p.c(jB), p.d(jB), eVar) == 1.0d;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, L3.f fVar, L3.e eVar, boolean z10) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, fVar, eVar)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        int iF = F.f(drawableMutate);
        if (iF <= 0) {
            iF = 512;
        }
        int iB = F.b(drawableMutate);
        int i10 = iB > 0 ? iB : 512;
        long jB = C4379k.b(iF, i10, fVar, eVar, L3.f.f6318d);
        double d10 = C4379k.d(iF, i10, p.c(jB), p.d(jB), eVar);
        int iB2 = Od.a.b(((double) iF) * d10);
        int iB3 = Od.a.b(d10 * ((double) i10));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB2, iB3, AbstractC1336b.e(config));
        Rect bounds = drawableMutate.getBounds();
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iB2, iB3);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i11, i12, i13, i14);
        return bitmapCreateBitmap;
    }
}
