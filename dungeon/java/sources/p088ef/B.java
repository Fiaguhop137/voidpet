package p088ef;

import Md.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3297m f40745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f40746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f40748e;

    public B(Object obj, InterfaceC3297m interfaceC3297m, n nVar, Object obj2, Throwable th) {
        this.f40744a = obj;
        this.f40745b = interfaceC3297m;
        this.f40746c = nVar;
        this.f40747d = obj2;
        this.f40748e = th;
    }

    public /* synthetic */ B(Object obj, InterfaceC3297m interfaceC3297m, n nVar, Object obj2, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC3297m, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ B b(B b10, Object obj, InterfaceC3297m interfaceC3297m, n nVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b10.f40744a;
        }
        if ((i10 & 2) != 0) {
            interfaceC3297m = b10.f40745b;
        }
        if ((i10 & 4) != 0) {
            nVar = b10.f40746c;
        }
        if ((i10 & 8) != 0) {
            obj2 = b10.f40747d;
        }
        if ((i10 & 16) != 0) {
            th = b10.f40748e;
        }
        Throwable th2 = th;
        n nVar2 = nVar;
        return b10.a(obj, interfaceC3297m, nVar2, obj2, th2);
    }

    public final B a(Object obj, InterfaceC3297m interfaceC3297m, n nVar, Object obj2, Throwable th) {
        return new B(obj, interfaceC3297m, nVar, obj2, th);
    }

    public final boolean c() {
        return this.f40748e != null;
    }

    public final void d(C3303p c3303p, Throwable th) {
        InterfaceC3297m interfaceC3297m = this.f40745b;
        if (interfaceC3297m != null) {
            c3303p.k(interfaceC3297m, th);
        }
        n nVar = this.f40746c;
        if (nVar != null) {
            c3303p.l(nVar, th, this.f40744a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return Intrinsics.b(this.f40744a, b10.f40744a) && Intrinsics.b(this.f40745b, b10.f40745b) && Intrinsics.b(this.f40746c, b10.f40746c) && Intrinsics.b(this.f40747d, b10.f40747d) && Intrinsics.b(this.f40748e, b10.f40748e);
    }

    public int hashCode() {
        Object obj = this.f40744a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC3297m interfaceC3297m = this.f40745b;
        int iHashCode2 = (iHashCode + (interfaceC3297m == null ? 0 : interfaceC3297m.hashCode())) * 31;
        n nVar = this.f40746c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj2 = this.f40747d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f40748e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f40744a + ", cancelHandler=" + this.f40745b + ", onCancellation=" + this.f40746c + ", idempotentResume=" + this.f40747d + ", cancelCause=" + this.f40748e + ')';
    }
}
