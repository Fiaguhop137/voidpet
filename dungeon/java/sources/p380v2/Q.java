package p380v2;

import U1.AbstractC1459a;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f55997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f56000d;

    public Q(byte[] bArr) {
        this.f55997a = bArr;
        this.f55998b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f55999c;
        AbstractC1459a.g(i11 >= 0 && (i11 < (i10 = this.f55998b) || (i11 == i10 && this.f56000d == 0)));
    }

    public int b() {
        return (this.f55999c * 8) + this.f56000d;
    }

    public boolean c() {
        boolean z10 = (((this.f55997a[this.f55999c] & 255) >> this.f56000d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f55999c;
        int iMin = Math.min(i10, 8 - this.f56000d);
        int i12 = i11 + 1;
        int i13 = ((this.f55997a[i11] & 255) >> this.f56000d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f55997a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f55999c + i11;
        this.f55999c = i12;
        int i13 = this.f56000d + (i10 - (i11 * 8));
        this.f56000d = i13;
        if (i13 > 7) {
            this.f55999c = i12 + 1;
            this.f56000d = i13 - 8;
        }
        a();
    }
}
