package p238n4;

import L4.a;
import L4.k;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import p274p4.h;
import p274p4.j;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f49903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f49904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p328s4.b f49905c;

    public b(List list, a aVar, p328s4.b bVar) {
        this.f49903a = list;
        this.f49904b = (a) k.d(aVar);
        this.f49905c = (p328s4.b) k.d(bVar);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream inputStream, int i10, int i11, h hVar) {
        return this.f49904b.b(a.b(inputStream), i10, i11, hVar);
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, h hVar) {
        ImageHeaderParser.ImageType imageTypeF = com.bumptech.glide.load.a.f(this.f49903a, inputStream, this.f49905c);
        return imageTypeF.equals(ImageHeaderParser.ImageType.AVIF) || imageTypeF.equals(ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }
}
