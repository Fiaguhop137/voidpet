package B3;

import kotlin.jvm.internal.Intrinsics;
import p453z3.EnumC4377i;

/* JADX INFO: loaded from: classes.dex */
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p435y3.n f575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC4377i f577c;

    public l(p435y3.n nVar, boolean z10, EnumC4377i enumC4377i) {
        this.f575a = nVar;
        this.f576b = z10;
        this.f577c = enumC4377i;
    }

    public final EnumC4377i a() {
        return this.f577c;
    }

    public final p435y3.n b() {
        return this.f575a;
    }

    public final boolean c() {
        return this.f576b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.b(this.f575a, lVar.f575a) && this.f576b == lVar.f576b && this.f577c == lVar.f577c;
    }

    public int hashCode() {
        return (((this.f575a.hashCode() * 31) + Boolean.hashCode(this.f576b)) * 31) + this.f577c.hashCode();
    }

    public String toString() {
        return "ImageFetchResult(image=" + this.f575a + ", isSampled=" + this.f576b + ", dataSource=" + this.f577c + ')';
    }
}
