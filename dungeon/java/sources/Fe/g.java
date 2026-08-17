package Fe;

import Re.S;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3066a;

    public g(Object obj) {
        this.f3066a = obj;
    }

    public abstract S a(H h10);

    public Object b() {
        return this.f3066a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return Intrinsics.b(objB, gVar != null ? gVar.b() : null);
    }

    public int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
