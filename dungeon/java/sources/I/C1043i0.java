package I;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1043i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4656a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4657b;

    private final int[] i() {
        int[] iArr = this.f4656a;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.f4656a = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void a() {
        this.f4657b = 0;
    }

    public final int b(int i10) {
        int[] iArr = this.f4656a;
        int iMin = Math.min(iArr.length, this.f4657b);
        for (int i11 = 0; i11 < iMin; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final int c() {
        return this.f4656a[this.f4657b - 1];
    }

    public final int d(int i10) {
        return this.f4656a[i10];
    }

    public final int e() {
        return this.f4656a[this.f4657b - 2];
    }

    public final int f(int i10) {
        int i11 = this.f4657b - 1;
        return i11 >= 0 ? this.f4656a[i11] : i10;
    }

    public final int g() {
        int[] iArr = this.f4656a;
        int i10 = this.f4657b - 1;
        this.f4657b = i10;
        return iArr[i10];
    }

    public final void h(int i10) {
        int[] iArrI = this.f4656a;
        if (this.f4657b >= iArrI.length) {
            iArrI = i();
        }
        int i11 = this.f4657b;
        this.f4657b = i11 + 1;
        iArrI[i11] = i10;
    }
}
