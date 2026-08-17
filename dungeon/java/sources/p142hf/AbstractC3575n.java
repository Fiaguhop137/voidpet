package p142hf;

import Ad.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C;
import p177jf.l;

/* JADX INFO: renamed from: hf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3575n {

    /* JADX INFO: renamed from: hf.n$a */
    public static final class a implements InterfaceC3564c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3564c f42959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42960b;

        public a(InterfaceC3564c interfaceC3564c, int i10) {
            this.f42959a = interfaceC3564c;
            this.f42960b = i10;
        }

        @Override // p142hf.InterfaceC3564c
        public Object collect(InterfaceC3565d interfaceC3565d, Ed.b bVar) {
            Object objCollect = this.f42959a.collect(new b(new C(), this.f42960b, interfaceC3565d), bVar);
            return objCollect == Fd.b.e() ? objCollect : Unit.f48228a;
        }
    }

    /* JADX INFO: renamed from: hf.n$b */
    static final class b implements InterfaceC3565d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f42961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3565d f42963c;

        /* JADX INFO: renamed from: hf.n$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f42964a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f42966c;

            a(Ed.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f42964a = obj;
                this.f42966c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(C c10, int i10, InterfaceC3565d interfaceC3565d) {
            this.f42961a = c10;
            this.f42962b = i10;
            this.f42963c = interfaceC3565d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p142hf.InterfaceC3565d
        public final Object emit(Object obj, Ed.b bVar) {
            a aVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f42966c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f42966c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj2 = aVar.f42964a;
            Object objE = Fd.b.e();
            int i11 = aVar.f42966c;
            if (i11 == 0) {
                r.b(obj2);
                C c10 = this.f42961a;
                int i12 = c10.f48336a;
                if (i12 < this.f42962b) {
                    c10.f48336a = i12 + 1;
                    return Unit.f48228a;
                }
                InterfaceC3565d interfaceC3565d = this.f42963c;
                aVar.f42966c = 1;
                if (interfaceC3565d.emit(obj, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj2);
            }
            return Unit.f48228a;
        }
    }

    /* JADX INFO: renamed from: hf.n$c */
    public static final class c implements InterfaceC3564c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3564c f42967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f42968b;

        public c(InterfaceC3564c interfaceC3564c, Function2 function2) {
            this.f42967a = interfaceC3564c;
            this.f42968b = function2;
        }

        @Override // p142hf.InterfaceC3564c
        public Object collect(InterfaceC3565d interfaceC3565d, Ed.b bVar) {
            Object objCollect = this.f42967a.collect(new d(new A(), interfaceC3565d, this.f42968b), bVar);
            return objCollect == Fd.b.e() ? objCollect : Unit.f48228a;
        }
    }

    /* JADX INFO: renamed from: hf.n$d */
    static final class d implements InterfaceC3565d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ A f42969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3565d f42970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f42971c;

        /* JADX INFO: renamed from: hf.n$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f42972a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f42973b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f42974c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f42976e;

            a(Ed.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f42974c = obj;
                this.f42976e |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(A a10, InterfaceC3565d interfaceC3565d, Function2 function2) {
            this.f42969a = a10;
            this.f42970b = interfaceC3565d;
            this.f42971c = function2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        @Override // p142hf.InterfaceC3565d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, Ed.b r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p142hf.AbstractC3575n.d.a
                if (r0 == 0) goto L13
                r0 = r8
                hf.n$d$a r0 = (p142hf.AbstractC3575n.d.a) r0
                int r1 = r0.f42976e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f42976e = r1
                goto L18
            L13:
                hf.n$d$a r0 = new hf.n$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f42974c
                java.lang.Object r1 = Fd.b.e()
                int r2 = r0.f42976e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                Ad.r.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f42973b
                java.lang.Object r2 = r0.f42972a
                hf.n$d r2 = (p142hf.AbstractC3575n.d) r2
                Ad.r.b(r8)
                goto L6c
            L41:
                Ad.r.b(r8)
                goto L59
            L45:
                Ad.r.b(r8)
                kotlin.jvm.internal.A r8 = r6.f42969a
                boolean r8 = r8.f48334a
                if (r8 == 0) goto L5c
                hf.d r8 = r6.f42970b
                r0.f42976e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.Unit r7 = kotlin.Unit.f48228a
                return r7
            L5c:
                kotlin.jvm.functions.Function2 r8 = r6.f42971c
                r0.f42972a = r6
                r0.f42973b = r7
                r0.f42976e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.A r8 = r2.f42969a
                r8.f48334a = r5
                hf.d r8 = r2.f42970b
                r2 = 0
                r0.f42972a = r2
                r0.f42973b = r2
                r0.f42976e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.f48228a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.f48228a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p142hf.AbstractC3575n.d.emit(java.lang.Object, Ed.b):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hf.n$e */
    public static final class e implements InterfaceC3564c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3564c f42977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f42978b;

        /* JADX INFO: renamed from: hf.n$e$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f42979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f42980b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f42982d;

            public a(Ed.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f42979a = obj;
                this.f42980b |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(InterfaceC3564c interfaceC3564c, Function2 function2) {
            this.f42977a = interfaceC3564c;
            this.f42978b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p142hf.InterfaceC3564c
        public Object collect(InterfaceC3565d interfaceC3565d, Ed.b bVar) {
            a aVar;
            f fVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f42980b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f42980b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f42979a;
            Object objE = Fd.b.e();
            int i11 = aVar.f42980b;
            if (i11 == 0) {
                r.b(obj);
                InterfaceC3564c interfaceC3564c = this.f42977a;
                f fVar2 = new f(this.f42978b, interfaceC3565d);
                try {
                    aVar.f42982d = fVar2;
                    aVar.f42980b = 1;
                    if (interfaceC3564c.collect(fVar2, aVar) == objE) {
                        return objE;
                    }
                } catch (p177jf.a e10) {
                    e = e10;
                    fVar = fVar2;
                    l.a(e, fVar);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) aVar.f42982d;
                try {
                    r.b(obj);
                } catch (p177jf.a e11) {
                    e = e11;
                    l.a(e, fVar);
                }
            }
            return Unit.f48228a;
        }
    }

    /* JADX INFO: renamed from: hf.n$f */
    public static final class f implements InterfaceC3565d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f42983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3565d f42984b;

        /* JADX INFO: renamed from: hf.n$f$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f42985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f42986b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f42987c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f42989e;

            public a(Ed.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f42986b = obj;
                this.f42987c |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(Function2 function2, InterfaceC3565d interfaceC3565d) {
            this.f42983a = function2;
            this.f42984b = interfaceC3565d;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        @Override // p142hf.InterfaceC3565d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(java.lang.Object r8, Ed.b r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p142hf.AbstractC3575n.f.a
                if (r0 == 0) goto L13
                r0 = r9
                hf.n$f$a r0 = (p142hf.AbstractC3575n.f.a) r0
                int r1 = r0.f42987c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f42987c = r1
                goto L18
            L13:
                hf.n$f$a r0 = new hf.n$f$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f42986b
                java.lang.Object r1 = Fd.b.e()
                int r2 = r0.f42987c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f42985a
                hf.n$f r8 = (p142hf.AbstractC3575n.f) r8
                Ad.r.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f42989e
                java.lang.Object r2 = r0.f42985a
                hf.n$f r2 = (p142hf.AbstractC3575n.f) r2
                Ad.r.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                Ad.r.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f42983a
                r0.f42985a = r7
                r0.f42989e = r8
                r0.f42987c = r4
                r2 = 6
                kotlin.jvm.internal.AbstractC3976m.a(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.AbstractC3976m.a(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                hf.d r2 = r8.f42984b
                r0.f42985a = r8
                r5 = 0
                r0.f42989e = r5
                r0.f42987c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.f48228a
                return r8
            L81:
                jf.a r9 = new jf.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p142hf.AbstractC3575n.f.emit(java.lang.Object, Ed.b):java.lang.Object");
        }
    }

    public static final InterfaceC3564c a(InterfaceC3564c interfaceC3564c, int i10) {
        if (i10 >= 0) {
            return new a(interfaceC3564c, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final InterfaceC3564c b(InterfaceC3564c interfaceC3564c, Function2 function2) {
        return new c(interfaceC3564c, function2);
    }

    public static final InterfaceC3564c c(InterfaceC3564c interfaceC3564c, Function2 function2) {
        return new e(interfaceC3564c, function2);
    }
}
