package p198l0;

import Ad.r;
import O0.y;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p019b0.e;
import p088ef.O;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p198l0.c f48552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p198l0.c f48553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Function0 f48554c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private O f48555d;

    static final class a extends o implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            return b.this.h();
        }
    }

    /* JADX INFO: renamed from: l0.b$b, reason: collision with other inner class name */
    static final class C0571b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f48557a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48559c;

        C0571b(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f48557a = obj;
            this.f48559c |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f48560a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48562c;

        c(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f48560a = obj;
            this.f48562c |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, Ed.b r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof p198l0.b.C0571b
            if (r0 == 0) goto L14
            r0 = r12
            l0.b$b r0 = (p198l0.b.C0571b) r0
            int r1 = r0.f48559c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f48559c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            l0.b$b r0 = new l0.b$b
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f48557a
            java.lang.Object r0 = Fd.b.e()
            int r1 = r6.f48559c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            Ad.r.b(r12)
            goto L71
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            Ad.r.b(r12)
            goto L52
        L3a:
            Ad.r.b(r12)
            l0.a r12 = r7.g()
            if (r12 != 0) goto L60
            l0.c r1 = r7.f48553b
            if (r1 == 0) goto L59
            r6.f48559c = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.a0(r2, r4, r6)
            if (r12 != r0) goto L52
            goto L70
        L52:
            O0.y r12 = (O0.y) r12
            long r8 = r12.l()
            goto L7e
        L59:
            O0.y$a r8 = O0.y.f8306b
            long r8 = r8.a()
            goto L7e
        L60:
            r4 = r10
            l0.a r1 = r7.g()
            if (r1 == 0) goto L78
            r6.f48559c = r2
            r2 = r8
            java.lang.Object r12 = r1.a0(r2, r4, r6)
            if (r12 != r0) goto L71
        L70:
            return r0
        L71:
            O0.y r12 = (O0.y) r12
            long r8 = r12.l()
            goto L7e
        L78:
            O0.y$a r8 = O0.y.f8306b
            long r8 = r8.a()
        L7e:
            O0.y r8 = O0.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p198l0.b.a(long, long, Ed.b):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        p198l0.a aVarG = g();
        return aVarG != null ? aVarG.v0(j10, j11, i10) : e.f25805b.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j10, Ed.b bVar) {
        c cVar;
        long jA;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f48562c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f48562c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objY0 = cVar.f48560a;
        Object objE = Fd.b.e();
        int i11 = cVar.f48562c;
        if (i11 == 0) {
            r.b(objY0);
            p198l0.a aVarG = g();
            if (aVarG != null) {
                cVar.f48562c = 1;
                objY0 = aVarG.Y0(j10, cVar);
                if (objY0 == objE) {
                    return objE;
                }
            } else {
                jA = y.f8306b.a();
            }
            return y.b(jA);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(objY0);
        jA = ((y) objY0).l();
        return y.b(jA);
    }

    public final long d(long j10, int i10) {
        p198l0.a aVarG = g();
        return aVarG != null ? aVarG.a1(j10, i10) : e.f25805b.c();
    }

    public final O e() {
        O o10 = (O) this.f48554c.invoke();
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final p198l0.c f() {
        return this.f48552a;
    }

    public final p198l0.a g() {
        p198l0.c cVar = this.f48552a;
        if (cVar != null) {
            return cVar.Z1();
        }
        return null;
    }

    public final O h() {
        return this.f48555d;
    }

    public final void i(Function0 function0) {
        this.f48554c = function0;
    }

    public final void j(p198l0.c cVar) {
        this.f48553b = cVar;
    }

    public final void k(p198l0.c cVar) {
        this.f48552a = cVar;
    }

    public final void l(O o10) {
        this.f48555d = o10;
    }
}
