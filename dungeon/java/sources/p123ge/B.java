package p123ge;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p302qe.InterfaceC4072a;
import p302qe.u;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends u implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f42346a;

    public B(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f42346a = fqName;
    }

    @Override // p302qe.InterfaceC4075d
    public boolean E() {
        return false;
    }

    @Override // p302qe.u
    public Collection G(Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt.l();
    }

    public boolean equals(Object obj) {
        return (obj instanceof B) && Intrinsics.b(f(), ((B) obj).f());
    }

    @Override // p302qe.u
    public c f() {
        return this.f42346a;
    }

    @Override // p302qe.InterfaceC4075d
    public List getAnnotations() {
        return CollectionsKt.l();
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return B.class.getName() + ": " + f();
    }

    @Override // p302qe.InterfaceC4075d
    public InterfaceC4072a u(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // p302qe.u
    public Collection v() {
        return CollectionsKt.l();
    }
}
