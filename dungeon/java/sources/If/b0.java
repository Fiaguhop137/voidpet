package If;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5483d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f5484e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5487c;

    public static final class a extends b0 {
        a() {
        }

        @Override // If.b0
        public b0 d(long j10) {
            return this;
        }

        @Override // If.b0
        public void f() {
        }

        @Override // If.b0
        public b0 g(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }
    }

    public b0 a() {
        this.f5485a = false;
        return this;
    }

    public b0 b() {
        this.f5487c = 0L;
        return this;
    }

    public long c() {
        if (this.f5485a) {
            return this.f5486b;
        }
        throw new IllegalStateException("No deadline");
    }

    public b0 d(long j10) {
        this.f5485a = true;
        this.f5486b = j10;
        return this;
    }

    public boolean e() {
        return this.f5485a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f5485a && this.f5486b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public b0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 >= 0) {
            this.f5487c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f5487c;
    }
}
