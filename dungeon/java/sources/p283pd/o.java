package p283pd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50954a;

    public o(String str) {
        this.f50954a = str;
    }

    public final String a() {
        return this.f50954a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.b(this.f50954a, ((o) obj).f50954a);
    }

    public int hashCode() {
        String str = this.f50954a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ResponsePartHeaderData(signature=" + this.f50954a + ")";
    }
}
