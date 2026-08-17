package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    protected static class a extends UnsatisfiedLinkError {
        a(String str) {
            super(str);
        }
    }

    public static String[] a(h hVar) {
        return hVar instanceof i ? c((i) hVar) : b(hVar);
    }

    private static String[] b(h hVar) {
        long jD;
        long jG;
        long jG2;
        long j10;
        long jG3;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jG4 = g(hVar, byteBufferAllocate, 0L);
        if (jG4 != 1179403647) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(jG4) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z10 = h(hVar, byteBufferAllocate, 4L) == 1;
        long j11 = 5;
        if (h(hVar, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jG5 = z10 ? g(hVar, byteBufferAllocate, 28L) : d(hVar, byteBufferAllocate, 32L);
        long jF = z10 ? f(hVar, byteBufferAllocate, 44L) : f(hVar, byteBufferAllocate, 56L);
        int iF = f(hVar, byteBufferAllocate, z10 ? 42L : 54L);
        boolean z11 = z10;
        long j12 = 40;
        if (jF == 65535) {
            long jG6 = z11 ? g(hVar, byteBufferAllocate, 32L) : d(hVar, byteBufferAllocate, 40L);
            jF = z11 ? g(hVar, byteBufferAllocate, jG6 + 28) : g(hVar, byteBufferAllocate, jG6 + 44);
        }
        long j13 = jG5;
        long j14 = 0;
        while (true) {
            if (j14 >= jF) {
                jD = 0;
                break;
            }
            if ((z11 ? g(hVar, byteBufferAllocate, j13) : g(hVar, byteBufferAllocate, j13)) == 2) {
                if (!z11) {
                    jD = d(hVar, byteBufferAllocate, j13 + 8);
                    break;
                }
                jD = g(hVar, byteBufferAllocate, j13 + 4);
                break;
            }
            j13 += (long) iF;
            j14++;
            j12 = j12;
        }
        long j15 = j12;
        if (jD == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j16 = jD;
        long jG7 = 0;
        int i10 = 0;
        while (true) {
            long jG8 = z11 ? g(hVar, byteBufferAllocate, j16) : d(hVar, byteBufferAllocate, j16);
            long j17 = j11;
            if (jG8 == 1) {
                if (i10 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i10++;
            } else if (jG8 == j17) {
                jG7 = z11 ? g(hVar, byteBufferAllocate, j16 + 4) : d(hVar, byteBufferAllocate, j16 + 8);
            }
            j16 += z11 ? 8L : 16L;
            if (jG8 == 0) {
                if (jG7 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= jF) {
                        jG = 0;
                        break;
                    }
                    if (z11) {
                        j10 = jG5;
                        jG3 = g(hVar, byteBufferAllocate, j10);
                    } else {
                        j10 = jG5;
                        jG3 = g(hVar, byteBufferAllocate, j10);
                    }
                    if (jG3 == 1) {
                        long jG9 = z11 ? g(hVar, byteBufferAllocate, j10 + 8) : d(hVar, byteBufferAllocate, j10 + 16);
                        long jG10 = z11 ? g(hVar, byteBufferAllocate, j10 + 20) : d(hVar, byteBufferAllocate, j10 + j15);
                        if (jG9 <= jG7 && jG7 < jG9 + jG10) {
                            jG = (z11 ? g(hVar, byteBufferAllocate, j10 + 4) : d(hVar, byteBufferAllocate, j10 + 8)) + (jG7 - jG9);
                            break;
                        }
                    } else {
                        jF = jF;
                    }
                    jG5 = j10 + ((long) iF);
                    i11++;
                    jF = jF;
                }
                if (jG == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i10];
                int i12 = 0;
                do {
                    jG2 = z11 ? g(hVar, byteBufferAllocate, jD) : d(hVar, byteBufferAllocate, jD);
                    if (jG2 == 1) {
                        strArr[i12] = e(hVar, byteBufferAllocate, (z11 ? g(hVar, byteBufferAllocate, jD + 4) : d(hVar, byteBufferAllocate, jD + 8)) + jG);
                        if (i12 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i12++;
                    }
                    jD += z11 ? 8L : 16L;
                } while (jG2 != 0);
                if (i12 == i10) {
                    return strArr;
                }
                throw new a("malformed DT_NEEDED section");
            }
            j11 = j17;
        }
    }

    private static String[] c(i iVar) throws ClosedByInterruptException {
        int i10 = 0;
        while (true) {
            try {
                return b(iVar);
            } catch (ClosedByInterruptException e10) {
                i10++;
                if (i10 > 4) {
                    throw e10;
                }
                Thread.interrupted();
                p.c("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e10);
                iVar.a();
            }
        }
    }

    private static long d(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 8, j10);
        return byteBuffer.getLong();
    }

    private static String e(h hVar, ByteBuffer byteBuffer, long j10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sH = h(hVar, byteBuffer, j10);
            if (sH == 0) {
                return sb2.toString();
            }
            sb2.append((char) sH);
            j10 = j11;
        }
    }

    private static int f(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 2, j10);
        return byteBuffer.getShort() & 65535;
    }

    private static long g(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 4, j10);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short h(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 1, j10);
        return (short) (byteBuffer.get() & 255);
    }

    private static void i(h hVar, ByteBuffer byteBuffer, int i10, long j10) {
        int iL0;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        while (byteBuffer.remaining() > 0 && (iL0 = hVar.L0(byteBuffer, j10)) != -1) {
            j10 += (long) iL0;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
