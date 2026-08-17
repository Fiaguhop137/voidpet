package p405w9;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f56710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f56711b;

    e(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f56710a = pendingIntent;
        this.f56711b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f56710a.equals(bVar.f()) && this.f56711b == bVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    @Override // p405w9.b
    final PendingIntent f() {
        return this.f56710a;
    }

    public final int hashCode() {
        return ((this.f56710a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f56711b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f56710a.toString() + ", isNoOp=" + this.f56711b + "}";
    }

    @Override // p405w9.b
    final boolean zzb() {
        return this.f56711b;
    }
}
