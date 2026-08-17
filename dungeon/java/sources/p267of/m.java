package p267of;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import p195kf.A;

/* JADX INFO: loaded from: classes3.dex */
final class m extends A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f50655e;

    public m(long j10, m mVar, int i10) {
        super(j10, mVar, i10);
        this.f50655e = new AtomicReferenceArray(l.f50654f);
    }

    @Override // p195kf.A
    public int r() {
        return l.f50654f;
    }

    @Override // p195kf.A
    public void s(int i10, Throwable th, CoroutineContext coroutineContext) {
        v().set(i10, l.f50653e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f48121c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f50655e;
    }
}
