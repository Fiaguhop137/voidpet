package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends AbstractC3967d implements kotlin.reflect.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48369a;

    public z() {
        this.f48369a = false;
    }

    public z(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f48369a = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC3967d
    public kotlin.reflect.c compute() {
        return this.f48369a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return getOwner().equals(zVar.getOwner()) && getName().equals(zVar.getName()) && getSignature().equals(zVar.getSignature()) && Intrinsics.b(getBoundReceiver(), zVar.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.k) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3967d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.k getReflected() {
        if (this.f48369a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (kotlin.reflect.k) super.getReflected();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
