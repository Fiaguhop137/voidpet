package Xf;

import Vf.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Vf.d f16480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16481b = new byte[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16482c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16483d;

    protected a(Vf.d dVar) {
        this.f16480a = dVar;
    }

    @Override // Vf.j
    public void b(byte b10) {
        byte[] bArr = this.f16481b;
        int i10 = this.f16482c;
        int i11 = i10 + 1;
        this.f16482c = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            i(bArr, 0);
            this.f16482c = 0;
        }
        this.f16483d++;
    }

    public void f() {
        long j10 = this.f16483d << 3;
        byte b10 = -128;
        while (true) {
            b(b10);
            if (this.f16482c == 0) {
                h(j10);
                g();
                return;
            }
            b10 = 0;
        }
    }

    protected abstract void g();

    protected abstract void h(long j10);

    protected abstract void i(byte[] bArr, int i10);

    public void j() {
        this.f16483d = 0L;
        this.f16482c = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f16481b;
            if (i10 >= bArr.length) {
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // Vf.j
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int iMax = Math.max(0, i11);
        if (this.f16482c != 0) {
            int i13 = 0;
            while (true) {
                if (i13 >= iMax) {
                    i12 = i13;
                    break;
                }
                byte[] bArr2 = this.f16481b;
                int i14 = this.f16482c;
                int i15 = i14 + 1;
                this.f16482c = i15;
                int i16 = i13 + 1;
                bArr2[i14] = bArr[i13 + i10];
                if (i15 == 4) {
                    i(bArr2, 0);
                    this.f16482c = 0;
                    i12 = i16;
                    break;
                }
                i13 = i16;
            }
        }
        int i17 = iMax - 3;
        while (i12 < i17) {
            i(bArr, i10 + i12);
            i12 += 4;
        }
        while (i12 < iMax) {
            byte[] bArr3 = this.f16481b;
            int i18 = this.f16482c;
            this.f16482c = i18 + 1;
            bArr3[i18] = bArr[i12 + i10];
            i12++;
        }
        this.f16483d += (long) iMax;
    }
}
