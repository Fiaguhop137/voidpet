package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class A implements U.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1086x f4391a;

    public A(InterfaceC1086x interfaceC1086x) {
        this.f4391a = interfaceC1086x;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && Intrinsics.b(this.f4391a, ((A) obj).f4391a);
    }

    public int hashCode() {
        return this.f4391a.hashCode() * 31;
    }
}
