package T5;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public Z4.a a(int i10, int i11) {
        return b(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public Z4.a b(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config, null);
    }

    public Z4.a c(int i10, int i11, Bitmap.Config config, Object obj) {
        return d(i10, i11, config);
    }

    public abstract Z4.a d(int i10, int i11, Bitmap.Config config);
}
