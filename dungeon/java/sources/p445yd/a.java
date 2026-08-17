package p445yd;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import p274p4.l;
import p310r4.v;
import p328s4.d;
import p436y4.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements l {
    @Override // p274p4.l
    public final v a(Context context, v vVar, int i10, int i11) {
        if (!L4.l.u(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        d dVarG = c.d(context).g();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        int i12 = i10;
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapD = d(context.getApplicationContext(), dVarG, bitmap, i12, i11);
        return bitmap.equals(bitmapD) ? vVar : f.d(bitmapD, dVarG);
    }

    void c(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    protected abstract Bitmap d(Context context, d dVar, Bitmap bitmap, int i10, int i11);
}
