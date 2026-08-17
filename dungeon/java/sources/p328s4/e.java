package p328s4;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {
    @Override // p328s4.d
    public void a(int i10) {
    }

    @Override // p328s4.d
    public void b() {
    }

    @Override // p328s4.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p328s4.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // p328s4.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }
}
