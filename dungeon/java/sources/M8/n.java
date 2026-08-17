package M8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends p188k8.a {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f7038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Point[] f7039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g f7041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f7042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f7043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f7044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l f7045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h f7046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f7047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e f7048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f f7049o;

    public n(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, g gVar, j jVar, k kVar, m mVar, l lVar, h hVar, d dVar, e eVar, f fVar) {
        this.f7035a = i10;
        this.f7036b = str;
        this.f7037c = str2;
        this.f7038d = bArr;
        this.f7039e = pointArr;
        this.f7040f = i11;
        this.f7041g = gVar;
        this.f7042h = jVar;
        this.f7043i = kVar;
        this.f7044j = mVar;
        this.f7045k = lVar;
        this.f7046l = hVar;
        this.f7047m = dVar;
        this.f7048n = eVar;
        this.f7049o = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f7035a);
        p188k8.c.u(parcel, 2, this.f7036b, false);
        p188k8.c.u(parcel, 3, this.f7037c, false);
        p188k8.c.g(parcel, 4, this.f7038d, false);
        p188k8.c.x(parcel, 5, this.f7039e, i10, false);
        p188k8.c.n(parcel, 6, this.f7040f);
        p188k8.c.t(parcel, 7, this.f7041g, i10, false);
        p188k8.c.t(parcel, 8, this.f7042h, i10, false);
        p188k8.c.t(parcel, 9, this.f7043i, i10, false);
        p188k8.c.t(parcel, 10, this.f7044j, i10, false);
        p188k8.c.t(parcel, 11, this.f7045k, i10, false);
        p188k8.c.t(parcel, 12, this.f7046l, i10, false);
        p188k8.c.t(parcel, 13, this.f7047m, i10, false);
        p188k8.c.t(parcel, 14, this.f7048n, i10, false);
        p188k8.c.t(parcel, 15, this.f7049o, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
