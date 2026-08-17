package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3974k extends AbstractC3967d implements InterfaceC3973j, kotlin.reflect.g {
    private final int arity;
    private final int flags;

    public AbstractC3974k(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC3967d
    protected kotlin.reflect.c computeReflected() {
        return F.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3974k) {
            AbstractC3974k abstractC3974k = (AbstractC3974k) obj;
            return getName().equals(abstractC3974k.getName()) && getSignature().equals(abstractC3974k.getSignature()) && this.flags == abstractC3974k.flags && this.arity == abstractC3974k.arity && Intrinsics.b(getBoundReceiver(), abstractC3974k.getBoundReceiver()) && Intrinsics.b(getOwner(), abstractC3974k.getOwner());
        }
        if (obj instanceof kotlin.reflect.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3973j
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC3967d
    public kotlin.reflect.g getReflected() {
        return (kotlin.reflect.g) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.reflect.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
