package T0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f11909n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11910a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11911b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11912c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f11913d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f11914e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f11915f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f11916g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f11917h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f11918i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f11919j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f11920k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f11921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f11922m;

    j(b bVar, c cVar) {
        this.f11921l = bVar;
        this.f11922m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f11891c % this.f11912c;
        int[] iArr2 = this.f11913d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f11914e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f11914e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f11915f[i10] = iVar.f11891c;
        this.f11916g[i10] = f10;
        this.f11917h[i10] = -1;
        this.f11918i[i10] = -1;
        iVar.a(this.f11921l);
        iVar.f11901m++;
        this.f11919j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f11911b; i10++) {
            if (this.f11915f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f11911b * 2;
        this.f11915f = Arrays.copyOf(this.f11915f, i10);
        this.f11916g = Arrays.copyOf(this.f11916g, i10);
        this.f11917h = Arrays.copyOf(this.f11917h, i10);
        this.f11918i = Arrays.copyOf(this.f11918i, i10);
        this.f11914e = Arrays.copyOf(this.f11914e, i10);
        for (int i11 = this.f11911b; i11 < i10; i11++) {
            this.f11915f[i11] = -1;
            this.f11914e[i11] = -1;
        }
        this.f11911b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f11917h[iN] = i10;
            int[] iArr = this.f11918i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f11917h[iN] = -1;
            if (this.f11919j > 0) {
                this.f11918i[iN] = this.f11920k;
                this.f11920k = iN;
            } else {
                this.f11918i[iN] = -1;
            }
        }
        int i11 = this.f11918i[iN];
        if (i11 != -1) {
            this.f11917h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f11891c;
        int i12 = i11 % this.f11912c;
        int[] iArr2 = this.f11913d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f11915f[i13] == i11) {
            int[] iArr3 = this.f11914e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f11914e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f11915f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f11915f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // T0.b.a
    public void a(i iVar, float f10) {
        float f11 = f11909n;
        if (f10 > (-f11) && f10 < f11) {
            d(iVar, true);
            return;
        }
        if (this.f11919j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f11920k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f11916g[iP] = f10;
            return;
        }
        if (this.f11919j + 1 >= this.f11911b) {
            o();
        }
        int i10 = this.f11919j;
        int i11 = this.f11920k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f11915f[i11];
            int i15 = iVar.f11891c;
            if (i14 == i15) {
                this.f11916g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f11918i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // T0.b.a
    public i b(int i10) {
        int i11 = this.f11919j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f11920k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f11922m.f11854d[this.f11915f[i12]];
            }
            i12 = this.f11918i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // T0.b.a
    public void c() {
        int i10 = this.f11919j;
        int i11 = this.f11920k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f11916g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f11918i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // T0.b.a
    public void clear() {
        int i10 = this.f11919j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                iVarB.c(this.f11921l);
            }
        }
        for (int i12 = 0; i12 < this.f11911b; i12++) {
            this.f11915f[i12] = -1;
            this.f11914e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f11912c; i13++) {
            this.f11913d[i13] = -1;
        }
        this.f11919j = 0;
        this.f11920k = -1;
    }

    @Override // T0.b.a
    public float d(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f11916g[iP];
        if (this.f11920k == iP) {
            this.f11920k = this.f11918i[iP];
        }
        this.f11915f[iP] = -1;
        int[] iArr = this.f11917h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f11918i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f11918i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f11919j--;
        iVar.f11901m--;
        if (z10) {
            iVar.c(this.f11921l);
        }
        return f10;
    }

    @Override // T0.b.a
    public void e(i iVar, float f10, boolean z10) {
        float f11 = f11909n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                a(iVar, f10);
                return;
            }
            float[] fArr = this.f11916g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f11909n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            d(iVar, z10);
        }
    }

    @Override // T0.b.a
    public int f() {
        return this.f11919j;
    }

    @Override // T0.b.a
    public float g(int i10) {
        int i11 = this.f11919j;
        int i12 = this.f11920k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f11916g[i12];
            }
            i12 = this.f11918i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // T0.b.a
    public boolean h(i iVar) {
        return p(iVar) != -1;
    }

    @Override // T0.b.a
    public float i(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f11916g[iP];
        }
        return 0.0f;
    }

    @Override // T0.b.a
    public float j(b bVar, boolean z10) {
        float fI = i(bVar.f11845a);
        d(bVar.f11845a, z10);
        j jVar = (j) bVar.f11849e;
        int iF = jVar.f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iF) {
            int i12 = jVar.f11915f[i11];
            if (i12 != -1) {
                e(this.f11922m.f11854d[i12], jVar.f11916g[i11] * fI, z10);
                i10++;
            }
            i11++;
        }
        return fI;
    }

    @Override // T0.b.a
    public void k(float f10) {
        int i10 = this.f11919j;
        int i11 = this.f11920k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f11916g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f11918i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f11919j == 0) {
            return -1;
        }
        int i10 = iVar.f11891c;
        int i11 = this.f11913d[i10 % this.f11912c];
        if (i11 == -1) {
            return -1;
        }
        if (this.f11915f[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f11914e[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f11915f[i11] != i10);
        if (i11 != -1 && this.f11915f[i11] == i10) {
            return i11;
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f11919j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarB = b(i11);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + g(i11) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                String str4 = (this.f11917h[iP] != -1 ? str3 + this.f11922m.f11854d[this.f11915f[this.f11917h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f11918i[iP] != -1 ? str4 + this.f11922m.f11854d[this.f11915f[this.f11918i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
