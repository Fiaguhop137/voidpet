package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1639g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16021d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f16022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f16023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f16024c;

    /* JADX INFO: renamed from: Xa.g0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1639g0 a(Map json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("alsoPublishToEventListenerIOS");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            Object obj2 = json.get("includeSuspendedAndroid");
            Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            Object obj3 = json.get("onlyIncludeActiveItemsIOS");
            return new C1639g0(bool, bool2, obj3 instanceof Boolean ? (Boolean) obj3 : null);
        }
    }

    public C1639g0(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f16022a = bool;
        this.f16023b = bool2;
        this.f16024c = bool3;
    }

    public final Boolean a() {
        return this.f16023b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1639g0)) {
            return false;
        }
        C1639g0 c1639g0 = (C1639g0) obj;
        return Intrinsics.b(this.f16022a, c1639g0.f16022a) && Intrinsics.b(this.f16023b, c1639g0.f16023b) && Intrinsics.b(this.f16024c, c1639g0.f16024c);
    }

    public int hashCode() {
        Boolean bool = this.f16022a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f16023b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f16024c;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseOptions(alsoPublishToEventListenerIOS=" + this.f16022a + ", includeSuspendedAndroid=" + this.f16023b + ", onlyIncludeActiveItemsIOS=" + this.f16024c + ")";
    }
}
