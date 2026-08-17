package Db;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f2400a;

    public z(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f2400a = uri;
    }

    @Override // Db.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Lb.e a() {
        return new Lb.e(this.f2400a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.b(this.f2400a, ((z) obj).f2400a);
    }

    public int hashCode() {
        return this.f2400a.hashCode();
    }

    public String toString() {
        return "ThumbhashModelProvider(uri=" + this.f2400a + ")";
    }
}
