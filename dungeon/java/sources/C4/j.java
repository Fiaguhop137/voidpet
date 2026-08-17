package C4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class j implements p274p4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p274p4.j f1425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p328s4.b f1426c;

    public j(List list, p274p4.j jVar, p328s4.b bVar) {
        this.f1424a = list;
        this.f1425b = jVar;
        this.f1426c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream inputStream, int i10, int i11, p274p4.h hVar) {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f1425b.b(ByteBuffer.wrap(bArrE), i10, i11, hVar);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, p274p4.h hVar) {
        return !((Boolean) hVar.c(i.f1423b)).booleanValue() && com.bumptech.glide.load.a.f(this.f1424a, inputStream, this.f1426c) == ImageHeaderParser.ImageType.GIF;
    }
}
