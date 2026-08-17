package If;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1116s extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b0 f5553f;

    public C1116s(b0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5553f = delegate;
    }

    @Override // If.b0
    public b0 a() {
        return this.f5553f.a();
    }

    @Override // If.b0
    public b0 b() {
        return this.f5553f.b();
    }

    @Override // If.b0
    public long c() {
        return this.f5553f.c();
    }

    @Override // If.b0
    public b0 d(long j10) {
        return this.f5553f.d(j10);
    }

    @Override // If.b0
    public boolean e() {
        return this.f5553f.e();
    }

    @Override // If.b0
    public void f() throws InterruptedIOException {
        this.f5553f.f();
    }

    @Override // If.b0
    public b0 g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f5553f.g(j10, unit);
    }

    @Override // If.b0
    public long h() {
        return this.f5553f.h();
    }

    public final b0 i() {
        return this.f5553f;
    }

    public final C1116s j(b0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5553f = delegate;
        return this;
    }
}
