package p359u;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4219s f54949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC4218q f54950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC4218q f54951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC4218q f54952d;

    public static final class a implements InterfaceC4219s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4226z f54953a;

        a(InterfaceC4226z interfaceC4226z) {
            this.f54953a = interfaceC4226z;
        }

        @Override // p359u.InterfaceC4219s
        public InterfaceC4226z get(int i10) {
            return this.f54953a;
        }
    }

    public w0(InterfaceC4219s interfaceC4219s) {
        this.f54949a = interfaceC4219s;
    }

    public w0(InterfaceC4226z interfaceC4226z) {
        this(new a(interfaceC4226z));
    }

    @Override // p359u.s0
    public long b(AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        int iB = abstractC4218q.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f54949a.get(i10).e(abstractC4218q.a(i10), abstractC4218q2.a(i10), abstractC4218q3.a(i10)));
        }
        return jMax;
    }

    @Override // p359u.s0
    public AbstractC4218q e(AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        if (this.f54952d == null) {
            this.f54952d = r.g(abstractC4218q3);
        }
        AbstractC4218q abstractC4218q4 = this.f54952d;
        if (abstractC4218q4 == null) {
            Intrinsics.r("endVelocityVector");
            abstractC4218q4 = null;
        }
        int iB = abstractC4218q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC4218q abstractC4218q5 = this.f54952d;
            if (abstractC4218q5 == null) {
                Intrinsics.r("endVelocityVector");
                abstractC4218q5 = null;
            }
            abstractC4218q5.e(i10, this.f54949a.get(i10).b(abstractC4218q.a(i10), abstractC4218q2.a(i10), abstractC4218q3.a(i10)));
        }
        AbstractC4218q abstractC4218q6 = this.f54952d;
        if (abstractC4218q6 != null) {
            return abstractC4218q6;
        }
        Intrinsics.r("endVelocityVector");
        return null;
    }

    @Override // p359u.s0
    public AbstractC4218q f(long j10, AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        if (this.f54951c == null) {
            this.f54951c = r.g(abstractC4218q3);
        }
        AbstractC4218q abstractC4218q4 = this.f54951c;
        if (abstractC4218q4 == null) {
            Intrinsics.r("velocityVector");
            abstractC4218q4 = null;
        }
        int iB = abstractC4218q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC4218q abstractC4218q5 = this.f54951c;
            if (abstractC4218q5 == null) {
                Intrinsics.r("velocityVector");
                abstractC4218q5 = null;
            }
            abstractC4218q5.e(i10, this.f54949a.get(i10).d(j10, abstractC4218q.a(i10), abstractC4218q2.a(i10), abstractC4218q3.a(i10)));
        }
        AbstractC4218q abstractC4218q6 = this.f54951c;
        if (abstractC4218q6 != null) {
            return abstractC4218q6;
        }
        Intrinsics.r("velocityVector");
        return null;
    }

    @Override // p359u.s0
    public AbstractC4218q g(long j10, AbstractC4218q abstractC4218q, AbstractC4218q abstractC4218q2, AbstractC4218q abstractC4218q3) {
        if (this.f54950b == null) {
            this.f54950b = r.g(abstractC4218q);
        }
        AbstractC4218q abstractC4218q4 = this.f54950b;
        if (abstractC4218q4 == null) {
            Intrinsics.r("valueVector");
            abstractC4218q4 = null;
        }
        int iB = abstractC4218q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC4218q abstractC4218q5 = this.f54950b;
            if (abstractC4218q5 == null) {
                Intrinsics.r("valueVector");
                abstractC4218q5 = null;
            }
            abstractC4218q5.e(i10, this.f54949a.get(i10).c(j10, abstractC4218q.a(i10), abstractC4218q2.a(i10), abstractC4218q3.a(i10)));
        }
        AbstractC4218q abstractC4218q6 = this.f54950b;
        if (abstractC4218q6 != null) {
            return abstractC4218q6;
        }
        Intrinsics.r("valueVector");
        return null;
    }
}
