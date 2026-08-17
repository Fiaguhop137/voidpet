package U5;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: U5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1479b implements P4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V5.g f13114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V5.h f13115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V5.d f13116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P4.d f13117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f13119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f13121i;

    public C1479b(String sourceString, V5.g gVar, V5.h rotationOptions, V5.d imageDecodeOptions, P4.d dVar, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.f13113a = sourceString;
        this.f13114b = gVar;
        this.f13115c = rotationOptions;
        this.f13116d = imageDecodeOptions;
        this.f13117e = dVar;
        this.f13118f = str;
        this.f13120h = (((((((((sourceString.hashCode() * 31) + (gVar != null ? gVar.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.f13121i = RealtimeSinceBootClock.get().now();
    }

    @Override // P4.d
    public String a() {
        return this.f13113a;
    }

    @Override // P4.d
    public boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strA = a();
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.U(strA, string, false, 2, null);
    }

    @Override // P4.d
    public boolean c() {
        return false;
    }

    public final void d(Object obj) {
        this.f13119g = obj;
    }

    @Override // P4.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(C1479b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C1479b c1479b = (C1479b) obj;
        return Intrinsics.b(this.f13113a, c1479b.f13113a) && Intrinsics.b(this.f13114b, c1479b.f13114b) && Intrinsics.b(this.f13115c, c1479b.f13115c) && Intrinsics.b(this.f13116d, c1479b.f13116d) && Intrinsics.b(this.f13117e, c1479b.f13117e) && Intrinsics.b(this.f13118f, c1479b.f13118f);
    }

    @Override // P4.d
    public int hashCode() {
        return this.f13120h;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f13113a + ", resizeOptions=" + this.f13114b + ", rotationOptions=" + this.f13115c + ", imageDecodeOptions=" + this.f13116d + ", postprocessorCacheKey=" + this.f13117e + ", postprocessorName=" + this.f13118f + ")";
    }
}
