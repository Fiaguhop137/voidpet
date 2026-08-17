package T0;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends T0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f11879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f11880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f11882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f11883l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f11891c - iVar2.f11891c;
        }
    }

    class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f11885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f11886b;

        public b(h hVar) {
            this.f11886b = hVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f11885a.f11891c - ((i) obj).f11891c;
        }

        public boolean e(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f11885a.f11889a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f11897i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f11885a.f11897i[i10] = f12;
                    } else {
                        this.f11885a.f11897i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f11885a.f11897i;
                float f13 = fArr[i11] + (iVar.f11897i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f11885a.f11897i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f11885a);
            }
            return false;
        }

        public void g(i iVar) {
            this.f11885a = iVar;
        }

        public final boolean h() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f11885a.f11897i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i(i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f11897i[i10];
                float f11 = this.f11885a.f11897i[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void o() {
            Arrays.fill(this.f11885a.f11897i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f11885a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f11885a.f11897i[i10] + " ";
                }
            }
            return str + "] " + this.f11885a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f11878g = 128;
        this.f11879h = new i[128];
        this.f11880i = new i[128];
        this.f11881j = 0;
        this.f11882k = new b(this);
        this.f11883l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f11881j + 1;
        i[] iVarArr = this.f11879h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f11879h = iVarArr2;
            this.f11880i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f11879h;
        int i12 = this.f11881j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f11881j = i13;
        if (i13 > 1 && iVarArr3[i12].f11891c > iVar.f11891c) {
            int i14 = 0;
            while (true) {
                i10 = this.f11881j;
                if (i14 >= i10) {
                    break;
                }
                this.f11880i[i14] = this.f11879h[i14];
                i14++;
            }
            Arrays.sort(this.f11880i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f11881j; i15++) {
                this.f11879h[i15] = this.f11880i[i15];
            }
        }
        iVar.f11889a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f11881j) {
            if (this.f11879h[i10] == iVar) {
                while (true) {
                    int i11 = this.f11881j;
                    if (i10 >= i11 - 1) {
                        this.f11881j = i11 - 1;
                        iVar.f11889a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f11879h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // T0.b
    public void C(T0.b bVar, boolean z10) {
        i iVar = bVar.f11845a;
        if (iVar == null) {
            return;
        }
        T0.b.a aVar = bVar.f11849e;
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            i iVarB = aVar.b(i10);
            float fG = aVar.g(i10);
            this.f11882k.g(iVarB);
            if (this.f11882k.e(iVar, fG)) {
                F(iVarB);
            }
            this.f11846b += bVar.f11846b * fG;
        }
        G(iVar);
    }

    @Override // T0.b, T0.d.a
    public void b(i iVar) {
        this.f11882k.g(iVar);
        this.f11882k.o();
        iVar.f11897i[iVar.f11893e] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // T0.b, T0.d.a
    public i c(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f11881j; i11++) {
            i iVar = this.f11879h[i11];
            if (!zArr[iVar.f11891c]) {
                this.f11882k.g(iVar);
                if (i10 == -1) {
                    if (this.f11882k.h()) {
                        i10 = i11;
                    }
                } else if (this.f11882k.i(this.f11879h[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f11879h[i10];
    }

    @Override // T0.b, T0.d.a
    public void clear() {
        this.f11881j = 0;
        this.f11846b = 0.0f;
    }

    @Override // T0.b
    public String toString() {
        String str = " goal -> (" + this.f11846b + ") : ";
        for (int i10 = 0; i10 < this.f11881j; i10++) {
            this.f11882k.g(this.f11879h[i10]);
            str = str + this.f11882k + " ";
        }
        return str;
    }
}
