package p216m0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3978a implements InterfaceC3998v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48852b;

    public C3978a(int i10) {
        this.f48852b = i10;
    }

    public final int a() {
        return this.f48852b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(C3978a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f48852b == ((C3978a) obj).f48852b;
    }

    public int hashCode() {
        return this.f48852b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f48852b + ')';
    }
}
