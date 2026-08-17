package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16230d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1663x f16232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1662w f16233c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y0 a(Map json) {
            EnumC1663x enumC1663xA;
            EnumC1662w enumC1662wA;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("isValid");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Object obj2 = json.get("state");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null || (enumC1663xA = EnumC1663x.f16210b.a(str)) == null) {
                enumC1663xA = EnumC1663x.Entitled;
            }
            Object obj3 = json.get("store");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 == null || (enumC1662wA = EnumC1662w.f16200b.a(str2)) == null) {
                enumC1662wA = EnumC1662w.Unknown;
            }
            return new y0(zBooleanValue, enumC1663xA, enumC1662wA);
        }
    }

    public y0(boolean z10, EnumC1663x state, EnumC1662w store) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(store, "store");
        this.f16231a = z10;
        this.f16232b = state;
        this.f16233c = store;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "RequestVerifyPurchaseWithIapkitResult"), Ad.v.a("isValid", Boolean.valueOf(this.f16231a)), Ad.v.a("state", this.f16232b.g()), Ad.v.a("store", this.f16233c.h()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f16231a == y0Var.f16231a && this.f16232b == y0Var.f16232b && this.f16233c == y0Var.f16233c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f16231a) * 31) + this.f16232b.hashCode()) * 31) + this.f16233c.hashCode();
    }

    public String toString() {
        return "RequestVerifyPurchaseWithIapkitResult(isValid=" + this.f16231a + ", state=" + this.f16232b + ", store=" + this.f16233c + ")";
    }
}
