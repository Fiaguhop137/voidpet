package Z1;

import R1.C1341a;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p236n2.AbstractC4025w;

/* JADX INFO: loaded from: classes.dex */
final class s1 extends AbstractC1667a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f18477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f18478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f18479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f18480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final R1.F[] f18481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f18482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f18483n;

    class a extends AbstractC4025w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final R1.F.c f18484f;

        a(R1.F f10) {
            super(f10);
            this.f18484f = new R1.F.c();
        }

        @Override // p236n2.AbstractC4025w, R1.F
        public R1.F.b g(int i10, R1.F.b bVar, boolean z10) {
            R1.F.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f9924c, this.f18484f).f()) {
                bVarG.t(bVar.f9922a, bVar.f9923b, bVar.f9924c, bVar.f9925d, bVar.f9926e, C1341a.f10098g, true);
                return bVarG;
            }
            bVarG.f9927f = true;
            return bVarG;
        }
    }

    public s1(Collection collection, p236n2.e0 e0Var) {
        this(G(collection), H(collection), e0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private s1(R1.F[] fArr, Object[] objArr, p236n2.e0 e0Var) {
        super(false, e0Var);
        int i10 = 0;
        int length = fArr.length;
        this.f18481l = fArr;
        this.f18479j = new int[length];
        this.f18480k = new int[length];
        this.f18482m = objArr;
        this.f18483n = new HashMap();
        int length2 = fArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            R1.F f10 = fArr[i10];
            this.f18481l[i12] = f10;
            this.f18480k[i12] = iP;
            this.f18479j[i12] = i11;
            iP += f10.p();
            i11 += this.f18481l[i12].i();
            this.f18483n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f18477h = iP;
        this.f18478i = i11;
    }

    private static R1.F[] G(Collection collection) {
        R1.F[] fArr = new R1.F[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((InterfaceC1669a1) it.next()).b();
            i10++;
        }
        return fArr;
    }

    private static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((InterfaceC1669a1) it.next()).a();
            i10++;
        }
        return objArr;
    }

    @Override // Z1.AbstractC1667a
    protected int A(int i10) {
        return this.f18480k[i10];
    }

    @Override // Z1.AbstractC1667a
    protected R1.F D(int i10) {
        return this.f18481l[i10];
    }

    public s1 E(p236n2.e0 e0Var) {
        R1.F[] fArr = new R1.F[this.f18481l.length];
        int i10 = 0;
        while (true) {
            R1.F[] fArr2 = this.f18481l;
            if (i10 >= fArr2.length) {
                return new s1(fArr, this.f18482m, e0Var);
            }
            fArr[i10] = new a(fArr2[i10]);
            i10++;
        }
    }

    List F() {
        return Arrays.asList(this.f18481l);
    }

    @Override // R1.F
    public int i() {
        return this.f18478i;
    }

    @Override // R1.F
    public int p() {
        return this.f18477h;
    }

    @Override // Z1.AbstractC1667a
    protected int s(Object obj) {
        Integer num = (Integer) this.f18483n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // Z1.AbstractC1667a
    protected int t(int i10) {
        return U1.S.g(this.f18479j, i10 + 1, false, false);
    }

    @Override // Z1.AbstractC1667a
    protected int u(int i10) {
        return U1.S.g(this.f18480k, i10 + 1, false, false);
    }

    @Override // Z1.AbstractC1667a
    protected Object x(int i10) {
        return this.f18482m[i10];
    }

    @Override // Z1.AbstractC1667a
    protected int z(int i10) {
        return this.f18479j[i10];
    }
}
