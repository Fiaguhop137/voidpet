package p413x;

import Ad.r;
import O0.y;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p019b0.e;
import p088ef.AbstractC3293k;
import p088ef.O;
import p088ef.Q;
import p395w.t;
import p431y.k;

/* JADX INFO: loaded from: classes.dex */
public final class n extends i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private o f57146A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private r f57147B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f57148C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Md.n f57149D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Md.n f57150E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f57151F;

    static final class a extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f57152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f57153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f57154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f57155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, n nVar, Ed.b bVar) {
            super(2, bVar);
            this.f57154c = function2;
            this.f57155d = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(j jVar, n nVar, x.a.b bVar) {
            jVar.a(l.h(nVar.G2(bVar.a()), nVar.f57147B));
            return Unit.f48228a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            a aVar = new a(this.f57154c, this.f57155d, bVar);
            aVar.f57153b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f57152a;
            if (i10 == 0) {
                r.b(obj);
                j jVar = (j) this.f57153b;
                Function2 function2 = this.f57154c;
                m mVar = new m(jVar, this.f57155d);
                this.f57152a = 1;
                if (function2.invoke(mVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return Unit.f48228a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, Ed.b bVar) {
            return ((a) create(jVar, bVar)).invokeSuspend(Unit.f48228a);
        }
    }

    static final class b extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f57156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f57157b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f57159d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Ed.b bVar) {
            super(2, bVar);
            this.f57159d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            b bVar2 = n.this.new b(this.f57159d, bVar);
            bVar2.f57157b = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((b) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f57156a;
            if (i10 == 0) {
                r.b(obj);
                O o10 = (O) this.f57157b;
                Md.n nVar = n.this.f57149D;
                e eVarD = e.d(this.f57159d);
                this.f57156a = 1;
                if (nVar.invoke(o10, eVarD, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return Unit.f48228a;
        }
    }

    static final class c extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f57160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f57161b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f57163d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, Ed.b bVar) {
            super(2, bVar);
            this.f57163d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            c cVar = n.this.new c(this.f57163d, bVar);
            cVar.f57161b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((c) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f57160a;
            if (i10 == 0) {
                r.b(obj);
                O o10 = (O) this.f57161b;
                Md.n nVar = n.this.f57150E;
                Float fC = kotlin.coroutines.jvm.internal.b.c(l.i(n.this.F2(this.f57163d), n.this.f57147B));
                this.f57160a = 1;
                if (nVar.invoke(o10, fC, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return Unit.f48228a;
        }
    }

    public n(o oVar, Function1 function1, r rVar, boolean z10, k kVar, boolean z11, Md.n nVar, Md.n nVar2, boolean z12) {
        super(function1, z10, kVar, rVar);
        this.f57146A = oVar;
        this.f57147B = rVar;
        this.f57148C = z11;
        this.f57149D = nVar;
        this.f57150E = nVar2;
        this.f57151F = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long F2(long j10) {
        return y.j(j10, this.f57151F ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long G2(long j10) {
        return e.r(j10, this.f57151F ? -1.0f : 1.0f);
    }

    public final void H2(o oVar, Function1 function1, r rVar, boolean z10, k kVar, boolean z11, Md.n nVar, Md.n nVar2, boolean z12) {
        boolean z13;
        boolean z14 = true;
        if (Intrinsics.b(this.f57146A, oVar)) {
            z13 = false;
        } else {
            this.f57146A = oVar;
            z13 = true;
        }
        if (this.f57147B != rVar) {
            this.f57147B = rVar;
            z13 = true;
        }
        if (this.f57151F != z12) {
            this.f57151F = z12;
        } else {
            z14 = z13;
        }
        this.f57149D = nVar;
        this.f57150E = nVar2;
        this.f57148C = z11;
        z2(function1, z10, kVar, rVar, z14);
    }

    @Override // p413x.i
    public Object p2(Function2 function2, Ed.b bVar) {
        Object objA = this.f57146A.a(t.UserInput, new a(function2, this, null), bVar);
        return objA == Fd.b.e() ? objA : Unit.f48228a;
    }

    @Override // p413x.i
    public void s2(long j10) {
        if (!D1() || Intrinsics.b(this.f57149D, l.f57140a)) {
            return;
        }
        AbstractC3293k.d(w1(), null, Q.UNDISPATCHED, new b(j10, null), 1, null);
    }

    @Override // p413x.i
    public void t2(long j10) {
        if (!D1() || Intrinsics.b(this.f57150E, l.f57141b)) {
            return;
        }
        AbstractC3293k.d(w1(), null, Q.UNDISPATCHED, new c(j10, null), 1, null);
    }

    @Override // p413x.i
    public boolean x2() {
        return this.f57148C;
    }
}
