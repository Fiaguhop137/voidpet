package N8;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: N8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1221p extends AbstractC1213h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final AbstractC1213h f8033g = new C1221p(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object f8034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f8035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f8036f;

    private C1221p(Object obj, Object[] objArr, int i10) {
        this.f8034d = obj;
        this.f8035e = objArr;
        this.f8036f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[PHI: r3
      0x00d5: PHI (r3v6 ??) = (r3v2 ??), (r3v4 short[]), (r3v8 ??) binds: [B:75:0x01a6, B:57:0x0137, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    static C1221p g(int i10, Object[] objArr, AbstractC1212g abstractC1212g) {
        int iHighestOneBit;
        short[] sArr;
        int i11;
        boolean z10;
        int i12 = i10;
        if (i12 == 0) {
            return (C1221p) f8033g;
        }
        C1211f c1211f = null;
        ?? r10 = 0;
        C1211f c1211f2 = null;
        C1211f c1211f3 = null;
        boolean z11 = false;
        int i13 = 1;
        if (i12 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            T.a(obj, obj2);
            return new C1221p(null, objArr, 1);
        }
        P.b(i12, objArr.length >> 1, "index");
        int iMax = Math.max(i12, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr[1];
            Objects.requireNonNull(obj4);
            T.a(obj3, obj4);
            i12 = 1;
        } else {
            int i14 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj5 = objArr[i18];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArr[i18 ^ 1];
                    Objects.requireNonNull(obj6);
                    T.a(obj5, obj6);
                    int iA = V.a(obj5.hashCode());
                    while (true) {
                        int i19 = iA & i14;
                        z10 = z11;
                        ?? r15 = bArr[i19] & 255;
                        if (r15 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArr[i17] = obj5;
                                objArr[i17 ^ 1] = obj6;
                            }
                            i16++;
                            break;
                        }
                        if (obj5.equals(objArr[r15 == true ? 1 : 0])) {
                            ?? r11 = ~r15;
                            Object obj7 = objArr[r11 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            C1211f c1211f4 = new C1211f(obj5, obj6, obj7);
                            objArr[r11 == true ? 1 : 0] = obj6;
                            c1211f2 = c1211f4;
                            break;
                        }
                        iA = i19 + 1;
                        z11 = z10;
                    }
                    i15++;
                    z11 = z10;
                }
                boolean z12 = z11;
                if (i16 == i12) {
                    r10 = bArr;
                } else {
                    sArr = new Object[3];
                    sArr[z12 ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i16);
                    sArr[2] = c1211f2;
                    r10 = sArr;
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i20 = 0;
                for (int i21 = 0; i21 < i12; i21++) {
                    int i22 = i20 + i20;
                    int i23 = i21 + i21;
                    Object obj8 = objArr[i23];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArr[i23 ^ 1];
                    Objects.requireNonNull(obj9);
                    T.a(obj8, obj9);
                    int iA2 = V.a(obj8.hashCode());
                    while (true) {
                        int i24 = iA2 & i14;
                        char c10 = (char) sArr[i24];
                        if (c10 == 65535) {
                            sArr[i24] = (short) i22;
                            if (i20 < i21) {
                                objArr[i22] = obj8;
                                objArr[i22 ^ 1] = obj9;
                            }
                            i20++;
                            break;
                        }
                        if (obj8.equals(objArr[c10])) {
                            ?? r12 = c10 ^ 1;
                            Object obj10 = objArr[r12 == true ? 1 : 0];
                            Objects.requireNonNull(obj10);
                            C1211f c1211f5 = new C1211f(obj8, obj9, obj10);
                            objArr[r12 == true ? 1 : 0] = obj9;
                            c1211f3 = c1211f5;
                            break;
                        }
                        iA2 = i24 + 1;
                    }
                }
                if (i20 == i12) {
                    r10 = sArr;
                } else {
                    r10 = new Object[]{sArr, Integer.valueOf(i20), c1211f3};
                }
            } else {
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i25 = 0;
                int i26 = 0;
                while (i25 < i12) {
                    int i27 = i26 + i26;
                    int i28 = i25 + i25;
                    Object obj11 = objArr[i28];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr[i28 ^ i13];
                    Objects.requireNonNull(obj12);
                    T.a(obj11, obj12);
                    int iA3 = V.a(obj11.hashCode());
                    while (true) {
                        int i29 = iA3 & i14;
                        ?? r16 = sArr[i29];
                        if (r16 == -1) {
                            sArr[i29] = i27;
                            if (i26 < i25) {
                                objArr[i27] = obj11;
                                objArr[i27 ^ 1] = obj12;
                            }
                            i26++;
                            i11 = i13;
                            break;
                        }
                        i11 = i13;
                        if (obj11.equals(objArr[r16])) {
                            ?? r13 = r16 ^ 1;
                            Object obj13 = objArr[r13 == true ? 1 : 0];
                            Objects.requireNonNull(obj13);
                            C1211f c1211f6 = new C1211f(obj11, obj12, obj13);
                            objArr[r13 == true ? 1 : 0] = obj12;
                            c1211f = c1211f6;
                            break;
                        }
                        iA3 = i29 + 1;
                        i13 = i11;
                    }
                    i25++;
                    i13 = i11;
                }
                int i30 = i13;
                if (i26 == i12) {
                    r10 = sArr;
                } else {
                    ?? r14 = new Object[3];
                    r14[0] = sArr;
                    r14[i30] = Integer.valueOf(i26);
                    r14[2] = c1211f;
                    r10 = r14;
                }
            }
        }
        if (r10 instanceof Object[]) {
            throw ((C1211f) ((Object[]) r10)[2]).a();
        }
        return new C1221p(r10, objArr, i12);
    }

    @Override // N8.AbstractC1213h
    final AbstractC1207b a() {
        return new C1220o(this.f8035e, 1, this.f8036f);
    }

    @Override // N8.AbstractC1213h
    final AbstractC1214i d() {
        return new C1218m(this, this.f8035e, 0, this.f8036f);
    }

    @Override // N8.AbstractC1213h
    final AbstractC1214i e() {
        return new C1219n(this, new C1220o(this.f8035e, 0, this.f8036f));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // N8.AbstractC1213h, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f8036f;
            Object[] objArr = this.f8035e;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f8034d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = V.a(obj.hashCode());
                    while (true) {
                        int i11 = iA & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iA = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = V.a(obj.hashCode());
                    while (true) {
                        int i13 = iA2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iA2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = V.a(obj.hashCode());
                    while (true) {
                        int i14 = iA3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iA3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8036f;
    }
}
