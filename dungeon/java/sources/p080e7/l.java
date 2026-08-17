package p080e7;

import com.facebook.react.uimanager.C2281y;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f40588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f40589b;

    public l(float f10, float f11) {
        this.f40588a = f10;
        this.f40589b = f11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(C2281y length, float f10, float f11) {
        this(length.b(f10), length.b(f11));
        Intrinsics.checkNotNullParameter(length, "length");
    }

    public final float a() {
        return this.f40588a;
    }

    public final float b() {
        return this.f40589b;
    }

    public final l c() {
        return new l(H.i(this.f40588a), H.i(this.f40589b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f40588a, lVar.f40588a) == 0 && Float.compare(this.f40589b, lVar.f40589b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f40588a) * 31) + Float.hashCode(this.f40589b);
    }

    public String toString() {
        return "CornerRadii(horizontal=" + this.f40588a + ", vertical=" + this.f40589b + ")";
    }
}
