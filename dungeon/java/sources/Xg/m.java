package Xg;

/* JADX INFO: loaded from: classes3.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f16617a = new byte[1024];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f16618b = new int[1024];

    static void a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iMin = Math.min(i12 + 1024, i11) - i12;
            System.arraycopy(f16617a, 0, bArr, i10 + i12, iMin);
            i12 += iMin;
        }
    }

    static void b(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iMin = Math.min(i12 + 1024, i11) - i12;
            System.arraycopy(f16618b, 0, iArr, i10 + i12, iMin);
            i12 += iMin;
        }
    }
}
