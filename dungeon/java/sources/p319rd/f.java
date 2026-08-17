package p319rd;

import expo.modules.updates.reloadscreen.SpinnerSize;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SpinnerSize f52472c;

    public f(boolean z10, int i10, SpinnerSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f52470a = z10;
        this.f52471b = i10;
        this.f52472c = size;
    }

    public static /* synthetic */ f b(f fVar, boolean z10, int i10, SpinnerSize spinnerSize, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = fVar.f52470a;
        }
        if ((i11 & 2) != 0) {
            i10 = fVar.f52471b;
        }
        if ((i11 & 4) != 0) {
            spinnerSize = fVar.f52472c;
        }
        return fVar.a(z10, i10, spinnerSize);
    }

    public final f a(boolean z10, int i10, SpinnerSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        return new f(z10, i10, size);
    }

    public final int c() {
        return this.f52471b;
    }

    public final boolean d() {
        return this.f52470a;
    }

    public final SpinnerSize e() {
        return this.f52472c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f52470a == fVar.f52470a && this.f52471b == fVar.f52471b && this.f52472c == fVar.f52472c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f52470a) * 31) + Integer.hashCode(this.f52471b)) * 31) + this.f52472c.hashCode();
    }

    public String toString() {
        return "SpinnerConfiguration(enabled=" + this.f52470a + ", color=" + this.f52471b + ", size=" + this.f52472c + ")";
    }
}
