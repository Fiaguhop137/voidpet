package Ke;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements k {
    @Override // Ke.k
    public Collection a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().a(name, location);
    }

    @Override // Ke.k
    public Set b() {
        return i().b();
    }

    @Override // Ke.k
    public Collection c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().c(name, location);
    }

    @Override // Ke.k
    public Set d() {
        return i().d();
    }

    @Override // Ke.n
    public Collection e(d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return i().e(kindFilter, nameFilter);
    }

    @Override // Ke.n
    public InterfaceC1794h f(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i().f(name, location);
    }

    @Override // Ke.k
    public Set g() {
        return i().g();
    }

    public final k h() {
        if (!(i() instanceof a)) {
            return i();
        }
        k kVarI = i();
        Intrinsics.d(kVarI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((a) kVarI).h();
    }

    protected abstract k i();
}
