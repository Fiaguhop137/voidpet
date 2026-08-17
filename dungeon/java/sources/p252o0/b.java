package p252o0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f50306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f50307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f50308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50309d;

    public b(float f10, float f11, long j10, int i10) {
        this.f50306a = f10;
        this.f50307b = f11;
        this.f50308c = j10;
        this.f50309d = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f50306a == this.f50306a && bVar.f50307b == this.f50307b && bVar.f50308c == this.f50308c && bVar.f50309d == this.f50309d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f50306a) * 31) + Float.hashCode(this.f50307b)) * 31) + Long.hashCode(this.f50308c)) * 31) + Integer.hashCode(this.f50309d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f50306a + ",horizontalScrollPixels=" + this.f50307b + ",uptimeMillis=" + this.f50308c + ",deviceId=" + this.f50309d + ')';
    }
}
