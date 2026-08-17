package Xg;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f16529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f16531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f16532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16533h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16526a = new byte[4160];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f16527b = new int[1040];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f16528c = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16534i = 0;

    a() {
    }

    static void a(a aVar, boolean z10) {
        if (aVar.f16530e) {
            int i10 = ((aVar.f16533h << 2) + ((aVar.f16532g + 7) >> 3)) - 8;
            int i11 = aVar.f16534i;
            if (i10 > i11) {
                throw new c("Read after end");
            }
            if (z10 && i10 != i11) {
                throw new c("Unused bytes after end");
            }
        }
    }

    static void b(a aVar) throws IOException {
        InputStream inputStream = aVar.f16529d;
        aVar.f16529d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void c(a aVar, byte[] bArr, int i10, int i11) {
        if ((aVar.f16532g & 7) != 0) {
            throw new c("Unaligned copyBytes");
        }
        while (true) {
            int i12 = aVar.f16532g;
            if (i12 == 64 || i11 == 0) {
                break;
            }
            bArr[i10] = (byte) (aVar.f16531f >>> i12);
            aVar.f16532g = i12 + 8;
            i11--;
            i10++;
        }
        if (i11 == 0) {
            return;
        }
        int iMin = Math.min(f(aVar), i11 >> 2);
        if (iMin > 0) {
            int i13 = iMin << 2;
            System.arraycopy(aVar.f16526a, aVar.f16533h << 2, bArr, i10, i13);
            i10 += i13;
            i11 -= i13;
            aVar.f16533h += iMin;
        }
        if (i11 == 0) {
            return;
        }
        if (f(aVar) <= 0) {
            while (i11 > 0) {
                try {
                    int i14 = aVar.f16529d.read(bArr, i10, i11);
                    if (i14 == -1) {
                        throw new c("Unexpected end of input");
                    }
                    i10 += i14;
                    i11 -= i14;
                } catch (IOException e10) {
                    throw new c("Failed to read input", e10);
                }
            }
            return;
        }
        d(aVar);
        while (i11 != 0) {
            long j10 = aVar.f16531f;
            int i15 = aVar.f16532g;
            bArr[i10] = (byte) (j10 >>> i15);
            aVar.f16532g = i15 + 8;
            i11--;
            i10++;
        }
        a(aVar, false);
    }

    static void d(a aVar) {
        int i10 = aVar.f16532g;
        if (i10 >= 32) {
            int[] iArr = aVar.f16527b;
            int i11 = aVar.f16533h;
            aVar.f16533h = i11 + 1;
            aVar.f16531f = (((long) iArr[i11]) << 32) | (aVar.f16531f >>> 32);
            aVar.f16532g = i10 - 32;
        }
    }

    static void e(a aVar, InputStream inputStream) {
        if (aVar.f16529d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        i.b(aVar.f16528c, aVar.f16526a, aVar.f16527b);
        aVar.f16529d = inputStream;
        aVar.f16531f = 0L;
        aVar.f16532g = 64;
        aVar.f16533h = 1024;
        aVar.f16530e = false;
        h(aVar);
    }

    static int f(a aVar) {
        return (aVar.f16530e ? (aVar.f16534i + 3) >> 2 : 1024) - aVar.f16533h;
    }

    static void g(a aVar) {
        int i10 = (64 - aVar.f16532g) & 7;
        if (i10 != 0 && i(aVar, i10) != 0) {
            throw new c("Corrupted padding bits");
        }
    }

    private static void h(a aVar) {
        j(aVar);
        a(aVar, false);
        d(aVar);
        d(aVar);
    }

    static int i(a aVar, int i10) {
        d(aVar);
        long j10 = aVar.f16531f;
        int i11 = aVar.f16532g;
        int i12 = ((int) (j10 >>> i11)) & ((1 << i10) - 1);
        aVar.f16532g = i11 + i10;
        return i12;
    }

    static void j(a aVar) {
        int i10 = aVar.f16533h;
        if (i10 <= 1015) {
            return;
        }
        if (aVar.f16530e) {
            if (f(aVar) < -2) {
                throw new c("No more input");
            }
            return;
        }
        int i11 = i10 << 2;
        int i12 = 4096 - i11;
        byte[] bArr = aVar.f16526a;
        System.arraycopy(bArr, i11, bArr, 0, i12);
        aVar.f16533h = 0;
        while (i12 < 4096) {
            try {
                int i13 = aVar.f16529d.read(aVar.f16526a, i12, 4096 - i12);
                if (i13 <= 0) {
                    aVar.f16530e = true;
                    aVar.f16534i = i12;
                    i12 += 3;
                    break;
                }
                i12 += i13;
            } catch (IOException e10) {
                throw new c("Failed to read input", e10);
            }
        }
        i.a(aVar.f16528c, i12 >> 2);
    }

    static void k(a aVar) {
        if (aVar.f16532g == 64) {
            h(aVar);
        }
    }
}
