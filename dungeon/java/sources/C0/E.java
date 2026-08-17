package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f1068a;

    public E(D d10, C c10) {
        this.f1068a = c10;
    }

    public E(boolean z10) {
        this(null, new C(z10));
    }

    public final C a() {
        return this.f1068a;
    }

    public final D b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (!Intrinsics.b(this.f1068a, e10.f1068a)) {
            return false;
        }
        e10.getClass();
        return Intrinsics.b(null, null);
    }

    public int hashCode() {
        C c10 = this.f1068a;
        if (c10 != null) {
            return c10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + ((Object) null) + ", paragraphSyle=" + this.f1068a + ')';
    }
}
