package androidx.privacysandbox.ads.adservices.measurement;

import Ad.r;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088ef.C3303p;
import p088ef.O;
import p088ef.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MeasurementManager f24822b;

    static final class a extends kotlin.coroutines.jvm.internal.m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f24825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, l lVar, Ed.b bVar) {
            super(2, bVar);
            this.f24825c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            a aVar = new a(null, this.f24825c, bVar);
            aVar.f24824b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((a) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Fd.b.e();
            if (this.f24823a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            throw null;
        }
    }

    public l(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f24822b = mMeasurementManager;
    }

    static /* synthetic */ Object h(l lVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, Ed.b bVar) {
        new C3303p(Fd.b.c(bVar), 1).E();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object j(l lVar, Ed.b bVar) {
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        lVar.i().getMeasurementApiStatus(new k(), p128h1.m.a(c3303p));
        Object objV = c3303p.v();
        if (objV == Fd.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objV;
    }

    static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, Ed.b bVar) {
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        lVar.i().registerSource(uri, inputEvent, new k(), p128h1.m.a(c3303p));
        Object objV = c3303p.v();
        if (objV == Fd.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objV == Fd.b.e() ? objV : Unit.f48228a;
    }

    static /* synthetic */ Object l(l lVar, m mVar, Ed.b bVar) {
        Object objE = P.e(new a(mVar, lVar, null), bVar);
        return objE == Fd.b.e() ? objE : Unit.f48228a;
    }

    static /* synthetic */ Object m(l lVar, Uri uri, Ed.b bVar) {
        C3303p c3303p = new C3303p(Fd.b.c(bVar), 1);
        c3303p.E();
        lVar.i().registerTrigger(uri, new k(), p128h1.m.a(c3303p));
        Object objV = c3303p.v();
        if (objV == Fd.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(bVar);
        }
        return objV == Fd.b.e() ? objV : Unit.f48228a;
    }

    static /* synthetic */ Object n(l lVar, n nVar, Ed.b bVar) {
        new C3303p(Fd.b.c(bVar), 1).E();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object o(l lVar, o oVar, Ed.b bVar) {
        new C3303p(Fd.b.c(bVar), 1).E();
        lVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    @Nullable
    public Object a(@NotNull androidx.privacysandbox.ads.adservices.measurement.a aVar, @NotNull Ed.b bVar) {
        return h(this, aVar, bVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    @Nullable
    public Object b(@NotNull Ed.b bVar) {
        return j(this, bVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Ed.b bVar) {
        return k(this, uri, inputEvent, bVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    @Nullable
    public Object d(@NotNull m mVar, @NotNull Ed.b bVar) {
        return l(this, mVar, bVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull Ed.b bVar) {
        return m(this, uri, bVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    @Nullable
    public Object f(@NotNull n nVar, @NotNull Ed.b bVar) {
        return n(this, nVar, bVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    @Nullable
    public Object g(@NotNull o oVar, @NotNull Ed.b bVar) {
        return o(this, oVar, bVar);
    }

    protected final MeasurementManager i() {
        return this.f24822b;
    }
}
