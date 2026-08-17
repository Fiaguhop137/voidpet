package Xg;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f16549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f16550c;

    h() {
    }

    static void a(h hVar, a aVar) {
        int length = hVar.f16550c.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            hVar.f16550c[i11] = i10;
            e.n(hVar.f16548a, hVar.f16549b, i10, aVar);
            i10 += 1080;
        }
    }

    static void b(h hVar, int i10, int i11) {
        hVar.f16548a = i10;
        hVar.f16549b = new int[i11 * 1080];
        hVar.f16550c = new int[i11];
    }
}
