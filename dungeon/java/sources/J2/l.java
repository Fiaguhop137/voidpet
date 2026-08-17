package J2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f5722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f5723f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f5719b = i10;
        this.f5720c = i11;
        this.f5721d = i12;
        this.f5722e = iArr;
        this.f5723f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f5719b == lVar.f5719b && this.f5720c == lVar.f5720c && this.f5721d == lVar.f5721d && Arrays.equals(this.f5722e, lVar.f5722e) && Arrays.equals(this.f5723f, lVar.f5723f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f5719b) * 31) + this.f5720c) * 31) + this.f5721d) * 31) + Arrays.hashCode(this.f5722e)) * 31) + Arrays.hashCode(this.f5723f);
    }
}
