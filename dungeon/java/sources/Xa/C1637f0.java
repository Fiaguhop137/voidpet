package Xa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1637f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16014d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC1656p f16015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16017c;

    /* JADX INFO: renamed from: Xa.f0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1637f0(EnumC1656p code, String message, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f16015a = code;
        this.f16016b = message;
        this.f16017c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1637f0)) {
            return false;
        }
        C1637f0 c1637f0 = (C1637f0) obj;
        return this.f16015a == c1637f0.f16015a && Intrinsics.b(this.f16016b, c1637f0.f16016b) && Intrinsics.b(this.f16017c, c1637f0.f16017c);
    }

    public int hashCode() {
        int iHashCode = ((this.f16015a.hashCode() * 31) + this.f16016b.hashCode()) * 31;
        String str = this.f16017c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PurchaseError(code=" + this.f16015a + ", message=" + this.f16016b + ", productId=" + this.f16017c + ")";
    }
}
