package N5;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7871a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f7872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f7873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f7874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f7875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f7876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f7877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f7878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f7879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f7880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f7881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f7882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f7883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f7884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f7885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f7886p;

    static {
        c cVar = new c("JPEG", "jpeg");
        f7872b = cVar;
        c cVar2 = new c("PNG", "png");
        f7873c = cVar2;
        c cVar3 = new c("GIF", "gif");
        f7874d = cVar3;
        c cVar4 = new c("BMP", "bmp");
        f7875e = cVar4;
        c cVar5 = new c("ICO", "ico");
        f7876f = cVar5;
        c cVar6 = new c("WEBP_SIMPLE", "webp");
        f7877g = cVar6;
        c cVar7 = new c("WEBP_LOSSLESS", "webp");
        f7878h = cVar7;
        c cVar8 = new c("WEBP_EXTENDED", "webp");
        f7879i = cVar8;
        c cVar9 = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
        f7880j = cVar9;
        c cVar10 = new c("WEBP_ANIMATED", "webp");
        f7881k = cVar10;
        c cVar11 = new c("HEIF", "heif");
        f7882l = cVar11;
        f7883m = new c("DNG", "dng");
        c cVar12 = new c("BINARY_XML", "xml");
        f7884n = cVar12;
        c cVar13 = new c("AVIF", "avif");
        f7885o = cVar13;
        f7886p = CollectionsKt.o(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    private b() {
    }

    public static final boolean a(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == f7877g || imageFormat == f7878h || imageFormat == f7879i || imageFormat == f7880j;
    }

    public static final boolean b(c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return a(imageFormat) || imageFormat == f7881k;
    }
}
