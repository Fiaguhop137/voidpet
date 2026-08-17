package V5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final d f14070m = b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f14078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap.Config f14079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Z5.c f14080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorSpace f14081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f14082l;

    public d(e eVar) {
        this.f14071a = eVar.l();
        this.f14072b = eVar.k();
        this.f14073c = eVar.h();
        this.f14074d = eVar.n();
        this.f14075e = eVar.m();
        this.f14076f = eVar.g();
        this.f14077g = eVar.j();
        this.f14078h = eVar.c();
        this.f14079i = eVar.b();
        this.f14080j = eVar.f();
        eVar.d();
        this.f14081k = eVar.e();
        this.f14082l = eVar.i();
    }

    public static d a() {
        return f14070m;
    }

    public static e b() {
        return new e();
    }

    protected V4.i.a c() {
        return V4.i.b(this).a("minDecodeIntervalMs", this.f14071a).a("maxDimensionPx", this.f14072b).c("decodePreviewFrame", this.f14073c).c("useLastFrameForPreview", this.f14074d).c("useEncodedImageForPreview", this.f14075e).c("decodeAllFrames", this.f14076f).c("forceStaticImage", this.f14077g).b("bitmapConfigName", this.f14078h.name()).b("animatedBitmapConfigName", this.f14079i.name()).b("customImageDecoder", this.f14080j).b("bitmapTransformation", null).b("colorSpace", this.f14081k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f14071a != dVar.f14071a || this.f14072b != dVar.f14072b || this.f14073c != dVar.f14073c || this.f14074d != dVar.f14074d || this.f14075e != dVar.f14075e || this.f14076f != dVar.f14076f || this.f14077g != dVar.f14077g) {
            return false;
        }
        boolean z10 = this.f14082l;
        if (z10 || this.f14078h == dVar.f14078h) {
            return (z10 || this.f14079i == dVar.f14079i) && this.f14080j == dVar.f14080j && this.f14081k == dVar.f14081k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f14071a * 31) + this.f14072b) * 31) + (this.f14073c ? 1 : 0)) * 31) + (this.f14074d ? 1 : 0)) * 31) + (this.f14075e ? 1 : 0)) * 31) + (this.f14076f ? 1 : 0)) * 31) + (this.f14077g ? 1 : 0);
        if (!this.f14082l) {
            iOrdinal = (iOrdinal * 31) + this.f14078h.ordinal();
        }
        if (!this.f14082l) {
            int i10 = iOrdinal * 31;
            Bitmap.Config config = this.f14079i;
            iOrdinal = i10 + (config != null ? config.ordinal() : 0);
        }
        int i11 = iOrdinal * 31;
        Z5.c cVar = this.f14080j;
        int iHashCode = (i11 + (cVar != null ? cVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f14081k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
