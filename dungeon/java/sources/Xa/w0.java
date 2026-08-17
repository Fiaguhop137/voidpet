package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16208b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16209a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w0 a(Map json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("purchaseToken");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return null;
            }
            return new w0(str);
        }
    }

    public w0(String purchaseToken) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        this.f16209a = purchaseToken;
    }

    public final String a() {
        return this.f16209a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && Intrinsics.b(this.f16209a, ((w0) obj).f16209a);
    }

    public int hashCode() {
        return this.f16209a.hashCode();
    }

    public String toString() {
        return "RequestVerifyPurchaseWithIapkitGoogleProps(purchaseToken=" + this.f16209a + ")";
    }
}
