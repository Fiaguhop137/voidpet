package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1632d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15975c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15977b;

    /* JADX INFO: renamed from: Xa.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1632d(String offerToken, String sku) {
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        this.f15976a = offerToken;
        this.f15977b = sku;
    }

    public final String a() {
        return this.f15976a;
    }

    public final String b() {
        return this.f15977b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1632d)) {
            return false;
        }
        C1632d c1632d = (C1632d) obj;
        return Intrinsics.b(this.f15976a, c1632d.f15976a) && Intrinsics.b(this.f15977b, c1632d.f15977b);
    }

    public int hashCode() {
        return (this.f15976a.hashCode() * 31) + this.f15977b.hashCode();
    }

    public String toString() {
        return "AndroidSubscriptionOfferInput(offerToken=" + this.f15976a + ", sku=" + this.f15977b + ")";
    }
}
