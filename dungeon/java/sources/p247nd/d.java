package p247nd;

import Ad.j;
import If.C1106h;
import If.InterfaceC1108j;
import If.K;
import If.a0;
import If.r;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p339sf.F;
import p339sf.x;

/* JADX INFO: loaded from: classes3.dex */
final class d extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f49958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f49959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f49960d;

    public static final class a extends r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f49961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f49962c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, d dVar) {
            super(a0Var);
            this.f49962c = dVar;
        }

        @Override // If.r, If.a0
        public long o0(C1106h sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            long jO0 = super.o0(sink, j10);
            this.f49961b += jO0 != -1 ? jO0 : 0L;
            this.f49962c.f49959c.a(this.f49961b, this.f49962c.f49958b.d());
            return jO0;
        }
    }

    public d(F responseBody, b progressListener) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f49958b = responseBody;
        this.f49959c = progressListener;
        this.f49960d = j.b(new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1108j k(d dVar) {
        return K.d(dVar.o(dVar.f49958b.P3()));
    }

    private final InterfaceC1108j m() {
        return (InterfaceC1108j) this.f49960d.getValue();
    }

    private final a0 o(a0 a0Var) {
        return new a(a0Var, this);
    }

    @Override // p339sf.F
    public InterfaceC1108j P3() {
        return m();
    }

    @Override // p339sf.F
    public long d() {
        return this.f49958b.d();
    }

    @Override // p339sf.F
    public x e() {
        return this.f49958b.e();
    }
}
