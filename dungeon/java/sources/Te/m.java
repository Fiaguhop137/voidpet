package Te;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
    }

    @Override // Te.g, Ke.k
    public Set b() {
        throw new IllegalStateException();
    }

    @Override // Te.g, Ke.k
    public Set d() {
        throw new IllegalStateException();
    }

    @Override // Te.g, Ke.n
    public Collection e(Ke.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // Te.g, Ke.n
    public InterfaceC1794h f(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Te.g, Ke.k
    public Set g() {
        throw new IllegalStateException();
    }

    @Override // Te.g, Ke.k
    /* JADX INFO: renamed from: h */
    public Set c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Te.g, Ke.k
    /* JADX INFO: renamed from: i */
    public Set a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Te.g
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
