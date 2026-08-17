package A;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: A.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0780o implements InterfaceC0779n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0775j f78a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O0.d f79b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f80c;

    private C0780o(O0.d dVar, long j10) {
        this.f78a = C0775j.f67a;
        this.f79b = dVar;
        this.f80c = j10;
    }

    public /* synthetic */ C0780o(O0.d dVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10);
    }

    @Override // A.InterfaceC0779n
    public long a() {
        return this.f80c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0780o)) {
            return false;
        }
        C0780o c0780o = (C0780o) obj;
        return Intrinsics.b(this.f79b, c0780o.f79b) && O0.b.f(this.f80c, c0780o.f80c);
    }

    public int hashCode() {
        return (this.f79b.hashCode() * 31) + O0.b.o(this.f80c);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f79b + ", constraints=" + ((Object) O0.b.p(this.f80c)) + ')';
    }
}
