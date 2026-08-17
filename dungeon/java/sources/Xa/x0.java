package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16223d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f16225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0 f16226c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x0 a(Map json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("apiKey");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("apple");
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            v0 v0VarA = map != null ? v0.f16198b.a(map) : null;
            Object obj3 = json.get("google");
            Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
            return new x0(str, v0VarA, map2 != null ? w0.f16208b.a(map2) : null);
        }
    }

    public x0(String str, v0 v0Var, w0 w0Var) {
        this.f16224a = str;
        this.f16225b = v0Var;
        this.f16226c = w0Var;
    }

    public final String a() {
        return this.f16224a;
    }

    public final w0 b() {
        return this.f16226c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.b(this.f16224a, x0Var.f16224a) && Intrinsics.b(this.f16225b, x0Var.f16225b) && Intrinsics.b(this.f16226c, x0Var.f16226c);
    }

    public int hashCode() {
        String str = this.f16224a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        v0 v0Var = this.f16225b;
        int iHashCode2 = (iHashCode + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        w0 w0Var = this.f16226c;
        return iHashCode2 + (w0Var != null ? w0Var.hashCode() : 0);
    }

    public String toString() {
        return "RequestVerifyPurchaseWithIapkitProps(apiKey=" + this.f16224a + ", apple=" + this.f16225b + ", google=" + this.f16226c + ")";
    }
}
