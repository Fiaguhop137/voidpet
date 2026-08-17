package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15405c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E0 f15407b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public D0(String oldProductId, E0 replacementMode) {
        Intrinsics.checkNotNullParameter(oldProductId, "oldProductId");
        Intrinsics.checkNotNullParameter(replacementMode, "replacementMode");
        this.f15406a = oldProductId;
        this.f15407b = replacementMode;
    }

    public final String a() {
        return this.f15406a;
    }

    public final E0 b() {
        return this.f15407b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d10 = (D0) obj;
        return Intrinsics.b(this.f15406a, d10.f15406a) && this.f15407b == d10.f15407b;
    }

    public int hashCode() {
        return (this.f15406a.hashCode() * 31) + this.f15407b.hashCode();
    }

    public String toString() {
        return "SubscriptionProductReplacementParamsAndroid(oldProductId=" + this.f15406a + ", replacementMode=" + this.f15407b + ")";
    }
}
