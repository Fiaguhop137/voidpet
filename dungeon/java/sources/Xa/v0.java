package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16198b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16199a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v0 a(Map json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("jws");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return null;
            }
            return new v0(str);
        }
    }

    public v0(String jws) {
        Intrinsics.checkNotNullParameter(jws, "jws");
        this.f16199a = jws;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.b(this.f16199a, ((v0) obj).f16199a);
    }

    public int hashCode() {
        return this.f16199a.hashCode();
    }

    public String toString() {
        return "RequestVerifyPurchaseWithIapkitAppleProps(jws=" + this.f16199a + ")";
    }
}
