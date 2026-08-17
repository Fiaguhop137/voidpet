package Jf;

import If.AbstractC1103e;
import If.C1106h;
import If.O;
import If.V;
import If.e0;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f5807a = e0.a("0123456789abcdef");

    public static final C1106h.a a(C1106h c1106h, C1106h.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(c1106h, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        C1106h.a aVarG = AbstractC1103e.g(unsafeCursor);
        if (aVarG.f5514a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.f5514a = c1106h;
        aVarG.f5515b = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f5807a;
    }

    public static final boolean c(V segment, int i10, byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f5467c;
        byte[] bArr = segment.f5465a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f5470f;
                Intrinsics.c(segment);
                byte[] bArr2 = segment.f5465a;
                bArr = bArr2;
                i10 = segment.f5466b;
                i13 = segment.f5467c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C1106h c1106h, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(c1106h, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c1106h.o(j11) == 13) {
                String strH2 = c1106h.h2(j11);
                c1106h.skip(2L);
                return strH2;
            }
        }
        String strH3 = c1106h.h2(j10);
        c1106h.skip(1L);
        return strH3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int e(C1106h c1106h, O options, boolean z10) {
        int i10;
        int i11;
        V v10;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(c1106h, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        V v11 = c1106h.f5512a;
        if (v11 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = v11.f5465a;
        int i14 = v11.f5466b;
        int i15 = v11.f5467c;
        int[] iArrK = options.k();
        V v12 = v11;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArrK[i17];
            int i20 = i17 + 2;
            int i21 = iArrK[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (v12 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArrK[i20]) {
                        i11 = iArrK[i20 + i19];
                        if (i10 == i15) {
                            v12 = v12.f5470f;
                            Intrinsics.c(v12);
                            i10 = v12.f5466b;
                            bArr = v12.f5465a;
                            i15 = v12.f5467c;
                            if (v12 == v11) {
                                v12 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) == iArrK[i20]) {
                    boolean z11 = i26 == i24;
                    if (i25 == i15) {
                        Intrinsics.c(v12);
                        V v13 = v12.f5470f;
                        Intrinsics.c(v13);
                        i13 = v13.f5466b;
                        byte[] bArr2 = v13.f5465a;
                        i12 = v13.f5467c;
                        if (v13 != v11) {
                            v10 = v13;
                            bArr = bArr2;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            v10 = null;
                        }
                    } else {
                        v10 = v12;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z11) {
                        i11 = iArrK[i26];
                        i10 = i13;
                        i15 = i12;
                        v12 = v10;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    v12 = v10;
                    i20 = i26;
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int f(C1106h c1106h, O o10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(c1106h, o10, z10);
    }
}
