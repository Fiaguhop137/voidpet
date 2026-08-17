package C;

import O0.h;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1060a;

    private d(float f10) {
        this.f1060a = f10;
    }

    public /* synthetic */ d(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    @Override // C.b
    public float a(long j10, O0.d dVar) {
        return dVar.e1(this.f1060a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && h.r(this.f1060a, ((d) obj).f1060a);
    }

    public int hashCode() {
        return h.s(this.f1060a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f1060a + ".dp)";
    }
}
