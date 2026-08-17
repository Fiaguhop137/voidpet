package Xa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1660u implements InterfaceC1658s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16187a;

    public C1660u(List list) {
        this.f16187a = list;
    }

    public final List a() {
        return this.f16187a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1660u) && Intrinsics.b(this.f16187a, ((C1660u) obj).f16187a);
    }

    public int hashCode() {
        List list = this.f16187a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "FetchProductsResultSubscriptions(value=" + this.f16187a + ")";
    }
}
