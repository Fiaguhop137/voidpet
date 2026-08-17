package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15589c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15591b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public H0(String endTimeMillis, String startTimeMillis) {
        Intrinsics.checkNotNullParameter(endTimeMillis, "endTimeMillis");
        Intrinsics.checkNotNullParameter(startTimeMillis, "startTimeMillis");
        this.f15590a = endTimeMillis;
        this.f15591b = startTimeMillis;
    }

    public final Map a() {
        return kotlin.collections.N.l(Ad.v.a("__typename", "ValidTimeWindowAndroid"), Ad.v.a("endTimeMillis", this.f15590a), Ad.v.a("startTimeMillis", this.f15591b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h10 = (H0) obj;
        return Intrinsics.b(this.f15590a, h10.f15590a) && Intrinsics.b(this.f15591b, h10.f15591b);
    }

    public int hashCode() {
        return (this.f15590a.hashCode() * 31) + this.f15591b.hashCode();
    }

    public String toString() {
        return "ValidTimeWindowAndroid(endTimeMillis=" + this.f15590a + ", startTimeMillis=" + this.f15591b + ")";
    }
}
