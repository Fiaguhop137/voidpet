package G0;

/* JADX INFO: loaded from: classes.dex */
public final class B implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3721b;

    public B(int i10, int i11) {
        this.f3720a = i10;
        this.f3721b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return this.f3720a == b10.f3720a && this.f3721b == b10.f3721b;
    }

    public int hashCode() {
        return (this.f3720a * 31) + this.f3721b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f3720a + ", end=" + this.f3721b + ')';
    }
}
