package W5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1608k implements V4.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1614q f14734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p079e6.D f14735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1613p f14736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U5.t f14737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q4.d f14739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q4.d f14740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f14741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f14742i;

    /* JADX INFO: renamed from: W5.k$a */
    public static final class a implements InterfaceC1600c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lazy f14743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f14744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Lazy f14745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Lazy f14746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Lazy f14747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Lazy f14748f;

        a(C1608k c1608k) {
            Ad.m mVar = Ad.m.SYNCHRONIZED;
            this.f14743a = Ad.j.a(mVar, new C1602e(c1608k));
            this.f14744b = Ad.j.a(mVar, new C1603f(this, c1608k));
            this.f14745c = Ad.j.a(mVar, new C1604g(c1608k));
            this.f14746d = Ad.j.a(mVar, new C1605h(this, c1608k));
            this.f14747e = Ad.j.a(mVar, new C1606i(c1608k, this));
            this.f14748f = Ad.j.a(mVar, new C1607j(this, c1608k));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final V4.g j(a this$0, C1608k this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map mapL = this$0.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.N.e(mapL.size()));
            for (Map.Entry entry : mapL.entrySet()) {
                Object key = entry.getKey();
                Q4.k kVar = (Q4.k) entry.getValue();
                Y4.i iVarI = this$1.f14735b.i(this$1.f14738e);
                Intrinsics.checkNotNullExpressionValue(iVarI, "getPooledByteBufferFactory(...)");
                Y4.l lVarJ = this$1.f14735b.j();
                Intrinsics.checkNotNullExpressionValue(lVarJ, "getPooledByteStreams(...)");
                Executor executorF = this$1.f14736c.f();
                Intrinsics.checkNotNullExpressionValue(executorF, "forLocalStorageRead(...)");
                Executor executorB = this$1.f14736c.b();
                Intrinsics.checkNotNullExpressionValue(executorB, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new U5.j(kVar, iVarI, lVarJ, executorF, executorB, this$1.f14737d));
            }
            return V4.g.b(linkedHashMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map k(C1608k this$0, a this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map map = this$0.f14741h;
            if (map == null) {
                return kotlin.collections.N.i();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.N.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), this$0.f14734a.a((Q4.d) entry.getValue()));
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final U5.j o(a this$0, C1608k this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Q4.k kVarM = this$0.m();
            Y4.i iVarI = this$1.f14735b.i(this$1.f14738e);
            Intrinsics.checkNotNullExpressionValue(iVarI, "getPooledByteBufferFactory(...)");
            Y4.l lVarJ = this$1.f14735b.j();
            Intrinsics.checkNotNullExpressionValue(lVarJ, "getPooledByteStreams(...)");
            Executor executorF = this$1.f14736c.f();
            Intrinsics.checkNotNullExpressionValue(executorF, "forLocalStorageRead(...)");
            Executor executorB = this$1.f14736c.b();
            Intrinsics.checkNotNullExpressionValue(executorB, "forLocalStorageWrite(...)");
            return new U5.j(kVarM, iVarI, lVarJ, executorF, executorB, this$1.f14737d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q4.k p(C1608k this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f14734a.a(this$0.f14739f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final U5.j q(a this$0, C1608k this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Q4.k kVarN = this$0.n();
            Y4.i iVarI = this$1.f14735b.i(this$1.f14738e);
            Intrinsics.checkNotNullExpressionValue(iVarI, "getPooledByteBufferFactory(...)");
            Y4.l lVarJ = this$1.f14735b.j();
            Intrinsics.checkNotNullExpressionValue(lVarJ, "getPooledByteStreams(...)");
            Executor executorF = this$1.f14736c.f();
            Intrinsics.checkNotNullExpressionValue(executorF, "forLocalStorageRead(...)");
            Executor executorB = this$1.f14736c.b();
            Intrinsics.checkNotNullExpressionValue(executorB, "forLocalStorageWrite(...)");
            return new U5.j(kVarN, iVarI, lVarJ, executorF, executorB, this$1.f14737d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Q4.k r(C1608k this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f14734a.a(this$0.f14740g);
        }

        @Override // W5.InterfaceC1600c
        public U5.j a() {
            return (U5.j) this.f14746d.getValue();
        }

        @Override // W5.InterfaceC1600c
        public U5.j b() {
            return (U5.j) this.f14744b.getValue();
        }

        @Override // W5.InterfaceC1600c
        public V4.g c() {
            Object value = this.f14748f.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (V4.g) value;
        }

        public Map l() {
            return (Map) this.f14747e.getValue();
        }

        public Q4.k m() {
            return (Q4.k) this.f14743a.getValue();
        }

        public Q4.k n() {
            return (Q4.k) this.f14745c.getValue();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1608k(InterfaceC1614q fileCacheFactory, InterfaceC1618v config) {
        this(fileCacheFactory, config.t(), config.H(), config.B(), config.u(), config.d(), config.j(), config.i());
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    public C1608k(InterfaceC1614q fileCacheFactory, p079e6.D poolFactory, InterfaceC1613p executorSupplier, U5.t imageCacheStatsTracker, int i10, Q4.d mainDiskCacheConfig, Q4.d smallImageDiskCacheConfig, Map map) {
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        Intrinsics.checkNotNullParameter(mainDiskCacheConfig, "mainDiskCacheConfig");
        Intrinsics.checkNotNullParameter(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f14734a = fileCacheFactory;
        this.f14735b = poolFactory;
        this.f14736c = executorSupplier;
        this.f14737d = imageCacheStatsTracker;
        this.f14738e = i10;
        this.f14739f = mainDiskCacheConfig;
        this.f14740g = smallImageDiskCacheConfig;
        this.f14741h = map;
        this.f14742i = Ad.j.a(Ad.m.SYNCHRONIZED, new C1601d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a j(C1608k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new a(this$0);
    }

    private final InterfaceC1600c l() {
        return (InterfaceC1600c) this.f14742i.getValue();
    }

    @Override // V4.n
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC1600c get() {
        return l();
    }
}
