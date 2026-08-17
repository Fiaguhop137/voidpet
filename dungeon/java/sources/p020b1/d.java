package p020b1;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f25864e = new d(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25868d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private d(int i10, int i11, int i12, int i13) {
        this.f25865a = i10;
        this.f25866b = i11;
        this.f25867c = i12;
        this.f25868d = i13;
    }

    public static d a(d dVar, d dVar2) {
        return c(dVar.f25865a + dVar2.f25865a, dVar.f25866b + dVar2.f25866b, dVar.f25867c + dVar2.f25867c, dVar.f25868d + dVar2.f25868d);
    }

    public static d b(d dVar, d dVar2) {
        return c(Math.max(dVar.f25865a, dVar2.f25865a), Math.max(dVar.f25866b, dVar2.f25866b), Math.max(dVar.f25867c, dVar2.f25867c), Math.max(dVar.f25868d, dVar2.f25868d));
    }

    public static d c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f25864e : new d(i10, i11, i12, i13);
    }

    public static d d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static d e(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f25868d == dVar.f25868d && this.f25865a == dVar.f25865a && this.f25867c == dVar.f25867c && this.f25866b == dVar.f25866b;
    }

    public Insets f() {
        return a.a(this.f25865a, this.f25866b, this.f25867c, this.f25868d);
    }

    public int hashCode() {
        return (((((this.f25865a * 31) + this.f25866b) * 31) + this.f25867c) * 31) + this.f25868d;
    }

    public String toString() {
        return "Insets{left=" + this.f25865a + ", top=" + this.f25866b + ", right=" + this.f25867c + ", bottom=" + this.f25868d + '}';
    }
}
