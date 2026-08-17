package Za;

import java.util.Set;
import kotlin.collections.W;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f18858d;

    public d(boolean z10, boolean z11, boolean z12, Set purchasing) {
        Intrinsics.checkNotNullParameter(purchasing, "purchasing");
        this.f18855a = z10;
        this.f18856b = z11;
        this.f18857c = z12;
        this.f18858d = purchasing;
    }

    public /* synthetic */ d(boolean z10, boolean z11, boolean z12, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? W.d() : set);
    }

    public static /* synthetic */ d b(d dVar, boolean z10, boolean z11, boolean z12, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dVar.f18855a;
        }
        if ((i10 & 2) != 0) {
            z11 = dVar.f18856b;
        }
        if ((i10 & 4) != 0) {
            z12 = dVar.f18857c;
        }
        if ((i10 & 8) != 0) {
            set = dVar.f18858d;
        }
        return dVar.a(z10, z11, z12, set);
    }

    public final d a(boolean z10, boolean z11, boolean z12, Set purchasing) {
        Intrinsics.checkNotNullParameter(purchasing, "purchasing");
        return new d(z10, z11, z12, purchasing);
    }

    public final Set c() {
        return this.f18858d;
    }

    public final void d(boolean z10) {
        this.f18856b = z10;
    }

    public final void e(boolean z10) {
        this.f18855a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18855a == dVar.f18855a && this.f18856b == dVar.f18856b && this.f18857c == dVar.f18857c && Intrinsics.b(this.f18858d, dVar.f18858d);
    }

    public final void f(boolean z10) {
        this.f18857c = z10;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f18855a) * 31) + Boolean.hashCode(this.f18856b)) * 31) + Boolean.hashCode(this.f18857c)) * 31) + this.f18858d.hashCode();
    }

    public String toString() {
        return "LoadingStates(initConnection=" + this.f18855a + ", fetchProducts=" + this.f18856b + ", restorePurchases=" + this.f18857c + ", purchasing=" + this.f18858d + ")";
    }
}
