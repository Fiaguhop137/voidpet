package B3;

import kotlin.jvm.internal.Intrinsics;
import p453z3.EnumC4377i;
import p453z3.v;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC4377i f584c;

    public o(v vVar, String str, EnumC4377i enumC4377i) {
        this.f582a = vVar;
        this.f583b = str;
        this.f584c = enumC4377i;
    }

    public final EnumC4377i a() {
        return this.f584c;
    }

    public final String b() {
        return this.f583b;
    }

    public final v c() {
        return this.f582a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.b(this.f582a, oVar.f582a) && Intrinsics.b(this.f583b, oVar.f583b) && this.f584c == oVar.f584c;
    }

    public int hashCode() {
        int iHashCode = this.f582a.hashCode() * 31;
        String str = this.f583b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f584c.hashCode();
    }

    public String toString() {
        return "SourceFetchResult(source=" + this.f582a + ", mimeType=" + this.f583b + ", dataSource=" + this.f584c + ')';
    }
}
