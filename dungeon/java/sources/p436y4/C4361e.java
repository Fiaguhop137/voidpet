package p436y4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p274p4.h;
import p274p4.j;
import p310r4.v;
import p328s4.d;
import p328s4.e;
import p418x4.f;

/* JADX INFO: renamed from: y4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4361e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f57887a = new e();

    @Override // p274p4.j
    public /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) {
        return d(AbstractC4360d.a(obj), hVar);
    }

    @Override // p274p4.j
    public /* bridge */ /* synthetic */ v b(Object obj, int i10, int i11, h hVar) {
        return c(AbstractC4360d.a(obj), i10, i11, hVar);
    }

    public v c(ImageDecoder.Source source, int i10, int i11, h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new f(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new f(bitmapDecodeBitmap, this.f57887a);
    }

    public boolean d(ImageDecoder.Source source, h hVar) {
        return true;
    }
}
