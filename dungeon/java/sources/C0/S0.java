package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements C0819d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1124a;

    public S0(String str) {
        this.f1124a = str;
    }

    public final String a() {
        return this.f1124a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S0) && Intrinsics.b(this.f1124a, ((S0) obj).f1124a);
    }

    public int hashCode() {
        return this.f1124a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f1124a + ')';
    }
}
