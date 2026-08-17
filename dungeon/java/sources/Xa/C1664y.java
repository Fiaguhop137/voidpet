package Xa;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1664y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16227c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1630c f16228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1634e f16229b;

    /* JADX INFO: renamed from: Xa.y$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1664y a(Map json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("alternativeBillingModeAndroid");
            String str = obj instanceof String ? (String) obj : null;
            EnumC1630c enumC1630cA = str != null ? EnumC1630c.f15968b.a(str) : null;
            Object obj2 = json.get("enableBillingProgramAndroid");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            return new C1664y(enumC1630cA, str2 != null ? EnumC1634e.f16002b.a(str2) : null);
        }
    }

    public C1664y(EnumC1630c enumC1630c, EnumC1634e enumC1634e) {
        this.f16228a = enumC1630c;
        this.f16229b = enumC1634e;
    }

    public final EnumC1630c a() {
        return this.f16228a;
    }

    public final EnumC1634e b() {
        return this.f16229b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1664y)) {
            return false;
        }
        C1664y c1664y = (C1664y) obj;
        return this.f16228a == c1664y.f16228a && this.f16229b == c1664y.f16229b;
    }

    public int hashCode() {
        EnumC1630c enumC1630c = this.f16228a;
        int iHashCode = (enumC1630c == null ? 0 : enumC1630c.hashCode()) * 31;
        EnumC1634e enumC1634e = this.f16229b;
        return iHashCode + (enumC1634e != null ? enumC1634e.hashCode() : 0);
    }

    public String toString() {
        return "InitConnectionConfig(alternativeBillingModeAndroid=" + this.f16228a + ", enableBillingProgramAndroid=" + this.f16229b + ")";
    }
}
