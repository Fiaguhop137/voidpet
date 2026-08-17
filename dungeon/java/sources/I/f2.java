package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4643a;

    public f2(Object obj) {
        this.f4643a = obj;
    }

    @Override // I.i2
    public Object a(S0 s10) {
        return this.f4643a;
    }

    public final Object b() {
        return this.f4643a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2) && Intrinsics.b(this.f4643a, ((f2) obj).f4643a);
    }

    public int hashCode() {
        Object obj = this.f4643a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f4643a + ')';
    }
}
