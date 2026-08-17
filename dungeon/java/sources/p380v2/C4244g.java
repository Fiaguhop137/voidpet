package p380v2;

import U1.S;
import java.util.Arrays;

/* JADX INFO: renamed from: v2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4244g implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f56085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f56086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f56087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f56088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f56089f;

    public C4244g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f56085b = iArr;
        this.f56086c = jArr;
        this.f56087d = jArr2;
        this.f56088e = jArr3;
        int length = iArr.length;
        this.f56084a = length;
        if (length > 0) {
            this.f56089f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f56089f = 0L;
        }
    }

    public int a(long j10) {
        return S.h(this.f56088e, j10, true, true);
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        int iA = a(j10);
        K k10 = new K(this.f56088e[iA], this.f56086c[iA]);
        if (k10.f55975a >= j10 || iA == this.f56084a - 1) {
            return new J.a(k10);
        }
        int i10 = iA + 1;
        return new J.a(k10, new K(this.f56088e[i10], this.f56086c[i10]));
    }

    @Override // p380v2.J
    public boolean i() {
        return true;
    }

    @Override // p380v2.J
    public long m() {
        return this.f56089f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f56084a + ", sizes=" + Arrays.toString(this.f56085b) + ", offsets=" + Arrays.toString(this.f56086c) + ", timeUs=" + Arrays.toString(this.f56088e) + ", durationsUs=" + Arrays.toString(this.f56087d) + ")";
    }
}
