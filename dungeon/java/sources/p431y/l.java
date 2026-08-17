package p431y;

import Ed.b;
import kotlin.Unit;
import p124gf.a;
import p142hf.s;
import p142hf.z;

/* JADX INFO: loaded from: classes.dex */
final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f57697a = z.b(0, 16, a.DROP_OLDEST, 1, null);

    @Override // p431y.k
    public Object b(h hVar, b bVar) {
        Object objEmit = a().emit(hVar, bVar);
        return objEmit == Fd.b.e() ? objEmit : Unit.f48228a;
    }

    @Override // p431y.k
    public boolean c(h hVar) {
        return a().b(hVar);
    }

    @Override // p431y.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public s a() {
        return this.f57697a;
    }
}
