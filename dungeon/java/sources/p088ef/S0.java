package p088ef;

import Ad.q;
import Ed.b;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
final class S0 extends G0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f40798e;

    public S0(b bVar) {
        this.f40798e = bVar;
    }

    @Override // p088ef.G0
    public boolean v() {
        return false;
    }

    @Override // p088ef.G0
    public void w(Throwable th) {
        b bVar = this.f40798e;
        q.a aVar = q.f327b;
        bVar.resumeWith(q.b(Unit.f48228a));
    }
}
