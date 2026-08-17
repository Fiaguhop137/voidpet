package T7;

import L7.j;
import N7.o;
import N7.t;
import O7.m;
import U7.x;
import V7.InterfaceC1561d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f12319f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f12320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f12321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.e f12322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1561d f12323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W7.b f12324e;

    public c(Executor executor, O7.e eVar, x xVar, InterfaceC1561d interfaceC1561d, W7.b bVar) {
        this.f12321b = executor;
        this.f12322c = eVar;
        this.f12320a = xVar;
        this.f12323d = interfaceC1561d;
        this.f12324e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, o oVar, N7.i iVar) {
        cVar.f12323d.A0(oVar, iVar);
        cVar.f12320a.b(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(c cVar, o oVar, j jVar, N7.i iVar) {
        cVar.getClass();
        try {
            m mVarA = cVar.f12322c.a(oVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f12319f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                cVar.f12324e.d(new b(cVar, oVar, mVarA.b(iVar)));
                jVar.a(null);
            }
        } catch (Exception e10) {
            f12319f.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    @Override // T7.e
    public void a(o oVar, N7.i iVar, j jVar) {
        this.f12321b.execute(new a(this, oVar, jVar, iVar));
    }
}
