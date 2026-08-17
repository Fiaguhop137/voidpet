package p140hd;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p158id.c;
import p158id.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public boolean a(d update, p158id.a asset, boolean z10) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(asset, "asset");
        p158id.a aVarG = g(asset.j());
        if (aVarG == null) {
            return false;
        }
        long jI = aVarG.i();
        f(new c(update.d(), jI));
        if (!z10) {
            return true;
        }
        m(jI, update.d());
        return true;
    }

    protected abstract void b();

    public List c() {
        k();
        o();
        p();
        n();
        List listJ = j();
        b();
        return listJ;
    }

    protected abstract long d(p158id.a aVar);

    public void e(List assets, d update) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(update, "update");
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            p158id.a aVar = (p158id.a) it.next();
            long jD = d(aVar);
            f(new c(update.d(), jD));
            if (aVar.t()) {
                m(jD, update.d());
            }
        }
    }

    protected abstract void f(c cVar);

    public final p158id.a g(String str) {
        p158id.a aVar = (p158id.a) CollectionsKt.firstOrNull(h(str));
        if (aVar == null) {
            return null;
        }
        String strM = aVar.m();
        if (strM != null) {
            p373ud.a.C0693a c0693aG = p373ud.a.f55050a.g(strM);
            String strA = c0693aG.a();
            String strB = c0693aG.b();
            String strC = c0693aG.c();
            aVar.v(strA);
            aVar.H(strB);
            aVar.G(strC);
        }
        return aVar;
    }

    protected abstract List h(String str);

    public abstract List i(UUID uuid);

    protected abstract List j();

    protected abstract void k();

    public final void l(p158id.a existingEntity, p158id.a newEntity) {
        boolean z10;
        Intrinsics.checkNotNullParameter(existingEntity, "existingEntity");
        Intrinsics.checkNotNullParameter(newEntity, "newEntity");
        boolean z11 = true;
        if (newEntity.s() == null || (existingEntity.s() != null && Intrinsics.b(newEntity.s(), existingEntity.s()))) {
            z10 = false;
        } else {
            existingEntity.K(newEntity.s());
            z10 = true;
        }
        JSONObject jSONObjectD = newEntity.d();
        if (jSONObjectD == null || (existingEntity.d() != null && Intrinsics.b(jSONObjectD, existingEntity.d()))) {
            z11 = z10;
        } else {
            existingEntity.x(newEntity.d());
        }
        if (z11) {
            q(existingEntity);
        }
        existingEntity.C(newEntity.t());
        String strB = newEntity.b();
        if (strB != null) {
            existingEntity.v(strB);
        }
        String strN = newEntity.n();
        if (strN != null) {
            existingEntity.G(strN);
        }
        String strO = newEntity.o();
        if (strO != null) {
            existingEntity.H(strO);
        }
        Float fP = newEntity.p();
        if (fP != null) {
            existingEntity.I(Float.valueOf(fP.floatValue()));
        }
        Float[] fArrQ = newEntity.q();
        if (fArrQ != null) {
            existingEntity.J(fArrQ);
        }
    }

    protected abstract void m(long j10, UUID uuid);

    protected abstract void n();

    protected abstract void o();

    protected abstract void p();

    public abstract void q(p158id.a aVar);
}
