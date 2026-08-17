package expo.modules.fetch;

import kotlin.jvm.internal.Intrinsics;
import p339sf.C;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C f40975a;

    public c(C c10) {
        this.f40975a = c10;
    }

    public final void a(C c10) {
        this.f40975a = c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.b(this.f40975a, ((c) obj).f40975a);
    }

    public int hashCode() {
        C c10 = this.f40975a;
        if (c10 == null) {
            return 0;
        }
        return c10.hashCode();
    }

    public String toString() {
        return "RequestHolder(request=" + this.f40975a + ")";
    }
}
