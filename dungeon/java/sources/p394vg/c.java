package p394vg;

import Vf.j;
import Yf.a;
import java.security.SecureRandom;
import p017ag.f;

/* JADX INFO: loaded from: classes3.dex */
class c extends SecureRandom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f56365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f56366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f56367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f56368d;

    public c(byte[] bArr, j jVar) {
        this.f56365a = bArr;
        this.f56368d = jVar;
        c(256);
    }

    private void a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 15; i11 >= 0; i11--) {
                byte b10 = bArr3[i11];
                if ((b10 & 255) != 255) {
                    bArr3[i11] = (byte) (b10 + 1);
                    break;
                }
                bArr3[i11] = 0;
            }
            b(bArr2, bArr3, bArr4, i10 * 16);
        }
        if (bArr != null) {
            for (int i12 = 0; i12 < 48; i12++) {
                bArr4[i12] = (byte) (bArr4[i12] ^ bArr[i12]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    private void b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        try {
            a aVar = new a();
            aVar.i(true, new f(bArr));
            for (int i11 = 0; i11 != bArr2.length; i11 += 16) {
                aVar.l(bArr2, i11, bArr3, i10 + i11);
            }
        } catch (Throwable th) {
            throw new IllegalStateException("drbg failure: " + th.getMessage(), th);
        }
    }

    private void c(int i10) {
        byte[] bArr = this.f56365a;
        if (bArr.length >= 48) {
            d(bArr, i10);
        } else {
            d(Ug.a.g(this.f56365a, i.g(this.f56368d, bArr, 48 - bArr.length)), i10);
        }
    }

    private void d(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.f56366b = bArr3;
        byte[] bArr4 = new byte[16];
        this.f56367c = bArr4;
        a(bArr2, bArr3, bArr4);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i10 = 0;
        while (length > 0) {
            for (int i11 = 15; i11 >= 0; i11--) {
                byte[] bArr3 = this.f56367c;
                byte b10 = bArr3[i11];
                if ((b10 & 255) != 255) {
                    bArr3[i11] = (byte) (b10 + 1);
                    break;
                }
                bArr3[i11] = 0;
            }
            b(this.f56366b, this.f56367c, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i10, 16);
                i10 += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i10, length);
                length = 0;
            }
        }
        a(null, this.f56366b, this.f56367c);
    }
}
