package p057d2;

import U1.M;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39690d;

    public i(String str, long j10, long j11) {
        this.f39689c = str == null ? "" : str;
        this.f39687a = j10;
        this.f39688b = j11;
    }

    public i a(i iVar, String str) {
        String strC = c(str);
        i iVar2 = null;
        if (iVar != null && strC.equals(iVar.c(str))) {
            long j10 = this.f39688b;
            if (j10 != -1) {
                long j11 = this.f39687a;
                if (j11 + j10 == iVar.f39687a) {
                    long j12 = iVar.f39688b;
                    return new i(strC, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = iVar.f39688b;
            if (j13 != -1) {
                long j14 = iVar.f39687a;
                if (j14 + j13 == this.f39687a) {
                    iVar2 = new i(strC, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return iVar2;
    }

    public Uri b(String str) {
        return M.g(str, this.f39689c);
    }

    public String c(String str) {
        return M.f(str, this.f39689c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f39687a == iVar.f39687a && this.f39688b == iVar.f39688b && this.f39689c.equals(iVar.f39689c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f39690d == 0) {
            this.f39690d = ((((527 + ((int) this.f39687a)) * 31) + ((int) this.f39688b)) * 31) + this.f39689c.hashCode();
        }
        return this.f39690d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f39689c + ", start=" + this.f39687a + ", length=" + this.f39688b + ")";
    }
}
