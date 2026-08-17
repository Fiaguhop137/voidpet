package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4465a;

    public G0(String str) {
        this.f4465a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G0) && Intrinsics.b(this.f4465a, ((G0) obj).f4465a);
    }

    public int hashCode() {
        return this.f4465a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f4465a + ')';
    }
}
