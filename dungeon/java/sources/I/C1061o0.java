package I;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p088ef.C3303p;
import p088ef.InterfaceC3299n;

/* JADX INFO: renamed from: I.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1061o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4771a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f4772b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f4773c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4774d = true;

    /* JADX INFO: renamed from: I.o0$a */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3299n f4776b;

        a(InterfaceC3299n interfaceC3299n) {
            this.f4776b = interfaceC3299n;
        }

        public final void a(Throwable th) {
            Object obj = C1061o0.this.f4771a;
            C1061o0 c1061o0 = C1061o0.this;
            InterfaceC3299n interfaceC3299n = this.f4776b;
            synchronized (obj) {
                c1061o0.f4772b.remove(interfaceC3299n);
                Unit unit = Unit.f48228a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f48228a;
        }
    }

    public final Object c(Ed.b bVar) {
        if (e()) {
            return Unit.f48228a;
        }
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        synchronized (this.f4771a) {
            this.f4772b.add(c3303p);
        }
        c3303p.t(new a(c3303p));
        Object objV = c3303p.v();
        if (objV == Fd.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objV == Fd.b.e() ? objV : Unit.f48228a;
    }

    public final void d() {
        synchronized (this.f4771a) {
            this.f4774d = false;
            Unit unit = Unit.f48228a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f4771a) {
            z10 = this.f4774d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f4771a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.f4772b;
                this.f4772b = this.f4773c;
                this.f4773c = list;
                this.f4774d = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Ed.b bVar = (Ed.b) list.get(i10);
                    Ad.q.a aVar = Ad.q.f327b;
                    bVar.resumeWith(Ad.q.b(Unit.f48228a));
                }
                list.clear();
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
