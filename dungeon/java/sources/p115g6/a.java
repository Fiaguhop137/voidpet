package p115g6;

import P4.d;
import P4.i;
import V4.k;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: loaded from: classes2.dex */
public class a extends p133h6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f42167e;

    public a(int i10, int i11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f42165c = i10;
        this.f42166d = i11;
    }

    @Override // p133h6.a, p133h6.d
    public d a() {
        if (this.f42167e == null) {
            this.f42167e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f42165c), Integer.valueOf(this.f42166d)));
        }
        return this.f42167e;
    }

    @Override // p133h6.a
    public void d(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f42165c, this.f42166d);
    }
}
