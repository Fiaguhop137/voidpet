package I;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1082v1 implements p088ef.O, InterfaceC1076t1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4869e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4870f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CoroutineContext f4871g = new C1033f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f4872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f4873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f4874c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile CoroutineContext f4875d;

    /* JADX INFO: renamed from: I.v1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: I.v1$b */
    public static final class b extends kotlin.coroutines.a implements p088ef.L {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.h f4876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1082v1 f4877c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ef.L.b bVar, U.h hVar, C1082v1 c1082v1) {
            super(bVar);
            this.f4876b = hVar;
            this.f4877c = c1082v1;
        }

        @Override // p088ef.L
        public void L(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            this.f4876b.g(th, this.f4877c);
            CoroutineContext coroutineContext2 = this.f4877c.f4873b;
            ef.L.b bVar = p088ef.L.f40784y1;
            p088ef.L l10 = (p088ef.L) coroutineContext2.e(bVar);
            if (l10 != null) {
                l10.L(coroutineContext, th);
                return;
            }
            p088ef.L l11 = (p088ef.L) this.f4877c.f4872a.e(bVar);
            if (l11 == null) {
                throw th;
            }
            l11.L(coroutineContext, th);
        }
    }

    public C1082v1(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.f4872a = coroutineContext;
        this.f4873b = coroutineContext2;
    }

    public final void c() {
        synchronized (this.f4874c) {
            try {
                CoroutineContext coroutineContext = this.f4875d;
                if (coroutineContext == null) {
                    this.f4875d = f4871g;
                } else {
                    p088ef.E0.d(coroutineContext, new C1028d0());
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I.InterfaceC1076t1
    public void g() {
    }

    @Override // p088ef.O
    public CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextP;
        CoroutineContext coroutineContext = this.f4875d;
        if (coroutineContext == null || coroutineContext == f4871g) {
            U.h hVar = (U.h) this.f4872a.e(U.h.f12603b);
            CoroutineContext bVar = hVar != null ? new b(p088ef.L.f40784y1, hVar, this) : kotlin.coroutines.e.f48283a;
            synchronized (this.f4874c) {
                try {
                    coroutineContextP = this.f4875d;
                    if (coroutineContextP == null) {
                        CoroutineContext coroutineContext2 = this.f4872a;
                        coroutineContextP = coroutineContext2.P(p088ef.E0.a((p088ef.B0) coroutineContext2.e(p088ef.B0.f40749z1))).P(this.f4873b).P(bVar);
                    } else if (coroutineContextP == f4871g) {
                        CoroutineContext coroutineContext3 = this.f4872a;
                        p088ef.A a10 = p088ef.E0.a((p088ef.B0) coroutineContext3.e(p088ef.B0.f40749z1));
                        a10.d(new C1028d0());
                        coroutineContextP = coroutineContext3.P(a10).P(this.f4873b).P(bVar);
                    }
                    this.f4875d = coroutineContextP;
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext = coroutineContextP;
        }
        Intrinsics.c(coroutineContext);
        return coroutineContext;
    }

    @Override // I.InterfaceC1076t1
    public void j() {
        c();
    }

    @Override // I.InterfaceC1076t1
    public void l() {
        c();
    }
}
