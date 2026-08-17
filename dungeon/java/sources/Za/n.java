package Za;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f18910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f18912f;

    public n(String str, String str2, String message, o status, String str3, long j10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f18907a = str;
        this.f18908b = str2;
        this.f18909c = message;
        this.f18910d = status;
        this.f18911e = str3;
        this.f18912f = j10;
    }

    public /* synthetic */ n(String str, String str2, String str3, o oVar, String str4, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? o.Success : oVar, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? System.currentTimeMillis() : j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.b(this.f18907a, nVar.f18907a) && Intrinsics.b(this.f18908b, nVar.f18908b) && Intrinsics.b(this.f18909c, nVar.f18909c) && this.f18910d == nVar.f18910d && Intrinsics.b(this.f18911e, nVar.f18911e) && this.f18912f == nVar.f18912f;
    }

    public int hashCode() {
        String str = this.f18907a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18908b;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f18909c.hashCode()) * 31) + this.f18910d.hashCode()) * 31;
        String str3 = this.f18911e;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.f18912f);
    }

    public String toString() {
        return "PurchaseResultData(productId=" + this.f18907a + ", transactionId=" + this.f18908b + ", message=" + this.f18909c + ", status=" + this.f18910d + ", code=" + this.f18911e + ", timestamp=" + this.f18912f + ")";
    }
}
