package A;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class F implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f10c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f11d;

    private F(float f10, float f11, float f12, float f13) {
        this.f8a = f10;
        this.f9b = f11;
        this.f10c = f12;
        this.f11d = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            B.a.a("Padding must be non-negative");
        }
    }

    public /* synthetic */ F(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    @Override // A.E
    public float a() {
        return this.f11d;
    }

    @Override // A.E
    public float b(O0.t tVar) {
        return tVar == O0.t.Ltr ? this.f10c : this.f8a;
    }

    @Override // A.E
    public float c(O0.t tVar) {
        return tVar == O0.t.Ltr ? this.f8a : this.f10c;
    }

    @Override // A.E
    public float d() {
        return this.f9b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return O0.h.r(this.f8a, f10.f8a) && O0.h.r(this.f9b, f10.f9b) && O0.h.r(this.f10c, f10.f10c) && O0.h.r(this.f11d, f10.f11d);
    }

    public int hashCode() {
        return (((((O0.h.s(this.f8a) * 31) + O0.h.s(this.f9b)) * 31) + O0.h.s(this.f10c)) * 31) + O0.h.s(this.f11d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) O0.h.t(this.f8a)) + ", top=" + ((Object) O0.h.t(this.f9b)) + ", end=" + ((Object) O0.h.t(this.f10c)) + ", bottom=" + ((Object) O0.h.t(this.f11d)) + ')';
    }
}
