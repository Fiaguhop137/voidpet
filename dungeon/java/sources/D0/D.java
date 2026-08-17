package D0;

/* JADX INFO: loaded from: classes.dex */
final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f2021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2022b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2023c;

    public D(i0 i0Var) {
        this.f2021a = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    private final float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i11 = 1;
        if (z10) {
            int iA = F.a(this.f2021a.h(), i10, z10);
            int iU = this.f2021a.u(iA);
            int iO = this.f2021a.o(iA);
            if (i10 == iU || i10 == iO) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f2022b == i13) {
            return this.f2023c;
        }
        float fY = z12 ? this.f2021a.y(i10, z10) : this.f2021a.A(i10, z10);
        if (z11) {
            this.f2022b = i13;
            this.f2023c = fY;
        }
        return fY;
    }

    public final float b(int i10) {
        return a(i10, false, false, true);
    }

    public final float c(int i10) {
        return a(i10, true, true, true);
    }

    public final float d(int i10) {
        return a(i10, false, false, false);
    }

    public final float e(int i10) {
        return a(i10, true, true, false);
    }
}
