package p308r2;

import U1.AbstractC1459a;
import U1.S;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f52039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f52043g;

    public g(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public g(boolean z10, int i10, int i11) {
        AbstractC1459a.a(i10 > 0);
        AbstractC1459a.a(i11 >= 0);
        this.f52037a = z10;
        this.f52038b = i10;
        this.f52042f = i11;
        this.f52043g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f52039c = null;
            return;
        }
        this.f52039c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f52043g[i12] = new a(this.f52039c, i12 * i10);
        }
    }

    @Override // p308r2.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f52043g;
        int i10 = this.f52042f;
        this.f52042f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f52041e--;
        notifyAll();
    }

    @Override // p308r2.b
    public synchronized a b() {
        a aVar;
        try {
            this.f52041e++;
            int i10 = this.f52042f;
            if (i10 > 0) {
                a[] aVarArr = this.f52043g;
                int i11 = i10 - 1;
                this.f52042f = i11;
                aVar = (a) AbstractC1459a.e(aVarArr[i11]);
                this.f52043g[this.f52042f] = null;
            } else {
                aVar = new a(new byte[this.f52038b], 0);
                int i12 = this.f52041e;
                a[] aVarArr2 = this.f52043g;
                if (i12 > aVarArr2.length) {
                    this.f52043g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    @Override // p308r2.b
    public synchronized void c(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f52043g;
                int i10 = this.f52042f;
                this.f52042f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f52041e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // p308r2.b
    public synchronized void d() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, S.k(this.f52040d, this.f52038b) - this.f52041e);
            int i11 = this.f52042f;
            if (iMax >= i11) {
                return;
            }
            if (this.f52039c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) AbstractC1459a.e(this.f52043g[i10]);
                    if (aVar.f52026a == this.f52039c) {
                        i10++;
                    } else {
                        a aVar2 = (a) AbstractC1459a.e(this.f52043g[i12]);
                        if (aVar2.f52026a != this.f52039c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f52043g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f52042f) {
                    return;
                }
            }
            Arrays.fill(this.f52043g, iMax, this.f52042f, (Object) null);
            this.f52042f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p308r2.b
    public int e() {
        return this.f52038b;
    }

    public synchronized int f() {
        return this.f52041e * this.f52038b;
    }

    public synchronized void g() {
        if (this.f52037a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f52040d;
        this.f52040d = i10;
        if (z10) {
            d();
        }
    }
}
