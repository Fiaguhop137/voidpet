package p057d2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39640d;

    public b(String str, String str2, int i10, int i11) {
        this.f39637a = str;
        this.f39638b = str2;
        this.f39639c = i10;
        this.f39640d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f39639c == bVar.f39639c && this.f39640d == bVar.f39640d && Objects.equals(this.f39637a, bVar.f39637a) && Objects.equals(this.f39638b, bVar.f39638b);
    }

    public int hashCode() {
        return Objects.hash(this.f39637a, this.f39638b, Integer.valueOf(this.f39639c), Integer.valueOf(this.f39640d));
    }
}
