package Jf;

import If.C1106h;
import If.a0;
import If.r;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a0 delegate, long j10, boolean z10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5817b = j10;
        this.f5818c = z10;
    }

    private final void b(C1106h c1106h, long j10) throws EOFException {
        C1106h c1106h2 = new C1106h();
        c1106h2.U0(c1106h);
        c1106h.w1(c1106h2, j10);
        c1106h2.c();
    }

    @Override // If.r, If.a0
    public long o0(C1106h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f5819d;
        long j12 = this.f5817b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f5818c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jO0 = super.o0(sink, j10);
        if (jO0 != -1) {
            this.f5819d += jO0;
        }
        long j14 = this.f5819d;
        long j15 = this.f5817b;
        if ((j14 >= j15 || jO0 != -1) && j14 <= j15) {
            return jO0;
        }
        if (jO0 > 0 && j14 > j15) {
            b(sink, sink.size() - (this.f5819d - this.f5817b));
        }
        throw new IOException("expected " + this.f5817b + " bytes but got " + this.f5819d);
    }
}
