package S;

import java.util.Arrays;

/* JADX INFO: renamed from: S.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1436p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p323s.H f11391a;

    public C1436p(long[] jArr) {
        p323s.H h10;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            h10 = new p323s.H(jArrCopyOf.length);
            h10.e(h10.f52762b, jArrCopyOf);
        } else {
            h10 = new p323s.H(0, 1, null);
        }
        this.f11391a = h10;
    }

    public final void a(long j10) {
        this.f11391a.d(j10);
    }

    public final long[] b() {
        p323s.H h10 = this.f11391a;
        int i10 = h10.f52762b;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = h10.f52761a;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }
}
