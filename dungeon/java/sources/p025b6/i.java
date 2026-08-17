package p025b6;

import Z4.a;
import Z4.h;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
class i extends b {
    protected i(a aVar, p pVar, int i10, int i11) {
        super(aVar, pVar, i10, i11);
    }

    protected i(Bitmap bitmap, h hVar, p pVar, int i10, int i11) {
        super(bitmap, hVar, pVar, i10, i11);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        W4.a.K("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
