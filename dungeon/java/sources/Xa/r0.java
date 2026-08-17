package Xa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16175a;

    public r0(List list) {
        this.f16175a = list;
    }

    public final List a() {
        return this.f16175a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.b(this.f16175a, ((r0) obj).f16175a);
    }

    public int hashCode() {
        List list = this.f16175a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "RequestPurchaseResultPurchases(value=" + this.f16175a + ")";
    }
}
