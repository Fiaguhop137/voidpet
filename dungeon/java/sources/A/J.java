package A;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f12a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC0785u f14c;

    public J(float f10, boolean z10, AbstractC0785u abstractC0785u, w wVar) {
        this.f12a = f10;
        this.f13b = z10;
        this.f14c = abstractC0785u;
    }

    public /* synthetic */ J(float f10, boolean z10, AbstractC0785u abstractC0785u, w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : abstractC0785u, (i10 & 8) != 0 ? null : wVar);
    }

    public final AbstractC0785u a() {
        return this.f14c;
    }

    public final boolean b() {
        return this.f13b;
    }

    public final w c() {
        return null;
    }

    public final float d() {
        return this.f12a;
    }

    public final void e(AbstractC0785u abstractC0785u) {
        this.f14c = abstractC0785u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return Float.compare(this.f12a, j10.f12a) == 0 && this.f13b == j10.f13b && Intrinsics.b(this.f14c, j10.f14c) && Intrinsics.b(null, null);
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f12a) * 31) + Boolean.hashCode(this.f13b)) * 31;
        AbstractC0785u abstractC0785u = this.f14c;
        return (iHashCode + (abstractC0785u == null ? 0 : abstractC0785u.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f12a + ", fill=" + this.f13b + ", crossAxisAlignment=" + this.f14c + ", flowLayoutData=" + ((Object) null) + ')';
    }
}
