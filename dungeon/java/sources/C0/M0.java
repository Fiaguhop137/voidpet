package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G0 f1111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G0 f1112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G0 f1113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G0 f1114d;

    public M0(G0 g10, G0 g11, G0 g12, G0 g13) {
        this.f1111a = g10;
        this.f1112b = g11;
        this.f1113c = g12;
        this.f1114d = g13;
    }

    public final G0 a() {
        return this.f1112b;
    }

    public final G0 b() {
        return this.f1113c;
    }

    public final G0 c() {
        return this.f1114d;
    }

    public final G0 d() {
        return this.f1111a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M0)) {
            return false;
        }
        M0 m10 = (M0) obj;
        return Intrinsics.b(this.f1111a, m10.f1111a) && Intrinsics.b(this.f1112b, m10.f1112b) && Intrinsics.b(this.f1113c, m10.f1113c) && Intrinsics.b(this.f1114d, m10.f1114d);
    }

    public int hashCode() {
        G0 g10 = this.f1111a;
        int iHashCode = (g10 != null ? g10.hashCode() : 0) * 31;
        G0 g11 = this.f1112b;
        int iHashCode2 = (iHashCode + (g11 != null ? g11.hashCode() : 0)) * 31;
        G0 g12 = this.f1113c;
        int iHashCode3 = (iHashCode2 + (g12 != null ? g12.hashCode() : 0)) * 31;
        G0 g13 = this.f1114d;
        return iHashCode3 + (g13 != null ? g13.hashCode() : 0);
    }
}
