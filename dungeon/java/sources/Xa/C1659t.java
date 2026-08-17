package Xa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1659t implements InterfaceC1658s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16186a;

    public C1659t(List list) {
        this.f16186a = list;
    }

    public final List a() {
        return this.f16186a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1659t) && Intrinsics.b(this.f16186a, ((C1659t) obj).f16186a);
    }

    public int hashCode() {
        List list = this.f16186a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "FetchProductsResultProducts(value=" + this.f16186a + ")";
    }
}
