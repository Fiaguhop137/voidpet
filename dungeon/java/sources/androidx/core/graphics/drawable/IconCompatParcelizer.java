package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f23092a = aVar.p(iconCompat.f23092a, 1);
        iconCompat.f23094c = aVar.j(iconCompat.f23094c, 2);
        iconCompat.f23095d = aVar.r(iconCompat.f23095d, 3);
        iconCompat.f23096e = aVar.p(iconCompat.f23096e, 4);
        iconCompat.f23097f = aVar.p(iconCompat.f23097f, 5);
        iconCompat.f23098g = (ColorStateList) aVar.r(iconCompat.f23098g, 6);
        iconCompat.f23100i = aVar.t(iconCompat.f23100i, 7);
        iconCompat.f23101j = aVar.t(iconCompat.f23101j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i10 = iconCompat.f23092a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f23094c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f23095d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f23096e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f23097f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f23098g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f23100i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f23101j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
