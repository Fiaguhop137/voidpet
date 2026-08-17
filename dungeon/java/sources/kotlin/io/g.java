package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f48296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f48297b;

    public g(File root, List segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f48296a = root;
        this.f48297b = segments;
    }

    public final File a() {
        return this.f48296a;
    }

    public final List b() {
        return this.f48297b;
    }

    public final int c() {
        return this.f48297b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.b(this.f48296a, gVar.f48296a) && Intrinsics.b(this.f48297b, gVar.f48297b);
    }

    public int hashCode() {
        return (this.f48296a.hashCode() * 31) + this.f48297b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f48296a + ", segments=" + this.f48297b + ')';
    }
}
