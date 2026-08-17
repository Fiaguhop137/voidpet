package S;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: S.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1422b extends C1424d {

    /* JADX INFO: renamed from: S.b$a */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f11353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f11354b;

        a(Function1 function1, Function1 function2) {
            this.f11353a = function1;
            this.f11354b = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1424d invoke(C1437q c1437q) {
            long j10;
            synchronized (AbstractC1442w.O()) {
                j10 = AbstractC1442w.f11414f;
                AbstractC1442w.f11414f += (long) 1;
            }
            return new C1424d(j10, c1437q, this.f11353a, this.f11354b);
        }
    }

    /* JADX INFO: renamed from: S.b$b, reason: collision with other inner class name */
    static final class C0168b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f11355a;

        C0168b(Function1 function1) {
            this.f11355a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1429i invoke(C1437q c1437q) {
            long j10;
            synchronized (AbstractC1442w.O()) {
                j10 = AbstractC1442w.f11414f;
                AbstractC1442w.f11414f += (long) 1;
            }
            return new C1429i(j10, c1437q, this.f11355a);
        }
    }

    public C1422b(long j10, C1437q c1437q) {
        super(j10, c1437q, null, new C1421a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(Object obj) {
        synchronized (AbstractC1442w.O()) {
            List list = AbstractC1442w.f11418j;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Function1) list.get(i10)).invoke(obj);
            }
        }
        return Unit.f48228a;
    }

    @Override // S.C1424d
    public AbstractC1434n C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // S.C1424d
    public C1424d R(Function1 function1, Function1 function2) {
        Function1 function3;
        Map map;
        L.e eVar = T.b.f11832a;
        if (eVar != null) {
            Pair pairE = T.b.e(eVar, null, false, function1, function2);
            T.a aVar = (T.a) pairE.c();
            Function1 function1A = aVar.a();
            Function1 function1B = aVar.b();
            map = (Map) pairE.d();
            function1 = function1A;
            function3 = function1B;
        } else {
            function3 = function2;
            map = null;
        }
        C1424d c1424d = (C1424d) AbstractC1442w.i0(new a(function1, function3));
        if (eVar != null) {
            T.b.b(eVar, null, c1424d, map);
        }
        return c1424d;
    }

    @Override // S.C1424d, S.AbstractC1432l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC1432l abstractC1432l) {
        I.b();
        throw new Ad.g();
    }

    @Override // S.C1424d, S.AbstractC1432l
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC1432l abstractC1432l) {
        I.b();
        throw new Ad.g();
    }

    @Override // S.C1424d, S.AbstractC1432l
    public void d() {
        synchronized (AbstractC1442w.O()) {
            q();
            Unit unit = Unit.f48228a;
        }
    }

    @Override // S.C1424d, S.AbstractC1432l
    public void o() {
        AbstractC1442w.G();
    }

    @Override // S.C1424d, S.AbstractC1432l
    public AbstractC1432l x(Function1 function1) {
        Map map;
        L.e eVar = T.b.f11832a;
        if (eVar != null) {
            Pair pairE = T.b.e(eVar, null, true, function1, null);
            T.a aVar = (T.a) pairE.c();
            Function1 function1A = aVar.a();
            aVar.b();
            map = (Map) pairE.d();
            function1 = function1A;
        } else {
            map = null;
        }
        C1429i c1429i = (C1429i) AbstractC1442w.i0(new C0168b(function1));
        if (eVar != null) {
            T.b.b(eVar, null, c1429i, map);
        }
        return c1429i;
    }
}
