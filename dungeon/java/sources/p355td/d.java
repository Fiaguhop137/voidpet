package p355td;

import Ad.v;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54643a;

    public d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f54643a = message;
    }

    public final Map a() {
        return N.f(v.a("message", this.f54643a));
    }

    public final String b() {
        return this.f54643a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.b(this.f54643a, ((d) obj).f54643a);
    }

    public int hashCode() {
        return this.f54643a.hashCode();
    }

    public String toString() {
        return "UpdatesStateError(message=" + this.f54643a + ")";
    }
}
