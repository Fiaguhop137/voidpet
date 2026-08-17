package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1019a0 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f4591a;

    public C1019a0(A0 a10) {
        this.f4591a = a10;
    }

    @Override // I.i2
    public Object a(S0 s10) {
        return this.f4591a.getValue();
    }

    public final A0 b() {
        return this.f4591a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1019a0) && Intrinsics.b(this.f4591a, ((C1019a0) obj).f4591a);
    }

    public int hashCode() {
        return this.f4591a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f4591a + ')';
    }
}
