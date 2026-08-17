package Db;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p382v4.h f2260a;

    public D(p382v4.h glideUrl) {
        Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
        this.f2260a = glideUrl;
    }

    @Override // Db.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Jb.b a() {
        return new Jb.b(this.f2260a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && Intrinsics.b(this.f2260a, ((D) obj).f2260a);
    }

    public int hashCode() {
        return this.f2260a.hashCode();
    }

    public String toString() {
        return "UrlModelProvider(glideUrl=" + this.f2260a + ")";
    }
}
