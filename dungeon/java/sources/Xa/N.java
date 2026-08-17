package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15844c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15846b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public N(String preorderPresaleEndTimeMillis, String preorderReleaseTimeMillis) {
        Intrinsics.checkNotNullParameter(preorderPresaleEndTimeMillis, "preorderPresaleEndTimeMillis");
        Intrinsics.checkNotNullParameter(preorderReleaseTimeMillis, "preorderReleaseTimeMillis");
        this.f15845a = preorderPresaleEndTimeMillis;
        this.f15846b = preorderReleaseTimeMillis;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "PreorderDetailsAndroid"), Ad.v.a("preorderPresaleEndTimeMillis", this.f15845a), Ad.v.a("preorderReleaseTimeMillis", this.f15846b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return Intrinsics.b(this.f15845a, n10.f15845a) && Intrinsics.b(this.f15846b, n10.f15846b);
    }

    public int hashCode() {
        return (this.f15845a.hashCode() * 31) + this.f15846b.hashCode();
    }

    public String toString() {
        return "PreorderDetailsAndroid(preorderPresaleEndTimeMillis=" + this.f15845a + ", preorderReleaseTimeMillis=" + this.f15846b + ")";
    }
}
