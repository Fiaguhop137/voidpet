package p216m0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p323s.C4123x;

/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4123x f48769a = new C4123x(0, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f48770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f48772c;

        private a(long j10, long j11, boolean z10) {
            this.f48770a = j10;
            this.f48771b = j11;
            this.f48772c = z10;
        }

        public /* synthetic */ a(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public final boolean a() {
            return this.f48772c;
        }

        public final long b() {
            return this.f48771b;
        }

        public final long c() {
            return this.f48770a;
        }
    }

    public final void a() {
        this.f48769a.b();
    }

    public final C3983f b(B b10, O o10) {
        long jC;
        boolean zA;
        long jA;
        C4123x c4123x = new C4123x(b10.b().size());
        List listB = b10.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            C c10 = (C) listB.get(i10);
            a aVar = (a) this.f48769a.e(c10.d());
            if (aVar == null) {
                zA = false;
                jC = c10.k();
                jA = c10.f();
            } else {
                jC = aVar.c();
                zA = aVar.a();
                jA = o10.A(aVar.b());
            }
            c4123x.j(c10.d(), new z(c10.d(), c10.k(), c10.f(), c10.b(), c10.h(), jC, jA, zA, false, c10.j(), c10.c(), c10.i(), c10.e(), null));
            if (c10.b()) {
                this.f48769a.j(c10.d(), new a(c10.k(), c10.g(), c10.b(), null));
            } else {
                this.f48769a.l(c10.d());
            }
        }
        return new C3983f(c4123x, b10);
    }
}
