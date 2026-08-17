package S;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class P extends X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private L.e f11320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11322e;

    public P(long j10, L.e eVar) {
        super(j10);
        this.f11320c = eVar;
    }

    @Override // S.X
    public void c(X x10) {
        synchronized (G.f11277a) {
            Intrinsics.d(x10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f11320c = ((P) x10).f11320c;
            this.f11321d = ((P) x10).f11321d;
            this.f11322e = ((P) x10).f11322e;
            Unit unit = Unit.f48228a;
        }
    }

    @Override // S.X
    public X d(long j10) {
        return new P(j10, this.f11320c);
    }

    public final L.e i() {
        return this.f11320c;
    }

    public final int j() {
        return this.f11321d;
    }

    public final int k() {
        return this.f11322e;
    }

    public final void l(L.e eVar) {
        this.f11320c = eVar;
    }

    public final void m(int i10) {
        this.f11321d = i10;
    }

    public final void n(int i10) {
        this.f11322e = i10;
    }
}
