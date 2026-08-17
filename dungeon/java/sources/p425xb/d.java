package p425xb;

import If.AbstractC1115q;
import If.C1106h;
import If.Y;
import kotlin.jvm.internal.Intrinsics;
import p339sf.D;

/* JADX INFO: loaded from: classes2.dex */
final class d extends AbstractC1115q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f57452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f57453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f57454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y sink, D requestBody, c progressListener) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f57452b = requestBody;
        this.f57453c = progressListener;
    }

    @Override // If.AbstractC1115q, If.Y
    public void w1(C1106h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        super.w1(source, j10);
        long j11 = this.f57454d + j10;
        this.f57454d = j11;
        this.f57453c.a(j11, this.f57452b.a());
    }
}
