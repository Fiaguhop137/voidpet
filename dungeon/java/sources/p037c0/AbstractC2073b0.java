package p037c0;

import Ad.z;
import kotlin.jvm.internal.Intrinsics;
import p055d0.AbstractC3218b;
import p055d0.AbstractC3219c;
import p055d0.F;
import p055d0.k;
import p055d0.n;

/* JADX INFO: renamed from: c0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2073b0 {
    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x016f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019f  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    public static final long a(float f10, float f11, float f12, float f13, AbstractC3219c abstractC3219c) {
        int i10;
        int i11;
        int i12;
        float fD;
        float fC;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float fD2;
        float fC2;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f14;
        if (abstractC3219c.g()) {
            float f15 = f13 < 0.0f ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i29 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i30 = i29 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < 0.0f ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i31 = i30 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            f14 = f12 >= 0.0f ? f12 : 0.0f;
            return Z.h(z.g(z.g(i31 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        int i32 = 0;
        if (!(abstractC3219c.a() == 3)) {
            h0.a("Color only works with ColorSpaces with 3 components");
        }
        int iB = abstractC3219c.b();
        if (!(iB != -1)) {
            h0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fD3 = abstractC3219c.d(0);
        float fC3 = abstractC3219c.c(0);
        if (f10 >= fD3) {
            fD3 = f10;
        }
        if (fD3 <= fC3) {
            fC3 = fD3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fC3);
        int i33 = iFloatToRawIntBits3 >>> 31;
        int i34 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i35 = iFloatToRawIntBits3 & 8388607;
        if (i34 == 255) {
            i11 = i35 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i34 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else {
                if (i10 > 0) {
                    int i36 = i35 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i36) + 1) | (i33 << 15);
                    } else {
                        i11 = i36;
                    }
                    short s10 = (short) i12;
                    fD = abstractC3219c.d(1);
                    fC = abstractC3219c.c(1);
                    if (f11 >= fD) {
                        fD = f11;
                    }
                    if (fD <= fC) {
                        fC = fD;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fC);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i16 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                fD2 = abstractC3219c.d(2);
                                fC2 = abstractC3219c.c(2);
                                if (f12 >= fD2) {
                                    fD2 = f12;
                                }
                                if (fD2 <= fC2) {
                                    fC2 = fD2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fC2);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i26 = i23 != 0 ? 512 : 0;
                                    i32 = 31;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i26 = 0;
                                        i32 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i25 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                            } else {
                                                i26 = i25;
                                                i32 = i24;
                                            }
                                            short s12 = (short) i27;
                                            f14 = f13 >= 0.0f ? f13 : 0.0f;
                                            return Z.h(z.g((((long) iB) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                                        }
                                        if (i24 >= -10) {
                                            i28 = (i23 | 8388608) >> (1 - i24);
                                            if ((i28 & 4096) != 0) {
                                                i28 += 8192;
                                            }
                                            i26 = i28 >> 13;
                                        } else {
                                            i26 = 0;
                                        }
                                    }
                                }
                                i27 = i26 | (i21 << 15) | (i32 << 10);
                                short s13 = (short) i27;
                                if (f13 >= 0.0f) {
                                }
                                return Z.h(z.g((((long) iB) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s14 = (short) i19;
                    fD2 = abstractC3219c.d(2);
                    fC2 = abstractC3219c.c(2);
                    if (f12 >= fD2) {
                        fD2 = f12;
                    }
                    if (fD2 <= fC2) {
                        fC2 = fD2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fC2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i32 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i32 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i32 = i24;
                                }
                                short s15 = (short) i27;
                                if (f13 >= 0.0f) {
                                }
                                return Z.h(z.g((((long) iB) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i32 << 10);
                    short s16 = (short) i27;
                    if (f13 >= 0.0f) {
                    }
                    return Z.h(z.g((((long) iB) & 63) | ((((long) s10) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s16)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i10 >= -10) {
                    int i37 = (i35 | 8388608) >> (1 - i10);
                    if ((i37 & 4096) != 0) {
                        i37 += 8192;
                    }
                    i11 = i37 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i33 << 15) | (i10 << 10);
        short s17 = (short) i12;
        fD = abstractC3219c.d(1);
        fC = abstractC3219c.c(1);
        if (f11 >= fD) {
            fD = f11;
        }
        if (fD <= fC) {
            fC = fD;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fC);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i16 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s18 = (short) i19;
                    fD2 = abstractC3219c.d(2);
                    fC2 = abstractC3219c.c(2);
                    if (f12 >= fD2) {
                        fD2 = f12;
                    }
                    if (fD2 <= fC2) {
                        fC2 = fD2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fC2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i26 = i23 != 0 ? 512 : 0;
                        i32 = 31;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i32 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i26 = i25;
                                    i32 = i24;
                                }
                                short s19 = (short) i27;
                                if (f13 >= 0.0f) {
                                }
                                return Z.h(z.g((((long) iB) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s19)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i24 >= -10) {
                                i28 = (i23 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                            } else {
                                i26 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i21 << 15) | (i32 << 10);
                    short s110 = (short) i27;
                    if (f13 >= 0.0f) {
                    }
                    return Z.h(z.g((((long) iB) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s110)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s111 = (short) i19;
        fD2 = abstractC3219c.d(2);
        fC2 = abstractC3219c.c(2);
        if (f12 >= fD2) {
            fD2 = f12;
        }
        if (fD2 <= fC2) {
            fC2 = fD2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fC2);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i26 = i23 != 0 ? 512 : 0;
            i32 = 31;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i26 = 0;
                i32 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i27 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                    } else {
                        i26 = i25;
                        i32 = i24;
                    }
                    short s112 = (short) i27;
                    if (f13 >= 0.0f) {
                    }
                    return Z.h(z.g((((long) iB) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s112)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i24 >= -10) {
                    i28 = (i23 | 8388608) >> (1 - i24);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i26 = i28 >> 13;
                } else {
                    i26 = 0;
                }
            }
        }
        i27 = i26 | (i21 << 15) | (i32 << 10);
        short s113 = (short) i27;
        if (f13 >= 0.0f) {
        }
        return Z.h(z.g((((long) iB) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s113)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
    }

    public static final long b(int i10) {
        return Z.h(z.g(z.g(i10) << 32));
    }

    public static final long c(long j10) {
        return Z.h(z.g(j10 << 32));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    public static final long d(float f10, float f11, float f12, float f13, AbstractC3219c abstractC3219c) {
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        if (abstractC3219c.g()) {
            return Z.h(z.g(z.g((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f))) << 32));
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        int i30 = 49;
        int i31 = 0;
        if (i28 == 255) {
            i11 = i29 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i28 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i32 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i32) + 1) | (i27 << 15);
                    } else {
                        i11 = i32;
                    }
                    short s10 = (short) i12;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i24 = i22 - 112;
                                    if (i24 < 31) {
                                        if (i24 <= 0) {
                                            i31 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                                            } else {
                                                i30 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += 8192;
                                            }
                                            i30 = 0;
                                            i31 = i26 >> 13;
                                        } else {
                                            i30 = 0;
                                        }
                                    }
                                    return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
                                }
                                i31 = i23 == 0 ? 0 : 512;
                                i30 = 31;
                                i25 = (i21 << 15) | (i30 << 10) | i31;
                                return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s12 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i31 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                                } else {
                                    i30 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i30 = 0;
                                i31 = i26 >> 13;
                            } else {
                                i30 = 0;
                            }
                        }
                        return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
                    }
                    i31 = i23 == 0 ? 0 : 512;
                    i30 = 31;
                    i25 = (i21 << 15) | (i30 << 10) | i31;
                    return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s10) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
                }
                if (i10 >= -10) {
                    int i33 = (i29 | 8388608) >> (1 - i10);
                    if ((i33 & 4096) != 0) {
                        i33 += 8192;
                    }
                    i11 = i33 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i27 << 15) | (i10 << 10);
        short s13 = (short) i12;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s14 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i24 = i22 - 112;
                        if (i24 < 31) {
                            if (i24 <= 0) {
                                i31 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                                } else {
                                    i30 = i24;
                                }
                            } else if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i30 = 0;
                                i31 = i26 >> 13;
                            } else {
                                i30 = 0;
                            }
                        }
                        return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
                    }
                    i31 = i23 == 0 ? 0 : 512;
                    i30 = 31;
                    i25 = (i21 << 15) | (i30 << 10) | i31;
                    return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s15 = (short) i19;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i24 = i22 - 112;
            if (i24 < 31) {
                if (i24 <= 0) {
                    i31 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i25 = (((i24 << 10) | i31) + 1) | (i21 << 15);
                    } else {
                        i30 = i24;
                    }
                } else if (i24 >= -10) {
                    i26 = (i23 | 8388608) >> (1 - i24);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i30 = 0;
                    i31 = i26 >> 13;
                } else {
                    i30 = 0;
                }
            }
            return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
        }
        i31 = i23 == 0 ? 0 : 512;
        i30 = 31;
        i25 = (i21 << 15) | (i30 << 10) | i31;
        return Z.h(z.g(((((long) ((short) i25)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC3219c.b()) & 63)));
    }

    public static final long e(long j10, long j11) {
        long jI = Z.i(j10, Z.p(j11));
        float fN = Z.n(j11);
        float fN2 = Z.n(jI);
        float f10 = 1.0f - fN2;
        float f11 = (fN * f10) + fN2;
        return d(f11 == 0.0f ? 0.0f : ((Z.r(jI) * fN2) + ((Z.r(j11) * fN) * f10)) / f11, f11 == 0.0f ? 0.0f : ((Z.q(jI) * fN2) + ((Z.q(j11) * fN) * f10)) / f11, f11 != 0.0f ? ((Z.o(jI) * fN2) + ((Z.o(j11) * fN) * f10)) / f11 : 0.0f, f11, Z.p(j11));
    }

    public static final float f(long j10) {
        AbstractC3219c abstractC3219cP = Z.p(j10);
        if (!AbstractC3218b.e(abstractC3219cP.e(), AbstractC3218b.f39547a.b())) {
            h0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC3218b.h(abstractC3219cP.e())));
        }
        Intrinsics.d(abstractC3219cP, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        n nVarV = ((F) abstractC3219cP).v();
        float fA = (float) ((nVarV.a(Z.r(j10)) * 0.2126d) + (nVarV.a(Z.q(j10)) * 0.7152d) + (nVarV.a(Z.o(j10)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int g(long j10) {
        return (int) z.g(Z.i(j10, k.f39559a.p()) >>> 32);
    }
}
