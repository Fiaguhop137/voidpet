package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1125a;

    public T0(String str) {
        super(null);
        this.f1125a = str;
    }

    public final String a() {
        return this.f1125a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof T0) && Intrinsics.b(this.f1125a, ((T0) obj).f1125a);
    }

    public int hashCode() {
        return this.f1125a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f1125a + ')';
    }
}
