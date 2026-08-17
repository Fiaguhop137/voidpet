package Fe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p464ze.b f3064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3065b;

    public f(p464ze.b classId, int i10) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f3064a = classId;
        this.f3065b = i10;
    }

    public final p464ze.b a() {
        return this.f3064a;
    }

    public final int b() {
        return this.f3065b;
    }

    public final int c() {
        return this.f3065b;
    }

    public final p464ze.b d() {
        return this.f3064a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.b(this.f3064a, fVar.f3064a) && this.f3065b == fVar.f3065b;
    }

    public int hashCode() {
        return (this.f3064a.hashCode() * 31) + Integer.hashCode(this.f3065b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f3065b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f3064a);
        int i12 = this.f3065b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
