package Sg;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f11826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f11827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected i[] f11828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected i[] f11829d;

    public k(b bVar, i iVar) {
        this.f11826a = bVar;
        this.f11827b = iVar;
        b();
        a();
    }

    private void a() {
        int iF;
        int iG = this.f11827b.g();
        i[] iVarArr = new i[iG];
        int i10 = iG - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            iVarArr[i11] = new i(this.f11828c[i11]);
        }
        this.f11829d = new i[iG];
        while (i10 >= 0) {
            this.f11829d[i10] = new i(this.f11826a, i10);
            i10--;
        }
        for (int i12 = 0; i12 < iG; i12++) {
            if (iVarArr[i12].f(i12) == 0) {
                int i13 = i12 + 1;
                boolean z10 = false;
                while (i13 < iG) {
                    if (iVarArr[i13].f(i12) != 0) {
                        d(iVarArr, i12, i13);
                        d(this.f11829d, i12, i13);
                        i13 = iG;
                        z10 = true;
                    }
                    i13++;
                }
                if (!z10) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iF2 = this.f11826a.f(iVarArr[i12].f(i12));
            iVarArr[i12].m(iF2);
            this.f11829d[i12].m(iF2);
            for (int i14 = 0; i14 < iG; i14++) {
                if (i14 != i12 && (iF = iVarArr[i14].f(i12)) != 0) {
                    i iVarN = iVarArr[i12].n(iF);
                    i iVarN2 = this.f11829d[i12].n(iF);
                    iVarArr[i14].b(iVarN);
                    this.f11829d[i14].b(iVarN2);
                }
            }
        }
    }

    private void b() {
        int i10;
        int iG = this.f11827b.g();
        this.f11828c = new i[iG];
        int i11 = 0;
        while (true) {
            i10 = iG >> 1;
            if (i11 >= i10) {
                break;
            }
            int i12 = i11 << 1;
            int[] iArr = new int[i12 + 1];
            iArr[i12] = 1;
            this.f11828c[i11] = new i(this.f11826a, iArr);
            i11++;
        }
        while (i10 < iG) {
            int i13 = i10 << 1;
            int[] iArr2 = new int[i13 + 1];
            iArr2[i13] = 1;
            this.f11828c[i10] = new i(this.f11826a, iArr2).k(this.f11827b);
            i10++;
        }
    }

    private static void d(i[] iVarArr, int i10, int i11) {
        i iVar = iVarArr[i10];
        iVarArr[i10] = iVarArr[i11];
        iVarArr[i11] = iVar;
    }

    public i[] c() {
        return this.f11829d;
    }
}
