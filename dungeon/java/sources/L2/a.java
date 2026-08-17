package L2;

import U1.F;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6270c;

    private a(long j10, byte[] bArr, long j11) {
        this.f6268a = j11;
        this.f6269b = j10;
        this.f6270c = bArr;
    }

    static a d(F f10, int i10, long j10) {
        long jN = f10.N();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        f10.q(bArr, 0, i11);
        return new a(jN, bArr, j10);
    }

    @Override // L2.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f6268a + ", identifier= " + this.f6269b + " }";
    }
}
