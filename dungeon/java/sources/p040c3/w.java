package p040c3;

import U1.AbstractC1459a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f27169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27170e;

    public w(int i10, int i11) {
        this.f27166a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f27169d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f27167b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f27169d;
            int length = bArr2.length;
            int i13 = this.f27170e;
            if (length < i13 + i12) {
                this.f27169d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f27169d, this.f27170e, i12);
            this.f27170e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f27167b) {
            return false;
        }
        this.f27170e -= i10;
        this.f27167b = false;
        this.f27168c = true;
        return true;
    }

    public boolean c() {
        return this.f27168c;
    }

    public void d() {
        this.f27167b = false;
        this.f27168c = false;
    }

    public void e(int i10) {
        AbstractC1459a.g(!this.f27167b);
        boolean z10 = i10 == this.f27166a;
        this.f27167b = z10;
        if (z10) {
            this.f27170e = 3;
            this.f27168c = false;
        }
    }
}
