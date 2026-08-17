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
public final class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15862b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15863c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15864a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public P(List pricingPhaseList) {
        Intrinsics.checkNotNullParameter(pricingPhaseList, "pricingPhaseList");
        this.f15864a = pricingPhaseList;
    }

    public final Map a() {
        Pair pairA = Ad.v.a("__typename", "PricingPhasesAndroid");
        List list = this.f15864a;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((O) it.next()).a());
        }
        return kotlin.collections.N.l(pairA, Ad.v.a("pricingPhaseList", arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && Intrinsics.b(this.f15864a, ((P) obj).f15864a);
    }

    public int hashCode() {
        return this.f15864a.hashCode();
    }

    public String toString() {
        return "PricingPhasesAndroid(pricingPhaseList=" + this.f15864a + ")";
    }
}
