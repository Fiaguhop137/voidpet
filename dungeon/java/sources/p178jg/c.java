package p178jg;

import Vf.b;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f47455j = new c("bike128", 12323, 142, 134, 256, 5, 3, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f47456k = new c("bike192", 24659, 206, 199, 256, 5, 3, 192);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f47457l = new c("bike256", 40973, 274, 264, 256, 5, 3, 256);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f47465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f47466i;

    private c(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f47458a = str;
        this.f47459b = i10;
        this.f47460c = i11;
        this.f47461d = i12;
        this.f47462e = i13;
        this.f47463f = i14;
        this.f47464g = i15;
        this.f47465h = i16;
        this.f47466i = new a(i10, i11, i12, i13, i14, i15);
    }

    public String a() {
        return this.f47458a;
    }

    public int b() {
        return (this.f47459b + 7) / 8;
    }
}
