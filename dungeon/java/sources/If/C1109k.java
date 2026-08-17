package If;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: If.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1109k implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5523d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1109k f5524e = new C1109k(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f5525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f5526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f5527c;

    /* JADX INFO: renamed from: If.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C1109k j(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC1103e.c();
            }
            return aVar.i(bArr, i10, i11);
        }

        public final C1109k a(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return d(string);
        }

        public final C1109k b(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return g(string);
        }

        public final C1109k c(ByteBuffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return h(buffer);
        }

        public final C1109k d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArrA = AbstractC1099a.a(str);
            if (bArrA != null) {
                return new C1109k(bArrA);
            }
            return null;
        }

        public final C1109k e(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((Jf.b.e(str.charAt(i11)) << 4) + Jf.b.e(str.charAt(i11 + 1)));
            }
            return new C1109k(bArr);
        }

        public final C1109k f(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new C1109k(bytes);
        }

        public final C1109k g(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C1109k c1109k = new C1109k(e0.a(str));
            c1109k.J(str);
            return c1109k;
        }

        public final C1109k h(ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C1109k(bArr);
        }

        public final C1109k i(byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int iF = AbstractC1103e.f(bArr, i11);
            AbstractC1103e.b(bArr.length, i10, iF);
            return new C1109k(AbstractC3952n.r(bArr, i10, iF + i10));
        }
    }

    public C1109k(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f5525a = data;
    }

    public static /* synthetic */ int E(C1109k c1109k, C1109k c1109k2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC1103e.c();
        }
        return c1109k.C(c1109k2, i10);
    }

    public static /* synthetic */ C1109k P(C1109k c1109k, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = AbstractC1103e.c();
        }
        return c1109k.O(i10, i11);
    }

    public static final C1109k o(String str) {
        return f5523d.g(str);
    }

    public static /* synthetic */ int z(C1109k c1109k, C1109k c1109k2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c1109k.x(c1109k2, i10);
    }

    public byte[] A() {
        return s();
    }

    public byte B(int i10) {
        return s()[i10];
    }

    public final int C(C1109k other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return D(other.A(), i10);
    }

    public int D(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(AbstractC1103e.e(this, i10), s().length - other.length); -1 < iMin; iMin--) {
            if (AbstractC1103e.a(s(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final C1109k F() {
        return i("MD5");
    }

    public boolean G(int i10, C1109k other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.H(i11, s(), i10, i12);
    }

    public boolean H(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i10 >= 0 && i10 <= s().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC1103e.a(s(), i10, other, i11, i12);
    }

    public final void I(int i10) {
        this.f5526b = i10;
    }

    public final void J(String str) {
        this.f5527c = str;
    }

    public final C1109k K() {
        return i("SHA-1");
    }

    public final C1109k L() {
        return i("SHA-256");
    }

    public final int M() {
        return u();
    }

    public final boolean N(C1109k prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return G(0, prefix, 0, prefix.M());
    }

    public C1109k O(int i10, int i11) {
        int iE = AbstractC1103e.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iE <= s().length) {
            if (iE - i10 >= 0) {
                return (i10 == 0 && iE == s().length) ? this : new C1109k(AbstractC3952n.r(s(), i10, iE));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + s().length + ')').toString());
    }

    public C1109k Q() {
        for (int i10 = 0; i10 < s().length; i10++) {
            byte b10 = s()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrS = s();
                byte[] bArrCopyOf = Arrays.copyOf(bArrS, bArrS.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C1109k(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] R() {
        byte[] bArrS = s();
        byte[] bArrCopyOf = Arrays.copyOf(bArrS, bArrS.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String S() {
        String strV = v();
        if (strV != null) {
            return strV;
        }
        String strC = e0.c(A());
        J(strC);
        return strC;
    }

    public void T(C1106h buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Jf.b.d(this, buffer, i10, i11);
    }

    public final int e() {
        return M();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1109k) {
            C1109k c1109k = (C1109k) obj;
            if (c1109k.M() == s().length && c1109k.H(0, s(), 0, s().length)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return AbstractC1099a.c(s(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1109k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM = M();
        int iM2 = other.M();
        int iMin = Math.min(iM, iM2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iR = r(i10) & 255;
            int iR2 = other.r(i10) & 255;
            if (iR != iR2) {
                return iR < iR2 ? -1 : 1;
            }
        }
        if (iM == iM2) {
            return 0;
        }
        return iM < iM2 ? -1 : 1;
    }

    public int hashCode() {
        int iT = t();
        if (iT != 0) {
            return iT;
        }
        int iHashCode = Arrays.hashCode(s());
        I(iHashCode);
        return iHashCode;
    }

    public C1109k i(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f5525a, 0, M());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.c(bArrDigest);
        return new C1109k(bArrDigest);
    }

    public final boolean p(C1109k suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return G(M() - suffix.M(), suffix, 0, suffix.M());
    }

    public final byte r(int i10) {
        return B(i10);
    }

    public final byte[] s() {
        return this.f5525a;
    }

    public final int t() {
        return this.f5526b;
    }

    public String toString() {
        if (s().length == 0) {
            return "[size=0]";
        }
        int iC = Jf.b.c(s(), 64);
        if (iC != -1) {
            String strS = S();
            String strSubstring = strS.substring(0, iC);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strI = StringsKt.I(StringsKt.I(StringsKt.I(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strS.length()) {
                return "[text=" + strI + ']';
            }
            return "[size=" + s().length + " text=" + strI + "…]";
        }
        if (s().length <= 64) {
            return "[hex=" + w() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(s().length);
        sb2.append(" hex=");
        int iE = AbstractC1103e.e(this, 64);
        if (iE <= s().length) {
            if (iE < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iE == s().length ? this : new C1109k(AbstractC3952n.r(s(), 0, iE))).w());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + s().length + ')').toString());
    }

    public int u() {
        return s().length;
    }

    public final String v() {
        return this.f5527c;
    }

    public String w() {
        char[] cArr = new char[s().length * 2];
        int i10 = 0;
        for (byte b10 : s()) {
            int i11 = i10 + 1;
            cArr[i10] = Jf.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = Jf.b.f()[b10 & 15];
        }
        return StringsKt.s(cArr);
    }

    public final int x(C1109k other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return y(other.A(), i10);
    }

    public int y(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = s().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC1103e.a(s(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }
}
