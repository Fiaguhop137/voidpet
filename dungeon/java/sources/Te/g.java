package Te;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public class g implements Ke.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f12470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12471c;

    public g(h kind, String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f12470b = kind;
        String strG = kind.g();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strG, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        this.f12471c = str;
    }

    @Override // Ke.k
    public Set b() {
        return W.d();
    }

    @Override // Ke.k
    public Set d() {
        return W.d();
    }

    @Override // Ke.n
    public Collection e(Ke.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.l();
    }

    @Override // Ke.n
    public InterfaceC1794h f(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        String str = String.format(b.ERROR_CLASS.g(), Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        p464ze.f fVarT = p464ze.f.t(str);
        Intrinsics.checkNotNullExpressionValue(fVarT, "special(...)");
        return new a(fVarT);
    }

    @Override // Ke.k
    public Set g() {
        return W.d();
    }

    @Override // Ke.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set c(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return W.c(new c(l.f12582a.h()));
    }

    @Override // Ke.k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set a(p464ze.f name, p159ie.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return l.f12582a.j();
    }

    protected final String j() {
        return this.f12471c;
    }

    public String toString() {
        return "ErrorScope{" + this.f12471c + '}';
    }
}
