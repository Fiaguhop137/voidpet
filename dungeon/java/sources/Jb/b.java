package Jb;

import kotlin.jvm.internal.Intrinsics;
import p382v4.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f5797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ib.b f5798b;

    public b(h glideUrl) {
        Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
        this.f5797a = glideUrl;
    }

    public final h a() {
        return this.f5797a;
    }

    public final Ib.b b() {
        return this.f5798b;
    }

    public final void c(Ib.b bVar) {
        this.f5798b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.b(this.f5797a, ((b) obj).f5797a);
    }

    public int hashCode() {
        return this.f5797a.hashCode();
    }

    public String toString() {
        String string = this.f5797a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
