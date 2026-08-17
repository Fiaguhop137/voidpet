package p359u;

import Ad.r;
import Ed.b;
import I.AbstractC1075t0;
import V.m;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C3971h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f54820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f54821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f54822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f54823d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f54824e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f54825f;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54824e = obj;
            this.f54825f |= Integer.MIN_VALUE;
            return U.i(null, null, 0L, null, this);
        }
    }

    public static final Object h(float f10, float f11, float f12, InterfaceC4210i interfaceC4210i, Function2 function2, b bVar) {
        Object objJ = j(r0.M(C3971h.f48366a), kotlin.coroutines.jvm.internal.b.c(f10), kotlin.coroutines.jvm.internal.b.c(f11), kotlin.coroutines.jvm.internal.b.c(f12), interfaceC4210i, function2, bVar);
        return objJ == Fd.b.e() ? objJ : Unit.f48228a;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object i(C4212k c4212k, InterfaceC4205d interfaceC4205d, long j10, Function1 function1, b bVar) {
        a aVar;
        E e10;
        C4212k c4212k2;
        C4212k c4212k3;
        E e11;
        Function1 function2;
        C4209h c4209h;
        C4209h c4209h2;
        P p10;
        InterfaceC4205d interfaceC4205d2 = interfaceC4205d;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f54825f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f54825f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f54824e;
        Object objE = Fd.b.e();
        int i11 = aVar2.f54825f;
        if (i11 == 0) {
            r.b(obj);
            Object objF = interfaceC4205d2.f(0L);
            AbstractC4218q abstractC4218qB = interfaceC4205d2.b(0L);
            e10 = new E();
            if (j10 == Long.MIN_VALUE) {
                try {
                    c4212k2 = c4212k;
                    try {
                        N n10 = new N(e10, objF, interfaceC4205d2, abstractC4218qB, c4212k2, v(aVar2.getContext()), function1);
                        e11 = e10;
                        try {
                            aVar2.f54820a = c4212k2;
                            aVar2.f54821b = interfaceC4205d2;
                            aVar2.f54822c = function1;
                            aVar2.f54823d = e11;
                            aVar2.f54825f = 1;
                            if (r(interfaceC4205d2, n10, aVar2) != objE) {
                                c4212k3 = c4212k2;
                                function2 = function1;
                                e10 = e11;
                            }
                            return objE;
                        } catch (CancellationException e12) {
                            e = e12;
                            c4212k3 = c4212k2;
                            e10 = e11;
                            c4209h = (C4209h) e10.f48338a;
                            if (c4209h != null) {
                                c4209h.j(false);
                            }
                            c4209h2 = (C4209h) e10.f48338a;
                            if (c4209h2 != null && c4209h2.c() == c4212k3.b()) {
                                c4212k3.n(false);
                            }
                            throw e;
                        }
                    } catch (CancellationException e13) {
                        e = e13;
                        c4212k3 = c4212k2;
                        c4209h = (C4209h) e10.f48338a;
                        if (c4209h != null) {
                            c4209h.j(false);
                        }
                        c4209h2 = (C4209h) e10.f48338a;
                        if (c4209h2 != null) {
                            c4212k3.n(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e14) {
                    e = e14;
                    c4212k2 = c4212k;
                }
            } else {
                e11 = e10;
                try {
                    C4209h c4209h3 = new C4209h(objF, interfaceC4205d2.e(), abstractC4218qB, j10, interfaceC4205d2.g(), j10, true, new O(c4212k));
                    u(c4209h3, j10, v(aVar2.getContext()), interfaceC4205d2, c4212k, function1);
                    e11.f48338a = c4209h3;
                    c4212k3 = c4212k;
                    interfaceC4205d2 = interfaceC4205d;
                    function2 = function1;
                    e10 = e11;
                } catch (CancellationException e15) {
                    e = e15;
                    c4212k3 = c4212k;
                    e10 = e11;
                    c4209h = (C4209h) e10.f48338a;
                    if (c4209h != null) {
                        c4209h.j(false);
                    }
                    c4209h2 = (C4209h) e10.f48338a;
                    if (c4209h2 != null) {
                        c4212k3.n(false);
                    }
                    throw e;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e10 = (E) aVar2.f54823d;
            function2 = (Function1) aVar2.f54822c;
            interfaceC4205d2 = (InterfaceC4205d) aVar2.f54821b;
            c4212k3 = (C4212k) aVar2.f54820a;
            try {
                r.b(obj);
            } catch (CancellationException e16) {
                e = e16;
                c4209h = (C4209h) e10.f48338a;
                if (c4209h != null) {
                    c4209h.j(false);
                }
                c4209h2 = (C4209h) e10.f48338a;
                if (c4209h2 != null) {
                    c4212k3.n(false);
                }
                throw e;
            }
        }
        do {
            Object obj2 = e10.f48338a;
            Intrinsics.c(obj2);
            if (!((C4209h) obj2).g()) {
                return Unit.f48228a;
            }
            E e17 = e10;
            Function1 function3 = function2;
            InterfaceC4205d interfaceC4205d3 = interfaceC4205d2;
            C4212k c4212k4 = c4212k3;
            try {
                p10 = new P(e17, v(aVar2.getContext()), interfaceC4205d3, c4212k4, function3);
                e10 = e17;
                interfaceC4205d2 = interfaceC4205d3;
                c4212k3 = c4212k4;
                function2 = function3;
                aVar2.f54820a = c4212k3;
                aVar2.f54821b = interfaceC4205d2;
                aVar2.f54822c = function2;
                aVar2.f54823d = e10;
                aVar2.f54825f = 2;
            } catch (CancellationException e18) {
                e = e18;
                e10 = e17;
                c4212k3 = c4212k4;
                c4209h = (C4209h) e10.f48338a;
                if (c4209h != null) {
                    c4209h.j(false);
                }
                c4209h2 = (C4209h) e10.f48338a;
                if (c4209h2 != null) {
                    c4212k3.n(false);
                }
                throw e;
            }
        } while (r(interfaceC4205d2, p10, aVar2) != objE);
        return objE;
    }

    public static final Object j(X x10, Object obj, Object obj2, Object obj3, InterfaceC4210i interfaceC4210i, Function2 function2, b bVar) {
        AbstractC4218q abstractC4218qG;
        if (obj3 == null || (abstractC4218qG = (AbstractC4218q) x10.a().invoke(obj3)) == null) {
            abstractC4218qG = r.g((AbstractC4218q) x10.a().invoke(obj));
        }
        AbstractC4218q abstractC4218q = abstractC4218qG;
        Object objK = k(new C4212k(x10, obj, abstractC4218q, 0L, 0L, false, 56, null), new V(interfaceC4210i, x10, obj, obj2, abstractC4218q), 0L, new M(function2, x10), bVar, 2, null);
        return objK == Fd.b.e() ? objK : Unit.f48228a;
    }

    public static /* synthetic */ Object k(C4212k c4212k, InterfaceC4205d interfaceC4205d, long j10, Function1 function1, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = new Q();
        }
        return i(c4212k, interfaceC4205d, j11, function1, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(E e10, float f10, InterfaceC4205d interfaceC4205d, C4212k c4212k, Function1 function1, long j10) {
        Object obj = e10.f48338a;
        Intrinsics.c(obj);
        u((C4209h) obj, j10, f10, interfaceC4205d, c4212k, function1);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function2 function2, X x10, C4209h c4209h) {
        function2.invoke(c4209h.e(), x10.b().invoke(c4209h.f()));
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(C4209h c4209h) {
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(E e10, Object obj, InterfaceC4205d interfaceC4205d, AbstractC4218q abstractC4218q, C4212k c4212k, float f10, Function1 function1, long j10) {
        C4209h c4209h = new C4209h(obj, interfaceC4205d.e(), abstractC4218q, j10, interfaceC4205d.g(), j10, true, new T(c4212k));
        u(c4209h, j10, f10, interfaceC4205d, c4212k, function1);
        e10.f48338a = c4209h;
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(C4212k c4212k) {
        c4212k.n(false);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(C4212k c4212k) {
        c4212k.n(false);
        return Unit.f48228a;
    }

    private static final Object r(InterfaceC4205d interfaceC4205d, Function1 function1, b bVar) {
        return interfaceC4205d.a() ? C.a(function1, bVar) : AbstractC1075t0.b(new S(function1), bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object s(Function1 function1, long j10) {
        return function1.invoke(Long.valueOf(j10));
    }

    private static final void t(C4209h c4209h, long j10, long j11, InterfaceC4205d interfaceC4205d, C4212k c4212k, Function1 function1) {
        c4209h.i(j10);
        c4209h.k(interfaceC4205d.f(j11));
        c4209h.l(interfaceC4205d.b(j11));
        if (interfaceC4205d.c(j11)) {
            c4209h.h(c4209h.c());
            c4209h.j(false);
        }
        w(c4209h, c4212k);
        function1.invoke(c4209h);
    }

    private static final void u(C4209h c4209h, long j10, float f10, InterfaceC4205d interfaceC4205d, C4212k c4212k, Function1 function1) {
        t(c4209h, j10, f10 == 0.0f ? interfaceC4205d.d() : (long) ((j10 - c4209h.d()) / f10), interfaceC4205d, c4212k, function1);
    }

    public static final float v(CoroutineContext coroutineContext) {
        m mVar = (m) coroutineContext.e(m.f13771j1);
        float fO = mVar != null ? mVar.o() : 1.0f;
        if (!(fO >= 0.0f)) {
            I.b("negative scale factor");
        }
        return fO;
    }

    public static final void w(C4209h c4209h, C4212k c4212k) {
        c4212k.p(c4209h.e());
        r.f(c4212k.e(), c4209h.f());
        c4212k.h(c4209h.b());
        c4212k.i(c4209h.c());
        c4212k.n(c4209h.g());
    }
}
