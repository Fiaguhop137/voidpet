package Te;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.G;
import p015ae.H;
import p015ae.InterfaceC1799m;
import p015ae.InterfaceC1801o;
import p015ae.V;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12463a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p464ze.f f12464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f12465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f12466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f12467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f12468f;

    static {
        p464ze.f fVarT = p464ze.f.t(b.ERROR_MODULE.g());
        Intrinsics.checkNotNullExpressionValue(fVarT, "special(...)");
        f12464b = fVarT;
        f12465c = CollectionsKt.l();
        f12466d = CollectionsKt.l();
        f12467e = W.d();
        f12468f = Ad.j.b(d.f12462a);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xd.g k0() {
        return Xd.g.f16263h.a();
    }

    public p464ze.f E0() {
        return f12464b;
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // p015ae.H
    public V V(p464ze.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p015ae.InterfaceC1799m
    public InterfaceC1799m a() {
        return this;
    }

    @Override // p015ae.InterfaceC1799m
    public InterfaceC1799m b() {
        return null;
    }

    @Override // p033be.a
    public p033be.h getAnnotations() {
        return p033be.h.f26532n1.b();
    }

    @Override // p015ae.J
    public p464ze.f getName() {
        return E0();
    }

    @Override // p015ae.H
    public Xd.i n() {
        return (Xd.i) f12468f.getValue();
    }

    @Override // p015ae.H
    public Object n0(G capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // p015ae.H
    public Collection p(p464ze.c fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.l();
    }

    @Override // p015ae.H
    public boolean x(H targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // p015ae.H
    public List z0() {
        return f12466d;
    }
}
