package R1;

import U1.S;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f10585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10586b;

    public interface a {
        default r a() {
            return null;
        }

        default void b(w.b bVar) {
        }

        default byte[] c() {
            return null;
        }
    }

    public x(long j10, List list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }

    public x(long j10, a... aVarArr) {
        this.f10586b = j10;
        this.f10585a = aVarArr;
    }

    public x(List list) {
        this((a[]) list.toArray(new a[0]));
    }

    public x(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public x a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new x(this.f10586b, (a[]) S.R0(this.f10585a, aVarArr));
    }

    public x b(x xVar) {
        return xVar == null ? this : a(xVar.f10585a);
    }

    public x c(long j10) {
        return this.f10586b == j10 ? this : new x(j10, this.f10585a);
    }

    public a d(int i10) {
        return this.f10585a[i10];
    }

    public int e() {
        return this.f10585a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Arrays.equals(this.f10585a, xVar.f10585a) && this.f10586b == xVar.f10586b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f10585a) * 31) + F9.h.c(this.f10586b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f10585a));
        if (this.f10586b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f10586b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
