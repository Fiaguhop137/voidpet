package p232mg;

import Vf.b;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f49382e = new d("kyber512", 2, 256, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f49383f = new d("kyber768", 3, 256, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f49384g = new d("kyber1024", 4, 256, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f49388d;

    private d(String str, int i10, int i11, boolean z10) {
        this.f49385a = str;
        this.f49386b = i10;
        this.f49387c = i11;
        this.f49388d = z10;
    }

    a a() {
        return new a(this.f49386b, this.f49388d);
    }

    public String b() {
        return this.f49385a;
    }
}
