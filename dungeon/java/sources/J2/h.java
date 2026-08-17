package J2;

import C9.AbstractC0876t;
import R1.x;
import R1.y;
import U1.AbstractC1477t;
import U1.E;
import U1.F;
import U1.S;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h extends E2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5709b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5710a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f5712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5713c;

        public b(int i10, boolean z10, int i11) {
            this.f5711a = i10;
            this.f5712b = z10;
            this.f5713c = i11;
        }
    }

    public h() {
        this(null);
    }

    public h(a aVar) {
        this.f5710a = aVar;
    }

    private static int A(F f10, int i10) {
        byte[] bArrF = f10.f();
        int iG = f10.g();
        int i11 = iG;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iG + i10) {
                return i10;
            }
            if ((bArrF[i11] & 255) == 255 && bArrF[i12] == 0) {
                System.arraycopy(bArrF, i11 + 2, bArrF, i12, (i10 - (i11 - iG)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean B(F f10, int i10, int i11, boolean z10) {
        int iO;
        long jO;
        int iT;
        int i12;
        int iG = f10.g();
        while (true) {
            try {
                boolean z11 = true;
                if (f10.a() < i11) {
                    f10.a0(iG);
                    return true;
                }
                if (i10 >= 3) {
                    iO = f10.u();
                    jO = f10.N();
                    iT = f10.T();
                } else {
                    iO = f10.O();
                    jO = f10.O();
                    iT = 0;
                }
                if (iO == 0 && jO == 0 && iT == 0) {
                    f10.a0(iG);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jO) != 0) {
                        f10.a0(iG);
                        return false;
                    }
                    jO = (((jO >> 24) & 255) << 21) | (jO & 255) | (((jO >> 8) & 255) << 7) | (((jO >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iT & 64) != 0 ? 1 : 0;
                    if ((iT & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iT & 32) != 0 ? 1 : 0;
                    if ((iT & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jO < i12) {
                    f10.a0(iG);
                    return false;
                }
                if (f10.a() < jO) {
                    f10.a0(iG);
                    return false;
                }
                f10.b0((int) jO);
            } catch (Throwable th) {
                f10.a0(iG);
                throw th;
            }
        }
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? S.f12881f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static J2.a f(F f10, int i10, int i11) {
        int iZ;
        String str;
        int iL = f10.L();
        Charset charsetW = w(iL);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        f10.q(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + B9.c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = B9.c.e(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i13 = bArr[iZ + 1] & 255;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iL);
        return new J2.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iL), i12));
    }

    private static J2.b g(F f10, int i10, String str) {
        byte[] bArr = new byte[i10];
        f10.q(bArr, 0, i10);
        return new J2.b(str, bArr);
    }

    private static c h(F f10, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iG = f10.g();
        int iZ = z(f10.f(), iG);
        String str = new String(f10.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        f10.a0(iZ + 1);
        int iU = f10.u();
        int iU2 = f10.u();
        long jN = f10.N();
        if (jN == 4294967295L) {
            jN = -1;
        }
        long jN2 = f10.N();
        long j10 = jN2 == 4294967295L ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i13 = iG + i10;
        while (f10.g() < i13) {
            i iVarK = k(i11, f10, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iU, iU2, jN, j10, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(F f10, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int iG = f10.g();
        int iZ = z(f10.f(), iG);
        String str = new String(f10.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        f10.a0(iZ + 1);
        int iL = f10.L();
        boolean z11 = (iL & 2) != 0;
        boolean z12 = (iL & 1) != 0;
        int iL2 = f10.L();
        String[] strArr = new String[iL2];
        for (int i13 = 0; i13 < iL2; i13++) {
            int iG2 = f10.g();
            int iZ2 = z(f10.f(), iG2);
            strArr[i13] = new String(f10.f(), iG2, iZ2 - iG2, StandardCharsets.ISO_8859_1);
            f10.a0(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iG + i10;
        while (f10.g() < i14) {
            i iVarK = k(i11, f10, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(F f10, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iL = f10.L();
        Charset charsetW = w(iL);
        byte[] bArr = new byte[3];
        f10.q(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        f10.q(bArr2, 0, i11);
        int iY = y(bArr2, 0, iL);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iL);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iL), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0240  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0240, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [J2.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [U1.F] */
    /* JADX WARN: Type inference failed for: r1v11, types: [U1.F] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [U1.F] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static i k(int i10, F f10, boolean z10, int i11, a aVar) throws Throwable {
        int iP;
        ?? r10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r11;
        Throwable th;
        ?? r12;
        int i12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        x.a aVarG;
        int i13 = i10;
        F f11 = f10;
        int iL = f11.L();
        int iL2 = f11.L();
        int iL3 = f11.L();
        boolean z15 = false;
        int iL4 = i13 >= 3 ? f11.L() : 0;
        if (i13 == 4) {
            iP = f11.P();
            if (!z10) {
                iP = (((iP >> 24) & 255) << 21) | (iP & 255) | (((iP >> 8) & 255) << 7) | (((iP >> 16) & 255) << 14);
            }
        } else {
            iP = i13 == 3 ? f11.P() : f11.O();
        }
        int iA = iP;
        int iT = i13 >= 3 ? f11.T() : 0;
        if (iL == 0 && iL2 == 0 && iL3 == 0 && iL4 == 0 && iA == 0 && iT == 0) {
            f11.a0(f11.j());
            return null;
        }
        int iG = f11.g() + iA;
        if (iG > f11.j()) {
            AbstractC1477t.h("Id3Decoder", "Frame size exceeds remaining tag data");
            f11.a0(f11.j());
            return null;
        }
        if (aVar != null) {
            boolean zA = aVar.a(i13, iL, iL2, iL3, iL4);
            r10 = iL;
            iA = iL2;
            if (!zA) {
                i13 = i13;
                f11.a0(iG);
                return null;
            }
        } else {
            iA = iL2;
            r10 = iL;
        }
        i13 = i13;
        if (i13 == 3) {
            z11 = (iT & 128) != 0;
            z13 = (iT & 64) != 0;
            z12 = (iT & 32) != 0;
            z14 = false;
            z15 = z11;
        } else if (i13 == 4) {
            boolean z16 = (iT & 64) != 0;
            boolean z17 = (iT & 8) != 0;
            boolean z18 = (iT & 4) != 0;
            z14 = (iT & 2) != 0;
            z15 = (iT & 1) != 0;
            z12 = z16;
            z11 = z15;
            z15 = z17;
            z13 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z15 || z13) {
            AbstractC1477t.h("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            f11.a0(iG);
            return null;
        }
        if (z12) {
            iA--;
            f11.b0(1);
        }
        if (z11) {
            iA -= 4;
            f11.b0(4);
        }
        if (z14) {
            iA = A(f11, iA);
        }
        try {
            try {
                if (r10 == 84 && iA == 88 && iL3 == 88 && (i13 == 2 || iL4 == 88)) {
                    aVarG = s(f11, iA);
                } else if (r10 == 84) {
                    aVarG = q(f11, iA, x(i13, r10, iA, iL3, iL4));
                } else if (r10 == 87 && iA == 88 && iL3 == 88 && (i13 == 2 || iL4 == 88)) {
                    aVarG = u(f11, iA);
                } else if (r10 == 87) {
                    aVarG = t(f11, iA, x(i13, r10, iA, iL3, iL4));
                } else {
                    if (r10 != 80 || iA != 82 || iL3 != 73 || iL4 != 86) {
                        if (r10 == 71 && iA == 69 && iL3 == 79 && (iL4 == 66 || i13 == 2)) {
                            aVarG = l(f11, iA);
                        } else {
                            th = null;
                            try {
                                if (i13 != 2 ? r10 == 65 && iA == 80 && iL3 == 73 && iL4 == 67 : r10 == 80 && iA == 73 && iL3 == 67) {
                                    aVarG = f(f11, iA, i13);
                                } else {
                                    if (r10 != 67 || iA != 79 || iL3 != 77 || (iL4 != 77 && i13 != 2)) {
                                        if (r10 == 67 && iA == 72 && iL3 == 65 && iL4 == 80) {
                                            r10 = r10;
                                            iA = iA;
                                            iL4 = iL4;
                                            iA = iA;
                                            i12 = iL3;
                                            try {
                                                aVarG = h(f11, iA, i13, z10, i11, aVar);
                                                i13 = i10;
                                                r10 = f10;
                                            } catch (Exception e10) {
                                                e = e10;
                                                i13 = i10;
                                                r14 = f10;
                                                r13 = r10;
                                                r14.a0(iG);
                                                r15 = th;
                                                r16 = r13;
                                            } catch (OutOfMemoryError e11) {
                                                e = e11;
                                                i13 = i10;
                                                r14 = f10;
                                                r13 = r10;
                                                r14.a0(iG);
                                                r15 = th;
                                                r16 = r13;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r12 = f10;
                                                r12.a0(iG);
                                                throw th;
                                            }
                                        } else {
                                            r10 = r10;
                                            iA = iA;
                                            iL4 = iL4;
                                            iA = iA;
                                            i12 = iL3;
                                            try {
                                                if (r10 == 67 && iA == 84 && i12 == 79 && iL4 == 67) {
                                                    i13 = i10;
                                                    F f12 = f10;
                                                    aVarG = i(f12, iA, i13, z10, i11, aVar);
                                                    r10 = f12;
                                                } else {
                                                    i13 = i10;
                                                    F f13 = f10;
                                                    if (r10 == 77 && iA == 76 && i12 == 76 && iL4 == 84) {
                                                        aVarG = n(f13, iA);
                                                        r10 = f13;
                                                    } else {
                                                        aVarG = g(f13, iA, x(i13, r10, iA, i12, iL4));
                                                        r10 = f13;
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                r14 = r10;
                                                r13 = r10;
                                                r14.a0(iG);
                                                r15 = th;
                                                r16 = r13;
                                            } catch (OutOfMemoryError e13) {
                                                e = e13;
                                                r14 = r10;
                                                r13 = r10;
                                                r14.a0(iG);
                                                r15 = th;
                                                r16 = r13;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r12 = r10;
                                                r12.a0(iG);
                                                throw th;
                                            }
                                        }
                                        if (r15 == 0) {
                                            AbstractC1477t.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
                                        }
                                        return r15;
                                    }
                                    aVarG = j(f11, iA);
                                }
                                r10 = f11;
                                iA = iA;
                                r10 = r10;
                                i12 = iL3;
                            } catch (Exception e14) {
                                e = e14;
                                r11 = r10;
                                iA = iA;
                                i12 = iL3;
                                r14 = f11;
                                r13 = r11;
                                r14.a0(iG);
                                r15 = th;
                                r16 = r13;
                                if (r15 == 0) {
                                    AbstractC1477t.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
                                }
                                return r15;
                            } catch (OutOfMemoryError e15) {
                                e = e15;
                                r11 = r10;
                                iA = iA;
                                i12 = iL3;
                                r14 = f11;
                                r13 = r11;
                                r14.a0(iG);
                                r15 = th;
                                r16 = r13;
                                if (r15 == 0) {
                                    AbstractC1477t.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
                                }
                                return r15;
                            }
                        }
                        r10.a0(iG);
                        r15 = aVarG;
                        e = th;
                        r16 = r10;
                        if (r15 == 0) {
                            AbstractC1477t.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
                        }
                        return r15;
                    }
                    aVarG = o(f11, iA);
                }
                r10 = f11;
                iA = iA;
                th = null;
                r10 = r10;
                i12 = iL3;
                r10.a0(iG);
                r15 = aVarG;
                e = th;
                r16 = r10;
            } catch (Throwable th4) {
                th = th4;
                r12 = f11;
            }
        } catch (Exception e16) {
            e = e16;
            r11 = r10;
            iA = iA;
            th = null;
            i12 = iL3;
            r14 = f11;
            r13 = r11;
            r14.a0(iG);
            r15 = th;
            r16 = r13;
            if (r15 == 0) {
                AbstractC1477t.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
            }
            return r15;
        } catch (OutOfMemoryError e17) {
            e = e17;
            r11 = r10;
            iA = iA;
            th = null;
            i12 = iL3;
            r14 = f11;
            r13 = r11;
            r14.a0(iG);
            r15 = th;
            r16 = r13;
            if (r15 == 0) {
                AbstractC1477t.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
            }
            return r15;
        }
        if (r15 == 0) {
            AbstractC1477t.i("Id3Decoder", "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
        }
        return r15;
    }

    private static f l(F f10, int i10) {
        int iL = f10.L();
        Charset charsetW = w(iL);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        f10.q(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strU = y.u(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iL);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iL);
        int iY2 = y(bArr, iV, iL);
        return new f(strU, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iL), i11));
    }

    private static b m(F f10) {
        if (f10.a() < 10) {
            AbstractC1477t.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iO = f10.O();
        if (iO != 4801587) {
            AbstractC1477t.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iO)));
            return null;
        }
        int iL = f10.L();
        f10.b0(1);
        int iL2 = f10.L();
        int iK = f10.K();
        if (iL == 2) {
            if ((iL2 & 64) != 0) {
                AbstractC1477t.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iL == 3) {
            if ((iL2 & 64) != 0) {
                int iU = f10.u();
                f10.b0(iU);
                iK -= iU + 4;
            }
        } else {
            if (iL != 4) {
                AbstractC1477t.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iL);
                return null;
            }
            if ((iL2 & 64) != 0) {
                int iK2 = f10.K();
                f10.b0(iK2 - 4);
                iK -= iK2;
            }
            if ((iL2 & 16) != 0) {
                iK -= 10;
            }
        }
        return new b(iL, iL < 4 && (iL2 & 128) != 0, iK);
    }

    private static l n(F f10, int i10) {
        int iT = f10.T();
        int iO = f10.O();
        int iO2 = f10.O();
        int iL = f10.L();
        int iL2 = f10.L();
        E e10 = new E();
        e10.m(f10);
        int i11 = ((i10 - 10) * 8) / (iL + iL2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = e10.h(iL);
            int iH2 = e10.h(iL2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new l(iT, iO, iO2, iArr, iArr2);
    }

    private static m o(F f10, int i10) {
        byte[] bArr = new byte[i10];
        f10.q(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static n q(F f10, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iL = f10.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        f10.q(bArr, 0, i11);
        return new n(str, null, r(bArr, iL, 0));
    }

    private static AbstractC0876t r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC0876t.x("");
        }
        AbstractC0876t.a aVarL = AbstractC0876t.l();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarL.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        AbstractC0876t abstractC0876tK = aVarL.k();
        return abstractC0876tK.isEmpty() ? AbstractC0876t.x("") : abstractC0876tK;
    }

    private static n s(F f10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iL = f10.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        f10.q(bArr, 0, i11);
        int iY = y(bArr, 0, iL);
        return new n("TXXX", new String(bArr, 0, iY, w(iL)), r(bArr, iL, iY + v(iL)));
    }

    private static o t(F f10, int i10, String str) {
        byte[] bArr = new byte[i10];
        f10.q(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(F f10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iL = f10.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        f10.q(bArr, 0, i11);
        int iY = y(bArr, 0, iL);
        String str = new String(bArr, 0, iY, w(iL));
        int iV = iY + v(iL);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // E2.c
    protected x b(E2.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public x e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        F f10 = new F(bArr, i10);
        b bVarM = m(f10);
        if (bVarM == null) {
            return null;
        }
        int iG = f10.g();
        int i11 = bVarM.f5711a == 2 ? 6 : 10;
        int iA = bVarM.f5713c;
        if (bVarM.f5712b) {
            iA = A(f10, bVarM.f5713c);
        }
        f10.Z(iG + iA);
        boolean z10 = false;
        if (!B(f10, bVarM.f5711a, i11, false)) {
            if (bVarM.f5711a != 4 || !B(f10, 4, i11, true)) {
                AbstractC1477t.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f5711a);
                return null;
            }
            z10 = true;
        }
        while (f10.a() >= i11) {
            i iVarK = k(bVarM.f5711a, f10, z10, i11, this.f5710a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new x(arrayList);
    }
}
