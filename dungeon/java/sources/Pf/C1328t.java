package Pf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: Pf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1328t extends AbstractC1333y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final L f9161c = new a(C1328t.class, 6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f9162d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f9163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9164b;

    /* JADX INFO: renamed from: Pf.t$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // Pf.L
        AbstractC1333y d(C1320n0 c1320n0) {
            return C1328t.A(c1320n0.A(), false);
        }
    }

    /* JADX INFO: renamed from: Pf.t$b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f9166b;

        b(byte[] bArr) {
            this.f9165a = Ug.a.n(bArr);
            this.f9166b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Ug.a.b(this.f9166b, ((b) obj).f9166b);
            }
            return false;
        }

        public int hashCode() {
            return this.f9165a;
        }
    }

    public C1328t(String str) {
        y(str);
        byte[] bArrH = H(str);
        x(bArrH.length);
        this.f9163a = bArrH;
        this.f9164b = str;
    }

    private C1328t(byte[] bArr, String str) {
        this.f9163a = bArr;
        this.f9164b = str;
    }

    static C1328t A(byte[] bArr, boolean z10) {
        x(bArr.length);
        C1328t c1328t = (C1328t) f9162d.get(new b(bArr));
        if (c1328t != null) {
            return c1328t;
        }
        if (!A.B(bArr)) {
            throw new IllegalArgumentException("invalid OID contents");
        }
        if (z10) {
            bArr = Ug.a.e(bArr);
        }
        return new C1328t(bArr, null);
    }

    public static C1328t C(Object obj) {
        if (obj == null || (obj instanceof C1328t)) {
            return (C1328t) obj;
        }
        if (obj instanceof InterfaceC1301e) {
            AbstractC1333y abstractC1333yG = ((InterfaceC1301e) obj).g();
            if (abstractC1333yG instanceof C1328t) {
                return (C1328t) abstractC1333yG;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C1328t) f9161c.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private static boolean E(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !A.C(str, 2)) {
            return false;
        }
        if (cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.') {
            return true;
        }
        return (str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4';
    }

    private static String G(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        BigInteger bigIntegerShiftLeft = null;
        long j10 = 0;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + ((long) (b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        if (j11 < 40) {
                            sb2.append('0');
                        } else if (j11 < 80) {
                            sb2.append('1');
                            j11 -= 40;
                        } else {
                            sb2.append('2');
                            j11 -= 80;
                        }
                        z10 = false;
                    }
                    sb2.append('.');
                    sb2.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j10);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        sb2.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z10 = false;
                    }
                    sb2.append('.');
                    sb2.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j10 = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb2.toString();
    }

    private static byte[] H(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Q0 q10 = new Q0(str);
        int i10 = Integer.parseInt(q10.b()) * 40;
        String strB = q10.b();
        if (strB.length() <= 18) {
            A.F(byteArrayOutputStream, ((long) i10) + Long.parseLong(strB));
        } else {
            A.G(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i10)));
        }
        while (q10.a()) {
            String strB2 = q10.b();
            if (strB2.length() <= 18) {
                A.F(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                A.G(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    static void x(int i10) {
        if (i10 > 4096) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
    }

    static void y(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16385) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
        if (E(str)) {
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID");
    }

    public synchronized String B() {
        try {
            if (this.f9164b == null) {
                this.f9164b = G(this.f9163a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9164b;
    }

    public C1328t D() {
        b bVar = new b(this.f9163a);
        ConcurrentMap concurrentMap = f9162d;
        C1328t c1328t = (C1328t) concurrentMap.get(bVar);
        if (c1328t != null) {
            return c1328t;
        }
        synchronized (concurrentMap) {
            try {
                if (concurrentMap.containsKey(bVar)) {
                    return (C1328t) concurrentMap.get(bVar);
                }
                concurrentMap.put(bVar, this);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean F(C1328t c1328t) {
        byte[] bArr = this.f9163a;
        byte[] bArr2 = c1328t.f9163a;
        int length = bArr2.length;
        return bArr.length > length && Ug.a.a(bArr, 0, length, bArr2, 0, length);
    }

    @Override // Pf.AbstractC1333y, Pf.r
    public int hashCode() {
        return Ug.a.n(this.f9163a);
    }

    @Override // Pf.AbstractC1333y
    boolean j(AbstractC1333y abstractC1333y) {
        if (this == abstractC1333y) {
            return true;
        }
        if (abstractC1333y instanceof C1328t) {
            return Ug.a.b(this.f9163a, ((C1328t) abstractC1333y).f9163a);
        }
        return false;
    }

    @Override // Pf.AbstractC1333y
    void k(C1331w c1331w, boolean z10) {
        c1331w.o(z10, 6, this.f9163a);
    }

    @Override // Pf.AbstractC1333y
    boolean l() {
        return false;
    }

    @Override // Pf.AbstractC1333y
    int p(boolean z10) {
        return C1331w.g(z10, this.f9163a.length);
    }

    public String toString() {
        return B();
    }

    public C1328t w(String str) {
        A.x(str);
        byte[] bArrE = A.E(str);
        x(this.f9163a.length + bArrE.length);
        return new C1328t(Ug.a.g(this.f9163a, bArrE), B() + "." + str);
    }
}
