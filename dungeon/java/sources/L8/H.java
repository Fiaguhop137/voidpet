package L8;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Status f6422b;

    private H(Status status, String str) {
        this.f6422b = status;
        this.f6421a = str;
    }

    public static H a(String str) {
        return new H(Status.f31714f, str);
    }

    public static H b(Status status) {
        p170j8.r.a(!status.g4());
        return new H(status, null);
    }

    public final boolean c() {
        return this.f6422b.g4();
    }

    public final String d() {
        return this.f6421a;
    }

    public final PendingIntent e() {
        return this.f6422b.b4();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return AbstractC3851p.a(this.f6422b, h10.f6422b) && AbstractC3851p.a(this.f6421a, h10.f6421a);
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f6422b, this.f6421a);
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("status", this.f6422b).a("gameRunToken", this.f6421a).toString();
    }
}
