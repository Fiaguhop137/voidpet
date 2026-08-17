package Xa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15857d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f15858e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y0 f15860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1643i0 f15861c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public O0(List list, y0 y0Var, EnumC1643i0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f15859a = list;
        this.f15860b = y0Var;
        this.f15861c = provider;
    }

    public /* synthetic */ O0(List list, y0 y0Var, EnumC1643i0 enumC1643i0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : y0Var, enumC1643i0);
    }

    public final Map a() {
        ArrayList arrayList;
        Pair pairA = Ad.v.a("__typename", "VerifyPurchaseWithProviderResult");
        List list = this.f15859a;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.w(list, 10));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        } else {
            arrayList = null;
        }
        Pair pairA2 = Ad.v.a("errors", arrayList);
        y0 y0Var = this.f15860b;
        return kotlin.collections.N.l(pairA, pairA2, Ad.v.a("iapkit", y0Var != null ? y0Var.a() : null), Ad.v.a("provider", this.f15861c.g()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o10 = (O0) obj;
        return Intrinsics.b(this.f15859a, o10.f15859a) && Intrinsics.b(this.f15860b, o10.f15860b) && this.f15861c == o10.f15861c;
    }

    public int hashCode() {
        List list = this.f15859a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        y0 y0Var = this.f15860b;
        return ((iHashCode + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + this.f15861c.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseWithProviderResult(errors=" + this.f15859a + ", iapkit=" + this.f15860b + ", provider=" + this.f15861c + ")";
    }
}
