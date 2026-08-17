package Tb;

import Ad.q;
import Ad.r;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p088ef.AbstractC3293k;
import p088ef.C3303p;
import p088ef.C3313u0;
import p088ef.InterfaceC3299n;
import p088ef.O;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Tb.c, Sb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f12387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f12388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sb.d f12389c;

    /* JADX INFO: renamed from: Tb.a$a, reason: collision with other inner class name */
    static final class C0180a extends kotlin.coroutines.jvm.internal.m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12392c;

        /* JADX INFO: renamed from: Tb.a$a$a, reason: collision with other inner class name */
        public static final class C0181a implements Sb.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3299n f12394a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Sb.a f12395b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f12396c;

            public C0181a(InterfaceC3299n interfaceC3299n, Sb.a aVar, a aVar2) {
                this.f12394a = interfaceC3299n;
                this.f12395b = aVar;
                this.f12396c = aVar2;
            }

            @Override // Sb.e
            public void a(androidx.appcompat.app.c activity) {
                Object objB;
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (this.f12394a.a()) {
                    this.f12395b.c(this);
                    InterfaceC3299n interfaceC3299n = this.f12394a;
                    try {
                        q.a aVar = q.f327b;
                        this.f12396c.f12387a.p(activity);
                        objB = q.b(Unit.f48228a);
                    } catch (Throwable th) {
                        q.a aVar2 = q.f327b;
                        objB = q.b(r.a(th));
                    }
                    interfaceC3299n.resumeWith(objB);
                }
            }
        }

        /* JADX INFO: renamed from: Tb.a$a$b */
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Sb.a f12397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0181a f12398b;

            public b(Sb.a aVar, C0181a c0181a) {
                this.f12397a = aVar;
                this.f12398b = c0181a;
            }

            public final void a(Throwable th) {
                this.f12397a.c(this.f12398b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.f48228a;
            }
        }

        C0180a(Ed.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return a.this.new C0180a(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((C0180a) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f12392c;
            if (i10 == 0) {
                r.b(obj);
                a aVar = a.this;
                this.f12390a = aVar;
                this.f12391b = aVar;
                this.f12392c = 1;
                C3303p c3303p = new C3303p(Fd.b.c(this), 1);
                c3303p.E();
                C0181a c0181a = new C0181a(c3303p, aVar, aVar);
                aVar.b(c0181a);
                c3303p.t(new b(aVar, c0181a));
                Object objV = c3303p.v();
                if (objV == Fd.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (objV == objE) {
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

    public static final class b implements Sb.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3299n f12399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Sb.a f12400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f12401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f12402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f12403e;

        public b(InterfaceC3299n interfaceC3299n, Sb.a aVar, a aVar2, d dVar, e eVar) {
            this.f12399a = interfaceC3299n;
            this.f12400b = aVar;
            this.f12401c = aVar2;
            this.f12402d = dVar;
            this.f12403e = eVar;
        }

        @Override // Sb.e
        public void a(androidx.appcompat.app.c activity) {
            Object objB;
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f12399a.a()) {
                this.f12400b.c(this);
                InterfaceC3299n interfaceC3299n = this.f12399a;
                try {
                    q.a aVar = q.f327b;
                    objB = q.b(this.f12401c.f12387a.n("AppContext_rq#" + this.f12401c.f12388b.getAndIncrement(), activity, this.f12402d, this.f12403e));
                } catch (Throwable th) {
                    q.a aVar2 = q.f327b;
                    objB = q.b(r.a(th));
                }
                interfaceC3299n.resumeWith(objB);
            }
        }
    }

    public static final class c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sb.a f12404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f12405b;

        public c(Sb.a aVar, b bVar) {
            this.f12404a = aVar;
            this.f12405b = bVar;
        }

        public final void a(Throwable th) {
            this.f12404a.c(this.f12405b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f48228a;
        }
    }

    public a(p085ec.b currentActivityProvider) {
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        this.f12387a = new k(currentActivityProvider);
        this.f12388b = new AtomicInteger();
        this.f12389c = new Sb.d();
        AbstractC3293k.d(C3313u0.f40869a, null, null, new C0180a(null), 3, null);
    }

    @Override // Tb.c
    public Object a(d dVar, e eVar, Ed.b bVar) {
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        b bVar2 = new b(c3303p, this, this, dVar, eVar);
        b(bVar2);
        c3303p.t(new c(this, bVar2));
        Object objV = c3303p.v();
        if (objV == Fd.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objV;
    }

    @Override // Sb.a
    public void b(Sb.e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12389c.b(listener);
    }

    @Override // Sb.a
    public void c(Sb.e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12389c.c(listener);
    }

    public final void f(int i10, int i11, Intent intent) {
        this.f12387a.g(i10, i11, intent);
    }

    public final void g(androidx.appcompat.app.c activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f12387a.m(activity);
    }

    public final void h(androidx.appcompat.app.c activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f12389c.f(activity);
    }
}
