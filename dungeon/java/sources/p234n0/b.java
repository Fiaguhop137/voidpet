package p234n0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p216m0.y;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f49441b = new long[2];

    private final long[] i(int i10) {
        long[] jArr = this.f49441b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.f49441b = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean a(long j10) {
        if (c(j10)) {
            return false;
        }
        j(this.f49440a, j10);
        return true;
    }

    public final void b() {
        this.f49440a = 0;
    }

    public final boolean c(long j10) {
        int i10 = this.f49440a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f49441b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i10) {
        return y.a(this.f49441b[i10]);
    }

    public final int e() {
        return this.f49440a;
    }

    public final boolean f() {
        return this.f49440a == 0;
    }

    public final boolean g(long j10) {
        int i10 = this.f49440a;
        int i11 = 0;
        while (i11 < i10) {
            if (j10 == this.f49441b[i11]) {
                int i12 = this.f49440a - 1;
                while (i11 < i12) {
                    long[] jArr = this.f49441b;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f49440a--;
                return true;
            }
            i11++;
        }
        return false;
    }

    public final boolean h(int i10) {
        int i11 = this.f49440a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f49441b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f49440a--;
        return true;
    }

    public final void j(int i10, long j10) {
        long[] jArrI = this.f49441b;
        if (i10 >= jArrI.length) {
            jArrI = i(i10 + 1);
        }
        jArrI[i10] = j10;
        if (i10 >= this.f49440a) {
            this.f49440a = i10 + 1;
        }
    }
}
