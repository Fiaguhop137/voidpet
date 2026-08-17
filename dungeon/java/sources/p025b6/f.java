package p025b6;

import Z4.a;
import Z4.h;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public interface f extends d {
    static f Q0(a aVar, p pVar, int i10, int i11) {
        return b.x() ? new b(aVar, pVar, i10, i11) : new i(aVar, pVar, i10, i11);
    }

    static f S2(Bitmap bitmap, h hVar, p pVar, int i10) {
        return f3(bitmap, hVar, pVar, i10, 0);
    }

    static f f3(Bitmap bitmap, h hVar, p pVar, int i10, int i11) {
        return b.x() ? new b(bitmap, hVar, pVar, i10, i11) : new i(bitmap, hVar, pVar, i10, i11);
    }

    static f q2(a aVar, p pVar, int i10) {
        return Q0(aVar, pVar, i10, 0);
    }

    int A2();

    int f2();

    a l0();
}
