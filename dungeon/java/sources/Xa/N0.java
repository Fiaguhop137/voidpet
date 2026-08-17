package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15847c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f15848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1643i0 f15849b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final N0 a(Map json) {
            EnumC1643i0 enumC1643i0A;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("iapkit");
            Map map = obj instanceof Map ? (Map) obj : null;
            x0 x0VarA = map != null ? x0.f16223d.a(map) : null;
            Object obj2 = json.get("provider");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null || (enumC1643i0A = EnumC1643i0.f16042b.a(str)) == null) {
                enumC1643i0A = EnumC1643i0.Iapkit;
            }
            return new N0(x0VarA, enumC1643i0A);
        }
    }

    public N0(x0 x0Var, EnumC1643i0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f15848a = x0Var;
        this.f15849b = provider;
    }

    public final x0 a() {
        return this.f15848a;
    }

    public final EnumC1643i0 b() {
        return this.f15849b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n10 = (N0) obj;
        return Intrinsics.b(this.f15848a, n10.f15848a) && this.f15849b == n10.f15849b;
    }

    public int hashCode() {
        x0 x0Var = this.f15848a;
        return ((x0Var == null ? 0 : x0Var.hashCode()) * 31) + this.f15849b.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseWithProviderProps(iapkit=" + this.f15848a + ", provider=" + this.f15849b + ")";
    }
}
