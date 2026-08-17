package Lb;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f6599a;

    public e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f6599a = uri;
    }

    public final Uri a() {
        return this.f6599a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.b(this.f6599a, ((e) obj).f6599a);
    }

    public int hashCode() {
        return this.f6599a.hashCode();
    }

    public String toString() {
        return "ThumbhashModel(uri=" + this.f6599a + ")";
    }
}
