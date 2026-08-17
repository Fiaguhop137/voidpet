package H2;

import B9.c;
import F9.f;
import R1.w;
import R1.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4150b;

    public b(String str, String str2) {
        this.f4149a = c.f(str);
        this.f4150b = str2;
    }

    @Override // R1.x.a
    public void b(w.b bVar) {
        String str = this.f4149a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numP = f.p(this.f4150b);
                if (numP != null) {
                    bVar.r0(numP);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numP2 = f.p(this.f4150b);
                if (numP2 != null) {
                    bVar.q0(numP2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numP3 = f.p(this.f4150b);
                if (numP3 != null) {
                    bVar.s0(numP3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f4150b);
                break;
            case "GENRE":
                bVar.c0(this.f4150b);
                break;
            case "TITLE":
                bVar.p0(this.f4150b);
                break;
            case "DESCRIPTION":
                bVar.W(this.f4150b);
                break;
            case "DISCNUMBER":
                Integer numP4 = f.p(this.f4150b);
                if (numP4 != null) {
                    bVar.X(numP4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f4150b);
                break;
            case "ARTIST":
                bVar.Q(this.f4150b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4149a.equals(bVar.f4149a) && this.f4150b.equals(bVar.f4150b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f4149a.hashCode()) * 31) + this.f4150b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f4149a + "=" + this.f4150b;
    }
}
