package p140hd;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p158id.a;
import p158id.d;
import p175jd.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public abstract void a(UUID uuid, String str);

    public abstract void b(List list);

    public final void c(d update) {
        Intrinsics.checkNotNullParameter(update, "update");
        update.q(update.c() + 1);
        d(update.d());
    }

    public abstract void d(UUID uuid);

    public final void e(d update) {
        Intrinsics.checkNotNullParameter(update, "update");
        update.w(update.n() + 1);
        f(update.d());
    }

    protected abstract void f(UUID uuid);

    public abstract void g(d dVar);

    protected abstract void h(UUID uuid);

    public abstract List i();

    public final a j(UUID updateId) {
        Intrinsics.checkNotNullParameter(updateId, "updateId");
        a aVarK = k(updateId);
        if (aVarK == null) {
            return null;
        }
        aVarK.C(true);
        return aVarK;
    }

    protected abstract a k(UUID uuid);

    protected abstract List l(String str, List list);

    public final List m(String scopeKey) {
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        return l(scopeKey, CollectionsKt.o(b.READY, b.EMBEDDED, b.DEVELOPMENT));
    }

    public abstract List n();

    public final d o(UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        List listP = p(id2);
        if (listP.isEmpty()) {
            return null;
        }
        return (d) listP.get(0);
    }

    protected abstract List p(UUID uuid);

    public final void q(d update) {
        Intrinsics.checkNotNullParameter(update, "update");
        Date date = new Date();
        update.s(date);
        r(update.d(), date);
    }

    protected abstract void r(UUID uuid, Date date);

    public final void s(d update) {
        Intrinsics.checkNotNullParameter(update, "update");
        t(update, false);
    }

    public void t(d update, boolean z10) {
        Intrinsics.checkNotNullParameter(update, "update");
        b bVar = b.READY;
        b bVarM = update.m();
        b bVar2 = b.DEVELOPMENT;
        if (bVarM == bVar2) {
            bVar = bVar2;
        } else if (z10) {
            bVar = b.EMBEDDED;
        }
        u(bVar, update.d());
        h(update.d());
    }

    protected abstract void u(b bVar, UUID uuid);

    public final void v(d update, Date commitTime) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(commitTime, "commitTime");
        update.p(commitTime);
        w(update.d(), commitTime);
    }

    public abstract void w(UUID uuid, Date date);

    public final void x(d update, String newScopeKey) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(newScopeKey, "newScopeKey");
        update.u(newScopeKey);
        a(update.d(), newScopeKey);
    }
}
