package If;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends C1109k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f5477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f5478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(byte[][] segments, int[] directory) {
        super(C1109k.f5524e.s());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f5477f = segments;
        this.f5478g = directory;
    }

    private final C1109k W() {
        return new C1109k(R());
    }

    @Override // If.C1109k
    public byte[] A() {
        return R();
    }

    @Override // If.C1109k
    public byte B(int i10) {
        AbstractC1103e.b(U()[V().length - 1], i10, 1L);
        int iB = Jf.e.b(this, i10);
        return V()[iB][(i10 - (iB == 0 ? 0 : U()[iB - 1])) + U()[V().length + iB]];
    }

    @Override // If.C1109k
    public int D(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return W().D(other, i10);
    }

    @Override // If.C1109k
    public boolean G(int i10, C1109k other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > M() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = Jf.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : U()[iB - 1];
            int i15 = U()[iB] - i14;
            int i16 = U()[V().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.H(i11, V()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // If.C1109k
    public boolean H(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > M() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = Jf.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : U()[iB - 1];
            int i15 = U()[iB] - i14;
            int i16 = U()[V().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC1103e.a(V()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // If.C1109k
    public C1109k O(int i10, int i11) {
        int iE = AbstractC1103e.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iE > M()) {
            throw new IllegalArgumentException(("endIndex=" + iE + " > length(" + M() + ')').toString());
        }
        int i12 = iE - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iE == M()) {
            return this;
        }
        if (i10 == iE) {
            return C1109k.f5524e;
        }
        int iB = Jf.e.b(this, i10);
        int iB2 = Jf.e.b(this, iE - 1);
        byte[][] bArr = (byte[][]) AbstractC3952n.s(V(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(U()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = U()[V().length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? U()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new X(bArr, iArr);
    }

    @Override // If.C1109k
    public C1109k Q() {
        return W().Q();
    }

    @Override // If.C1109k
    public byte[] R() {
        byte[] bArr = new byte[M()];
        int length = V().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = U()[length + i10];
            int i14 = U()[i10];
            int i15 = i14 - i11;
            AbstractC3952n.h(V()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // If.C1109k
    public void T(C1106h buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = Jf.e.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : U()[iB - 1];
            int i14 = U()[iB] - i13;
            int i15 = U()[V().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            V v10 = new V(V()[iB], i16, i16 + iMin, true, false);
            V v11 = buffer.f5512a;
            if (v11 == null) {
                v10.f5471g = v10;
                v10.f5470f = v10;
                buffer.f5512a = v10;
            } else {
                Intrinsics.c(v11);
                V v12 = v11.f5471g;
                Intrinsics.c(v12);
                v12.c(v10);
            }
            i10 += iMin;
            iB++;
        }
        buffer.K(buffer.size() + ((long) i11));
    }

    public final int[] U() {
        return this.f5478g;
    }

    public final byte[][] V() {
        return this.f5477f;
    }

    @Override // If.C1109k
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1109k) {
            C1109k c1109k = (C1109k) obj;
            if (c1109k.M() == M() && G(0, c1109k, 0, M())) {
                return true;
            }
        }
        return false;
    }

    @Override // If.C1109k
    public String g() {
        return W().g();
    }

    @Override // If.C1109k
    public int hashCode() {
        int iT = t();
        if (iT != 0) {
            return iT;
        }
        int length = V().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = U()[length + i10];
            int i14 = U()[i10];
            byte[] bArr = V()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        I(i11);
        return i11;
    }

    @Override // If.C1109k
    public C1109k i(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = V().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = U()[length + i10];
            int i13 = U()[i10];
            messageDigest.update(V()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.c(bArrDigest);
        return new C1109k(bArrDigest);
    }

    @Override // If.C1109k
    public String toString() {
        return W().toString();
    }

    @Override // If.C1109k
    public int u() {
        return U()[V().length - 1];
    }

    @Override // If.C1109k
    public String w() {
        return W().w();
    }

    @Override // If.C1109k
    public int y(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return W().y(other, i10);
    }
}
