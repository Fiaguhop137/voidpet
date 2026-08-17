package W5;

import android.net.Uri;
import android.os.StrictMode;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.p0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: W5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1616t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f14756n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final CancellationException f14757o = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final CancellationException f14758p = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final CancellationException f14759q = new CancellationException("Modified URL is null");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f14760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.n f14761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V4.n f14762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p061d6.e f14763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p061d6.d f14764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final U5.x f14765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final U5.x f14766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final U5.k f14767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p0 f14768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V4.n f14769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicLong f14770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V4.n f14771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1618v f14772m;

    /* JADX INFO: renamed from: W5.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: W5.t$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14773a;

        static {
            int[] iArr = new int[p133h6.b.EnumC0495b.values().length];
            try {
                iArr[p133h6.b.EnumC0495b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p133h6.b.EnumC0495b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p133h6.b.EnumC0495b.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14773a = iArr;
        }
    }

    public C1616t(W producerSequenceFactory, Set requestListeners, Set requestListener2s, V4.n isPrefetchEnabledSupplier, U5.x bitmapMemoryCache, U5.x encodedMemoryCache, V4.n diskCachesStoreSupplier, U5.k cacheKeyFactory, p0 threadHandoffProducerQueue, V4.n suppressBitmapPrefetchingSupplier, V4.n lazyDataSource, R4.a aVar, InterfaceC1618v config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14760a = producerSequenceFactory;
        this.f14761b = isPrefetchEnabledSupplier;
        this.f14762c = diskCachesStoreSupplier;
        this.f14763d = new p061d6.c(requestListeners);
        this.f14764e = new p061d6.b(requestListener2s);
        this.f14770k = new AtomicLong();
        this.f14765f = bitmapMemoryCache;
        this.f14766g = encodedMemoryCache;
        this.f14767h = cacheKeyFactory;
        this.f14768i = threadHandoffProducerQueue;
        this.f14769j = suppressBitmapPrefetchingSupplier;
        this.f14771l = lazyDataSource;
        this.f14772m = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(Uri uri, P4.d key) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(key, "key");
        return key.b(uri);
    }

    private final p096f5.c D(d0 d0Var, p133h6.b bVar, h6.b.c cVar, Object obj, p061d6.e eVar, String str) {
        return E(d0Var, bVar, cVar, obj, eVar, str, null);
    }

    private final p096f5.c E(d0 d0Var, p133h6.b bVar, h6.b.c cVar, Object obj, p061d6.e eVar, String str, Map map) {
        p096f5.c cVarB;
        if (!p151i6.b.d()) {
            com.facebook.imagepipeline.producers.F f10 = new com.facebook.imagepipeline.producers.F(s(bVar, eVar), this.f14764e);
            try {
                h6.b.c cVarE = h6.b.c.e(bVar.k(), cVar);
                Intrinsics.checkNotNullExpressionValue(cVarE, "getMax(...)");
                l0 l0Var = new l0(bVar, p(), str, f10, obj, cVarE, false, bVar.p() || !p060d5.f.n(bVar.v()), bVar.o(), this.f14772m);
                l0Var.m(map);
                return X5.c.H(d0Var, l0Var, f10);
            } catch (Exception e10) {
                return p096f5.d.b(e10);
            }
        }
        p151i6.b.a("ImagePipeline#submitFetchRequest");
        try {
            com.facebook.imagepipeline.producers.F f11 = new com.facebook.imagepipeline.producers.F(s(bVar, eVar), this.f14764e);
            try {
                h6.b.c cVarE2 = h6.b.c.e(bVar.k(), cVar);
                Intrinsics.checkNotNullExpressionValue(cVarE2, "getMax(...)");
                l0 l0Var2 = new l0(bVar, p(), str, f11, obj, cVarE2, false, bVar.p() || !p060d5.f.n(bVar.v()), bVar.o(), this.f14772m);
                l0Var2.m(map);
                cVarB = X5.c.H(d0Var, l0Var2, f11);
            } catch (Exception e11) {
                cVarB = p096f5.d.b(e11);
            }
            p151i6.b.b();
            return cVarB;
        } catch (Throwable th) {
            p151i6.b.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    private final p096f5.c F(d0 d0Var, p133h6.b bVar, h6.b.c cVar, Object obj, V5.f fVar, p061d6.e eVar) {
        boolean z10;
        com.facebook.imagepipeline.producers.F f10 = new com.facebook.imagepipeline.producers.F(s(bVar, eVar), this.f14764e);
        Uri uriV = bVar.v();
        Intrinsics.checkNotNullExpressionValue(uriV, "getSourceUri(...)");
        Uri uriA = J5.b.f5748b.a(uriV, obj);
        if (uriA == null) {
            p096f5.c cVarB = p096f5.d.b(f14759q);
            Intrinsics.checkNotNullExpressionValue(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        if (!Intrinsics.b(uriV, uriA)) {
            bVar = p133h6.c.b(bVar).R(uriA).a();
        }
        p133h6.b bVar2 = bVar;
        try {
            h6.b.c cVarE = h6.b.c.e(bVar2.k(), cVar);
            Intrinsics.checkNotNullExpressionValue(cVarE, "getMax(...)");
            String strP = p();
            x xVarG = this.f14772m.G();
            if (xVarG != null) {
                z10 = xVarG.b() && bVar2.p();
            }
            return X5.d.f15301j.a(d0Var, new l0(bVar2, strP, f10, obj, cVarE, true, z10, fVar, this.f14772m), f10);
        } catch (Exception e10) {
            return p096f5.d.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(P4.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static /* synthetic */ p096f5.c n(C1616t c1616t, p133h6.b bVar, Object obj, h6.b.c cVar, p061d6.e eVar, String str, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        if ((i10 & 8) != 0) {
            eVar = null;
        }
        if ((i10 & 16) != 0) {
            str = null;
        }
        return c1616t.m(bVar, obj, cVar, eVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean y(p133h6.b bVar) {
        Object obj = this.f14762c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1600c interfaceC1600c = (InterfaceC1600c) obj;
        P4.d dVarA = this.f14767h.a(bVar, null);
        String strF = bVar.f();
        if (strF != null) {
            U5.j jVar = (U5.j) interfaceC1600c.c().get(strF);
            if (jVar == null) {
                return false;
            }
            Intrinsics.c(dVarA);
            return jVar.k(dVarA);
        }
        Iterator it = interfaceC1600c.c().entrySet().iterator();
        while (it.hasNext()) {
            U5.j jVar2 = (U5.j) ((Map.Entry) it.next()).getValue();
            Intrinsics.c(dVarA);
            if (jVar2.k(dVarA)) {
                return true;
            }
        }
        return false;
    }

    private final V4.l z(Uri uri) {
        return new r(uri);
    }

    public final p096f5.c B(p133h6.b bVar, Object obj) {
        return C(bVar, obj, V5.f.MEDIUM, null);
    }

    public final p096f5.c C(p133h6.b bVar, Object obj, V5.f priority, p061d6.e eVar) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (!((Boolean) this.f14761b.get()).booleanValue()) {
            p096f5.c cVarB = p096f5.d.b(f14757o);
            Intrinsics.checkNotNullExpressionValue(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        if (bVar == null) {
            p096f5.c cVarB2 = p096f5.d.b(new NullPointerException("imageRequest is null"));
            Intrinsics.c(cVarB2);
            return cVarB2;
        }
        try {
            return F(this.f14760a.G(bVar), bVar, h6.b.c.FULL_FETCH, obj, priority, eVar);
        } catch (Exception e10) {
            return p096f5.d.b(e10);
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        Object obj = this.f14762c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1600c interfaceC1600c = (InterfaceC1600c) obj;
        interfaceC1600c.b().h();
        interfaceC1600c.a().h();
        Iterator it = interfaceC1600c.c().entrySet().iterator();
        while (it.hasNext()) {
            ((U5.j) ((Map.Entry) it.next()).getValue()).h();
        }
    }

    public final void e() {
        C1615s c1615s = new C1615s();
        this.f14765f.e(c1615s);
        this.f14766g.e(c1615s);
    }

    public final void g(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        j(uri);
        h(uri);
    }

    public final void h(Uri uri) {
        p133h6.b bVarA = p133h6.b.a(uri);
        if (bVarA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        i(bVarA);
    }

    public final void i(p133h6.b bVar) {
        if (bVar == null) {
            return;
        }
        P4.d dVarA = this.f14767h.a(bVar, null);
        Object obj = this.f14762c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1600c interfaceC1600c = (InterfaceC1600c) obj;
        U5.j jVarB = interfaceC1600c.b();
        Intrinsics.c(dVarA);
        jVarB.s(dVarA);
        interfaceC1600c.a().s(dVarA);
        Iterator it = interfaceC1600c.c().entrySet().iterator();
        while (it.hasNext()) {
            ((U5.j) ((Map.Entry) it.next()).getValue()).s(dVarA);
        }
    }

    public final void j(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        V4.l lVarZ = z(uri);
        this.f14765f.e(lVarZ);
        this.f14766g.e(lVarZ);
    }

    public final p096f5.c k(p133h6.b bVar, Object obj) {
        return n(this, bVar, obj, null, null, null, 24, null);
    }

    public final p096f5.c l(p133h6.b bVar, Object obj, h6.b.c lowestPermittedRequestLevelOnSubmit) {
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return n(this, bVar, obj, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    public final p096f5.c m(p133h6.b bVar, Object obj, h6.b.c cVar, p061d6.e eVar, String str) {
        if (bVar == null) {
            p096f5.c cVarB = p096f5.d.b(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        try {
            d0 d0VarE = this.f14760a.E(bVar);
            if (cVar == null) {
                cVar = h6.b.c.FULL_FETCH;
            }
            return D(d0VarE, bVar, cVar, obj, eVar, str);
        } catch (Exception e10) {
            return p096f5.d.b(e10);
        }
    }

    public final p096f5.c o(p133h6.b imageRequest, Object obj) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return l(imageRequest, obj, h6.b.c.BITMAP_MEMORY_CACHE);
    }

    public final String p() {
        return String.valueOf(this.f14770k.getAndIncrement());
    }

    public final U5.x q() {
        return this.f14765f;
    }

    public final U5.k r() {
        return this.f14767h;
    }

    public final p061d6.e s(p133h6.b bVar, p061d6.e eVar) {
        if (bVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (eVar == null) {
            return bVar.q() == null ? this.f14763d : new p061d6.c(this.f14763d, bVar.q());
        }
        return bVar.q() == null ? new p061d6.c(this.f14763d, eVar) : new p061d6.c(this.f14763d, eVar, bVar.q());
    }

    public final boolean t(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f14765f.d(z(uri));
    }

    public final boolean u(p133h6.b bVar) {
        if (bVar == null) {
            return false;
        }
        P4.d dVarB = this.f14767h.b(bVar, null);
        U5.x xVar = this.f14765f;
        Intrinsics.c(dVarB);
        Z4.a aVar = xVar.get(dVarB);
        try {
            return Z4.a.r(aVar);
        } finally {
            Z4.a.g(aVar);
        }
    }

    public final boolean v(Uri uri) {
        return w(uri, p133h6.b.EnumC0495b.SMALL) || w(uri, p133h6.b.EnumC0495b.DEFAULT) || w(uri, p133h6.b.EnumC0495b.DYNAMIC);
    }

    public final boolean w(Uri uri, p133h6.b.EnumC0495b enumC0495b) {
        p133h6.b bVarA = p133h6.c.x(uri).A(enumC0495b).a();
        Intrinsics.c(bVarA);
        return x(bVarA);
    }

    public final boolean x(p133h6.b imageRequest) {
        boolean zK;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Object obj = this.f14762c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1600c interfaceC1600c = (InterfaceC1600c) obj;
        P4.d dVarA = this.f14767h.a(imageRequest, null);
        p133h6.b.EnumC0495b enumC0495bC = imageRequest.c();
        Intrinsics.checkNotNullExpressionValue(enumC0495bC, "getCacheChoice(...)");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i10 = b.f14773a[enumC0495bC.ordinal()];
            if (i10 == 1) {
                U5.j jVarB = interfaceC1600c.b();
                Intrinsics.c(dVarA);
                zK = jVarB.k(dVarA);
            } else if (i10 == 2) {
                U5.j jVarA = interfaceC1600c.a();
                Intrinsics.c(dVarA);
                zK = jVarA.k(dVarA);
            } else {
                if (i10 != 3) {
                    throw new Ad.n();
                }
                zK = y(imageRequest);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zK;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
