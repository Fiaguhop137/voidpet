package T0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f11833l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f11835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f11836c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f11834a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11837d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f11838e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f11839f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f11840g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f11841h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11842i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11843j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11844k = false;

    a(b bVar, c cVar) {
        this.f11835b = bVar;
        this.f11836c = cVar;
    }

    @Override // T0.b.a
    public final void a(i iVar, float f10) {
        if (f10 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i10 = this.f11842i;
        if (i10 == -1) {
            this.f11842i = 0;
            this.f11841h[0] = f10;
            this.f11839f[0] = iVar.f11891c;
            this.f11840g[0] = -1;
            iVar.f11901m++;
            iVar.a(this.f11835b);
            this.f11834a++;
            if (this.f11844k) {
                return;
            }
            int i11 = this.f11843j + 1;
            this.f11843j = i11;
            int[] iArr = this.f11839f;
            if (i11 >= iArr.length) {
                this.f11844k = true;
                this.f11843j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f11834a; i13++) {
            int i14 = this.f11839f[i10];
            int i15 = iVar.f11891c;
            if (i14 == i15) {
                this.f11841h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f11840g[i10];
        }
        int length = this.f11843j;
        int i16 = length + 1;
        if (this.f11844k) {
            int[] iArr2 = this.f11839f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f11839f;
        if (length >= iArr3.length && this.f11834a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f11839f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f11839f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f11837d * 2;
            this.f11837d = i18;
            this.f11844k = false;
            this.f11843j = length - 1;
            this.f11841h = Arrays.copyOf(this.f11841h, i18);
            this.f11839f = Arrays.copyOf(this.f11839f, this.f11837d);
            this.f11840g = Arrays.copyOf(this.f11840g, this.f11837d);
        }
        this.f11839f[length] = iVar.f11891c;
        this.f11841h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f11840g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f11840g[length] = this.f11842i;
            this.f11842i = length;
        }
        iVar.f11901m++;
        iVar.a(this.f11835b);
        int i19 = this.f11834a + 1;
        this.f11834a = i19;
        if (!this.f11844k) {
            this.f11843j++;
        }
        int[] iArr7 = this.f11839f;
        if (i19 >= iArr7.length) {
            this.f11844k = true;
        }
        if (this.f11843j >= iArr7.length) {
            this.f11844k = true;
            this.f11843j = iArr7.length - 1;
        }
    }

    @Override // T0.b.a
    public i b(int i10) {
        int i11 = this.f11842i;
        for (int i12 = 0; i11 != -1 && i12 < this.f11834a; i12++) {
            if (i12 == i10) {
                return this.f11836c.f11854d[this.f11839f[i11]];
            }
            i11 = this.f11840g[i11];
        }
        return null;
    }

    @Override // T0.b.a
    public void c() {
        int i10 = this.f11842i;
        for (int i11 = 0; i10 != -1 && i11 < this.f11834a; i11++) {
            float[] fArr = this.f11841h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f11840g[i10];
        }
    }

    @Override // T0.b.a
    public final void clear() {
        int i10 = this.f11842i;
        for (int i11 = 0; i10 != -1 && i11 < this.f11834a; i11++) {
            i iVar = this.f11836c.f11854d[this.f11839f[i10]];
            if (iVar != null) {
                iVar.c(this.f11835b);
            }
            i10 = this.f11840g[i10];
        }
        this.f11842i = -1;
        this.f11843j = -1;
        this.f11844k = false;
        this.f11834a = 0;
    }

    @Override // T0.b.a
    public final float d(i iVar, boolean z10) {
        if (this.f11838e == iVar) {
            this.f11838e = null;
        }
        int i10 = this.f11842i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f11834a) {
            if (this.f11839f[i10] == iVar.f11891c) {
                if (i10 == this.f11842i) {
                    this.f11842i = this.f11840g[i10];
                } else {
                    int[] iArr = this.f11840g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.c(this.f11835b);
                }
                iVar.f11901m--;
                this.f11834a--;
                this.f11839f[i10] = -1;
                if (this.f11844k) {
                    this.f11843j = i10;
                }
                return this.f11841h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f11840g[i10];
        }
        return 0.0f;
    }

    @Override // T0.b.a
    public void e(i iVar, float f10, boolean z10) {
        float f11 = f11833l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f11842i;
            if (i10 == -1) {
                this.f11842i = 0;
                this.f11841h[0] = f10;
                this.f11839f[0] = iVar.f11891c;
                this.f11840g[0] = -1;
                iVar.f11901m++;
                iVar.a(this.f11835b);
                this.f11834a++;
                if (this.f11844k) {
                    return;
                }
                int i11 = this.f11843j + 1;
                this.f11843j = i11;
                int[] iArr = this.f11839f;
                if (i11 >= iArr.length) {
                    this.f11844k = true;
                    this.f11843j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f11834a; i13++) {
                int i14 = this.f11839f[i10];
                int i15 = iVar.f11891c;
                if (i14 == i15) {
                    float[] fArr = this.f11841h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f11833l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f11842i) {
                            this.f11842i = this.f11840g[i10];
                        } else {
                            int[] iArr2 = this.f11840g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.c(this.f11835b);
                        }
                        if (this.f11844k) {
                            this.f11843j = i10;
                        }
                        iVar.f11901m--;
                        this.f11834a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f11840g[i10];
            }
            int length = this.f11843j;
            int i16 = length + 1;
            if (this.f11844k) {
                int[] iArr3 = this.f11839f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f11839f;
            if (length >= iArr4.length && this.f11834a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f11839f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f11839f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f11837d * 2;
                this.f11837d = i18;
                this.f11844k = false;
                this.f11843j = length - 1;
                this.f11841h = Arrays.copyOf(this.f11841h, i18);
                this.f11839f = Arrays.copyOf(this.f11839f, this.f11837d);
                this.f11840g = Arrays.copyOf(this.f11840g, this.f11837d);
            }
            this.f11839f[length] = iVar.f11891c;
            this.f11841h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f11840g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f11840g[length] = this.f11842i;
                this.f11842i = length;
            }
            iVar.f11901m++;
            iVar.a(this.f11835b);
            this.f11834a++;
            if (!this.f11844k) {
                this.f11843j++;
            }
            int i19 = this.f11843j;
            int[] iArr8 = this.f11839f;
            if (i19 >= iArr8.length) {
                this.f11844k = true;
                this.f11843j = iArr8.length - 1;
            }
        }
    }

    @Override // T0.b.a
    public int f() {
        return this.f11834a;
    }

    @Override // T0.b.a
    public float g(int i10) {
        int i11 = this.f11842i;
        for (int i12 = 0; i11 != -1 && i12 < this.f11834a; i12++) {
            if (i12 == i10) {
                return this.f11841h[i11];
            }
            i11 = this.f11840g[i11];
        }
        return 0.0f;
    }

    @Override // T0.b.a
    public boolean h(i iVar) {
        int i10 = this.f11842i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f11834a; i11++) {
            if (this.f11839f[i10] == iVar.f11891c) {
                return true;
            }
            i10 = this.f11840g[i10];
        }
        return false;
    }

    @Override // T0.b.a
    public final float i(i iVar) {
        int i10 = this.f11842i;
        for (int i11 = 0; i10 != -1 && i11 < this.f11834a; i11++) {
            if (this.f11839f[i10] == iVar.f11891c) {
                return this.f11841h[i10];
            }
            i10 = this.f11840g[i10];
        }
        return 0.0f;
    }

    @Override // T0.b.a
    public float j(b bVar, boolean z10) {
        float fI = i(bVar.f11845a);
        d(bVar.f11845a, z10);
        b.a aVar = bVar.f11849e;
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            i iVarB = aVar.b(i10);
            e(iVarB, aVar.i(iVarB) * fI, z10);
        }
        return fI;
    }

    @Override // T0.b.a
    public void k(float f10) {
        int i10 = this.f11842i;
        for (int i11 = 0; i10 != -1 && i11 < this.f11834a; i11++) {
            float[] fArr = this.f11841h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f11840g[i10];
        }
    }

    public String toString() {
        int i10 = this.f11842i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f11834a; i11++) {
            str = ((str + " -> ") + this.f11841h[i10] + " : ") + this.f11836c.f11854d[this.f11839f[i10]];
            i10 = this.f11840g[i10];
        }
        return str;
    }
}
