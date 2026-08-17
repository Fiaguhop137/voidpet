package Za;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18850d;

    public a(String code, String message, String str, long j10) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f18847a = code;
        this.f18848b = message;
        this.f18849c = str;
        this.f18850d = j10;
    }

    public /* synthetic */ a(String str, String str2, String str3, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? System.currentTimeMillis() : j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f18847a, aVar.f18847a) && Intrinsics.b(this.f18848b, aVar.f18848b) && Intrinsics.b(this.f18849c, aVar.f18849c) && this.f18850d == aVar.f18850d;
    }

    public int hashCode() {
        int iHashCode = ((this.f18847a.hashCode() * 31) + this.f18848b.hashCode()) * 31;
        String str = this.f18849c;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f18850d);
    }

    public String toString() {
        return "ErrorData(code=" + this.f18847a + ", message=" + this.f18848b + ", productId=" + this.f18849c + ", timestamp=" + this.f18850d + ")";
    }
}
