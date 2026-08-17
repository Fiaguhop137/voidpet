package p238n4;

import L4.k;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import org.aomedia.avif.android.AvifDecoder;
import p274p4.b;
import p274p4.h;
import p274p4.j;
import p310r4.v;
import p328s4.d;
import p436y4.f;
import p436y4.p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f49902a;

    public a(d dVar) {
        this.f49902a = (d) k.d(dVar);
    }

    private ByteBuffer e(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.flip();
        return byteBufferAllocateDirect;
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        Bitmap.Config config;
        ByteBuffer byteBufferE = e(byteBuffer);
        AvifDecoder.Info info = new AvifDecoder.Info();
        if (!AvifDecoder.getInfo(byteBufferE, byteBufferE.remaining(), info)) {
            if (Log.isLoggable("AvifBitmapDecoder", 6)) {
                Log.e("AvifBitmapDecoder", "Requested to decode byte buffer which cannot be handled by AvifDecoder");
            }
            return null;
        }
        if (hVar.c(p.f57910f) == b.PREFER_RGB_565) {
            config = Bitmap.Config.RGB_565;
        } else {
            config = info.depth == 8 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        }
        Bitmap bitmapD = this.f49902a.d(info.width, info.height, config);
        if (AvifDecoder.decode(byteBufferE, byteBufferE.remaining(), bitmapD)) {
            return f.d(bitmapD, this.f49902a);
        }
        if (Log.isLoggable("AvifBitmapDecoder", 6)) {
            Log.e("AvifBitmapDecoder", "Failed to decode ByteBuffer as Avif.");
        }
        this.f49902a.c(bitmapD);
        return null;
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, h hVar) {
        return AvifDecoder.isAvifImage(e(byteBuffer));
    }
}
