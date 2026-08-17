package p268og;

import Vf.q;

/* JADX INFO: loaded from: classes3.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f50662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final short[] f50663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f50664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f50665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f50666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f50667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f50668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f50669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f50670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f50671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f50672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f50673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f50674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f50675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final q f50676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final c f50677v;

    public a(int i10, int i11, int i12, short[] sArr, q qVar, c cVar) {
        this.f50658c = i10;
        this.f50656a = i11;
        this.f50657b = 1 << i11;
        this.f50659d = i12;
        int i13 = i12 * 64;
        this.f50664i = i13;
        this.f50665j = i13;
        this.f50666k = i13;
        this.f50667l = i13;
        this.f50668m = i13;
        this.f50669n = i13;
        this.f50670o = i13 / 8;
        this.f50671p = i13 / 8;
        int i14 = i13 / 8;
        this.f50672q = i14;
        this.f50673r = i13 / 8;
        int i15 = i13 / 8;
        this.f50674s = i15;
        this.f50675t = i13 / 8;
        int i16 = ((i11 * i10) * 8) / 8;
        this.f50662g = ((i11 * 64) / 8) + i16;
        int i17 = i16 + 16;
        this.f50661f = i17;
        this.f50660e = i14 + i17 + (i10 * 16) + i15;
        this.f50663h = sArr;
        this.f50676u = qVar;
        this.f50677v = cVar;
    }
}
