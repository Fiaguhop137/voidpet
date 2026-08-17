package G;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Md.n f3113b;

    public D(Object obj, Md.n transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f3112a = obj;
        this.f3113b = transition;
    }

    public final Object a() {
        return this.f3112a;
    }

    public final Md.n b() {
        return this.f3113b;
    }

    public final Object c() {
        return this.f3112a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return Intrinsics.b(this.f3112a, d10.f3112a) && Intrinsics.b(this.f3113b, d10.f3113b);
    }

    public int hashCode() {
        Object obj = this.f3112a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f3113b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f3112a + ", transition=" + this.f3113b + ')';
    }
}
