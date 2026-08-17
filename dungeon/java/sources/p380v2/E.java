package p380v2;

import U1.AbstractC1459a;
import U1.S;
import U1.u;

/* JADX INFO: loaded from: classes.dex */
public final class E implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f55952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f55953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f55954c;

    public E(long[] jArr, long[] jArr2, long j10) {
        AbstractC1459a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f55952a = new u(length);
            this.f55953b = new u(length);
        } else {
            int i10 = length + 1;
            u uVar = new u(i10);
            this.f55952a = uVar;
            u uVar2 = new u(i10);
            this.f55953b = uVar2;
            uVar.a(0L);
            uVar2.a(0L);
        }
        this.f55952a.b(jArr);
        this.f55953b.b(jArr2);
        this.f55954c = j10;
    }

    public void a(long j10, long j11) {
        if (this.f55953b.d() == 0 && j10 > 0) {
            this.f55952a.a(0L);
            this.f55953b.a(0L);
        }
        this.f55952a.a(j11);
        this.f55953b.a(j10);
    }

    public boolean b(long j10, long j11) {
        if (this.f55953b.d() == 0) {
            return false;
        }
        u uVar = this.f55953b;
        return j10 - uVar.c(uVar.d() - 1) < j11;
    }

    public long c(long j10) {
        if (this.f55953b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f55953b.c(S.e(this.f55952a, j10, true, true));
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        if (this.f55953b.d() == 0) {
            return new J.a(K.f55974c);
        }
        int iE = S.e(this.f55953b, j10, true, true);
        K k10 = new K(this.f55953b.c(iE), this.f55952a.c(iE));
        if (k10.f55975a == j10 || iE == this.f55953b.d() - 1) {
            return new J.a(k10);
        }
        int i10 = iE + 1;
        return new J.a(k10, new K(this.f55953b.c(i10), this.f55952a.c(i10)));
    }

    public void f(long j10) {
        this.f55954c = j10;
    }

    @Override // p380v2.J
    public boolean i() {
        return this.f55953b.d() > 0;
    }

    @Override // p380v2.J
    public long m() {
        return this.f55954c;
    }
}
