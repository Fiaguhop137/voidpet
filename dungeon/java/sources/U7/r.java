package U7;

import V7.AbstractC1568k;
import V7.InterfaceC1560c;
import V7.InterfaceC1561d;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.e f13364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1561d f13365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f13366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f13367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W7.b f13368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X7.a f13369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X7.a f13370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1560c f13371i;

    public r(Context context, O7.e eVar, InterfaceC1561d interfaceC1561d, x xVar, Executor executor, W7.b bVar, X7.a aVar, X7.a aVar2, InterfaceC1560c interfaceC1560c) {
        this.f13363a = context;
        this.f13364b = eVar;
        this.f13365c = interfaceC1561d;
        this.f13366d = xVar;
        this.f13367e = executor;
        this.f13368f = bVar;
        this.f13369g = aVar;
        this.f13370h = aVar2;
        this.f13371i = interfaceC1560c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, N7.o oVar, long j10) {
        rVar.f13365c.R1(iterable);
        rVar.f13365c.L1(oVar, rVar.f13369g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f13371i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f13365c.d0(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, N7.o oVar, int i10) {
        rVar.f13366d.b(oVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, N7.o oVar, long j10) {
        rVar.f13365c.L1(oVar, rVar.f13369g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            rVar.f13371i.b(((Integer) entry.getValue()).intValue(), Q7.c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(r rVar, N7.o oVar, int i10, Runnable runnable) {
        rVar.getClass();
        try {
            W7.b bVar = rVar.f13368f;
            InterfaceC1561d interfaceC1561d = rVar.f13365c;
            Objects.requireNonNull(interfaceC1561d);
            bVar.d(new i(interfaceC1561d));
            if (rVar.k()) {
                rVar.l(oVar, i10);
            } else {
                rVar.f13368f.d(new j(rVar, oVar, i10));
            }
        } catch (W7.a unused) {
            rVar.f13366d.b(oVar, i10 + 1);
        } finally {
            runnable.run();
        }
    }

    public N7.i j(O7.m mVar) {
        W7.b bVar = this.f13368f;
        InterfaceC1560c interfaceC1560c = this.f13371i;
        Objects.requireNonNull(interfaceC1560c);
        return mVar.b(N7.i.a().i(this.f13369g.a()).k(this.f13370h.a()).j("GDT_CLIENT_METRICS").h(new N7.h(L7.c.b("proto"), ((Q7.a) bVar.d(new h(interfaceC1560c))).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f13363a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public O7.g l(N7.o oVar, int i10) {
        O7.g gVarA;
        O7.m mVarA = this.f13364b.a(oVar.b());
        O7.g gVarE = O7.g.e(0L);
        long j10 = 0;
        while (((Boolean) this.f13368f.d(new k(this, oVar))).booleanValue()) {
            Iterable iterable = (Iterable) this.f13368f.d(new l(this, oVar));
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVarA == null) {
                R7.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                gVarA = O7.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC1568k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(mVarA));
                }
                gVarA = mVarA.a(O7.f.a().b(arrayList).c(oVar.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == O7.g.a.TRANSIENT_ERROR) {
                N7.o oVar2 = oVar;
                this.f13368f.d(new m(this, iterable, oVar2, j10));
                this.f13366d.a(oVar2, i10 + 1, true);
                return gVarE;
            }
            N7.o oVar3 = oVar;
            this.f13368f.d(new n(this, iterable));
            if (gVarE.c() == O7.g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (oVar3.e()) {
                    this.f13368f.d(new o(this));
                }
                j10 = jMax;
            } else if (gVarE.c() == O7.g.a.INVALID_PAYLOAD) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strJ = ((AbstractC1568k) it2.next()).b().j();
                    if (map.containsKey(strJ)) {
                        map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    } else {
                        map.put(strJ, 1);
                    }
                }
                this.f13368f.d(new p(this, map));
            }
            oVar = oVar3;
        }
        this.f13368f.d(new q(this, oVar, j10));
        return gVarE;
    }

    public void m(N7.o oVar, int i10, Runnable runnable) {
        this.f13367e.execute(new g(this, oVar, i10, runnable));
    }
}
