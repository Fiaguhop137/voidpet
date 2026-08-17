package p339sf;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p429xf.e;
import p447yf.g;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f53993a;

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new g(e.f57679i, i10, j10, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public k(g delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f53993a = delegate;
    }

    public final g a() {
        return this.f53993a;
    }
}
