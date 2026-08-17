package p013ac;

import kotlin.jvm.internal.Intrinsics;
import p088ef.O;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f19648a;

    public i(O scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f19648a = scope;
    }

    public final O a() {
        return this.f19648a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.b(this.f19648a, ((i) obj).f19648a);
    }

    public int hashCode() {
        return this.f19648a.hashCode();
    }

    public String toString() {
        return "CustomQueue(scope=" + this.f19648a + ")";
    }
}
