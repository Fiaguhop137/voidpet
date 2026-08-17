package V1;

import R1.x;

/* JADX INFO: loaded from: classes.dex */
public final class d implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13909a;

    public d(int i10) {
        this.f13909a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f13909a == ((d) obj).f13909a;
    }

    public int hashCode() {
        return this.f13909a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f13909a;
    }
}
