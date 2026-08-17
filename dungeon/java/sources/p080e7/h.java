package p080e7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40579d;

    public h(int i10, int i11, int i12, int i13) {
        this.f40576a = i10;
        this.f40577b = i11;
        this.f40578c = i12;
        this.f40579d = i13;
    }

    public /* synthetic */ h(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? -16777216 : i10, (i14 & 2) != 0 ? -16777216 : i11, (i14 & 4) != 0 ? -16777216 : i12, (i14 & 8) != 0 ? -16777216 : i13);
    }

    public final int a() {
        return this.f40579d;
    }

    public final int b() {
        return this.f40576a;
    }

    public final int c() {
        return this.f40578c;
    }

    public final int d() {
        return this.f40577b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f40576a == hVar.f40576a && this.f40577b == hVar.f40577b && this.f40578c == hVar.f40578c && this.f40579d == hVar.f40579d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f40576a) * 31) + Integer.hashCode(this.f40577b)) * 31) + Integer.hashCode(this.f40578c)) * 31) + Integer.hashCode(this.f40579d);
    }

    public String toString() {
        return "ColorEdges(left=" + this.f40576a + ", top=" + this.f40577b + ", right=" + this.f40578c + ", bottom=" + this.f40579d + ")";
    }
}
