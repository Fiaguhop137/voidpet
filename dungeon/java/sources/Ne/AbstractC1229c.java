package Ne;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ne.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1229c implements p015ae.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qe.n f8150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f8151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p015ae.H f8152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C1240n f8153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Qe.h f8154e;

    public AbstractC1229c(Qe.n storageManager, A finder, p015ae.H moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.f8150a = storageManager;
        this.f8151b = finder;
        this.f8152c = moduleDescriptor;
        this.f8154e = storageManager.g(new C1228b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p015ae.N f(AbstractC1229c abstractC1229c, p464ze.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        r rVarE = abstractC1229c.e(fqName);
        if (rVarE == null) {
            return null;
        }
        rVarE.L0(abstractC1229c.g());
        return rVarE;
    }

    @Override // p015ae.U
    public boolean a(p464ze.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (this.f8154e.q(fqName) ? (p015ae.N) this.f8154e.invoke(fqName) : e(fqName)) == null;
    }

    @Override // p015ae.U
    public void b(p464ze.c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        p034bf.a.a(packageFragments, this.f8154e.invoke(fqName));
    }

    @Override // p015ae.O
    public List c(p464ze.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return CollectionsKt.p(this.f8154e.invoke(fqName));
    }

    protected abstract r e(p464ze.c cVar);

    protected final C1240n g() {
        C1240n c1240n = this.f8153d;
        if (c1240n != null) {
            return c1240n;
        }
        Intrinsics.r("components");
        return null;
    }

    protected final A h() {
        return this.f8151b;
    }

    protected final p015ae.H i() {
        return this.f8152c;
    }

    protected final Qe.n j() {
        return this.f8150a;
    }

    protected final void k(C1240n c1240n) {
        Intrinsics.checkNotNullParameter(c1240n, "<set-?>");
        this.f8153d = c1240n;
    }

    @Override // p015ae.O
    public Collection p(p464ze.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return kotlin.collections.W.d();
    }
}
