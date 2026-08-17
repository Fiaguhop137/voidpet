package Ne;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ne.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1250y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p464ze.b f8227f;

    public C1250y(Object obj, Object obj2, Object obj3, Object obj4, String filePath, p464ze.b classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f8222a = obj;
        this.f8223b = obj2;
        this.f8224c = obj3;
        this.f8225d = obj4;
        this.f8226e = filePath;
        this.f8227f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1250y)) {
            return false;
        }
        C1250y c1250y = (C1250y) obj;
        return Intrinsics.b(this.f8222a, c1250y.f8222a) && Intrinsics.b(this.f8223b, c1250y.f8223b) && Intrinsics.b(this.f8224c, c1250y.f8224c) && Intrinsics.b(this.f8225d, c1250y.f8225d) && Intrinsics.b(this.f8226e, c1250y.f8226e) && Intrinsics.b(this.f8227f, c1250y.f8227f);
    }

    public int hashCode() {
        Object obj = this.f8222a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8223b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f8224c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f8225d;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f8226e.hashCode()) * 31) + this.f8227f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f8222a + ", compilerVersion=" + this.f8223b + ", languageVersion=" + this.f8224c + ", expectedVersion=" + this.f8225d + ", filePath=" + this.f8226e + ", classId=" + this.f8227f + ')';
    }
}
