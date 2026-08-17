package p359u;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC4210i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f54800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f54801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f54802c;

    public L(float f10, float f11, Object obj) {
        this.f54800a = f10;
        this.f54801b = f11;
        this.f54802c = obj;
    }

    public /* synthetic */ L(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof L) {
            L l10 = (L) obj;
            if (l10.f54800a == this.f54800a && l10.f54801b == this.f54801b && Intrinsics.b(l10.f54802c, this.f54802c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p359u.InterfaceC4210i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public x0 a(X x10) {
        return new x0(this.f54800a, this.f54801b, AbstractC4211j.b(x10, this.f54802c));
    }

    public int hashCode() {
        Object obj = this.f54802c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.f54800a)) * 31) + Float.hashCode(this.f54801b);
    }
}
