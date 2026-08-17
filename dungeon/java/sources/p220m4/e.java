package p220m4;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f49108u = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f49109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f49110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0582a f49111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ByteBuffer f49112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f49113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short[] f49114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f49115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f49116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f49117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f49118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f49120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f49121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f49122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f49123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f49124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f49125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f49126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f49127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Bitmap.Config f49128t;

    public e(a.InterfaceC0582a interfaceC0582a) {
        this.f49110b = new int[256];
        this.f49128t = Bitmap.Config.ARGB_8888;
        this.f49111c = interfaceC0582a;
        this.f49120l = new c();
    }

    public e(a.InterfaceC0582a interfaceC0582a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0582a);
        r(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f49124p + i10; i18++) {
            byte[] bArr = this.f49117i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f49109a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f49124p + i20; i21++) {
            byte[] bArr2 = this.f49117i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f49109a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f49118j;
        int i14 = bVar.f49083d;
        int i15 = this.f49124p;
        int i16 = i14 / i15;
        int i17 = bVar.f49081b / i15;
        int i18 = bVar.f49082c / i15;
        int i19 = bVar.f49080a / i15;
        boolean z10 = this.f49119k == 0;
        int i20 = this.f49126r;
        int i21 = this.f49125q;
        byte[] bArr = this.f49117i;
        int[] iArr2 = this.f49109a;
        Boolean bool = this.f49127s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f49084e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f49082c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & 255];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int i39 = i(i32, i36, bVar.f49082c);
                        if (i39 != 0) {
                            iArr3[i37] = i39;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                }
                i24++;
                i15 = i13;
                iArr = iArr3;
                i16 = i10;
                i23 = i12;
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f49127s == null) {
            this.f49127s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f49118j;
        int i10 = bVar2.f49083d;
        int i11 = bVar2.f49081b;
        int i12 = bVar2.f49082c;
        int i13 = bVar2.f49080a;
        boolean z10 = this.f49119k == 0;
        int i14 = this.f49126r;
        byte[] bArr = this.f49117i;
        int[] iArr2 = this.f49109a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f49082c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & 255;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f49127s;
        this.f49127s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f49127s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void l(b bVar) {
        int i10;
        int i11;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f49112d.position(bVar.f49089j);
        }
        if (bVar == null) {
            c cVar = eVar.f49120l;
            i10 = cVar.f49096f;
            i11 = cVar.f49097g;
        } else {
            i10 = bVar.f49082c;
            i11 = bVar.f49083d;
        }
        int i12 = i10 * i11;
        byte[] bArr = eVar.f49117i;
        if (bArr == null || bArr.length < i12) {
            eVar.f49117i = eVar.f49111c.b(i12);
        }
        byte[] bArr2 = eVar.f49117i;
        if (eVar.f49114f == null) {
            eVar.f49114f = new short[4096];
        }
        short[] sArr = eVar.f49114f;
        if (eVar.f49115g == null) {
            eVar.f49115g = new byte[4096];
        }
        byte[] bArr3 = eVar.f49115g;
        if (eVar.f49116h == null) {
            eVar.f49116h = new byte[4097];
        }
        byte[] bArr4 = eVar.f49116h;
        int iQ = eVar.q();
        int i13 = 1 << iQ;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iQ + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr3[i18] = (byte) i18;
        }
        byte[] bArr5 = eVar.f49113e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iP = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (i22 < i12) {
            if (iP == 0) {
                iP = eVar.p();
                if (iP <= 0) {
                    eVar.f49123o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr5[i23] & 255) << i24;
            i23++;
            iP--;
            int i30 = i24 + 8;
            i20 = i20;
            int i31 = i19;
            int i32 = i29;
            short[] sArr2 = sArr;
            int i33 = i27;
            while (true) {
                bArr3 = bArr3;
                if (i30 < i31) {
                    i27 = i33;
                    break;
                }
                int i34 = i25 & i21;
                i25 >>= i31;
                i30 -= i31;
                if (i34 == i13) {
                    i31 = i16;
                    i20 = i15;
                    i21 = i17;
                    i32 = -1;
                } else {
                    if (i34 == i14) {
                        i27 = i33;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i32 == -1) {
                        bArr2[i26] = bArr3[i34];
                        i26++;
                        i22++;
                        i32 = i34;
                        i33 = i32;
                        bArr4 = bArr6;
                    } else {
                        if (i34 >= i20) {
                            bArr6[i28] = (byte) i33;
                            i28++;
                            s10 = i32;
                        } else {
                            s10 = i34;
                        }
                        while (s10 >= i13) {
                            bArr6[i28] = bArr3[s10];
                            i28++;
                            s10 = sArr2[s10];
                        }
                        int i35 = bArr3[s10] & 255;
                        byte b11 = (byte) i35;
                        bArr2[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i28 <= 0) {
                                break;
                            }
                            i28--;
                            bArr2[i26] = bArr6[i28];
                        }
                        if (i20 < 4096) {
                            sArr2[i20] = (short) i32;
                            bArr3[i20] = b11;
                            i20++;
                            if ((i20 & i21) == 0 && i20 < 4096) {
                                i31++;
                                i21 += i20;
                            }
                        }
                        i32 = i34;
                        bArr4 = bArr6;
                        i33 = i35;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr3 = bArr3;
            b10 = 0;
            i29 = i32;
            i19 = i31;
            eVar = this;
        }
        Arrays.fill(bArr2, i26, i12, b10);
    }

    private Bitmap o() {
        Boolean bool = this.f49127s;
        Bitmap bitmapC = this.f49111c.c(this.f49126r, this.f49125q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f49128t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    private int p() {
        int iQ = q();
        if (iQ <= 0) {
            return iQ;
        }
        ByteBuffer byteBuffer = this.f49112d;
        byteBuffer.get(this.f49113e, 0, Math.min(iQ, byteBuffer.remaining()));
        return iQ;
    }

    private int q() {
        return this.f49112d.get() & 255;
    }

    private Bitmap s(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f49118j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f49121m;
            if (bitmap2 != null) {
                this.f49111c.a(bitmap2);
            }
            this.f49121m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f49086g == 3 && this.f49121m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f49086g) > 0) {
            if (i11 == 2) {
                if (!bVar.f49085f) {
                    c cVar = this.f49120l;
                    int i13 = cVar.f49102l;
                    if (bVar.f49090k == null || cVar.f49100j != bVar.f49087h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f49083d;
                int i15 = this.f49124p;
                int i16 = i14 / i15;
                int i17 = bVar2.f49081b / i15;
                int i18 = bVar2.f49082c / i15;
                int i19 = bVar2.f49080a / i15;
                int i20 = this.f49126r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f49126r;
                }
            } else if (i11 == 3 && (bitmap = this.f49121m) != null) {
                int i25 = this.f49126r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f49125q);
            }
        }
        l(bVar);
        if (bVar.f49084e || this.f49124p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f49122n && ((i10 = bVar.f49086g) == 0 || i10 == 1)) {
            if (this.f49121m == null) {
                this.f49121m = o();
            }
            Bitmap bitmap3 = this.f49121m;
            int i26 = this.f49126r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f49125q);
        }
        Bitmap bitmapO = o();
        int i27 = this.f49126r;
        bitmapO.setPixels(iArr, 0, i27, 0, 0, i27, this.f49125q);
        return bitmapO;
    }

    @Override // p220m4.a
    public int a() {
        return this.f49120l.f49093c;
    }

    @Override // p220m4.a
    public synchronized Bitmap b() {
        try {
            if (this.f49120l.f49093c <= 0 || this.f49119k < 0) {
                String str = f49108u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f49120l.f49093c + ", framePointer=" + this.f49119k);
                }
                this.f49123o = 1;
            }
            int i10 = this.f49123o;
            if (i10 != 1 && i10 != 2) {
                this.f49123o = 0;
                if (this.f49113e == null) {
                    this.f49113e = this.f49111c.b(255);
                }
                b bVar = (b) this.f49120l.f49095e.get(this.f49119k);
                int i11 = this.f49119k - 1;
                b bVar2 = i11 >= 0 ? (b) this.f49120l.f49095e.get(i11) : null;
                int[] iArr = bVar.f49090k;
                if (iArr == null) {
                    iArr = this.f49120l.f49091a;
                }
                this.f49109a = iArr;
                if (iArr == null) {
                    String str2 = f49108u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f49119k);
                    }
                    this.f49123o = 1;
                    return null;
                }
                if (bVar.f49085f) {
                    System.arraycopy(iArr, 0, this.f49110b, 0, iArr.length);
                    int[] iArr2 = this.f49110b;
                    this.f49109a = iArr2;
                    iArr2[bVar.f49087h] = 0;
                    if (bVar.f49086g == 2 && this.f49119k == 0) {
                        this.f49127s = Boolean.TRUE;
                    }
                }
                return s(bVar, bVar2);
            }
            String str3 = f49108u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f49123o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p220m4.a
    public void c() {
        this.f49119k = (this.f49119k + 1) % this.f49120l.f49093c;
    }

    @Override // p220m4.a
    public void clear() {
        this.f49120l = null;
        byte[] bArr = this.f49117i;
        if (bArr != null) {
            this.f49111c.e(bArr);
        }
        int[] iArr = this.f49118j;
        if (iArr != null) {
            this.f49111c.f(iArr);
        }
        Bitmap bitmap = this.f49121m;
        if (bitmap != null) {
            this.f49111c.a(bitmap);
        }
        this.f49121m = null;
        this.f49112d = null;
        this.f49127s = null;
        byte[] bArr2 = this.f49113e;
        if (bArr2 != null) {
            this.f49111c.e(bArr2);
        }
    }

    @Override // p220m4.a
    public void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f49128t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p220m4.a
    public int e() {
        int i10;
        if (this.f49120l.f49093c <= 0 || (i10 = this.f49119k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // p220m4.a
    public void f() {
        this.f49119k = -1;
    }

    @Override // p220m4.a
    public int g() {
        return this.f49119k;
    }

    @Override // p220m4.a
    public int h() {
        return this.f49112d.limit() + this.f49117i.length + (this.f49118j.length * 4);
    }

    public int m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f49120l;
        if (i10 < cVar.f49093c) {
            return ((b) cVar.f49095e.get(i10)).f49088i;
        }
        return -1;
    }

    @Override // p220m4.a
    public ByteBuffer n() {
        return this.f49112d;
    }

    public synchronized void r(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f49123o = 0;
            this.f49120l = cVar;
            this.f49119k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f49112d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f49112d.order(ByteOrder.LITTLE_ENDIAN);
            this.f49122n = false;
            Iterator it = cVar.f49095e.iterator();
            while (it.hasNext()) {
                if (((b) it.next()).f49086g == 3) {
                    this.f49122n = true;
                    break;
                }
            }
            this.f49124p = iHighestOneBit;
            int i11 = cVar.f49096f;
            this.f49126r = i11 / iHighestOneBit;
            int i12 = cVar.f49097g;
            this.f49125q = i12 / iHighestOneBit;
            this.f49117i = this.f49111c.b(i11 * i12);
            this.f49118j = this.f49111c.d(this.f49126r * this.f49125q);
        } catch (Throwable th) {
            throw th;
        }
    }
}
