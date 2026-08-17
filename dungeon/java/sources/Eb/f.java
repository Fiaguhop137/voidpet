package Eb;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f2763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2765c;

    public f(Uri uri, int i10, int i11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f2763a = uri;
        this.f2764b = i10;
        this.f2765c = i11;
    }

    public final int a() {
        return this.f2765c;
    }

    public final Uri b() {
        return this.f2763a;
    }

    public final int c() {
        return this.f2764b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.b(this.f2763a, fVar.f2763a) && this.f2764b == fVar.f2764b && this.f2765c == fVar.f2765c;
    }

    public int hashCode() {
        return (((this.f2763a.hashCode() * 31) + Integer.hashCode(this.f2764b)) * 31) + Integer.hashCode(this.f2765c);
    }

    public String toString() {
        return "BlurhashModel(uri=" + this.f2763a + ", width=" + this.f2764b + ", height=" + this.f2765c + ")";
    }
}
