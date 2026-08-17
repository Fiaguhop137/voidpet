package D2;

import p380v2.A;
import p380v2.J;
import p380v2.K;
import p380v2.O;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f2131b;

    class a extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f2132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J j10, J j11) {
            super(j10);
            this.f2132b = j11;
        }

        @Override // p380v2.A, p380v2.J
        public J.a e(long j10) {
            J.a aVarE = this.f2132b.e(j10);
            K k10 = aVarE.f55970a;
            K k11 = new K(k10.f55975a, k10.f55976b + e.this.f2130a);
            K k12 = aVarE.f55971b;
            return new J.a(k11, new K(k12.f55975a, k12.f55976b + e.this.f2130a));
        }
    }

    public e(long j10, r rVar) {
        this.f2130a = j10;
        this.f2131b = rVar;
    }

    @Override // p380v2.r
    public O f(int i10, int i11) {
        return this.f2131b.f(i10, i11);
    }

    @Override // p380v2.r
    public void p(J j10) {
        this.f2131b.p(new a(j10, j10));
    }

    @Override // p380v2.r
    public void t() {
        this.f2131b.t();
    }
}
