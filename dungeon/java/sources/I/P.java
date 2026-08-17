package I;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class P implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f4511a;

    public P(Function1 function1) {
        this.f4511a = function1;
    }

    @Override // I.i2
    public Object a(S0 s10) {
        return this.f4511a.invoke(s10);
    }

    public final Function1 b() {
        return this.f4511a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && Intrinsics.b(this.f4511a, ((P) obj).f4511a);
    }

    public int hashCode() {
        return this.f4511a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f4511a + ')';
    }
}
