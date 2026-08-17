package J0;

import I.A0;
import I.X1;
import I.d2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d2 f5666a;

    public static final class a extends androidx.emoji2.text.f.AbstractC0290f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ A0 f5667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f5668b;

        a(A0 a10, m mVar) {
            this.f5667a = a10;
            this.f5668b = mVar;
        }

        @Override // androidx.emoji2.text.f.AbstractC0290f
        public void a(Throwable th) {
            this.f5668b.f5666a = q.f5673a;
        }

        @Override // androidx.emoji2.text.f.AbstractC0290f
        public void b() {
            this.f5667a.setValue(Boolean.TRUE);
            this.f5668b.f5666a = new r(true);
        }
    }

    public m() {
        this.f5666a = androidx.emoji2.text.f.i() ? c() : null;
    }

    private final d2 c() {
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.e() == 1) {
            return new r(true);
        }
        A0 a0D = X1.d(Boolean.FALSE, null, 2, null);
        fVarC.t(new a(a0D, this));
        return a0D;
    }

    @Override // J0.p
    public d2 a() {
        d2 d2Var = this.f5666a;
        if (d2Var != null) {
            Intrinsics.c(d2Var);
            return d2Var;
        }
        if (!androidx.emoji2.text.f.i()) {
            return q.f5673a;
        }
        d2 d2VarC = c();
        this.f5666a = d2VarC;
        Intrinsics.c(d2VarC);
        return d2VarC;
    }
}
