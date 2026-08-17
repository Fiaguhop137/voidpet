package Db;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f2259a;

    public C(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f2259a = uri;
    }

    @Override // Db.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uri a() {
        return this.f2259a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && Intrinsics.b(this.f2259a, ((C) obj).f2259a);
    }

    public int hashCode() {
        return this.f2259a.hashCode();
    }

    public String toString() {
        return "UriModelProvider(uri=" + this.f2259a + ")";
    }
}
