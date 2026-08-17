package D4;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p274p4.h;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f2137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2138b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f2137a = compressFormat;
        this.f2138b = i10;
    }

    @Override // D4.e
    public v a(v vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f2137a, this.f2138b, byteArrayOutputStream);
        vVar.recycle();
        return new p454z4.b(byteArrayOutputStream.toByteArray());
    }
}
