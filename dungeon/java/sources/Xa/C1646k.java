package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1646k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16067b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16068a;

    /* JADX INFO: renamed from: Xa.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1646k(String externalTransactionToken) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        this.f16068a = externalTransactionToken;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "DeveloperProvidedBillingDetailsAndroid"), Ad.v.a("externalTransactionToken", this.f16068a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1646k) && Intrinsics.b(this.f16068a, ((C1646k) obj).f16068a);
    }

    public int hashCode() {
        return this.f16068a.hashCode();
    }

    public String toString() {
        return "DeveloperProvidedBillingDetailsAndroid(externalTransactionToken=" + this.f16068a + ")";
    }
}
