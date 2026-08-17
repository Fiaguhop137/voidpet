package p413x;

import Ad.r;
import O0.d;
import kotlin.Unit;
import p267of.g;

/* JADX INFO: loaded from: classes.dex */
public final class t implements s, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f57179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p267of.a f57182d = g.a(false);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f57183a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57185c;

        a(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57183a = obj;
            this.f57185c |= Integer.MIN_VALUE;
            return t.this.p(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f57186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57188c;

        b(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57186a = obj;
            this.f57188c |= Integer.MIN_VALUE;
            return t.this.N0(this);
        }
    }

    public t(d dVar) {
        this.f57179a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p413x.s
    public Object N0(Ed.b bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f57188c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f57188c = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f57186a;
        Object objE = Fd.b.e();
        int i11 = bVar2.f57188c;
        if (i11 == 0) {
            r.b(obj);
            if (!this.f57180b && !this.f57181c) {
                p267of.a aVar = this.f57182d;
                bVar2.f57188c = 1;
                if (p267of.a.C0602a.a(aVar, null, bVar2, 1, null) == objE) {
                    return objE;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(this.f57180b);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        p267of.a.C0602a.c(this.f57182d, null, 1, null);
        return kotlin.coroutines.jvm.internal.b.a(this.f57180b);
    }

    @Override // O0.l
    public long P(float f10) {
        return this.f57179a.P(f10);
    }

    @Override // O0.l
    public float S(long j10) {
        return this.f57179a.S(j10);
    }

    @Override // O0.d
    public float V0(int i10) {
        return this.f57179a.V0(i10);
    }

    @Override // O0.d
    public float W0(float f10) {
        return this.f57179a.W0(f10);
    }

    public final void a() {
        this.f57181c = true;
        if (this.f57182d.d()) {
            p267of.a.C0602a.c(this.f57182d, null, 1, null);
        }
    }

    @Override // O0.d
    public long b0(float f10) {
        return this.f57179a.b0(f10);
    }

    @Override // O0.l
    public float b1() {
        return this.f57179a.b1();
    }

    public final void e() {
        this.f57180b = true;
        if (this.f57182d.d()) {
            p267of.a.C0602a.c(this.f57182d, null, 1, null);
        }
    }

    @Override // O0.d
    public float e1(float f10) {
        return this.f57179a.e1(f10);
    }

    @Override // O0.d
    public float getDensity() {
        return this.f57179a.getDensity();
    }

    @Override // O0.d
    public long n1(long j10) {
        return this.f57179a.n1(j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(Ed.b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f57185c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f57185c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f57183a;
        Object objE = Fd.b.e();
        int i11 = aVar.f57185c;
        if (i11 == 0) {
            r.b(obj);
            p267of.a aVar2 = this.f57182d;
            aVar.f57185c = 1;
            if (p267of.a.C0602a.a(aVar2, null, aVar, 1, null) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
        }
        this.f57180b = false;
        this.f57181c = false;
        return Unit.f48228a;
    }

    @Override // O0.d
    public int q0(float f10) {
        return this.f57179a.q0(f10);
    }

    @Override // O0.d
    public float w0(long j10) {
        return this.f57179a.w0(j10);
    }
}
