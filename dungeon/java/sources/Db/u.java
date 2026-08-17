package Db;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2388a;

    public u(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f2388a = data;
    }

    @Override // Db.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        return this.f2388a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.b(this.f2388a, ((u) obj).f2388a);
    }

    public int hashCode() {
        return this.f2388a.hashCode();
    }

    public String toString() {
        return "RawModelProvider(data=" + this.f2388a + ")";
    }
}
