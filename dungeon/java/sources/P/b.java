package P;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8567a;

    public b(int i10) {
        this.f8567a = i10;
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public final int a() {
        return this.f8567a;
    }

    public final void b(int i10) {
        this.f8567a += i10;
    }

    public final void c(int i10) {
        this.f8567a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f8567a == ((b) obj).f8567a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f8567a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f8567a + ')';
    }
}
