package Ke;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import p015ae.EnumC1792f;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.Z;
import p015ae.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f6230f = {F.j(new kotlin.jvm.internal.w(q.class, "functions", "getFunctions()Ljava/util/List;", 0)), F.j(new kotlin.jvm.internal.w(q.class, "properties", "getProperties()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1791e f6231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qe.i f6233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Qe.i f6234e;

    public q(Qe.n storageManager, InterfaceC1791e containingClass, boolean z10) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f6231b = containingClass;
        this.f6232c = z10;
        containingClass.j();
        EnumC1792f enumC1792f = EnumC1792f.CLASS;
        this.f6233d = storageManager.c(new o(this));
        this.f6234e = storageManager.c(new p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(q qVar) {
        return CollectionsKt.o(De.h.g(qVar.f6231b), De.h.h(qVar.f6231b));
    }

    private final List n() {
        return (List) Qe.m.a(this.f6233d, this, f6230f[0]);
    }

    private final List o() {
        return (List) Qe.m.a(this.f6234e, this, f6230f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(q qVar) {
        return qVar.f6232c ? CollectionsKt.p(De.h.f(qVar.f6231b)) : CollectionsKt.l();
    }

    @Override // Ke.l, Ke.k
    public Collection a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List listO = o();
        p034bf.j jVar = new p034bf.j();
        for (Object obj : listO) {
            if (Intrinsics.b(((Z) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // Ke.l, Ke.n
    public /* bridge */ /* synthetic */ InterfaceC1794h f(p464ze.f fVar, p159ie.b bVar) {
        return (InterfaceC1794h) k(fVar, bVar);
    }

    public Void k(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // Ke.l, Ke.n
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.C0(n(), o());
    }

    @Override // Ke.l, Ke.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public p034bf.j c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List listN = n();
        p034bf.j jVar = new p034bf.j();
        for (Object obj : listN) {
            if (Intrinsics.b(((g0) obj).getName(), name)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }
}
